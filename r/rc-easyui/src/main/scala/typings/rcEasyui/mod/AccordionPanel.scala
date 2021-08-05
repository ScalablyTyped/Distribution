package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "AccordionPanel")
@js.native
class AccordionPanel protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def bodyClasses(): js.Any = js.native
  
  def clickCollapsibleTool(e: js.Any): Unit = js.native
  
  def clickPanelHeader(e: js.Any): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MAccordionPanel(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAccordionPanel(): Unit = js.native
  
  def full(): js.Any = js.native
  
  def headerClasses(): js.Any = js.native
  
  def panelClasses(): js.Any = js.native
  
  def select(): js.Any = js.native
  
  def selectedState(): js.Any = js.native
  
  def setLast(e: js.Any): Unit = js.native
  
  def unselect(): Unit = js.native
}
object AccordionPanel {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.contextTypes.locale
      @JSImport("rc-easyui", "AccordionPanel.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.contextTypes.t
      @JSImport("rc-easyui", "AccordionPanel.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.closable")
    @js.native
    val closable: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.closeIconCls")
    @js.native
    val closeIconCls: String = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.closed")
    @js.native
    val closed: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.collapseIconCls")
    @js.native
    val collapseIconCls: String = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.collapsed")
    @js.native
    val collapsed: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.collapsible")
    @js.native
    val collapsible: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.expandIconCls")
    @js.native
    val expandIconCls: String = js.native
    
    inline def onCollapse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCollapse")().asInstanceOf[Unit]
    
    inline def onExpand(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onExpand")().asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.selected")
    @js.native
    val selected: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.showFooter")
    @js.native
    val showFooter: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.showHeader")
    @js.native
    val showHeader: Boolean = js.native
    
    @JSImport("rc-easyui", "AccordionPanel.defaultProps.title")
    @js.native
    val title: String = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.animate
      @JSImport("rc-easyui", "AccordionPanel.propTypes.animate.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object bodyCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.bodyCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.bodyCls
      @JSImport("rc-easyui", "AccordionPanel.propTypes.bodyCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object bodyStyle {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.bodyStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.bodyStyle
      @JSImport("rc-easyui", "AccordionPanel.propTypes.bodyStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object border {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.border
      @JSImport("rc-easyui", "AccordionPanel.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object closable {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.closable")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.closable
      @JSImport("rc-easyui", "AccordionPanel.propTypes.closable.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object closeIconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.closeIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.closeIconCls
      @JSImport("rc-easyui", "AccordionPanel.propTypes.closeIconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object closed {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.closed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.closed
      @JSImport("rc-easyui", "AccordionPanel.propTypes.closed.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object collapseIconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.collapseIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.collapseIconCls
      @JSImport("rc-easyui", "AccordionPanel.propTypes.collapseIconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object collapsed {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.collapsed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.collapsed
      @JSImport("rc-easyui", "AccordionPanel.propTypes.collapsed.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object collapsible {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.collapsible")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.collapsible
      @JSImport("rc-easyui", "AccordionPanel.propTypes.collapsible.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object expandIconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.expandIconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.expandIconCls
      @JSImport("rc-easyui", "AccordionPanel.propTypes.expandIconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footer {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.footer")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.footer
      @JSImport("rc-easyui", "AccordionPanel.propTypes.footer.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.footerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.footerCls
      @JSImport("rc-easyui", "AccordionPanel.propTypes.footerCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object footerStyle {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.footerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.footerStyle
      @JSImport("rc-easyui", "AccordionPanel.propTypes.footerStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object header {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.header")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.header
      @JSImport("rc-easyui", "AccordionPanel.propTypes.header.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object headerCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.headerCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.headerCls
      @JSImport("rc-easyui", "AccordionPanel.propTypes.headerCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object headerStyle {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.headerStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.headerStyle
      @JSImport("rc-easyui", "AccordionPanel.propTypes.headerStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.iconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.iconCls
      @JSImport("rc-easyui", "AccordionPanel.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onCollapse {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.onCollapse")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.onCollapse
      @JSImport("rc-easyui", "AccordionPanel.propTypes.onCollapse.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onExpand {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.onExpand")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.onExpand
      @JSImport("rc-easyui", "AccordionPanel.propTypes.onExpand.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showFooter {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.showFooter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.showFooter
      @JSImport("rc-easyui", "AccordionPanel.propTypes.showFooter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object showHeader {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.showHeader")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.showHeader
      @JSImport("rc-easyui", "AccordionPanel.propTypes.showHeader.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object title {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "AccordionPanel.propTypes.title")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.AccordionPanel.propTypes.title
      @JSImport("rc-easyui", "AccordionPanel.propTypes.title.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
