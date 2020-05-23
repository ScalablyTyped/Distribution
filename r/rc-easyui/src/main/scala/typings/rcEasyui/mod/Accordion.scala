package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

@JSImport("rc-easyui", "Accordion")
@js.native
object Accordion extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.Accordion.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.Accordion.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    val animate: Boolean = js.native
    val border: Boolean = js.native
    val multiple: Boolean = js.native
    val selectedIndex: Double = js.native
    def onPanelSelect(e: js.Any): Unit = js.native
    def onPanelUnselect(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object animate extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.animate
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object border extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.border
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object className extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.className
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object multiple extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.multiple
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object onPanelSelect extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.onPanelSelect
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object onPanelUnselect extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.onPanelUnselect
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object selectedIndex extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.selectedIndex
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object style extends js.Object {
      // Circular reference from rc_easyui.Accordion.propTypes.style
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

