package typings
package atStorybookAddonDashKnobsLib.atStorybookAddonDashKnobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryContext extends js.Object {
  var kind: java.lang.String
  var story: java.lang.String
}

object StoryContext {
  @scala.inline
  def apply(kind: java.lang.String, story: java.lang.String): StoryContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("story")(story)
    __obj.asInstanceOf[StoryContext]
  }
}

