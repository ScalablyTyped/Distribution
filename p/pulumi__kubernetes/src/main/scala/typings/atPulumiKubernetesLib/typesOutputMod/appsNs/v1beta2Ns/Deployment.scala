package typings
package atPulumiKubernetesLib.typesOutputMod.appsNs.v1beta2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED - This group version of Deployment is deprecated by apps/v1/Deployment. See the
  * release notes for more information. Deployment enables declarative updates for Pods and
  * ReplicaSets.
  */
trait Deployment extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment
  /**
    * Standard object metadata.
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
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
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apps/v1beta2`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Deployment,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: DeploymentSpec,
    status: DeploymentStatus
  ): Deployment = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[Deployment]
  }
}

