package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1beta1

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
  val scale: CustomResourceSubresourceScale
  /**
    * status indicates the custom resource should serve a `/status` subresource. When enabled: 1.
    * requests to the custom resource primary endpoint ignore changes to the `status` stanza of
    * the object. 2. requests to the custom resource `/status` subresource ignore changes to
    * anything other than the `status` stanza of the object.
    */
  val status: js.Any
}

object CustomResourceSubresources {
  @scala.inline
  def apply(scale: CustomResourceSubresourceScale, status: js.Any): CustomResourceSubresources = {
    val __obj = js.Dynamic.literal(scale = scale, status = status)
  
    __obj.asInstanceOf[CustomResourceSubresources]
  }
}

