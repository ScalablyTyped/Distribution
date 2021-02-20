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
import org.scalablytyped.runtime.StObject
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
  implicit class ListItemPropsMutableBuilder[Self <: ListItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: BadgeProps): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    @scala.inline
    def setBottomDivider(value: Boolean): Self = StObject.set(x, "bottomDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomDividerUndefined: Self = StObject.set(x, "bottomDivider", js.undefined)
    
    @scala.inline
    def setButtonGroup(value: ButtonGroupProps): Self = StObject.set(x, "buttonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonGroupUndefined: Self = StObject.set(x, "buttonGroup", js.undefined)
    
    @scala.inline
    def setCheckBox(value: CheckBoxProps): Self = StObject.set(x, "checkBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckBoxUndefined: Self = StObject.set(x, "checkBox", js.undefined)
    
    @scala.inline
    def setCheckmark(value: Boolean | PartialIconProps | ReactElement): Self = StObject.set(x, "checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckmarkUndefined: Self = StObject.set(x, "checkmark", js.undefined)
    
    @scala.inline
    def setChevron(value: Boolean | PartialIconProps | ReactElement): Self = StObject.set(x, "chevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChevronUndefined: Self = StObject.set(x, "chevron", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    @scala.inline
    def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    @scala.inline
    def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    @scala.inline
    def setInput(value: InputProps): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setLeftAvatar(value: PartialAvatarProps | ReactElement): Self = StObject.set(x, "leftAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftAvatarUndefined: Self = StObject.set(x, "leftAvatar", js.undefined)
    
    @scala.inline
    def setLeftElement(value: ReactElement): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    @scala.inline
    def setLeftIcon(value: PartialIconProps | ReactElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    @scala.inline
    def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    @scala.inline
    def setRightAvatar(value: PartialAvatarProps | ReactElement): Self = StObject.set(x, "rightAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightAvatarUndefined: Self = StObject.set(x, "rightAvatar", js.undefined)
    
    @scala.inline
    def setRightContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightContentContainerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightContentContainerStyleNull: Self = StObject.set(x, "rightContentContainerStyle", null)
    
    @scala.inline
    def setRightContentContainerStyleUndefined: Self = StObject.set(x, "rightContentContainerStyle", js.undefined)
    
    @scala.inline
    def setRightElement(value: ReactElement): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    @scala.inline
    def setRightIcon(value: PartialIconProps | ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    @scala.inline
    def setRightSubtitle(value: String | ReactElement): Self = StObject.set(x, "rightSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSubtitleProps(value: TextProperties): Self = StObject.set(x, "rightSubtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSubtitlePropsUndefined: Self = StObject.set(x, "rightSubtitleProps", js.undefined)
    
    @scala.inline
    def setRightSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "rightSubtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightSubtitleStyleNull: Self = StObject.set(x, "rightSubtitleStyle", null)
    
    @scala.inline
    def setRightSubtitleStyleUndefined: Self = StObject.set(x, "rightSubtitleStyle", js.undefined)
    
    @scala.inline
    def setRightSubtitleUndefined: Self = StObject.set(x, "rightSubtitle", js.undefined)
    
    @scala.inline
    def setRightTitle(value: String | ReactElement): Self = StObject.set(x, "rightTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitleProps(value: TextProperties): Self = StObject.set(x, "rightTitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitlePropsUndefined: Self = StObject.set(x, "rightTitleProps", js.undefined)
    
    @scala.inline
    def setRightTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "rightTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightTitleStyleNull: Self = StObject.set(x, "rightTitleStyle", null)
    
    @scala.inline
    def setRightTitleStyleUndefined: Self = StObject.set(x, "rightTitleStyle", js.undefined)
    
    @scala.inline
    def setRightTitleUndefined: Self = StObject.set(x, "rightTitle", js.undefined)
    
    @scala.inline
    def setScaleProps(value: ScaleProps): Self = StObject.set(x, "scaleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalePropsUndefined: Self = StObject.set(x, "scaleProps", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String | ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleProps(value: TextProperties): Self = StObject.set(x, "subtitleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitlePropsUndefined: Self = StObject.set(x, "subtitleProps", js.undefined)
    
    @scala.inline
    def setSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleStyleNull: Self = StObject.set(x, "subtitleStyle", null)
    
    @scala.inline
    def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setSwitch(value: SwitchProperties): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
    
    @scala.inline
    def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleProps(value: TextProperties): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    @scala.inline
    def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    @scala.inline
    def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTopDivider(value: Boolean): Self = StObject.set(x, "topDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopDividerUndefined: Self = StObject.set(x, "topDivider", js.undefined)
    
    @scala.inline
    def setViewComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
