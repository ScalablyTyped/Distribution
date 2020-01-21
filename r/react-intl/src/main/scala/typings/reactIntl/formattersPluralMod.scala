package typings.reactIntl

import typings.reactIntl.reactIntlStrings.locale
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.typesMod.IntlConfig
import typings.std.ConstructorParameters
import typings.std.Intl.PluralRules
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/plural", JSImport.Namespace)
@js.native
object formattersPluralMod extends js.Object {
  def formatPlural(
    hasLocaleOnError: Pick[IntlConfig, locale | onError],
    getPluralRules: js.Function1[
      /* args */ ConstructorParameters[AnonLocalesOptionsSupportedLocalesOf], 
      PluralRules
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts ? : react-intl.react-intl/lib/types.FormatPluralOptions): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): String = js.native
  def formatPlural(
    hasLocaleOnError: Pick[IntlConfig, locale | onError],
    getPluralRules: js.Function1[
      /* args */ ConstructorParameters[AnonLocalesOptionsSupportedLocalesOf], 
      PluralRules
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts ? : react-intl.react-intl/lib/types.FormatPluralOptions): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts ? : react-intl.react-intl/lib/types.FormatPluralOptions): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): String = js.native
}

