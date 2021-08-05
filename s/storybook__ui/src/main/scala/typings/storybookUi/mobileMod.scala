package typings.storybookUi

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookUi.anon.InitialActive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileMod {
  
  @JSImport("@storybook/ui/dist/components/layout/mobile", "Mobile")
  @js.native
  class Mobile protected ()
    extends Component[MobileProps, MobileState, js.Any] {
    def this(props: MobileProps) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookUi.storybookUiStrings.sidebar
    - typings.storybookUi.storybookUiStrings.canvas
    - typings.storybookUi.storybookUiStrings.addons
  */
  trait ActiveTabsType extends StObject
  object ActiveTabsType {
    
    inline def addons: typings.storybookUi.storybookUiStrings.addons = "addons".asInstanceOf[typings.storybookUi.storybookUiStrings.addons]
    
    inline def canvas: typings.storybookUi.storybookUiStrings.canvas = "canvas".asInstanceOf[typings.storybookUi.storybookUiStrings.canvas]
    
    inline def sidebar: typings.storybookUi.storybookUiStrings.sidebar = "sidebar".asInstanceOf[typings.storybookUi.storybookUiStrings.sidebar]
  }
  
  trait MobileProps extends StObject {
    
    var Notifications: ComponentType[js.Any]
    
    var Panel: ComponentType[js.Any]
    
    var Preview: ComponentType[js.Any]
    
    var Sidebar: ComponentType[js.Any]
    
    var options: InitialActive
    
    var pages: js.Array[Page]
    
    var viewMode: ViewMode & js.UndefOr[String]
  }
  object MobileProps {
    
    inline def apply(
      Notifications: ComponentType[js.Any],
      Panel: ComponentType[js.Any],
      Preview: ComponentType[js.Any],
      Sidebar: ComponentType[js.Any],
      options: InitialActive,
      pages: js.Array[Page],
      viewMode: ViewMode & js.UndefOr[String]
    ): MobileProps = {
      val __obj = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileProps]
    }
    
    extension [Self <: MobileProps](x: Self) {
      
      inline def setNotifications(value: ComponentType[js.Any]): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: InitialActive): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      inline def setPanel(value: ComponentType[js.Any]): Self = StObject.set(x, "Panel", value.asInstanceOf[js.Any])
      
      inline def setPreview(value: ComponentType[js.Any]): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      inline def setSidebar(value: ComponentType[js.Any]): Self = StObject.set(x, "Sidebar", value.asInstanceOf[js.Any])
      
      inline def setViewMode(value: ViewMode & js.UndefOr[String]): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  trait MobileState extends StObject {
    
    var active: ActiveTabsType
  }
  object MobileState {
    
    inline def apply(active: ActiveTabsType): MobileState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileState]
    }
    
    extension [Self <: MobileState](x: Self) {
      
      inline def setActive(value: ActiveTabsType): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  trait Page extends StObject {
    
    var key: String
    
    var render: FunctionComponent[js.Object]
    
    var route: FunctionComponent[js.Object]
  }
  object Page {
    
    inline def apply(key: String, render: FunctionComponent[js.Object], route: FunctionComponent[js.Object]): Page = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRender(value: FunctionComponent[js.Object]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: FunctionComponent[js.Object]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
