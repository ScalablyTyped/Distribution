package typings.reactVirtualized.esMasonryMod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.reactVirtualized.esCellMeasurerMod.MeasuredCellParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasonryCellProps extends js.Object {
  var index: Double = js.native
  var isScrolling: Boolean = js.native
  var key: Key = js.native
  var parent: MeasuredCellParent = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object MasonryCellProps {
  @scala.inline
  def apply(index: Double, isScrolling: Boolean, key: Key, parent: MeasuredCellParent): MasonryCellProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasonryCellProps]
  }
  @scala.inline
  implicit class MasonryCellPropsOps[Self <: MasonryCellProps] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: MeasuredCellParent): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

