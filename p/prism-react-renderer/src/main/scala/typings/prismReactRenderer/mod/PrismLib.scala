package typings.prismReactRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrismLib extends js.Object {
  var languages: LanguageDict = js.native
  def highlight(code: String, grammar: PrismGrammar, language: Language): String = js.native
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
  implicit class PrismLibOps[Self <: PrismLib] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighlight(value: (String, PrismGrammar, Language) => String): Self = this.set("highlight", js.Any.fromFunction3(value))
    @scala.inline
    def setLanguages(value: LanguageDict): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenize(value: (String, PrismGrammar, Language) => js.Array[PrismToken | String]): Self = this.set("tokenize", js.Any.fromFunction3(value))
  }
  
}

