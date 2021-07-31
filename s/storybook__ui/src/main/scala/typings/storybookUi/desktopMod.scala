package typings.storybookUi

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.storybookApi.layoutMod.Layout
import typings.storybookUi.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object desktopMod {
  
  /* Inlined react.react.NamedExoticComponent<@storybook/ui.@storybook/ui/dist/components/layout/desktop.DesktopProps> & {  displayName :string} */
  object Desktop {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @scala.inline
    def apply(props: DesktopProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("@storybook/ui/dist/components/layout/desktop", "Desktop")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/ui/dist/components/layout/desktop", "Desktop.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/ui/dist/components/layout/desktop", "Desktop.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  trait DesktopProps extends StObject {
    
    var Notifications: ComponentType[js.Any]
    
    var Panel: ComponentType[js.Any]
    
    var Preview: ComponentType[js.Any]
    
    var Sidebar: ComponentType[js.Any]
    
    var docsOnly: Boolean
    
    var height: Double
    
    var options: Layout
    
    var pages: js.Array[Key]
    
    var panelCount: Double
    
    var viewMode: String
    
    var width: Double
  }
  object DesktopProps {
    
    @scala.inline
    def apply(
      Notifications: ComponentType[js.Any],
      Panel: ComponentType[js.Any],
      Preview: ComponentType[js.Any],
      Sidebar: ComponentType[js.Any],
      docsOnly: Boolean,
      height: Double,
      options: Layout,
      pages: js.Array[Key],
      panelCount: Double,
      viewMode: String,
      width: Double
    ): DesktopProps = {
      val __obj = js.Dynamic.literal(Notifications = Notifications.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], docsOnly = docsOnly.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], panelCount = panelCount.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DesktopProps]
    }
    
    @scala.inline
    implicit class DesktopPropsMutableBuilder[Self <: DesktopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocsOnly(value: Boolean): Self = StObject.set(x, "docsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifications(value: ComponentType[js.Any]): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Layout): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPages(value: js.Array[Key]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagesVarargs(value: Key*): Self = StObject.set(x, "pages", js.Array(value :_*))
      
      @scala.inline
      def setPanel(value: ComponentType[js.Any]): Self = StObject.set(x, "Panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelCount(value: Double): Self = StObject.set(x, "panelCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreview(value: ComponentType[js.Any]): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebar(value: ComponentType[js.Any]): Self = StObject.set(x, "Sidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
