package typings.reactMdLayout

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.reactMdLayout.anon.PropsWithRefOmitAppBarTit
import typings.reactMdLayout.reactMdLayoutStrings.`toggleable-mini`
import typings.reactMdLayout.reactMdLayoutStrings.toggleable
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeData
import typings.reactMdTree.typesMod.TreeItemId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait LayoutConfiguration extends StObject {
    
    /**
      * This prop is used to be able to update the toggleable layouts to start
      * visible/expanded instead of requiring the toggle button to be pressed.
      *
      * If this is:
      * - `"toggleable"` - the `"toggleable-mini"` variant will still require a
      *   button click to be visible
      * - `"toggleable-mini"` - the `"toggleable"` variant will still require a
      *   button click to be visible
      * - `true` - both toggleable variants will start visible
      * - `false | undefined` - both toggleable variants will require a button
      *   click to be visible
      *
      * @remarks \@since 2.6.0
      */
    var defaultToggleableVisible: js.UndefOr[Boolean | toggleable | `toggleable-mini`] = js.undefined
    
    /**
      * The type of layout to use when your app is viewed on a desktop sized
      * screen.
      */
    var desktopLayout: js.UndefOr[SupportedWideLayout] = js.undefined
    
    /**
      * The type of layout to use when your app is viewed on a landscape tablet
      * sized screen.
      */
    var landscapeTabletLayout: js.UndefOr[SupportedWideLayout] = js.undefined
    
    /**
      * The type of layout to use when your app is viewed on a large desktop sized
      * screen.
      *
      * Note: Unlike all the other layout types, this one will automatically
      * inherit the `desktopLayout` if it is omitted.
      */
    var largeDesktopLayout: js.UndefOr[SupportedWideLayout] = js.undefined
    
    /**
      * The type of layout to use when your app is viewed on a phone sized screen.
      */
    var phoneLayout: js.UndefOr[SupportedPhoneLayout] = js.undefined
    
    /**
      * The type of layout to use when your app is viewed on a portrait tabled
      * sized screen.
      */
    var tabletLayout: js.UndefOr[SupportedTabletLayout] = js.undefined
  }
  object LayoutConfiguration {
    
    inline def apply(): LayoutConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutConfiguration]
    }
    
    extension [Self <: LayoutConfiguration](x: Self) {
      
      inline def setDefaultToggleableVisible(value: Boolean | toggleable | `toggleable-mini`): Self = StObject.set(x, "defaultToggleableVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultToggleableVisibleUndefined: Self = StObject.set(x, "defaultToggleableVisible", js.undefined)
      
      inline def setDesktopLayout(value: SupportedWideLayout): Self = StObject.set(x, "desktopLayout", value.asInstanceOf[js.Any])
      
      inline def setDesktopLayoutUndefined: Self = StObject.set(x, "desktopLayout", js.undefined)
      
      inline def setLandscapeTabletLayout(value: SupportedWideLayout): Self = StObject.set(x, "landscapeTabletLayout", value.asInstanceOf[js.Any])
      
      inline def setLandscapeTabletLayoutUndefined: Self = StObject.set(x, "landscapeTabletLayout", js.undefined)
      
      inline def setLargeDesktopLayout(value: SupportedWideLayout): Self = StObject.set(x, "largeDesktopLayout", value.asInstanceOf[js.Any])
      
      inline def setLargeDesktopLayoutUndefined: Self = StObject.set(x, "largeDesktopLayout", js.undefined)
      
      inline def setPhoneLayout(value: SupportedPhoneLayout): Self = StObject.set(x, "phoneLayout", value.asInstanceOf[js.Any])
      
      inline def setPhoneLayoutUndefined: Self = StObject.set(x, "phoneLayout", js.undefined)
      
      inline def setTabletLayout(value: SupportedTabletLayout): Self = StObject.set(x, "tabletLayout", value.asInstanceOf[js.Any])
      
      inline def setTabletLayoutUndefined: Self = StObject.set(x, "tabletLayout", js.undefined)
    }
  }
  
  trait LayoutNavigationItem
    extends StObject
       with BaseTreeItem
       with /**
    * Adding record syntax for the rest just to be safe.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * The component that should be used to render the tree item content. This is
      * normally a custom `Link` component if using a routing library.
      *
      * Note: You can always provide a `linkComponent` prop on the main `Layout`
      * component instead which will be used whenever the `to` or `href` props
      * exist on an item.
      */
    var contentComponent: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Boolean if the item is just a placeholder `Divider` element. None of the
      * other props will be used.
      */
    var divider: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This will make the tree item a link component and set this to the `href`.
      */
    var href: js.UndefOr[String] = js.undefined
    
    /**
      * An optional `rel` attribute to apply when using rendering a link.
      */
    var rel: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the item is just a placeholder `ListSubheader` element. None of
      * the other props will be used other than `children` with the default item
      * renderer.
      */
    var subheader: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional link target. Example: "_blank".
      */
    var target: js.UndefOr[String] = js.undefined
    
    /**
      * If your routing library uses the `to` prop to render a link, this will be
      * used and assume the tree item is a link component.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object LayoutNavigationItem {
    
    inline def apply(itemId: TreeItemId): LayoutNavigationItem = {
      val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], parentId = null)
      __obj.asInstanceOf[LayoutNavigationItem]
    }
    
    extension [Self <: LayoutNavigationItem](x: Self) {
      
      inline def setContentComponent(value: ElementType[Any]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
      
      inline def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
      
      inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setSubheader(value: Boolean): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
      
      inline def setSubheaderUndefined: Self = StObject.set(x, "subheader", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  type LayoutNavigationTree[T /* <: BaseTreeItem */] = TreeData[T]
  
  trait LayoutWithTitle extends StObject {
    
    /**
      * A custom implementation for the main `AppBarTitle` within the `Layout` that
      * will be used instead of the default `LayoutAppBarTitle` if it is not
      * `undefined`. This means that if you don't want to have a title within the
      * main `AppBar`, set this value to `null`.
      *
      * Using this prop will make the following props do nothing:
      *
      * - `title`
      * - `titleProps`
      */
    var customTitle: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional main title to display in the `Layout`. This should normally be
      * something like the page title since it will be rendered in the default
      * `AppBar` for the `Layout`.
      */
    var title: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Any additional props that should be applied to the layout's default
      * `AppBarTitle`.
      */
    var titleProps: js.UndefOr[PropsWithRefOmitAppBarTit] = js.undefined
  }
  object LayoutWithTitle {
    
    inline def apply(): LayoutWithTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutWithTitle]
    }
    
    extension [Self <: LayoutWithTitle](x: Self) {
      
      inline def setCustomTitle(value: ReactNode): Self = StObject.set(x, "customTitle", value.asInstanceOf[js.Any])
      
      inline def setCustomTitleUndefined: Self = StObject.set(x, "customTitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleProps(value: PropsWithRefOmitAppBarTit): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdLayout.reactMdLayoutStrings.temporary
    - typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini`
  */
  trait SupportedPhoneLayout extends StObject
  object SupportedPhoneLayout {
    
    inline def temporary: typings.reactMdLayout.reactMdLayoutStrings.temporary = "temporary".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.temporary]
    
    inline def `temporary-mini`: typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini` = "temporary-mini".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdLayout.reactMdLayoutStrings.toggleable
    - typings.reactMdLayout.reactMdLayoutStrings.`toggleable-mini`
    - typings.reactMdLayout.reactMdLayoutStrings.temporary
    - typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini`
  */
  trait SupportedTabletLayout extends StObject
  object SupportedTabletLayout {
    
    inline def temporary: typings.reactMdLayout.reactMdLayoutStrings.temporary = "temporary".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.temporary]
    
    inline def `temporary-mini`: typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini` = "temporary-mini".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini`]
    
    inline def toggleable: typings.reactMdLayout.reactMdLayoutStrings.toggleable = "toggleable".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.toggleable]
    
    inline def `toggleable-mini`: typings.reactMdLayout.reactMdLayoutStrings.`toggleable-mini` = "toggleable-mini".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.`toggleable-mini`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdLayout.reactMdLayoutStrings.floating
    - typings.reactMdLayout.reactMdLayoutStrings.clipped
    - typings.reactMdLayout.reactMdLayoutStrings.`full-height`
    - typings.reactMdLayout.reactMdLayoutStrings.toggleable
    - typings.reactMdLayout.reactMdLayoutStrings.`toggleable-mini`
    - typings.reactMdLayout.reactMdLayoutStrings.temporary
    - typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini`
  */
  trait SupportedWideLayout extends StObject
  object SupportedWideLayout {
    
    inline def clipped: typings.reactMdLayout.reactMdLayoutStrings.clipped = "clipped".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.clipped]
    
    inline def floating: typings.reactMdLayout.reactMdLayoutStrings.floating = "floating".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.floating]
    
    inline def `full-height`: typings.reactMdLayout.reactMdLayoutStrings.`full-height` = "full-height".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.`full-height`]
    
    inline def temporary: typings.reactMdLayout.reactMdLayoutStrings.temporary = "temporary".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.temporary]
    
    inline def `temporary-mini`: typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini` = "temporary-mini".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.`temporary-mini`]
    
    inline def toggleable: typings.reactMdLayout.reactMdLayoutStrings.toggleable = "toggleable".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.toggleable]
    
    inline def `toggleable-mini`: typings.reactMdLayout.reactMdLayoutStrings.`toggleable-mini` = "toggleable-mini".asInstanceOf[typings.reactMdLayout.reactMdLayoutStrings.`toggleable-mini`]
  }
}
