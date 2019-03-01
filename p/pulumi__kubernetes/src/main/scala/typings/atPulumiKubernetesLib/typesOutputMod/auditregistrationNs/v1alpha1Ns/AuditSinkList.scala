package typings
package atPulumiKubernetesLib.typesOutputMod.auditregistrationNs.v1alpha1Ns

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
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
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
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSinkList
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
}

object AuditSinkList {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`auditregistrationDOTk8sDOTio/v1alpha1`,
    items: js.Array[AuditSink],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.AuditSinkList,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta
  ): AuditSinkList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiVersion")(apiVersion)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[AuditSinkList]
  }
}

