package typings
package reactDashDatagridLib.reactDashDatagridMod.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationToolbarProps extends js.Object {
  var iconProps: reactDashDatagridLib.Anon_DisabledStyle
  var iconSize: scala.Double
  /**
    * Available page sizes.
    */
  var pageSizes: js.Array[scala.Double]
  /**
    * Hide/show page sizes.
    */
  var showPageSize: scala.Boolean
  /**
    * Customize icons.
    */
  var showRefreshIcon: scala.Boolean
}

object PaginationToolbarProps {
  @scala.inline
  def apply(
    iconProps: reactDashDatagridLib.Anon_DisabledStyle,
    iconSize: scala.Double,
    pageSizes: js.Array[scala.Double],
    showPageSize: scala.Boolean,
    showRefreshIcon: scala.Boolean
  ): PaginationToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconProps")(iconProps)
    __obj.updateDynamic("iconSize")(iconSize)
    __obj.updateDynamic("pageSizes")(pageSizes)
    __obj.updateDynamic("showPageSize")(showPageSize)
    __obj.updateDynamic("showRefreshIcon")(showRefreshIcon)
    __obj.asInstanceOf[PaginationToolbarProps]
  }
}

