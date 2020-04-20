package typings.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStoriesConfigured extends js.Object {
  var storiesConfigured: Boolean
  var storyId: String
  var viewMode: String
}

object AnonStoriesConfigured {
  @scala.inline
  def apply(storiesConfigured: Boolean, storyId: String, viewMode: String): AnonStoriesConfigured = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStoriesConfigured]
  }
}

