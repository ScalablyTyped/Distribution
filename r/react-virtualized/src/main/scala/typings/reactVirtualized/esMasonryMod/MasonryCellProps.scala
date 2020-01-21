package typings.reactVirtualized.esMasonryMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
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
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryCellProps]
  }
}

