package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LocalObjectReference contains enough information to let you locate the referenced object
  * inside the same namespace.
  */
trait LocalObjectReference extends js.Object {
  /**
    * Name of the referent. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}

object LocalObjectReference {
  @scala.inline
  def apply(name: Input[String] = null): LocalObjectReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalObjectReference]
  }
}

