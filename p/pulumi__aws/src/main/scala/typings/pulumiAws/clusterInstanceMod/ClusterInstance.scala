package typings.pulumiAws.clusterInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/docdb/clusterInstance", "ClusterInstance")
@js.native
class ClusterInstance protected () extends CustomResource {
  /**
    * Create a ClusterInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ClusterInstanceArgs) = this()
  def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: Output_[Boolean] = js.native
  
  /**
    * Amazon Resource Name (ARN) of cluster instance
    */
  val arn: Output_[String] = js.native
  
  /**
    * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
    */
  val autoMinorVersionUpgrade: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
    */
  val availabilityZone: Output_[String] = js.native
  
  /**
    * (Optional) The identifier of the CA certificate for the DB instance.
    */
  val caCertIdentifier: Output_[String] = js.native
  
  /**
    * The identifier of the `aws.docdb.Cluster` in which to launch this instance.
    */
  val clusterIdentifier: Output_[String] = js.native
  
  /**
    * The DB subnet group to associate with this DB instance.
    */
  val dbSubnetGroupName: Output_[String] = js.native
  
  /**
    * The region-unique, immutable identifier for the DB instance.
    */
  val dbiResourceId: Output_[String] = js.native
  
  /**
    * The DNS address for this instance. May not be writable
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
    */
  val engine: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The database engine version
    */
  val engineVersion: Output_[String] = js.native
  
  /**
    * The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: Output_[String] = js.native
  
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: Output_[String] = js.native
  
  /**
    * The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
    * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
    * - db.r4.large
    * - db.r4.xlarge
    * - db.r4.2xlarge
    * - db.r4.4xlarge
    * - db.r4.8xlarge
    * - db.r4.16xlarge
    */
  val instanceClass: Output_[String] = js.native
  
  /**
    * The ARN for the KMS encryption key if one is set to the cluster.
    */
  val kmsKeyId: Output_[String] = js.native
  
  /**
    * The database port
    */
  val port: Output_[Double] = js.native
  
  /**
    * The daily time range during which automated backups are created if automated backups are enabled.
    */
  val preferredBackupWindow: Output_[String] = js.native
  
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: Output_[String] = js.native
  
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: Output_[js.UndefOr[Double]] = js.native
  
  val publiclyAccessible: Output_[Boolean] = js.native
  
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  val storageEncrypted: Output_[Boolean] = js.native
  
  /**
    * A map of tags to assign to the instance.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: Output_[Boolean] = js.native
}
/* static members */
@JSImport("@pulumi/aws/docdb/clusterInstance", "ClusterInstance")
@js.native
object ClusterInstance extends js.Object {
  
  /**
    * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState): ClusterInstance = js.native
  def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): ClusterInstance = js.native
  
  /**
    * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterInstance.ClusterInstance */ Boolean = js.native
}
