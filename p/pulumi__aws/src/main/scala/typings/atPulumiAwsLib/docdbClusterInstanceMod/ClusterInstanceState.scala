package typings
package atPulumiAwsLib.docdbClusterInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInstanceState extends js.Object {
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of cluster instance
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonDocDB/latest/APIReference/API_CreateDBInstance.html) about the details.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The identifier of the [`aws_docdb_cluster`](https://www.terraform.io/docs/providers/aws/r/docdb_cluster.html) in which to launch this instance.
    */
  val clusterIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The DB subnet group to associate with this DB instance.
    */
  val dbSubnetGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The region-unique, immutable identifier for the DB instance.
    */
  val dbiResourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The DNS address for this instance. May not be writable
    */
  val endpoint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
    */
  val engine: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The database engine version
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The indentifier for the DocDB instance, if omitted, Terraform will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifer`.
    */
  val identifierPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances][2]. DocDB currently
    * supports the below instance classes. Please see [AWS Documentation][4] for complete details.
    * - db.r4.large
    * - db.r4.xlarge
    * - db.r4.2xlarge
    * - db.r4.4xlarge
    * - db.r4.8xlarge
    * - db.r4.16xlarge
    */
  val instanceClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN for the KMS encryption key if one is set to the cluster.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The database port
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled.
    */
  val preferredBackupWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  val publiclyAccessible: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the instance.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

