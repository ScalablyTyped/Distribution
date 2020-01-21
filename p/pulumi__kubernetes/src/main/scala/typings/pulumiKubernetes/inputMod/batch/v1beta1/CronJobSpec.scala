package typings.pulumiKubernetes.inputMod.batch.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var concurrencyPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of failed finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified. Defaults to 1.
    */
  var failedJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Specifies the job that will be created when executing a CronJob.
    */
  var jobTemplate: Input[JobTemplateSpec]
  /**
    * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
    */
  var schedule: Input[String]
  /**
    * Optional deadline in seconds for starting the job if it misses scheduled time for any
    * reason.  Missed jobs executions will be counted as failed ones.
    */
  var startingDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The number of successful finished jobs to retain. This is a pointer to distinguish between
    * explicit zero and not specified. Defaults to 3.
    */
  var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * This flag tells the controller to suspend subsequent executions, it does not apply to
    * already started executions.  Defaults to false.
    */
  var suspend: js.UndefOr[Input[Boolean]] = js.undefined
}

object CronJobSpec {
  @scala.inline
  def apply(
    jobTemplate: Input[JobTemplateSpec],
    schedule: Input[String],
    concurrencyPolicy: Input[String] = null,
    failedJobsHistoryLimit: Input[Double] = null,
    startingDeadlineSeconds: Input[Double] = null,
    successfulJobsHistoryLimit: Input[Double] = null,
    suspend: Input[Boolean] = null
  ): CronJobSpec = {
    val __obj = js.Dynamic.literal(jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    if (concurrencyPolicy != null) __obj.updateDynamic("concurrencyPolicy")(concurrencyPolicy.asInstanceOf[js.Any])
    if (failedJobsHistoryLimit != null) __obj.updateDynamic("failedJobsHistoryLimit")(failedJobsHistoryLimit.asInstanceOf[js.Any])
    if (startingDeadlineSeconds != null) __obj.updateDynamic("startingDeadlineSeconds")(startingDeadlineSeconds.asInstanceOf[js.Any])
    if (successfulJobsHistoryLimit != null) __obj.updateDynamic("successfulJobsHistoryLimit")(successfulJobsHistoryLimit.asInstanceOf[js.Any])
    if (suspend != null) __obj.updateDynamic("suspend")(suspend.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronJobSpec]
  }
}

