package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterData extends js.Object {
  /**
  	 * Text alignment for the data in this footer.
  	 */
  var align: js.UndefOr[DataAlignType] = js.undefined
  /**
  	 * Index for the column that this footer belongs to
  	 */
  var columnIndex: Double
  /**
  	 * Formatting function for the data in this footer. Used to be able to do things like sum the contents of this
  	 * column in the table so that the footer can be used for totals, etc.
  	 *
  	 * The output value from the formatter function will be used instead of the label if the formatter function is
  	 * defined.
  	 */
  var formatter: js.UndefOr[js.Function1[/* tableData */ js.Array[_], String | Double | ReactElement]] = js.undefined
  /**
  	 * Title to display for the column footer
  	 */
  var label: String
}

object FooterData {
  @scala.inline
  def apply(
    columnIndex: Double,
    label: String,
    align: DataAlignType = null,
    formatter: /* tableData */ js.Array[_] => String | Double | ReactElement = null
  ): FooterData = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[FooterData]
  }
}

