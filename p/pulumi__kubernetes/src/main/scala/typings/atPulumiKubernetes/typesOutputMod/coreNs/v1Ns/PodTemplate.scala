package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodTemplate describes a template for creating copies of a predefined pod.
  */
trait PodTemplate extends js.Object {
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
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodTemplate
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Template defines the pods that will be created from this pod template.
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val template: PodTemplateSpec
}

object PodTemplate {
  @scala.inline
  def apply(
    apiVersion: v1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodTemplate,
    metadata: ObjectMeta,
    template: PodTemplateSpec
  ): PodTemplate = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, template = template)
  
    __obj.asInstanceOf[PodTemplate]
  }
}

