package typings.pulumiAws.globalClusterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalClusterState extends js.Object {
  /**
    * RDS Global Cluster Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Name for an automatically created database on cluster creation.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name of the database engine to be used for this DB cluster. Valid values: `aurora`, `aurora-mysql`, `aurora-postgresql`. Defaults to `aurora`.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * Engine version of the Aurora global database.
    * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The global cluster identifier.
    */
  val globalClusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
    */
  val globalClusterResourceId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
}

object GlobalClusterState {
  @scala.inline
  def apply(): GlobalClusterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalClusterState]
  }
  @scala.inline
  implicit class GlobalClusterStateOps[Self <: GlobalClusterState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("databaseName", js.undefined)
    @scala.inline
    def setDeletionProtection(value: Input[Boolean]): Self = this.set("deletionProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionProtection: Self = this.set("deletionProtection", js.undefined)
    @scala.inline
    def setEngine(value: Input[String]): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: Input[String]): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setGlobalClusterIdentifier(value: Input[String]): Self = this.set("globalClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterIdentifier: Self = this.set("globalClusterIdentifier", js.undefined)
    @scala.inline
    def setGlobalClusterResourceId(value: Input[String]): Self = this.set("globalClusterResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalClusterResourceId: Self = this.set("globalClusterResourceId", js.undefined)
    @scala.inline
    def setStorageEncrypted(value: Input[Boolean]): Self = this.set("storageEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("storageEncrypted", js.undefined)
  }
  
}

