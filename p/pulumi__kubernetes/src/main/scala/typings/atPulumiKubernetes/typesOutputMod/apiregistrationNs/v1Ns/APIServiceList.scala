package typings.atPulumiKubernetes.typesOutputMod.apiregistrationNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiregistrationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * APIServiceList is a list of APIService objects.
  */
trait APIServiceList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `apiregistrationDOTk8sDOTio/v1`
  val items: js.Array[APIService]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.APIServiceList
  val metadata: ListMeta
}

object APIServiceList {
  @scala.inline
  def apply(
    apiVersion: `apiregistrationDOTk8sDOTio/v1`,
    items: js.Array[APIService],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.APIServiceList,
    metadata: ListMeta
  ): APIServiceList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[APIServiceList]
  }
}

