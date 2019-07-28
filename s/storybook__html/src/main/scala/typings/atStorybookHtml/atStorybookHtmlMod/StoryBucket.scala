package typings.atStorybookHtml.atStorybookHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryBucket extends js.Object {
  var kind: String
  var stories: js.Array[StoryObject]
}

object StoryBucket {
  @scala.inline
  def apply(kind: String, stories: js.Array[StoryObject]): StoryBucket = {
    val __obj = js.Dynamic.literal(kind = kind, stories = stories)
  
    __obj.asInstanceOf[StoryBucket]
  }
}

