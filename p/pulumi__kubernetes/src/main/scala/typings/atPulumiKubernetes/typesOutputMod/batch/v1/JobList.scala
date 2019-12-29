package typings.atPulumiKubernetes.typesOutputMod.batch.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.batchSlashv1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobList is a collection of jobs.
  */
trait JobList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: batchSlashv1
  /**
    * items is the list of Jobs.
    */
  val items: js.Array[Job]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.JobList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object JobList {
  @scala.inline
  def apply(
    apiVersion: batchSlashv1,
    items: js.Array[Job],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.JobList,
    metadata: ListMeta
  ): JobList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobList]
  }
}

