package typings.atPulumiKubernetes.typesOutputMod.batch.v2alpha1

import typings.atPulumiKubernetes.typesOutputMod.batch.v1.JobSpec
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobTemplateSpec describes the data a Job should have when created from a template
  */
trait JobTemplateSpec extends js.Object {
  /**
    * Standard object's metadata of the jobs created from this template. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Specification of the desired behavior of the job. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: JobSpec
}

object JobTemplateSpec {
  @scala.inline
  def apply(metadata: ObjectMeta, spec: JobSpec): JobTemplateSpec = {
    val __obj = js.Dynamic.literal(metadata = metadata, spec = spec)
  
    __obj.asInstanceOf[JobTemplateSpec]
  }
}

