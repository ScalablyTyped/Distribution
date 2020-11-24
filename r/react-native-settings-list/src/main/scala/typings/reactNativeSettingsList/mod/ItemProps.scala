package typings.reactNativeSettingsList.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Both
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Bottom
import typings.reactNativeSettingsList.reactNativeSettingsListStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemProps extends js.Object {
  
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
  implicit class ItemPropsOps[Self <: ItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrowIcon(value: ReactNode): Self = this.set("arrowIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowIcon: Self = this.set("arrowIcon", js.undefined)
    
    @scala.inline
    def setArrowStyle(value: StyleProp[ImageStyle]): Self = this.set("arrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowStyle: Self = this.set("arrowStyle", js.undefined)
    
    @scala.inline
    def setArrowStyleNull: Self = this.set("arrowStyle", null)
    
    @scala.inline
    def setAuthPropsPW(value: js.Object): Self = this.set("authPropsPW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthPropsPW: Self = this.set("authPropsPW", js.undefined)
    
    @scala.inline
    def setAuthPropsUser(value: js.Object): Self = this.set("authPropsUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthPropsUser: Self = this.set("authPropsUser", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderHide(value: Top | Bottom | Both): Self = this.set("borderHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderHide: Self = this.set("borderHide", js.undefined)
    
    @scala.inline
    def setEditableTextStyle(value: StyleProp[TextStyle]): Self = this.set("editableTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditableTextStyle: Self = this.set("editableTextStyle", js.undefined)
    
    @scala.inline
    def setEditableTextStyleNull: Self = this.set("editableTextStyle", null)
    
    @scala.inline
    def setHasNavArrow(value: Boolean): Self = this.set("hasNavArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasNavArrow: Self = this.set("hasNavArrow", js.undefined)
    
    @scala.inline
    def setHasSwitch(value: Boolean): Self = this.set("hasSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSwitch: Self = this.set("hasSwitch", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIsAuth(value: Boolean): Self = this.set("isAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAuth: Self = this.set("isAuth", js.undefined)
    
    @scala.inline
    def setItemBoxStyle(value: StyleProp[ViewStyle]): Self = this.set("itemBoxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemBoxStyle: Self = this.set("itemBoxStyle", js.undefined)
    
    @scala.inline
    def setItemBoxStyleNull: Self = this.set("itemBoxStyle", null)
    
    @scala.inline
    def setItemRef(value: () => Unit): Self = this.set("itemRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteItemRef: Self = this.set("itemRef", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: () => Unit): Self = this.set("onLongPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    
    @scala.inline
    def setRightSideContent(value: ReactNode): Self = this.set("rightSideContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSideContent: Self = this.set("rightSideContent", js.undefined)
    
    @scala.inline
    def setRightSideStyle(value: StyleProp[ViewStyle]): Self = this.set("rightSideStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSideStyle: Self = this.set("rightSideStyle", js.undefined)
    
    @scala.inline
    def setRightSideStyleNull: Self = this.set("rightSideStyle", null)
    
    @scala.inline
    def setSwitchOnValueChange(value: () => Unit): Self = this.set("switchOnValueChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSwitchOnValueChange: Self = this.set("switchOnValueChange", js.undefined)
    
    @scala.inline
    def setSwitchProps(value: js.Object): Self = this.set("switchProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchProps: Self = this.set("switchProps", js.undefined)
    
    @scala.inline
    def setSwitchState(value: Boolean): Self = this.set("switchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitchState: Self = this.set("switchState", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleBoxStyle(value: StyleProp[ViewStyle]): Self = this.set("titleBoxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBoxStyle: Self = this.set("titleBoxStyle", js.undefined)
    
    @scala.inline
    def setTitleBoxStyleNull: Self = this.set("titleBoxStyle", null)
    
    @scala.inline
    def setTitleInfo(value: String): Self = this.set("titleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleInfo: Self = this.set("titleInfo", js.undefined)
    
    @scala.inline
    def setTitleInfoPosition(value: String): Self = this.set("titleInfoPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleInfoPosition: Self = this.set("titleInfoPosition", js.undefined)
    
    @scala.inline
    def setTitleInfoStyle(value: StyleProp[TextStyle]): Self = this.set("titleInfoStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleInfoStyle: Self = this.set("titleInfoStyle", js.undefined)
    
    @scala.inline
    def setTitleInfoStyleNull: Self = this.set("titleInfoStyle", null)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    
    @scala.inline
    def setUnderlayColor(value: String): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderlayColor: Self = this.set("underlayColor", js.undefined)
  }
}
