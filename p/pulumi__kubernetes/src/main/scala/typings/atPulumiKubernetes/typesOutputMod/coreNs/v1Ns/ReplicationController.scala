package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ReplicationController represents the configuration of a replication controller.
  */
trait ReplicationController extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: v1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicationController
  /**
    * If the Labels of a ReplicationController are empty, they are defaulted to be the same as
    * the Pod(s) that the replication controller manages. Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Spec defines the specification of the desired behavior of the replication controller. More
    * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: ReplicationControllerSpec
  /**
    * Status is the most recently observed status of the replication controller. This data may be
    * out of date by some window of time. Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: ReplicationControllerStatus
}

object ReplicationController {
  @scala.inline
  def apply(
    apiVersion: v1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicationController,
    metadata: ObjectMeta,
    spec: ReplicationControllerSpec,
    status: ReplicationControllerStatus
  ): ReplicationController = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[ReplicationController]
  }
}

