package typings.pulumiAws.distributionConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.imagebuilder.DistributionConfigurationDistribution
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/imagebuilder/distributionConfiguration", "DistributionConfiguration")
@js.native
class DistributionConfiguration protected () extends CustomResource {
  /**
    * Create a DistributionConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DistributionConfigurationArgs) = this()
  def this(name: String, args: DistributionConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * (Required) Amazon Resource Name (ARN) of the distribution configuration.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Date the distribution configuration was created.
    */
  val dateCreated: Output_[String] = js.native
  
  /**
    * Date the distribution configuration was updated.
    */
  val dateUpdated: Output_[String] = js.native
  
  /**
    * Description to apply to the distributed AMI.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * One or more configuration blocks with distribution settings. Detailed below.
    */
  val distributions: Output_[js.Array[DistributionConfigurationDistribution]] = js.native
  
  /**
    * Name to apply to the distributed AMI.
    */
  val name: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags for the distribution configuration.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/imagebuilder/distributionConfiguration", "DistributionConfiguration")
@js.native
object DistributionConfiguration extends js.Object {
  
  /**
    * Get an existing DistributionConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DistributionConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DistributionConfiguration = js.native
  def get(name: String, id: Input[ID], state: DistributionConfigurationState): DistributionConfiguration = js.native
  def get(name: String, id: Input[ID], state: DistributionConfigurationState, opts: CustomResourceOptions): DistributionConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of DistributionConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/imagebuilder/distributionConfiguration.DistributionConfiguration */ Boolean = js.native
}
