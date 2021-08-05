package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Accordion")
@js.native
class Accordion protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  
  def accordionClasses(): js.Any = js.native
  
  def changePanels(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAccordion(e: js.Any): js.Any = js.native
  
  def getPanel(e: js.Any): js.Any = js.native
  
  def getPanelIndex(e: js.Any): js.Any = js.native
  
  def getPanels(e: js.Any): js.Any = js.native
  
  def getSelectedIndex(): js.Any = js.native
  
  def getSelectedPanel(): js.Any = js.native
  
  def getSelectedPanels(): js.Any = js.native
  
  def handlePanelAdd(e: js.Any): Unit = js.native
  
  def handlePanelRemove(e: js.Any): Unit = js.native
  
  def handlePanelSelect(e: js.Any): Unit = js.native
  
  def handlePanelUnselect(e: js.Any): Unit = js.native
  
  def initPanels(): js.Any = js.native
  
  def initSelectedPanel(): js.Any = js.native
  
  def select(e: js.Any): Unit = js.native
  
  def unselect(e: js.Any): Unit = js.native
}
object Accordion {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.contextTypes.locale
      @JSImport("rc-easyui", "Accordion.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.contextTypes.t
      @JSImport("rc-easyui", "Accordion.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Accordion.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-easyui", "Accordion.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "Accordion.defaultProps.border")
    @js.native
    val border: Boolean = js.native
    
    @JSImport("rc-easyui", "Accordion.defaultProps.multiple")
    @js.native
    val multiple: Boolean = js.native
    
    inline def onPanelSelect(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelSelect")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onPanelUnselect(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPanelUnselect")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "Accordion.defaultProps.selectedIndex")
    @js.native
    val selectedIndex: Double = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.animate
      @JSImport("rc-easyui", "Accordion.propTypes.animate.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object border {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.border")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.border
      @JSImport("rc-easyui", "Accordion.propTypes.border.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object className {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.className")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.className
      @JSImport("rc-easyui", "Accordion.propTypes.className.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object multiple {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.multiple")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.multiple
      @JSImport("rc-easyui", "Accordion.propTypes.multiple.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onPanelSelect {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.onPanelSelect")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.onPanelSelect
      @JSImport("rc-easyui", "Accordion.propTypes.onPanelSelect.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object onPanelUnselect {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.onPanelUnselect")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.onPanelUnselect
      @JSImport("rc-easyui", "Accordion.propTypes.onPanelUnselect.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectedIndex {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.selectedIndex")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.selectedIndex
      @JSImport("rc-easyui", "Accordion.propTypes.selectedIndex.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object style {
      
      inline def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Accordion.propTypes.style")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Accordion.propTypes.style
      @JSImport("rc-easyui", "Accordion.propTypes.style.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
