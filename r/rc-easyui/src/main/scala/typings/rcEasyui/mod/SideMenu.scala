package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "SideMenu")
@js.native
class SideMenu protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  @JSName("componentDidMount")
  def componentDidMount_MSideMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSideMenu(e: js.Any): Unit = js.native
  def handleItemClick(e: js.Any): Unit = js.native
  def handleNodeClick(e: js.Any): js.Any = js.native
  def handleSelectionChange(e: js.Any): Unit = js.native
  def renderCollapsed(): js.Any = js.native
  def renderItems(): js.Any = js.native
  def setData(e: js.Any): Unit = js.native
}

@JSImport("rc-easyui", "SideMenu")
@js.native
object SideMenu extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.SideMenu.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.SideMenu.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    val animate: Boolean = js.native
    val border: Boolean = js.native
    val collapsed: Boolean = js.native
    val floatMenuPosition: String = js.native
    val floatMenuWidth: Double = js.native
    val multiple: Boolean = js.native
    val showCollapsedText: Boolean = js.native
    def onItemClick(e: js.Any): Unit = js.native
    def onSelectionChange(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object animate extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.animate
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object border extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.border
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object className extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.className
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object collapsed extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.collapsed
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object collapsedCls extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.collapsedCls
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object data extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.data
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object floatMenuPosition extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.floatMenuPosition
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object floatMenuWidth extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.floatMenuWidth
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object multiple extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.multiple
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object selection extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.selection
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object showCollapsedText extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.showCollapsedText
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object style extends js.Object {
      // Circular reference from rc_easyui.SideMenu.propTypes.style
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

