package typings.pulumiAws.infrastructureConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.InfrastructureConfigurationLogging
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration")
@js.native
class InfrastructureConfiguration protected () extends CustomResource {
  /**
    * Create a InfrastructureConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: InfrastructureConfigurationArgs) = this()
  def this(name: String, args: InfrastructureConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Date when the configuration was created.
    */
  val dateCreated: Output_[String] = js.native
  
  /**
    * Date when the configuration was updated.
    */
  val dateUpdated: Output_[String] = js.native
  
  /**
    * Description for the configuration.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Name of IAM Instance Profile.
    */
  val instanceProfileName: Output_[String] = js.native
  
  /**
    * Set of EC2 Instance Types.
    */
  val instanceTypes: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Name of EC2 Key Pair.
    */
  val keyPair: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Configuration block with logging settings. Detailed below.
    */
  val logging: Output_[js.UndefOr[InfrastructureConfigurationLogging]] = js.native
  
  /**
    * Name for the configuration.
    */
  val name: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags to assign to infrastructure created by the configuration.
    */
  val resourceTags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Set of EC2 Security Group identifiers.
    */
  val securityGroupIds: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of SNS Topic.
    */
  val snsTopicArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * EC2 Subnet identifier. Also requires `securityGroupIds` argument.
    */
  val subnetId: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Key-value map of resource tags to assign to the configuration.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Enable if the instance should be terminated when the pipeline fails. Defaults to `false`.
    */
  val terminateInstanceOnFailure: Output_[js.UndefOr[Boolean]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/imagebuilder/infrastructureConfiguration", "InfrastructureConfiguration")
@js.native
object InfrastructureConfiguration extends js.Object {
  
  /**
    * Get an existing InfrastructureConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): InfrastructureConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): InfrastructureConfiguration = js.native
  def get(name: String, id: Input[ID], state: InfrastructureConfigurationState): InfrastructureConfiguration = js.native
  def get(name: String, id: Input[ID], state: InfrastructureConfigurationState, opts: CustomResourceOptions): InfrastructureConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of InfrastructureConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/infrastructureConfiguration.InfrastructureConfiguration */ Boolean = js.native
}
