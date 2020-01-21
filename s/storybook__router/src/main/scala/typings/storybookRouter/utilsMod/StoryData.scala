package typings.storybookRouter.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryData extends js.Object {
  var storyId: js.UndefOr[String] = js.undefined
  var viewMode: js.UndefOr[String] = js.undefined
}

object StoryData {
  @scala.inline
  def apply(storyId: String = null, viewMode: String = null): StoryData = {
    val __obj = js.Dynamic.literal()
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoryData]
  }
}

