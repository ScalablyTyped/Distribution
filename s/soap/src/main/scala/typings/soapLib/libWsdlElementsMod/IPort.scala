package typings
package soapLib.libWsdlElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPort extends js.Object {
  var binding: BindingElement
  var location: java.lang.String
}

object IPort {
  @scala.inline
  def apply(binding: BindingElement, location: java.lang.String): IPort = {
    val __obj = js.Dynamic.literal(binding = binding, location = location)
  
    __obj.asInstanceOf[IPort]
  }
}

