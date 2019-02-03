package typings
package atPulumiAwsLib.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks", "StaticWebLayer")
@js.native
class StaticWebLayer protected ()
  extends atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer {
  /**
    * Create a StaticWebLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/opsworks", "StaticWebLayer")
@js.native
object StaticWebLayer extends js.Object {
  /**
    * Get an existing StaticWebLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerState
  ): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
}

