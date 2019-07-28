package typings.reactDashIntl.ReactIntlNs

import typings.react.reactMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlFormat extends js.Object {
  var formatDate: Requireable[_]
  var formatHTMLMessage: Requireable[_]
  var formatMessage: Requireable[_]
  var formatNumber: Requireable[_]
  var formatPlural: Requireable[_]
  var formatRelative: Requireable[_]
  var formatTime: Requireable[_]
}

object IntlFormat {
  @scala.inline
  def apply(
    formatDate: Requireable[_],
    formatHTMLMessage: Requireable[_],
    formatMessage: Requireable[_],
    formatNumber: Requireable[_],
    formatPlural: Requireable[_],
    formatRelative: Requireable[_],
    formatTime: Requireable[_]
  ): IntlFormat = {
    val __obj = js.Dynamic.literal(formatDate = formatDate, formatHTMLMessage = formatHTMLMessage, formatMessage = formatMessage, formatNumber = formatNumber, formatPlural = formatPlural, formatRelative = formatRelative, formatTime = formatTime)
  
    __obj.asInstanceOf[IntlFormat]
  }
}

