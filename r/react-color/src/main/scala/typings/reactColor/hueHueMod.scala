package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesHuePickerSt
import typings.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hueHueMod {
  
  @JSImport("react-color/lib/components/hue/Hue", JSImport.Default)
  @js.native
  class default ()
    extends Component[HuePickerProps, js.Object, js.Any]
  
  @js.native
  trait HuePicker
    extends Component[HuePickerProps, js.Object, js.Any]
  
  @js.native
  trait HuePickerProps extends ColorPickerProps[HuePicker] {
    
    var height: js.UndefOr[String] = js.native
    
    @JSName("styles")
    var styles_HuePickerProps: js.UndefOr[PartialClassesHuePickerSt] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object HuePickerProps {
    
    @scala.inline
    def apply(): HuePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HuePickerProps]
    }
    
    @scala.inline
    implicit class HuePickerPropsMutableBuilder[Self <: HuePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesHuePickerSt): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait HuePickerStylesProps extends StObject {
    
    var hue: CSSProperties = js.native
    
    var picker: CSSProperties = js.native
  }
  object HuePickerStylesProps {
    
    @scala.inline
    def apply(hue: CSSProperties, picker: CSSProperties): HuePickerStylesProps = {
      val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[HuePickerStylesProps]
    }
    
    @scala.inline
    implicit class HuePickerStylesPropsMutableBuilder[Self <: HuePickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHue(value: CSSProperties): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    }
  }
}
