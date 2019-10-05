package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiextensionsDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
  */
trait CustomResourceDefinitionList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `apiextensionsDOTk8sDOTio/v1beta1`
  /**
    * items list individual CustomResourceDefinition objects
    */
  val items: js.Array[CustomResourceDefinition]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinitionList
  val metadata: ListMeta
}

object CustomResourceDefinitionList {
  @scala.inline
  def apply(
    apiVersion: `apiextensionsDOTk8sDOTio/v1beta1`,
    items: js.Array[CustomResourceDefinition],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinitionList,
    metadata: ListMeta
  ): CustomResourceDefinitionList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[CustomResourceDefinitionList]
  }
}

