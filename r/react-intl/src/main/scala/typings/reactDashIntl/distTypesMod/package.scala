package typings.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
  import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
  import typings.std.Exclude
  import typings.std.IntlNs.DateTimeFormatOptions
  import typings.std.IntlNs.NumberFormatOptions
  import typings.std.IntlNs.PluralRulesOptions
  import typings.std.Pick

  type FormatDateOptions = (Exclude[DateTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatNumberOptions = (Exclude[NumberFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatPluralOptions = (Exclude[PluralRulesOptions, localeMatcher]) with CustomFormatConfig
  type FormatRelativeTimeOptions = (Exclude[IntlRelativeTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
