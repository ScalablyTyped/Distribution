package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesBlockPicker
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.reactColor.reactColorStrings.hide
import typings.reactColor.reactColorStrings.top
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMod {
  
  @JSImport("react-color/lib/components/block/Block", JSImport.Default)
  @js.native
  class default ()
    extends Component[BlockPickerProps, js.Object, js.Any]
  
  @js.native
  trait BlockPicker
    extends Component[BlockPickerProps, js.Object, js.Any]
  
  @js.native
  trait BlockPickerProps extends ColorPickerProps[BlockPicker] {
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
    
    @JSName("styles")
    var styles_BlockPickerProps: js.UndefOr[PartialClassesBlockPicker] = js.native
    
    var triangle: js.UndefOr[hide | top] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object BlockPickerProps {
    
    @scala.inline
    def apply(): BlockPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockPickerProps]
    }
    
    @scala.inline
    implicit class BlockPickerPropsMutableBuilder[Self <: BlockPickerProps] (val x: Self) extends AnyVal {
      
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
      def setStyles(value: PartialClassesBlockPicker): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTriangle(value: hide | top): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait BlockPickerStylesProps extends StObject {
    
    var body: CSSProperties = js.native
    
    var card: CSSProperties = js.native
    
    var head: CSSProperties = js.native
    
    var input: CSSProperties = js.native
    
    var label: CSSProperties = js.native
    
    var triangle: CSSProperties = js.native
  }
  object BlockPickerStylesProps {
    
    @scala.inline
    def apply(
      body: CSSProperties,
      card: CSSProperties,
      head: CSSProperties,
      input: CSSProperties,
      label: CSSProperties,
      triangle: CSSProperties
    ): BlockPickerStylesProps = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockPickerStylesProps]
    }
    
    @scala.inline
    implicit class BlockPickerStylesPropsMutableBuilder[Self <: BlockPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: CSSProperties): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
    }
  }
}
