package typings.reactTreeview

import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-treeview", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[TreeProps, js.Any, js.Any]
  
  @js.native
  trait TreeProps extends HTMLAttributes[HTMLDivElement] {
    
    var childrenClassName: js.UndefOr[String] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var defaultCollapsed: js.UndefOr[Boolean] = js.native
    
    var itemClassName: js.UndefOr[String] = js.native
    
    var nodeLabel: ReactNode = js.native
    
    var treeViewClassName: js.UndefOr[String] = js.native
  }
  object TreeProps {
    
    @scala.inline
    def apply(): TreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeProps]
    }
    
    @scala.inline
    implicit class TreePropsMutableBuilder[Self <: TreeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenClassName(value: String): Self = StObject.set(x, "childrenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenClassNameUndefined: Self = StObject.set(x, "childrenClassName", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setDefaultCollapsed(value: Boolean): Self = StObject.set(x, "defaultCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCollapsedUndefined: Self = StObject.set(x, "defaultCollapsed", js.undefined)
      
      @scala.inline
      def setItemClassName(value: String): Self = StObject.set(x, "itemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemClassNameUndefined: Self = StObject.set(x, "itemClassName", js.undefined)
      
      @scala.inline
      def setNodeLabel(value: ReactNode): Self = StObject.set(x, "nodeLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeLabelUndefined: Self = StObject.set(x, "nodeLabel", js.undefined)
      
      @scala.inline
      def setTreeViewClassName(value: String): Self = StObject.set(x, "treeViewClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeViewClassNameUndefined: Self = StObject.set(x, "treeViewClassName", js.undefined)
    }
  }
  
  type TreeView = Component[TreeProps, js.Any, js.Any]
}
