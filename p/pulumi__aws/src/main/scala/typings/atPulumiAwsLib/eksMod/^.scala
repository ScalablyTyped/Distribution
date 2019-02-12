package typings
package atPulumiAwsLib.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/eks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCluster(args: atPulumiAwsLib.eksGetClusterMod.GetClusterArgs): js.Promise[atPulumiAwsLib.eksGetClusterMod.GetClusterResult] = js.native
  def getCluster(
    args: atPulumiAwsLib.eksGetClusterMod.GetClusterArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.eksGetClusterMod.GetClusterResult] = js.native
  def getClusterAuth(args: atPulumiAwsLib.eksGetClusterAuthMod.GetClusterAuthArgs): js.Promise[atPulumiAwsLib.eksGetClusterAuthMod.GetClusterAuthResult] = js.native
  def getClusterAuth(
    args: atPulumiAwsLib.eksGetClusterAuthMod.GetClusterAuthArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.eksGetClusterAuthMod.GetClusterAuthResult] = js.native
}

