package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its
  * name MUST be in the format <.spec.name>.<.spec.group>.
  */
trait CustomResourceDefinition extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinition
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Spec describes how the user wants the resources to appear
    */
  val spec: CustomResourceDefinitionSpec
  /**
    * Status indicates the actual state of the CustomResourceDefinition
    */
  val status: CustomResourceDefinitionStatus
}

object CustomResourceDefinition {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinition,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: CustomResourceDefinitionSpec,
    status: CustomResourceDefinitionStatus
  ): CustomResourceDefinition = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[CustomResourceDefinition]
  }
}

