package typings.pulumiKubernetes.outputMod.apps.v1beta2

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ControllerRevisionList is a resource containing a list of ControllerRevision objects.
  */
trait ControllerRevisionList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: appsSlashv1beta2
  /**
    * Items is the list of ControllerRevisions
    */
  val items: js.Array[ControllerRevision]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ControllerRevisionList
  /**
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object ControllerRevisionList {
  @scala.inline
  def apply(
    apiVersion: appsSlashv1beta2,
    items: js.Array[ControllerRevision],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ControllerRevisionList,
    metadata: ListMeta
  ): ControllerRevisionList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerRevisionList]
  }
}

