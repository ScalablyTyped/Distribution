package typings.atPulumiAws.rdsGlobalClusterMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/globalCluster", "GlobalCluster")
@js.native
class GlobalCluster protected () extends CustomResource {
  /**
    * Create a GlobalCluster resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GlobalClusterArgs) = this()
  def this(name: String, args: GlobalClusterArgs, opts: CustomResourceOptions) = this()
  /**
    * RDS Global Cluster Amazon Resource Name (ARN)
    */
  val arn: Output[String] = js.native
  /**
    * Name for an automatically created database on cluster creation.
    */
  val databaseName: Output[js.UndefOr[String]] = js.native
  /**
    * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Name of the database engine to be used for this DB cluster. Valid values: `aurora`. Defaults to `aurora`.
    */
  val engine: Output[js.UndefOr[String]] = js.native
  /**
    * Engine version of the Aurora global database.
    */
  val engineVersion: Output[String] = js.native
  /**
    * The global cluster identifier.
    */
  val globalClusterIdentifier: Output[String] = js.native
  /**
    * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
    */
  val globalClusterResourceId: Output[String] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: Output[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/globalCluster", "GlobalCluster")
@js.native
object GlobalCluster extends js.Object {
  /**
    * Get an existing GlobalCluster resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): GlobalCluster = js.native
  def get(name: String, id: Input[ID], state: GlobalClusterState): GlobalCluster = js.native
  def get(name: String, id: Input[ID], state: GlobalClusterState, opts: CustomResourceOptions): GlobalCluster = js.native
  /**
    * Returns true if the given object is an instance of GlobalCluster.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/globalCluster.GlobalCluster */ Boolean = js.native
}

