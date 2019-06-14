package typings
package atPulumiAwsLib.applicationloadbalancingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/applicationloadbalancing", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ApplicationLoadBalancer: atPulumiAwsLib.applicationloadbalancingLoadBalancerTypeMod.LoadBalancerType = js.native
  val Dualstack: atPulumiAwsLib.applicationloadbalancingIpAddressTypeMod.IpAddressType = js.native
  val Ipv4: atPulumiAwsLib.applicationloadbalancingIpAddressTypeMod.IpAddressType = js.native
  val NetworkLoadBalancer: atPulumiAwsLib.applicationloadbalancingLoadBalancerTypeMod.LoadBalancerType = js.native
  def getListener(): js.Promise[atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerResult] = js.native
  def getListener(args: atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerArgs): js.Promise[atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerResult] = js.native
  def getListener(
    args: atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.applicationloadbalancingGetListenerMod.GetListenerResult] = js.native
  def getLoadBalancer(): js.Promise[atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getLoadBalancer(args: atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs): js.Promise[atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getLoadBalancer(
    args: atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.applicationloadbalancingGetLoadBalancerMod.GetLoadBalancerResult] = js.native
  def getTargetGroup(): js.Promise[atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult] = js.native
  def getTargetGroup(args: atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupArgs): js.Promise[atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult] = js.native
  def getTargetGroup(
    args: atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.applicationloadbalancingGetTargetGroupMod.GetTargetGroupResult] = js.native
}

