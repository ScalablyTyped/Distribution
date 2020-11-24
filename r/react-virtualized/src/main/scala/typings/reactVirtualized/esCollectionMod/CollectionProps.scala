package typings.reactVirtualized.esCollectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactVirtualized.esGridMod.ScrollParams
import typings.reactVirtualized.esGridMod.SectionRenderedParams
import typings.reactVirtualized.mod.Alignment
import typings.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  
  var `aria-label`: js.UndefOr[String] = js.native
  
  /**
    * Outer height of Collection is set to "auto". This property should only be
    * used in conjunction with the WindowScroller HOC.
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of cells in Collection.
    */
  var cellCount: Double = js.native
  
  /**
    * Responsible for rendering a group of cells given their indices.
    * Should implement the following interface: ({
    *   cellSizeAndPositionGetter:Function,
    *   indices: Array<number>,
    *   cellRenderer: Function
    * }): Array<PropTypes.node>
    */
  var cellGroupRenderer: js.UndefOr[CollectionCellGroupRenderer] = js.native
  
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ index: number, key: string, style: object }): PropTypes.element
    */
  var cellRenderer: CollectionCellRenderer = js.native
  
  /**
    * Callback responsible for returning size and offset/position information for a given cell (index).
    * ({ index: number }): { height: number, width: number, x: number, y: number }
    */
  var cellSizeAndPositionGetter: CollectionCellSizeAndPositionGetter = js.native
  
  /**
    * Optional custom CSS class name to attach to root Collection element.
    */
  var className: js.UndefOr[String] = js.native
  
  var height: Double = js.native
  
  var horizontalOverscanSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional custom id to attach to root Collection element.
    */
  var id: js.UndefOr[String] = js.native
  
  var noContentRenderer: js.UndefOr[js.Function0[Element]] = js.native
  
  /**
    * Callback invoked whenever the scroll offset changes within the inner
    * scrollable region: ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.native
  
  /**
    * Callback invoked with information about the section of the Collection
    * that was just rendered: ({ indices: Array<number> }): void
    */
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.native
  
  /**
    * Horizontal offset
    */
  var scrollLeft: js.UndefOr[Double] = js.native
  
  /**
    * Controls the alignment of scrolled-to-cells. The default ("auto") scrolls
    * the least amount possible to ensure that the specified cell is fully
    * visible. Use "start" to always align cells to the top/left of the
    * Collection and "end" to align them bottom/right. Use "center" to align
    * specified cell in the middle of container.
    */
  var scrollToAlignment: js.UndefOr[Alignment] = js.native
  
  var scrollToCell: js.UndefOr[Double] = js.native
  
  /**
    * Vertical Offset
    */
  var scrollTop: js.UndefOr[Double] = js.native
  
  /**
    * Optionally override the size of the sections a Collection's cells are split into.
    */
  var sectionSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional custom inline style to attach to root Collection element.
    */
  var style: js.UndefOr[CSSProperties] = js.native
  
  var verticalOverscanSize: js.UndefOr[Double] = js.native
  
  /**
    * Width of Collection; this property determines the number of visible
    * (vs virtualized) columns.
    */
  var width: Double = js.native
}
object CollectionProps {
  
  @scala.inline
  def apply(
    cellCount: Double,
    cellRenderer: /* params */ CollectionCellRendererParams => ReactNode,
    cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
    height: Double,
    width: Double
  ): CollectionProps = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProps]
  }
  
  @scala.inline
  implicit class CollectionPropsOps[Self <: CollectionProps] (val x: Self) extends AnyVal {
    
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
    def setCellCount(value: Double): Self = this.set("cellCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellRenderer(value: /* params */ CollectionCellRendererParams => ReactNode): Self = this.set("cellRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCellSizeAndPositionGetter(value: /* params */ Index => CollectionCellSizeAndPosition): Self = this.set("cellSizeAndPositionGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    
    @scala.inline
    def setCellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode]): Self = this.set("cellGroupRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellGroupRenderer: Self = this.set("cellGroupRenderer", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setHorizontalOverscanSize(value: Double): Self = this.set("horizontalOverscanSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOverscanSize: Self = this.set("horizontalOverscanSize", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setNoContentRenderer(value: () => Element): Self = this.set("noContentRenderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNoContentRenderer: Self = this.set("noContentRenderer", js.undefined)
    
    @scala.inline
    def setOnScroll(value: /* params */ ScrollParams => _): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setOnSectionRendered(value: /* params */ SectionRenderedParams => _): Self = this.set("onSectionRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSectionRendered: Self = this.set("onSectionRendered", js.undefined)
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollLeft: Self = this.set("scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollToAlignment(value: Alignment): Self = this.set("scrollToAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToAlignment: Self = this.set("scrollToAlignment", js.undefined)
    
    @scala.inline
    def setScrollToCell(value: Double): Self = this.set("scrollToCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollToCell: Self = this.set("scrollToCell", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollTop: Self = this.set("scrollTop", js.undefined)
    
    @scala.inline
    def setSectionSize(value: Double): Self = this.set("sectionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionSize: Self = this.set("sectionSize", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVerticalOverscanSize(value: Double): Self = this.set("verticalOverscanSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOverscanSize: Self = this.set("verticalOverscanSize", js.undefined)
  }
}
