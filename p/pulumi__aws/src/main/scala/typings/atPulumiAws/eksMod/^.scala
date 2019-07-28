package typings.atPulumiAws.eksMod

import typings.atPulumiAws.eksGetClusterAuthMod.GetClusterAuthArgs
import typings.atPulumiAws.eksGetClusterAuthMod.GetClusterAuthResult
import typings.atPulumiAws.eksGetClusterMod.GetClusterArgs
import typings.atPulumiAws.eksGetClusterMod.GetClusterResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
  def getClusterAuth(args: GetClusterAuthArgs, opts: InvokeOptions): js.Promise[GetClusterAuthResult] with GetClusterAuthResult = js.native
}

