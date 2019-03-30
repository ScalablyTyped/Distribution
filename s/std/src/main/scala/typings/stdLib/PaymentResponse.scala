package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The PaymentResponse interface of the Payment Request API is returned after a user selects a payment method and approves a payment request. */
@js.native
trait PaymentResponse extends js.Object {
  val details: js.Any = js.native
  val methodName: java.lang.String = js.native
  val payerEmail: java.lang.String | scala.Null = js.native
  val payerName: java.lang.String | scala.Null = js.native
  val payerPhone: java.lang.String | scala.Null = js.native
  val requestId: java.lang.String = js.native
  val shippingAddress: PaymentAddress | scala.Null = js.native
  val shippingOption: java.lang.String | scala.Null = js.native
  def complete(): js.Promise[scala.Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[scala.Unit] = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("PaymentResponse")
@js.native
class PaymentResponseCls () extends PaymentResponse

@JSGlobal("PaymentResponse")
@js.native
object PaymentResponse
  extends org.scalablytyped.runtime.Instantiable0[PaymentResponse]

