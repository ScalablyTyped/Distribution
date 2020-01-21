package typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[auditregistrationDotk8sDotioSlashv1alpha1]] = js.undefined
  /**
    * List of audit configurations.
    */
  var items: Input[js.Array[Input[AuditSink]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSinkList]] = js.undefined
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object AuditSinkList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[AuditSink]]],
    apiVersion: Input[auditregistrationDotk8sDotioSlashv1alpha1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.AuditSinkList] = null,
    metadata: Input[ListMeta] = null
  ): AuditSinkList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditSinkList]
  }
}

