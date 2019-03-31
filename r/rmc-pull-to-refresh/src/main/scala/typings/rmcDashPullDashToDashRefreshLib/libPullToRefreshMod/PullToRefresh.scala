package typings
package rmcDashPullDashToDashRefreshLib.libPullToRefreshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullToRefresh
  extends reactLib.reactMod.Component[rmcDashPullDashToDashRefreshLib.libPropsTypeMod.PropsType, js.Any, js.Any] {
  var _ScreenY: js.Any = js.native
  var _isMounted: scala.Boolean = js.native
  var _lastScreenY: js.Any = js.native
  var _startScreenY: js.Any = js.native
  var _timer: js.Any = js.native
  var _to: js.Any = js.native
  var containerRef: js.Any = js.native
  var contentRef: js.Any = js.native
  var shouldUpdateChildren: scala.Boolean = js.native
  @JSName("state")
  var state_PullToRefresh: rmcDashPullDashToDashRefreshLib.Anon_CurrSt = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPullToRefresh(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MPullToRefresh(prevProps: js.Any): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPullToRefresh(): scala.Unit = js.native
  def damping(dy: scala.Double): scala.Double = js.native
  def destroy(ele: js.Any): scala.Unit = js.native
  def init(ele: js.Any): scala.Unit = js.native
  def isEdge(ele: js.Any, direction: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  def onTouchEnd(): scala.Unit = js.native
  def onTouchMove(ele: js.Any, e: js.Any): scala.Unit = js.native
  def onTouchStart(_ele: js.Any, e: js.Any): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setContentStyle(ty: scala.Double): scala.Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MPullToRefresh(nextProps: js.Any): scala.Boolean = js.native
  def triggerPullToRefresh(): scala.Unit = js.native
}

