package typings.pulumiAws.glueConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.ConnectionPhysicalConnectionRequirements
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/connection", "Connection")
@js.native
class Connection protected () extends CustomResource {
  /**
    * Create a Connection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ConnectionArgs) = this()
  def this(name: String, args: ConnectionArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the Glue Connection.
    */
  val arn: Output_[String] = js.native
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: Output_[String] = js.native
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: Output_[StringDictionary[String]] = js.native
  /**
    * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`. Defaults to `JBDC`.
    */
  val connectionType: Output_[js.UndefOr[String]] = js.native
  /**
    * Description of the connection.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  val matchCriterias: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * The name of the connection.
    */
  val name: Output_[String] = js.native
  /**
    * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
    */
  val physicalConnectionRequirements: Output_[js.UndefOr[ConnectionPhysicalConnectionRequirements]] = js.native
}

/* static members */
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Connection = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Connection = js.native
  def get(name: String, id: Input[ID], state: ConnectionState): Connection = js.native
  def get(name: String, id: Input[ID], state: ConnectionState, opts: CustomResourceOptions): Connection = js.native
  /**
    * Returns true if the given object is an instance of Connection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/connection.Connection */ Boolean = js.native
}

