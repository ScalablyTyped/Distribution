package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedIntl extends js.Object {
  var defaultFormats: js.Any = js.native
  var defaultLocale: java.lang.String = js.native
  var formats: js.Any = js.native
  var locale: java.lang.String = js.native
  var messages: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  def formatDate(value: DateSource): java.lang.String = js.native
  def formatDate(value: DateSource, options: reactDashIntlLib.ReactIntlNs.FormattedDateNs.PropsBase): java.lang.String = js.native
  def formatHTMLMessage(messageDescriptor: reactDashIntlLib.ReactIntlNs.FormattedMessageNs.MessageDescriptor): java.lang.String = js.native
  def formatHTMLMessage(
    messageDescriptor: reactDashIntlLib.ReactIntlNs.FormattedMessageNs.MessageDescriptor,
    values: ScalablyTyped.runtime.StringDictionary[MessageValue]
  ): java.lang.String = js.native
  def formatMessage(messageDescriptor: reactDashIntlLib.ReactIntlNs.FormattedMessageNs.MessageDescriptor): java.lang.String = js.native
  def formatMessage(
    messageDescriptor: reactDashIntlLib.ReactIntlNs.FormattedMessageNs.MessageDescriptor,
    values: ScalablyTyped.runtime.StringDictionary[MessageValue]
  ): java.lang.String = js.native
  def formatNumber(value: scala.Double): java.lang.String = js.native
  def formatNumber(value: scala.Double, options: reactDashIntlLib.ReactIntlNs.FormattedNumberNs.PropsBase): java.lang.String = js.native
  def formatPlural(value: scala.Double): reactDashIntlLib.reactDashIntlLibStrings.other | reactDashIntlLib.reactDashIntlLibStrings.zero | reactDashIntlLib.reactDashIntlLibStrings.one | reactDashIntlLib.reactDashIntlLibStrings.two | reactDashIntlLib.reactDashIntlLibStrings.few | reactDashIntlLib.reactDashIntlLibStrings.many = js.native
  def formatPlural(value: scala.Double, options: reactDashIntlLib.ReactIntlNs.FormattedPluralNs.Base): reactDashIntlLib.reactDashIntlLibStrings.other | reactDashIntlLib.reactDashIntlLibStrings.zero | reactDashIntlLib.reactDashIntlLibStrings.one | reactDashIntlLib.reactDashIntlLibStrings.two | reactDashIntlLib.reactDashIntlLibStrings.few | reactDashIntlLib.reactDashIntlLibStrings.many = js.native
  def formatRelative(value: DateSource): java.lang.String = js.native
  def formatRelative(
    value: DateSource,
    options: reactDashIntlLib.ReactIntlNs.FormattedRelativeNs.PropsBase with reactDashIntlLib.Anon_Now
  ): java.lang.String = js.native
  def formatTime(value: DateSource): java.lang.String = js.native
  def formatTime(value: DateSource, options: reactDashIntlLib.ReactIntlNs.FormattedTimeNs.PropsBase): java.lang.String = js.native
  def now(): scala.Double = js.native
}

