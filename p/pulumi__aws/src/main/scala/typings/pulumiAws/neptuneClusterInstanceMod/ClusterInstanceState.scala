package typings.pulumiAws.neptuneClusterInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterInstanceState extends js.Object {
  /**
    * The hostname of the instance. See also `endpoint` and `port`.
    */
  val address: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether any instance modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Amazon Resource Name (ARN) of neptune instance
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The EC2 Availability Zone that the neptune instance is created in.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * The region-unique, immutable identifier for the neptune instance.
    */
  val dbiResourceId: js.UndefOr[Input[String]] = js.native
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * The neptune engine version.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The indentifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * The instance class to use.
    */
  val instanceClass: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN for the KMS encryption key if one is set to the neptune cluster.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the neptune parameter group to associate with this instance.
    */
  val neptuneParameterGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `aws.neptune.Cluster`.
    */
  val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The port on which the DB accepts connections. Defaults to `8182`.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.native
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.native
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: js.UndefOr[Input[Double]] = js.native
  /**
    * Bool to control if instance is publicly accessible. Default is `false`.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the neptune cluster is encrypted.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A map of tags to assign to the instance.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: js.UndefOr[Input[Boolean]] = js.native
}

object ClusterInstanceState {
  @scala.inline
  def apply(): ClusterInstanceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInstanceState]
  }
  @scala.inline
  implicit class ClusterInstanceStateOps[Self <: ClusterInstanceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: Input[String]): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setApplyImmediately(value: Input[Boolean]): Self = this.set("applyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyImmediately: Self = this.set("applyImmediately", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setAutoMinorVersionUpgrade(value: Input[Boolean]): Self = this.set("autoMinorVersionUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMinorVersionUpgrade: Self = this.set("autoMinorVersionUpgrade", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setClusterIdentifier(value: Input[String]): Self = this.set("clusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("clusterIdentifier", js.undefined)
    @scala.inline
    def setDbiResourceId(value: Input[String]): Self = this.set("dbiResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbiResourceId: Self = this.set("dbiResourceId", js.undefined)
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setIdentifier(value: Input[String]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setIdentifierPrefix(value: Input[String]): Self = this.set("identifierPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifierPrefix: Self = this.set("identifierPrefix", js.undefined)
    @scala.inline
    def setInstanceClass(value: Input[String]): Self = this.set("instanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceClass: Self = this.set("instanceClass", js.undefined)
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    @scala.inline
    def setNeptuneParameterGroupName(value: Input[String]): Self = this.set("neptuneParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeptuneParameterGroupName: Self = this.set("neptuneParameterGroupName", js.undefined)
    @scala.inline
    def setNeptuneSubnetGroupName(value: Input[String]): Self = this.set("neptuneSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeptuneSubnetGroupName: Self = this.set("neptuneSubnetGroupName", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: Input[String]): Self = this.set("preferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("preferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: Input[String]): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("preferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPromotionTier(value: Input[Double]): Self = this.set("promotionTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotionTier: Self = this.set("promotionTier", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Input[Boolean]): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: Input[Boolean]): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("storageEncrypted", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setWriter(value: Input[Boolean]): Self = this.set("writer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
  
}

