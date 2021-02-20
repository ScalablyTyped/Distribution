package typings.storybookUi

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.storybookUi.anon.InitialActive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def addons: typings.storybookUi.storybookUiStrings.addons = "addons".asInstanceOf[typings.storybookUi.storybookUiStrings.addons]
    
    @scala.inline
    def canvas: typings.storybookUi.storybookUiStrings.canvas = "canvas".asInstanceOf[typings.storybookUi.storybookUiStrings.canvas]
    
    @scala.inline
    def sidebar: typings.storybookUi.storybookUiStrings.sidebar = "sidebar".asInstanceOf[typings.storybookUi.storybookUiStrings.sidebar]
  }
  
  @js.native
  trait MobileProps extends StObject {
    
    var Notifications: ComponentType[_] = js.native
    
    var Panel: ComponentType[_] = js.native
    
    var Preview: ComponentType[_] = js.native
    
    var Sidebar: ComponentType[_] = js.native
    
    var options: InitialActive = js.native
    
    var pages: js.Array[Page] = js.native
    
    var viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any = js.native
  }
  object MobileProps {
    
    @scala.inline
    def apply(
      Notifications: ComponentType[_],
      Panel: ComponentType[_],
      Preview: ComponentType[_],
      Sidebar: ComponentType[_],
      options: InitialActive,
      pages: js.Array[Page],
      viewMode: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
    ): MobileProps = {
      val __obj = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileProps]
    }
    
    @scala.inline
    implicit class MobilePropsMutableBuilder[Self <: MobileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifications(value: ComponentType[_]): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: InitialActive): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: js.Array[Page]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: Page*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setPanel(value: ComponentType[_]): Self = StObject.set(x, "Panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: ComponentType[_]): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebar(value: ComponentType[_]): Self = StObject.set(x, "Sidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ js.Any
      ): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MobileState extends StObject {
    
    var active: ActiveTabsType = js.native
  }
  object MobileState {
    
    @scala.inline
    def apply(active: ActiveTabsType): MobileState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileState]
    }
    
    @scala.inline
    implicit class MobileStateMutableBuilder[Self <: MobileState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: ActiveTabsType): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Page extends StObject {
    
    var key: String = js.native
    
    var render: FunctionComponent[js.Object] = js.native
    
    var route: FunctionComponent[js.Object] = js.native
  }
  object Page {
    
    @scala.inline
    def apply(key: String, render: FunctionComponent[js.Object], route: FunctionComponent[js.Object]): Page = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: FunctionComponent[js.Object]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: FunctionComponent[js.Object]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
}
