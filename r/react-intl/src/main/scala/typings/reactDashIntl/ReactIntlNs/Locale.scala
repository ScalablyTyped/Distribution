package typings.reactDashIntl.ReactIntlNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var fields: js.UndefOr[StringDictionary[String]] = js.undefined
  var locale: String
  var pluralRuleFunction: js.UndefOr[js.Function2[/* n */ Double, /* ord */ Boolean, String]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    locale: String,
    fields: StringDictionary[String] = null,
    pluralRuleFunction: (/* n */ Double, /* ord */ Boolean) => String = null
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (pluralRuleFunction != null) __obj.updateDynamic("pluralRuleFunction")(js.Any.fromFunction2(pluralRuleFunction))
    __obj.asInstanceOf[Locale]
  }
}

