package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserializeSerializeFnValue extends js.Object {
  var deserialize: FnValue
  var serialize: FnValue
}

object AnonDeserializeSerializeFnValue {
  @scala.inline
  def apply(deserialize: FnValue, serialize: FnValue): AnonDeserializeSerializeFnValue = {
    val __obj = js.Dynamic.literal(deserialize = deserialize.asInstanceOf[js.Any], serialize = serialize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeserializeSerializeFnValue]
  }
}

