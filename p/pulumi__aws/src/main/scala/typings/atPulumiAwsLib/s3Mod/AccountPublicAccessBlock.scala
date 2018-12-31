package typings
package atPulumiAwsLib.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "AccountPublicAccessBlock")
@js.native
class AccountPublicAccessBlock protected ()
  extends atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock {
  /**
    * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/s3", "AccountPublicAccessBlock")
@js.native
object AccountPublicAccessBlock extends js.Object {
  /**
    * Get an existing AccountPublicAccessBlock resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState
  ): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
}

