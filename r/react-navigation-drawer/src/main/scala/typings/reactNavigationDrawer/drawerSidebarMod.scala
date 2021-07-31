package typings.reactNavigationDrawer

import typings.react.mod.ComponentType
import typings.react.mod.PureComponent
import typings.reactNative.mod.ViewStyle
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationScreenProp
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typings.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typings.reactNavigationDrawer.typesMod.DrawerContentComponentProps
import typings.reactNavigationDrawer.typesMod.NavigationDrawerState
import typings.reactNavigationDrawer.typesMod.SceneDescriptorMap
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawerSidebarMod {
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @JSImport("react-navigation-drawer/lib/typescript/src/views/DrawerSidebar", JSImport.Default)
  @js.native
  class default () extends DrawerSidebar
  
  /**
    * Component that renders the sidebar screen of the drawer.
    */
  @js.native
  trait DrawerSidebar
    extends PureComponent[Props, js.Object, js.Any] {
    
    var getLabel: js.Any = js.native
    
    var getScreenOptions: js.Any = js.native
    
    var handleItemPress: js.Any = js.native
    
    var renderIcon: js.Any = js.native
  }
  
  trait Props extends StObject {
    
    var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
    
    var contentOptions: js.UndefOr[js.Object] = js.undefined
    
    var descriptors: SceneDescriptorMap
    
    var drawerOpenProgress: Node
    
    var drawerPosition: left | right
    
    var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
    
    var screenProps: js.UndefOr[js.Any] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply(
      descriptors: SceneDescriptorMap,
      drawerOpenProgress: Node,
      drawerPosition: left | right,
      navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
    ): Props = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentComponent(value: ComponentType[DrawerContentComponentProps]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
      
      @scala.inline
      def setContentOptions(value: js.Object): Self = StObject.set(x, "contentOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentOptionsUndefined: Self = StObject.set(x, "contentOptions", js.undefined)
      
      @scala.inline
      def setDescriptors(value: SceneDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerOpenProgress(value: Node): Self = StObject.set(x, "drawerOpenProgress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenProps(value: js.Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
