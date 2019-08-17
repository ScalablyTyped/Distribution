package typings.reactDashIntl

import org.scalablytyped.runtime.Instantiable1
import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.atFormatjsIntlDashRelativetimeformat.distTypesMod.LocaleData
import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassIntlRelativeTimeFormat
  extends Instantiable1[
      /* hasLocalesOptions */ js.Tuple2[js.UndefOr[String | js.Array[String]], js.UndefOr[IntlRelativeTimeFormatOptions]], 
      default
    ] {
  var __languageAliases__ : Record[String, String] = js.native
  var __localeData__ : Record[String, LocaleData] = js.native
  var polyfilled: Boolean = js.native
  def __addLocaleData(data: LocaleData*): Unit = js.native
  def __setLanguageAliases(aliases: Record[String, String]): Unit = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: String, __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
  @JSName("supportedLocalesOf")
  def supportedLocalesOf_localeMatcher(locales: js.Array[String], __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
}

