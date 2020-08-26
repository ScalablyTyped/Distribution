package typings.reactDatagrid.mod.ReactDataGrid

import typings.reactDatagrid.anon.DisabledStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationToolbarProps extends js.Object {
  var iconProps: DisabledStyle = js.native
  var iconSize: Double = js.native
  /**
    * Available page sizes.
    */
  var pageSizes: js.Array[Double] = js.native
  /**
    * Hide/show page sizes.
    */
  var showPageSize: Boolean = js.native
  /**
    * Customize icons.
    */
  var showRefreshIcon: Boolean = js.native
}

object PaginationToolbarProps {
  @scala.inline
  def apply(
    iconProps: DisabledStyle,
    iconSize: Double,
    pageSizes: js.Array[Double],
    showPageSize: Boolean,
    showRefreshIcon: Boolean
  ): PaginationToolbarProps = {
    val __obj = js.Dynamic.literal(iconProps = iconProps.asInstanceOf[js.Any], iconSize = iconSize.asInstanceOf[js.Any], pageSizes = pageSizes.asInstanceOf[js.Any], showPageSize = showPageSize.asInstanceOf[js.Any], showRefreshIcon = showRefreshIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationToolbarProps]
  }
  @scala.inline
  implicit class PaginationToolbarPropsOps[Self <: PaginationToolbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIconProps(value: DisabledStyle): Self = this.set("iconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSizesVarargs(value: Double*): Self = this.set("pageSizes", js.Array(value :_*))
    @scala.inline
    def setPageSizes(value: js.Array[Double]): Self = this.set("pageSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowPageSize(value: Boolean): Self = this.set("showPageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRefreshIcon(value: Boolean): Self = this.set("showRefreshIcon", value.asInstanceOf[js.Any])
  }
  
}

