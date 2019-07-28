package typings.saveDashCsv.saveDashCsvMod

import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveCsvProps extends js.Object {
  var bom: js.UndefOr[Boolean] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var filename: String
  var formatter: js.UndefOr[js.Function1[/* value */ String | JSON, Unit]] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var sep: js.UndefOr[String] = js.undefined
}

object SaveCsvProps {
  @scala.inline
  def apply(
    filename: String,
    bom: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    formatter: /* value */ String | JSON => Unit = null,
    mime: String = null,
    quote: String = null,
    sep: String = null
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

