package typings.reactI18next

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialI18nStore extends js.Object {
  var initialI18nStore: StringDictionary[js.Object]
  var initialLanguage: String
}

object AnonInitialI18nStore {
  @scala.inline
  def apply(initialI18nStore: StringDictionary[js.Object], initialLanguage: String): AnonInitialI18nStore = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialI18nStore]
  }
}

