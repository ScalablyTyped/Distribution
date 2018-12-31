package typings
package atPulumiAwsLib.neptuneClusterInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance")
@js.native
class ClusterInstance protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ClusterInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ClusterInstanceArgs) = this()
  def this(name: java.lang.String, args: ClusterInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The hostname of the instance. See also `endpoint` and `port`.
    */
  val address: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether any instance modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * Amazon Resource Name (ARN) of neptune instance
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
    */
  val autoMinorVersionUpgrade: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The EC2 Availability Zone that the neptune instance is created in.
    */
  val availabilityZone: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The identifier of the [`aws_neptune_cluster`](https://www.terraform.io/docs/providers/aws/r/neptune_cluster.html) in which to launch this instance.
    */
  val clusterIdentifier: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The region-unique, immutable identifier for the neptune instance.
    */
  val dbiResourceId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
    */
  val engine: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The neptune engine version.
    */
  val engineVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The indentifier for the neptune instance, if omitted, Terraform will assign a random, unique identifier.
    */
  val identifier: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifer`.
    */
  val identifierPrefix: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The instance class to use.
    */
  val instanceClass: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN for the KMS encryption key if one is set to the neptune cluster.
    */
  val kmsKeyArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the neptune parameter group to associate with this instance.
    */
  val neptuneParameterGroupName: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptune_subnet_group_name` of the attached [`aws_neptune_cluster`](https://www.terraform.io/docs/providers/aws/r/neptune_cluster.html).
    */
  val neptuneSubnetGroupName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The port on which the DB accepts connections. Defaults to `8182`.
    */
  val port: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
    */
  val preferredBackupWindow: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Bool to control if instance is publicly accessible. Default is `false`.
    */
  val publiclyAccessible: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Specifies whether the neptune cluster is encrypted.
    */
  val storageEncrypted: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * A mapping of tags to assign to the instance.
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
}

@JSImport("@pulumi/aws/neptune/clusterInstance", "ClusterInstance")
@js.native
object ClusterInstance extends js.Object {
  /**
    * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.neptuneClusterInstanceMod.ClusterInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterInstanceMod.ClusterInstanceState
  ): atPulumiAwsLib.neptuneClusterInstanceMod.ClusterInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.neptuneClusterInstanceMod.ClusterInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.neptuneClusterInstanceMod.ClusterInstance = js.native
}

