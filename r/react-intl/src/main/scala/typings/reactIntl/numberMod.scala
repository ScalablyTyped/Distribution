package typings.reactIntl

import typings.reactIntl.reactIntlStrings.formats
import typings.reactIntl.reactIntlStrings.locale
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.typesMod.IntlConfig
import typings.std.ConstructorParameters
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatPart
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/number", JSImport.Namespace)
@js.native
object numberMod extends js.Object {
  def formatNumber(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonLocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): String = js.native
  def formatNumber(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonLocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): String = js.native
  def formatNumberToParts(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonLocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  def formatNumberToParts(
    config: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonLocalesOptions], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  def getFormatter(
    hasLocaleFormatsOnError: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonLocalesOptions], NumberFormat]
  ): NumberFormat = js.native
  def getFormatter(
    hasLocaleFormatsOnError: Pick[IntlConfig, locale | formats | onError],
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[AnonLocalesOptions], NumberFormat],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts ? : react-intl.react-intl/lib/types.FormatNumberOptions): string>[1] */ js.Any
  ): NumberFormat = js.native
}

