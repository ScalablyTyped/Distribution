package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceSubresources defines the status and scale subresources for CustomResources.
  */
trait CustomResourceSubresources extends js.Object {
  /**
    * Scale denotes the scale subresource for CustomResources
    */
  val scale: CustomResourceSubresourceScale
  /**
    * Status denotes the status subresource for CustomResources
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

