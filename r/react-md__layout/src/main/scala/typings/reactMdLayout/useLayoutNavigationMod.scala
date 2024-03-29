package typings.reactMdLayout

import typings.react.mod.ElementType
import typings.react.mod.SetStateAction
import typings.reactMdLayout.typesMod.LayoutNavigationTree
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.SelectedIds
import typings.reactMdTree.typesMod.TreeItemExpansion
import typings.reactMdTree.typesMod.TreeItemId
import typings.reactMdTree.typesMod.TreeItemSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useLayoutNavigationMod {
  
  @JSImport("@react-md/layout/types/useLayoutNavigation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useLayoutNavigation[T /* <: BaseTreeItem */](navItems: LayoutNavigationTree[T], pathname: String): LayoutNavigationState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutNavigation")(navItems.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[LayoutNavigationState[T]]
  inline def useLayoutNavigation[T /* <: BaseTreeItem */](navItems: LayoutNavigationTree[T], pathname: String, linkComponent: ElementType[Any]): LayoutNavigationState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutNavigation")(navItems.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], linkComponent.asInstanceOf[js.Any])).asInstanceOf[LayoutNavigationState[T]]
  
  trait LayoutNavigationState[T /* <: BaseTreeItem */]
    extends StObject
       with TreeItemSelection
       with TreeItemExpansion {
    
    /**
      * The link component to use when a nav item is clicked. This defaults to the
      * `Link` component from `@react-md/link`, but can also be a `Link` from
      * `react-router` or another routing library.
      */
    var linkComponent: ElementType[Any]
    
    /**
      * The navigation items to use that will be passed to the `Tree` component
      * from `@react-md/tree`
      */
    var navItems: LayoutNavigationTree[T]
  }
  object LayoutNavigationState {
    
    inline def apply[T /* <: BaseTreeItem */](
      expandedIds: ExpandedIds,
      linkComponent: ElementType[Any],
      navItems: LayoutNavigationTree[T],
      onItemExpansion: (TreeItemId, Boolean) => Unit,
      onItemSelect: TreeItemId => Unit,
      onMultiItemExpansion: SetStateAction[ExpandedIds] => Unit,
      onMultiItemSelect: SelectedIds => Unit,
      selectedIds: SelectedIds
    ): LayoutNavigationState[T] = {
      val __obj = js.Dynamic.literal(expandedIds = expandedIds.asInstanceOf[js.Any], linkComponent = linkComponent.asInstanceOf[js.Any], navItems = navItems.asInstanceOf[js.Any], onItemExpansion = js.Any.fromFunction2(onItemExpansion), onItemSelect = js.Any.fromFunction1(onItemSelect), onMultiItemExpansion = js.Any.fromFunction1(onMultiItemExpansion), onMultiItemSelect = js.Any.fromFunction1(onMultiItemSelect), selectedIds = selectedIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutNavigationState[T]]
    }
    
    extension [Self <: LayoutNavigationState[?], T /* <: BaseTreeItem */](x: Self & LayoutNavigationState[T]) {
      
      inline def setLinkComponent(value: ElementType[Any]): Self = StObject.set(x, "linkComponent", value.asInstanceOf[js.Any])
      
      inline def setNavItems(value: LayoutNavigationTree[T]): Self = StObject.set(x, "navItems", value.asInstanceOf[js.Any])
    }
  }
}
