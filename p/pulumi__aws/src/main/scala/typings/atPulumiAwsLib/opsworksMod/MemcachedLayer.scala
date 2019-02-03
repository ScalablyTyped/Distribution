package typings
package atPulumiAwsLib.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "MemcachedLayer")
@js.native
class MemcachedLayer protected ()
  extends atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayer {
  /**
    * Create a MemcachedLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "MemcachedLayer")
@js.native
object MemcachedLayer extends js.Object {
  /**
    * Get an existing MemcachedLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerState
  ): atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksMemcachedLayerMod.MemcachedLayer = js.native
}

