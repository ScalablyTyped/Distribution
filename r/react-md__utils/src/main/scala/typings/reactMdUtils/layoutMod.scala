package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.Provider
import typings.react.mod.RefAttributes
import typings.reactMdUtils.gridCellMod.GridCellProps
import typings.reactMdUtils.gridListCellMod.GridListCellProps
import typings.reactMdUtils.gridListMod.GridListProps
import typings.reactMdUtils.gridMod.GridProps
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.reactMdUtils.useGridListMod.GridListSize
import typings.reactMdUtils.useGridListMod.UseGridListOptions
import typings.reactMdUtils.useGridListMod.UseGridListReturnValue
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/layout", JSImport.Namespace)
@js.native
object layoutMod extends js.Object {
  
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  val Grid: ForwardRefExoticComponent[GridProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridCell: ForwardRefExoticComponent[GridCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridList: ForwardRefExoticComponent[GridListProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridListCell: ForwardRefExoticComponent[GridListCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  val GridListSizeProvider: Provider[GridListSize] = js.native
  
  def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = js.native
  def useGridList[E /* <: HTMLElement */](
    hasRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = js.native
  
  def useGridListSize(): GridListSize = js.native
}
