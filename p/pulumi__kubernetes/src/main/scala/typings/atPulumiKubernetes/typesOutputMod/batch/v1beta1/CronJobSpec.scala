package typings.atPulumiKubernetes.typesOutputMod.batch.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CronJobSpec describes how the job execution will look like and when it will actually run.
  */
trait CronJobSpec extends js.Object {
  /**
    * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow"
    * (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs,
    * skipping next run if previous run hasn't finished yet; - "Replace": cancels currently
    * running job and replaces it with a new one
    */
  val concurrencyPolicy: String
  /**
    * The number of failed finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified. Defaults to 1.
    */
  val failedJobsHistoryLimit: Double
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  val jobTemplate: JobTemplateSpec
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  val schedule: String
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any
    * reason.  Missed jobs executions will be counted as failed ones.
    */
  val startingDeadlineSeconds: Double
  /**
    * The number of successful finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified. Defaults to 3.
    */
  val successfulJobsHistoryLimit: Double
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to
    * already started executions.  Defaults to false.
    */
  val suspend: Boolean
}

object CronJobSpec {
  @scala.inline
  def apply(
    concurrencyPolicy: String,
    failedJobsHistoryLimit: Double,
    jobTemplate: JobTemplateSpec,
    schedule: String,
    startingDeadlineSeconds: Double,
    successfulJobsHistoryLimit: Double,
    suspend: Boolean
  ): CronJobSpec = {
    val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy.asInstanceOf[js.Any], failedJobsHistoryLimit = failedJobsHistoryLimit.asInstanceOf[js.Any], jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], startingDeadlineSeconds = startingDeadlineSeconds.asInstanceOf[js.Any], successfulJobsHistoryLimit = successfulJobsHistoryLimit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CronJobSpec]
  }
}

