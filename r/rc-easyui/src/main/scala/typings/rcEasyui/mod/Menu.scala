package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Menu")
@js.native
class Menu protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def alignContextMenu(): Unit = js.native
  
  def alignTo(e: js.Any, args: js.Any*): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MMenu(): Unit = js.native
  
  def containerClasses(): js.Any = js.native
  
  def containerStyle(): js.Any = js.native
  
  def delayHide(): Unit = js.native
  
  def handleDocumentClick(e: js.Any): Unit = js.native
  
  def handleItemClick(e: js.Any): Unit = js.native
  
  def handleMouseOut(): Unit = js.native
  
  def handleMouseOver(): Unit = js.native
  
  def hide(): Unit = js.native
  
  def show(e: js.Any, n: js.Any): js.Any = js.native
  
  def showAt(e: js.Any, args: js.Any*): js.Any = js.native
  
  def showContextMenu(e: js.Any, t: js.Any): js.Any = js.native
}
/* static members */
object Menu {
  
  @JSImport("rc-easyui", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.contextTypes.locale
      @JSImport("rc-easyui", "Menu.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.contextTypes.t
      @JSImport("rc-easyui", "Menu.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Menu.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Menu.defaultProps.duration")
    @js.native
    val duration: Double = js.native
    
    @JSImport("rc-easyui", "Menu.defaultProps.inline")
    @js.native
    val `inline`: Boolean = js.native
    
    @JSImport("rc-easyui", "Menu.defaultProps.noline")
    @js.native
    val noline: Boolean = js.native
    
    inline def onHide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onHide")().asInstanceOf[Unit]
    
    inline def onItemClick(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onItemClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onShow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onShow")().asInstanceOf[Unit]
  }
  
  object propTypes {
    
    object className {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.className
      @JSImport("rc-easyui", "Menu.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object duration {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.duration")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.duration
      @JSImport("rc-easyui", "Menu.propTypes.duration.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object `inline` {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.inline")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.inline
      @JSImport("rc-easyui", "Menu.propTypes.inline.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object menuCls {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.menuCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.menuCls
      @JSImport("rc-easyui", "Menu.propTypes.menuCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object menuStyle {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.menuStyle")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.menuStyle
      @JSImport("rc-easyui", "Menu.propTypes.menuStyle.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object menuWidth {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.menuWidth")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.menuWidth
      @JSImport("rc-easyui", "Menu.propTypes.menuWidth.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object noline {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.noline")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.noline
      @JSImport("rc-easyui", "Menu.propTypes.noline.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Menu.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Menu.propTypes.style
      @JSImport("rc-easyui", "Menu.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  @JSImport("rc-easyui", "Menu.zIndex")
  @js.native
  def zIndex: Double = js.native
  inline def zIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
}
