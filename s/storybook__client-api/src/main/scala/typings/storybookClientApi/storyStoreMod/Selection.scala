package typings.storybookClientApi.storyStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  var storyId: String = js.native
  var viewMode: String = js.native
}

object Selection {
  @scala.inline
  def apply(storyId: String, viewMode: String): Selection = {
    val __obj = js.Dynamic.literal(storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  implicit class SelectionOps[Self <: Selection] (val x: Self) extends AnyVal {
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
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
  
}

