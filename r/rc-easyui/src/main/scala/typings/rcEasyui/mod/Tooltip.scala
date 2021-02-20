package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Tooltip")
@js.native
class Tooltip protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def bindEvents(args: js.Any*): Unit = js.native
  
  def clearTimeouts(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MTooltip(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTooltip(): Unit = js.native
  
  def handleActive(e: js.Any): Unit = js.native
  
  def handleContentMouseEnter(): js.Any = js.native
  
  def handleContentMouseLeave(): Unit = js.native
  
  def handleDeactive(): Unit = js.native
  
  def handleDocumentClick(e: js.Any): Unit = js.native
  
  def handleMouseMove(e: js.Any): Unit = js.native
  
  def hide(): Unit = js.native
  
  def renderTip(): js.Any = js.native
  
  def show(): Unit = js.native
}
object Tooltip {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "Tooltip.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.contextTypes.locale
      @JSImport("rc-easyui", "Tooltip.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "Tooltip.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.contextTypes.t
      @JSImport("rc-easyui", "Tooltip.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.deltaX")
    @js.native
    val deltaX: Double = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.deltaY")
    @js.native
    val deltaY: Double = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.disabled")
    @js.native
    val disabled: Boolean = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.hideDelay")
    @js.native
    val hideDelay: Double = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.hideEvent")
    @js.native
    val hideEvent: String = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.onHide")
    @js.native
    def onHide(): Unit = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.onPosition")
    @js.native
    def onPosition(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.onShow")
    @js.native
    def onShow(): Unit = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.position")
    @js.native
    val position: String = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.showDelay")
    @js.native
    val showDelay: Double = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.showEvent")
    @js.native
    val showEvent: String = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.trackMouse")
    @js.native
    val trackMouse: Boolean = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.tracking")
    @js.native
    val tracking: Boolean = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.valign")
    @js.native
    val valign: String = js.native
    
    @JSImport("rc-easyui", "Tooltip.defaultProps.zIndex")
    @js.native
    val zIndex: Double = js.native
  }
  
  object propTypes {
    
    object className {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.className")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.className
      @JSImport("rc-easyui", "Tooltip.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object content {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.content")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.content
      @JSImport("rc-easyui", "Tooltip.propTypes.content.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object deltaX {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.deltaX")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.deltaX
      @JSImport("rc-easyui", "Tooltip.propTypes.deltaX.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object deltaY {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.deltaY")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.deltaY
      @JSImport("rc-easyui", "Tooltip.propTypes.deltaY.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object disabled {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.disabled")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.disabled
      @JSImport("rc-easyui", "Tooltip.propTypes.disabled.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object hideDelay {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.hideDelay")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.hideDelay
      @JSImport("rc-easyui", "Tooltip.propTypes.hideDelay.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object hideEvent {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.hideEvent")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.hideEvent
      @JSImport("rc-easyui", "Tooltip.propTypes.hideEvent.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onHide {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.onHide")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.onHide
      @JSImport("rc-easyui", "Tooltip.propTypes.onHide.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onPosition {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.onPosition")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.onPosition
      @JSImport("rc-easyui", "Tooltip.propTypes.onPosition.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onShow {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.onShow")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.onShow
      @JSImport("rc-easyui", "Tooltip.propTypes.onShow.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object position {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.position")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.position
      @JSImport("rc-easyui", "Tooltip.propTypes.position.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showDelay {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.showDelay")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.showDelay
      @JSImport("rc-easyui", "Tooltip.propTypes.showDelay.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showEvent {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.showEvent")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.showEvent
      @JSImport("rc-easyui", "Tooltip.propTypes.showEvent.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.style")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.style
      @JSImport("rc-easyui", "Tooltip.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object target {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.target")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.target
      @JSImport("rc-easyui", "Tooltip.propTypes.target.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tooltipCls {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.tooltipCls")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.tooltipCls
      @JSImport("rc-easyui", "Tooltip.propTypes.tooltipCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tooltipStyle {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.tooltipStyle")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.tooltipStyle
      @JSImport("rc-easyui", "Tooltip.propTypes.tooltipStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object trackMouse {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.trackMouse")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.trackMouse
      @JSImport("rc-easyui", "Tooltip.propTypes.trackMouse.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object tracking {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.tracking")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.tracking
      @JSImport("rc-easyui", "Tooltip.propTypes.tracking.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object valign {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.valign")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.valign
      @JSImport("rc-easyui", "Tooltip.propTypes.valign.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object zIndex {
      
      @JSImport("rc-easyui", "Tooltip.propTypes.zIndex")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tooltip.propTypes.zIndex
      @JSImport("rc-easyui", "Tooltip.propTypes.zIndex.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
