package typings.reactTreeview

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-treeview", JSImport.Namespace)
  @js.native
  open class ^ () extends Component[TreeProps, Any, Any]
  
  trait TreeProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var childrenClassName: js.UndefOr[String] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var defaultCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var itemClassName: js.UndefOr[String] = js.undefined
    
    var nodeLabel: ReactNode
    
    var treeViewClassName: js.UndefOr[String] = js.undefined
  }
  object TreeProps {
    
    inline def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    extension [Self <: TreeProps](x: Self) {
      
      inline def setChildrenClassName(value: String): Self = StObject.set(x, "childrenClassName", value.asInstanceOf[js.Any])
      
      inline def setChildrenClassNameUndefined: Self = StObject.set(x, "childrenClassName", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setDefaultCollapsed(value: Boolean): Self = StObject.set(x, "defaultCollapsed", value.asInstanceOf[js.Any])
      
      inline def setDefaultCollapsedUndefined: Self = StObject.set(x, "defaultCollapsed", js.undefined)
      
      inline def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      inline def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      inline def setNodeLabel(value: ReactNode): Self = StObject.set(x, "nodeLabel", value.asInstanceOf[js.Any])
      
      inline def setNodeLabelUndefined: Self = StObject.set(x, "nodeLabel", js.undefined)
      
      inline def setTreeViewClassName(value: String): Self = StObject.set(x, "treeViewClassName", value.asInstanceOf[js.Any])
      
      inline def setTreeViewClassNameUndefined: Self = StObject.set(x, "treeViewClassName", js.undefined)
    }
  }
  
  type TreeView = Component[TreeProps, Any, Any]
}
