package typings.atPulumiAws.cloudfrontMod

import typings.atPulumiAws.cloudfrontPublicKeyMod.PublicKeyArgs
import typings.atPulumiAws.cloudfrontPublicKeyMod.PublicKeyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudfront", "PublicKey")
@js.native
class PublicKey protected ()
  extends typings.atPulumiAws.cloudfrontPublicKeyMod.PublicKey {
  /**
    * Create a PublicKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PublicKeyArgs) = this()
  def this(name: String, args: PublicKeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudfront", "PublicKey")
@js.native
object PublicKey extends js.Object {
  /**
    * Get an existing PublicKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudfrontPublicKeyMod.PublicKey = js.native
  def get(name: String, id: Input[ID], state: PublicKeyState): typings.atPulumiAws.cloudfrontPublicKeyMod.PublicKey = js.native
  def get(name: String, id: Input[ID], state: PublicKeyState, opts: CustomResourceOptions): typings.atPulumiAws.cloudfrontPublicKeyMod.PublicKey = js.native
  /**
    * Returns true if the given object is an instance of PublicKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudfront/publicKey.PublicKey */ Boolean = js.native
}

