package typings.reactNativeDraggableFlatlist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderItemInfo[ItemR] extends js.Object {
  var index: Double = js.native
  var isActive: Boolean = js.native
  var item: ItemR = js.native
  def move(): Unit = js.native
  def moveEnd(): Unit = js.native
}

object RenderItemInfo {
  @scala.inline
  def apply[ItemR](index: Double, isActive: Boolean, item: ItemR, move: () => Unit, moveEnd: () => Unit): RenderItemInfo[ItemR] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], move = js.Any.fromFunction0(move), moveEnd = js.Any.fromFunction0(moveEnd))
    __obj.asInstanceOf[RenderItemInfo[ItemR]]
  }
  @scala.inline
  implicit class RenderItemInfoOps[Self <: RenderItemInfo[_], ItemR] (val x: Self with RenderItemInfo[ItemR]) extends AnyVal {
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: ItemR): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setMove(value: () => Unit): Self = this.set("move", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveEnd(value: () => Unit): Self = this.set("moveEnd", js.Any.fromFunction0(value))
  }
  
}

