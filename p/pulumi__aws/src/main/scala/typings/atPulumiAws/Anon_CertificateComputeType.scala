package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateComputeType extends js.Object {
  var certificate: js.UndefOr[Input[String]] = js.undefined
  var computeType: Input[String]
  var environmentVariables: js.UndefOr[Input[js.Array[Input[Anon_NameTypeValue]]]] = js.undefined
  var image: Input[String]
  var imagePullCredentialsType: js.UndefOr[Input[String]] = js.undefined
  var privilegedMode: js.UndefOr[Input[Boolean]] = js.undefined
  var registryCredential: js.UndefOr[Input[Anon_CredentialCredentialProvider]] = js.undefined
  var `type`: Input[String]
}

object Anon_CertificateComputeType {
  @scala.inline
  def apply(
    computeType: Input[String],
    image: Input[String],
    `type`: Input[String],
    certificate: Input[String] = null,
    environmentVariables: Input[js.Array[Input[Anon_NameTypeValue]]] = null,
    imagePullCredentialsType: Input[String] = null,
    privilegedMode: Input[Boolean] = null,
    registryCredential: Input[Anon_CredentialCredentialProvider] = null
  ): Anon_CertificateComputeType = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (imagePullCredentialsType != null) __obj.updateDynamic("imagePullCredentialsType")(imagePullCredentialsType.asInstanceOf[js.Any])
    if (privilegedMode != null) __obj.updateDynamic("privilegedMode")(privilegedMode.asInstanceOf[js.Any])
    if (registryCredential != null) __obj.updateDynamic("registryCredential")(registryCredential.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateComputeType]
  }
}

