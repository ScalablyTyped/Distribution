package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesSliderPicke
import typings.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSliderSliderMod {
  
  @JSImport("react-color/lib/components/slider/Slider", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SliderPickerProps, js.Object, Any]
  
  type SliderPicker = Component[SliderPickerProps, js.Object, Any]
  
  trait SliderPickerProps
    extends StObject
       with ColorPickerProps[SliderPicker] {
    
    @JSName("styles")
    var styles_SliderPickerProps: js.UndefOr[PartialClassesSliderPicke] = js.undefined
  }
  object SliderPickerProps {
    
    inline def apply(): SliderPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderPickerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderPickerProps] (val x: Self) extends AnyVal {
      
      inline def setStyles(value: PartialClassesSliderPicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait SliderPickerStylesProps extends StObject {
    
    var Hue: CSSProperties
    
    var hue: CSSProperties
  }
  object SliderPickerStylesProps {
    
    inline def apply(Hue: CSSProperties, hue: CSSProperties): SliderPickerStylesProps = {
      val __obj = js.Dynamic.literal(Hue = Hue.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderPickerStylesProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderPickerStylesProps] (val x: Self) extends AnyVal {
      
      inline def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
    }
  }
}
