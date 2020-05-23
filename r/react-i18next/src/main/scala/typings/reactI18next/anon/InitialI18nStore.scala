package typings.reactI18next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialI18nStore extends js.Object {
  var initialI18nStore: StringDictionary[js.Object]
  var initialLanguage: String
}

object InitialI18nStore {
  @scala.inline
  def apply(initialI18nStore: StringDictionary[js.Object], initialLanguage: String): InitialI18nStore = {
    val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialI18nStore]
  }
}

