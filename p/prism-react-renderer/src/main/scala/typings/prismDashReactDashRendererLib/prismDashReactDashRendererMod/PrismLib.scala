package typings
package prismDashReactDashRendererLib.prismDashReactDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrismLib extends js.Object {
  var languages: LanguageDict
  def highlight(code: java.lang.String, grammar: PrismGrammar, language: Language): java.lang.String
  def tokenize(code: java.lang.String, grammar: PrismGrammar, language: Language): js.Array[PrismToken | java.lang.String]
}

object PrismLib {
  @scala.inline
  def apply(
    highlight: (java.lang.String, PrismGrammar, Language) => java.lang.String,
    languages: LanguageDict,
    tokenize: (java.lang.String, PrismGrammar, Language) => js.Array[PrismToken | java.lang.String]
  ): PrismLib = {
    val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction3(highlight), languages = languages, tokenize = js.Any.fromFunction3(tokenize))
  
    __obj.asInstanceOf[PrismLib]
  }
}

