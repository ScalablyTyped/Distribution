package typings.reactMdLayout

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdLayout.anon.OmitSkipToMainContentProp
import typings.reactMdLayout.layoutAppBarMod.LayoutAppBarProps
import typings.reactMdLayout.layoutMainMod.LayoutMainProps
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
  
  object Layout {
    
    @scala.inline
    def apply(
      hasIdPropAppBarAppBarPropsNavAfterAppBarChildrenSkipPropsMainPropsPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutCustomTitleTitleTitlePropsNavToggleNavTogglePropsPropNavNavPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreeProps: LayoutProps[LayoutNavigationItem]
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasIdPropAppBarAppBarPropsNavAfterAppBarChildrenSkipPropsMainPropsPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutCustomTitleTitleTitlePropsNavToggleNavTogglePropsPropNavNavPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreeProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/layout/types/Layout", "Layout")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.appBar")
      @js.native
      def appBar: js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.appBarProps")
      @js.native
      def appBarProps: js.Any = js.native
      @scala.inline
      def appBarProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appBarProps")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def appBar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appBar")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.closeNav")
      @js.native
      def closeNav: js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.closeNavProps")
      @js.native
      def closeNavProps: js.Any = js.native
      @scala.inline
      def closeNavProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeNavProps")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def closeNav_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeNav")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.customTitle")
      @js.native
      def customTitle: js.Any = js.native
      @scala.inline
      def customTitle_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customTitle")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.desktopLayout")
      @js.native
      def desktopLayout: js.Any = js.native
      @scala.inline
      def desktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.id")
      @js.native
      def id: js.Any = js.native
      @scala.inline
      def id_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.landscapeTabletLayout")
      @js.native
      def landscapeTabletLayout: js.Any = js.native
      @scala.inline
      def landscapeTabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("landscapeTabletLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.largeDesktopLayout")
      @js.native
      def largeDesktopLayout: js.Any = js.native
      @scala.inline
      def largeDesktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("largeDesktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.mainProps")
      @js.native
      def mainProps: js.Any = js.native
      @scala.inline
      def mainProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.nav")
      @js.native
      def nav: js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navAfterAppBar")
      @js.native
      def navAfterAppBar: js.Any = js.native
      @scala.inline
      def navAfterAppBar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navAfterAppBar")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navHeader")
      @js.native
      def navHeader: js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navHeaderProps")
      @js.native
      def navHeaderProps: js.Any = js.native
      @scala.inline
      def navHeaderProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeaderProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navHeaderTitle")
      @js.native
      def navHeaderTitle: js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navHeaderTitleProps")
      @js.native
      def navHeaderTitleProps: js.Any = js.native
      @scala.inline
      def navHeaderTitleProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeaderTitleProps")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def navHeaderTitle_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeaderTitle")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def navHeader_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeader")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navProps")
      @js.native
      def navProps: js.Any = js.native
      @scala.inline
      def navProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navToggle")
      @js.native
      def navToggle: js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.navToggleProps")
      @js.native
      def navToggleProps: js.Any = js.native
      @scala.inline
      def navToggleProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navToggleProps")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def navToggle_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navToggle")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def nav_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nav")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.phoneLayout")
      @js.native
      def phoneLayout: js.Any = js.native
      @scala.inline
      def phoneLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.skipProps")
      @js.native
      def skipProps: js.Any = js.native
      @scala.inline
      def skipProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.tabletLayout")
      @js.native
      def tabletLayout: js.Any = js.native
      @scala.inline
      def tabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.title")
      @js.native
      def title: js.Any = js.native
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.titleProps")
      @js.native
      def titleProps: js.Any = js.native
      @scala.inline
      def titleProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def title_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout/types/Layout", "Layout.propTypes.treeProps")
      @js.native
      def treeProps: js.Any = js.native
      @scala.inline
      def treeProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("treeProps")(x.asInstanceOf[js.Any])
    }
  }
  
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
      * `LayoutCloseNavigationButton` compoent.
      */
    var closeNavProps: js.UndefOr[
        PropsWithRef[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<@react-md/layout.@react-md/layout/types/types.LayoutNavigationItem>>['closeNavProps'] */ js.Any, 
          HTMLButtonElement
        ]
      ] = js.undefined
    
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
    
    @scala.inline
    def apply[T /* <: BaseTreeItem */](): FlattenedLayoutComponentConfiguration[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlattenedLayoutComponentConfiguration[T]]
    }
    
    @scala.inline
    implicit class FlattenedLayoutComponentConfigurationMutableBuilder[Self <: FlattenedLayoutComponentConfiguration[?], T /* <: BaseTreeItem */] (val x: Self & FlattenedLayoutComponentConfiguration[T]) extends AnyVal {
      
      @scala.inline
      def setAppBar(value: ReactNode): Self = StObject.set(x, "appBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppBarProps(value: PropsWithRef[LayoutAppBarProps, HTMLDivElement]): Self = StObject.set(x, "appBarProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppBarPropsUndefined: Self = StObject.set(x, "appBarProps", js.undefined)
      
      @scala.inline
      def setAppBarUndefined: Self = StObject.set(x, "appBar", js.undefined)
      
      @scala.inline
      def setCloseNav(value: ReactNode): Self = StObject.set(x, "closeNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseNavProps(
        value: PropsWithRef[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<@react-md/layout.@react-md/layout/types/types.LayoutNavigationItem>>['closeNavProps'] */ js.Any, 
              HTMLButtonElement
            ]
      ): Self = StObject.set(x, "closeNavProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseNavPropsUndefined: Self = StObject.set(x, "closeNavProps", js.undefined)
      
      @scala.inline
      def setCloseNavUndefined: Self = StObject.set(x, "closeNav", js.undefined)
      
      @scala.inline
      def setNav(value: ReactNode): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavHeader(value: ReactNode): Self = StObject.set(x, "navHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavHeaderProps(
        value: PropsWithRef[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<T>>['headerProps'] */ js.Any, 
              HTMLDivElement
            ]
      ): Self = StObject.set(x, "navHeaderProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavHeaderPropsUndefined: Self = StObject.set(x, "navHeaderProps", js.undefined)
      
      @scala.inline
      def setNavHeaderTitle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @react-md/layout.@react-md/layout/types/LayoutNavigationHeader.LayoutNavigationHeaderProps['title'] */ js.Any
      ): Self = StObject.set(x, "navHeaderTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavHeaderTitleProps(
        value: PropsWithRef[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Required<@react-md/layout.@react-md/layout/types/LayoutNavigation.LayoutNavigationProps<@react-md/layout.@react-md/layout/types/types.LayoutNavigationItem>>['headerTitleProps'] */ js.Any, 
              HTMLDivElement
            ]
      ): Self = StObject.set(x, "navHeaderTitleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavHeaderTitlePropsUndefined: Self = StObject.set(x, "navHeaderTitleProps", js.undefined)
      
      @scala.inline
      def setNavHeaderTitleUndefined: Self = StObject.set(x, "navHeaderTitle", js.undefined)
      
      @scala.inline
      def setNavHeaderUndefined: Self = StObject.set(x, "navHeader", js.undefined)
      
      @scala.inline
      def setNavProps(value: PropsWithRef[LayoutNavigationProps[T], HTMLDivElement]): Self = StObject.set(x, "navProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavPropsUndefined: Self = StObject.set(x, "navProps", js.undefined)
      
      @scala.inline
      def setNavUndefined: Self = StObject.set(x, "nav", js.undefined)
      
      @scala.inline
      def setTreeProps(value: PropsWithRef[LayoutTreeProps[T], HTMLUListElement]): Self = StObject.set(x, "treeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreePropsUndefined: Self = StObject.set(x, "treeProps", js.undefined)
    }
  }
  
  trait LayoutProps[T /* <: BaseTreeItem */]
    extends StObject
       with LayoutConfiguration
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
  object LayoutProps {
    
    @scala.inline
    def apply[T /* <: BaseTreeItem */](): LayoutProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutProps[T]]
    }
    
    @scala.inline
    implicit class LayoutPropsMutableBuilder[Self <: LayoutProps[?], T /* <: BaseTreeItem */] (val x: Self & LayoutProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMainProps(value: PropsWithRef[LayoutMainProps, HTMLDivElement]): Self = StObject.set(x, "mainProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainPropsUndefined: Self = StObject.set(x, "mainProps", js.undefined)
      
      @scala.inline
      def setNavAfterAppBar(value: Boolean): Self = StObject.set(x, "navAfterAppBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavAfterAppBarUndefined: Self = StObject.set(x, "navAfterAppBar", js.undefined)
      
      @scala.inline
      def setSkipProps(value: OmitSkipToMainContentProp): Self = StObject.set(x, "skipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPropsUndefined: Self = StObject.set(x, "skipProps", js.undefined)
    }
  }
}
