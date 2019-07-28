package typings.atPulumiAws.athenaNamedQueryMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/athena/namedQuery", "NamedQuery")
@js.native
class NamedQuery protected () extends CustomResource {
  /**
    * Create a NamedQuery resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NamedQueryArgs) = this()
  def this(name: String, args: NamedQueryArgs, opts: CustomResourceOptions) = this()
  /**
    * The database to which the query belongs.
    */
  val database: Output[String] = js.native
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: Output[String] = js.native
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: Output[String] = js.native
  /**
    * The workgroup to which the query belongs. Defaults to `primary`
    */
  val workgroup: Output[js.UndefOr[String]] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): NamedQuery = js.native
  def get(name: String, id: Input[ID], state: NamedQueryState): NamedQuery = js.native
  def get(name: String, id: Input[ID], state: NamedQueryState, opts: CustomResourceOptions): NamedQuery = js.native
  /**
    * Returns true if the given object is an instance of NamedQuery.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/namedQuery.NamedQuery */ Boolean = js.native
}

