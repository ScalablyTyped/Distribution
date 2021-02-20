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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @JSImport("@react-md/utils/types/layout", "CELL_MARGIN_VAR")
  @js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "CELL_SIZE_VAR")
  @js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout", "GRID_COLUMNS_VAR")
  @js.native
  val GRID_COLUMNS_VAR: /* "--rmd-grid-cols" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "GRID_GUTTER_VAR")
  @js.native
  val GRID_GUTTER_VAR: /* "--rmd-grid-gutter" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout", "Grid")
  @js.native
  val Grid: ForwardRefExoticComponent[GridProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridCell")
  @js.native
  val GridCell: ForwardRefExoticComponent[GridCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridList")
  @js.native
  val GridList: ForwardRefExoticComponent[GridListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridListCell")
  @js.native
  val GridListCell: ForwardRefExoticComponent[GridListCellProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/utils/types/layout", "GridListSizeProvider")
  @js.native
  val GridListSizeProvider: Provider[GridListSize] = js.native
  
  @JSImport("@react-md/utils/types/layout", "useGridList")
  @js.native
  def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = js.native
  @JSImport("@react-md/utils/types/layout", "useGridList")
  @js.native
  def useGridList[E /* <: HTMLElement */](
    hasRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = js.native
  
  @JSImport("@react-md/utils/types/layout", "useGridListSize")
  @js.native
  def useGridListSize(): GridListSize = js.native
}
