package typings.reactMdLayout

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdLayout.layoutNavigationMod.LayoutNavigationProps
import typings.reactMdLayout.typesMod.LayoutNavigationItem
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miniLayoutWrapperMod {
  
  @JSImport("@react-md/layout/types/MiniLayoutWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MiniLayoutWrapper(
    hasMiniMiniHiddenMiniNavMiniNavItemsTreePropsHeaderHeaderPropsHeaderTitleHeaderTitlePropsCloseNavCloseNavPropsChildrenContainerPropsProps: MiniLayoutWrapperProps[LayoutNavigationItem]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MiniLayoutWrapper")(hasMiniMiniHiddenMiniNavMiniNavItemsTreePropsHeaderHeaderPropsHeaderTitleHeaderTitlePropsCloseNavCloseNavPropsChildrenContainerPropsProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait MiniLayoutWrapperProps[T /* <: BaseTreeItem */]
    extends StObject
       with LayoutNavigationProps[T] {
    
    /**
      * The children to render. This should normally be the `LayoutMain` component.
      */
    var children: ReactNode
    
    /**
      * Any additional props to provide to the wrapping `<div>`.
      */
    var containerProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.undefined
    
    /**
      * Boolean if the `mini` layout should be hidden. This should normally happen
      * after the non-mini layout becomes visible.
      */
    var miniHidden: Boolean
    
    /**
      * A custom implementation for the main mini navigation component within the
      * `Layout`. If this is not `undefined`, it will be used instead of the
      * default implementation.
      *
      * Using this prop will make the following props do nothing for the mini nav:
      *
      * - `navProps`
      * - `navHeader`
      * - `navHeaderProps`
      * - `navHeaderTitle`
      * - `navHeaderTitleProps`
      * - `closeNav`
      * - `closeNavProps`
      * - `treeProps`
      *
      * @remarks \@since.2.7.0
      */
    var miniNav: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional tree to use for the mini navigation pane since the default
      * behavior of rendering mini tree items might hide content in an
      * undesirable way.
      *
      * @remarks \@since 2.7.0
      * @see {@link defaultMiniNavigationItemRenderer} for more information
      */
    var miniNavItems: js.UndefOr[TreeData[T]] = js.undefined
    
    /**
      * Boolean if the current layout is one of the `mini` types.
      */
    @JSName("mini")
    var mini_MiniLayoutWrapperProps: Boolean
  }
  object MiniLayoutWrapperProps {
    
    inline def apply[T /* <: BaseTreeItem */](mini: Boolean, miniHidden: Boolean): MiniLayoutWrapperProps[T] = {
      val __obj = js.Dynamic.literal(mini = mini.asInstanceOf[js.Any], miniHidden = miniHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiniLayoutWrapperProps[T]]
    }
    
    extension [Self <: MiniLayoutWrapperProps[?], T /* <: BaseTreeItem */](x: Self & MiniLayoutWrapperProps[T]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainerProps(value: PropsWithRef[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
      
      inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
      
      inline def setMini(value: Boolean): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
      
      inline def setMiniHidden(value: Boolean): Self = StObject.set(x, "miniHidden", value.asInstanceOf[js.Any])
      
      inline def setMiniNav(value: ReactNode): Self = StObject.set(x, "miniNav", value.asInstanceOf[js.Any])
      
      inline def setMiniNavItems(value: TreeData[T]): Self = StObject.set(x, "miniNavItems", value.asInstanceOf[js.Any])
      
      inline def setMiniNavItemsUndefined: Self = StObject.set(x, "miniNavItems", js.undefined)
      
      inline def setMiniNavUndefined: Self = StObject.set(x, "miniNav", js.undefined)
    }
  }
}
