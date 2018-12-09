package typings
package reactDashToolboxLib.libTableTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TableProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * If true, the header and each row will display a checkbox to allow the user to select multiple rows.
     * @default true
     */
  var multiSelectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Will be called when the row selection changes. It passes an array of selected indexes as first parameter so you can figure out changes in your local state.
     */
  var onRowSelect: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * If true, each row will display a checkbox to allow the user to select that one row.
     * @default true
     */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[TableTheme] = js.undefined
}

