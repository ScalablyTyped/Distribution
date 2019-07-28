package typings.atPulumiKubernetes.typesOutputMod.schedulingNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`schedulingDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityClassList is a collection of priority classes.
  */
trait PriorityClassList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `schedulingDOTk8sDOTio/v1`
  /**
    * items is the list of PriorityClasses
    */
  val items: js.Array[PriorityClass]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object PriorityClassList {
  @scala.inline
  def apply(
    apiVersion: `schedulingDOTk8sDOTio/v1`,
    items: js.Array[PriorityClass],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList,
    metadata: ListMeta
  ): PriorityClassList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[PriorityClassList]
  }
}

