package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrismLib extends StObject {
  
  def highlight(code: String, grammar: PrismGrammar, language: Language): String
  
  var languages: LanguageDict
  
  def tokenize(code: String, grammar: PrismGrammar, language: Language): js.Array[PrismToken | String]
}
object PrismLib {
  
  inline def apply(
    highlight: (String, PrismGrammar, Language) => String,
    languages: LanguageDict,
    tokenize: (String, PrismGrammar, Language) => js.Array[PrismToken | String]
  ): PrismLib = {
    val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction3(highlight), languages = languages.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[PrismLib]
  }
  
  extension [Self <: PrismLib](x: Self) {
    
    inline def setHighlight(value: (String, PrismGrammar, Language) => String): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
    
    inline def setLanguages(value: LanguageDict): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setTokenize(value: (String, PrismGrammar, Language) => js.Array[PrismToken | String]): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
  }
}
