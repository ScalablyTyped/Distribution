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
    * LabelSelectorPath defines the JSON path inside of a CustomResource that corresponds to
    * Scale.Status.Selector. Only JSON paths without the array notation are allowed. Must be a
    * JSON Path under .status or .spec. Must be set to work with HPA. The field pointed by this
    * JSON path must be a string field (not a complex selector struct) which contains a
    * serialized label selector in string form. More info:
    * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource
    * If there is no value under the given path in the CustomResource, the status label selector
    * value in the /scale subresource will default to the empty string.
    */
  val labelSelectorPath: String
  /**
    * SpecReplicasPath defines the JSON path inside of a CustomResource that corresponds to
    * Scale.Spec.Replicas. Only JSON paths without the array notation are allowed. Must be a JSON
    * Path under .spec. If there is no value under the given path in the CustomResource, the
    * /scale subresource will return an error on GET.
    */
  val specReplicasPath: String
  /**
    * StatusReplicasPath defines the JSON path inside of a CustomResource that corresponds to
    * Scale.Status.Replicas. Only JSON paths without the array notation are allowed. Must be a
    * JSON Path under .status. If there is no value under the given path in the CustomResource,
    * the status replica value in the /scale subresource will default to 0.
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

