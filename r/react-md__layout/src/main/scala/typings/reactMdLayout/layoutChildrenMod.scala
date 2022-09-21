package typings.reactMdLayout

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdLayout.anon.OmitSkipToMainContentProp
import typings.reactMdLayout.layoutMainMod.LayoutMainProps
import typings.reactMdLayout.layoutMod.FlattenedLayoutComponentConfiguration
import typings.reactMdLayout.typesMod.LayoutNavigationItem
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutChildrenMod {
  
  @JSImport("@react-md/layout/types/LayoutChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LayoutChildren(
    hasIdPropAppBarAppBarPropsCustomTitleTitleTitlePropsNavToggleNavTogglePropsNavAfterAppBarPropNavMiniNavMiniNavItemsMiniWrapperPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreePropsNavPropsSkipPropsMainPropsChildren: LayoutChildrenProps[LayoutNavigationItem]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("LayoutChildren")(hasIdPropAppBarAppBarPropsCustomTitleTitleTitlePropsNavToggleNavTogglePropsNavAfterAppBarPropNavMiniNavMiniNavItemsMiniWrapperPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreePropsNavPropsSkipPropsMainPropsChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait LayoutChildrenProps[T /* <: BaseTreeItem */]
    extends StObject
       with FlattenedLayoutComponentConfiguration[T] {
    
    /**
      * The children to display within the layout. This is pretty much required
      * since you'll have an empty app otherwise, but it's left as optional just
      * for prototyping purposes.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The base id to use for everything within the layout component. The `id`
      * will be applied to:
      *
      * - the `LayoutAppBar` as `${id}-header`
      * - the `AppBarTitle` as `${id}-title`
      * - the `LayoutNavToggle` as `${id}-nav-toggle`
      * - the `LayoutMain` element as `${id}-main`
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Any optional props to provide to the `<main>` element of the page.
      */
    var mainProps: js.UndefOr[PropsWithRef[LayoutMainProps, HTMLDivElement]] = js.undefined
    
    /**
      * An optional tree to use for the mini navigation pane since the default
      * behavior of rendering mini tree items might hide content in an undesirable
      * way.
      *
      * @remarks \@since 2.7.0
      * @see {@link defaultMiniNavigationItemRenderer} for more information
      */
    var miniNavItems: js.UndefOr[TreeData[T]] = js.undefined
    
    /**
      * This prop allows you to provide additional props to the `<div>` surrounding
      * the `LayoutMain` and mini `LayoutNavigation` components.
      *
      * Note: This additional `<div>` will only be rendered if:
      * - at least one of the provided layout types are `mini`
      * - the layout is not using a fixed app bar
      * - the `miniNav` prop has not been defined
      * - `treeProps` have been provided
      *
      * @remarks \@since 2.8.3
      * @remarks \@since 2.9.1 This will render if any provided layout type is `mini`.
      */
    var miniWrapperProps: js.UndefOr[PropsWithRef[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.undefined
    
    /**
      * Boolean if the main app bar should appear after the navigation component.
      * It is generally recommended to enable this prop if the navigation component
      * as a focusable element in the header since it will have a better tab focus
      * order.
      */
    var navAfterAppBar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Any additional props to provide to the `<SkipToMainContent />` link that is
      * automatically rendered in the layout.
      */
    var skipProps: js.UndefOr[OmitSkipToMainContentProp] = js.undefined
  }
  object LayoutChildrenProps {
    
    inline def apply[T /* <: BaseTreeItem */](): LayoutChildrenProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutChildrenProps[T]]
    }
    
    extension [Self <: LayoutChildrenProps[?], T /* <: BaseTreeItem */](x: Self & LayoutChildrenProps[T]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMainProps(value: PropsWithRef[LayoutMainProps, HTMLDivElement]): Self = StObject.set(x, "mainProps", value.asInstanceOf[js.Any])
      
      inline def setMainPropsUndefined: Self = StObject.set(x, "mainProps", js.undefined)
      
      inline def setMiniNavItems(value: TreeData[T]): Self = StObject.set(x, "miniNavItems", value.asInstanceOf[js.Any])
      
      inline def setMiniNavItemsUndefined: Self = StObject.set(x, "miniNavItems", js.undefined)
      
      inline def setMiniWrapperProps(value: PropsWithRef[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "miniWrapperProps", value.asInstanceOf[js.Any])
      
      inline def setMiniWrapperPropsUndefined: Self = StObject.set(x, "miniWrapperProps", js.undefined)
      
      inline def setNavAfterAppBar(value: Boolean): Self = StObject.set(x, "navAfterAppBar", value.asInstanceOf[js.Any])
      
      inline def setNavAfterAppBarUndefined: Self = StObject.set(x, "navAfterAppBar", js.undefined)
      
      inline def setSkipProps(value: OmitSkipToMainContentProp): Self = StObject.set(x, "skipProps", value.asInstanceOf[js.Any])
      
      inline def setSkipPropsUndefined: Self = StObject.set(x, "skipProps", js.undefined)
    }
  }
}
