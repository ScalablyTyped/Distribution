package typings.atPulumiKubernetes.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceSubresourceScale defines how to serve the scale subresource for
  * CustomResources.
  */
trait CustomResourceSubresourceScale extends js.Object {
  /**
    * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to
    * Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a
    * JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The
    * field pointed by this JSON path must be a string field (not a complex selector struct)
    * which contains a serialized label selector in string form. More info:
    * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource
    * If there is no value under the given path in the custom resource, the `status.selector`
    * value in the `/scale` subresource will default to the empty string.
    */
  val labelSelectorPath: String
  /**
    * specReplicasPath defines the JSON path inside of a custom resource that corresponds to
    * Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a
    * JSON Path under `.spec`. If there is no value under the given path in the custom resource,
    * the `/scale` subresource will return an error on GET.
    */
  val specReplicasPath: String
  /**
    * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to
    * Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a
    * JSON Path under `.status`. If there is no value under the given path in the custom
    * resource, the `status.replicas` value in the `/scale` subresource will default to 0.
    */
  val statusReplicasPath: String
}

object CustomResourceSubresourceScale {
  @scala.inline
  def apply(labelSelectorPath: String, specReplicasPath: String, statusReplicasPath: String): CustomResourceSubresourceScale = {
    val __obj = js.Dynamic.literal(labelSelectorPath = labelSelectorPath, specReplicasPath = specReplicasPath, statusReplicasPath = statusReplicasPath)
  
    __obj.asInstanceOf[CustomResourceSubresourceScale]
  }
}

