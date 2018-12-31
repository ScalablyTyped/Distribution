package typings
package reactDashVirtualizedLib.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var autoHeight: scala.Boolean
  var cellCount: scala.Double
  var cellMeasurerCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCacheInterface
  var cellPositioner: Positioner
  var cellRenderer: CellRenderer
  var className: js.UndefOr[java.lang.String] = js.undefined
  var height: scala.Double
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyMapper: js.UndefOr[reactDashVirtualizedLib.distEsCellMeasurerMod.KeyMapper] = js.undefined
  var onCellsRendered: js.UndefOr[OnCellsRenderedCallback] = js.undefined
  var onScroll: js.UndefOr[OnScrollCallback] = js.undefined
  var overscanByPixels: js.UndefOr[scala.Double] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var scrollingResetTimeInterval: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var width: scala.Double
}

