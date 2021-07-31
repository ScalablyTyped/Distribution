package typings.rcEasyui.mod

import typings.rcEasyui.anon.Disabled
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "MenuItem")
@js.native
class MenuItem protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenuItem(e: js.Any): Unit = js.native
  
  def handleItemClick(e: js.Any): Unit = js.native
  
  def handleMenuAdd(e: js.Any): Unit = js.native
  
  def handleMenuRemove(): Unit = js.native
  
  def handleMouseEnter(): Unit = js.native
  
  def handleMouseLeave(): Unit = js.native
  
  def itemClasses(): js.Any = js.native
}
/* static members */
object MenuItem {
  
  @JSImport("rc-easyui", "MenuItem")
  @js.native
  val ^ : js.Any = js.native
  
  object contextTypes {
    
    object locale {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.contextTypes.locale
      @JSImport("rc-easyui", "MenuItem.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.contextTypes.t
      @JSImport("rc-easyui", "MenuItem.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  @JSImport("rc-easyui", "MenuItem.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  @scala.inline
  def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  object propTypes {
    
    object className {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.propTypes.className
      @JSImport("rc-easyui", "MenuItem.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object disabled {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.propTypes.disabled")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.propTypes.disabled
      @JSImport("rc-easyui", "MenuItem.propTypes.disabled.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object iconCls {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.propTypes.iconCls")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.propTypes.iconCls
      @JSImport("rc-easyui", "MenuItem.propTypes.iconCls.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.propTypes.style
      @JSImport("rc-easyui", "MenuItem.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object text {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.propTypes.text")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.propTypes.text
      @JSImport("rc-easyui", "MenuItem.propTypes.text.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object value {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "MenuItem.propTypes.value")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.MenuItem.propTypes.value
      @JSImport("rc-easyui", "MenuItem.propTypes.value.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
