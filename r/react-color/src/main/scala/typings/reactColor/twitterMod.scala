package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesTwitterPick
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.reactColor.reactColorStrings.`top-left`
import typings.reactColor.reactColorStrings.`top-right`
import typings.reactColor.reactColorStrings.hide
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitterMod {
  
  @JSImport("react-color/lib/components/twitter/Twitter", JSImport.Default)
  @js.native
  class default ()
    extends Component[TwitterPickerProps, js.Object, js.Any]
  
  @js.native
  trait TwitterPicker
    extends Component[TwitterPickerProps, js.Object, js.Any]
  
  @js.native
  trait TwitterPickerProps extends ColorPickerProps[TwitterPicker] {
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
    
    @JSName("styles")
    var styles_TwitterPickerProps: js.UndefOr[PartialClassesTwitterPick] = js.native
    
    var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object TwitterPickerProps {
    
    @scala.inline
    def apply(): TwitterPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitterPickerProps]
    }
    
    @scala.inline
    implicit class TwitterPickerPropsMutableBuilder[Self <: TwitterPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesTwitterPick): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTriangle(value: hide | `top-left` | `top-right`): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TwitterPickerStylesProps extends StObject {
    
    var body: CSSProperties = js.native
    
    var card: CSSProperties = js.native
    
    var clear: CSSProperties = js.native
    
    var hash: CSSProperties = js.native
    
    var input: CSSProperties = js.native
    
    var label: CSSProperties = js.native
    
    var swatch: CSSProperties = js.native
    
    var triangle: CSSProperties = js.native
    
    var triangleShadow: CSSProperties = js.native
  }
  object TwitterPickerStylesProps {
    
    @scala.inline
    def apply(
      body: CSSProperties,
      card: CSSProperties,
      clear: CSSProperties,
      hash: CSSProperties,
      input: CSSProperties,
      label: CSSProperties,
      swatch: CSSProperties,
      triangle: CSSProperties,
      triangleShadow: CSSProperties
    ): TwitterPickerStylesProps = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], swatch = swatch.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any], triangleShadow = triangleShadow.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterPickerStylesProps]
    }
    
    @scala.inline
    implicit class TwitterPickerStylesPropsMutableBuilder[Self <: TwitterPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: CSSProperties): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwatch(value: CSSProperties): Self = StObject.set(x, "swatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleShadow(value: CSSProperties): Self = StObject.set(x, "triangleShadow", value.asInstanceOf[js.Any])
    }
  }
}
