package typings.atPulumiKubernetes.typesOutputMod.apps.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
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
  val apiVersion: `apps/v1`
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
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevisionList
  /**
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ListMeta
}

object ControllerRevisionList {
  @scala.inline
  def apply(
    apiVersion: `apps/v1`,
    items: js.Array[ControllerRevision],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ControllerRevisionList,
    metadata: ListMeta
  ): ControllerRevisionList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ControllerRevisionList]
  }
}

