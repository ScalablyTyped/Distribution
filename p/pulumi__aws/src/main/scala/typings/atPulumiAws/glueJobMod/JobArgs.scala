package typings.atPulumiAws.glueJobMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.glue.JobCommand
import typings.atPulumiAws.typesInputMod.glue.JobExecutionProperty
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobArgs extends js.Object {
  /**
    * **DEPRECATED** (Optional) The number of AWS Glue data processing units (DPUs) to allocate to this Job. At least 2 DPUs need to be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory.
    */
  val allocatedCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The command of the job. Defined below.
    */
  val command: Input[JobCommand] = js.native
  /**
    * The list of connections used for this job.
    */
  val connections: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
    */
  val defaultArguments: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Description of the job.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Execution property of the job. Defined below.
    */
  val executionProperty: js.UndefOr[Input[JobExecutionProperty]] = js.native
  /**
    * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
    */
  val glueVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
    */
  val maxCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The maximum number of times to retry this job if it fails.
    */
  val maxRetries: js.UndefOr[Input[Double]] = js.native
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when a job runs.
    */
  val numberOfWorkers: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN of the IAM role associated with this job.
    */
  val roleArn: Input[String] = js.native
  /**
    * The name of the Security Configuration to be associated with the job.
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The job timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
    */
  val workerType: js.UndefOr[Input[String]] = js.native
}

object JobArgs {
  @scala.inline
  def apply(
    command: Input[JobCommand],
    roleArn: Input[String],
    allocatedCapacity: Input[Double] = null,
    connections: Input[js.Array[Input[String]]] = null,
    defaultArguments: Input[StringDictionary[_]] = null,
    description: Input[String] = null,
    executionProperty: Input[JobExecutionProperty] = null,
    glueVersion: Input[String] = null,
    maxCapacity: Input[Double] = null,
    maxRetries: Input[Double] = null,
    name: Input[String] = null,
    numberOfWorkers: Input[Double] = null,
    securityConfiguration: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    timeout: Input[Double] = null,
    workerType: Input[String] = null
  ): JobArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (allocatedCapacity != null) __obj.updateDynamic("allocatedCapacity")(allocatedCapacity.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (defaultArguments != null) __obj.updateDynamic("defaultArguments")(defaultArguments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionProperty != null) __obj.updateDynamic("executionProperty")(executionProperty.asInstanceOf[js.Any])
    if (glueVersion != null) __obj.updateDynamic("glueVersion")(glueVersion.asInstanceOf[js.Any])
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberOfWorkers != null) __obj.updateDynamic("numberOfWorkers")(numberOfWorkers.asInstanceOf[js.Any])
    if (securityConfiguration != null) __obj.updateDynamic("securityConfiguration")(securityConfiguration.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (workerType != null) __obj.updateDynamic("workerType")(workerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobArgs]
  }
}

