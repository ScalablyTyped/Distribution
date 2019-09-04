package typings.reactDashIntl.distUtilsMod

import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.reactDashIntl.Anon_00
import typings.reactDashIntl.distTypesMod.CustomFormats
import typings.reactDashIntl.distTypesMod.IntlCache
import typings.reactDashIntl.distTypesMod.IntlConfig
import typings.reactDashIntl.reactDashIntlStrings.defaultFormats
import typings.reactDashIntl.reactDashIntlStrings.defaultLocale
import typings.reactDashIntl.reactDashIntlStrings.formats
import typings.reactDashIntl.reactDashIntlStrings.messages
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.reactDashIntl.reactDashIntlStrings.relative
import typings.reactDashIntl.reactDashIntlStrings.textComponent
import typings.reactDashIntl.reactDashIntlStrings.timeZone
import typings.std.Error
import typings.std.IntlNs.DateTimeFormatOptions
import typings.std.IntlNs.NumberFormatOptions
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_INTL_CONFIG: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  def createError(message: String): String = js.native
  def createError(message: String, exception: Error): String = js.native
  def createFormatters(): Anon_00 = js.native
  def createFormatters(cache: IntlCache): Anon_00 = js.native
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
  def invariantIntlContext(): Unit = js.native
  def invariantIntlContext(intl: js.Any): Unit = js.native
}

