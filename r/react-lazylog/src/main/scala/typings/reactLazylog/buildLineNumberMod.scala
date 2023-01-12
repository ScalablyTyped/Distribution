package typings.reactLazylog

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactLazylog.anon.PartialLineNumberProps
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildLineNumberMod {
  
  @JSImport("react-lazylog/build/LineNumber", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LineNumberProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/LineNumber", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LineNumber", "default.defaultProps")
    @js.native
    def defaultProps: PartialLineNumberProps = js.native
    inline def defaultProps_=(x: PartialLineNumberProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait LineNumberProps extends StObject {
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var number: Double
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object LineNumberProps {
    
    inline def apply(number: Double): LineNumberProps = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineNumberProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineNumberProps] (val x: Self) extends AnyVal {
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type LinePart = Component[LineNumberProps, js.Object, Any]
}
