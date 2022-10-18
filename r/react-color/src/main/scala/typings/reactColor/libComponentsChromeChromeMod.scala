package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesChromePicke
import typings.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsChromeChromeMod {
  
  @JSImport("react-color/lib/components/chrome/Chrome", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ChromePickerProps, js.Object, Any]
  
  type ChromePicker = Component[ChromePickerProps, js.Object, Any]
  
  trait ChromePickerProps
    extends StObject
       with ColorPickerProps[ChromePicker] {
    
    var disableAlpha: js.UndefOr[Boolean] = js.undefined
    
    @JSName("styles")
    var styles_ChromePickerProps: js.UndefOr[PartialClassesChromePicke] = js.undefined
  }
  object ChromePickerProps {
    
    inline def apply(): ChromePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromePickerProps]
    }
    
    extension [Self <: ChromePickerProps](x: Self) {
      
      inline def setDisableAlpha(value: Boolean): Self = StObject.set(x, "disableAlpha", value.asInstanceOf[js.Any])
      
      inline def setDisableAlphaUndefined: Self = StObject.set(x, "disableAlpha", js.undefined)
      
      inline def setStyles(value: PartialClassesChromePicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait ChromePickerStylesProps extends StObject {
    
    var Alpha: CSSProperties
    
    var Hue: CSSProperties
    
    var Saturation: CSSProperties
    
    var active: CSSProperties
    
    var alpha: CSSProperties
    
    var body: CSSProperties
    
    var color: CSSProperties
    
    var controls: CSSProperties
    
    var hue: CSSProperties
    
    var picker: CSSProperties
    
    var saturation: CSSProperties
    
    var swatch: CSSProperties
    
    var toggles: CSSProperties
  }
  object ChromePickerStylesProps {
    
    inline def apply(
      Alpha: CSSProperties,
      Hue: CSSProperties,
      Saturation: CSSProperties,
      active: CSSProperties,
      alpha: CSSProperties,
      body: CSSProperties,
      color: CSSProperties,
      controls: CSSProperties,
      hue: CSSProperties,
      picker: CSSProperties,
      saturation: CSSProperties,
      swatch: CSSProperties,
      toggles: CSSProperties
    ): ChromePickerStylesProps = {
      val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Hue = Hue.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], swatch = swatch.asInstanceOf[js.Any], toggles = toggles.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromePickerStylesProps]
    }
    
    extension [Self <: ChromePickerStylesProps](x: Self) {
      
      inline def setActive(value: CSSProperties): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: CSSProperties): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
      
      inline def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setColor(value: CSSProperties): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
      
      inline def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setSaturation(value: CSSProperties): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
      
      inline def setSwatch(value: CSSProperties): Self = StObject.set(x, "swatch", value.asInstanceOf[js.Any])
      
      inline def setToggles(value: CSSProperties): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
    }
  }
}
