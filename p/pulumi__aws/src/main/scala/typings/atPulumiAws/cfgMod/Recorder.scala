package typings.atPulumiAws.cfgMod

import typings.atPulumiAws.cfgRecorderMod.RecorderArgs
import typings.atPulumiAws.cfgRecorderMod.RecorderState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cfg", "Recorder")
@js.native
class Recorder protected ()
  extends typings.atPulumiAws.cfgRecorderMod.Recorder {
  /**
    * Create a Recorder resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: RecorderArgs) = this()
  def this(name: String, args: RecorderArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cfg", "Recorder")
@js.native
object Recorder extends js.Object {
  /**
    * Get an existing Recorder resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cfgRecorderMod.Recorder = js.native
  def get(name: String, id: Input[ID], state: RecorderState): typings.atPulumiAws.cfgRecorderMod.Recorder = js.native
  def get(name: String, id: Input[ID], state: RecorderState, opts: CustomResourceOptions): typings.atPulumiAws.cfgRecorderMod.Recorder = js.native
  /**
    * Returns true if the given object is an instance of Recorder.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cfg/recorder.Recorder */ Boolean = js.native
}

