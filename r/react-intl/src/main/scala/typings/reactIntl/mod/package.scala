package typings.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatDateOptions = (typings.std.Exclude[
    typings.std.Intl.DateTimeFormatOptions, 
    typings.reactIntl.reactIntlStrings.localeMatcher
  ]) with typings.reactIntl.mod.CustomFormatConfig
  type FormatDisplayNameOptions = typings.std.Exclude[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNamesOptions */ js.Any, 
    typings.reactIntl.reactIntlStrings.localeMatcher
  ]
  type FormatNumberOptions = (typings.std.Exclude[
    typings.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions, 
    typings.reactIntl.reactIntlStrings.localeMatcher
  ]) with typings.reactIntl.mod.CustomFormatConfig
  type FormatPluralOptions = (typings.std.Exclude[
    typings.std.Intl.PluralRulesOptions, 
    typings.reactIntl.reactIntlStrings.localeMatcher
  ]) with typings.reactIntl.mod.CustomFormatConfig
  type FormatRelativeTimeOptions = (typings.std.Exclude[
    typings.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions, 
    typings.reactIntl.reactIntlStrings.localeMatcher
  ]) with typings.reactIntl.mod.CustomFormatConfig
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type WithIntlProps[P] = (typings.reactIntl.mod.Omit[P, typings.reactIntl.reactIntlStrings.intl]) with typings.reactIntl.anon.ForwardedRef
  type WrappedComponentProps[IntlPropName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl.IntlShape}
    */ typings.reactIntl.reactIntlStrings.WrappedComponentProps with org.scalablytyped.runtime.TopLevel[js.Any]
}
