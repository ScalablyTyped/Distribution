package typings.reactDashIntl.distUtilsMod.Global

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

@JSGlobal("Intl")
@js.native
object IntlNs extends js.Object {
  @js.native
  class RelativeTimeFormat protected () extends default {
    def this(/* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param hasLocalesOptions because its type [string | Array<string> | undefined, IntlRelativeTimeFormatOptions | undefined] is not an array type */ hasLocalesOptions: js.Tuple2[js.UndefOr[String | js.Array[String]], js.UndefOr[IntlRelativeTimeFormatOptions]]) = this()
  }
  
  @js.native
  object RelativeTimeFormat
    extends Instantiable1[
          /* hasLocalesOptions */ js.Tuple2[js.UndefOr[String | js.Array[String]], js.UndefOr[IntlRelativeTimeFormatOptions]], 
          default
        ] {
    var __languageAliases__ : Record[String, String] = js.native
    var __localeData__ : Record[String, LocaleData] = js.native
    var polyfilled: Boolean = js.native
    def __addLocaleData(data: LocaleData*): Unit = js.native
    def __setLanguageAliases(aliases: Record[String, String]): Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[js.UndefOr[String]] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[js.UndefOr[String]] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
  }
  
}

