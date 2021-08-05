package typings.reactRouterTabs

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactRouterDom.mod.NavLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-tabs", "NavTab")
  @js.native
  val NavTab: ComponentType[NavTabProps] = js.native
  
  @JSImport("react-router-tabs", "RoutedTabs")
  @js.native
  val RoutedTabs: ComponentType[RoutedTabsProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRouterTabs.reactRouterTabsStrings.page
    - typings.reactRouterTabs.reactRouterTabsStrings.step
    - typings.reactRouterTabs.reactRouterTabsStrings.location
    - typings.reactRouterTabs.reactRouterTabsStrings.date
    - typings.reactRouterTabs.reactRouterTabsStrings.time
    - typings.reactRouterTabs.reactRouterTabsStrings.`true`
  */
  trait AriaCurrent extends StObject
  object AriaCurrent {
    
    inline def date: typings.reactRouterTabs.reactRouterTabsStrings.date = "date".asInstanceOf[typings.reactRouterTabs.reactRouterTabsStrings.date]
    
    inline def location: typings.reactRouterTabs.reactRouterTabsStrings.location = "location".asInstanceOf[typings.reactRouterTabs.reactRouterTabsStrings.location]
    
    inline def page: typings.reactRouterTabs.reactRouterTabsStrings.page = "page".asInstanceOf[typings.reactRouterTabs.reactRouterTabsStrings.page]
    
    inline def step: typings.reactRouterTabs.reactRouterTabsStrings.step = "step".asInstanceOf[typings.reactRouterTabs.reactRouterTabsStrings.step]
    
    inline def time: typings.reactRouterTabs.reactRouterTabsStrings.time = "time".asInstanceOf[typings.reactRouterTabs.reactRouterTabsStrings.time]
    
    inline def `true`: typings.reactRouterTabs.reactRouterTabsStrings.`true` = "true".asInstanceOf[typings.reactRouterTabs.reactRouterTabsStrings.`true`]
  }
  
  trait NavTabProps
    extends StObject
       with NavLinkProps[LocationState] {
    
    var allowClickOnActive: js.UndefOr[Boolean] = js.undefined
    
    @JSName("aria-current")
    var `aria-current_NavTabProps`: js.UndefOr[AriaCurrent] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object NavTabProps {
    
    inline def apply(
      to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
    ): NavTabProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavTabProps]
    }
    
    extension [Self <: NavTabProps](x: Self) {
      
      inline def setAllowClickOnActive(value: Boolean): Self = StObject.set(x, "allowClickOnActive", value.asInstanceOf[js.Any])
      
      inline def setAllowClickOnActiveUndefined: Self = StObject.set(x, "allowClickOnActive", js.undefined)
      
      inline def `setAria-current`(value: AriaCurrent): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      inline def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait RoutedTabsProps extends StObject {
    
    var activeTabClassName: js.UndefOr[String] = js.undefined
    
    var activeTabStyle: js.UndefOr[js.Object] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var startPathWith: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var tabClassName: js.UndefOr[String] = js.undefined
    
    var tabStyle: js.UndefOr[js.Object] = js.undefined
  }
  object RoutedTabsProps {
    
    inline def apply(): RoutedTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoutedTabsProps]
    }
    
    extension [Self <: RoutedTabsProps](x: Self) {
      
      inline def setActiveTabClassName(value: String): Self = StObject.set(x, "activeTabClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveTabClassNameUndefined: Self = StObject.set(x, "activeTabClassName", js.undefined)
      
      inline def setActiveTabStyle(value: js.Object): Self = StObject.set(x, "activeTabStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveTabStyleUndefined: Self = StObject.set(x, "activeTabStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStartPathWith(value: String): Self = StObject.set(x, "startPathWith", value.asInstanceOf[js.Any])
      
      inline def setStartPathWithUndefined: Self = StObject.set(x, "startPathWith", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabClassName(value: String): Self = StObject.set(x, "tabClassName", value.asInstanceOf[js.Any])
      
      inline def setTabClassNameUndefined: Self = StObject.set(x, "tabClassName", js.undefined)
      
      inline def setTabStyle(value: js.Object): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    }
  }
}
