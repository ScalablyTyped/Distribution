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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-settings-list", JSImport.Default)
  @js.native
  class default ()
    extends Component[SettingsListProps, js.Object, js.Any]
  object default {
    
    @JSImport("react-native-settings-list", "default.Header")
    @js.native
    class Header ()
      extends Component[HeaderProps, js.Object, js.Any]
    
    @JSImport("react-native-settings-list", "default.Item")
    @js.native
    class Item ()
      extends Component[ItemProps, js.Object, js.Any]
  }
  
  @js.native
  trait HeaderProps extends StObject {
    
    /**
      * default: 1
      */
    var headerNumberOfLines: js.UndefOr[Double] = js.native
    
    var headerRef: js.UndefOr[js.Function0[Unit]] = js.native
    
    var headerStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var headerText: js.UndefOr[String] = js.native
  }
  object HeaderProps {
    
    @scala.inline
    def apply(): HeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderProps]
    }
    
    @scala.inline
    implicit class HeaderPropsMutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaderNumberOfLines(value: Double): Self = StObject.set(x, "headerNumberOfLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNumberOfLinesUndefined: Self = StObject.set(x, "headerNumberOfLines", js.undefined)
      
      @scala.inline
      def setHeaderRef(value: () => Unit): Self = StObject.set(x, "headerRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeaderRefUndefined: Self = StObject.set(x, "headerRef", js.undefined)
      
      @scala.inline
      def setHeaderStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "headerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderStyleNull: Self = StObject.set(x, "headerStyle", null)
      
      @scala.inline
      def setHeaderStyleUndefined: Self = StObject.set(x, "headerStyle", js.undefined)
      
      @scala.inline
      def setHeaderText(value: String): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
    }
  }
  
  @js.native
  trait ItemProps extends StObject {
    
    var arrowIcon: js.UndefOr[ReactNode] = js.native
    
    var arrowStyle: js.UndefOr[StyleProp[ImageStyle]] = js.native
    
    var authPropsPW: js.UndefOr[js.Object] = js.native
    
    var authPropsUser: js.UndefOr[js.Object] = js.native
    
    /**
      * Individual background color. Can be globally set in the parent. Will become Deprecated
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /* Gives opens to hide specific borders */
    var borderHide: js.UndefOr[Top | Bottom | Both] = js.native
    
    /**
      * Editable Right Side Style
      */
    var editableTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    /**
      * Enable or disable the > arrow at the end of the setting item.
      * Default: true
      */
    var hasNavArrow: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable a Switch component
      */
    var hasSwitch: js.UndefOr[Boolean] = js.native
    
    /**
      * Icon displayed on the left of the settings item
      */
    var icon: js.UndefOr[ReactNode] = js.native
    
    /**
      * Allows for the item to become an auth item
      */
    var isAuth: js.UndefOr[Boolean] = js.native
    
    /**
      * Item Box Style
      */
    var itemBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var itemRef: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Individual item width.  Can be globally set in the parent.  Will become deprecated
      */
    var itemWidth: js.UndefOr[Double] = js.native
    
    /**
      * Item on long press callback.
      */
    var onLongPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Item on press callback.
      */
    var onPress: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Right side content
      */
    var rightSideContent: js.UndefOr[ReactNode] = js.native
    
    /**
      * Right Side Style
      */
    var rightSideStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * On value change callback
      */
    var switchOnValueChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Switch props
      */
    var switchProps: js.UndefOr[js.Object] = js.native
    
    /**
      * Switch state
      */
    var switchState: js.UndefOr[Boolean] = js.native
    
    /**
      * Title being displayed
      */
    var title: js.UndefOr[String] = js.native
    
    /**
      * Title Box Style
      */
    var titleBoxStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Right side information on the setting item
      */
    var titleInfo: js.UndefOr[String] = js.native
    
    /**
      * If 'Bottom'; info is placed beneath the title
      */
    var titleInfoPosition: js.UndefOr[String] = js.native
    
    var titleInfoStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    /**
      * Individual underlay click color.  Can be globally set in the parent.
      */
    var underlayColor: js.UndefOr[String] = js.native
  }
  object ItemProps {
    
    @scala.inline
    def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class ItemPropsMutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowIcon(value: ReactNode): Self = StObject.set(x, "arrowIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowIconUndefined: Self = StObject.set(x, "arrowIcon", js.undefined)
      
      @scala.inline
      def setArrowStyle(value: StyleProp[ImageStyle]): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowStyleNull: Self = StObject.set(x, "arrowStyle", null)
      
      @scala.inline
      def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      @scala.inline
      def setAuthPropsPW(value: js.Object): Self = StObject.set(x, "authPropsPW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthPropsPWUndefined: Self = StObject.set(x, "authPropsPW", js.undefined)
      
      @scala.inline
      def setAuthPropsUser(value: js.Object): Self = StObject.set(x, "authPropsUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthPropsUserUndefined: Self = StObject.set(x, "authPropsUser", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderHide(value: Top | Bottom | Both): Self = StObject.set(x, "borderHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderHideUndefined: Self = StObject.set(x, "borderHide", js.undefined)
      
      @scala.inline
      def setEditableTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "editableTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditableTextStyleNull: Self = StObject.set(x, "editableTextStyle", null)
      
      @scala.inline
      def setEditableTextStyleUndefined: Self = StObject.set(x, "editableTextStyle", js.undefined)
      
      @scala.inline
      def setHasNavArrow(value: Boolean): Self = StObject.set(x, "hasNavArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNavArrowUndefined: Self = StObject.set(x, "hasNavArrow", js.undefined)
      
      @scala.inline
      def setHasSwitch(value: Boolean): Self = StObject.set(x, "hasSwitch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasSwitchUndefined: Self = StObject.set(x, "hasSwitch", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setIsAuth(value: Boolean): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuthUndefined: Self = StObject.set(x, "isAuth", js.undefined)
      
      @scala.inline
      def setItemBoxStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemBoxStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemBoxStyleNull: Self = StObject.set(x, "itemBoxStyle", null)
      
      @scala.inline
      def setItemBoxStyleUndefined: Self = StObject.set(x, "itemBoxStyle", js.undefined)
      
      @scala.inline
      def setItemRef(value: () => Unit): Self = StObject.set(x, "itemRef", js.Any.fromFunction0(value))
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setOnLongPress(value: () => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      @scala.inline
      def setOnPress(value: () => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setRightSideContent(value: ReactNode): Self = StObject.set(x, "rightSideContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightSideContentUndefined: Self = StObject.set(x, "rightSideContent", js.undefined)
      
      @scala.inline
      def setRightSideStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightSideStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightSideStyleNull: Self = StObject.set(x, "rightSideStyle", null)
      
      @scala.inline
      def setRightSideStyleUndefined: Self = StObject.set(x, "rightSideStyle", js.undefined)
      
      @scala.inline
      def setSwitchOnValueChange(value: () => Unit): Self = StObject.set(x, "switchOnValueChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwitchOnValueChangeUndefined: Self = StObject.set(x, "switchOnValueChange", js.undefined)
      
      @scala.inline
      def setSwitchProps(value: js.Object): Self = StObject.set(x, "switchProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchPropsUndefined: Self = StObject.set(x, "switchProps", js.undefined)
      
      @scala.inline
      def setSwitchState(value: Boolean): Self = StObject.set(x, "switchState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwitchStateUndefined: Self = StObject.set(x, "switchState", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBoxStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "titleBoxStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleBoxStyleNull: Self = StObject.set(x, "titleBoxStyle", null)
      
      @scala.inline
      def setTitleBoxStyleUndefined: Self = StObject.set(x, "titleBoxStyle", js.undefined)
      
      @scala.inline
      def setTitleInfo(value: String): Self = StObject.set(x, "titleInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleInfoPosition(value: String): Self = StObject.set(x, "titleInfoPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleInfoPositionUndefined: Self = StObject.set(x, "titleInfoPosition", js.undefined)
      
      @scala.inline
      def setTitleInfoStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleInfoStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleInfoStyleNull: Self = StObject.set(x, "titleInfoStyle", null)
      
      @scala.inline
      def setTitleInfoStyleUndefined: Self = StObject.set(x, "titleInfoStyle", js.undefined)
      
      @scala.inline
      def setTitleInfoUndefined: Self = StObject.set(x, "titleInfo", js.undefined)
      
      @scala.inline
      def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
      
      @scala.inline
      def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
  
  object SettingsList {
    
    type Header = Component[HeaderProps, js.Object, js.Any]
    
    type Item = Component[ItemProps, js.Object, js.Any]
  }
  type SettingsList = Component[SettingsListProps, js.Object, js.Any]
  
  @js.native
  trait SettingsListProps extends StObject {
    
    /**
      * default: white
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * default: black
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /**
      * default: 50
      */
    var defaultItemSize: js.UndefOr[Double] = js.native
    
    var defaultTitleInfoPosition: js.UndefOr[String] = js.native
    
    /**
      * default: {fontSize: 16}
      */
    var defaultTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    var scrollViewProps: js.UndefOr[js.Object] = js.native
    
    /**
      * default: transparent
      */
    var underlayColor: js.UndefOr[String] = js.native
  }
  object SettingsListProps {
    
    @scala.inline
    def apply(): SettingsListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsListProps]
    }
    
    @scala.inline
    implicit class SettingsListPropsMutableBuilder[Self <: SettingsListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setDefaultItemSize(value: Double): Self = StObject.set(x, "defaultItemSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultItemSizeUndefined: Self = StObject.set(x, "defaultItemSize", js.undefined)
      
      @scala.inline
      def setDefaultTitleInfoPosition(value: String): Self = StObject.set(x, "defaultTitleInfoPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTitleInfoPositionUndefined: Self = StObject.set(x, "defaultTitleInfoPosition", js.undefined)
      
      @scala.inline
      def setDefaultTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "defaultTitleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTitleStyleNull: Self = StObject.set(x, "defaultTitleStyle", null)
      
      @scala.inline
      def setDefaultTitleStyleUndefined: Self = StObject.set(x, "defaultTitleStyle", js.undefined)
      
      @scala.inline
      def setScrollViewProps(value: js.Object): Self = StObject.set(x, "scrollViewProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollViewPropsUndefined: Self = StObject.set(x, "scrollViewProps", js.undefined)
      
      @scala.inline
      def setUnderlayColor(value: String): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    }
  }
}
