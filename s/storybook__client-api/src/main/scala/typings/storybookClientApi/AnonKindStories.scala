package typings.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKindStories extends js.Object {
  var kind: String
  var stories: js.Array[_]
}

object AnonKindStories {
  @scala.inline
  def apply(kind: String, stories: js.Array[_]): AnonKindStories = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKindStories]
  }
}

