package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISoapFault12 extends ISoapFault {
  var Fault: soapLib.Anon_Code
}

object ISoapFault12 {
  @scala.inline
  def apply(Fault: soapLib.Anon_Code): ISoapFault12 = {
    val __obj = js.Dynamic.literal(Fault = Fault)
  
    __obj.asInstanceOf[ISoapFault12]
  }
}

