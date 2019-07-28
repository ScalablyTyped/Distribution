package typings.atPulumiKubernetes.typesOutputMod.nodeNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`nodeDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuntimeClassList is a list of RuntimeClass objects.
  */
trait RuntimeClassList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `nodeDOTk8sDOTio/v1beta1`
  /**
    * Items is a list of schema objects.
    */
  val items: js.Array[RuntimeClass]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClassList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object RuntimeClassList {
  @scala.inline
  def apply(
    apiVersion: `nodeDOTk8sDOTio/v1beta1`,
    items: js.Array[RuntimeClass],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClassList,
    metadata: ListMeta
  ): RuntimeClassList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[RuntimeClassList]
  }
}

