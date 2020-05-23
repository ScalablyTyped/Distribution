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
import scala.scalajs.js.annotation._

trait CollectionProps
  extends /**
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
  var onScroll: js.UndefOr[js.Function1[/* params */ ScrollParams, _]] = js.undefined
  /**
    * Callback invoked with information about the section of the Collection
    * that was just rendered: ({ indices: Array<number> }): void
    */
  var onSectionRendered: js.UndefOr[js.Function1[/* params */ SectionRenderedParams, _]] = js.undefined
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
  @scala.inline
  def apply(
    cellCount: Double,
    cellRenderer: /* params */ CollectionCellRendererParams => ReactNode,
    cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
    height: Double,
    width: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    `aria-label`: String = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    cellGroupRenderer: /* params */ CollectionCellGroupRendererParams => js.Array[ReactNode] = null,
    className: String = null,
    horizontalOverscanSize: js.UndefOr[Double] = js.undefined,
    id: String = null,
    noContentRenderer: () => Element = null,
    onScroll: /* params */ ScrollParams => _ = null,
    onSectionRendered: /* params */ SectionRenderedParams => _ = null,
    scrollLeft: js.UndefOr[Double] = js.undefined,
    scrollToAlignment: Alignment = null,
    scrollToCell: js.UndefOr[Double] = js.undefined,
    scrollTop: js.UndefOr[Double] = js.undefined,
    sectionSize: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    verticalOverscanSize: js.UndefOr[Double] = js.undefined
  ): CollectionProps = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (cellGroupRenderer != null) __obj.updateDynamic("cellGroupRenderer")(js.Any.fromFunction1(cellGroupRenderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalOverscanSize)) __obj.updateDynamic("horizontalOverscanSize")(horizontalOverscanSize.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (noContentRenderer != null) __obj.updateDynamic("noContentRenderer")(js.Any.fromFunction0(noContentRenderer))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSectionRendered != null) __obj.updateDynamic("onSectionRendered")(js.Any.fromFunction1(onSectionRendered))
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToCell)) __obj.updateDynamic("scrollToCell")(scrollToCell.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sectionSize)) __obj.updateDynamic("sectionSize")(sectionSize.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalOverscanSize)) __obj.updateDynamic("verticalOverscanSize")(verticalOverscanSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProps]
  }
}

