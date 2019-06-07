package typings
package atPulumiAwsLib.batchJobDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch/jobDefinition", "JobDefinition")
@js.native
class JobDefinition protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a JobDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: JobDefinitionArgs) = this()
  def this(name: java.lang.String, args: JobDefinitionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name of the job definition.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A valid [container properties](http://docs.aws.amazon.com/batch/latest/APIReference/API_RegisterJobDefinition.html)
    * provided as a single valid JSON document. This parameter is required if the `type` parameter is `container`.
    */
  val containerProperties: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Specifies the name of the job definition.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies the parameter substitution placeholders to set in the job definition.
    */
  val parameters: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  /**
    * Specifies the retry strategy to use for failed jobs that are submitted with this job definition.
    * Maximum number of `retry_strategy` is `1`.  Defined below.
    */
  val retryStrategy: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Attempts]] = js.native
  /**
    * The revision of the job definition.
    */
  val revision: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Specifies the timeout for jobs so that if a job runs longer, AWS Batch terminates the job. Maximum number of `timeout` is `1`. Defined below.
    */
  val timeout: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AttemptDurationSeconds]] = js.native
  /**
    * The type of job definition.  Must be `container`
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/batch/jobDefinition", "JobDefinition")
@js.native
object JobDefinition extends js.Object {
  /**
    * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionState
  ): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
  /**
    * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ scala.Boolean = js.native
}

