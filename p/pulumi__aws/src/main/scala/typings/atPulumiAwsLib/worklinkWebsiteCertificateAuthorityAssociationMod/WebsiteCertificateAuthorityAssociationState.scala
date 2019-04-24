package typings
package atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteCertificateAuthorityAssociationState extends js.Object {
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the fleet.
    */
  val fleetArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A unique identifier for the Certificate Authority.
    */
  val websiteCaId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object WebsiteCertificateAuthorityAssociationState {
  @scala.inline
  def apply(
    certificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    displayName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    fleetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    websiteCaId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): WebsiteCertificateAuthorityAssociationState = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (fleetArn != null) __obj.updateDynamic("fleetArn")(fleetArn.asInstanceOf[js.Any])
    if (websiteCaId != null) __obj.updateDynamic("websiteCaId")(websiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationState]
  }
}

