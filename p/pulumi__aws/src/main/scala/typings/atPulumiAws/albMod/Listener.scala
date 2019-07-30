package typings.atPulumiAws.albMod

import typings.atPulumiAws.albListenerMod.ListenerArgs
import typings.atPulumiAws.albListenerMod.ListenerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/alb", "Listener")
@js.native
class Listener protected ()
  extends typings.atPulumiAws.albListenerMod.Listener {
  /**
    * Create a Listener resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ListenerArgs) = this()
  def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/alb", "Listener")
@js.native
object Listener extends js.Object {
  /**
    * Get an existing Listener resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.albListenerMod.Listener = js.native
  def get(name: String, id: Input[ID], state: ListenerState): typings.atPulumiAws.albListenerMod.Listener = js.native
  def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): typings.atPulumiAws.albListenerMod.Listener = js.native
  /**
    * Returns true if the given object is an instance of Listener.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/alb/listener.Listener */ Boolean = js.native
}

