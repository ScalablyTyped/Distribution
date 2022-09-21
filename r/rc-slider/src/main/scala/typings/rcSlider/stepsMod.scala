package typings.rcSlider

import typings.rcSlider.marksMod.InternalMarkObj
import typings.react.mod.CSSProperties
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("rc-slider/lib/Steps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StepsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait StepsProps extends StObject {
    
    var activeStyle: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    var marks: js.Array[InternalMarkObj]
    
    var prefixCls: String
    
    var style: js.UndefOr[CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])] = js.undefined
  }
  object StepsProps {
    
    inline def apply(marks: js.Array[InternalMarkObj], prefixCls: String): StepsProps = {
      val __obj = js.Dynamic.literal(marks = marks.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsProps]
    }
    
    extension [Self <: StepsProps](x: Self) {
      
      inline def setActiveStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "activeStyle", js.Any.fromFunction1(value))
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setMarks(value: js.Array[InternalMarkObj]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      inline def setMarksVarargs(value: InternalMarkObj*): Self = StObject.set(x, "marks", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties | (js.Function1[/* dotValue */ Double, CSSProperties])): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction1(value: /* dotValue */ Double => CSSProperties): Self = StObject.set(x, "style", js.Any.fromFunction1(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
