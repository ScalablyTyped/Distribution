package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceSubresources defines the status and scale subresources for CustomResources.
  */
trait CustomResourceSubresources extends js.Object {
  /**
    * scale indicates the custom resource should serve a `/scale` subresource that returns an
    * `autoscaling/v1` Scale object.
    */
  var scale: js.UndefOr[Input[CustomResourceSubresourceScale]] = js.undefined
}

object CustomResourceSubresources {
  @scala.inline
  def apply(scale: Input[CustomResourceSubresourceScale] = null): CustomResourceSubresources = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceSubresources]
  }
}

