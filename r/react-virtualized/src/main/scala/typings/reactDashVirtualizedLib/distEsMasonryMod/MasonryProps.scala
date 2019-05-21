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
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var width: scala.Double
}

object MasonryProps {
  @scala.inline
  def apply(
    autoHeight: scala.Boolean,
    cellCount: scala.Double,
    cellMeasurerCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCacheInterface,
    cellPositioner: Positioner,
    cellRenderer: CellRenderer,
    height: scala.Double,
    width: scala.Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    id: java.lang.String = null,
    keyMapper: reactDashVirtualizedLib.distEsCellMeasurerMod.KeyMapper = null,
    onCellsRendered: OnCellsRenderedCallback = null,
    onScroll: OnScrollCallback = null,
    overscanByPixels: scala.Int | scala.Double = null,
    role: java.lang.String = null,
    scrollingResetTimeInterval: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, cellCount = cellCount, cellMeasurerCache = cellMeasurerCache, cellPositioner = cellPositioner, cellRenderer = cellRenderer, height = height, width = width)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (keyMapper != null) __obj.updateDynamic("keyMapper")(keyMapper)
    if (onCellsRendered != null) __obj.updateDynamic("onCellsRendered")(onCellsRendered)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (overscanByPixels != null) __obj.updateDynamic("overscanByPixels")(overscanByPixels.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
}

