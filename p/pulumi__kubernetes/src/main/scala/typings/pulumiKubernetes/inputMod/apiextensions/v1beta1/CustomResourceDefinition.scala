package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.apiextensionsDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its
  * name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for
  * removal in v1.19. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
  */
trait CustomResourceDefinition extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[apiextensionsDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinition]] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * spec describes how the user wants the resources to appear
    */
  var spec: Input[CustomResourceDefinitionSpec]
}

object CustomResourceDefinition {
  @scala.inline
  def apply(
    spec: Input[CustomResourceDefinitionSpec],
    apiVersion: Input[apiextensionsDotk8sDotioSlashv1beta1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinition] = null,
    metadata: Input[ObjectMeta] = null
  ): CustomResourceDefinition = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinition]
  }
}

