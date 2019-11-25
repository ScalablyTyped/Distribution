package typings.atStorybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StoriesConfigured extends js.Object {
  var storiesConfigured: Boolean
  var storyId: String
  var viewMode: String
}

object Anon_StoriesConfigured {
  @scala.inline
  def apply(storiesConfigured: Boolean, storyId: String, viewMode: String): Anon_StoriesConfigured = {
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_StoriesConfigured]
  }
}

