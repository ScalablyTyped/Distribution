package typings.atPulumiAws.cloudfrontMod

import typings.atPulumiAws.cloudfrontOriginAccessIdentityMod.OriginAccessIdentityArgs
import typings.atPulumiAws.cloudfrontOriginAccessIdentityMod.OriginAccessIdentityState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront", "OriginAccessIdentity")
@js.native
class OriginAccessIdentity protected ()
  extends typings.atPulumiAws.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity {
  /**
    * Create a OriginAccessIdentity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: OriginAccessIdentityArgs) = this()
  def this(name: String, args: OriginAccessIdentityArgs, opts: CustomResourceOptions) = this()
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity = js.native
  def get(name: String, id: Input[ID], state: OriginAccessIdentityState): typings.atPulumiAws.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity = js.native
  def get(name: String, id: Input[ID], state: OriginAccessIdentityState, opts: CustomResourceOptions): typings.atPulumiAws.cloudfrontOriginAccessIdentityMod.OriginAccessIdentity = js.native
  /**
    * Returns true if the given object is an instance of OriginAccessIdentity.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/originAccessIdentity.OriginAccessIdentity */ Boolean = js.native
}

