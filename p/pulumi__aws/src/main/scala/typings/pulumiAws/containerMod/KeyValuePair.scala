package typings.pulumiAws.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValuePair extends js.Object {
  var name: String = js.native
  var value: String = js.native
}

object KeyValuePair {
  @scala.inline
  def apply(name: String, value: String): KeyValuePair = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyValuePair]
  }
}

