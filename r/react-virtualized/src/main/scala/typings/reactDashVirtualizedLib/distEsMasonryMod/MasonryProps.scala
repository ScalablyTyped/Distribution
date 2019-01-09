package typings
package reactDashVirtualizedLib.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasonryProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var autoHeight: scala.Boolean = js.native
  var cellCount: scala.Double = js.native
  var cellMeasurerCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCacheInterface = js.native
  @JSName("cellPositioner")
  var cellPositioner_Original: Positioner = js.native
  @JSName("cellRenderer")
  var cellRenderer_Original: CellRenderer = js.native
  var className: js.UndefOr[java.lang.String] = js.native
  var height: scala.Double = js.native
  var id: js.UndefOr[java.lang.String] = js.native
  var keyMapper: js.UndefOr[reactDashVirtualizedLib.distEsCellMeasurerMod.KeyMapper] = js.native
  var onCellsRendered: js.UndefOr[OnCellsRenderedCallback] = js.native
  var onScroll: js.UndefOr[OnScrollCallback] = js.native
  var overscanByPixels: js.UndefOr[scala.Double] = js.native
  var role: js.UndefOr[java.lang.String] = js.native
  var scrollingResetTimeInterval: js.UndefOr[scala.Double] = js.native
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.native
  var width: scala.Double = js.native
  def cellPositioner(index: scala.Double): Position = js.native
  def cellRenderer(props: MasonryCellProps): reactLib.reactMod.ReactNs.ReactNode = js.native
}

