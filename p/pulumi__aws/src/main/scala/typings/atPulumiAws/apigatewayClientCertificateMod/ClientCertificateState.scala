package typings.atPulumiAws.apigatewayClientCertificateMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCertificateState extends js.Object {
  /**
    * The date when the client certificate was created.
    */
  val createdDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the client certificate.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The date when the client certificate will expire.
    */
  val expirationDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The PEM-encoded public key of the client certificate.
    */
  val pemEncodedCertificate: js.UndefOr[Input[String]] = js.undefined
}

object ClientCertificateState {
  @scala.inline
  def apply(
    createdDate: Input[String] = null,
    description: Input[String] = null,
    expirationDate: Input[String] = null,
    pemEncodedCertificate: Input[String] = null
  ): ClientCertificateState = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (pemEncodedCertificate != null) __obj.updateDynamic("pemEncodedCertificate")(pemEncodedCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateState]
  }
}

