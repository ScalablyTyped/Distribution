package typings.atPulumiAws.elasticloadbalancingMod

import typings.atPulumiAws.elasticloadbalancingGetHostedZoneIdMod.GetHostedZoneIdArgs
import typings.atPulumiAws.elasticloadbalancingGetHostedZoneIdMod.GetHostedZoneIdResult
import typings.atPulumiAws.elasticloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs
import typings.atPulumiAws.elasticloadbalancingGetLoadBalancerMod.GetLoadBalancerResult
import typings.atPulumiAws.elasticloadbalancingGetServiceAccountMod.GetServiceAccountArgs
import typings.atPulumiAws.elasticloadbalancingGetServiceAccountMod.GetServiceAccountResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancing", JSImport.Namespace)
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

