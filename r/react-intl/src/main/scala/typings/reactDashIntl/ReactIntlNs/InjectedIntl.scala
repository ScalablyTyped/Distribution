package typings.reactDashIntl.ReactIntlNs

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashIntl.Anon_Now
import typings.reactDashIntl.ReactIntlNs.FormattedDateNs.PropsBase
import typings.reactDashIntl.ReactIntlNs.FormattedMessageNs.MessageDescriptor
import typings.reactDashIntl.ReactIntlNs.FormattedPluralNs.Base
import typings.reactDashIntl.reactDashIntlStrings.few
import typings.reactDashIntl.reactDashIntlStrings.many
import typings.reactDashIntl.reactDashIntlStrings.one
import typings.reactDashIntl.reactDashIntlStrings.other
import typings.reactDashIntl.reactDashIntlStrings.two
import typings.reactDashIntl.reactDashIntlStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectedIntl extends js.Object {
  var defaultFormats: js.Any = js.native
  var defaultLocale: String = js.native
  var formats: js.Any = js.native
  var locale: String = js.native
  var messages: StringDictionary[String] = js.native
  def formatDate(value: DateSource): String = js.native
  def formatDate(value: DateSource, options: PropsBase): String = js.native
  def formatHTMLMessage(messageDescriptor: MessageDescriptor): String = js.native
  def formatHTMLMessage(messageDescriptor: MessageDescriptor, values: StringDictionary[MessageValue]): String = js.native
  def formatMessage(messageDescriptor: MessageDescriptor): String = js.native
  def formatMessage(messageDescriptor: MessageDescriptor, values: StringDictionary[MessageValue]): String = js.native
  def formatNumber(value: Double): String = js.native
  def formatNumber(value: Double, options: typings.reactDashIntl.ReactIntlNs.FormattedNumberNs.PropsBase): String = js.native
  def formatPlural(value: Double): other | zero | one | two | few | many = js.native
  def formatPlural(value: Double, options: Base): other | zero | one | two | few | many = js.native
  def formatRelative(value: DateSource): String = js.native
  def formatRelative(
    value: DateSource,
    options: typings.reactDashIntl.ReactIntlNs.FormattedRelativeNs.PropsBase with Anon_Now
  ): String = js.native
  def formatTime(value: DateSource): String = js.native
  def formatTime(value: DateSource, options: typings.reactDashIntl.ReactIntlNs.FormattedTimeNs.PropsBase): String = js.native
  def now(): Double = js.native
  def onError(error: String): Unit = js.native
}

