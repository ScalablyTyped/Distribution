package typings.reactSpring.renderpropsUniversalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relay interface to override inheritance property
  */
@js.native
trait TrailPropsWeaken
  extends SpringProps[js.Object] {
  @JSName("children")
  var children_TrailPropsWeaken: js.UndefOr[js.Any] = js.native
}

object TrailPropsWeaken {
  @scala.inline
  def apply(): TrailPropsWeaken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailPropsWeaken]
  }
  @scala.inline
  implicit class TrailPropsWeakenOps[Self <: TrailPropsWeaken] (val x: Self) extends AnyVal {
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
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

