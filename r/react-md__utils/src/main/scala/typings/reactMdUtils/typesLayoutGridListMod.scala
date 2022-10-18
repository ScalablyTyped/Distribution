package typings.reactMdUtils

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdUtils.typesLayoutUseGridListMod.GridListSize
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLayoutGridListMod {
  
  @JSImport("@react-md/utils/types/layout/GridList", "GridList")
  @js.native
  val GridList: ForwardRefExoticComponent[GridListProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdUtils.typesLayoutUseGridListMod.UseGridListOptions because var conflicts: className, style. Inlined disableHeight, disableWidth, cellMargin, maxCellSize, defaultSize, containerPadding */ trait GridListProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * An optional margin to apply to each cell as the `CELL_MARGIN_VAR` css
      * variable only when it is defined. This has to be a number string with a
      * `px`, `em`, `rem` or `%` suffix or else the grid will break.
      */
    var cellMargin: js.UndefOr[String] = js.undefined
    
    /**
      * The children to display within the grid list. This can either be a callback
      * function that will provide the current calculated width for each cell that
      * should return renderable elements or any renderable elements that are sized
      * with the `--rmd-cell-width` css variable.
      */
    @JSName("children")
    var children_GridListProps: ReactNode | RenderGridListChildren
    
    /**
      * Boolean if the current cell sizing should automatically be cloned into each
      * child. This will only work if the `children` is renderable element or a
      * list of renderable elements that accept the `style` and `className` props.
      */
    @JSName("clone")
    var clone_FGridListProps: js.UndefOr[Boolean] = js.undefined
    
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
      * Boolean if the resize observer should stop tracking width changes within
      * the `GridList`. This should normally stay as `false` since tracking width
      * changes will allow for dynamic content being added to the list to not mess
      * up the grid calculation when the user is on an OS that shows scrollbars.
      */
    var disableHeightObserver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the recalculation of grid sizing should not happen for width
      * changes.
      */
    var disableWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the resize observer should stop tracking width changes within
      * the `GridList`. This should normally stay as `false` since tracking width
      * changes will allow for dynamic content being added to the list to not mess
      * up the grid calculation when the user is on an OS that shows scrollbars.
      */
    var disableWidthObserver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The max size that each cell can be.
      */
    var maxCellSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if each child within the `GridList` should be wrapped with the
      * `GridListCell` component.  This will only work if the `children` is not a
      * `function`.
      */
    var wrapOnly: js.UndefOr[Boolean] = js.undefined
  }
  object GridListProps {
    
    inline def apply(): GridListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListProps]
    }
    
    extension [Self <: GridListProps](x: Self) {
      
      inline def setCellMargin(value: String): Self = StObject.set(x, "cellMargin", value.asInstanceOf[js.Any])
      
      inline def setCellMarginUndefined: Self = StObject.set(x, "cellMargin", js.undefined)
      
      inline def setChildren(value: ReactNode | RenderGridListChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* size */ GridListSize => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setContainerPadding(value: Double): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setDefaultSize(value: GridListSize | js.Function0[GridListSize]): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeFunction0(value: () => GridListSize): Self = StObject.set(x, "defaultSize", js.Any.fromFunction0(value))
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setDisableHeight(value: Boolean): Self = StObject.set(x, "disableHeight", value.asInstanceOf[js.Any])
      
      inline def setDisableHeightObserver(value: Boolean): Self = StObject.set(x, "disableHeightObserver", value.asInstanceOf[js.Any])
      
      inline def setDisableHeightObserverUndefined: Self = StObject.set(x, "disableHeightObserver", js.undefined)
      
      inline def setDisableHeightUndefined: Self = StObject.set(x, "disableHeight", js.undefined)
      
      inline def setDisableWidth(value: Boolean): Self = StObject.set(x, "disableWidth", value.asInstanceOf[js.Any])
      
      inline def setDisableWidthObserver(value: Boolean): Self = StObject.set(x, "disableWidthObserver", value.asInstanceOf[js.Any])
      
      inline def setDisableWidthObserverUndefined: Self = StObject.set(x, "disableWidthObserver", js.undefined)
      
      inline def setDisableWidthUndefined: Self = StObject.set(x, "disableWidth", js.undefined)
      
      inline def setMaxCellSize(value: Double): Self = StObject.set(x, "maxCellSize", value.asInstanceOf[js.Any])
      
      inline def setMaxCellSizeUndefined: Self = StObject.set(x, "maxCellSize", js.undefined)
      
      inline def setWrapOnly(value: Boolean): Self = StObject.set(x, "wrapOnly", value.asInstanceOf[js.Any])
      
      inline def setWrapOnlyUndefined: Self = StObject.set(x, "wrapOnly", js.undefined)
    }
  }
  
  type RenderGridListChildren = js.Function1[/* size */ GridListSize, ReactNode]
}
