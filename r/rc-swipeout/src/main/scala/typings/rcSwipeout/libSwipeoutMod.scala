package typings.rcSwipeout

import typings.rcSwipeout.anon.AutoClose
import typings.rcSwipeout.libPropTypesMod.IPropTypes
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwipeoutMod {
  
  @JSImport("rc-swipeout/lib/Swipeout", JSImport.Default)
  @js.native
  open class default protected () extends Swipeout {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rc-swipeout/lib/Swipeout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-swipeout/lib/Swipeout", "default.defaultProps")
    @js.native
    def defaultProps: AutoClose = js.native
    inline def defaultProps_=(x: AutoClose): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Swipeout extends Component[IPropTypes, Any, Any] {
    
    def _getContentEasing(value: Any, limit: Any): Any = js.native
    
    def _setStyle(value: Any): Unit = js.native
    
    var btnsLeftWidth: Double = js.native
    
    var btnsRightWidth: Double = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSwipeout(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSwipeout(): Unit = js.native
    
    var content: Any = js.native
    
    var cover: Any = js.native
    
    def doOpenLeft(): Unit = js.native
    
    def doOpenRight(): Unit = js.native
    
    var left: Any = js.native
    
    var needShowLeft: Boolean = js.native
    
    var needShowRight: Boolean = js.native
    
    def onBtnClick(ev: Any, btn: Any): Unit = js.native
    
    def onCloseSwipe(ev: Any): Unit = js.native
    
    def onPanEnd(e: Any): Unit = js.native
    
    def onPanMove(e: Any): Unit = js.native
    
    def onPanStart(e: Any): Unit = js.native
    
    def onTouchMove(e: Any): Unit = js.native
    
    def open(value: Any, openedLeft: Any, openedRight: Any): Unit = js.native
    
    var openedLeft: Boolean = js.native
    
    var openedRight: Boolean = js.native
    
    def renderButtons(buttons: Any, ref: Any): Element | Null = js.native
    
    var right: Any = js.native
    
    var swiping: Boolean = js.native
  }
}
