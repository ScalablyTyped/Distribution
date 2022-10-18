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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTwitterTwitterMod {
  
  @JSImport("react-color/lib/components/twitter/Twitter", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TwitterPickerProps, js.Object, Any]
  
  type TwitterPicker = Component[TwitterPickerProps, js.Object, Any]
  
  trait TwitterPickerProps
    extends StObject
       with ColorPickerProps[TwitterPicker] {
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    @JSName("styles")
    var styles_TwitterPickerProps: js.UndefOr[PartialClassesTwitterPick] = js.undefined
    
    var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object TwitterPickerProps {
    
    inline def apply(): TwitterPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwitterPickerProps]
    }
    
    extension [Self <: TwitterPickerProps](x: Self) {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2(value))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setStyles(value: PartialClassesTwitterPick): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTriangle(value: hide | `top-left` | `top-right`): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      inline def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TwitterPickerStylesProps extends StObject {
    
    var body: CSSProperties
    
    var card: CSSProperties
    
    var clear: CSSProperties
    
    var hash: CSSProperties
    
    var input: CSSProperties
    
    var label: CSSProperties
    
    var swatch: CSSProperties
    
    var triangle: CSSProperties
    
    var triangleShadow: CSSProperties
  }
  object TwitterPickerStylesProps {
    
    inline def apply(
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
    
    extension [Self <: TwitterPickerStylesProps](x: Self) {
      
      inline def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setHash(value: CSSProperties): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setInput(value: CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: CSSProperties): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSwatch(value: CSSProperties): Self = StObject.set(x, "swatch", value.asInstanceOf[js.Any])
      
      inline def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      inline def setTriangleShadow(value: CSSProperties): Self = StObject.set(x, "triangleShadow", value.asInstanceOf[js.Any])
    }
  }
}
