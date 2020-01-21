package typings.reactReduxI18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nState extends js.Object {
  var locale: String
  var translations: TranslationObjects
}

object I18nState {
  @scala.inline
  def apply(locale: String, translations: TranslationObjects): I18nState = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[I18nState]
  }
}

