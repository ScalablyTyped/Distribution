package typings.atPulumiKubernetes.typesOutputMod.extensions.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`extensions/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated extensions/v1beta1/Deployment is not supported by Kubernetes 1.16+ clusters. Use
  * apps/v1/Deployment instead.
  *
  * Deployment enables declarative updates for Pods and ReplicaSets.
  */
trait Deployment extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: `extensions/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment
  /**
    * Standard object metadata.
    */
  val metadata: ObjectMeta
  /**
    * Specification of the desired behavior of the Deployment.
    */
  val spec: DeploymentSpec
  /**
    * Most recently observed status of the Deployment.
    */
  val status: DeploymentStatus
}

object Deployment {
  @scala.inline
  def apply(
    apiVersion: `extensions/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment,
    metadata: ObjectMeta,
    spec: DeploymentSpec,
    status: DeploymentStatus
  ): Deployment = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[Deployment]
  }
}

