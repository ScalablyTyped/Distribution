package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdUtils.gridCellMod.GridCellProps
import typings.reactMdUtils.gridListCellMod.GridListCellProps
import typings.reactMdUtils.gridListMod.GridListProps
import typings.reactMdUtils.gridMod.GridProps
import typings.reactMdUtils.scrollbarSizeMod.SizingType
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  /**
    * The grid component is generally used for a base layout in your app to provide
    * nice padding and spacing between each item.
    *
    * Note: This component relies on the `AppSizeListener` as a parent component to
    * work and will throw an error if it does not exist as a parent.
    */
  val Grid: ForwardRefExoticComponent[GridProps with RefAttributes[HTMLDivElement]] = js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * The `GridList` component is a different way to render a list of data where
    * the number of columns is dynamic and based on the max-width for each cell.
    * Instead of setting a percentage width to each cell based on the number of
    * columns, this will dynamically add columns to fill up the remaining space and
    * have each cell grow up to a set max-width. A really good use-case for this is
    * displaying a list of images or thumbnails and allowing the user to see a full
    * screen preview once selected/clicked.
    */
  val GridList: ForwardRefExoticComponent[GridListProps with RefAttributes[HTMLDivElement]] = js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps with RefAttributes[HTMLDivElement]] = js.native
  def scrollbarSize(): Double = js.native
  def scrollbarSize(`type`: js.UndefOr[scala.Nothing], forced: Boolean): Double = js.native
  def scrollbarSize(`type`: SizingType): Double = js.native
  def scrollbarSize(`type`: SizingType, forced: Boolean): Double = js.native
}

