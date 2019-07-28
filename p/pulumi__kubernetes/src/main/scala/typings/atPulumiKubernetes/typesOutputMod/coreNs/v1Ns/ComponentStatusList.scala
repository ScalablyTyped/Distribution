package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status of all the conditions for the component as a list of ComponentStatus objects.
  */
trait ComponentStatusList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: v1
  /**
    * List of ComponentStatus objects.
    */
  val items: js.Array[ComponentStatus]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ComponentStatusList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val metadata: ListMeta
}

object ComponentStatusList {
  @scala.inline
  def apply(
    apiVersion: v1,
    items: js.Array[ComponentStatus],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ComponentStatusList,
    metadata: ListMeta
  ): ComponentStatusList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[ComponentStatusList]
  }
}

