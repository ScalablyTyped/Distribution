package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Projection that may be projected along with other supported volume types
  */
trait VolumeProjection extends js.Object {
  /**
    * information about the configMap data to project
    */
  var configMap: js.UndefOr[Input[ConfigMapProjection]] = js.undefined
  /**
    * information about the downwardAPI data to project
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIProjection]] = js.undefined
  /**
    * information about the secret data to project
    */
  var secret: js.UndefOr[Input[SecretProjection]] = js.undefined
  /**
    * information about the serviceAccountToken data to project
    */
  var serviceAccountToken: js.UndefOr[Input[ServiceAccountTokenProjection]] = js.undefined
}

object VolumeProjection {
  @scala.inline
  def apply(
    configMap: Input[ConfigMapProjection] = null,
    downwardAPI: Input[DownwardAPIProjection] = null,
    secret: Input[SecretProjection] = null,
    serviceAccountToken: Input[ServiceAccountTokenProjection] = null
  ): VolumeProjection = {
    val __obj = js.Dynamic.literal()
    if (configMap != null) __obj.updateDynamic("configMap")(configMap.asInstanceOf[js.Any])
    if (downwardAPI != null) __obj.updateDynamic("downwardAPI")(downwardAPI.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (serviceAccountToken != null) __obj.updateDynamic("serviceAccountToken")(serviceAccountToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeProjection]
  }
}

