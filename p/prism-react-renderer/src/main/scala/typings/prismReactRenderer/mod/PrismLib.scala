package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismLib extends js.Object {
  var languages: LanguageDict
  def highlight(code: String, grammar: PrismGrammar, language: Language): String
  def tokenize(code: String, grammar: PrismGrammar, language: Language): js.Array[PrismToken | String]
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
}

