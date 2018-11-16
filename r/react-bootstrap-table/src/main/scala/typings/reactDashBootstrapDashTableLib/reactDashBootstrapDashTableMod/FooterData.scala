package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

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
  var columnIndex: scala.Double
  /**
  	 * Formatting function for the data in this footer. Used to be able to do things like sum the contents of this
  	 * column in the table so that the footer can be used for totals, etc.
  	 *
  	 * The output value from the formatter function will be used instead of the label if the formatter function is
  	 * defined.
  	 */
  var formatter: js.UndefOr[
    js.Function1[
      /* tableData */ js.Array[_], 
      java.lang.String | scala.Double | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Title to display for the column footer
  	 */
  var label: java.lang.String
}

