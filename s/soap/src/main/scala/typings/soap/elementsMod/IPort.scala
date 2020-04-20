package typings.soap.elementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPort extends js.Object {
  var binding: BindingElement
  var location: String
}

object IPort {
  @scala.inline
  def apply(binding: BindingElement, location: String): IPort = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPort]
  }
}

