package typings.reactNativeSettingsList

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-settings-list", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SettingsListProps, js.Object, Any]
  object default {
    
    @JSImport("react-native-settings-list", "default.Header")
    @js.native
    open class Header ()
      extends Component[HeaderProps, js.Object, Any]
    
    @JSImport("react-native-settings-list", "default.Item")
    @js.native
    open class Item ()
      extends Component[ItemProps, js.Object, Any]
  }
  
  trait HeaderProps extends StObject {
    
    /**
      * default: 1
      */
    var headerNumberOfLines: js.UndefOr[Double] = js.undefined
    
    var headerRef: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var headerStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var headerText: js.UndefOr[String] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setHeaderNumberOfLines(value: Double): Self = StObject.set(x, "headerNumberOfLines", value.asInstanceOf[js.Any])
      
      inline def setHeaderNumberOfLinesUndefined: Self = StObject.set(x, "headerNumberOfLines", js.undefined)
      
      inline def setHeaderRef(value: () => Unit): Self = StObject.set(x, "headerRef", js.Any.fromFunction0(value))
      
      inline def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
      
      inline def setHeaderStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
      
      inline def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      inline def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    }
  }
  
  trait ItemProps extends StObject {
    
    var arrowIcon: js.UndefOr[ReactNode] = js.undefined
    
    var arrowStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
    
    var authPropsPW: js.UndefOr[js.Object] = js.undefined
    
    var authPropsUser: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Individual background color. Can be globally set in the parent. Will become Deprecated
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /* Gives opens to hide specific borders */
    var borderHide: js.UndefOr[Top | Bottom | Both] = js.undefined
    
    /**
      * Editable Right Side Style
      */
    var editableTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Enable or disable the > arrow at the end of the setting item.
      * Default: true
      */
    var hasNavArrow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable a Switch component
      */
    var hasSwitch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Icon displayed on the left of the settings item
      */
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Allows for the item to become an auth item
      */
    var isAuth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Item Box Style
      */
    var itemBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var itemRef: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Individual item width.  Can be globally set in the parent.  Will become deprecated
      */
    var itemWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Item on long press callback.
      */
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Item on press callback.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Right side content
      */
    var rightSideContent: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Right Side Style
      */
    var rightSideStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * On value change callback
      */
    var switchOnValueChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Switch props
      */
    var switchProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Switch state
      */
    var switchState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Title being displayed
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * Title Box Style
      */
    var titleBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Right side information on the setting item
      */
    var titleInfo: js.UndefOr[String] = js.undefined
    
    /**
      * If 'Bottom'; info is placed beneath the title
      */
    var titleInfoPosition: js.UndefOr[String] = js.undefined
    
    var titleInfoStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * Individual underlay click color.  Can be globally set in the parent.
      */
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object ItemProps {
    
    inline def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setArrowIcon(value: ReactNode): Self = StObject.set(x, "arrowIcon", value.asInstanceOf[js.Any])
      
      inline def setArrowIconUndefined: Self = StObject.set(x, "arrowIcon", js.undefined)
      
      inline def setArrowStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      inline def setArrowStyleNull: Self = StObject.set(x, "arrowStyle", null)
      
      inline def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      inline def setAuthPropsPW(value: js.Object): Self = StObject.set(x, "authPropsPW", value.asInstanceOf[js.Any])
      
      inline def setAuthPropsPWUndefined: Self = StObject.set(x, "authPropsPW", js.undefined)
      
      inline def setAuthPropsUser(value: js.Object): Self = StObject.set(x, "authPropsUser", value.asInstanceOf[js.Any])
      
      inline def setAuthPropsUserUndefined: Self = StObject.set(x, "authPropsUser", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderHide(value: Top | Bottom | Both): Self = StObject.set(x, "borderHide", value.asInstanceOf[js.Any])
      
      inline def setBorderHideUndefined: Self = StObject.set(x, "borderHide", js.undefined)
      
      inline def setEditableTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "editableTextStyle", value.asInstanceOf[js.Any])
      
      inline def setEditableTextStyleNull: Self = StObject.set(x, "editableTextStyle", null)
      
      inline def setEditableTextStyleUndefined: Self = StObject.set(x, "editableTextStyle", js.undefined)
      
      inline def setHasNavArrow(value: Boolean): Self = StObject.set(x, "hasNavArrow", value.asInstanceOf[js.Any])
      
      inline def setHasNavArrowUndefined: Self = StObject.set(x, "hasNavArrow", js.undefined)
      
      inline def setHasSwitch(value: Boolean): Self = StObject.set(x, "hasSwitch", value.asInstanceOf[js.Any])
      
      inline def setHasSwitchUndefined: Self = StObject.set(x, "hasSwitch", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsAuth(value: Boolean): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
      
      inline def setIsAuthUndefined: Self = StObject.set(x, "isAuth", js.undefined)
      
      inline def setItemBoxStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemBoxStyle", value.asInstanceOf[js.Any])
      
      inline def setItemBoxStyleNull: Self = StObject.set(x, "itemBoxStyle", null)
      
      inline def setItemBoxStyleUndefined: Self = StObject.set(x, "itemBoxStyle", js.undefined)
      
      inline def setItemRef(value: () => Unit): Self = StObject.set(x, "itemRef", js.Any.fromFunction0(value))
      
      inline def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setRightSideContent(value: ReactNode): Self = StObject.set(x, "rightSideContent", value.asInstanceOf[js.Any])
      
      inline def setRightSideContentUndefined: Self = StObject.set(x, "rightSideContent", js.undefined)
      
      inline def setRightSideStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightSideStyle", value.asInstanceOf[js.Any])
      
      inline def setRightSideStyleNull: Self = StObject.set(x, "rightSideStyle", null)
      
      inline def setRightSideStyleUndefined: Self = StObject.set(x, "rightSideStyle", js.undefined)
      
      inline def setSwitchOnValueChange(value: () => Unit): Self = StObject.set(x, "switchOnValueChange", js.Any.fromFunction0(value))
      
      inline def setSwitchOnValueChangeUndefined: Self = StObject.set(x, "switchOnValueChange", js.undefined)
      
      inline def setSwitchProps(value: js.Object): Self = StObject.set(x, "switchProps", value.asInstanceOf[js.Any])
      
      inline def setSwitchPropsUndefined: Self = StObject.set(x, "switchProps", js.undefined)
      
      inline def setSwitchState(value: Boolean): Self = StObject.set(x, "switchState", value.asInstanceOf[js.Any])
      
      inline def setSwitchStateUndefined: Self = StObject.set(x, "switchState", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleBoxStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "titleBoxStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleBoxStyleNull: Self = StObject.set(x, "titleBoxStyle", null)
      
      inline def setTitleBoxStyleUndefined: Self = StObject.set(x, "titleBoxStyle", js.undefined)
      
      inline def setTitleInfo(value: String): Self = StObject.set(x, "titleInfo", value.asInstanceOf[js.Any])
      
      inline def setTitleInfoPosition(value: String): Self = StObject.set(x, "titleInfoPosition", value.asInstanceOf[js.Any])
      
      inline def setTitleInfoPositionUndefined: Self = StObject.set(x, "titleInfoPosition", js.undefined)
      
      inline def setTitleInfoStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleInfoStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleInfoStyleNull: Self = StObject.set(x, "titleInfoStyle", null)
      
      inline def setTitleInfoStyleUndefined: Self = StObject.set(x, "titleInfoStyle", js.undefined)
      
      inline def setTitleInfoUndefined: Self = StObject.set(x, "titleInfo", js.undefined)
      
      inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  object SettingsList {
    
    type Header = Component[HeaderProps, js.Object, Any]
    
    type Item = Component[ItemProps, js.Object, Any]
  }
  type SettingsList = Component[SettingsListProps, js.Object, Any]
  
  trait SettingsListProps extends StObject {
    
    /**
      * default: white
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * default: black
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * default: 50
      */
    var defaultItemSize: js.UndefOr[Double] = js.undefined
    
    var defaultTitleInfoPosition: js.UndefOr[String] = js.undefined
    
    /**
      * default: {fontSize: 16}
      */
    var defaultTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var scrollViewProps: js.UndefOr[js.Object] = js.undefined
    
    /**
      * default: transparent
      */
    var underlayColor: js.UndefOr[String] = js.undefined
  }
  object SettingsListProps {
    
    inline def apply(): SettingsListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsListProps]
    }
    
    extension [Self <: SettingsListProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultItemSize(value: Double): Self = StObject.set(x, "defaultItemSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultItemSizeUndefined: Self = StObject.set(x, "defaultItemSize", js.undefined)
      
      inline def setDefaultTitleInfoPosition(value: String): Self = StObject.set(x, "defaultTitleInfoPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultTitleInfoPositionUndefined: Self = StObject.set(x, "defaultTitleInfoPosition", js.undefined)
      
      inline def setDefaultTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "defaultTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultTitleStyleNull: Self = StObject.set(x, "defaultTitleStyle", null)
      
      inline def setDefaultTitleStyleUndefined: Self = StObject.set(x, "defaultTitleStyle", js.undefined)
      
      inline def setScrollViewProps(value: js.Object): Self = StObject.set(x, "scrollViewProps", value.asInstanceOf[js.Any])
      
      inline def setScrollViewPropsUndefined: Self = StObject.set(x, "scrollViewProps", js.undefined)
      
      inline def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}
