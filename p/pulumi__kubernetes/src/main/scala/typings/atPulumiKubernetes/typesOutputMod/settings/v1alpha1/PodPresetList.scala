package typings.atPulumiKubernetes.typesOutputMod.settings.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.settingsDotk8sDotioSlashv1alpha1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodPresetList is a list of PodPreset objects.
  */
trait PodPresetList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: settingsDotk8sDotioSlashv1alpha1
  /**
    * Items is a list of schema objects.
    */
  val items: js.Array[PodPreset]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodPresetList
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object PodPresetList {
  @scala.inline
  def apply(
    apiVersion: settingsDotk8sDotioSlashv1alpha1,
    items: js.Array[PodPreset],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodPresetList,
    metadata: ListMeta
  ): PodPresetList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PodPresetList]
  }
}

