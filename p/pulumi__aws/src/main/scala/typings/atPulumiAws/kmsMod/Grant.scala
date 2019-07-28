package typings.atPulumiAws.kmsMod

import typings.atPulumiAws.kmsGrantMod.GrantArgs
import typings.atPulumiAws.kmsGrantMod.GrantState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kms", "Grant")
@js.native
class Grant protected ()
  extends typings.atPulumiAws.kmsGrantMod.Grant {
  /**
    * Create a Grant resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GrantArgs) = this()
  def this(name: String, args: GrantArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/kms", "Grant")
@js.native
object Grant extends js.Object {
  /**
    * Get an existing Grant resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.kmsGrantMod.Grant = js.native
  def get(name: String, id: Input[ID], state: GrantState): typings.atPulumiAws.kmsGrantMod.Grant = js.native
  def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): typings.atPulumiAws.kmsGrantMod.Grant = js.native
  /**
    * Returns true if the given object is an instance of Grant.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = js.native
}

