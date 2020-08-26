package typings.reactMdUtils.gridMod

import typings.react.mod.HTMLAttributes
import typings.reactMdUtils.reactMdUtilsStrings.`max-content`
import typings.reactMdUtils.reactMdUtilsStrings.`min-content`
import typings.reactMdUtils.reactMdUtilsStrings.auto
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * Boolean if the `children` should be updated to be wrapped in the `GridCell`
    * component and clone the `className` into each child automatically. This is
    * really just a convenience prop so you don't always need to import both the
    * `Grid` and `GridCell` components to create a grid.
    */
  @JSName("clone")
  var clone_FGridProps: js.UndefOr[Boolean] = js.native
  /**
    * An optional number of columns to apply for all media types. Providing one
    * of the media-spcific column props will override this value for those
    * breakpoints still.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * An optional number of columns to display for desktop screens.
    */
  var desktopColumns: js.UndefOr[Double] = js.native
  /**
    * This will override the default grid cell's gutter value (the space between
    * each cell). This **needs to be a number with a unit** since it is set to a
    * css variable. Examples:
    *
    * - `1rem`
    * - `16px`
    * - `1em`
    * - `5%`
    */
  var gutter: js.UndefOr[String] = js.native
  /**
    * An optional number of columns to display for large desktop screens.
    */
  var largeDesktopColumns: js.UndefOr[Double] = js.native
  /**
    * This prop allows you to generate your grid with a dynamic amount of columns
    * instead of a static size. This will update the grid to ignore all the
    * `columns` props and update the grid to show as many columns as possible by
    * updating the `grid-template-columns` style to be:
    *
    * ```scss
    * grid-template-columns: repeat(auto-fill, minmax($min-cell-width, 1fr));
    * ```
    *
    * This **needs to be a number with a unit**. Check out the documentation on
    * the `minmax` css function for some more info.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/CSS/minmax
    */
  var minCellWidth: js.UndefOr[`min-content` | `max-content` | auto | String] = js.native
  /**
    * This is really just a pass-through of the `style` prop that allows you to
    * quickly update the base padding for the grid.
    */
  var padding: js.UndefOr[Double | String] = js.native
  /**
    * An optional number of columns to display for phones.
    */
  var phoneColumns: js.UndefOr[Double] = js.native
  /**
    * An optional number of columns to display for tablets.
    */
  var tabletColumns: js.UndefOr[Double] = js.native
  /**
    * Boolean if the `children` should be updated to be wrapped in the `GridCell`
    * component.  This is really just a convenience prop so you don't always need
    * to import both the `Grid` and `GridCell` components to create a grid/
    */
  var wrapOnly: js.UndefOr[Boolean] = js.native
}

object GridProps {
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setDesktopColumns(value: Double): Self = this.set("desktopColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopColumns: Self = this.set("desktopColumns", js.undefined)
    @scala.inline
    def setGutter(value: String): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGutter: Self = this.set("gutter", js.undefined)
    @scala.inline
    def setLargeDesktopColumns(value: Double): Self = this.set("largeDesktopColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeDesktopColumns: Self = this.set("largeDesktopColumns", js.undefined)
    @scala.inline
    def setMinCellWidth(value: `min-content` | `max-content` | auto | String): Self = this.set("minCellWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCellWidth: Self = this.set("minCellWidth", js.undefined)
    @scala.inline
    def setPadding(value: Double | String): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPhoneColumns(value: Double): Self = this.set("phoneColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneColumns: Self = this.set("phoneColumns", js.undefined)
    @scala.inline
    def setTabletColumns(value: Double): Self = this.set("tabletColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabletColumns: Self = this.set("tabletColumns", js.undefined)
    @scala.inline
    def setWrapOnly(value: Boolean): Self = this.set("wrapOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapOnly: Self = this.set("wrapOnly", js.undefined)
  }
  
}

