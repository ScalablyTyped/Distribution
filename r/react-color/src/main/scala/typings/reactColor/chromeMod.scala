package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesChromePicke
import typings.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeMod {
  
  @JSImport("react-color/lib/components/chrome/Chrome", JSImport.Default)
  @js.native
  class default ()
    extends Component[ChromePickerProps, js.Object, js.Any]
  
  @js.native
  trait ChromePicker
    extends Component[ChromePickerProps, js.Object, js.Any]
  
  @js.native
  trait ChromePickerProps extends ColorPickerProps[ChromePicker] {
    
    var disableAlpha: js.UndefOr[Boolean] = js.native
    
    @JSName("styles")
    var styles_ChromePickerProps: js.UndefOr[PartialClassesChromePicke] = js.native
  }
  object ChromePickerProps {
    
    @scala.inline
    def apply(): ChromePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromePickerProps]
    }
    
    @scala.inline
    implicit class ChromePickerPropsMutableBuilder[Self <: ChromePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableAlpha(value: Boolean): Self = StObject.set(x, "disableAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAlphaUndefined: Self = StObject.set(x, "disableAlpha", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesChromePicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait ChromePickerStylesProps extends StObject {
    
    var Alpha: CSSProperties = js.native
    
    var Hue: CSSProperties = js.native
    
    var Saturation: CSSProperties = js.native
    
    var active: CSSProperties = js.native
    
    var alpha: CSSProperties = js.native
    
    var body: CSSProperties = js.native
    
    var color: CSSProperties = js.native
    
    var controls: CSSProperties = js.native
    
    var hue: CSSProperties = js.native
    
    var picker: CSSProperties = js.native
    
    var saturation: CSSProperties = js.native
    
    var swatch: CSSProperties = js.native
    
    var toggles: CSSProperties = js.native
  }
  object ChromePickerStylesProps {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ChromePickerStylesPropsMutableBuilder[Self <: ChromePickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: CSSProperties): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha(value: CSSProperties): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: CSSProperties): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturation(value: CSSProperties): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwatch(value: CSSProperties): Self = StObject.set(x, "swatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggles(value: CSSProperties): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
    }
  }
}
