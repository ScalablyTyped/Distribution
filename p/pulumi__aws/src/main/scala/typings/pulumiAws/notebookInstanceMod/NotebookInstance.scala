package typings.pulumiAws.notebookInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance")
@js.native
class NotebookInstance protected () extends CustomResource {
  /**
    * Create a NotebookInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NotebookInstanceArgs) = this()
  def this(name: String, args: NotebookInstanceArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
    */
  val arn: Output_[String] = js.native
  /**
    * Set to `Disabled` to disable internet access to notebook. Requires `securityGroups` and `subnetId` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
    */
  val directInternetAccess: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of ML compute instance type.
    */
  val instanceType: Output_[String] = js.native
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
    */
  val kmsKeyId: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of a lifecycle configuration to associate with the notebook instance.
    */
  val lifecycleConfigName: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the notebook instance (must be unique).
    */
  val name: Output_[String] = js.native
  /**
    * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
    */
  val roleArn: Output_[String] = js.native
  /**
    * The associated security groups.
    */
  val securityGroups: Output_[js.Array[String]] = js.native
  /**
    * The VPC subnet ID.
    */
  val subnetId: Output_[js.UndefOr[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sagemaker/notebookInstance", "NotebookInstance")
@js.native
object NotebookInstance extends js.Object {
  /**
    * Get an existing NotebookInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NotebookInstance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NotebookInstance = js.native
  def get(name: String, id: Input[ID], state: NotebookInstanceState): NotebookInstance = js.native
  def get(name: String, id: Input[ID], state: NotebookInstanceState, opts: CustomResourceOptions): NotebookInstance = js.native
  /**
    * Returns true if the given object is an instance of NotebookInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/notebookInstance.NotebookInstance */ Boolean = js.native
}

