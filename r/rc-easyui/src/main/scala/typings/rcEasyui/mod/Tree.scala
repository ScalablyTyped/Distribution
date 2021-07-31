package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.contextTypes.locale
      @JSImport("rc-easyui", "Tree.contextTypes.locale.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object t {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.contextTypes.t
      @JSImport("rc-easyui", "Tree.contextTypes.t.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
  
  object defaultProps {
    
    @JSImport("rc-easyui", "Tree.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
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
    
    @scala.inline
    def filter(e: js.Any, t: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("rc-easyui", "Tree.defaultProps.filterIncludingChild")
    @js.native
    val filterIncludingChild: Boolean = js.native
    
    @scala.inline
    def onCheckChange(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCheckChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEditBegin(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditBegin")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEditCancel(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditCancel")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onEditEnd(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditEnd")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onNodeCheck(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeCheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onNodeClick(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onNodeCollapse(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeCollapse")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onNodeContextMenu(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onNodeDblClick(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeDblClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onNodeExpand(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeExpand")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onNodeUncheck(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeUncheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def onSelectionChange(e: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "Tree.defaultProps.selectLeafOnly")
    @js.native
    val selectLeafOnly: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.animate
      @JSImport("rc-easyui", "Tree.propTypes.animate.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object cascadeCheck {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.cascadeCheck")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.cascadeCheck
      @JSImport("rc-easyui", "Tree.propTypes.cascadeCheck.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object checkbox {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.checkbox")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.checkbox
      @JSImport("rc-easyui", "Tree.propTypes.checkbox.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object clickToEdit {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.clickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.clickToEdit
      @JSImport("rc-easyui", "Tree.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object data {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.data
      @JSImport("rc-easyui", "Tree.propTypes.data.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object dblclickToEdit {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.dblclickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "Tree.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object editor {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.editor")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.editor
      @JSImport("rc-easyui", "Tree.propTypes.editor.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filter {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.filter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.filter
      @JSImport("rc-easyui", "Tree.propTypes.filter.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object filterIncludingChild {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.filterIncludingChild")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.filterIncludingChild
      @JSImport("rc-easyui", "Tree.propTypes.filterIncludingChild.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object render {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.render")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.render
      @JSImport("rc-easyui", "Tree.propTypes.render.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selectLeafOnly {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.selectLeafOnly")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.selectLeafOnly
      @JSImport("rc-easyui", "Tree.propTypes.selectLeafOnly.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
    
    object selection {
      
      @scala.inline
      def apply(e: js.Any, t: js.Any, n: js.Any, r: js.Any, i: js.Any, a: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.selection
      @JSImport("rc-easyui", "Tree.propTypes.selection.isRequired")
      @js.native
      val isRequired: js.Any = js.native
    }
  }
}
