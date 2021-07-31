package typings.reactLazylog

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactLazylog.anon.PartialLinePartProps
import typings.reactLazylog.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linePartMod {
  
  @JSImport("react-lazylog/build/LinePart", JSImport.Default)
  @js.native
  class default ()
    extends Component[LinePartProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/LinePart", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LinePart", "default.defaultProps")
    @js.native
    def defaultProps: PartialLinePartProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialLinePartProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type LinePart = Component[LinePartProps, js.Object, js.Any]
  
  trait LinePartProps extends StObject {
    
    var format: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
    
    var part: Text
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object LinePartProps {
    
    @scala.inline
    def apply(part: Text): LinePartProps = {
      val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinePartProps]
    }
    
    @scala.inline
    implicit class LinePartPropsMutableBuilder[Self <: LinePartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: /* text */ String => ReactNode): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setPart(value: Text): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
