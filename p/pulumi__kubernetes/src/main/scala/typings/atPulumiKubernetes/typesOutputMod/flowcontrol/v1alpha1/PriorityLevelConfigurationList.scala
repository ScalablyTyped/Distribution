package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`flowcontrolDOTapiserverDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
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
  val apiVersion: `flowcontrolDOTapiserverDOTk8sDOTio/v1alpha1`
  /**
    * `items` is a list of request-priorities.
    */
  val items: js.Array[PriorityLevelConfiguration]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityLevelConfigurationList
  /**
    * `metadata` is the standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object PriorityLevelConfigurationList {
  @scala.inline
  def apply(
    apiVersion: `flowcontrolDOTapiserverDOTk8sDOTio/v1alpha1`,
    items: js.Array[PriorityLevelConfiguration],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityLevelConfigurationList,
    metadata: ListMeta
  ): PriorityLevelConfigurationList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PriorityLevelConfigurationList]
  }
}

