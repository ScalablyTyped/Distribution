package typings.pulumiKubernetes.typesMod.input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types", "input.batch")
@js.native
object batch extends js.Object {
  @js.native
  object v1 extends js.Object {
    def isJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1.Job */ Boolean = js.native
    def isJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1.JobList */ Boolean = js.native
  }
  
  @js.native
  object v1beta1 extends js.Object {
    def isCronJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1beta1.CronJob */ Boolean = js.native
    def isCronJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1beta1.CronJobList */ Boolean = js.native
  }
  
  @js.native
  object v2alpha1 extends js.Object {
    def isCronJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v2alpha1.CronJob */ Boolean = js.native
    def isCronJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v2alpha1.CronJobList */ Boolean = js.native
  }
  
}

