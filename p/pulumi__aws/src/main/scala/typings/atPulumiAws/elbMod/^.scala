package typings.atPulumiAws.elbMod

import typings.atPulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdArgs
import typings.atPulumiAws.elbGetHostedZoneIdMod.GetHostedZoneIdResult
import typings.atPulumiAws.elbGetLoadBalancerMod.GetLoadBalancerArgs
import typings.atPulumiAws.elbGetLoadBalancerMod.GetLoadBalancerResult
import typings.atPulumiAws.elbGetServiceAccountMod.GetServiceAccountArgs
import typings.atPulumiAws.elbGetServiceAccountMod.GetServiceAccountResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getHostedZoneId(): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getHostedZoneId(args: GetHostedZoneIdArgs, opts: InvokeOptions): js.Promise[GetHostedZoneIdResult] with GetHostedZoneIdResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] with GetServiceAccountResult = js.native
}

