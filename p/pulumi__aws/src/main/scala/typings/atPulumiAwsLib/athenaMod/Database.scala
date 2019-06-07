package typings
package atPulumiAwsLib.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/athena", "Database")
@js.native
class Database protected ()
  extends atPulumiAwsLib.athenaDatabaseMod.Database {
  /**
    * Create a Database resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.athenaDatabaseMod.DatabaseArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.athenaDatabaseMod.DatabaseArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/athena", "Database")
@js.native
object Database extends js.Object {
  /**
    * Get an existing Database resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.athenaDatabaseMod.Database = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.athenaDatabaseMod.DatabaseState
  ): atPulumiAwsLib.athenaDatabaseMod.Database = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.athenaDatabaseMod.DatabaseState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.athenaDatabaseMod.Database = js.native
  /**
    * Returns true if the given object is an instance of Database.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/database.Database */ scala.Boolean = js.native
}

