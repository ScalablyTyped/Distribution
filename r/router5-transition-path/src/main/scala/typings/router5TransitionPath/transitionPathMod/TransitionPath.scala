package typings.router5TransitionPath.transitionPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPath extends js.Object {
  var intersection: String = js.native
  var toActivate: js.Array[String] = js.native
  var toDeactivate: js.Array[String] = js.native
}

object TransitionPath {
  @scala.inline
  def apply(intersection: String, toActivate: js.Array[String], toDeactivate: js.Array[String]): TransitionPath = {
    val __obj = js.Dynamic.literal(intersection = intersection.asInstanceOf[js.Any], toActivate = toActivate.asInstanceOf[js.Any], toDeactivate = toDeactivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionPath]
  }
  @scala.inline
  implicit class TransitionPathOps[Self <: TransitionPath] (val x: Self) extends AnyVal {
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
    def setIntersection(value: String): Self = this.set("intersection", value.asInstanceOf[js.Any])
    @scala.inline
    def setToActivateVarargs(value: String*): Self = this.set("toActivate", js.Array(value :_*))
    @scala.inline
    def setToActivate(value: js.Array[String]): Self = this.set("toActivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setToDeactivateVarargs(value: String*): Self = this.set("toDeactivate", js.Array(value :_*))
    @scala.inline
    def setToDeactivate(value: js.Array[String]): Self = this.set("toDeactivate", value.asInstanceOf[js.Any])
  }
  
}

