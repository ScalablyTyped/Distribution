package typings.atPulumiAws.kmsMod

import typings.atPulumiAws.kmsKeyMod.KeyArgs
import typings.atPulumiAws.kmsKeyMod.KeyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms", "Key")
@js.native
class Key protected ()
  extends typings.atPulumiAws.kmsKeyMod.Key {
  /**
    * Create a Key resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: KeyArgs) = this()
  def this(name: String, args: KeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/kms", "Key")
@js.native
object Key extends js.Object {
  /**
    * Get an existing Key resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsKeyMod.Key = js.native
  def get(name: String, id: Input[ID], state: KeyState): typings.atPulumiAws.kmsKeyMod.Key = js.native
  def get(name: String, id: Input[ID], state: KeyState, opts: CustomResourceOptions): typings.atPulumiAws.kmsKeyMod.Key = js.native
  /**
    * Returns true if the given object is an instance of Key.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/key.Key */ Boolean = js.native
}

