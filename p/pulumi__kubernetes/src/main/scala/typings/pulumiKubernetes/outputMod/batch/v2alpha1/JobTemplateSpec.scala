package typings.pulumiKubernetes.outputMod.batch.v2alpha1

import typings.pulumiKubernetes.outputMod.batch.v1.JobSpec
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobTemplateSpec describes the data a Job should have when created from a template
  */
@js.native
trait JobTemplateSpec extends js.Object {
  /**
    * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  /**
    * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: JobSpec = js.native
}

object JobTemplateSpec {
  @scala.inline
  def apply(metadata: ObjectMeta, spec: JobSpec): JobTemplateSpec = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTemplateSpec]
  }
  @scala.inline
  implicit class JobTemplateSpecOps[Self <: JobTemplateSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: JobSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
  }
  
}

