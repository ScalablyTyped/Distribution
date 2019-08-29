package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Payment Request API interface is used to store shipping or payment address information. */
trait PaymentAddress extends js.Object {
  val addressLine: js.Array[java.lang.String]
  val city: java.lang.String
  val country: java.lang.String
  val dependentLocality: java.lang.String
  val languageCode: java.lang.String
  val organization: java.lang.String
  val phone: java.lang.String
  val postalCode: java.lang.String
  val recipient: java.lang.String
  val region: java.lang.String
  val sortingCode: java.lang.String
  def toJSON(): js.Any
}

@JSGlobal("PaymentAddress")
@js.native
class PaymentAddressCls () extends PaymentAddress {
  /* CompleteClass */
  override val addressLine: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override val city: java.lang.String = js.native
  /* CompleteClass */
  override val country: java.lang.String = js.native
  /* CompleteClass */
  override val dependentLocality: java.lang.String = js.native
  /* CompleteClass */
  override val languageCode: java.lang.String = js.native
  /* CompleteClass */
  override val organization: java.lang.String = js.native
  /* CompleteClass */
  override val phone: java.lang.String = js.native
  /* CompleteClass */
  override val postalCode: java.lang.String = js.native
  /* CompleteClass */
  override val recipient: java.lang.String = js.native
  /* CompleteClass */
  override val region: java.lang.String = js.native
  /* CompleteClass */
  override val sortingCode: java.lang.String = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("PaymentAddress")
@js.native
object PaymentAddress extends Instantiable0[PaymentAddress]

