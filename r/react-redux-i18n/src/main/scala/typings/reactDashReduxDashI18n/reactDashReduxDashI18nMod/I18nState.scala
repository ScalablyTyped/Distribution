package typings.reactDashReduxDashI18n.reactDashReduxDashI18nMod

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
    val __obj = js.Dynamic.literal(locale = locale, translations = translations)
  
    __obj.asInstanceOf[I18nState]
  }
}

