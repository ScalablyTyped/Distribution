package typings
package atPulumiAwsLib.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional", "XssMatchSet")
@js.native
class XssMatchSet protected ()
  extends atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSet {
  /**
    * Create a XssMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSetArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/wafregional", "XssMatchSet")
@js.native
object XssMatchSet extends js.Object {
  /**
    * Get an existing XssMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSetState
  ): atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.wafregionalXssMatchSetMod.XssMatchSet = js.native
}

