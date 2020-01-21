package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var key: Input[String]
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specify whether the Secret or its key must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
}

object SecretKeySelector {
  @scala.inline
  def apply(key: Input[String], name: Input[String] = null, optional: Input[Boolean] = null): SecretKeySelector = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretKeySelector]
  }
}

