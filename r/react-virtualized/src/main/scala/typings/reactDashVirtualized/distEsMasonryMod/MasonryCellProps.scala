package typings.reactDashVirtualized.distEsMasonryMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.Key
import typings.reactDashVirtualized.distEsCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryCellProps extends js.Object {
  var index: Double
  var isScrolling: Boolean
  var key: Key
  var parent: MeasuredCellParent
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object MasonryCellProps {
  @scala.inline
  def apply(
    index: Double,
    isScrolling: Boolean,
    key: Key,
    parent: MeasuredCellParent,
    style: CSSProperties = null
  ): MasonryCellProps = {
    val __obj = js.Dynamic.literal(index = index, isScrolling = isScrolling, key = key.asInstanceOf[js.Any], parent = parent)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[MasonryCellProps]
  }
}

