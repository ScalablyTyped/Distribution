package typings.reactDashVirtualized.distEsMasonryMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.reactDashVirtualized.Anon_ClientHeight
import typings.reactDashVirtualized.Anon_StartIndex
import typings.reactDashVirtualized.distEsCellMeasurerMod.CellMeasurerCacheInterface
import typings.reactDashVirtualized.distEsCellMeasurerMod.KeyMapper
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
/* key */ StringDictionary[js.Any] {
  var autoHeight: Boolean
  var cellCount: Double
  var cellMeasurerCache: CellMeasurerCacheInterface
  var cellPositioner: Positioner
  var cellRenderer: CellRenderer
  var className: js.UndefOr[String] = js.undefined
  var height: Double
  var id: js.UndefOr[String] = js.undefined
  var keyMapper: js.UndefOr[KeyMapper] = js.undefined
  var onCellsRendered: js.UndefOr[OnCellsRenderedCallback] = js.undefined
  var onScroll: js.UndefOr[OnScrollCallback] = js.undefined
  var overscanByPixels: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double | Null] = js.undefined
  var width: Double
}

object MasonryProps {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    cellCount: Double,
    cellMeasurerCache: CellMeasurerCacheInterface,
    cellPositioner: Positioner,
    cellRenderer: /* props */ MasonryCellProps => ReactNode,
    height: Double,
    width: Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    id: String = null,
    keyMapper: (/* rowIndex */ Double, /* columnIndex */ Double) => js.Any = null,
    onCellsRendered: /* params */ Anon_StartIndex => Unit = null,
    onScroll: /* params */ Anon_ClientHeight => Unit = null,
    overscanByPixels: Int | Double = null,
    role: String = null,
    scrollingResetTimeInterval: Int | Double = null,
    style: CSSProperties = null,
    tabIndex: Int | Double = null
  ): MasonryProps = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, cellCount = cellCount, cellMeasurerCache = cellMeasurerCache, cellPositioner = cellPositioner, cellRenderer = js.Any.fromFunction1(cellRenderer), height = height, width = width)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (keyMapper != null) __obj.updateDynamic("keyMapper")(js.Any.fromFunction2(keyMapper))
    if (onCellsRendered != null) __obj.updateDynamic("onCellsRendered")(js.Any.fromFunction1(onCellsRendered))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (overscanByPixels != null) __obj.updateDynamic("overscanByPixels")(overscanByPixels.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role)
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryProps]
  }
}

