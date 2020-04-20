package typings.pulumiKubernetes.outputMod.core.v1

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
  val key: String
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  val name: String
  /**
    * Specify whether the Secret or its key must be defined
    */
  val optional: Boolean
}

object SecretKeySelector {
  @scala.inline
  def apply(key: String, name: String, optional: Boolean): SecretKeySelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretKeySelector]
  }
}

