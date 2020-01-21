package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ConfigMapEnvSource selects a ConfigMap to populate the environment variables with.
  *
  * The contents of the target ConfigMap's Data field will represent the key-value pairs as
  * environment variables.
  */
trait ConfigMapEnvSource extends js.Object {
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specify whether the ConfigMap must be defined
    */
  var optional: js.UndefOr[Input[Boolean]] = js.undefined
}

object ConfigMapEnvSource {
  @scala.inline
  def apply(name: Input[String] = null, optional: Input[Boolean] = null): ConfigMapEnvSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigMapEnvSource]
  }
}

