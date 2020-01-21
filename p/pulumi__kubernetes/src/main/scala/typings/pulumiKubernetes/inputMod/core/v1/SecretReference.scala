package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SecretReference represents a Secret Reference. It has enough information to retrieve secret
  * in any namespace
  */
trait SecretReference extends js.Object {
  /**
    * Name is unique within a namespace to reference a secret resource.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Namespace defines the space within which the secret name must be unique.
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
}

object SecretReference {
  @scala.inline
  def apply(name: Input[String] = null, namespace: Input[String] = null): SecretReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretReference]
  }
}

