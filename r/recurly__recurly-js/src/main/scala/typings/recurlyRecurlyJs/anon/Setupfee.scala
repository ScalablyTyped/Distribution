package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Setupfee extends js.Object {
  var setup_fee: String
  var unit: String
}

object Setupfee {
  @scala.inline
  def apply(setup_fee: String, unit: String): Setupfee = {
    val __obj = js.Dynamic.literal(setup_fee = setup_fee.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setupfee]
  }
}

