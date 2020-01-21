package typings.sanctuary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckTypes extends js.Object {
  var checkTypes: Boolean
  var env: js.Array[_]
}

object AnonCheckTypes {
  @scala.inline
  def apply(checkTypes: Boolean, env: js.Array[_]): AnonCheckTypes = {
    val __obj = js.Dynamic.literal(checkTypes = checkTypes.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckTypes]
  }
}

