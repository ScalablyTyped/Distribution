package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOrder extends js.Object {
  var id: java.lang.String
  var price: scala.Double
  var `type`: java.lang.String
}

object TransactionOrder {
  @scala.inline
  def apply(id: java.lang.String, price: scala.Double, `type`: java.lang.String): TransactionOrder = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("price")(price)
    __obj.asInstanceOf[TransactionOrder]
  }
}

