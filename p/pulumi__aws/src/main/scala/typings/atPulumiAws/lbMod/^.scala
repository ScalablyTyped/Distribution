package typings.atPulumiAws.lbMod

import typings.atPulumiAws.lbGetListenerMod.GetListenerArgs
import typings.atPulumiAws.lbGetListenerMod.GetListenerResult
import typings.atPulumiAws.lbGetLoadBalancerMod.GetLoadBalancerArgs
import typings.atPulumiAws.lbGetLoadBalancerMod.GetLoadBalancerResult
import typings.atPulumiAws.lbGetTargetGroupMod.GetTargetGroupArgs
import typings.atPulumiAws.lbGetTargetGroupMod.GetTargetGroupResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lb", JSImport.Namespace)
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

