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

