package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesPhotoshopPi
import typings.reactColor.mod.ColorChangeHandler
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object photoshopMod {
  
  @JSImport("react-color/lib/components/photoshop/Photoshop", JSImport.Default)
  @js.native
  class default ()
    extends Component[PhotoshopPickerProps, js.Object, js.Any]
  
  @js.native
  trait PhotoshopPicker
    extends Component[PhotoshopPickerProps, js.Object, js.Any]
  
  @js.native
  trait PhotoshopPickerProps extends ColorPickerProps[PhotoshopPicker] {
    
    var header: js.UndefOr[String] = js.native
    
    var onAccept: js.UndefOr[ColorChangeHandler] = js.native
    
    var onCancel: js.UndefOr[ColorChangeHandler] = js.native
    
    @JSName("styles")
    var styles_PhotoshopPickerProps: js.UndefOr[PartialClassesPhotoshopPi] = js.native
  }
  object PhotoshopPickerProps {
    
    @scala.inline
    def apply(): PhotoshopPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoshopPickerProps]
    }
    
    @scala.inline
    implicit class PhotoshopPickerPropsMutableBuilder[Self <: PhotoshopPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setOnAccept(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onAccept", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAcceptUndefined: Self = StObject.set(x, "onAccept", js.undefined)
      
      @scala.inline
      def setOnCancel(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesPhotoshopPi): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait PhotoshopPickerStylesProps extends StObject {
    
    var actions: CSSProperties = js.native
    
    var body: CSSProperties = js.native
    
    var controls: CSSProperties = js.native
    
    var head: CSSProperties = js.native
    
    var hue: CSSProperties = js.native
    
    var picker: CSSProperties = js.native
    
    var previews: CSSProperties = js.native
    
    var saturation: CSSProperties = js.native
    
    var top: CSSProperties = js.native
  }
  object PhotoshopPickerStylesProps {
    
    @scala.inline
    def apply(
      actions: CSSProperties,
      body: CSSProperties,
      controls: CSSProperties,
      head: CSSProperties,
      hue: CSSProperties,
      picker: CSSProperties,
      previews: CSSProperties,
      saturation: CSSProperties,
      top: CSSProperties
    ): PhotoshopPickerStylesProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhotoshopPickerStylesProps]
    }
    
    @scala.inline
    implicit class PhotoshopPickerStylesPropsMutableBuilder[Self <: PhotoshopPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: CSSProperties): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: CSSProperties): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHue(value: CSSProperties): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviews(value: CSSProperties): Self = StObject.set(x, "previews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturation(value: CSSProperties): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: CSSProperties): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
