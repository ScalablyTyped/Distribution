package typings.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStories extends js.Object {
  var kind: String
  var stories: js.Array[_]
}

object AnonStories {
  @scala.inline
  def apply(kind: String, stories: js.Array[_]): AnonStories = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStories]
  }
}

