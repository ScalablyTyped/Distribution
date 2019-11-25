package typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryContext extends js.Object {
  var kind: String
  var story: String
}

object StoryContext {
  @scala.inline
  def apply(kind: String, story: String): StoryContext = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryContext]
  }
}

