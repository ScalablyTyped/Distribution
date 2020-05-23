package typings.sanctuary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckTypes extends js.Object {
  var checkTypes: Boolean
  var env: js.Array[_]
}

object CheckTypes {
  @scala.inline
  def apply(checkTypes: Boolean, env: js.Array[_]): CheckTypes = {
    val __obj = js.Dynamic.literal(checkTypes = checkTypes.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckTypes]
  }
}

