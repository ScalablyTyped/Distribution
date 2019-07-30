package typings.atPulumiAws.albMod

import typings.atPulumiAws.albGetListenerMod.GetListenerArgs
import typings.atPulumiAws.albGetListenerMod.GetListenerResult
import typings.atPulumiAws.albGetLoadBalancerMod.GetLoadBalancerArgs
import typings.atPulumiAws.albGetLoadBalancerMod.GetLoadBalancerResult
import typings.atPulumiAws.albGetTargetGroupMod.GetTargetGroupArgs
import typings.atPulumiAws.albGetTargetGroupMod.GetTargetGroupResult
import typings.atPulumiAws.albIpAddressTypeMod.IpAddressType
import typings.atPulumiAws.albLoadBalancerTypeMod.LoadBalancerType
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/alb", JSImport.Namespace)
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

