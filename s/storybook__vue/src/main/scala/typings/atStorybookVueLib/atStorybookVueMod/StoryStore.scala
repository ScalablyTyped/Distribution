package typings
package atStorybookVueLib.atStorybookVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryStore extends js.Object {
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var kind: java.lang.String
  var stories: js.Array[StoryObject]
}

object StoryStore {
  @scala.inline
  def apply(kind: java.lang.String, stories: js.Array[StoryObject], fileName: java.lang.String = null): StoryStore = {
    val __obj = js.Dynamic.literal(kind = kind, stories = stories)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[StoryStore]
  }
}

