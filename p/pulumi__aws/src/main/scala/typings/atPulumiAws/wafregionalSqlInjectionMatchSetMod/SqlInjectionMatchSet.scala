package typings.atPulumiAws.wafregionalSqlInjectionMatchSetMod

import typings.atPulumiAws.typesOutputMod.wafregional.SqlInjectionMatchSetSqlInjectionMatchTuple
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional/sqlInjectionMatchSet", "SqlInjectionMatchSet")
@js.native
class SqlInjectionMatchSet protected () extends CustomResource {
  /**
    * Create a SqlInjectionMatchSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SqlInjectionMatchSetArgs) = this()
  def this(name: String, args: SqlInjectionMatchSetArgs, opts: CustomResourceOptions) = this()
  /**
    * The name or description of the SizeConstraintSet.
    */
  val name: Output[String] = js.native
  /**
    * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
    */
  val sqlInjectionMatchTuples: Output[js.UndefOr[js.Array[SqlInjectionMatchSetSqlInjectionMatchTuple]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/wafregional/sqlInjectionMatchSet", "SqlInjectionMatchSet")
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
  def get(name: String, id: Input[ID]): SqlInjectionMatchSet = js.native
  def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState): SqlInjectionMatchSet = js.native
  def get(name: String, id: Input[ID], state: SqlInjectionMatchSetState, opts: CustomResourceOptions): SqlInjectionMatchSet = js.native
  /**
    * Returns true if the given object is an instance of SqlInjectionMatchSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/wafregional/sqlInjectionMatchSet.SqlInjectionMatchSet */ Boolean = js.native
}

