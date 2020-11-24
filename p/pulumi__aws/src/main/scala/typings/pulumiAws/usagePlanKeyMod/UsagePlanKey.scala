package typings.pulumiAws.usagePlanKeyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigateway/usagePlanKey", "UsagePlanKey")
@js.native
class UsagePlanKey protected () extends CustomResource {
  /**
    * Create a UsagePlanKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UsagePlanKeyArgs) = this()
  def this(name: String, args: UsagePlanKeyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The identifier of the API key resource.
    */
  val keyId: Output_[String] = js.native
  
  /**
    * The type of the API key resource. Currently, the valid key type is API_KEY.
    */
  val keyType: Output_[String] = js.native
  
  /**
    * The name of a usage plan key.
    */
  val name: Output_[String] = js.native
  
  /**
    * The Id of the usage plan resource representing to associate the key to.
    */
  val usagePlanId: Output_[String] = js.native
  
  /**
    * The value of a usage plan key.
    */
  val value: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigateway/usagePlanKey", "UsagePlanKey")
@js.native
object UsagePlanKey extends js.Object {
  
  /**
    * Get an existing UsagePlanKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): UsagePlanKey = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UsagePlanKey = js.native
  def get(name: String, id: Input[ID], state: UsagePlanKeyState): UsagePlanKey = js.native
  def get(name: String, id: Input[ID], state: UsagePlanKeyState, opts: CustomResourceOptions): UsagePlanKey = js.native
  
  /**
    * Returns true if the given object is an instance of UsagePlanKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/usagePlanKey.UsagePlanKey */ Boolean = js.native
}
