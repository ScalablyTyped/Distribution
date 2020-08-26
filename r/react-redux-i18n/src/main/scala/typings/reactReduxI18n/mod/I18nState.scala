package typings.reactReduxI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18nState extends js.Object {
  var locale: String = js.native
  var translations: TranslationObjects = js.native
}

object I18nState {
  @scala.inline
  def apply(locale: String, translations: TranslationObjects): I18nState = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nState]
  }
  @scala.inline
  implicit class I18nStateOps[Self <: I18nState] (val x: Self) extends AnyVal {
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setTranslations(value: TranslationObjects): Self = this.set("translations", value.asInstanceOf[js.Any])
  }
  
}

