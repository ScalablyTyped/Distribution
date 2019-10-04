package typings.atPulumiAws.typesInputMod.ec2clientvpnNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointAuthenticationOptions extends js.Object {
  /**
    * The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
    */
  var activeDirectoryId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
    */
  var rootCertificateChainArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, or `directory-service-authentication` to use Active Directory authentication.
    */
  var `type`: Input[String]
}

object EndpointAuthenticationOptions {
  @scala.inline
  def apply(
    `type`: Input[String],
    activeDirectoryId: Input[String] = null,
    rootCertificateChainArn: Input[String] = null
  ): EndpointAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activeDirectoryId != null) __obj.updateDynamic("activeDirectoryId")(activeDirectoryId.asInstanceOf[js.Any])
    if (rootCertificateChainArn != null) __obj.updateDynamic("rootCertificateChainArn")(rootCertificateChainArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointAuthenticationOptions]
  }
}

