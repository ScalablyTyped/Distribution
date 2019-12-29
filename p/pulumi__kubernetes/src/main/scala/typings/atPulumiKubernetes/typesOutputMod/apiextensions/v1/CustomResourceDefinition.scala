package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.apiextensionsDotk8sDotioSlashv1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
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
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: apiextensionsDotk8sDotioSlashv1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinition
  val metadata: ObjectMeta
  /**
    * spec describes how the user wants the resources to appear
    */
  val spec: CustomResourceDefinitionSpec
  /**
    * status indicates the actual state of the CustomResourceDefinition
    */
  val status: CustomResourceDefinitionStatus
}

object CustomResourceDefinition {
  @scala.inline
  def apply(
    apiVersion: apiextensionsDotk8sDotioSlashv1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinition,
    metadata: ObjectMeta,
    spec: CustomResourceDefinitionSpec,
    status: CustomResourceDefinitionStatus
  ): CustomResourceDefinition = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomResourceDefinition]
  }
}

