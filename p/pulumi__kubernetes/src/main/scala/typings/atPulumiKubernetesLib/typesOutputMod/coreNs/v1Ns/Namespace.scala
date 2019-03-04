package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Namespace provides a scope for Names. Use of multiple namespaces is optional.
  */
trait Namespace extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Namespace
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Spec defines the behavior of the Namespace. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: NamespaceSpec
  /**
    * Status describes the current status of a Namespace. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: NamespaceStatus
}

object Namespace {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.v1,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Namespace,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: NamespaceSpec,
    status: NamespaceStatus
  ): Namespace = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[Namespace]
  }
}

