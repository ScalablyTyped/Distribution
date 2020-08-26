package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Projection that may be projected along with other supported volume types
  */
@js.native
trait VolumeProjection extends js.Object {
  /**
    * information about the configMap data to project
    */
  var configMap: ConfigMapProjection = js.native
  /**
    * information about the downwardAPI data to project
    */
  var downwardAPI: DownwardAPIProjection = js.native
  /**
    * information about the secret data to project
    */
  var secret: SecretProjection = js.native
  /**
    * information about the serviceAccountToken data to project
    */
  var serviceAccountToken: ServiceAccountTokenProjection = js.native
}

object VolumeProjection {
  @scala.inline
  def apply(
    configMap: ConfigMapProjection,
    downwardAPI: DownwardAPIProjection,
    secret: SecretProjection,
    serviceAccountToken: ServiceAccountTokenProjection
  ): VolumeProjection = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serviceAccountToken = serviceAccountToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeProjection]
  }
  @scala.inline
  implicit class VolumeProjectionOps[Self <: VolumeProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigMap(value: ConfigMapProjection): Self = this.set("configMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownwardAPI(value: DownwardAPIProjection): Self = this.set("downwardAPI", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: SecretProjection): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceAccountToken(value: ServiceAccountTokenProjection): Self = this.set("serviceAccountToken", value.asInstanceOf[js.Any])
  }
  
}

