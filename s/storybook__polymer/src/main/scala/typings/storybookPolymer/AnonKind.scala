package typings.storybookPolymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKind extends js.Object {
  var kind: String
  var story: String
}

object AnonKind {
  @scala.inline
  def apply(kind: String, story: String): AnonKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKind]
  }
}

