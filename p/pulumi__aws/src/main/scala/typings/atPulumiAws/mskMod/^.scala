package typings.atPulumiAws.mskMod

import typings.atPulumiAws.mskGetClusterMod.GetClusterArgs
import typings.atPulumiAws.mskGetClusterMod.GetClusterResult
import typings.atPulumiAws.mskGetConfigurationMod.GetConfigurationArgs
import typings.atPulumiAws.mskGetConfigurationMod.GetConfigurationResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/msk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] with GetConfigurationResult = js.native
  def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] with GetConfigurationResult = js.native
}

