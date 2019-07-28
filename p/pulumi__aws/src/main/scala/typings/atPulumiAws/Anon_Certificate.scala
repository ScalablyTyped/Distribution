package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Certificate extends js.Object {
  var certificate: js.UndefOr[String] = js.undefined
  var computeType: String
  var environmentVariables: js.Array[Anon_NameType]
  var image: String
  var imagePullCredentialsType: js.UndefOr[String] = js.undefined
  var privilegedMode: js.UndefOr[Boolean] = js.undefined
  var registryCredential: js.UndefOr[Anon_Credential] = js.undefined
  var `type`: String
}

object Anon_Certificate {
  @scala.inline
  def apply(
    computeType: String,
    environmentVariables: js.Array[Anon_NameType],
    image: String,
    `type`: String,
    certificate: String = null,
    imagePullCredentialsType: String = null,
    privilegedMode: js.UndefOr[Boolean] = js.undefined,
    registryCredential: Anon_Credential = null
  ): Anon_Certificate = {
    val __obj = js.Dynamic.literal(computeType = computeType, environmentVariables = environmentVariables, image = image)
    __obj.updateDynamic("type")(`type`)
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (imagePullCredentialsType != null) __obj.updateDynamic("imagePullCredentialsType")(imagePullCredentialsType)
    if (!js.isUndefined(privilegedMode)) __obj.updateDynamic("privilegedMode")(privilegedMode)
    if (registryCredential != null) __obj.updateDynamic("registryCredential")(registryCredential)
    __obj.asInstanceOf[Anon_Certificate]
  }
}

