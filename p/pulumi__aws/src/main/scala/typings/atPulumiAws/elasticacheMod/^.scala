package typings.atPulumiAws.elasticacheMod

import typings.atPulumiAws.elasticacheGetClusterMod.GetClusterArgs
import typings.atPulumiAws.elasticacheGetClusterMod.GetClusterResult
import typings.atPulumiAws.elasticacheGetReplicationGroupMod.GetReplicationGroupArgs
import typings.atPulumiAws.elasticacheGetReplicationGroupMod.GetReplicationGroupResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getReplicationGroup(args: GetReplicationGroupArgs): js.Promise[GetReplicationGroupResult] with GetReplicationGroupResult = js.native
  def getReplicationGroup(args: GetReplicationGroupArgs, opts: InvokeOptions): js.Promise[GetReplicationGroupResult] with GetReplicationGroupResult = js.native
}

