package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var amount: scala.Double
  var created: scala.Double
  var id: java.lang.String
  var price: scala.Double
  var remainingAmount: scala.Double
  var resourceType: MarketResourceConstant
  var roomName: js.UndefOr[java.lang.String] = js.undefined
  var totalAmount: js.UndefOr[scala.Double] = js.undefined
  var `type`: java.lang.String
}

