package typings.pulumiAws.websiteCertificateAuthorityAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteCertificateAuthorityAssociationState extends js.Object {
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: js.UndefOr[Input[String]] = js.native
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the fleet.
    */
  val fleetArn: js.UndefOr[Input[String]] = js.native
  /**
    * A unique identifier for the Certificate Authority.
    */
  val websiteCaId: js.UndefOr[Input[String]] = js.native
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

