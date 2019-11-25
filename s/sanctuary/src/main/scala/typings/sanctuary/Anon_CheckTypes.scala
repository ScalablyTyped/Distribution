package typings.sanctuary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckTypes extends js.Object {
  var checkTypes: Boolean
  var env: js.Array[_]
}

object Anon_CheckTypes {
  @scala.inline
  def apply(checkTypes: Boolean, env: js.Array[_]): Anon_CheckTypes = {
    val __obj = js.Dynamic.literal(checkTypes = checkTypes.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CheckTypes]
  }
}

