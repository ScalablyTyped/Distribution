package typings.primereact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeNodeMod {
  
  trait TreeNode extends StObject {
    
    var children: js.Array[TreeNode]
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[js.Any] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var leaf: js.UndefOr[Boolean] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object TreeNode {
    
    @scala.inline
    def apply(children: js.Array[TreeNode]): TreeNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeNode]
    }
    
    @scala.inline
    implicit class TreeNodeMutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLeaf(value: Boolean): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeafUndefined: Self = StObject.set(x, "leaf", js.undefined)
      
      @scala.inline
      def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
