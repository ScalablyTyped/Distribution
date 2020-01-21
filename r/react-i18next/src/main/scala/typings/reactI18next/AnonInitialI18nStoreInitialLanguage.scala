package typings.reactI18next

import typings.i18next.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialI18nStoreInitialLanguage extends js.Object {
  var initialI18nStore: Resource
  var initialLanguage: String
}

object AnonInitialI18nStoreInitialLanguage {
  @scala.inline
  def apply(initialI18nStore: Resource, initialLanguage: String): AnonInitialI18nStoreInitialLanguage = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInitialI18nStoreInitialLanguage]
  }
}

