package typings.atPulumiKubernetes.typesOutputMod.apps.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.appsSlashv1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicaSetList is a collection of ReplicaSets.
  */
trait ReplicaSetList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: appsSlashv1
  /**
    * List of ReplicaSets. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller
    */
  val items: js.Array[ReplicaSet]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicaSetList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val metadata: ListMeta
}

object ReplicaSetList {
  @scala.inline
  def apply(
    apiVersion: appsSlashv1,
    items: js.Array[ReplicaSet],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicaSetList,
    metadata: ListMeta
  ): ReplicaSetList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplicaSetList]
  }
}

