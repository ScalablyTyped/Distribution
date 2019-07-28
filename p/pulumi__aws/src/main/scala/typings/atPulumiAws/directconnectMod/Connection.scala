package typings.atPulumiAws.directconnectMod

import typings.atPulumiAws.directconnectConnectionMod.ConnectionArgs
import typings.atPulumiAws.directconnectConnectionMod.ConnectionState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", "Connection")
@js.native
class Connection protected ()
  extends typings.atPulumiAws.directconnectConnectionMod.Connection {
  /**
    * Create a Connection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConnectionArgs) = this()
  def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/directconnect", "Connection")
@js.native
object Connection extends js.Object {
  /**
    * Get an existing Connection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectConnectionMod.Connection = js.native
  def get(name: String, id: Input[ID], state: ConnectionState): typings.atPulumiAws.directconnectConnectionMod.Connection = js.native
  def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectConnectionMod.Connection = js.native
  /**
    * Returns true if the given object is an instance of Connection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/connection.Connection */ Boolean = js.native
}

