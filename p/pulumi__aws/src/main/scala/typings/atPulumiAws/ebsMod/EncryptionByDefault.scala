package typings.atPulumiAws.ebsMod

import typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefaultArgs
import typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefaultState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs", "EncryptionByDefault")
@js.native
class EncryptionByDefault protected ()
  extends typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault {
  /**
    * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EncryptionByDefaultArgs) = this()
  def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ebs", "EncryptionByDefault")
@js.native
object EncryptionByDefault extends js.Object {
  /**
    * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
  def get(name: String, id: Input[ID], state: EncryptionByDefaultState): typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
  def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): typings.atPulumiAws.ebsEncryptionByDefaultMod.EncryptionByDefault = js.native
  /**
    * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
}

