package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodTemplateSpec describes the data a pod should have when created from a template
  */
trait PodTemplateSpec extends js.Object {
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Specification of the desired behavior of the pod. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: PodSpec
}

object PodTemplateSpec {
  @scala.inline
  def apply(metadata: ObjectMeta, spec: PodSpec): PodTemplateSpec = {
    val __obj = js.Dynamic.literal(metadata = metadata, spec = spec)
  
    __obj.asInstanceOf[PodTemplateSpec]
  }
}

