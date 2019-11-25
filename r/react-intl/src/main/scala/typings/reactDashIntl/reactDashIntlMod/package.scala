package typings.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashIntlMod {
  import typings.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
  import typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.IntlRelativeTimeFormatOptions
  import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions
  import typings.reactDashIntl.Anon_ForwardedRef
  import typings.reactDashIntl.reactDashIntlStrings.defaultFormats
  import typings.reactDashIntl.reactDashIntlStrings.defaultLocale
  import typings.reactDashIntl.reactDashIntlStrings.formats
  import typings.reactDashIntl.reactDashIntlStrings.localeMatcher
  import typings.reactDashIntl.reactDashIntlStrings.messages
  import typings.reactDashIntl.reactDashIntlStrings.onError
  import typings.reactDashIntl.reactDashIntlStrings.textComponent
  import typings.reactDashIntl.reactDashIntlStrings.timeZone
  import typings.std.Exclude
  import typings.std.Intl.DateTimeFormatOptions
  import typings.std.Intl.PluralRulesOptions
  import typings.std.Partial
  import typings.std.Pick

  type FormatDateOptions = (Exclude[DateTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatListOptions = Exclude[IntlListFormatOptions, localeMatcher]
  type FormatNumberOptions = (Exclude[UnifiedNumberFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatPluralOptions = (Exclude[PluralRulesOptions, localeMatcher]) with CustomFormatConfig
  type FormatRelativeTimeOptions = (Exclude[IntlRelativeTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type OptionalIntlConfig = (Omit[IntlConfig, String]) with (Partial[
    Pick[
      IntlConfig, 
      formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
    ]
  ])
  type WithIntlProps[P] = (Omit[P, String]) with Anon_ForwardedRef
  type WrappedComponentProps[IntlPropName /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl.IntlShape}
    */ typings.reactDashIntl.reactDashIntlStrings.WrappedComponentProps with js.Any
}
