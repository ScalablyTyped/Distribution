package typings.pulumiAws.clientCertificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCertificateState extends js.Object {
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The date when the client certificate was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the client certificate.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The date when the client certificate will expire.
    */
  val expirationDate: js.UndefOr[Input[String]] = js.native
  /**
    * The PEM-encoded public key of the client certificate.
    */
  val pemEncodedCertificate: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClientCertificateState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    createdDate: Input[String] = null,
    description: Input[String] = null,
    expirationDate: Input[String] = null,
    pemEncodedCertificate: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ClientCertificateState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (pemEncodedCertificate != null) __obj.updateDynamic("pemEncodedCertificate")(pemEncodedCertificate.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateState]
  }
}

