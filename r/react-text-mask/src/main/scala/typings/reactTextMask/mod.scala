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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-text-mask", JSImport.Default)
  @js.native
  class default () extends MaskedInput
  
  @JSImport("react-text-mask", "conformToMask")
  @js.native
  def conformToMask(text: String, mask: js.Function1[/* value */ String, maskArray], config: js.Any): conformToMaskResult = js.native
  @JSImport("react-text-mask", "conformToMask")
  @js.native
  def conformToMask(text: String, mask: maskArray, config: js.Any): conformToMaskResult = js.native
  
  @js.native
  trait MaskedInput
    extends Component[MaskedInputProps, js.Any, js.Any] {
    
    var inputElement: HTMLElement = js.native
  }
  
  @js.native
  trait MaskedInputProps extends InputHTMLAttributes[HTMLInputElement] {
    
    var guide: js.UndefOr[Boolean] = js.native
    
    var keepCharPositions: js.UndefOr[Boolean] = js.native
    
    var mask: js.UndefOr[maskArray | (js.Function1[/* value */ String, maskArray])] = js.native
    
    var pipe: js.UndefOr[
        js.Function2[
          /* conformedValue */ String, 
          /* config */ js.Any, 
          `false` | String | IndexesOfPipedChars
        ]
      ] = js.native
    
    var placeholderChar: js.UndefOr[String] = js.native
    
    var render: js.UndefOr[
        js.Function2[/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any, _]
      ] = js.native
    
    var showMask: js.UndefOr[Boolean] = js.native
  }
  object MaskedInputProps {
    
    @scala.inline
    def apply(): MaskedInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    @scala.inline
    implicit class MaskedInputPropsMutableBuilder[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuide(value: Boolean): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      @scala.inline
      def setKeepCharPositions(value: Boolean): Self = StObject.set(x, "keepCharPositions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepCharPositionsUndefined: Self = StObject.set(x, "keepCharPositions", js.undefined)
      
      @scala.inline
      def setMask(value: maskArray | (js.Function1[/* value */ String, maskArray])): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskFunction1(value: /* value */ String => maskArray): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskVarargs(value: (String | RegExp)*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      @scala.inline
      def setPipe(
        value: (/* conformedValue */ String, /* config */ js.Any) => `false` | String | IndexesOfPipedChars
      ): Self = StObject.set(x, "pipe", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      @scala.inline
      def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
      
      @scala.inline
      def setRender(value: (/* ref */ js.Function1[/* inputElement */ HTMLElement, Unit], /* props */ js.Any) => _): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setShowMask(value: Boolean): Self = StObject.set(x, "showMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowMaskUndefined: Self = StObject.set(x, "showMask", js.undefined)
    }
  }
  
  @js.native
  trait conformToMaskResult extends StObject {
    
    var conformedValue: String = js.native
    
    var meta: SomeCharsRejected = js.native
  }
  object conformToMaskResult {
    
    @scala.inline
    def apply(conformedValue: String, meta: SomeCharsRejected): conformToMaskResult = {
      val __obj = js.Dynamic.literal(conformedValue = conformedValue.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[conformToMaskResult]
    }
    
    @scala.inline
    implicit class conformToMaskResultMutableBuilder[Self <: conformToMaskResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConformedValue(value: String): Self = StObject.set(x, "conformedValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: SomeCharsRejected): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type maskArray = (js.Array[String | RegExp]) | Boolean
}
