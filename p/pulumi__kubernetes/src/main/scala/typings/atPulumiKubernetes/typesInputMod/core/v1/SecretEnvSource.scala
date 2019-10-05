package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specify whether the Secret must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
}

object SecretEnvSource {
  @scala.inline
  def apply(name: Input[String] = null, optional: Input[Boolean] = null): SecretEnvSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretEnvSource]
  }
}

