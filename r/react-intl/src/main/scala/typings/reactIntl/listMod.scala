package typings.reactIntl

import typings.formatjsIntlListformat.mod.default
import typings.std.ConstructorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/list", JSImport.Namespace)
@js.native
object listMod extends js.Object {
  @JSName("formatList")
  def formatList_1(
    hasLocaleOnError: PickIntlConfiglocaleonErr,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.FnCall>[1] */ js.Any
  ): String = js.native
}

