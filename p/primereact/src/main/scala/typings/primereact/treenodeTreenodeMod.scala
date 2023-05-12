package typings.primereact

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treenodeTreenodeMod {
  
  trait TreeNode extends StObject {
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
    
    /**
      * Style class of the node.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Data represented by the node.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Whether the node is draggable when dragdrop is enabled.
      * @defaultValue true
      */
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the node is droppable when dragdrop is enabled.
      * @defaultValue true
      */
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Visibility of node.
      */
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon of the node to display next to content.
      */
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<TreeNode> */ Any
      ] = js.undefined
    
    /**
      * Unique identifier of the element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Unique key of the node.
      */
    var key: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Label of the node.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies if the node has children. Used in lazy loading.
      */
    var leaf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the node is selectable when selection mode is enabled.
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Inline style of the node.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TreeNode {
    
    inline def apply(): TreeNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeNode] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[TreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: TreeNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      inline def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<TreeNode> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLeaf(value: Boolean): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
      
      inline def setLeafUndefined: Self = StObject.set(x, "leaf", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
