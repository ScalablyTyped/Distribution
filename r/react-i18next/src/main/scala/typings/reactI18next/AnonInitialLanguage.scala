package typings.reactI18next

import typings.i18next.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialLanguage extends js.Object {
  var initialI18nStore: Resource
  var initialLanguage: String
}

object AnonInitialLanguage {
  @scala.inline
  def apply(initialI18nStore: Resource, initialLanguage: String): AnonInitialLanguage = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialLanguage]
  }
}

