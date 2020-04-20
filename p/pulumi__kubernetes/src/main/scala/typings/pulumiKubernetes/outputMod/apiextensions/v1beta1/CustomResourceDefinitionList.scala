package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.apiextensionsDotk8sDotioSlashv1beta1
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
  val apiVersion: apiextensionsDotk8sDotioSlashv1beta1
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
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinitionList
  val metadata: ListMeta
}

object CustomResourceDefinitionList {
  @scala.inline
  def apply(
    apiVersion: apiextensionsDotk8sDotioSlashv1beta1,
    items: js.Array[CustomResourceDefinition],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinitionList,
    metadata: ListMeta
  ): CustomResourceDefinitionList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionList]
  }
}

