package typings.atPulumiAws.worklinkWebsiteCertificateAuthorityAssociationMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteCertificateAuthorityAssociationArgs extends js.Object {
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: Input[String] = js.native
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the fleet.
    */
  val fleetArn: Input[String] = js.native
}

object WebsiteCertificateAuthorityAssociationArgs {
  @scala.inline
  def apply(certificate: Input[String], fleetArn: Input[String], displayName: Input[String] = null): WebsiteCertificateAuthorityAssociationArgs = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], fleetArn = fleetArn.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationArgs]
  }
}

