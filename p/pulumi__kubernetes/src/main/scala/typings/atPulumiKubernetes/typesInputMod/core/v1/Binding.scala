package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Binding ties one object to another; for example, a pod is bound to a node by a scheduler.
  * Deprecated in 1.7, please use the bindings subresource of pods instead.
  */
trait Binding extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Binding]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * The target object that you want to bind to the standard object.
    */
  var target: Input[ObjectReference]
}

object Binding {
  @scala.inline
  def apply(
    target: Input[ObjectReference],
    apiVersion: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Binding] = null,
    metadata: Input[ObjectMeta] = null
  ): Binding = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
}

