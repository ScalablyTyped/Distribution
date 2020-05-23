package typings.storybookClientApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stories extends js.Object {
  var kind: String
  var stories: js.Array[_]
}

object Stories {
  @scala.inline
  def apply(kind: String, stories: js.Array[_]): Stories = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stories]
  }
}

