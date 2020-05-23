package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesConfigured extends js.Object {
  var storiesConfigured: Boolean
  var storyId: String
  var viewMode: String
}

object StoriesConfigured {
  @scala.inline
  def apply(storiesConfigured: Boolean, storyId: String, viewMode: String): StoriesConfigured = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesConfigured]
  }
}

