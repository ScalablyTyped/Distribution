package typings.atPulumiAws.rdsMod

import typings.atPulumiAws.rdsEngineModeMod.EngineMode
import typings.atPulumiAws.rdsEngineTypeMod.EngineType
import typings.atPulumiAws.rdsGetClusterMod.GetClusterArgs
import typings.atPulumiAws.rdsGetClusterMod.GetClusterResult
import typings.atPulumiAws.rdsGetClusterSnapshotMod.GetClusterSnapshotArgs
import typings.atPulumiAws.rdsGetClusterSnapshotMod.GetClusterSnapshotResult
import typings.atPulumiAws.rdsGetEventCategoriesMod.GetEventCategoriesArgs
import typings.atPulumiAws.rdsGetEventCategoriesMod.GetEventCategoriesResult
import typings.atPulumiAws.rdsGetInstanceMod.GetInstanceArgs
import typings.atPulumiAws.rdsGetInstanceMod.GetInstanceResult
import typings.atPulumiAws.rdsGetSnapshotMod.GetSnapshotArgs
import typings.atPulumiAws.rdsGetSnapshotMod.GetSnapshotResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var AuroraEngine: EngineType = js.native
  var AuroraMysqlEngine: EngineType = js.native
  var AuroraPostgresqlEngine: EngineType = js.native
  var GlobalEngine: EngineMode = js.native
  var ParallelQueryEngine: EngineMode = js.native
  var ProvisionedEngine: EngineMode = js.native
  var ServerlessEngine: EngineMode = js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getClusterSnapshot(): js.Promise[GetClusterSnapshotResult] with GetClusterSnapshotResult = js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs): js.Promise[GetClusterSnapshotResult] with GetClusterSnapshotResult = js.native
  def getClusterSnapshot(args: GetClusterSnapshotArgs, opts: InvokeOptions): js.Promise[GetClusterSnapshotResult] with GetClusterSnapshotResult = js.native
  def getEventCategories(): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def getEventCategories(args: GetEventCategoriesArgs): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def getEventCategories(args: GetEventCategoriesArgs, opts: InvokeOptions): js.Promise[GetEventCategoriesResult] with GetEventCategoriesResult = js.native
  def getInstance(args: GetInstanceArgs): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def getInstance(args: GetInstanceArgs, opts: InvokeOptions): js.Promise[GetInstanceResult] with GetInstanceResult = js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
}

