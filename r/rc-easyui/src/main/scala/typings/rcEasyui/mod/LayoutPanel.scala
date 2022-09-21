package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "LayoutPanel")
@js.native
open class LayoutPanel protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  def clickCollapsibleTool(e: Any): Unit = js.native
  
  def collapse(): Unit = js.native
  
  def collapsibleClasses(): Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MLayoutPanel(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MLayoutPanel(): Unit = js.native
  
  def expand(): Unit = js.native
  
  def fixStyle(): Unit = js.native
  
  def handleResizeStart(e: Any): Unit = js.native
  
  def handleResizeStop(e: Any): Unit = js.native
  
  def handleResizing(e: Any): Unit = js.native
  
  def handleSlideEnd(): Unit = js.native
  
  def panelClasses(): Any = js.native
  
  def panelStyles(): Any = js.native
}
object LayoutPanel {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.contextTypes.locale
      @JSImport("rc-easyui", "LayoutPanel.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.contextTypes.t
      @JSImport("rc-easyui", "LayoutPanel.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.closable")
    @js.native
    val closable: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.closeIconCls")
    @js.native
    val closeIconCls: String = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.closed")
    @js.native
    val closed: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.collapseIconCls")
    @js.native
    val collapseIconCls: Any = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.collapsed")
    @js.native
    val collapsed: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.collapsedSize")
    @js.native
    val collapsedSize: Double = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.collapsible")
    @js.native
    val collapsible: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.expandIconCls")
    @js.native
    val expandIconCls: Any = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.expander")
    @js.native
    val expander: Boolean = js.native
    
    inline def onCollapse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCollapse")().asInstanceOf[Unit]
    
    inline def onExpand(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onExpand")().asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.region")
    @js.native
    val region: String = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.showFooter")
    @js.native
    val showFooter: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.showHeader")
    @js.native
    val showHeader: Boolean = js.native
    
    @JSImport("rc-easyui", "LayoutPanel.defaultProps.split")
    @js.native
    val split: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.animate
      @JSImport("rc-easyui", "LayoutPanel.propTypes.animate.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object bodyCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.bodyCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.bodyCls
      @JSImport("rc-easyui", "LayoutPanel.propTypes.bodyCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object bodyStyle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.bodyStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.bodyStyle
      @JSImport("rc-easyui", "LayoutPanel.propTypes.bodyStyle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object border {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.border
      @JSImport("rc-easyui", "LayoutPanel.propTypes.border.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object closable {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.closable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.closable
      @JSImport("rc-easyui", "LayoutPanel.propTypes.closable.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object closeIconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.closeIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.closeIconCls
      @JSImport("rc-easyui", "LayoutPanel.propTypes.closeIconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object closed {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.closed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.closed
      @JSImport("rc-easyui", "LayoutPanel.propTypes.closed.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapseIconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapseIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.collapseIconCls
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapseIconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapsed {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapsed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.collapsed
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapsed.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapsedSize {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapsedSize")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.collapsedSize
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapsedSize.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapsible {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapsible")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.collapsible
      @JSImport("rc-easyui", "LayoutPanel.propTypes.collapsible.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object expandIconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.expandIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.expandIconCls
      @JSImport("rc-easyui", "LayoutPanel.propTypes.expandIconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object expander {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.expander")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.expander
      @JSImport("rc-easyui", "LayoutPanel.propTypes.expander.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object footer {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.footer")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.footer
      @JSImport("rc-easyui", "LayoutPanel.propTypes.footer.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object footerCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.footerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.footerCls
      @JSImport("rc-easyui", "LayoutPanel.propTypes.footerCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object footerStyle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.footerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.footerStyle
      @JSImport("rc-easyui", "LayoutPanel.propTypes.footerStyle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object header {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.header")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.header
      @JSImport("rc-easyui", "LayoutPanel.propTypes.header.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object headerCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.headerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.headerCls
      @JSImport("rc-easyui", "LayoutPanel.propTypes.headerCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object headerStyle {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.headerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.headerStyle
      @JSImport("rc-easyui", "LayoutPanel.propTypes.headerStyle.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object iconCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.iconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.iconCls
      @JSImport("rc-easyui", "LayoutPanel.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onCollapse {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.onCollapse")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.onCollapse
      @JSImport("rc-easyui", "LayoutPanel.propTypes.onCollapse.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object onExpand {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.onExpand")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.onExpand
      @JSImport("rc-easyui", "LayoutPanel.propTypes.onExpand.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object region {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.region")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.region
      @JSImport("rc-easyui", "LayoutPanel.propTypes.region.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showFooter {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.showFooter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.showFooter
      @JSImport("rc-easyui", "LayoutPanel.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showHeader {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.showHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.showHeader
      @JSImport("rc-easyui", "LayoutPanel.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object split {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.split")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.split
      @JSImport("rc-easyui", "LayoutPanel.propTypes.split.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object title {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "LayoutPanel.propTypes.title")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.LayoutPanel.propTypes.title
      @JSImport("rc-easyui", "LayoutPanel.propTypes.title.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
