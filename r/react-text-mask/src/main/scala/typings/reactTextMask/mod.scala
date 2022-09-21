package typings.reactTextMask

import typings.react.mod.Component
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactNode
import typings.reactTextMask.anon.DefaultValue
import typings.reactTextMask.anon.IndexesOfPipedChars
import typings.reactTextMask.anon.SomeCharsRejected
import typings.reactTextMask.reactTextMaskBooleans.`false`
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-text-mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-text-mask", JSImport.Default)
  @js.native
  open class default () extends MaskedInput
  
  inline def conformToMask(text: String, mask: js.Function1[/* value */ String, Mask]): ConformToMaskResult = (^.asInstanceOf[js.Dynamic].applyDynamic("conformToMask")(text.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[ConformToMaskResult]
  inline def conformToMask(text: String, mask: js.Function1[/* value */ String, Mask], config: ConformToMaskConfig): ConformToMaskResult = (^.asInstanceOf[js.Dynamic].applyDynamic("conformToMask")(text.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ConformToMaskResult]
  inline def conformToMask(text: String, mask: Mask): ConformToMaskResult = (^.asInstanceOf[js.Dynamic].applyDynamic("conformToMask")(text.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[ConformToMaskResult]
  inline def conformToMask(text: String, mask: Mask, config: ConformToMaskConfig): ConformToMaskResult = (^.asInstanceOf[js.Dynamic].applyDynamic("conformToMask")(text.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ConformToMaskResult]
  
  /* Inlined std.Partial<std.Omit<react-text-mask.react-text-mask.PipeConfig, 'rawValue'>> */
  trait ConformToMaskConfig extends StObject {
    
    var currentCaretPosition: js.UndefOr[Double] = js.undefined
    
    var guide: js.UndefOr[Boolean] = js.undefined
    
    var keepCharPositions: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var placeholderChar: js.UndefOr[String] = js.undefined
    
    var previousConformedValue: js.UndefOr[String] = js.undefined
  }
  object ConformToMaskConfig {
    
    inline def apply(): ConformToMaskConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConformToMaskConfig]
    }
    
    extension [Self <: ConformToMaskConfig](x: Self) {
      
      inline def setCurrentCaretPosition(value: Double): Self = StObject.set(x, "currentCaretPosition", value.asInstanceOf[js.Any])
      
      inline def setCurrentCaretPositionUndefined: Self = StObject.set(x, "currentCaretPosition", js.undefined)
      
      inline def setGuide(value: Boolean): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setKeepCharPositions(value: Boolean): Self = StObject.set(x, "keepCharPositions", value.asInstanceOf[js.Any])
      
      inline def setKeepCharPositionsUndefined: Self = StObject.set(x, "keepCharPositions", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPreviousConformedValue(value: String): Self = StObject.set(x, "previousConformedValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousConformedValueUndefined: Self = StObject.set(x, "previousConformedValue", js.undefined)
    }
  }
  
  trait ConformToMaskResult extends StObject {
    
    var conformedValue: String
    
    var meta: SomeCharsRejected
  }
  object ConformToMaskResult {
    
    inline def apply(conformedValue: String, meta: SomeCharsRejected): ConformToMaskResult = {
      val __obj = js.Dynamic.literal(conformedValue = conformedValue.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConformToMaskResult]
    }
    
    extension [Self <: ConformToMaskResult](x: Self) {
      
      inline def setConformedValue(value: String): Self = StObject.set(x, "conformedValue", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: SomeCharsRejected): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type Mask = (js.Array[String | js.RegExp]) | `false`
  
  @js.native
  trait MaskedInput extends Component[MaskedInputProps, Any, Any] {
    
    var inputElement: HTMLElement = js.native
  }
  
  trait MaskedInputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var guide: js.UndefOr[Boolean] = js.undefined
    
    var keepCharPositions: js.UndefOr[Boolean] = js.undefined
    
    var mask: Mask | (js.Function1[/* value */ String, Mask])
    
    var pipe: js.UndefOr[
        js.Function2[
          /* conformedValue */ String, 
          /* config */ PipeConfig, 
          `false` | String | IndexesOfPipedChars
        ]
      ] = js.undefined
    
    var placeholderChar: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[
        js.Function2[
          /* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], 
          /* props */ DefaultValue, 
          ReactNode
        ]
      ] = js.undefined
    
    var showMask: js.UndefOr[Boolean] = js.undefined
  }
  object MaskedInputProps {
    
    inline def apply(mask: Mask | (js.Function1[/* value */ String, Mask])): MaskedInputProps = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    extension [Self <: MaskedInputProps](x: Self) {
      
      inline def setGuide(value: Boolean): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setKeepCharPositions(value: Boolean): Self = StObject.set(x, "keepCharPositions", value.asInstanceOf[js.Any])
      
      inline def setKeepCharPositionsUndefined: Self = StObject.set(x, "keepCharPositions", js.undefined)
      
      inline def setMask(value: Mask | (js.Function1[/* value */ String, Mask])): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskFunction1(value: /* value */ String => Mask): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      inline def setMaskVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "mask", js.Array(value*))
      
      inline def setPipe(
        value: (/* conformedValue */ String, /* config */ PipeConfig) => `false` | String | IndexesOfPipedChars
      ): Self = StObject.set(x, "pipe", js.Any.fromFunction2(value))
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
      
      inline def setRender(
        value: (/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ DefaultValue) => ReactNode
      ): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setShowMask(value: Boolean): Self = StObject.set(x, "showMask", value.asInstanceOf[js.Any])
      
      inline def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
    }
  }
  
  trait PipeConfig extends StObject {
    
    var currentCaretPosition: Double
    
    var guide: js.UndefOr[Boolean] = js.undefined
    
    var keepCharPositions: Boolean
    
    var placeholder: String
    
    var placeholderChar: String
    
    var previousConformedValue: js.UndefOr[String] = js.undefined
    
    var rawValue: String
  }
  object PipeConfig {
    
    inline def apply(
      currentCaretPosition: Double,
      keepCharPositions: Boolean,
      placeholder: String,
      placeholderChar: String,
      rawValue: String
    ): PipeConfig = {
      val __obj = js.Dynamic.literal(currentCaretPosition = currentCaretPosition.asInstanceOf[js.Any], keepCharPositions = keepCharPositions.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], placeholderChar = placeholderChar.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipeConfig]
    }
    
    extension [Self <: PipeConfig](x: Self) {
      
      inline def setCurrentCaretPosition(value: Double): Self = StObject.set(x, "currentCaretPosition", value.asInstanceOf[js.Any])
      
      inline def setGuide(value: Boolean): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setKeepCharPositions(value: Boolean): Self = StObject.set(x, "keepCharPositions", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      inline def setPreviousConformedValue(value: String): Self = StObject.set(x, "previousConformedValue", value.asInstanceOf[js.Any])
      
      inline def setPreviousConformedValueUndefined: Self = StObject.set(x, "previousConformedValue", js.undefined)
      
      inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    }
  }
}
