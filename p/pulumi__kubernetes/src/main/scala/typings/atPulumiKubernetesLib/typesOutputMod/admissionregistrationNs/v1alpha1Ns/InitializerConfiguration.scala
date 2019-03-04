package typings
package atPulumiKubernetesLib.typesOutputMod.admissionregistrationNs.v1alpha1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InitializerConfiguration describes the configuration of initializers.
  */
trait InitializerConfiguration extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1`
  /**
    * Initializers is a list of resources and their default initializers Order-sensitive. When
    * merging multiple InitializerConfigurations, we sort the initializers from different
    * InitializerConfigurations by the name of the InitializerConfigurations; the order of the
    * initializers from the same InitializerConfiguration is preserved.
    */
  val initializers: js.Array[Initializer]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.InitializerConfiguration
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
}

object InitializerConfiguration {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`admissionregistrationDOTk8sDOTio/v1alpha1`,
    initializers: js.Array[Initializer],
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.InitializerConfiguration,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  ): InitializerConfiguration = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, initializers = initializers, kind = kind, metadata = metadata)
  
    __obj.asInstanceOf[InitializerConfiguration]
  }
}

