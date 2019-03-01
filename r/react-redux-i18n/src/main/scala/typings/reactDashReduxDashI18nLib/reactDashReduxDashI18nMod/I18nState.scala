package typings
package reactDashReduxDashI18nLib.reactDashReduxDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nState extends js.Object {
  var locale: java.lang.String
  var translations: TranslationObjects
}

object I18nState {
  @scala.inline
  def apply(locale: java.lang.String, translations: TranslationObjects): I18nState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("translations")(translations)
    __obj.asInstanceOf[I18nState]
  }
}

