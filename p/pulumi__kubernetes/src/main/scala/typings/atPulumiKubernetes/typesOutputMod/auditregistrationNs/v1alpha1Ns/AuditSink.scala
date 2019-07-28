package typings.atPulumiKubernetes.typesOutputMod.auditregistrationNs.v1alpha1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`auditregistrationDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AuditSink represents a cluster level audit sink
  */
trait AuditSink extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `auditregistrationDOTk8sDOTio/v1alpha1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.AuditSink
  val metadata: ObjectMeta
  /**
    * Spec defines the audit configuration spec
    */
  val spec: AuditSinkSpec
}

object AuditSink {
  @scala.inline
  def apply(
    apiVersion: `auditregistrationDOTk8sDOTio/v1alpha1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.AuditSink,
    metadata: ObjectMeta,
    spec: AuditSinkSpec
  ): AuditSink = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec)
  
    __obj.asInstanceOf[AuditSink]
  }
}

