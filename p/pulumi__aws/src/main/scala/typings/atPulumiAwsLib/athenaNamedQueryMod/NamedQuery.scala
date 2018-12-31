package typings
package atPulumiAwsLib.athenaNamedQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/athena/namedQuery", "NamedQuery")
@js.native
class NamedQuery protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a NamedQuery resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: NamedQueryArgs) = this()
  def this(name: java.lang.String, args: NamedQueryArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The database to which the query belongs.
    */
  val database: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/athena/namedQuery", "NamedQuery")
@js.native
object NamedQuery extends js.Object {
  /**
    * Get an existing NamedQuery resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.athenaNamedQueryMod.NamedQuery = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.athenaNamedQueryMod.NamedQueryState
  ): atPulumiAwsLib.athenaNamedQueryMod.NamedQuery = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.athenaNamedQueryMod.NamedQueryState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.athenaNamedQueryMod.NamedQuery = js.native
}

