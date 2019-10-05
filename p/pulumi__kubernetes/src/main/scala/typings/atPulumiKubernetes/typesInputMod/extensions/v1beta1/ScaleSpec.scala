package typings.atPulumiKubernetes.typesInputMod.extensions.v1beta1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the attributes of a scale subresource
  */
trait ScaleSpec extends js.Object {
  /**
    * desired number of instances for the scaled object.
    */
  var replicas: js.UndefOr[Input[Double]] = js.undefined
}

object ScaleSpec {
  @scala.inline
  def apply(replicas: Input[Double] = null): ScaleSpec = {
    val __obj = js.Dynamic.literal()
    if (replicas != null) __obj.updateDynamic("replicas")(replicas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleSpec]
  }
}

