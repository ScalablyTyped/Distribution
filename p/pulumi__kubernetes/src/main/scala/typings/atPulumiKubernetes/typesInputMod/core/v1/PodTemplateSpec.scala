package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Specification of the desired behavior of the pod. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: js.UndefOr[Input[PodSpec]] = js.undefined
}

object PodTemplateSpec {
  @scala.inline
  def apply(metadata: Input[ObjectMeta] = null, spec: Input[PodSpec] = null): PodTemplateSpec = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodTemplateSpec]
  }
}

