package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationList is a list of PriorityLevelConfiguration objects.
  */
trait PriorityLevelConfigurationList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[flowcontrolDotapiserverDotk8sDotioSlashv1alpha1]] = js.undefined
  /**
    * `items` is a list of request-priorities.
    */
  var items: Input[js.Array[Input[PriorityLevelConfiguration]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfigurationList]
  ] = js.undefined
  /**
    * `metadata` is the standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object PriorityLevelConfigurationList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[PriorityLevelConfiguration]]],
    apiVersion: Input[flowcontrolDotapiserverDotk8sDotioSlashv1alpha1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfigurationList] = null,
    metadata: Input[ListMeta] = null
  ): PriorityLevelConfigurationList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationList]
  }
}

