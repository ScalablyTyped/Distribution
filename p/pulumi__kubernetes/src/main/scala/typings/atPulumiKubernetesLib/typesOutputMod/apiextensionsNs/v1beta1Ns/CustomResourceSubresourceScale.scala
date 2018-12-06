package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

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
               * JSON Path under .status. Must be set to work with HPA. If there is no value under the given
               * path in the CustomResource, the status label selector value in the /scale subresource will
               * default to the empty string.
               */
  val labelSelectorPath: java.lang.String
  /**
               * SpecReplicasPath defines the JSON path inside of a CustomResource that corresponds to
               * Scale.Spec.Replicas. Only JSON paths without the array notation are allowed. Must be a JSON
               * Path under .spec. If there is no value under the given path in the CustomResource, the
               * /scale subresource will return an error on GET.
               */
  val specReplicasPath: java.lang.String
  /**
               * StatusReplicasPath defines the JSON path inside of a CustomResource that corresponds to
               * Scale.Status.Replicas. Only JSON paths without the array notation are allowed. Must be a
               * JSON Path under .status. If there is no value under the given path in the CustomResource,
               * the status replica value in the /scale subresource will default to 0.
               */
  val statusReplicasPath: java.lang.String
}

