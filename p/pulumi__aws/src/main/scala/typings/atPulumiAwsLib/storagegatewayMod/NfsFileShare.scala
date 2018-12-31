package typings
package atPulumiAwsLib.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/storagegateway", "NfsFileShare")
@js.native
class NfsFileShare protected ()
  extends atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare {
  /**
    * Create a NfsFileShare resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/storagegateway", "NfsFileShare")
@js.native
object NfsFileShare extends js.Object {
  /**
    * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareState
  ): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShareState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.storagegatewayNfsFileShareMod.NfsFileShare = js.native
}

