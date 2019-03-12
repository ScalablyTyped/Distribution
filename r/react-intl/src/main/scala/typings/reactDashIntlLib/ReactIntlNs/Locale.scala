package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var locale: java.lang.String
  var pluralRuleFunction: js.UndefOr[js.Function2[/* n */ scala.Double, /* ord */ scala.Boolean, java.lang.String]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    locale: java.lang.String,
    fields: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    pluralRuleFunction: (/* n */ scala.Double, /* ord */ scala.Boolean) => java.lang.String = null
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (pluralRuleFunction != null) __obj.updateDynamic("pluralRuleFunction")(js.Any.fromFunction2(pluralRuleFunction))
    __obj.asInstanceOf[Locale]
  }
}

