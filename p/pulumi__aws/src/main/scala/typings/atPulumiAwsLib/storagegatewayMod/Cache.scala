package typings
package atPulumiAwsLib.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway", "Cache")
@js.native
class Cache protected ()
  extends atPulumiAwsLib.storagegatewayCacheMod.Cache {
  /**
    * Create a Cache resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayCacheMod.CacheArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayCacheMod.CacheArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/storagegateway", "Cache")
@js.native
object Cache extends js.Object {
  /**
    * Get an existing Cache resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayCacheMod.Cache = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayCacheMod.CacheState
  ): atPulumiAwsLib.storagegatewayCacheMod.Cache = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayCacheMod.CacheState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.storagegatewayCacheMod.Cache = js.native
}

