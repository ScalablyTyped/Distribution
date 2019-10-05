package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1beta1

import typings.atPulumiPulumi.outputMod.Input
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
  var labelSelectorPath: js.UndefOr[Input[String]] = js.undefined
  /**
    * specReplicasPath defines the JSON path inside of a custom resource that corresponds to
    * Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a
    * JSON Path under `.spec`. If there is no value under the given path in the custom resource,
    * the `/scale` subresource will return an error on GET.
    */
  var specReplicasPath: Input[String]
  /**
    * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to
    * Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a
    * JSON Path under `.status`. If there is no value under the given path in the custom
    * resource, the `status.replicas` value in the `/scale` subresource will default to 0.
    */
  var statusReplicasPath: Input[String]
}

object CustomResourceSubresourceScale {
  @scala.inline
  def apply(
    specReplicasPath: Input[String],
    statusReplicasPath: Input[String],
    labelSelectorPath: Input[String] = null
  ): CustomResourceSubresourceScale = {
    val __obj = js.Dynamic.literal(specReplicasPath = specReplicasPath.asInstanceOf[js.Any], statusReplicasPath = statusReplicasPath.asInstanceOf[js.Any])
    if (labelSelectorPath != null) __obj.updateDynamic("labelSelectorPath")(labelSelectorPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceSubresourceScale]
  }
}

