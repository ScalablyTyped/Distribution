package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvFromSource represents the source of a set of ConfigMaps
  */
trait EnvFromSource extends js.Object {
  /**
    * The ConfigMap to select from
    */
  val configMapRef: ConfigMapEnvSource
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  val prefix: java.lang.String
  /**
    * The Secret to select from
    */
  val secretRef: SecretEnvSource
}

object EnvFromSource {
  @scala.inline
  def apply(configMapRef: ConfigMapEnvSource, prefix: java.lang.String, secretRef: SecretEnvSource): EnvFromSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configMapRef")(configMapRef)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("secretRef")(secretRef)
    __obj.asInstanceOf[EnvFromSource]
  }
}

