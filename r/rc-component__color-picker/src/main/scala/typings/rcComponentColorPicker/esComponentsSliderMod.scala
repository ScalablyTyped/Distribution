package typings.rcComponentColorPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcComponentColorPicker.esInterfaceMod.BaseColorPickerProps
import typings.rcComponentColorPicker.esInterfaceMod.HsbaColorType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSliderMod extends Shortcut {
  
  @JSImport("@rc-component/color-picker/es/components/Slider", JSImport.Default)
  @js.native
  val default: FC[SliderProps] = js.native
  
  trait SliderProps
    extends StObject
       with BaseColorPickerProps {
    
    var direction: js.UndefOr[String] = js.undefined
    
    var gradientColors: js.Array[String]
    
    var `type`: js.UndefOr[HsbaColorType] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SliderProps {
    
    inline def apply(gradientColors: js.Array[String]): SliderProps = {
      val __obj = js.Dynamic.literal(gradientColors = gradientColors.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setGradientColors(value: js.Array[String]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      inline def setGradientColorsVarargs(value: String*): Self = StObject.set(x, "gradientColors", js.Array(value*))
      
      inline def setType(value: HsbaColorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FC[SliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsSliderMod.foo` */
  override def _to: FC[SliderProps] = default
}
