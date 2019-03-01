package typings
package atStorybookReactLib.atStorybookReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryBucket extends js.Object {
  var kind: java.lang.String
  var stories: js.Array[StoryObject]
}

object StoryBucket {
  @scala.inline
  def apply(kind: java.lang.String, stories: js.Array[StoryObject]): StoryBucket = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("stories")(stories)
    __obj.asInstanceOf[StoryBucket]
  }
}

