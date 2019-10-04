package typings.atPulumiAws.glueJobMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.glueNs.JobCommand
import typings.atPulumiAws.typesInputMod.glueNs.JobExecutionProperty
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobState extends js.Object {
  /**
    * **DEPRECATED** (Optional) The number of AWS Glue data processing units (DPUs) to allocate to this Job. At least 2 DPUs need to be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory.
    */
  val allocatedCapacity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The command of the job. Defined below.
    */
  val command: js.UndefOr[Input[JobCommand]] = js.undefined
  /**
    * The list of connections used for this job.
    */
  val connections: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
    */
  val defaultArguments: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Description of the job.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Execution property of the job. Defined below.
    */
  val executionProperty: js.UndefOr[Input[JobExecutionProperty]] = js.undefined
  /**
    * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
    */
  val maxCapacity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The maximum number of times to retry this job if it fails.
    */
  val maxRetries: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the IAM role associated with this job.
    */
  val roleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the Security Configuration to be associated with the job.
    */
  val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
  /**
    * The job timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: js.UndefOr[Input[Double]] = js.undefined
}

object JobState {
  @scala.inline
  def apply(
    allocatedCapacity: Input[Double] = null,
    command: Input[JobCommand] = null,
    connections: Input[js.Array[Input[String]]] = null,
    defaultArguments: Input[StringDictionary[_]] = null,
    description: Input[String] = null,
    executionProperty: Input[JobExecutionProperty] = null,
    maxCapacity: Input[Double] = null,
    maxRetries: Input[Double] = null,
    name: Input[String] = null,
    roleArn: Input[String] = null,
    securityConfiguration: Input[String] = null,
    timeout: Input[Double] = null
  ): JobState = {
    val __obj = js.Dynamic.literal()
    if (allocatedCapacity != null) __obj.updateDynamic("allocatedCapacity")(allocatedCapacity.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (defaultArguments != null) __obj.updateDynamic("defaultArguments")(defaultArguments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionProperty != null) __obj.updateDynamic("executionProperty")(executionProperty.asInstanceOf[js.Any])
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (securityConfiguration != null) __obj.updateDynamic("securityConfiguration")(securityConfiguration.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobState]
  }
}

