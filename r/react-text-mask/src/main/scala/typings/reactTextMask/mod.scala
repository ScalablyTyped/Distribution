package typings.reactTextMask

import typings.react.mod.Component
import typings.react.mod.InputHTMLAttributes
import typings.reactTextMask.anon.IndexesOfPipedChars
import typings.reactTextMask.anon.SomeCharsRejected
import typings.reactTextMask.reactTextMaskBooleans.`false`
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-text-mask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-text-mask", JSImport.Default)
  @js.native
  class default () extends MaskedInput
  
  inline def conformToMask(text: String, mask: js.Function1[/* value */ String, maskArray], config: js.Any): conformToMaskResult = (^.asInstanceOf[js.Dynamic].applyDynamic("conformToMask")(text.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[conformToMaskResult]
  inline def conformToMask(text: String, mask: maskArray, config: js.Any): conformToMaskResult = (^.asInstanceOf[js.Dynamic].applyDynamic("conformToMask")(text.asInstanceOf[js.Any], mask.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[conformToMaskResult]
  
  @js.native
  trait MaskedInput
    extends Component[MaskedInputProps, js.Any, js.Any] {
    
    var inputElement: HTMLElement = js.native
  }
  
  trait MaskedInputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var guide: js.UndefOr[Boolean] = js.undefined
    
    var keepCharPositions: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[maskArray | (js.Function1[/* value */ String, maskArray])] = js.undefined
    
    var pipe: js.UndefOr[
        js.Function2[
          /* conformedValue */ String, 
          /* config */ js.Any, 
          `false` | String | IndexesOfPipedChars
        ]
      ] = js.undefined
    
    var placeholderChar: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[
        js.Function2[
          /* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], 
          /* props */ js.Any, 
          js.Any
        ]
      ] = js.undefined
    
    var showMask: js.UndefOr[Boolean] = js.undefined
  }
  object MaskedInputProps {
    
    inline def apply(): MaskedInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    extension [Self <: MaskedInputProps](x: Self) {
      
      inline def setGuide(value: Boolean): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      inline def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      inline def setKeepCharPositions(value: Boolean): Self = StObject.set(x, "keepCharPositions", value.asInstanceOf[js.Any])
      
      inline def setKeepCharPositionsUndefined: Self = StObject.set(x, "keepCharPositions", js.undefined)
      
      inline def setMask(value: maskArray | (js.Function1[/* value */ String, maskArray])): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskFunction1(value: /* value */ String => maskArray): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskVarargs(value: (String | RegExp)*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      inline def setPipe(
        value: (/* conformedValue */ String, /* config */ js.Any) => `false` | String | IndexesOfPipedChars
      ): Self = StObject.set(x, "pipe", js.Any.fromFunction2(value))
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
      
      inline def setRender(
        value: (/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any) => js.Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setShowMask(value: Boolean): Self = StObject.set(x, "showMask", value.asInstanceOf[js.Any])
      
      inline def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
    }
  }
  
  trait conformToMaskResult extends StObject {
    
    var conformedValue: String
    
    var meta: SomeCharsRejected
  }
  object conformToMaskResult {
    
    inline def apply(conformedValue: String, meta: SomeCharsRejected): conformToMaskResult = {
      val __obj = js.Dynamic.literal(conformedValue = conformedValue.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[conformToMaskResult]
    }
    
    extension [Self <: conformToMaskResult](x: Self) {
      
      inline def setConformedValue(value: String): Self = StObject.set(x, "conformedValue", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: SomeCharsRejected): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type maskArray = (js.Array[String | RegExp]) | Boolean
}
