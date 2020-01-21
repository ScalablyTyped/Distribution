package typings.storybookAddonKnobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeserialize extends js.Object {
  var deserialize: js.Function1[/* value */ String | Null, Boolean]
  var serialize: js.Function1[/* value */ Boolean, String | Null]
}

object AnonDeserialize {
  @scala.inline
  def apply(deserialize: /* value */ String | Null => Boolean, serialize: /* value */ Boolean => String | Null): AnonDeserialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
  
    __obj.asInstanceOf[AnonDeserialize]
  }
}

