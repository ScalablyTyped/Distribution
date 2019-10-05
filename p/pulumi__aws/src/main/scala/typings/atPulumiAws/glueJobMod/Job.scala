package typings.atPulumiAws.glueJobMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.glue.JobCommand
import typings.atPulumiAws.typesOutputMod.glue.JobExecutionProperty
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/job", "Job")
@js.native
class Job protected () extends CustomResource {
  /**
    * Create a Job resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: JobArgs) = this()
  def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
  /**
    * **DEPRECATED** (Optional) The number of AWS Glue data processing units (DPUs) to allocate to this Job. At least 2 DPUs need to be allocated; the default is 10. A DPU is a relative measure of processing power that consists of 4 vCPUs of compute capacity and 16 GB of memory.
    */
  val allocatedCapacity: Output[Double] = js.native
  /**
    * The command of the job. Defined below.
    */
  val command: Output[JobCommand] = js.native
  /**
    * The list of connections used for this job.
    */
  val connections: Output[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
    */
  val defaultArguments: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Description of the job.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Execution property of the job. Defined below.
    */
  val executionProperty: Output[JobExecutionProperty] = js.native
  /**
    * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
    */
  val maxCapacity: Output[Double] = js.native
  /**
    * The maximum number of times to retry this job if it fails.
    */
  val maxRetries: Output[js.UndefOr[Double]] = js.native
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  val name: Output[String] = js.native
  /**
    * The ARN of the IAM role associated with this job.
    */
  val roleArn: Output[String] = js.native
  /**
    * The name of the Security Configuration to be associated with the job.
    */
  val securityConfiguration: Output[js.UndefOr[String]] = js.native
  /**
    * The job timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: Output[js.UndefOr[Double]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/glue/job", "Job")
@js.native
object Job extends js.Object {
  /**
    * Get an existing Job resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Job = js.native
  def get(name: String, id: Input[ID], state: JobState): Job = js.native
  def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): Job = js.native
  /**
    * Returns true if the given object is an instance of Job.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = js.native
}

