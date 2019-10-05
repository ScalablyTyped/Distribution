package typings.atPulumiAws.atPulumiAwsMod.rds

import typings.atPulumiAws.rdsGetClusterMod.GetClusterArgs
import typings.atPulumiAws.rdsGetClusterMod.GetClusterResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "rds.getCluster")
@js.native
object getCluster extends js.Object {
  def apply(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def apply(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
}

