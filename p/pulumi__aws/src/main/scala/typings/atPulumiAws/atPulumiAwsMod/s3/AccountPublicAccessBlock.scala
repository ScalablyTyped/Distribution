package typings.atPulumiAws.atPulumiAwsMod.s3

import typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockArgs
import typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlockState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock")
@js.native
class AccountPublicAccessBlock protected ()
  extends typings.atPulumiAws.s3Mod.AccountPublicAccessBlock {
  /**
    * Create a AccountPublicAccessBlock resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AccountPublicAccessBlockArgs) = this()
  def this(name: String, args: AccountPublicAccessBlockArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "s3.AccountPublicAccessBlock")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState): typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  def get(name: String, id: Input[ID], state: AccountPublicAccessBlockState, opts: CustomResourceOptions): typings.atPulumiAws.s3AccountPublicAccessBlockMod.AccountPublicAccessBlock = js.native
  /**
    * Returns true if the given object is an instance of AccountPublicAccessBlock.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/accountPublicAccessBlock.AccountPublicAccessBlock */ Boolean = js.native
}

