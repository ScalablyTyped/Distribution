package typings
package atPulumiKubernetesLib.typesOutputMod.batchNs.v1beta1Ns

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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`
  /**
    * items is the list of CronJobs.
    */
  val items: js.Array[CronJob]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object CronJobList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`,
    items: js.Array[CronJob],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): CronJobList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[CronJobList]
  }
}

