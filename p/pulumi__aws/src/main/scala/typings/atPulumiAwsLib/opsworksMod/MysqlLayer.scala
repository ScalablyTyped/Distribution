package typings
package atPulumiAwsLib.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "MysqlLayer")
@js.native
class MysqlLayer protected ()
  extends atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayer {
  /**
    * Create a MysqlLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "MysqlLayer")
@js.native
object MysqlLayer extends js.Object {
  /**
    * Get an existing MysqlLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerState
  ): atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksMysqlLayerMod.MysqlLayer = js.native
}

