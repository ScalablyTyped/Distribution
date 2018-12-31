package typings
package atPulumiAwsLib.glueConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/connection", "Connection")
@js.native
class Connection protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Connection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ConnectionArgs) = this()
  def this(name: java.lang.String, args: ConnectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: atPulumiPulumiLib.pulumiMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * The type of the connection. Defaults to `JBDC`.
    */
  val connectionType: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Description of the connection.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  val matchCriterias: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The name of the connection.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
    */
  val physicalConnectionRequirements: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_SubnetIdSecurityGroupIdLists]] = js.native
}

@JSImport("@pulumi/aws/glue/connection", "Connection")
@js.native
object Connection extends js.Object {
  /**
    * Get an existing Connection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueConnectionMod.Connection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueConnectionMod.ConnectionState
  ): atPulumiAwsLib.glueConnectionMod.Connection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueConnectionMod.ConnectionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glueConnectionMod.Connection = js.native
}

