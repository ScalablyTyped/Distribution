package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoriesConfigured extends js.Object {
  var storiesConfigured: Boolean = js.native
  var storyId: String = js.native
  var viewMode: String = js.native
}

object StoriesConfigured {
  @scala.inline
  def apply(storiesConfigured: Boolean, storyId: String, viewMode: String): StoriesConfigured = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesConfigured]
  }
  @scala.inline
  implicit class StoriesConfiguredOps[Self <: StoriesConfigured] (val x: Self) extends AnyVal {
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
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
  
}

