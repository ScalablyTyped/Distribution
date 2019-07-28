package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretEnvSource selects a Secret to populate the environment variables with.
  *
  * The contents of the target Secret's Data field will represent the key-value pairs as
  * environment variables.
  */
trait SecretEnvSource extends js.Object {
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String
  /**
    * Specify whether the Secret must be defined
    */
  val optional: Boolean
}

object SecretEnvSource {
  @scala.inline
  def apply(name: String, optional: Boolean): SecretEnvSource = {
    val __obj = js.Dynamic.literal(name = name, optional = optional)
  
    __obj.asInstanceOf[SecretEnvSource]
  }
}

