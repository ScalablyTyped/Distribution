package typings.soap.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFaultError extends js.Object {
  var Fault: ISoapFault
}

object ISoapFaultError {
  @scala.inline
  def apply(Fault: ISoapFault): ISoapFaultError = {
    val __obj = js.Dynamic.literal(Fault = Fault)
  
    __obj.asInstanceOf[ISoapFaultError]
  }
}

