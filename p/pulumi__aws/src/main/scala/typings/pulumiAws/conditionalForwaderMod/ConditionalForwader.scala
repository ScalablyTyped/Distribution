package typings.pulumiAws.conditionalForwaderMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader")
@js.native
class ConditionalForwader protected () extends CustomResource {
  /**
    * Create a ConditionalForwader resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConditionalForwaderArgs) = this()
  def this(name: String, args: ConditionalForwaderArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The id of directory.
    */
  val directoryId: Output_[String] = js.native
  
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: Output_[js.Array[String]] = js.native
  
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/directoryservice/conditionalForwader", "ConditionalForwader")
@js.native
object ConditionalForwader extends js.Object {
  
  /**
    * Get an existing ConditionalForwader resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ConditionalForwader = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ConditionalForwader = js.native
  def get(name: String, id: Input[ID], state: ConditionalForwaderState): ConditionalForwader = js.native
  def get(name: String, id: Input[ID], state: ConditionalForwaderState, opts: CustomResourceOptions): ConditionalForwader = js.native
  
  /**
    * Returns true if the given object is an instance of ConditionalForwader.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/conditionalForwader.ConditionalForwader */ Boolean = js.native
}
