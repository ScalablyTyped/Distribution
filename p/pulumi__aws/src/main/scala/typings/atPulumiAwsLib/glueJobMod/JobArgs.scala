package typings
package atPulumiAwsLib.glueJobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobArgs extends js.Object {
  /**
    * The number of AWS Glue data processing units (DPUs) to allocate to this Job. At least 2 DPUs need to be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory.
    */
  val allocatedCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The command of the job. Defined below.
    */
  val command: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameScriptLocationInput]
  /**
    * The list of connections used for this job.
    */
  val connections: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
    */
  val defaultArguments: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Description of the job.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Execution property of the job. Defined below.
    */
  val executionProperty: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MaxConcurrentRunsInput]] = js.undefined
  /**
    * The maximum number of times to retry this job if it fails.
    */
  val maxRetries: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the IAM role associated with this job.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the Security Configuration to be associated with the job.
    */
  val securityConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The job timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object JobArgs {
  @scala.inline
  def apply(
    command: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_NameScriptLocationInput],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    allocatedCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    connections: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    defaultArguments: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    executionProperty: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MaxConcurrentRunsInput] = null,
    maxRetries: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityConfiguration: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    timeout: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): JobArgs = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (allocatedCapacity != null) __obj.updateDynamic("allocatedCapacity")(allocatedCapacity.asInstanceOf[js.Any])
    if (connections != null) __obj.updateDynamic("connections")(connections.asInstanceOf[js.Any])
    if (defaultArguments != null) __obj.updateDynamic("defaultArguments")(defaultArguments.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionProperty != null) __obj.updateDynamic("executionProperty")(executionProperty.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (securityConfiguration != null) __obj.updateDynamic("securityConfiguration")(securityConfiguration.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobArgs]
  }
}

