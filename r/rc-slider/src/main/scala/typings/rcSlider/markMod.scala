package typings.rcSlider

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markMod {
  
  @JSImport("rc-slider/lib/Marks/Mark", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: MarkProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait MarkProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    def onClick(value: Double): Unit
    
    var prefixCls: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: Double
  }
  object MarkProps {
    
    inline def apply(onClick: Double => Unit, prefixCls: String, value: Double): MarkProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkProps]
    }
    
    extension [Self <: MarkProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnClick(value: Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
