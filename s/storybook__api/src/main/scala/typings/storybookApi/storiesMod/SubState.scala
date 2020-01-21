package typings.storybookApi.storiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubState extends js.Object {
  var storiesConfigured: Boolean
  var storiesHash: StoriesHash
  var storyId: StoryId
  var viewMode: ViewMode
}

object SubState {
  @scala.inline
  def apply(storiesConfigured: Boolean, storiesHash: StoriesHash, storyId: StoryId, viewMode: ViewMode = null): SubState = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storiesHash = storiesHash.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
}

