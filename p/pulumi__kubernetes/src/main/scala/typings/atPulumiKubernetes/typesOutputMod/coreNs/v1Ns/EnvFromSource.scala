package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val prefix: String
  /**
    * The Secret to select from
    */
  val secretRef: SecretEnvSource
}

object EnvFromSource {
  @scala.inline
  def apply(configMapRef: ConfigMapEnvSource, prefix: String, secretRef: SecretEnvSource): EnvFromSource = {
    val __obj = js.Dynamic.literal(configMapRef = configMapRef, prefix = prefix, secretRef = secretRef)
  
    __obj.asInstanceOf[EnvFromSource]
  }
}

