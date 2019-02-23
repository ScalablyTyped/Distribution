package typings
package atPulumiAwsLib.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront", "OriginAccessIdentity")
@js.native
class OriginAccessIdentity protected ()
  extends atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity {
  /**
    * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentityArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentityArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudfront", "OriginAccessIdentity")
@js.native
object OriginAccessIdentity extends js.Object {
  /**
    * Get an existing OriginAccessIdentity resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentityState
  ): atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentityState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity = js.native
}

