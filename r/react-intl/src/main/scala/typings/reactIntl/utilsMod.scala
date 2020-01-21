package typings.reactIntl

import typings.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions
import typings.reactIntl.reactIntlStrings.defaultFormats
import typings.reactIntl.reactIntlStrings.defaultLocale
import typings.reactIntl.reactIntlStrings.formats
import typings.reactIntl.reactIntlStrings.messages
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.reactIntlStrings.relative
import typings.reactIntl.reactIntlStrings.textComponent
import typings.reactIntl.reactIntlStrings.timeZone
import typings.reactIntl.typesMod.CustomFormats
import typings.reactIntl.typesMod.Formatters
import typings.reactIntl.typesMod.IntlCache
import typings.reactIntl.typesMod.IntlConfig
import typings.std.Error
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val DEFAULT_INTL_CONFIG: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  def createError(message: String): String = js.native
  def createError(message: String, exception: Error): String = js.native
  def createFormatters(): Formatters = js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  def createIntlCache(): IntlCache = js.native
  def defaultErrorHandler(error: String): Unit = js.native
  def escape(str: String): String = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_relative(
    formats: CustomFormats,
    `type`: relative,
    name: String,
    onError: js.Function1[/* err */ String, Unit]
  ): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  def invariantIntlContext(): /* asserts intl */ Boolean = js.native
  def invariantIntlContext(intl: js.Any): /* asserts intl */ Boolean = js.native
}

