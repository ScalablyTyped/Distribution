package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOrder extends js.Object {
  var id: String
  var price: Double
  var `type`: String
}

object TransactionOrder {
  @scala.inline
  def apply(id: String, price: Double, `type`: String): TransactionOrder = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionOrder]
  }
}

