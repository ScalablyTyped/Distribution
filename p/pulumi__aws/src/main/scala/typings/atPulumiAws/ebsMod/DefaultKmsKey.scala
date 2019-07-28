package typings.atPulumiAws.ebsMod

import typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKeyArgs
import typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKeyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs", "DefaultKmsKey")
@js.native
class DefaultKmsKey protected ()
  extends typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey {
  /**
    * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DefaultKmsKeyArgs) = this()
  def this(name: String, args: DefaultKmsKeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ebs", "DefaultKmsKey")
@js.native
object DefaultKmsKey extends js.Object {
  /**
    * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
  def get(name: String, id: Input[ID], state: DefaultKmsKeyState): typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
  def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): typings.atPulumiAws.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
  /**
    * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = js.native
}

