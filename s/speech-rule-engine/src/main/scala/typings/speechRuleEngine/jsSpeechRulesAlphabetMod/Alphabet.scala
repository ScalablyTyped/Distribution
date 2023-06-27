package typings.speechRuleEngine.jsSpeechRulesAlphabetMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alphabet
  extends StObject
     with ProtoAlphabet {
  
  var unicode: js.Array[String]
}
object Alphabet {
  
  inline def apply(
    base: Base,
    category: String,
    font: Font | Embellish,
    interval: js.Tuple2[String, String],
    subst: StringDictionary[String | Boolean],
    unicode: js.Array[String]
  ): Alphabet = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], subst = subst.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alphabet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alphabet] (val x: Self) extends AnyVal {
    
    inline def setUnicode(value: js.Array[String]): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    inline def setUnicodeVarargs(value: String*): Self = StObject.set(x, "unicode", js.Array(value*))
  }
}
