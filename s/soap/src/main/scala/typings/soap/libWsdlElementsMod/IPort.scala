package typings.soap.libWsdlElementsMod

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
    val __obj = js.Dynamic.literal(binding = binding, location = location)
  
    __obj.asInstanceOf[IPort]
  }
}

