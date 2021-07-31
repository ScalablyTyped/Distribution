package typings.reactMdLayout

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.appBarMod.AppBarProps
import typings.reactMdLayout.layoutCloseNavigationButtonMod.LayoutCloseNavigationButtonProps
import typings.reactMdLayout.layoutNavigationHeaderMod.LayoutNavigationHeaderProps
import typings.reactMdLayout.layoutTreeMod.LayoutTreeProps
import typings.reactMdLayout.reactMdLayoutStrings.component
import typings.reactMdLayout.reactMdLayoutStrings.disableScrollLock
import typings.reactMdLayout.reactMdLayoutStrings.disableTabFocusWrap
import typings.reactMdLayout.reactMdLayoutStrings.id
import typings.reactMdLayout.reactMdLayoutStrings.onRequestClose
import typings.reactMdLayout.reactMdLayoutStrings.role
import typings.reactMdLayout.reactMdLayoutStrings.visible
import typings.reactMdLayout.typesMod.LayoutNavigationItem
import typings.reactMdSheet.sheetMod.SheetProps
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdUtils.typesTypesMod.PropsWithRef
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutNavigationMod {
  
  @JSImport("@react-md/layout/types/LayoutNavigation", "LayoutNavigation")
  @js.native
  val LayoutNavigation: ForwardRefExoticComponent[LayoutNavigationProps[LayoutNavigationItem] & RefAttributes[HTMLDivElement]] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @react-md/sheet.@react-md/sheet/types/Sheet.SheetProps, 'id' | 'role' | 'component' | 'visible' | 'onRequestClose' | 'disableScrollLock' | 'disableTabFocusWrap'> ]: @react-md/sheet.@react-md/sheet/types/Sheet.SheetProps[P]} */ trait LayoutNavigationProps[T /* <: BaseTreeItem */] extends StObject {
    
    /**
      * An optional component to use instead of the default
      * `LayoutCloseNavigationButton` in the header.
      */
    var closeNav: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props to provide the `LayoutCloseNavigationButton`.
      */
    var closeNavProps: js.UndefOr[PropsWithRef[LayoutCloseNavigationButtonProps, HTMLButtonElement]] = js.undefined
    
    /**
      * An optional header element to display before the navigation tree and
      * children. When this is omitted, it will default to the
      * `LayoutNavigationHeader` component with some reasonable defaults.
      */
    var header: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props to provide to the default `LayoutNavigationHeader`
      * component.
      */
    var headerProps: js.UndefOr[PropsWithRef[LayoutNavigationHeaderProps, HTMLDivElement]] = js.undefined
    
    /**
      * An optional title to display within the `LayoutNavigationHeader` component
      * that will be wrapped in an `AppBarTitle`.
      */
    var headerTitle: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props that should be passed to the `AppBarTitle` that
      * surrounds the `headerTitle`.
      */
    var headerTitleProps: js.UndefOr[PropsWithRef[PropsWithRef[AppBarProps, HTMLDivElement], HTMLDivElement]] = js.undefined
    
    /**
      * The id to use for the main navigation sheet element. When this is omitted,
      * this will be defaulted to: `${baseId}-nav-container`.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * When this is omitted, the default navigation tree will not be rendered and
      * the only content that will be displayed will be the optional `header`
      * element and any provided `children`.
      */
    var treeProps: js.UndefOr[LayoutTreeProps[T]] = js.undefined
  }
  object LayoutNavigationProps {
    
    @scala.inline
    def apply[T /* <: BaseTreeItem */](): LayoutNavigationProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutNavigationProps[T]]
    }
    
    @scala.inline
    implicit class LayoutNavigationPropsMutableBuilder[Self <: LayoutNavigationProps[?], T /* <: BaseTreeItem */] (val x: Self & LayoutNavigationProps[T]) extends AnyVal {
      
      @scala.inline
      def setCloseNav(value: ReactNode): Self = StObject.set(x, "closeNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseNavProps(value: PropsWithRef[LayoutCloseNavigationButtonProps, HTMLButtonElement]): Self = StObject.set(x, "closeNavProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseNavPropsUndefined: Self = StObject.set(x, "closeNavProps", js.undefined)
      
      @scala.inline
      def setCloseNavUndefined: Self = StObject.set(x, "closeNav", js.undefined)
      
      @scala.inline
      def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderProps(value: PropsWithRef[LayoutNavigationHeaderProps, HTMLDivElement]): Self = StObject.set(x, "headerProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderPropsUndefined: Self = StObject.set(x, "headerProps", js.undefined)
      
      @scala.inline
      def setHeaderTitle(value: ReactNode): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitleProps(value: PropsWithRef[PropsWithRef[AppBarProps, HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "headerTitleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTitlePropsUndefined: Self = StObject.set(x, "headerTitleProps", js.undefined)
      
      @scala.inline
      def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTreeProps(value: LayoutTreeProps[T]): Self = StObject.set(x, "treeProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreePropsUndefined: Self = StObject.set(x, "treeProps", js.undefined)
    }
  }
  
  type LayoutNavigationSheetProps = Omit[
    SheetProps, 
    id | role | component | visible | onRequestClose | disableScrollLock | disableTabFocusWrap
  ]
}
