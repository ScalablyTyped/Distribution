package typings.atPulumiAws.cfgMod

import typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatusArgs
import typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatusState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", "RecorderStatus")
@js.native
class RecorderStatus protected ()
  extends typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatus {
  /**
    * Create a RecorderStatus resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RecorderStatusArgs) = this()
  def this(name: String, args: RecorderStatusArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cfg", "RecorderStatus")
@js.native
object RecorderStatus extends js.Object {
  /**
    * Get an existing RecorderStatus resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatus = js.native
  def get(name: String, id: Input[ID], state: RecorderStatusState): typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatus = js.native
  def get(name: String, id: Input[ID], state: RecorderStatusState, opts: CustomResourceOptions): typings.atPulumiAws.cfgRecorderStatusMod.RecorderStatus = js.native
  /**
    * Returns true if the given object is an instance of RecorderStatus.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorderStatus.RecorderStatus */ Boolean = js.native
}

