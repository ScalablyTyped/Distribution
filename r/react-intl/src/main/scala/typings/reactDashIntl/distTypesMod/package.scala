package typings.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
  import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.IntlRelativeTimeFormatOptions
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions
  import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
  import typings.std.Exclude
  import typings.std.Intl.DateTimeFormatOptions
  import typings.std.Intl.PluralRulesOptions
  import typings.std.Pick

  type FormatDateOptions = (Exclude[DateTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatListOptions = Exclude[IntlListFormatOptions, localeMatcher]
  type FormatNumberOptions = (Exclude[UnifiedNumberFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatPluralOptions = (Exclude[PluralRulesOptions, localeMatcher]) with CustomFormatConfig
  type FormatRelativeTimeOptions = (Exclude[IntlRelativeTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
