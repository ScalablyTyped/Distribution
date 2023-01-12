package typings.reactNativeTabNavigator

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-tab-navigator", JSImport.Default)
  @js.native
  open class default protected () extends TabNavigator {
    def this(props: TabNavigatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabNavigatorProps, context: Any) = this()
  }
  object default {
    
    @JSImport("react-native-tab-navigator", "default.Item")
    @js.native
    open class Item protected ()
      extends typings.reactNativeTabNavigator.mod.TabNavigator.Item {
      def this(props: TabNavigatorItemProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabNavigatorItemProps, context: Any) = this()
    }
  }
  
  @JSImport("react-native-tab-navigator", "TabNavigator")
  @js.native
  open class TabNavigator protected () extends Component[TabNavigatorProps, Any, Any] {
    def this(props: TabNavigatorProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabNavigatorProps, context: Any) = this()
  }
  object TabNavigator {
    
    @JSImport("react-native-tab-navigator", "TabNavigator.Item")
    @js.native
    open class Item protected () extends Component[TabNavigatorItemProps, Any, Any] {
      def this(props: TabNavigatorItemProps) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: TabNavigatorItemProps, context: Any) = this()
    }
  }
  
  trait TabNavigatorItemProps extends StObject {
    
    /**
      * Allow font scaling for title
      */
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text for Item badge
      */
    var badgeText: js.UndefOr[String | Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * onPress method for Item
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Returns Item badge
      */
    var renderBadge: js.UndefOr[js.Function0[Element]] = js.undefined
    
    /**
      * Returns Item icon
      */
    var renderIcon: js.UndefOr[js.Function0[Element]] = js.undefined
    
    /**
      * Returns selected Item icon
      */
    var renderSelectedIcon: js.UndefOr[js.Function0[Element]] = js.undefined
    
    /**
      * Return whether the item is selected
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Styling for selected Item title
      */
    var selectedTitleStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * Styling for tab
      */
    var tabStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * Item title
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Styling for Item title
      */
    var titleStyle: js.UndefOr[TextStyle] = js.undefined
  }
  object TabNavigatorItemProps {
    
    inline def apply(): TabNavigatorItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabNavigatorItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabNavigatorItemProps] (val x: Self) extends AnyVal {
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setBadgeText(value: String | Double): Self = StObject.set(x, "badgeText", value.asInstanceOf[js.Any])
      
      inline def setBadgeTextUndefined: Self = StObject.set(x, "badgeText", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRenderBadge(value: () => Element): Self = StObject.set(x, "renderBadge", js.Any.fromFunction0(value))
      
      inline def setRenderBadgeUndefined: Self = StObject.set(x, "renderBadge", js.undefined)
      
      inline def setRenderIcon(value: () => Element): Self = StObject.set(x, "renderIcon", js.Any.fromFunction0(value))
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
      
      inline def setRenderSelectedIcon(value: () => Element): Self = StObject.set(x, "renderSelectedIcon", js.Any.fromFunction0(value))
      
      inline def setRenderSelectedIconUndefined: Self = StObject.set(x, "renderSelectedIcon", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedTitleStyle(value: TextStyle): Self = StObject.set(x, "selectedTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setSelectedTitleStyleUndefined: Self = StObject.set(x, "selectedTitleStyle", js.undefined)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTabStyle(value: ViewStyle): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleStyle(value: TextStyle): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait TabNavigatorProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Disable onPress opacity for Tab
      *
      * @default false
      */
    var hidesTabTouch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define for rendered scene
      */
    var sceneStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * Define shadow style for tabBar
      */
    var tabBarShadowStyle: js.UndefOr[ViewStyle] = js.undefined
    
    /**
      * Define style for TabBar
      */
    var tabBarStyle: js.UndefOr[ViewStyle] = js.undefined
  }
  object TabNavigatorProps {
    
    inline def apply(): TabNavigatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabNavigatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabNavigatorProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHidesTabTouch(value: Boolean): Self = StObject.set(x, "hidesTabTouch", value.asInstanceOf[js.Any])
      
      inline def setHidesTabTouchUndefined: Self = StObject.set(x, "hidesTabTouch", js.undefined)
      
      inline def setSceneStyle(value: ViewStyle): Self = StObject.set(x, "sceneStyle", value.asInstanceOf[js.Any])
      
      inline def setSceneStyleUndefined: Self = StObject.set(x, "sceneStyle", js.undefined)
      
      inline def setTabBarShadowStyle(value: ViewStyle): Self = StObject.set(x, "tabBarShadowStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarShadowStyleUndefined: Self = StObject.set(x, "tabBarShadowStyle", js.undefined)
      
      inline def setTabBarStyle(value: ViewStyle): Self = StObject.set(x, "tabBarStyle", value.asInstanceOf[js.Any])
      
      inline def setTabBarStyleUndefined: Self = StObject.set(x, "tabBarStyle", js.undefined)
    }
  }
}
