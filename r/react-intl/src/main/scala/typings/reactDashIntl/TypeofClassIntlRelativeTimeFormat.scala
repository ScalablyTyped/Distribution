package typings.reactDashIntl

import org.scalablytyped.runtime.Instantiable0
import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod.RelativeTimeLocaleData
import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassIntlRelativeTimeFormat extends Instantiable0[default] {
  var __localeData__ : Record[String, RelativeTimeLocaleData] = js.native
  var polyfilled: Boolean = js.native
  def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
  def supportedLocalesOf(locales: String): js.Array[js.UndefOr[String]] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[js.UndefOr[String]] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: String, opts: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: js.Array[String], opts: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
}

