package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingKey extends js.Object {
  var bindingKey: String
  var destinationType: String
}

object BindingKey {
  @scala.inline
  def apply(bindingKey: String, destinationType: String): BindingKey = {
    val __obj = js.Dynamic.literal(bindingKey = bindingKey.asInstanceOf[js.Any], destinationType = destinationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingKey]
  }
}

