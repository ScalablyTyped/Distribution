package typings
package atPulumiAwsLib.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "WebAcl")
@js.native
class WebAcl protected ()
  extends atPulumiAwsLib.wafWebAclMod.WebAcl {
  /**
    * Create a WebAcl resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.wafWebAclMod.WebAclArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.wafWebAclMod.WebAclArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/waf", "WebAcl")
@js.native
object WebAcl extends js.Object {
  /**
    * Get an existing WebAcl resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafWebAclMod.WebAcl = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafWebAclMod.WebAclState
  ): atPulumiAwsLib.wafWebAclMod.WebAcl = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafWebAclMod.WebAclState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.wafWebAclMod.WebAcl = js.native
}

