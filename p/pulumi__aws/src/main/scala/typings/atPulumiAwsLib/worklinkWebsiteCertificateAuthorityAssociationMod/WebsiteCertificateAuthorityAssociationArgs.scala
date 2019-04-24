package typings
package atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsiteCertificateAuthorityAssociationArgs extends js.Object {
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The certificate name to display.
    */
  val displayName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the fleet.
    */
  val fleetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object WebsiteCertificateAuthorityAssociationArgs {
  @scala.inline
  def apply(
    certificate: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    fleetArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    displayName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): WebsiteCertificateAuthorityAssociationArgs = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], fleetArn = fleetArn.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationArgs]
  }
}

