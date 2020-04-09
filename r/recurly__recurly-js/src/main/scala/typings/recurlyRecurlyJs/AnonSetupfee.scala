package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSetupfee extends js.Object {
  var setup_fee: String
  var unit: String
}

object AnonSetupfee {
  @scala.inline
  def apply(setup_fee: String, unit: String): AnonSetupfee = {
    val __obj = js.Dynamic.literal(setup_fee = setup_fee.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSetupfee]
  }
}

