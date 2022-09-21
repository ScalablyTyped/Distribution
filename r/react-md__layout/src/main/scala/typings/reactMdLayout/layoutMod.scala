package typings.reactMdLayout

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdLayout.layoutAppBarMod.LayoutAppBarProps
import typings.reactMdLayout.layoutChildrenMod.LayoutChildrenProps
import typings.reactMdLayout.layoutNavToggleMod.LayoutWithNavToggle
import typings.reactMdLayout.layoutNavigationMod.LayoutNavigationProps
import typings.reactMdLayout.layoutTreeMod.LayoutTreeProps
import typings.reactMdLayout.typesMod.LayoutConfiguration
import typings.reactMdLayout.typesMod.LayoutNavigationItem
import typings.reactMdLayout.typesMod.LayoutWithTitle
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @JSImport("@react-md/layout/types/Layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Layout(
    hasIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleProps: LayoutProps[LayoutNavigationItem]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Layout")(hasIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait FlattenedLayoutComponentConfiguration[T /* <: BaseTreeItem */]
    extends StObject
       with LayoutWithTitle
       with LayoutWithNavToggle {
    
    /**
      * A custom implementation for the main `AppBar` within the `Layout` that will
      * be used instead of the default `LayoutAppBar` if it is not `undefined`.
      * This means that if you don't want to use an `AppBar` at all in your
      * application, set this value to `null`.
      *
      * Using this prop will make the following props do nothing:
      *
      * - `appBarProps`
      * - `customTitle`
      * - `title`
      * - `titleProps`
      */
    var appBar: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props to provide to the default `LayoutAppBar`
      */
    var appBarProps: js.UndefOr[PropsWithRef[LayoutAppBarProps, HTMLDivElement]] = js.undefined
    
    /**
      * A custom implementation for the button that closes the toggleable layouts.
      * If this is not `undefined`, it will be used instead of the default
      * implementation.
      *
      * The default implementation for this component will be to only render for
      * toggleable layouts and close the navigation panel once clicked.
      *
      * Using this prop will make the `closeNavProps` do nothing.
      */
    var closeNav: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props to provide to the default
      * `LayoutCloseNavigationButton` component.
      */
    var closeNavProps: js.UndefOr[
        PropsWithRef[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<@react-md/layout.@react-md/layout/types/types.LayoutNavigationItem>>['closeNavProps'] */ js.Any, 
          HTMLButtonElement
        ]
      ] = js.undefined
    
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
      * A custom implementation for the main navigation component within the
      * `Layout`. If this is not `undefined`, it will be used instead of the
      * default implementation.
      *
      * Using this prop will make the following props do nothing:
      *
      * - `navProps`
      * - `navHeader`
      * - `navHeaderProps`
      * - `navHeaderTitle`
      * - `navHeaderTitleProps`
      * - `closeNav`
      * - `closeNavProps`
      * - `treeProps`
      */
    var nav: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * A custom implementation for the main navigation component's header element
      * within the `Layout`. If this is not `undefined`, it will be used instead of
      * the default implementation.
      *
      * Using this prop will make the following props do nothing:
      *
      * - `navHeaderProps`
      * - `navHeaderTitle`
      * - `navHeaderTitleProps`
      * - `closeNav`
      * - `closeNavProps`
      */
    var navHeader: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props to provide to the default `LayoutNavigation`
      * component.
      */
    var navHeaderProps: js.UndefOr[
        PropsWithRef[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<T>>['headerProps'] */ js.Any, 
          HTMLDivElement
        ]
      ] = js.undefined
    
    /**
      * An optional title to display within the `LayoutNavigation`'s header
      * component. This will be defaulted to being wrapped with an `AppBarTitle`
      * component for additional styling.
      */
    var navHeaderTitle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @react-md/layout.@react-md/layout/types/LayoutNavigationHeader.LayoutNavigationHeaderProps['title'] */ js.Any
      ] = js.undefined
    
    /**
      * Any additional props to provide to the `AppBarTitle` surrounding the
      * `navHeaderTitle`.
      */
    var navHeaderTitleProps: js.UndefOr[
        PropsWithRef[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<@react-md/layout.@react-md/layout/types/types.LayoutNavigationItem>>['headerTitleProps'] */ js.Any, 
          HTMLDivElement
        ]
      ] = js.undefined
    
    /**
      * Any additional props to provide to the default `LayoutNavigation`.
      */
    var navProps: js.UndefOr[PropsWithRef[LayoutNavigationProps[T], HTMLDivElement]] = js.undefined
    
    /**
      * This is the most important prop within the `Layout` if you want to have a
      * navigation tree. This prop should normally be created by using the
      * `useLayoutNavigation` hook but you can always provide any additional props
      * that are required to style or customize your tree.
      *
      * Example:
      *
      * ```tsx
      * <Layout
      *   treeProps={useLayoutNavigation(navItems, window.location.pathname)}
      *   {...props}
      * />
      * ```
      *
      * or with additional props:
      *
      * ```tsx
      * <Layout
      *   treeProps={{
      *     ...useLayoutNavigation(navItems, window.location.pathname),
      *     ...otherTreeProps
      *   }}
      *   {...props}
      * />
      * ```
      *
      * Please see the `useLayoutNavigation` hook for additional documentation.
      */
    var treeProps: js.UndefOr[PropsWithRef[LayoutTreeProps[T], HTMLUListElement]] = js.undefined
  }
  object FlattenedLayoutComponentConfiguration {
    
    inline def apply[T /* <: BaseTreeItem */](): FlattenedLayoutComponentConfiguration[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlattenedLayoutComponentConfiguration[T]]
    }
    
    extension [Self <: FlattenedLayoutComponentConfiguration[?], T /* <: BaseTreeItem */](x: Self & FlattenedLayoutComponentConfiguration[T]) {
      
      inline def setAppBar(value: ReactNode): Self = StObject.set(x, "appBar", value.asInstanceOf[js.Any])
      
      inline def setAppBarProps(value: PropsWithRef[LayoutAppBarProps, HTMLDivElement]): Self = StObject.set(x, "appBarProps", value.asInstanceOf[js.Any])
      
      inline def setAppBarPropsUndefined: Self = StObject.set(x, "appBarProps", js.undefined)
      
      inline def setAppBarUndefined: Self = StObject.set(x, "appBar", js.undefined)
      
      inline def setCloseNav(value: ReactNode): Self = StObject.set(x, "closeNav", value.asInstanceOf[js.Any])
      
      inline def setCloseNavProps(
        value: PropsWithRef[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<@react-md/layout.@react-md/layout/types/types.LayoutNavigationItem>>['closeNavProps'] */ js.Any, 
              HTMLButtonElement
            ]
      ): Self = StObject.set(x, "closeNavProps", value.asInstanceOf[js.Any])
      
      inline def setCloseNavPropsUndefined: Self = StObject.set(x, "closeNavProps", js.undefined)
      
      inline def setCloseNavUndefined: Self = StObject.set(x, "closeNav", js.undefined)
      
      inline def setMiniNav(value: ReactNode): Self = StObject.set(x, "miniNav", value.asInstanceOf[js.Any])
      
      inline def setMiniNavUndefined: Self = StObject.set(x, "miniNav", js.undefined)
      
      inline def setNav(value: ReactNode): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      inline def setNavHeader(value: ReactNode): Self = StObject.set(x, "navHeader", value.asInstanceOf[js.Any])
      
      inline def setNavHeaderProps(
        value: PropsWithRef[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<T>>['headerProps'] */ js.Any, 
              HTMLDivElement
            ]
      ): Self = StObject.set(x, "navHeaderProps", value.asInstanceOf[js.Any])
      
      inline def setNavHeaderPropsUndefined: Self = StObject.set(x, "navHeaderProps", js.undefined)
      
      inline def setNavHeaderTitle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @react-md/layout.@react-md/layout/types/LayoutNavigationHeader.LayoutNavigationHeaderProps['title'] */ js.Any
      ): Self = StObject.set(x, "navHeaderTitle", value.asInstanceOf[js.Any])
      
      inline def setNavHeaderTitleProps(
        value: PropsWithRef[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<@react-md/layout.@react-md/layout/types/types.LayoutNavigationItem>>['headerTitleProps'] */ js.Any, 
              HTMLDivElement
            ]
      ): Self = StObject.set(x, "navHeaderTitleProps", value.asInstanceOf[js.Any])
      
      inline def setNavHeaderTitlePropsUndefined: Self = StObject.set(x, "navHeaderTitleProps", js.undefined)
      
      inline def setNavHeaderTitleUndefined: Self = StObject.set(x, "navHeaderTitle", js.undefined)
      
      inline def setNavHeaderUndefined: Self = StObject.set(x, "navHeader", js.undefined)
      
      inline def setNavProps(value: PropsWithRef[LayoutNavigationProps[T], HTMLDivElement]): Self = StObject.set(x, "navProps", value.asInstanceOf[js.Any])
      
      inline def setNavPropsUndefined: Self = StObject.set(x, "navProps", js.undefined)
      
      inline def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      inline def setTreeProps(value: PropsWithRef[LayoutTreeProps[T], HTMLUListElement]): Self = StObject.set(x, "treeProps", value.asInstanceOf[js.Any])
      
      inline def setTreePropsUndefined: Self = StObject.set(x, "treeProps", js.undefined)
    }
  }
  
  trait LayoutProps[T /* <: BaseTreeItem */]
    extends StObject
       with LayoutConfiguration
       with LayoutChildrenProps[T]
  object LayoutProps {
    
    inline def apply[T /* <: BaseTreeItem */](): LayoutProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutProps[T]]
    }
  }
}
