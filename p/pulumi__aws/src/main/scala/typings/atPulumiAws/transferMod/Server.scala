package typings.atPulumiAws.transferMod

import typings.atPulumiAws.transferServerMod.ServerArgs
import typings.atPulumiAws.transferServerMod.ServerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/transfer", "Server")
@js.native
class Server protected ()
  extends typings.atPulumiAws.transferServerMod.Server {
  /**
    * Create a Server resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ServerArgs) = this()
  def this(name: String, args: ServerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/transfer", "Server")
@js.native
object Server extends js.Object {
  /**
    * Get an existing Server resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.transferServerMod.Server = js.native
  def get(name: String, id: Input[ID], state: ServerState): typings.atPulumiAws.transferServerMod.Server = js.native
  def get(name: String, id: Input[ID], state: ServerState, opts: CustomResourceOptions): typings.atPulumiAws.transferServerMod.Server = js.native
  /**
    * Returns true if the given object is an instance of Server.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/transfer/server.Server */ Boolean = js.native
}

