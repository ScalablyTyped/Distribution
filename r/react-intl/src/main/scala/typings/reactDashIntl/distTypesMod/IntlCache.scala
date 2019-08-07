package typings.reactDashIntl.distTypesMod

import typings.intlDashMessageformat.intlDashMessageformatMod.default
import typings.std.IntlNs.DateTimeFormat
import typings.std.IntlNs.NumberFormat
import typings.std.IntlNs.PluralRules
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlCache extends js.Object {
  var dateTime: Record[String, DateTimeFormat]
  var message: Record[String, default]
  var number: Record[String, NumberFormat]
  var pluralRules: Record[String, PluralRules]
  var relativeTime: Record[
    String, 
    typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
  ]
}

object IntlCache {
  @scala.inline
  def apply(
    dateTime: Record[String, DateTimeFormat],
    message: Record[String, default],
    number: Record[String, NumberFormat],
    pluralRules: Record[String, PluralRules],
    relativeTime: Record[
      String, 
      typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
    ]
  ): IntlCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime, message = message, number = number, pluralRules = pluralRules, relativeTime = relativeTime)
  
    __obj.asInstanceOf[IntlCache]
  }
}

