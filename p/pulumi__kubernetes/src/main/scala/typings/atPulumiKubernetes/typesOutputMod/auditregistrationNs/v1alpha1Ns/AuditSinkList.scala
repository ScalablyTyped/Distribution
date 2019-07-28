package typings.atPulumiKubernetes.typesOutputMod.auditregistrationNs.v1alpha1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `auditregistrationDOTk8sDOTio/v1alpha1`
  /**
    * List of audit configurations.
    */
  val items: js.Array[AuditSink]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.AuditSinkList
  val metadata: ListMeta
}

object AuditSinkList {
  @scala.inline
  def apply(
    apiVersion: `auditregistrationDOTk8sDOTio/v1alpha1`,
    items: js.Array[AuditSink],
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.AuditSinkList,
    metadata: ListMeta
  ): AuditSinkList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, items = items, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[AuditSinkList]
  }
}

