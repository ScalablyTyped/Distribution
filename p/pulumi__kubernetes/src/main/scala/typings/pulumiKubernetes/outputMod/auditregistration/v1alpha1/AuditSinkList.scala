package typings.pulumiKubernetes.outputMod.auditregistration.v1alpha1

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuditSinkList is a list of AuditSink items.
  */
trait AuditSinkList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: auditregistrationDotk8sDotioSlashv1alpha1
  /**
    * List of audit configurations.
    */
  val items: js.Array[AuditSink]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSinkList
  val metadata: ListMeta
}

object AuditSinkList {
  @scala.inline
  def apply(
    apiVersion: auditregistrationDotk8sDotioSlashv1alpha1,
    items: js.Array[AuditSink],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSinkList,
    metadata: ListMeta
  ): AuditSinkList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditSinkList]
  }
}

