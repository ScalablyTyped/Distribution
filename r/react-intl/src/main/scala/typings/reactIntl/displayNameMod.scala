package typings.reactIntl

import typings.reactIntl.reactIntlStrings.locale
import typings.reactIntl.reactIntlStrings.onError
import typings.reactIntl.typesMod.IntlConfig
import typings.std.ConstructorParameters
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/displayName", JSImport.Namespace)
@js.native
object displayNameMod extends js.Object {
  def formatDisplayName(
    hasLocaleOnError: Pick[IntlConfig, locale | onError],
    getDisplayNames: js.Function1[
      /* args */ ConstructorParameters[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
      ], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames */ _
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0], opts ? : react-intl.react-intl/lib/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any
  ): js.UndefOr[String] = js.native
  def formatDisplayName(
    hasLocaleOnError: Pick[IntlConfig, locale | onError],
    getDisplayNames: js.Function1[
      /* args */ ConstructorParameters[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisplayNames */ _
      ], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames */ _
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0], opts ? : react-intl.react-intl/lib/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNames * / any['of']>[0], opts ? : react-intl.react-intl/lib/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = js.native
}

