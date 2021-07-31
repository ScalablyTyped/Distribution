package typings.reactMaskedinput

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.InputHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-maskedinput", JSImport.Default)
  @js.native
  class default ()
    extends Component[MaskedInputProps, js.Object, js.Any]
  
  type CharsFormatters = StringDictionary[FormatCharacter]
  
  trait FormatCharacter extends StObject {
    
    var transform: js.UndefOr[js.Function1[/* char */ String, String]] = js.undefined
    
    def validate(char: String): String
  }
  object FormatCharacter {
    
    @scala.inline
    def apply(validate: String => String): FormatCharacter = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[FormatCharacter]
    }
    
    @scala.inline
    implicit class FormatCharacterMutableBuilder[Self <: FormatCharacter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransform(value: /* char */ String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setValidate(value: String => String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type MaskedInput = Component[MaskedInputProps, js.Object, js.Any]
  
  trait MaskedInputProps
    extends StObject
       with InputHTMLAttributes[js.Any] {
    
    var formatCharacters: js.UndefOr[CharsFormatters] = js.undefined
    
    var mask: String
    
    var placeholderChar: js.UndefOr[String] = js.undefined
  }
  object MaskedInputProps {
    
    @scala.inline
    def apply(mask: String): MaskedInputProps = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    @scala.inline
    implicit class MaskedInputPropsMutableBuilder[Self <: MaskedInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatCharacters(value: CharsFormatters): Self = StObject.set(x, "formatCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatCharactersUndefined: Self = StObject.set(x, "formatCharacters", js.undefined)
      
      @scala.inline
      def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
    }
  }
}
