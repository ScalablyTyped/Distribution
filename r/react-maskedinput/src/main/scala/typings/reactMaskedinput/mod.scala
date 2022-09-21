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
  open class default ()
    extends Component[MaskedInputProps, js.Object, Any]
  
  type CharsFormatters = StringDictionary[FormatCharacter]
  
  trait FormatCharacter extends StObject {
    
    var transform: js.UndefOr[js.Function1[/* char */ String, String]] = js.undefined
    
    def validate(char: String): String
  }
  object FormatCharacter {
    
    inline def apply(validate: String => String): FormatCharacter = {
      val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[FormatCharacter]
    }
    
    extension [Self <: FormatCharacter](x: Self) {
      
      inline def setTransform(value: /* char */ String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setValidate(value: String => String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
  
  type MaskedInput = Component[MaskedInputProps, js.Object, Any]
  
  trait MaskedInputProps
    extends StObject
       with InputHTMLAttributes[Any] {
    
    var formatCharacters: js.UndefOr[CharsFormatters] = js.undefined
    
    var mask: String
    
    var placeholderChar: js.UndefOr[String] = js.undefined
  }
  object MaskedInputProps {
    
    inline def apply(mask: String): MaskedInputProps = {
      val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskedInputProps]
    }
    
    extension [Self <: MaskedInputProps](x: Self) {
      
      inline def setFormatCharacters(value: CharsFormatters): Self = StObject.set(x, "formatCharacters", value.asInstanceOf[js.Any])
      
      inline def setFormatCharactersUndefined: Self = StObject.set(x, "formatCharacters", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderChar(value: String): Self = StObject.set(x, "placeholderChar", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderCharUndefined: Self = StObject.set(x, "placeholderChar", js.undefined)
    }
  }
}
