package typings.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.distCoreMod.UnifiedNumberFormatOptions
  import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
  import typings.std.Exclude
  import typings.std.Intl.DateTimeFormatOptions
  import typings.std.Intl.PluralRulesOptions
  import typings.std.Pick

  type FormatDateOptions = (Exclude[DateTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatNumberOptions = (Exclude[UnifiedNumberFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatPluralOptions = (Exclude[PluralRulesOptions, localeMatcher]) with CustomFormatConfig
  type FormatRelativeTimeOptions = (Exclude[IntlRelativeTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
