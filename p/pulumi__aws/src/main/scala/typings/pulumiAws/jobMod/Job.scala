package typings.pulumiAws.jobMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.JobCommand
import typings.pulumiAws.outputMod.glue.JobExecutionProperty
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val allocatedCapacity: Output_[Double] = js.native
  /**
    * Amazon Resource Name (ARN) of Glue Job
    */
  val arn: Output_[String] = js.native
  /**
    * The command of the job. Defined below.
    */
  val command: Output_[JobCommand] = js.native
  /**
    * The list of connections used for this job.
    */
  val connections: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
    */
  val defaultArguments: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Description of the job.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Execution property of the job. Defined below.
    */
  val executionProperty: Output_[JobExecutionProperty] = js.native
  /**
    * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
    */
  val glueVersion: Output_[String] = js.native
  /**
    * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs.
    */
  val maxCapacity: Output_[Double] = js.native
  /**
    * The maximum number of times to retry this job if it fails.
    */
  val maxRetries: Output_[js.UndefOr[Double]] = js.native
  /**
    * The name of the job command. Defaults to `glueetl`
    */
  val name: Output_[String] = js.native
  /**
    * The number of workers of a defined workerType that are allocated when a job runs.
    */
  val numberOfWorkers: Output_[js.UndefOr[Double]] = js.native
  /**
    * The ARN of the IAM role associated with this job.
    */
  val roleArn: Output_[String] = js.native
  /**
    * The name of the Security Configuration to be associated with the job.
    */
  val securityConfiguration: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The job timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: Output_[js.UndefOr[Double]] = js.native
  /**
    * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
    */
  val workerType: Output_[js.UndefOr[String]] = js.native
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

