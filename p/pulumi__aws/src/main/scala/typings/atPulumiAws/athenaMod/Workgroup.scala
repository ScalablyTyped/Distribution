package typings.atPulumiAws.athenaMod

import typings.atPulumiAws.athenaWorkgroupMod.WorkgroupArgs
import typings.atPulumiAws.athenaWorkgroupMod.WorkgroupState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/athena", "Workgroup")
@js.native
class Workgroup protected ()
  extends typings.atPulumiAws.athenaWorkgroupMod.Workgroup {
  /**
    * Create a Workgroup resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: WorkgroupArgs) = this()
  def this(name: String, args: WorkgroupArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/athena", "Workgroup")
@js.native
object Workgroup extends js.Object {
  /**
    * Get an existing Workgroup resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.athenaWorkgroupMod.Workgroup = js.native
  def get(name: String, id: Input[ID], state: WorkgroupState): typings.atPulumiAws.athenaWorkgroupMod.Workgroup = js.native
  def get(name: String, id: Input[ID], state: WorkgroupState, opts: CustomResourceOptions): typings.atPulumiAws.athenaWorkgroupMod.Workgroup = js.native
  /**
    * Returns true if the given object is an instance of Workgroup.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/workgroup.Workgroup */ Boolean = js.native
}

