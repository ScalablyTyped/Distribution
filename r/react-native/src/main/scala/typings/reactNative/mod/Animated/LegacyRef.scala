package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyRef[C] extends js.Object {
  def getNode(): C = js.native
}

object LegacyRef {
  @scala.inline
  def apply[C](getNode: () => C): LegacyRef[C] = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[LegacyRef[C]]
  }
  @scala.inline
  implicit class LegacyRefOps[Self <: LegacyRef[_], C] (val x: Self with LegacyRef[C]) extends AnyVal {
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
    def setGetNode(value: () => C): Self = this.set("getNode", js.Any.fromFunction0(value))
  }
  
}

