package typings
package atPulumiAwsLib.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs", "DefaultKmsKey")
@js.native
class DefaultKmsKey protected ()
  extends atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKey {
  /**
    * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyState
  ): atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKeyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ebsDefaultKmsKeyMod.DefaultKmsKey = js.native
  /**
    * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ scala.Boolean = js.native
}

