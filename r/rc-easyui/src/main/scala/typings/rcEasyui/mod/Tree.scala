package typings.rcEasyui.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-easyui", "Tree")
@js.native
open class Tree protected ()
  extends Component[Any, js.Object, Any] {
  def this(e: Any) = this()
  
  def beginEdit(e: Any, args: Any*): Any = js.native
  
  def cancelEdit(): Unit = js.native
  
  def checkNode(e: Any): Unit = js.native
  
  def collapseNode(e: Any): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MTree(e: Any): Unit = js.native
  
  def doFilter(e: Any): Unit = js.native
  
  def endEdit(): Any = js.native
  
  def expandNode(e: Any): Unit = js.native
  
  def getCheckedNodes(args: Any*): Any = js.native
  
  def isEditing(e: Any): Any = js.native
  
  def selectNode(e: Any): Unit = js.native
  
  def uncheckAllNodes(): Unit = js.native
  
  def uncheckNode(e: Any): Unit = js.native
}
object Tree {
  
  object contextTypes {
    
    object locale {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.contextTypes.locale")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.contextTypes.locale
      @JSImport("rc-easyui", "Tree.contextTypes.locale.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object t {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.contextTypes.t")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.contextTypes.t
      @JSImport("rc-easyui", "Tree.contextTypes.t.isRequired")
      @js.native
      val isRequired: Any = js.native
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
    val data: js.Array[Any] = js.native
    
    @JSImport("rc-easyui", "Tree.defaultProps.dblclickToEdit")
    @js.native
    val dblclickToEdit: Boolean = js.native
    
    inline def filter(e: Any, t: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("rc-easyui", "Tree.defaultProps.filterIncludingChild")
    @js.native
    val filterIncludingChild: Boolean = js.native
    
    inline def onCheckChange(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCheckChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEditBegin(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditBegin")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEditCancel(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditCancel")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEditEnd(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEditEnd")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onNodeCheck(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeCheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onNodeClick(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onNodeCollapse(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeCollapse")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onNodeContextMenu(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeContextMenu")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onNodeDblClick(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeDblClick")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onNodeExpand(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeExpand")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onNodeUncheck(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onNodeUncheck")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onSelectionChange(e: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onSelectionChange")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("rc-easyui", "Tree.defaultProps.selectLeafOnly")
    @js.native
    val selectLeafOnly: Boolean = js.native
  }
  
  object propTypes {
    
    object animate {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.animate")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.animate
      @JSImport("rc-easyui", "Tree.propTypes.animate.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object cascadeCheck {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.cascadeCheck")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.cascadeCheck
      @JSImport("rc-easyui", "Tree.propTypes.cascadeCheck.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object checkbox {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.checkbox")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.checkbox
      @JSImport("rc-easyui", "Tree.propTypes.checkbox.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object clickToEdit {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.clickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.clickToEdit
      @JSImport("rc-easyui", "Tree.propTypes.clickToEdit.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object data {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.data")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.data
      @JSImport("rc-easyui", "Tree.propTypes.data.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object dblclickToEdit {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.dblclickToEdit")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.dblclickToEdit
      @JSImport("rc-easyui", "Tree.propTypes.dblclickToEdit.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object editor {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.editor")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.editor
      @JSImport("rc-easyui", "Tree.propTypes.editor.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filter {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.filter")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.filter
      @JSImport("rc-easyui", "Tree.propTypes.filter.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object filterIncludingChild {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.filterIncludingChild")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.filterIncludingChild
      @JSImport("rc-easyui", "Tree.propTypes.filterIncludingChild.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object render {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.render")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.render
      @JSImport("rc-easyui", "Tree.propTypes.render.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selectLeafOnly {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.selectLeafOnly")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.selectLeafOnly
      @JSImport("rc-easyui", "Tree.propTypes.selectLeafOnly.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
    
    object selection {
      
      inline def apply(e: Any, t: Any, n: Any, r: Any, i: Any, a: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], t.asInstanceOf[js.Any], n.asInstanceOf[js.Any], r.asInstanceOf[js.Any], i.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("rc-easyui", "Tree.propTypes.selection")
      @js.native
      val ^ : js.Any = js.native
      
      // Circular reference from rc_easyui.Tree.propTypes.selection
      @JSImport("rc-easyui", "Tree.propTypes.selection.isRequired")
      @js.native
      val isRequired: Any = js.native
    }
  }
}
