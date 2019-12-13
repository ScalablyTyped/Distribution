package typings.atPulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`flowcontrolDOTapiserverDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FlowSchema defines the schema of a group of flows. Note that a flow is made up of a set of
  * inbound API requests with similar attributes and is identified by a pair of strings: the name
  * of the FlowSchema and a "flow distinguisher".
  */
trait FlowSchema extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `flowcontrolDOTapiserverDOTk8sDOTio/v1alpha1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.FlowSchema
  /**
    * `metadata` is the standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * `spec` is the specification of the desired behavior of a FlowSchema. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: FlowSchemaSpec
  /**
    * `status` is the current status of a FlowSchema. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val status: FlowSchemaStatus
}

object FlowSchema {
  @scala.inline
  def apply(
    apiVersion: `flowcontrolDOTapiserverDOTk8sDOTio/v1alpha1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.FlowSchema,
    metadata: ObjectMeta,
    spec: FlowSchemaSpec,
    status: FlowSchemaStatus
  ): FlowSchema = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlowSchema]
  }
}

