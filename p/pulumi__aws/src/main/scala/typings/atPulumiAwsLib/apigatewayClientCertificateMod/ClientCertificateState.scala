package typings
package atPulumiAwsLib.apigatewayClientCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCertificateState extends js.Object {
  /**
    * The date when the client certificate was created.
    */
  val createdDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the client certificate.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The date when the client certificate will expire.
    */
  val expirationDate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The PEM-encoded public key of the client certificate.
    */
  val pemEncodedCertificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ClientCertificateState {
  @scala.inline
  def apply(
    createdDate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    expirationDate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    pemEncodedCertificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ClientCertificateState = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (pemEncodedCertificate != null) __obj.updateDynamic("pemEncodedCertificate")(pemEncodedCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertificateState]
  }
}

