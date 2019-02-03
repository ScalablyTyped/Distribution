package typings
package atPulumiAwsLib.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", "PlatformApplication")
@js.native
class PlatformApplication protected ()
  extends atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplication {
  /**
    * Create a PlatformApplication resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/sns", "PlatformApplication")
@js.native
object PlatformApplication extends js.Object {
  /**
    * Get an existing PlatformApplication resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplication = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationState
  ): atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplication = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplicationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.snsPlatformApplicationMod.PlatformApplication = js.native
}

