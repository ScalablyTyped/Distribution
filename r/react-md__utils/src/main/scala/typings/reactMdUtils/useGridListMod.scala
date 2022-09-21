package typings.reactMdUtils

import typings.react.mod.Provider
import typings.react.mod.RefCallback
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useGridListMod {
  
  @JSImport("@react-md/utils/types/layout/useGridList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "CELL_MARGIN_VAR")
  @js.native
  val CELL_MARGIN_VAR: /* "--rmd-cell-margin" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "CELL_SIZE_VAR")
  @js.native
  val CELL_SIZE_VAR: /* "--rmd-cell-size" */ String = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "DEFAULT_GRID_LIST_MAX_CELL_SIZE")
  @js.native
  val DEFAULT_GRID_LIST_MAX_CELL_SIZE: /* 150 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "DEFAULT_GRID_LIST_PADDING")
  @js.native
  val DEFAULT_GRID_LIST_PADDING: /* 16 */ Double = js.native
  
  @JSImport("@react-md/utils/types/layout/useGridList", "GridListSizeProvider")
  @js.native
  val GridListSizeProvider: Provider[GridListSize] = js.native
  
  inline def useGridList[E /* <: HTMLElement */](): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")().asInstanceOf[UseGridListReturnValue[E]]
  inline def useGridList[E /* <: HTMLElement */](
    hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding: PropsWithRef[UseGridListOptions, E]
  ): UseGridListReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridList")(hasPropRefStyleClassNameCellMarginDefaultSizeMaxCellSizeDisableHeightDisableWidthContainerPadding.asInstanceOf[js.Any]).asInstanceOf[UseGridListReturnValue[E]]
  
  inline def useGridListSize(): GridListSize = ^.asInstanceOf[js.Dynamic].applyDynamic("useGridListSize")().asInstanceOf[GridListSize]
  
  @js.native
  trait CSSProperties
    extends StObject
       with typings.react.mod.CSSProperties
  
  trait GridListSize extends StObject {
    
    /**
      * The current width of each cell within the grid.
      */
    var cellWidth: Double
    
    /**
      * The current number of columns in the `GridList`.
      */
    var columns: Double
  }
  object GridListSize {
    
    inline def apply(cellWidth: Double, columns: Double): GridListSize = {
      val __obj = js.Dynamic.literal(cellWidth = cellWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridListSize]
    }
    
    extension [Self <: GridListSize](x: Self) {
      
      inline def setCellWidth(value: Double): Self = StObject.set(x, "cellWidth", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvidedGridListProps[E /* <: HTMLElement */] extends StObject {
    
    var className: String
    
    var ref: RefCallback[E | Null]
    
    var style: CSSProperties
  }
  object ProvidedGridListProps {
    
    inline def apply[E /* <: HTMLElement */](className: String, ref: /* instance */ (E | Null) | Null => Unit, style: CSSProperties): ProvidedGridListProps[E] = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedGridListProps[E]]
    }
    
    extension [Self <: ProvidedGridListProps[?], E /* <: HTMLElement */](x: Self & ProvidedGridListProps[E]) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setRef(value: /* instance */ (E | Null) | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseGridListOptions extends StObject {
    
    /**
      * An optional margin to apply to each cell as the `CELL_MARGIN_VAR` css
      * variable only when it is defined. This has to be a number string with a
      * `px`, `em`, `rem` or `%` suffix or else the grid will break.
      */
    var cellMargin: js.UndefOr[String] = js.undefined
    
    /**
      * An optional className to merge with the grid list class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * This is _normally_ the amount of padding on the grid list item itself to
      * subtract from the `offsetWidth` since `padding`, `border`, and vertical
      * scrollbars will be included.  If you add a border or change the padding or
      * add borders to this component, you'll need to update the `containerPadding`
      * to be the new number.
      */
    var containerPadding: js.UndefOr[Double] = js.undefined
    
    /**
      * Since the `GridList` requires being fully rendered in the DOM to be able to
      * correctly calculate the number of `columns` and `cellWidth`, this _might_
      * cause problems when server-side rendering when using the children renderer
      * to create a grid list dynamically based on the number of columns. If the
      * number of columns and default `cellWidth` can be guessed server-side, you
      * should provide this prop. Otherwise it will be:
      * `{ cellSize; maxCellSize, columns: -1 }`
      */
    var defaultSize: js.UndefOr[GridListSize | js.Function0[GridListSize]] = js.undefined
    
    /**
      * Boolean if the recalculation of grid sizing should not happen for height
      * changes.
      */
    var disableHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the recalculation of grid sizing should not happen for width
      * changes.
      */
    var disableWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The max size that each cell can be.
      */
    var maxCellSize: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional style object to merge with the grid custom css properties
      * object.
      */
    var style: js.UndefOr[typings.react.mod.CSSProperties] = js.undefined
  }
  object UseGridListOptions {
    
    inline def apply(): UseGridListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseGridListOptions]
    }
    
    extension [Self <: UseGridListOptions](x: Self) {
      
      inline def setCellMargin(value: String): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
      
      inline def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setDefaultSize(value: GridListSize | js.Function0[GridListSize]): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeFunction0(value: () => GridListSize): Self = StObject.set(x, "defaultSize", js.Any.fromFunction0(value))
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      inline def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      inline def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      inline def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      inline def setMaxCellSize(value: Double): Self = StObject.set(x, "maxCellSize", value.asInstanceOf[js.Any])
      
      inline def setMaxCellSizeUndefined: Self = StObject.set(x, "maxCellSize", js.undefined)
      
      inline def setStyle(value: typings.react.mod.CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type UseGridListReturnValue[E /* <: HTMLElement */] = js.Tuple2[ProvidedGridListProps[E], GridListSize]
}
