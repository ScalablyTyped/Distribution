package typings.reactNativeElements.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.SwitchProperties
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.TouchableHighlightProps
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.anon.PartialAvatarProps
import typings.reactNativeElements.anon.PartialIconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemProps extends TouchableHighlightProps {
  
  var Component: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var ViewComponent: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var badge: js.UndefOr[BadgeProps] = js.native
  
  var bottomDivider: js.UndefOr[Boolean] = js.native
  
  var buttonGroup: js.UndefOr[ButtonGroupProps] = js.native
  
  var checkBox: js.UndefOr[CheckBoxProps] = js.native
  
  var checkmark: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.native
  
  var chevron: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.native
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var input: js.UndefOr[InputProps] = js.native
  
  var leftAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.native
  
  var leftElement: js.UndefOr[ReactElement] = js.native
  
  var leftIcon: js.UndefOr[PartialIconProps | ReactElement] = js.native
  
  var pad: js.UndefOr[Double] = js.native
  
  var rightAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.native
  
  var rightContentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var rightElement: js.UndefOr[ReactElement] = js.native
  
  var rightIcon: js.UndefOr[PartialIconProps | ReactElement] = js.native
  
  var rightSubtitle: js.UndefOr[String | ReactElement] = js.native
  
  var rightSubtitleProps: js.UndefOr[TextProperties] = js.native
  
  var rightSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var rightTitle: js.UndefOr[String | ReactElement] = js.native
  
  var rightTitleProps: js.UndefOr[TextProperties] = js.native
  
  var rightTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var scaleProps: js.UndefOr[ScaleProps] = js.native
  
  var subtitle: js.UndefOr[String | ReactElement] = js.native
  
  var subtitleProps: js.UndefOr[TextProperties] = js.native
  
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var switch: js.UndefOr[SwitchProperties] = js.native
  
  var title: js.UndefOr[String | ReactElement] = js.native
  
  var titleProps: js.UndefOr[TextProperties] = js.native
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  
  var topDivider: js.UndefOr[Boolean] = js.native
}
object ListItemProps {
  
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ComponentType[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("Component", js.undefined)
    
    @scala.inline
    def setViewComponent(value: ComponentType[js.Object]): Self = this.set("ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewComponent: Self = this.set("ViewComponent", js.undefined)
    
    @scala.inline
    def setBadge(value: BadgeProps): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setBottomDivider(value: Boolean): Self = this.set("bottomDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomDivider: Self = this.set("bottomDivider", js.undefined)
    
    @scala.inline
    def setButtonGroup(value: ButtonGroupProps): Self = this.set("buttonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonGroup: Self = this.set("buttonGroup", js.undefined)
    
    @scala.inline
    def setCheckBox(value: CheckBoxProps): Self = this.set("checkBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBox: Self = this.set("checkBox", js.undefined)
    
    @scala.inline
    def setCheckmark(value: Boolean | PartialIconProps | ReactElement): Self = this.set("checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckmark: Self = this.set("checkmark", js.undefined)
    
    @scala.inline
    def setChevron(value: Boolean | PartialIconProps | ReactElement): Self = this.set("chevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChevron: Self = this.set("chevron", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setContainerStyleNull: Self = this.set("containerStyle", null)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentContainerStyle: Self = this.set("contentContainerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyleNull: Self = this.set("contentContainerStyle", null)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = this.set("disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledStyle: Self = this.set("disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledStyleNull: Self = this.set("disabledStyle", null)
    
    @scala.inline
    def setInput(value: InputProps): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLeftAvatar(value: PartialAvatarProps | ReactElement): Self = this.set("leftAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftAvatar: Self = this.set("leftAvatar", js.undefined)
    
    @scala.inline
    def setLeftElement(value: ReactElement): Self = this.set("leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftElement: Self = this.set("leftElement", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: PartialIconProps | ReactElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    
    @scala.inline
    def setPad(value: Double): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setRightAvatar(value: PartialAvatarProps | ReactElement): Self = this.set("rightAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAvatar: Self = this.set("rightAvatar", js.undefined)
    
    @scala.inline
    def setRightContentContainerStyle(value: StyleProp[ViewStyle]): Self = this.set("rightContentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightContentContainerStyle: Self = this.set("rightContentContainerStyle", js.undefined)
    
    @scala.inline
    def setRightContentContainerStyleNull: Self = this.set("rightContentContainerStyle", null)
    
    @scala.inline
    def setRightElement(value: ReactElement): Self = this.set("rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightElement: Self = this.set("rightElement", js.undefined)
    
    @scala.inline
    def setRightIcon(value: PartialIconProps | ReactElement): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    
    @scala.inline
    def setRightSubtitle(value: String | ReactElement): Self = this.set("rightSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitle: Self = this.set("rightSubtitle", js.undefined)
    
    @scala.inline
    def setRightSubtitleProps(value: TextProperties): Self = this.set("rightSubtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitleProps: Self = this.set("rightSubtitleProps", js.undefined)
    
    @scala.inline
    def setRightSubtitleStyle(value: StyleProp[TextStyle]): Self = this.set("rightSubtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightSubtitleStyle: Self = this.set("rightSubtitleStyle", js.undefined)
    
    @scala.inline
    def setRightSubtitleStyleNull: Self = this.set("rightSubtitleStyle", null)
    
    @scala.inline
    def setRightTitle(value: String | ReactElement): Self = this.set("rightTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitle: Self = this.set("rightTitle", js.undefined)
    
    @scala.inline
    def setRightTitleProps(value: TextProperties): Self = this.set("rightTitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitleProps: Self = this.set("rightTitleProps", js.undefined)
    
    @scala.inline
    def setRightTitleStyle(value: StyleProp[TextStyle]): Self = this.set("rightTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightTitleStyle: Self = this.set("rightTitleStyle", js.undefined)
    
    @scala.inline
    def setRightTitleStyleNull: Self = this.set("rightTitleStyle", null)
    
    @scala.inline
    def setScaleProps(value: ScaleProps): Self = this.set("scaleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleProps: Self = this.set("scaleProps", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String | ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setSubtitleProps(value: TextProperties): Self = this.set("subtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleProps: Self = this.set("subtitleProps", js.undefined)
    
    @scala.inline
    def setSubtitleStyle(value: StyleProp[TextStyle]): Self = this.set("subtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitleStyle: Self = this.set("subtitleStyle", js.undefined)
    
    @scala.inline
    def setSubtitleStyleNull: Self = this.set("subtitleStyle", null)
    
    @scala.inline
    def setSwitch(value: SwitchProperties): Self = this.set("switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwitch: Self = this.set("switch", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleProps(value: TextProperties): Self = this.set("titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleProps: Self = this.set("titleProps", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
    
    @scala.inline
    def setTitleStyleNull: Self = this.set("titleStyle", null)
    
    @scala.inline
    def setTopDivider(value: Boolean): Self = this.set("topDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopDivider: Self = this.set("topDivider", js.undefined)
  }
}
