package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlFormat extends js.Object {
  var formatDate: reactLib.reactMod.Requireable[_]
  var formatHTMLMessage: reactLib.reactMod.Requireable[_]
  var formatMessage: reactLib.reactMod.Requireable[_]
  var formatNumber: reactLib.reactMod.Requireable[_]
  var formatPlural: reactLib.reactMod.Requireable[_]
  var formatRelative: reactLib.reactMod.Requireable[_]
  var formatTime: reactLib.reactMod.Requireable[_]
}

object IntlFormat {
  @scala.inline
  def apply(
    formatDate: reactLib.reactMod.Requireable[_],
    formatHTMLMessage: reactLib.reactMod.Requireable[_],
    formatMessage: reactLib.reactMod.Requireable[_],
    formatNumber: reactLib.reactMod.Requireable[_],
    formatPlural: reactLib.reactMod.Requireable[_],
    formatRelative: reactLib.reactMod.Requireable[_],
    formatTime: reactLib.reactMod.Requireable[_]
  ): IntlFormat = {
    val __obj = js.Dynamic.literal(formatDate = formatDate, formatHTMLMessage = formatHTMLMessage, formatMessage = formatMessage, formatNumber = formatNumber, formatPlural = formatPlural, formatRelative = formatRelative, formatTime = formatTime)
  
    __obj.asInstanceOf[IntlFormat]
  }
}

