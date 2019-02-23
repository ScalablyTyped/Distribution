package typings
package atPulumiAwsLib.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "SqlInjectionMatchSet")
@js.native
class SqlInjectionMatchSet protected ()
  extends atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet {
  /**
    * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/waf", "SqlInjectionMatchSet")
@js.native
object SqlInjectionMatchSet extends js.Object {
  /**
    * Get an existing SqlInjectionMatchSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetState
  ): atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.wafSqlInjectionMatchSetMod.SqlInjectionMatchSet = js.native
}

