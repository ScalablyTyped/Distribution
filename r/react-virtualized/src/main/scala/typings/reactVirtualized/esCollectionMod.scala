package typings.reactVirtualized

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.anon.Align
import typings.reactVirtualized.anon.Arialabel
import typings.reactVirtualized.anon.CellGroupRenderer
import typings.reactVirtualized.anon.isScrollingbooleanSizeInf
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import typings.reactVirtualized.mod.ScrollPosition
import typings.reactVirtualized.mod.SizeInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCollectionMod {
  
  @JSImport("react-virtualized/dist/es/Collection", "Collection")
  @js.native
  class Collection protected ()
    extends PureComponent[CollectionProps, js.Object, js.Any] {
    def this(props: CollectionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollectionProps, context: js.Any) = this()
    
    /** CellLayoutManager interface */
    def calculateSizeAndPositionData(): Unit = js.native
    
    def cellRenderers(params: isScrollingbooleanSizeInf): js.Array[ReactNode] = js.native
    
    /**
      * Returns the most recently rendered set of cell indices.
      */
    def getLastRenderedIndices(): js.Array[Double] = js.native
    
    /**
      * Calculates the minimum amount of change from the current scroll position to ensure the specified cell is (fully) visible.
      */
    def getScrollPositionForCell(params: Align): ScrollPosition = js.native
    
    def getTotalSize(): SizeInfo = js.native
    
    /** See Collection#recomputeCellSizesAndPositions */
    def recomputeCellSizesAndPositions(): Unit = js.native
  }
  /* static members */
  object Collection {
    
    @JSImport("react-virtualized/dist/es/Collection", "Collection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/es/Collection", "Collection.defaultProps")
    @js.native
    def defaultProps: CellGroupRenderer = js.native
    inline def defaultProps_=(x: CellGroupRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-virtualized/dist/es/Collection", "Collection.propTypes")
    @js.native
    def propTypes: Arialabel = js.native
    inline def propTypes_=(x: Arialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type CollectionCellGroupRenderer = js.Function1[/* params */ CollectionCellGroupRendererParams, js.Array[ReactNode]]
  
  trait CollectionCellGroupRendererParams extends StObject {
    
    var cellRenderer: CollectionCellRenderer
    
    var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter
    
    var indices: js.Array[Double]
  }
  object CollectionCellGroupRendererParams {
    
    inline def apply(
      cellRenderer: /* params */ CollectionCellRendererParams => ReactNode,
      cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
      indices: js.Array[Double]
    ): CollectionCellGroupRendererParams = {
      val __obj = js.Dynamic.literal(cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), indices = indices.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionCellGroupRendererParams]
    }
    
    extension [Self <: CollectionCellGroupRendererParams](x: Self) {
      
      inline def setCellRenderer(value: /* params */ CollectionCellRendererParams => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
      
      inline def setCellSizeAndPositionGetter(value: /* params */ Index => CollectionCellSizeAndPosition): Self = StObject.set(x, "cellSizeAndPositionGetter", js.Any.fromFunction1(value))
      
      inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
    }
  }
  
  type CollectionCellRenderer = js.Function1[/* params */ CollectionCellRendererParams, ReactNode]
  
  trait CollectionCellRendererParams extends StObject {
    
    var index: Double
    
    var isScrolling: Boolean
    
    var key: Double
    
    var style: CSSProperties
  }
  object CollectionCellRendererParams {
    
    inline def apply(index: Double, isScrolling: Boolean, key: Double, style: CSSProperties): CollectionCellRendererParams = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionCellRendererParams]
    }
    
    extension [Self <: CollectionCellRendererParams](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollectionCellSizeAndPosition extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object CollectionCellSizeAndPosition {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): CollectionCellSizeAndPosition = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionCellSizeAndPosition]
    }
    
    extension [Self <: CollectionCellSizeAndPosition](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type CollectionCellSizeAndPositionGetter = js.Function1[/* params */ Index, CollectionCellSizeAndPosition]
  
  trait CollectionProps
    extends StObject
       with /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /**
      * Outer height of Collection is set to "auto". This property should only be
      * used in conjunction with the WindowScroller HOC.
      */
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Number of cells in Collection.
      */
    var cellCount: Double
    
    /**
      * Responsible for rendering a group of cells given their indices.
      * Should implement the following interface: ({
      *   cellSizeAndPositionGetter:Function,
      *   indices: Array<number>,
      *   cellRenderer: Function
      * }): Array<PropTypes.node>
      */
    var cellGroupRenderer: js.UndefOr[CollectionCellGroupRenderer] = js.undefined
    
    /**
      * Responsible for rendering a cell given an row and column index.
      * Should implement the following interface: ({ index: number, key: string, style: object }): PropTypes.element
      */
    var cellRenderer: CollectionCellRenderer
    
    /**
      * Callback responsible for returning size and offset/position information for a given cell (index).
      * ({ index: number }): { height: number, width: number, x: number, y: number }
      */
    var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter
    
    /**
      * Optional custom CSS class name to attach to root Collection element.
      */
    var className: js.UndefOr[String] = js.undefined
    
    var height: Double
    
    var horizontalOverscanSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional custom id to attach to root Collection element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    var noContentRenderer: js.UndefOr[js.Function0[Element]] = js.undefined
    
    /**
      * Callback invoked whenever the scroll offset changes within the inner
      * scrollable region: ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
      */
    var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, js.Any]] = js.undefined
    
    /**
      * Callback invoked with information about the section of the Collection
      * that was just rendered: ({ indices: Array<number> }): void
      */
    var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, js.Any]] = js.undefined
    
    /**
      * Horizontal offset
      */
    var scrollLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Controls the alignment of scrolled-to-cells. The default ("auto") scrolls
      * the least amount possible to ensure that the specified cell is fully
      * visible. Use "start" to always align cells to the top/left of the
      * Collection and "end" to align them bottom/right. Use "center" to align
      * specified cell in the middle of container.
      */
    var scrollToAlignment: js.UndefOr[Alignment] = js.undefined
    
    var scrollToCell: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical Offset
      */
    var scrollTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Optionally override the size of the sections a Collection's cells are split into.
      */
    var sectionSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional custom inline style to attach to root Collection element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var verticalOverscanSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Width of Collection; this property determines the number of visible
      * (vs virtualized) columns.
      */
    var width: Double
  }
  object CollectionProps {
    
    inline def apply(
      cellCount: Double,
      cellRenderer: /* params */ CollectionCellRendererParams => ReactNode,
      cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
      height: Double,
      width: Double
    ): CollectionProps = {
      val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionProps]
    }
    
    extension [Self <: CollectionProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setCellCount(value: Double): Self = StObject.set(x, "cellCount", value.asInstanceOf[js.Any])
      
      inline def setCellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]): Self = StObject.set(x, "cellGroupRenderer", js.Any.fromFunction1(value))
      
      inline def setCellGroupRendererUndefined: Self = StObject.set(x, "cellGroupRenderer", js.undefined)
      
      inline def setCellRenderer(value: /* params */ CollectionCellRendererParams => ReactNode): Self = StObject.set(x, "cellRenderer", js.Any.fromFunction1(value))
      
      inline def setCellSizeAndPositionGetter(value: /* params */ Index => CollectionCellSizeAndPosition): Self = StObject.set(x, "cellSizeAndPositionGetter", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOverscanSize(value: Double): Self = StObject.set(x, "horizontalOverscanSize", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOverscanSizeUndefined: Self = StObject.set(x, "horizontalOverscanSize", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNoContentRenderer(value: () => Element): Self = StObject.set(x, "noContentRenderer", js.Any.fromFunction0(value))
      
      inline def setNoContentRendererUndefined: Self = StObject.set(x, "noContentRenderer", js.undefined)
      
      inline def setOnScroll(value: /* params */ ScrollParams => js.Any): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSectionRendered(value: /* params */ SectionRenderedParams => js.Any): Self = StObject.set(x, "onSectionRendered", js.Any.fromFunction1(value))
      
      inline def setOnSectionRenderedUndefined: Self = StObject.set(x, "onSectionRendered", js.undefined)
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollToAlignment(value: Alignment): Self = StObject.set(x, "scrollToAlignment", value.asInstanceOf[js.Any])
      
      inline def setScrollToAlignmentUndefined: Self = StObject.set(x, "scrollToAlignment", js.undefined)
      
      inline def setScrollToCell(value: Double): Self = StObject.set(x, "scrollToCell", value.asInstanceOf[js.Any])
      
      inline def setScrollToCellUndefined: Self = StObject.set(x, "scrollToCell", js.undefined)
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setSectionSize(value: Double): Self = StObject.set(x, "sectionSize", value.asInstanceOf[js.Any])
      
      inline def setSectionSizeUndefined: Self = StObject.set(x, "sectionSize", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVerticalOverscanSize(value: Double): Self = StObject.set(x, "verticalOverscanSize", value.asInstanceOf[js.Any])
      
      inline def setVerticalOverscanSizeUndefined: Self = StObject.set(x, "verticalOverscanSize", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
