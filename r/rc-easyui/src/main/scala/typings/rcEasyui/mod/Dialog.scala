package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Dialog")
@js.native
class Dialog protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def bodyClasses(): js.Any = js.native
  
  def center(): Unit = js.native
  
  def clickCloseTool(e: js.Any): Unit = js.native
  
  def close(): Unit = js.native
  
  def closeMask(): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MDialog(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDialog(e: js.Any): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDialog(): Unit = js.native
  
  def displaying(): Unit = js.native
  
  def footerClasses(): js.Any = js.native
  
  def handleDragEnd(e: js.Any): Unit = js.native
  
  def handleResizeStop(e: js.Any): Unit = js.native
  
  def hcenter(): Unit = js.native
  
  def headerClasses(): js.Any = js.native
  
  def initDialog(): Unit = js.native
  
  def moveToTop(): Unit = js.native
  
  def open(): Unit = js.native
  
  def openMask(): Unit = js.native
  
  def panelClasses(): js.Any = js.native
  
  def panelStyles(): js.Any = js.native
  
  def vcenter(): Unit = js.native
}
/* static members */
object Dialog {
  
  @JSImport("rc-easyui", "Dialog")
  @js.native
  val ^ : js.Any = js.native
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.contextTypes.locale
      @JSImport("rc-easyui", "Dialog.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.contextTypes.t
      @JSImport("rc-easyui", "Dialog.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Dialog.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.autoCenter")
    @js.native
    val autoCenter: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.borderType")
    @js.native
    val borderType: String = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.closable")
    @js.native
    val closable: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.closeIconCls")
    @js.native
    val closeIconCls: String = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.closed")
    @js.native
    val closed: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.collapseIconCls")
    @js.native
    val collapseIconCls: String = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.collapsed")
    @js.native
    val collapsed: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.collapsible")
    @js.native
    val collapsible: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.draggable")
    @js.native
    val draggable: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.expandIconCls")
    @js.native
    val expandIconCls: String = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.modal")
    @js.native
    val modal: Boolean = js.native
    
    inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
    
    inline def onCollapse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCollapse")().asInstanceOf[Unit]
    
    inline def onExpand(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onExpand")().asInstanceOf[Unit]
    
    inline def onMove(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onMove")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onOpen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onOpen")().asInstanceOf[Unit]
    
    inline def onResize(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResize")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "Dialog.defaultProps.resizable")
    @js.native
    val resizable: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.showFooter")
    @js.native
    val showFooter: Boolean = js.native
    
    @JSImport("rc-easyui", "Dialog.defaultProps.showHeader")
    @js.native
    val showHeader: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.animate
      @JSImport("rc-easyui", "Dialog.propTypes.animate.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object autoCenter {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.autoCenter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.autoCenter
      @JSImport("rc-easyui", "Dialog.propTypes.autoCenter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object bodyCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.bodyCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.bodyCls
      @JSImport("rc-easyui", "Dialog.propTypes.bodyCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object bodyStyle {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.bodyStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.bodyStyle
      @JSImport("rc-easyui", "Dialog.propTypes.bodyStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object border {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.border
      @JSImport("rc-easyui", "Dialog.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object borderType {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.borderType")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.borderType
      @JSImport("rc-easyui", "Dialog.propTypes.borderType.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object closable {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.closable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.closable
      @JSImport("rc-easyui", "Dialog.propTypes.closable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object closeIconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.closeIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.closeIconCls
      @JSImport("rc-easyui", "Dialog.propTypes.closeIconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object closed {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.closed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.closed
      @JSImport("rc-easyui", "Dialog.propTypes.closed.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object collapseIconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.collapseIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.collapseIconCls
      @JSImport("rc-easyui", "Dialog.propTypes.collapseIconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object collapsed {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.collapsed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.collapsed
      @JSImport("rc-easyui", "Dialog.propTypes.collapsed.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object collapsible {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.collapsible")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.collapsible
      @JSImport("rc-easyui", "Dialog.propTypes.collapsible.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object draggable {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.draggable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.draggable
      @JSImport("rc-easyui", "Dialog.propTypes.draggable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object expandIconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.expandIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.expandIconCls
      @JSImport("rc-easyui", "Dialog.propTypes.expandIconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footer {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.footer")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.footer
      @JSImport("rc-easyui", "Dialog.propTypes.footer.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.footerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.footerCls
      @JSImport("rc-easyui", "Dialog.propTypes.footerCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerStyle {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.footerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.footerStyle
      @JSImport("rc-easyui", "Dialog.propTypes.footerStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object header {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.header")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.header
      @JSImport("rc-easyui", "Dialog.propTypes.header.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object headerCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.headerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.headerCls
      @JSImport("rc-easyui", "Dialog.propTypes.headerCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object headerStyle {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.headerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.headerStyle
      @JSImport("rc-easyui", "Dialog.propTypes.headerStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.iconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.iconCls
      @JSImport("rc-easyui", "Dialog.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object modal {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.modal")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.modal
      @JSImport("rc-easyui", "Dialog.propTypes.modal.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onCollapse {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.onCollapse")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.onCollapse
      @JSImport("rc-easyui", "Dialog.propTypes.onCollapse.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onExpand {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.onExpand")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.onExpand
      @JSImport("rc-easyui", "Dialog.propTypes.onExpand.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object resizable {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.resizable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.resizable
      @JSImport("rc-easyui", "Dialog.propTypes.resizable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showFooter {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.showFooter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.showFooter
      @JSImport("rc-easyui", "Dialog.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showHeader {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.showHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.showHeader
      @JSImport("rc-easyui", "Dialog.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object title {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Dialog.propTypes.title")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Dialog.propTypes.title
      @JSImport("rc-easyui", "Dialog.propTypes.title.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  @JSImport("rc-easyui", "Dialog.zIndex")
  @js.native
  def zIndex: Double = js.native
  inline def zIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
}
