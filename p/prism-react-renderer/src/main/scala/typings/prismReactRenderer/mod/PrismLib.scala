package typings.prismReactRenderer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrismLib extends StObject {
  
  def highlight(code: String, grammar: PrismGrammar, language: Language): String = js.native
  
  var languages: LanguageDict = js.native
  
  def tokenize(code: String, grammar: PrismGrammar, language: Language): js.Array[PrismToken | String] = js.native
}
object PrismLib {
  
  @scala.inline
  def apply(
    highlight: (String, PrismGrammar, Language) => String,
    languages: LanguageDict,
    tokenize: (String, PrismGrammar, Language) => js.Array[PrismToken | String]
  ): PrismLib = {
    val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction3(highlight), languages = languages.asInstanceOf[js.Any], tokenize = js.Any.fromFunction3(tokenize))
    __obj.asInstanceOf[PrismLib]
  }
  
  @scala.inline
  implicit class PrismLibMutableBuilder[Self <: PrismLib] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlight(value: (String, PrismGrammar, Language) => String): Self = StObject.set(x, "highlight", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLanguages(value: LanguageDict): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenize(value: (String, PrismGrammar, Language) => js.Array[PrismToken | String]): Self = StObject.set(x, "tokenize", js.Any.fromFunction3(value))
  }
}
