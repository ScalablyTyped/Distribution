package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBindingKey extends js.Object {
  var bindingKey: String
  var destinationType: String
}

object AnonBindingKey {
  @scala.inline
  def apply(bindingKey: String, destinationType: String): AnonBindingKey = {
    val __obj = js.Dynamic.literal(bindingKey = bindingKey.asInstanceOf[js.Any], destinationType = destinationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBindingKey]
  }
}

