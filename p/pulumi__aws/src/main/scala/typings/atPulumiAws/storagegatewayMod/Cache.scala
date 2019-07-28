package typings.atPulumiAws.storagegatewayMod

import typings.atPulumiAws.storagegatewayCacheMod.CacheArgs
import typings.atPulumiAws.storagegatewayCacheMod.CacheState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway", "Cache")
@js.native
class Cache protected ()
  extends typings.atPulumiAws.storagegatewayCacheMod.Cache {
  /**
    * Create a Cache resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CacheArgs) = this()
  def this(name: String, args: CacheArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.storagegatewayCacheMod.Cache = js.native
  def get(name: String, id: Input[ID], state: CacheState): typings.atPulumiAws.storagegatewayCacheMod.Cache = js.native
  def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): typings.atPulumiAws.storagegatewayCacheMod.Cache = js.native
  /**
    * Returns true if the given object is an instance of Cache.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = js.native
}

