package typings.pulumiKubernetes.outputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceSubresources defines the status and scale subresources for CustomResources.
  */
@js.native
trait CustomResourceSubresources extends js.Object {
  /**
    * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
    */
  var scale: CustomResourceSubresourceScale = js.native
  /**
    * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
    */
  var status: js.Any = js.native
}

object CustomResourceSubresources {
  @scala.inline
  def apply(scale: CustomResourceSubresourceScale, status: js.Any): CustomResourceSubresources = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceSubresources]
  }
  @scala.inline
  implicit class CustomResourceSubresourcesOps[Self <: CustomResourceSubresources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScale(value: CustomResourceSubresourceScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: js.Any): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

