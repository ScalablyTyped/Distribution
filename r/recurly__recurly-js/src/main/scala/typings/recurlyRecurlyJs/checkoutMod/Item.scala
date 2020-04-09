package typings.recurlyRecurlyJs.checkoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var addons: String
  var amount: String
  var id: String
  var plan: String
  var setupFee: String
  var `type`: String
}

object Item {
  @scala.inline
  def apply(addons: String, amount: String, id: String, plan: String, setupFee: String, `type`: String): Item = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setupFee = setupFee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

