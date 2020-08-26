package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigatorLanguage extends js.Object {
  val language: java.lang.String = js.native
  val languages: js.Array[java.lang.String] = js.native
}

object NavigatorLanguage {
  @scala.inline
  def apply(language: java.lang.String, languages: js.Array[java.lang.String]): NavigatorLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorLanguage]
  }
  @scala.inline
  implicit class NavigatorLanguageOps[Self <: NavigatorLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLanguage(value: java.lang.String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagesVarargs(value: java.lang.String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[java.lang.String]): Self = this.set("languages", value.asInstanceOf[js.Any])
  }
  
}

