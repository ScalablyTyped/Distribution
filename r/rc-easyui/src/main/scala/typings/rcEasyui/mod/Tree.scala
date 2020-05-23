package typings.rcEasyui.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-easyui", "Tree")
@js.native
class Tree protected ()
  extends Component[js.Any, js.Object, js.Any] {
  def this(e: js.Any) = this()
  def beginEdit(e: js.Any, args: js.Any*): js.Any = js.native
  def cancelEdit(): Unit = js.native
  def checkNode(e: js.Any): Unit = js.native
  def collapseNode(e: js.Any): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTree(e: js.Any): Unit = js.native
  def doFilter(e: js.Any): Unit = js.native
  def endEdit(): js.Any = js.native
  def expandNode(e: js.Any): Unit = js.native
  def getCheckedNodes(args: js.Any*): js.Any = js.native
  def isEditing(e: js.Any): js.Any = js.native
  def selectNode(e: js.Any): Unit = js.native
  def uncheckAllNodes(): Unit = js.native
  def uncheckNode(e: js.Any): Unit = js.native
}

@JSImport("rc-easyui", "Tree")
@js.native
object Tree extends js.Object {
  @js.native
  object contextTypes extends js.Object {
    @js.native
    object locale extends js.Object {
      // Circular reference from rc_easyui.Tree.contextTypes.locale
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object t extends js.Object {
      // Circular reference from rc_easyui.Tree.contextTypes.t
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
  @js.native
  object defaultProps extends js.Object {
    val animate: Boolean = js.native
    val cascadeCheck: Boolean = js.native
    val checkbox: Boolean = js.native
    val clickToEdit: Boolean = js.native
    val data: js.Array[js.Any] = js.native
    val dblclickToEdit: Boolean = js.native
    val filterIncludingChild: Boolean = js.native
    val selectLeafOnly: Boolean = js.native
    def filter(e: js.Any, t: js.Any): js.Any = js.native
    def onCheckChange(e: js.Any): Unit = js.native
    def onEditBegin(e: js.Any): Unit = js.native
    def onEditCancel(e: js.Any): Unit = js.native
    def onEditEnd(e: js.Any): Unit = js.native
    def onNodeCheck(e: js.Any): Unit = js.native
    def onNodeClick(e: js.Any): Unit = js.native
    def onNodeCollapse(e: js.Any): Unit = js.native
    def onNodeContextMenu(e: js.Any): Unit = js.native
    def onNodeDblClick(e: js.Any): Unit = js.native
    def onNodeExpand(e: js.Any): Unit = js.native
    def onNodeUncheck(e: js.Any): Unit = js.native
    def onSelectionChange(e: js.Any): Unit = js.native
  }
  
  @js.native
  object propTypes extends js.Object {
    @js.native
    object animate extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.animate
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object cascadeCheck extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.cascadeCheck
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object checkbox extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.checkbox
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object clickToEdit extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.clickToEdit
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object data extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.data
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object dblclickToEdit extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.dblclickToEdit
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object editor extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.editor
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object filter extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.filter
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object filterIncludingChild extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.filterIncludingChild
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object render extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.render
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object selectLeafOnly extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.selectLeafOnly
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
    @js.native
    object selection extends js.Object {
      // Circular reference from rc_easyui.Tree.propTypes.selection
      val isRequired: js.Any = js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
    }
    
  }
  
}

