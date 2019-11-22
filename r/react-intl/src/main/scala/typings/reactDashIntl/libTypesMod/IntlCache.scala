package typings.reactDashIntl.libTypesMod

import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.default
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlCache extends js.Object {
  var dateTime: Record[String, DateTimeFormat]
  var list: Record[String, default]
  var message: Record[String, typings.intlDashMessageformat.intlDashMessageformatMod.default]
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
    list: Record[String, default],
    message: Record[String, typings.intlDashMessageformat.intlDashMessageformatMod.default],
    number: Record[String, NumberFormat],
    pluralRules: Record[String, PluralRules],
    relativeTime: Record[
      String, 
      typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
    ]
  ): IntlCache = {
    val __obj = js.Dynamic.literal(dateTime = dateTime, list = list, message = message, number = number, pluralRules = pluralRules, relativeTime = relativeTime)
  
    __obj.asInstanceOf[IntlCache]
  }
}

