package typings.atPulumiKubernetes.typesOutputMod.apps.v1beta2

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.appsSlashv1beta2
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated apps/v1beta2/Deployment is deprecated by apps/v1/Deployment and not supported by
  * Kubernetes v1.16+ clusters.
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
  val apiVersion: appsSlashv1beta2
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
    apiVersion: appsSlashv1beta2,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment,
    metadata: ObjectMeta,
    spec: DeploymentSpec,
    status: DeploymentStatus
  ): Deployment = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Deployment]
  }
}

