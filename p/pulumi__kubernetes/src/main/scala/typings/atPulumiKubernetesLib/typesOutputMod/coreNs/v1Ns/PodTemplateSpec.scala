package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PodTemplateSpec describes the data a pod should have when created from a template
  */
trait PodTemplateSpec extends js.Object {
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * Specification of the desired behavior of the pod. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: PodSpec
}

object PodTemplateSpec {
  @scala.inline
  def apply(metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta, spec: PodSpec): PodTemplateSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("spec")(spec)
    __obj.asInstanceOf[PodTemplateSpec]
  }
}

