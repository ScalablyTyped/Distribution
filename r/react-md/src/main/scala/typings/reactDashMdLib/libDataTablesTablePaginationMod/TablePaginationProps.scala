package typings
package reactDashMdLib.libDataTablesTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TablePaginationProps
  extends reactDashMdLib.libMod.Props {
  var decrementIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
     * @deprecated
     */
  var decrementIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * @deprecated
     */
  var decrementIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var decrementId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var defaultPage: js.UndefOr[scala.Double] = js.undefined
  var defaultRowsPerPage: js.UndefOr[scala.Double] = js.undefined
  var id: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var incrementIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
     * @deprecated
     */
  var incrementIconChildren: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * @deprecated
     */
  var incrementIconClassName: js.UndefOr[java.lang.String] = js.undefined
  var incrementId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var rows: scala.Double
  var rowsPerPage: js.UndefOr[scala.Double] = js.undefined
  var rowsPerPageItems: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var rowsPerPageLabel: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var selectFieldClassName: js.UndefOr[java.lang.String] = js.undefined
  var selectFieldInputClassName: js.UndefOr[java.lang.String] = js.undefined
  var selectFieldInputStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var selectFieldStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var simplifiedMenu: js.UndefOr[scala.Boolean] = js.undefined
  def onPagination(startIndex: scala.Double, rowsPerPage: scala.Double, currentPage: scala.Double): scala.Unit
}

