package typings
package reactDashToolboxLib.libTableTableRowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableRowProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * The index of the row.
     */
  var idx: js.UndefOr[scala.Double] = js.undefined
  /**
     * Handle the select state change of the checkbox in the ow.
     */
  var onSelect: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * If true, each row will display a checkbox to allow the user to select that one row.
     * @default true
     */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the row will be considered as selected so the row will display a selected style with the selection control activated. This property is used by `Table` to figure out the selection when you interact with the Table.
     */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[TableRowTheme] = js.undefined
}

