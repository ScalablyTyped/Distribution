package typings
package reactDashToolboxLib.libTableTableHeadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableHeadProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * If true, a checkbox will be displayed to select every row. In case the table is not multi-selectable, it will be disabled though.
     * @default true
     */
  var displaySelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the header and each row will display a checkbox to allow the user to select multiple rows.
     * @default true
     */
  var multiSelectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Handle the select state change of the checkbox in the header row.
     */
  var onSelect: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * If true, each row will display a checkbox to allow the user to select that one row.
     * @default true
     */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If selectable, controls the selected state of the checkbox in the header row.
     */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[TableHeadTheme] = js.undefined
}

