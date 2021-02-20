package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Tree {
  
  object contextTypes {
    
    object locale {
      
      @JSImport("rc-easyui", "Tree.contextTypes.locale")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.contextTypes.locale
      @JSImport("rc-easyui", "Tree.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @JSImport("rc-easyui", "Tree.contextTypes.t")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.contextTypes.t
      @JSImport("rc-easyui", "Tree.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Tree.defaultProps.animate")
    @js.native
    val animate: Boolean = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.cascadeCheck")
    @js.native
    val cascadeCheck: Boolean = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.checkbox")
    @js.native
    val checkbox: Boolean = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.clickToEdit")
    @js.native
    val clickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.data")
    @js.native
    val data: js.Array[js.Any] = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.dblclickToEdit")
    @js.native
    val dblclickToEdit: Boolean = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.filter")
    @js.native
    def filter(e: js.Any, t: js.Any): js.Any = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.filterIncludingChild")
    @js.native
    val filterIncludingChild: Boolean = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onCheckChange")
    @js.native
    def onCheckChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onEditBegin")
    @js.native
    def onEditBegin(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onEditCancel")
    @js.native
    def onEditCancel(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onEditEnd")
    @js.native
    def onEditEnd(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onNodeCheck")
    @js.native
    def onNodeCheck(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onNodeClick")
    @js.native
    def onNodeClick(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onNodeCollapse")
    @js.native
    def onNodeCollapse(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onNodeContextMenu")
    @js.native
    def onNodeContextMenu(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onNodeDblClick")
    @js.native
    def onNodeDblClick(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onNodeExpand")
    @js.native
    def onNodeExpand(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onNodeUncheck")
    @js.native
    def onNodeUncheck(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.onSelectionChange")
    @js.native
    def onSelectionChange(e: js.Any): Unit = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.selectLeafOnly")
    @js.native
    val selectLeafOnly: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      @JSImport("rc-easyui", "Tree.propTypes.animate")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.animate
      @JSImport("rc-easyui", "Tree.propTypes.animate.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object cascadeCheck {
      
      @JSImport("rc-easyui", "Tree.propTypes.cascadeCheck")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.cascadeCheck
      @JSImport("rc-easyui", "Tree.propTypes.cascadeCheck.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object checkbox {
      
      @JSImport("rc-easyui", "Tree.propTypes.checkbox")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.checkbox
      @JSImport("rc-easyui", "Tree.propTypes.checkbox.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object clickToEdit {
      
      @JSImport("rc-easyui", "Tree.propTypes.clickToEdit")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.clickToEdit
      @JSImport("rc-easyui", "Tree.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object data {
      
      @JSImport("rc-easyui", "Tree.propTypes.data")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.data
      @JSImport("rc-easyui", "Tree.propTypes.data.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object dblclickToEdit {
      
      @JSImport("rc-easyui", "Tree.propTypes.dblclickToEdit")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "Tree.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editor {
      
      @JSImport("rc-easyui", "Tree.propTypes.editor")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.editor
      @JSImport("rc-easyui", "Tree.propTypes.editor.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filter {
      
      @JSImport("rc-easyui", "Tree.propTypes.filter")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.filter
      @JSImport("rc-easyui", "Tree.propTypes.filter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterIncludingChild {
      
      @JSImport("rc-easyui", "Tree.propTypes.filterIncludingChild")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.filterIncludingChild
      @JSImport("rc-easyui", "Tree.propTypes.filterIncludingChild.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object render {
      
      @JSImport("rc-easyui", "Tree.propTypes.render")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.render
      @JSImport("rc-easyui", "Tree.propTypes.render.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectLeafOnly {
      
      @JSImport("rc-easyui", "Tree.propTypes.selectLeafOnly")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.selectLeafOnly
      @JSImport("rc-easyui", "Tree.propTypes.selectLeafOnly.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selection {
      
      @JSImport("rc-easyui", "Tree.propTypes.selection")
      @js.native
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.selection
      @JSImport("rc-easyui", "Tree.propTypes.selection.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
