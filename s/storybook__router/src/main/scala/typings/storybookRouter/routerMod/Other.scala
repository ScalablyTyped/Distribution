package typings.storybookRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Other extends js.Object {
  var storyId: js.UndefOr[String] = js.native
  var viewMode: js.UndefOr[String] = js.native
}

object Other {
  @scala.inline
  def apply(): Other = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Other]
  }
  @scala.inline
  implicit class OtherOps[Self <: Other] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other_ <: js.Any](other: Other_): Self with Other_ = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other_]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
  
}

