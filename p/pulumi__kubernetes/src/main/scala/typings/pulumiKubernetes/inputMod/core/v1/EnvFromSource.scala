package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var configMapRef: js.UndefOr[Input[ConfigMapEnvSource]] = js.undefined
  /**
    * An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Secret to select from
    */
  var secretRef: js.UndefOr[Input[SecretEnvSource]] = js.undefined
}

object EnvFromSource {
  @scala.inline
  def apply(
    configMapRef: Input[ConfigMapEnvSource] = null,
    prefix: Input[String] = null,
    secretRef: Input[SecretEnvSource] = null
  ): EnvFromSource = {
    val __obj = js.Dynamic.literal()
    if (configMapRef != null) __obj.updateDynamic("configMapRef")(configMapRef.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (secretRef != null) __obj.updateDynamic("secretRef")(secretRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvFromSource]
  }
}

