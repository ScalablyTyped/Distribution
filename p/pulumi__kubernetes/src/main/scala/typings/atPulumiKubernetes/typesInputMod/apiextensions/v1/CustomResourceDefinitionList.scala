package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.apiextensionsDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[apiextensionsDotk8sDotioSlashv1]] = js.undefined
  /**
    * items list individual CustomResourceDefinition objects
    */
  var items: Input[js.Array[Input[CustomResourceDefinition]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinitionList
    ]
  ] = js.undefined
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object CustomResourceDefinitionList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[CustomResourceDefinition]]],
    apiVersion: Input[apiextensionsDotk8sDotioSlashv1] = null,
    kind: Input[
      typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinitionList
    ] = null,
    metadata: Input[ListMeta] = null
  ): CustomResourceDefinitionList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionList]
  }
}

