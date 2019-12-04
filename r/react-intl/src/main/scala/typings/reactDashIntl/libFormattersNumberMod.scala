package typings.reactDashIntl

import typings.reactDashIntl.libTypesMod.IntlConfig
import typings.reactDashIntl.reactDashIntlStrings.formats
import typings.reactDashIntl.reactDashIntlStrings.locale
import typings.reactDashIntl.reactDashIntlStrings.onError
import typings.std.ConstructorParameters
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatPart
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/number", JSImport.Namespace)
@js.native
object libFormattersNumberMod extends js.Object {
  def formatNumber(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[Anon_LocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): String = js.native
  def formatNumber(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[Anon_LocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): String = js.native
  def formatNumberToParts(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[Anon_LocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  def formatNumberToParts(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[Anon_LocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  def getFormatter(
    hasLocaleFormatsOnError: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[Anon_LocalesOptions], NumberFormat]
  ): NumberFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnError: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[Anon_LocalesOptions], NumberFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): NumberFormat = js.native
}

