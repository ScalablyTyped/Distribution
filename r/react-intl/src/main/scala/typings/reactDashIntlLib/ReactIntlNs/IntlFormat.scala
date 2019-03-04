package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlFormat extends js.Object {
  var formatDate: reactLib.reactMod.ReactNs.Requireable[_]
  var formatHTMLMessage: reactLib.reactMod.ReactNs.Requireable[_]
  var formatMessage: reactLib.reactMod.ReactNs.Requireable[_]
  var formatNumber: reactLib.reactMod.ReactNs.Requireable[_]
  var formatPlural: reactLib.reactMod.ReactNs.Requireable[_]
  var formatRelative: reactLib.reactMod.ReactNs.Requireable[_]
  var formatTime: reactLib.reactMod.ReactNs.Requireable[_]
}

object IntlFormat {
  @scala.inline
  def apply(
    formatDate: reactLib.reactMod.ReactNs.Requireable[_],
    formatHTMLMessage: reactLib.reactMod.ReactNs.Requireable[_],
    formatMessage: reactLib.reactMod.ReactNs.Requireable[_],
    formatNumber: reactLib.reactMod.ReactNs.Requireable[_],
    formatPlural: reactLib.reactMod.ReactNs.Requireable[_],
    formatRelative: reactLib.reactMod.ReactNs.Requireable[_],
    formatTime: reactLib.reactMod.ReactNs.Requireable[_]
  ): IntlFormat = {
    val __obj = js.Dynamic.literal(formatDate = formatDate, formatHTMLMessage = formatHTMLMessage, formatMessage = formatMessage, formatNumber = formatNumber, formatPlural = formatPlural, formatRelative = formatRelative, formatTime = formatTime)
  
    __obj.asInstanceOf[IntlFormat]
  }
}

