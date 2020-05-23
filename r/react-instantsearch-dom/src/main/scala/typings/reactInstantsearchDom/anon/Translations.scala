package typings.reactInstantsearchDom.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translations extends js.Object {
  var translations: js.UndefOr[StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]]] = js.undefined
}

object Translations {
  @scala.inline
  def apply(translations: StringDictionary[js.Function2[/* n */ Double, /* ms */ Double, String]] = null): Translations = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Translations]
  }
}

