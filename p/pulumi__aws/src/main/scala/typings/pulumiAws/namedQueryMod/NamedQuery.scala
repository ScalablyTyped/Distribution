package typings.pulumiAws.namedQueryMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val database: Output_[String] = js.native
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: Output_[String] = js.native
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: Output_[String] = js.native
  /**
    * The workgroup to which the query belongs. Defaults to `primary`
    */
  val workgroup: Output_[js.UndefOr[String]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NamedQuery = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NamedQuery = js.native
  def get(name: String, id: Input[ID], state: NamedQueryState): NamedQuery = js.native
  def get(name: String, id: Input[ID], state: NamedQueryState, opts: CustomResourceOptions): NamedQuery = js.native
  /**
    * Returns true if the given object is an instance of NamedQuery.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/namedQuery.NamedQuery */ Boolean = js.native
}

