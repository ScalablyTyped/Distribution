package typings.reactDashIntl

import typings.intlDashMessageformat.intlDashMessageformatMod.PrimitiveType
import typings.react.reactMod.ReactNode
import typings.reactDashIntl.libTypesMod.Formatters
import typings.reactDashIntl.libTypesMod.IntlConfig
import typings.reactDashIntl.libTypesMod.MessageDescriptor
import typings.reactDashIntl.reactDashIntlStrings.defaultFormats
import typings.reactDashIntl.reactDashIntlStrings.defaultLocale
import typings.reactDashIntl.reactDashIntlStrings.formats
import typings.reactDashIntl.reactDashIntlStrings.locale
import typings.reactDashIntl.reactDashIntlStrings.messages
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/message", JSImport.Namespace)
@js.native
object libFormattersMessageMod extends js.Object {
  def formatHTMLMessage(
    config: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters
  ): ReactNode = js.native
  def formatHTMLMessage(
    config: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): ReactNode = js.native
  def formatHTMLMessage(
    config: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    rawValues: Record[String, PrimitiveType]
  ): ReactNode = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType]
  ): String = js.native
}

