package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretKeySelector selects a key of a Secret.
  */
trait SecretKeySelector extends js.Object {
  /**
    * The key of the secret to select from.  Must be a valid secret key.
    */
  val key: java.lang.String
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: java.lang.String
  /**
    * Specify whether the Secret or its key must be defined
    */
  val optional: scala.Boolean
}

object SecretKeySelector {
  @scala.inline
  def apply(key: java.lang.String, name: java.lang.String, optional: scala.Boolean): SecretKeySelector = {
    val __obj = js.Dynamic.literal(key = key, name = name, optional = optional)
  
    __obj.asInstanceOf[SecretKeySelector]
  }
}

