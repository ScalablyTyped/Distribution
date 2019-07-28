package typings.atPulumiAws.directoryserviceMod

import typings.atPulumiAws.directoryserviceConditionalForwaderMod.ConditionalForwaderArgs
import typings.atPulumiAws.directoryserviceConditionalForwaderMod.ConditionalForwaderState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directoryservice", "ConditionalForwader")
@js.native
class ConditionalForwader protected ()
  extends typings.atPulumiAws.directoryserviceConditionalForwaderMod.ConditionalForwader {
  /**
    * Create a ConditionalForwader resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConditionalForwaderArgs) = this()
  def this(name: String, args: ConditionalForwaderArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directoryservice", "ConditionalForwader")
@js.native
object ConditionalForwader extends js.Object {
  /**
    * Get an existing ConditionalForwader resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.directoryserviceConditionalForwaderMod.ConditionalForwader = js.native
  def get(name: String, id: Input[ID], state: ConditionalForwaderState): typings.atPulumiAws.directoryserviceConditionalForwaderMod.ConditionalForwader = js.native
  def get(name: String, id: Input[ID], state: ConditionalForwaderState, opts: CustomResourceOptions): typings.atPulumiAws.directoryserviceConditionalForwaderMod.ConditionalForwader = js.native
  /**
    * Returns true if the given object is an instance of ConditionalForwader.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/conditionalForwader.ConditionalForwader */ Boolean = js.native
}

