package typings.storybookApi.storiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubState extends js.Object {
  var storiesConfigured: Boolean = js.native
  var storiesHash: StoriesHash = js.native
  var storyId: StoryId = js.native
  var viewMode: ViewMode = js.native
}

object SubState {
  @scala.inline
  def apply(storiesConfigured: Boolean, storiesHash: StoriesHash, storyId: StoryId): SubState = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
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
    def setStoriesConfigured(value: Boolean): Self = this.set("storiesConfigured", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoriesHash(value: StoriesHash): Self = this.set("storiesHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryId(value: StoryId): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMode(value: ViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
  
}

