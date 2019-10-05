package typings.atPulumiKubernetes.typesInputMod.storage.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StorageClassList is a collection of storage classes.
  */
trait StorageClassList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`storageDOTk8sDOTio/v1`]] = js.undefined
  /**
    * Items is the list of StorageClasses
    */
  var items: Input[js.Array[Input[StorageClass]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StorageClassList]] = js.undefined
  /**
    * Standard list metadata More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object StorageClassList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[StorageClass]]],
    apiVersion: Input[`storageDOTk8sDOTio/v1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.StorageClassList] = null,
    metadata: Input[ListMeta] = null
  ): StorageClassList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClassList]
  }
}

