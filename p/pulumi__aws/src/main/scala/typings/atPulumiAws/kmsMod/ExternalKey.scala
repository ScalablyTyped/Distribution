package typings.atPulumiAws.kmsMod

import typings.atPulumiAws.kmsExternalKeyMod.ExternalKeyArgs
import typings.atPulumiAws.kmsExternalKeyMod.ExternalKeyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms", "ExternalKey")
@js.native
class ExternalKey protected ()
  extends typings.atPulumiAws.kmsExternalKeyMod.ExternalKey {
  /**
    * Create a ExternalKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ExternalKeyArgs) = this()
  def this(name: String, args: ExternalKeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/kms", "ExternalKey")
@js.native
object ExternalKey extends js.Object {
  /**
    * Get an existing ExternalKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
  def get(name: String, id: Input[ID], state: ExternalKeyState): typings.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
  def get(name: String, id: Input[ID], state: ExternalKeyState, opts: CustomResourceOptions): typings.atPulumiAws.kmsExternalKeyMod.ExternalKey = js.native
  /**
    * Returns true if the given object is an instance of ExternalKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/externalKey.ExternalKey */ Boolean = js.native
}

