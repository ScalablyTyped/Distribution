package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
  val configMap: ConfigMapProjection
  /**
    * information about the downwardAPI data to project
    */
  val downwardAPI: DownwardAPIProjection
  /**
    * information about the secret data to project
    */
  val secret: SecretProjection
  /**
    * information about the serviceAccountToken data to project
    */
  val serviceAccountToken: ServiceAccountTokenProjection
}

object VolumeProjection {
  @scala.inline
  def apply(
    configMap: ConfigMapProjection,
    downwardAPI: DownwardAPIProjection,
    secret: SecretProjection,
    serviceAccountToken: ServiceAccountTokenProjection
  ): VolumeProjection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configMap")(configMap)
    __obj.updateDynamic("downwardAPI")(downwardAPI)
    __obj.updateDynamic("secret")(secret)
    __obj.updateDynamic("serviceAccountToken")(serviceAccountToken)
    __obj.asInstanceOf[VolumeProjection]
  }
}

