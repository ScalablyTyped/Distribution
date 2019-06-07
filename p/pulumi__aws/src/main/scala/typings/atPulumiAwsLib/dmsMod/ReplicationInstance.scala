package typings
package atPulumiAwsLib.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms", "ReplicationInstance")
@js.native
class ReplicationInstance protected ()
  extends atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstance {
  /**
    * Create a ReplicationInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/dms", "ReplicationInstance")
@js.native
object ReplicationInstance extends js.Object {
  /**
    * Get an existing ReplicationInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceState
  ): atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.dmsReplicationInstanceMod.ReplicationInstance = js.native
  /**
    * Returns true if the given object is an instance of ReplicationInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationInstance.ReplicationInstance */ scala.Boolean = js.native
}

