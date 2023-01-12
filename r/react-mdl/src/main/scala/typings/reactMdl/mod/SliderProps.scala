package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[Slider] {
  
  @JSName("max")
  var max_SliderProps: Double
  
  @JSName("min")
  var min_SliderProps: Double
  
  var value: js.UndefOr[Double] = js.undefined
}
object SliderProps {
  
  inline def apply(max: Double, min: Double): SliderProps = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
