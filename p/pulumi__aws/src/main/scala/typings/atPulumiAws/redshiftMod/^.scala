package typings.atPulumiAws.redshiftMod

import typings.atPulumiAws.redshiftGetClusterMod.GetClusterArgs
import typings.atPulumiAws.redshiftGetClusterMod.GetClusterResult
import typings.atPulumiAws.redshiftGetServiceAccountMod.GetServiceAccountArgs
import typings.atPulumiAws.redshiftGetServiceAccountMod.GetServiceAccountResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/redshift", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
}

