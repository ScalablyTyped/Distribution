package typings.pulumiKubernetes.outputMod.networking.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.networkingDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IngressClassList is a collection of IngressClasses.
  */
trait IngressClassList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: networkingDotk8sDotioSlashv1beta1
  /**
    * Items is the list of IngressClasses.
    */
  val items: js.Array[IngressClass]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.IngressClassList
  /**
    * Standard list metadata.
    */
  val metadata: ListMeta
}

object IngressClassList {
  @scala.inline
  def apply(
    apiVersion: networkingDotk8sDotioSlashv1beta1,
    items: js.Array[IngressClass],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.IngressClassList,
    metadata: ListMeta
  ): IngressClassList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressClassList]
  }
}

