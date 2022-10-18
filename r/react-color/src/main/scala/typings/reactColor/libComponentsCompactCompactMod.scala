package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesCompactPick
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCompactCompactMod {
  
  @JSImport("react-color/lib/components/compact/Compact", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CompactPickerProps, js.Object, Any]
  
  type CompactPicker = Component[CompactPickerProps, js.Object, Any]
  
  trait CompactPickerProps
    extends StObject
       with ColorPickerProps[CompactPicker] {
    
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.undefined
    
    @JSName("styles")
    var styles_CompactPickerProps: js.UndefOr[PartialClassesCompactPick] = js.undefined
  }
  object CompactPickerProps {
    
    inline def apply(): CompactPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompactPickerProps]
    }
    
    extension [Self <: CompactPickerProps](x: Self) {
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2(value))
      
      inline def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      inline def setStyles(value: PartialClassesCompactPick): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait CompactPickerStylesProps extends StObject {
    
    var Compact: CSSProperties
    
    var clear: CSSProperties
    
    var compact: CSSProperties
  }
  object CompactPickerStylesProps {
    
    inline def apply(Compact: CSSProperties, clear: CSSProperties, compact: CSSProperties): CompactPickerStylesProps = {
      val __obj = js.Dynamic.literal(Compact = Compact.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompactPickerStylesProps]
    }
    
    extension [Self <: CompactPickerStylesProps](x: Self) {
      
      inline def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setCompact(value: CSSProperties): Self = StObject.set(x, "Compact", value.asInstanceOf[js.Any])
    }
  }
}
