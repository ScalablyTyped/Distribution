package typings.reactI18next.anon

import typings.i18next.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialLanguage extends js.Object {
  var initialI18nStore: Resource
  var initialLanguage: String
}

object InitialLanguage {
  @scala.inline
  def apply(initialI18nStore: Resource, initialLanguage: String): InitialLanguage = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialLanguage]
  }
}

