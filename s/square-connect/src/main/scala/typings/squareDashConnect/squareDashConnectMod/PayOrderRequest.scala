package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "PayOrderRequest")
@js.native
class PayOrderRequest () extends js.Object {
  /**
    * A value you specify that uniquely identifies this request among requests you've sent.
    * If you're unsure whether a particular payment request was completed successfully, you can reattempt it with the
    * same idempotency key without worrying about duplicate payments.
    * See [Idempotency](/working-with-apis/idempotency) for more information.
    */
  var idempotency_key: String = js.native
  /**
    * The version of the order being paid. If not supplied, the latest version will be paid.
    */
  var order_version: js.UndefOr[Double] = js.native
  var payment_ids: js.UndefOr[js.Array[String]] = js.native
}

