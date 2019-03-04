package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault11 extends ISoapFault {
  var Fault: soapLib.Anon_Detail
}

object ISoapFault11 {
  @scala.inline
  def apply(Fault: soapLib.Anon_Detail): ISoapFault11 = {
    val __obj = js.Dynamic.literal(Fault = Fault)
  
    __obj.asInstanceOf[ISoapFault11]
  }
}

