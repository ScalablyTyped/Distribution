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
    val __obj = js.Dynamic.literal(storiesConfigured = storiesConfigured, storyId = storyId, viewMode = viewMode)
  
    __obj.asInstanceOf[Anon_StoriesConfigured]
  }
}

