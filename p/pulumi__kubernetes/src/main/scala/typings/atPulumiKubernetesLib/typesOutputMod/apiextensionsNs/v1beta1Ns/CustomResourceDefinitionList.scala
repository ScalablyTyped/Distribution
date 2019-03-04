package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
  /**
    * Items individual CustomResourceDefinitions
    */
  val items: js.Array[CustomResourceDefinition]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinitionList
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object CustomResourceDefinitionList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`,
    items: js.Array[CustomResourceDefinition],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinitionList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): CustomResourceDefinitionList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[CustomResourceDefinitionList]
  }
}

