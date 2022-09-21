package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "SideMenu")
@js.native
open class SideMenu protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  @JSName("componentDidMount")
  def componentDidMount_MSideMenu(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSideMenu(e: Any): Unit = js.native
  
  def handleItemClick(e: Any): Unit = js.native
  
  def handleNodeClick(e: Any): Any = js.native
  
  def handleSelectionChange(e: Any): Unit = js.native
  
  def renderCollapsed(): Any = js.native
  
  def renderItems(): Any = js.native
  
  def setData(e: Any): Unit = js.native
}
object SideMenu {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.contextTypes.locale
      @JSImport("rc-easyui", "SideMenu.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.contextTypes.t
      @JSImport("rc-easyui", "SideMenu.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "SideMenu.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "SideMenu.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "SideMenu.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "SideMenu.defaultProps.collapsed")
    @js.native
    val collapsed: Boolean = js.native
    
    @JSImport("rc-easyui", "SideMenu.defaultProps.floatMenuPosition")
    @js.native
    val floatMenuPosition: String = js.native
    
    @JSImport("rc-easyui", "SideMenu.defaultProps.floatMenuWidth")
    @js.native
    val floatMenuWidth: Double = js.native
    
    @JSImport("rc-easyui", "SideMenu.defaultProps.multiple")
    @js.native
    val multiple: Boolean = js.native
    
    inline def onItemClick(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onItemClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onSelectionChange(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "SideMenu.defaultProps.showCollapsedText")
    @js.native
    val showCollapsedText: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.animate
      @JSImport("rc-easyui", "SideMenu.propTypes.animate.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object border {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.border
      @JSImport("rc-easyui", "SideMenu.propTypes.border.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object className {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.className
      @JSImport("rc-easyui", "SideMenu.propTypes.className.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapsed {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.collapsed")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.collapsed
      @JSImport("rc-easyui", "SideMenu.propTypes.collapsed.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object collapsedCls {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.collapsedCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.collapsedCls
      @JSImport("rc-easyui", "SideMenu.propTypes.collapsedCls.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object data {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.data
      @JSImport("rc-easyui", "SideMenu.propTypes.data.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object floatMenuPosition {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.floatMenuPosition")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.floatMenuPosition
      @JSImport("rc-easyui", "SideMenu.propTypes.floatMenuPosition.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object floatMenuWidth {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.floatMenuWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.floatMenuWidth
      @JSImport("rc-easyui", "SideMenu.propTypes.floatMenuWidth.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object multiple {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.multiple")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.multiple
      @JSImport("rc-easyui", "SideMenu.propTypes.multiple.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selection {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.selection
      @JSImport("rc-easyui", "SideMenu.propTypes.selection.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object showCollapsedText {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.showCollapsedText")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.showCollapsedText
      @JSImport("rc-easyui", "SideMenu.propTypes.showCollapsedText.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object style {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "SideMenu.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.SideMenu.propTypes.style
      @JSImport("rc-easyui", "SideMenu.propTypes.style.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
