package typings.pulumiAws.mltransformMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.MLTransformInputRecordTable
import typings.pulumiAws.outputMod.glue.MLTransformParameters
import typings.pulumiAws.outputMod.glue.MLTransformSchema
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/glue/mltransform", "MLTransform")
@js.native
class MLTransform protected () extends CustomResource {
  /**
    * Create a MLTransform resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MLTransformArgs) = this()
  def this(name: String, args: MLTransformArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of Glue ML Transform.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Description of the ML Transform.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
    */
  val glueVersion: Output_[String] = js.native
  
  /**
    * A list of AWS Glue table definitions used by the transform. see Input Record Tables.
    */
  val inputRecordTables: Output_[js.Array[MLTransformInputRecordTable]] = js.native
  
  /**
    * The number of labels available for this transform.
    */
  val labelCount: Output_[Double] = js.native
  
  /**
    * The number of AWS Glue data processing units (DPUs) that are allocated to task runs for this transform. You can allocate from `2` to `100` DPUs; the default is `10`. `maxCapacity` is a mutually exclusive option with `numberOfWorkers` and `workerType`.
    */
  val maxCapacity: Output_[Double] = js.native
  
  /**
    * The maximum number of times to retry this ML Transform if it fails.
    */
  val maxRetries: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The name you assign to this ML Transform. It must be unique in your account.
    */
  val name: Output_[String] = js.native
  
  /**
    * The number of workers of a defined `workerType` that are allocated when an ML Transform runs. Required with `workerType`.
    */
  val numberOfWorkers: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The algorithmic parameters that are specific to the transform type used. Conditionally dependent on the transform type. see Parameters.
    */
  val parameters: Output_[MLTransformParameters] = js.native
  
  /**
    * The ARN of the IAM role associated with this ML Transform.
    */
  val roleArn: Output_[String] = js.native
  
  /**
    * The object that represents the schema that this transform accepts. see Schema.
    */
  val schemas: Output_[js.Array[MLTransformSchema]] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The ML Transform timeout in minutes. The default is 2880 minutes (48 hours).
    */
  val timeout: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * The type of predefined worker that is allocated when an ML Transform runs. Accepts a value of `Standard`, `G.1X`, or `G.2X`. Required with `numberOfWorkers`.
    */
  val workerType: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/glue/mltransform", "MLTransform")
@js.native
object MLTransform extends js.Object {
  
  /**
    * Get an existing MLTransform resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): MLTransform = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MLTransform = js.native
  def get(name: String, id: Input[ID], state: MLTransformState): MLTransform = js.native
  def get(name: String, id: Input[ID], state: MLTransformState, opts: CustomResourceOptions): MLTransform = js.native
  
  /**
    * Returns true if the given object is an instance of MLTransform.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/mltransform.MLTransform */ Boolean = js.native
}
