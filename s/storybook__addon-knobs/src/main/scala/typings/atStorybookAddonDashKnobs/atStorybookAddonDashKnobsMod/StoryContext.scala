package typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsMod

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
    val __obj = js.Dynamic.literal(kind = kind, story = story)
  
    __obj.asInstanceOf[StoryContext]
  }
}

