package typings.atPulumiAws.applicationloadbalancingMod

import typings.atPulumiAws.applicationloadbalancingGetListenerMod.GetListenerArgs
import typings.atPulumiAws.applicationloadbalancingGetListenerMod.GetListenerResult
import typings.atPulumiAws.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs
import typings.atPulumiAws.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult
import typings.atPulumiAws.applicationloadbalancingGetTargetGroupMod.GetTargetGroupArgs
import typings.atPulumiAws.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult
import typings.atPulumiAws.applicationloadbalancingIpAddressTypeMod.IpAddressType
import typings.atPulumiAws.applicationloadbalancingLoadBalancerTypeMod.LoadBalancerType
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ApplicationLoadBalancer: LoadBalancerType = js.native
  val Dualstack: IpAddressType = js.native
  val Ipv4: IpAddressType = js.native
  val NetworkLoadBalancer: LoadBalancerType = js.native
  def getListener(): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getListener(args: GetListenerArgs): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getListener(args: GetListenerArgs, opts: InvokeOptions): js.Promise[GetListenerResult] with GetListenerResult = js.native
  def getLoadBalancer(): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getLoadBalancer(args: GetLoadBalancerArgs, opts: InvokeOptions): js.Promise[GetLoadBalancerResult] with GetLoadBalancerResult = js.native
  def getTargetGroup(): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  def getTargetGroup(args: GetTargetGroupArgs): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
  def getTargetGroup(args: GetTargetGroupArgs, opts: InvokeOptions): js.Promise[GetTargetGroupResult] with GetTargetGroupResult = js.native
}

