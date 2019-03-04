package typings
package reactDashVirtualizedLib.distEsMasonryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryCellProps extends js.Object {
  var index: scala.Double
  var isScrolling: scala.Boolean
  var key: reactLib.reactMod.ReactNs.Key
  var parent: reactDashVirtualizedLib.distEsCellMeasurerMod.MeasuredCellParent
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object MasonryCellProps {
  @scala.inline
  def apply(
    index: scala.Double,
    isScrolling: scala.Boolean,
    key: reactLib.reactMod.ReactNs.Key,
    parent: reactDashVirtualizedLib.distEsCellMeasurerMod.MeasuredCellParent,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): MasonryCellProps = {
    val __obj = js.Dynamic.literal(index = index, isScrolling = isScrolling, key = key.asInstanceOf[js.Any], parent = parent)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MasonryCellProps]
  }
}

