package typings.rmcPullToRefresh

import typings.react.mod.Component
import typings.rmcPullToRefresh.anon.CurrSt
import typings.rmcPullToRefresh.propsTypeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-pull-to-refresh/es/PullToRefresh", JSImport.Namespace)
@js.native
object pullToRefreshMod extends js.Object {
  
  @js.native
  trait PullToRefresh
    extends Component[PropsType, js.Any, js.Any] {
    
    var _ScreenY: js.Any = js.native
    
    var _isMounted: Boolean = js.native
    
    var _lastScreenY: js.Any = js.native
    
    var _startScreenX: js.Any = js.native
    
    var _startScreenY: js.Any = js.native
    
    var _timer: js.Any = js.native
    
    var _to: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPullToRefresh(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPullToRefresh(prevProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPullToRefresh(): Unit = js.native
    
    var containerRef: js.Any = js.native
    
    var contentRef: js.Any = js.native
    
    def damping(dy: Double): Double = js.native
    
    def destroy(ele: js.Any): Unit = js.native
    
    def init(ele: js.Any): Unit = js.native
    
    def isEdge(ele: js.Any, direction: String): js.UndefOr[Boolean] = js.native
    
    def onTouchEnd(): Unit = js.native
    
    def onTouchMove(ele: js.Any, e: js.Any): Unit = js.native
    
    def onTouchStart(_ele: js.Any, e: js.Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setContentStyle(ty: Double): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MPullToRefresh(nextProps: js.Any): Boolean = js.native
    
    var shouldUpdateChildren: Boolean = js.native
    
    @JSName("state")
    var state_PullToRefresh: CurrSt = js.native
    
    def triggerPullToRefresh(): Unit = js.native
  }
  
  @js.native
  class default () extends PullToRefresh
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: PropsType = js.native
  }
}
