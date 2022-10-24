package typings.rcTree

import typings.rcTree.anon.DropLevelOffset
import typings.rcTree.anon.PartialTreeStateDataNode
import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esTreeMod.TreeProps
import typings.rcTree.esTreeMod.TreeState
import typings.rcTree.esTreeNodeMod.TreeNodeProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-tree", JSImport.Default)
  @js.native
  open class default[TreeDataType /* <: DataNode | BasicDataNode */] ()
    extends typings.rcTree.esTreeMod.default[TreeDataType]
  object default {
    
    @JSImport("rc-tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rc-tree", "default.TreeNode")
    @js.native
    def TreeNode: FC[TreeNodeProps[DataNode]] = js.native
    inline def TreeNode_=(x: FC[TreeNodeProps[DataNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeNode")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-tree", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def allowDrop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDrop")().asInstanceOf[Boolean]
      
      @JSImport("rc-tree", "default.defaultProps.autoExpandParent")
      @js.native
      def autoExpandParent: Boolean = js.native
      inline def autoExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.checkStrictly")
      @js.native
      def checkStrictly: Boolean = js.native
      inline def checkStrictly_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkStrictly")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.checkable")
      @js.native
      def checkable: Boolean = js.native
      inline def checkable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultCheckedKeys")
      @js.native
      def defaultCheckedKeys: js.Array[Any] = js.native
      inline def defaultCheckedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultExpandAll")
      @js.native
      def defaultExpandAll: Boolean = js.native
      inline def defaultExpandAll_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandAll")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultExpandParent")
      @js.native
      def defaultExpandParent: Boolean = js.native
      inline def defaultExpandParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandParent")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultExpandedKeys")
      @js.native
      def defaultExpandedKeys: js.Array[Any] = js.native
      inline def defaultExpandedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultExpandedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.defaultSelectedKeys")
      @js.native
      def defaultSelectedKeys: js.Array[Any] = js.native
      inline def defaultSelectedKeys_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.draggable")
      @js.native
      def draggable: Boolean = js.native
      inline def draggable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.dropIndicatorRender")
      @js.native
      def dropIndicatorRender: js.Function1[/* param0 */ DropLevelOffset, Element] = js.native
      inline def dropIndicatorRender_=(x: js.Function1[/* param0 */ DropLevelOffset, Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dropIndicatorRender")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.expandAction")
      @js.native
      def expandAction: Boolean = js.native
      inline def expandAction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAction")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.multiple")
      @js.native
      def multiple: Boolean = js.native
      inline def multiple_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiple")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.selectable")
      @js.native
      def selectable: Boolean = js.native
      inline def selectable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.showIcon")
      @js.native
      def showIcon: Boolean = js.native
      inline def showIcon_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-tree", "default.defaultProps.showLine")
      @js.native
      def showLine: Boolean = js.native
      inline def showLine_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showLine")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: TreeProps[DataNode], prevState: TreeState[DataNode]): PartialTreeStateDataNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialTreeStateDataNode]
  }
  
  @JSImport("rc-tree", "TreeNode")
  @js.native
  val TreeNode: FC[TreeNodeProps[DataNode]] = js.native
}
