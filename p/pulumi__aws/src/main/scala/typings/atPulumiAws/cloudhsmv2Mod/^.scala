package typings.atPulumiAws.cloudhsmv2Mod

import typings.atPulumiAws.cloudhsmv2GetClusterMod.GetClusterArgs
import typings.atPulumiAws.cloudhsmv2GetClusterMod.GetClusterResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudhsmv2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
}

