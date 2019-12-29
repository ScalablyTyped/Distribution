package typings.atPulumiKubernetes.typesOutputMod.batch.v2alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.batchSlashv2alpha1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CronJobList is a collection of cron jobs.
  */
trait CronJobList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: batchSlashv2alpha1
  /**
    * items is the list of CronJobs.
    */
  val items: js.Array[CronJob]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CronJobList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object CronJobList {
  @scala.inline
  def apply(
    apiVersion: batchSlashv2alpha1,
    items: js.Array[CronJob],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CronJobList,
    metadata: ListMeta
  ): CronJobList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CronJobList]
  }
}

