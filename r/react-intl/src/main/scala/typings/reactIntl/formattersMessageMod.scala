package typings.reactIntl

import typings.intlMessageformat.mod.PrimitiveType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactIntl.anon.PickIntlConfiglocaleformaDefaultFormats
import typings.reactIntl.typesMod.Formatters
import typings.reactIntl.typesMod.MessageDescriptor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/message", JSImport.Namespace)
@js.native
object formattersMessageMod extends js.Object {
  def formatHTMLMessage(config: PickIntlConfiglocaleformaDefaultFormats, state: Formatters): ReactNode = js.native
  def formatHTMLMessage(
    config: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): ReactNode = js.native
  def formatHTMLMessage(
    config: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    rawValues: Record[String, PrimitiveType]
  ): ReactNode = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType]
  ): String = js.native
  def prepareIntlMessageFormatHtmlOutput(chunks: js.Array[String | js.Object]): ReactElement = js.native
}

