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
    val __obj = js.Dynamic.literal(id = id, price = price)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TransactionOrder]
  }
}

