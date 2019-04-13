package typings
package reactDashVirtualizedLib.distEsCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `aria-label`: js.UndefOr[java.lang.String] = js.native
  /**
    * Outer height of Collection is set to "auto". This property should only be
    * used in conjunction with the WindowScroller HOC.
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.native
  /**
    * Number of cells in Collection.
    */
  var cellCount: scala.Double = js.native
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
  @JSName("cellRenderer")
  var cellRenderer_Original: CollectionCellRenderer = js.native
  /**
    * Callback responsible for returning size and offset/position information for a given cell (index).
    * ({ index: number }): { height: number, width: number, x: number, y: number }
    */
  @JSName("cellSizeAndPositionGetter")
  var cellSizeAndPositionGetter_Original: CollectionCellSizeAndPositionGetter = js.native
  /**
    * Optional custom CSS class name to attach to root Collection element.
    */
  var className: js.UndefOr[java.lang.String] = js.native
  var height: scala.Double = js.native
  var horizontalOverscanSize: js.UndefOr[scala.Double] = js.native
  /**
    * Optional custom id to attach to root Collection element.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  var noContentRenderer: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.native
  /**
    * Callback invoked whenever the scroll offset changes within the inner
    * scrollable region: ({ clientHeight, clientWidth, scrollHeight, scrollLeft, scrollTop, scrollWidth }): void
    */
  var onScroll: js.UndefOr[js.Function1[/* params */ reactDashVirtualizedLib.distEsGridMod.ScrollParams, _]] = js.native
  /**
    * Callback invoked with information about the section of the Collection
    * that was just rendered: ({ indices: Array<number> }): void
    */
  var onSectionRendered: js.UndefOr[
    js.Function1[/* params */ reactDashVirtualizedLib.distEsGridMod.SectionRenderedParams, _]
  ] = js.native
  /**
    * Horizontal offset
    */
  var scrollLeft: js.UndefOr[scala.Double] = js.native
  /**
    * Controls the alignment of scrolled-to-cells. The default ("auto") scrolls
    * the least amount possible to ensure that the specified cell is fully
    * visible. Use "start" to always align cells to the top/left of the
    * Collection and "end" to align them bottom/right. Use "center" to align
    * specified cell in the middle of container.
    */
  var scrollToAlignment: js.UndefOr[reactDashVirtualizedLib.reactDashVirtualizedMod.Alignment] = js.native
  var scrollToCell: js.UndefOr[scala.Double] = js.native
  /**
    * Vertical Offset
    */
  var scrollTop: js.UndefOr[scala.Double] = js.native
  /**
    * Optionally override the size of the sections a Collection's cells are split into.
    */
  var sectionSize: js.UndefOr[scala.Double] = js.native
  /**
    * Optional custom inline style to attach to root Collection element.
    */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.native
  var verticalOverscanSize: js.UndefOr[scala.Double] = js.native
  /**
    * Width of Collection; this property determines the number of visible
    * (vs virtualized) columns.
    */
  var width: scala.Double = js.native
  /**
    * Responsible for rendering a cell given an row and column index.
    * Should implement the following interface: ({ index: number, key: string, style: object }): PropTypes.element
    */
  def cellRenderer(params: CollectionCellRendererParams): reactLib.reactMod.ReactNode = js.native
  /**
    * Callback responsible for returning size and offset/position information for a given cell (index).
    * ({ index: number }): { height: number, width: number, x: number, y: number }
    */
  def cellSizeAndPositionGetter(params: reactDashVirtualizedLib.reactDashVirtualizedMod.Index): CollectionCellSizeAndPosition = js.native
}

