package typings.storybookPolymer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kind extends js.Object {
  var kind: String
  var story: String
}

object Kind {
  @scala.inline
  def apply(kind: String, story: String): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
}

