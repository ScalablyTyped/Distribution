package typings.rcDashSwipeout

import typings.rcDashSwipeout.esPropTypesMod.IPropTypes
import typings.rcDashSwipeout.esSwipeoutMod.Swipeout
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-swipeout/es/Swipeout", JSImport.Namespace)
@js.native
object esSwipeoutMod extends js.Object {
  @js.native
  trait Swipeout
    extends Component[IPropTypes, js.Any, js.Any] {
    var btnsLeftWidth: Double = js.native
    var btnsRightWidth: Double = js.native
    var content: js.Any = js.native
    var cover: js.Any = js.native
    var left: js.Any = js.native
    var needShowLeft: Boolean = js.native
    var needShowRight: Boolean = js.native
    var openedLeft: Boolean = js.native
    var openedRight: Boolean = js.native
    var right: js.Any = js.native
    var swiping: Boolean = js.native
    def _getContentEasing(value: js.Any, limit: js.Any): js.Any = js.native
    def _setStyle(value: js.Any): Unit = js.native
    def close(): Unit = js.native
    @JSName("componentDidMount")
    def componentDidMount_MSwipeout(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSwipeout(): Unit = js.native
    def doOpenLeft(): Unit = js.native
    def doOpenRight(): Unit = js.native
    def onBtnClick(ev: js.Any, btn: js.Any): Unit = js.native
    def onCloseSwipe(ev: js.Any): Unit = js.native
    def onPanEnd(e: js.Any): Unit = js.native
    def onPanMove(e: js.Any): Unit = js.native
    def onPanStart(e: js.Any): Unit = js.native
    def onTouchMove(e: js.Any): Unit = js.native
    def open(value: js.Any, openedLeft: js.Any, openedRight: js.Any): Unit = js.native
    def renderButtons(buttons: js.Any, ref: js.Any): Element | Null = js.native
  }
  
  @js.native
  class default protected () extends Swipeout {
    def this(props: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_AutoClose = js.native
  }
  
}

