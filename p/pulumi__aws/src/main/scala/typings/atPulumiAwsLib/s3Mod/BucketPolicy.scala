package typings
package atPulumiAwsLib.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "BucketPolicy")
@js.native
class BucketPolicy protected ()
  extends atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy {
  /**
    * Create a BucketPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/s3", "BucketPolicy")
@js.native
object BucketPolicy extends js.Object {
  /**
    * Get an existing BucketPolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyState
  ): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketPolicyMod.BucketPolicyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3BucketPolicyMod.BucketPolicy = js.native
}

