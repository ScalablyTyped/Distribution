package typings.atPulumiAws.worklinkWebsiteCertificateAuthorityAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteCertificateAuthorityAssociationState extends js.Object {
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the fleet.
    */
  val fleetArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A unique identifier for the Certificate Authority.
    */
  val websiteCaId: js.UndefOr[Input[String]] = js.undefined
}

object WebsiteCertificateAuthorityAssociationState {
  @scala.inline
  def apply(
    certificate: Input[String] = null,
    displayName: Input[String] = null,
    fleetArn: Input[String] = null,
    websiteCaId: Input[String] = null
  ): WebsiteCertificateAuthorityAssociationState = {
    val __obj = js.Dynamic.literal()
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (fleetArn != null) __obj.updateDynamic("fleetArn")(fleetArn.asInstanceOf[js.Any])
    if (websiteCaId != null) __obj.updateDynamic("websiteCaId")(websiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationState]
  }
}

