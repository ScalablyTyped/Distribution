package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No static is available

trait Transaction extends js.Object {
  var amount: scala.Double
  var description: java.lang.String
  var from: java.lang.String
  var order: js.UndefOr[TransactionOrder] = js.undefined
  var recipient: js.UndefOr[Anon_Username] = js.undefined
  var resourceType: MarketResourceConstant
  var sender: js.UndefOr[Anon_Username] = js.undefined
  var time: scala.Double
  var to: java.lang.String
  var transactionId: java.lang.String
}

