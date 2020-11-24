package typings.pulumiAws.aliasMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.gamelift.AliasRoutingStrategy
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/gamelift/alias", "Alias")
@js.native
class Alias protected () extends CustomResource {
  /**
    * Create a Alias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AliasArgs) = this()
  def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Alias ARN.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Description of the alias.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Name of the alias.
    */
  val name: Output_[String] = js.native
  
  /**
    * Specifies the fleet and/or routing type to use for the alias.
    */
  val routingStrategy: Output_[AliasRoutingStrategy] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/gamelift/alias", "Alias")
@js.native
object Alias extends js.Object {
  
  /**
    * Get an existing Alias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Alias = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState): Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): Alias = js.native
  
  /**
    * Returns true if the given object is an instance of Alias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/alias.Alias */ Boolean = js.native
}
