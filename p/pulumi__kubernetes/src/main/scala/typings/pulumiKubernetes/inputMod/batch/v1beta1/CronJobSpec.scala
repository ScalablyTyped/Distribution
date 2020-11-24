package typings.pulumiKubernetes.inputMod.batch.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CronJobSpec describes how the job execution will look like and when it will actually run.
  */
@js.native
trait CronJobSpec extends js.Object {
  
  /**
    * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
    */
  var concurrencyPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
    */
  var failedJobsHistoryLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  var jobTemplate: Input[JobTemplateSpec] = js.native
  
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  var schedule: Input[String] = js.native
  
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
    */
  var startingDeadlineSeconds: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
    */
  var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.native
  
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
    */
  var suspend: js.UndefOr[Input[Boolean]] = js.native
}
object CronJobSpec {
  
  @scala.inline
  def apply(jobTemplate: Input[JobTemplateSpec], schedule: Input[String]): CronJobSpec = {
    val __obj = js.Dynamic.literal(jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobSpec]
  }
  
  @scala.inline
  implicit class CronJobSpecOps[Self <: CronJobSpec] (val x: Self) extends AnyVal {
    
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
    def setJobTemplate(value: Input[JobTemplateSpec]): Self = this.set("jobTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: Input[String]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrencyPolicy(value: Input[String]): Self = this.set("concurrencyPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrencyPolicy: Self = this.set("concurrencyPolicy", js.undefined)
    
    @scala.inline
    def setFailedJobsHistoryLimit(value: Input[Double]): Self = this.set("failedJobsHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedJobsHistoryLimit: Self = this.set("failedJobsHistoryLimit", js.undefined)
    
    @scala.inline
    def setStartingDeadlineSeconds(value: Input[Double]): Self = this.set("startingDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingDeadlineSeconds: Self = this.set("startingDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setSuccessfulJobsHistoryLimit(value: Input[Double]): Self = this.set("successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessfulJobsHistoryLimit: Self = this.set("successfulJobsHistoryLimit", js.undefined)
    
    @scala.inline
    def setSuspend(value: Input[Boolean]): Self = this.set("suspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspend: Self = this.set("suspend", js.undefined)
  }
}
