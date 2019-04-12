package typings
package saveDashCsvLib.saveDashCsvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveCsvProps extends js.Object {
  var bom: js.UndefOr[scala.Boolean] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var filename: java.lang.String
  var formatter: js.UndefOr[js.Function1[/* value */ java.lang.String | stdLib.JSON, scala.Unit]] = js.undefined
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var quote: js.UndefOr[java.lang.String] = js.undefined
  var sep: js.UndefOr[java.lang.String] = js.undefined
}

object SaveCsvProps {
  @scala.inline
  def apply(
    filename: java.lang.String,
    bom: js.UndefOr[scala.Boolean] = js.undefined,
    eol: java.lang.String = null,
    formatter: /* value */ java.lang.String | stdLib.JSON => scala.Unit = null,
    mime: java.lang.String = null,
    quote: java.lang.String = null,
    sep: java.lang.String = null
  ): SaveCsvProps = {
    val __obj = js.Dynamic.literal(filename = filename)
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (sep != null) __obj.updateDynamic("sep")(sep)
    __obj.asInstanceOf[SaveCsvProps]
  }
}

