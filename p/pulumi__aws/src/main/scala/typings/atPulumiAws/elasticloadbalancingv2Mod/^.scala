package typings.atPulumiAws.elasticloadbalancingv2Mod

import typings.atPulumiAws.elasticloadbalancingv2GetListenerMod.GetListenerArgs
import typings.atPulumiAws.elasticloadbalancingv2GetListenerMod.GetListenerResult
import typings.atPulumiAws.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerArgs
import typings.atPulumiAws.elasticloadbalancingv2GetLoadBalancerMod.GetLoadBalancerResult
import typings.atPulumiAws.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupArgs
import typings.atPulumiAws.elasticloadbalancingv2GetTargetGroupMod.GetTargetGroupResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticloadbalancingv2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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

