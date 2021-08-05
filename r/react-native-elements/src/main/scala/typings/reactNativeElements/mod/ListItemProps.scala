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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemProps
  extends StObject
     with TouchableHighlightProps {
  
  var Component: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var ViewComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var badge: js.UndefOr[BadgeProps] = js.undefined
  
  var bottomDivider: js.UndefOr[Boolean] = js.undefined
  
  var buttonGroup: js.UndefOr[ButtonGroupProps] = js.undefined
  
  var checkBox: js.UndefOr[CheckBoxProps] = js.undefined
  
  var checkmark: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.undefined
  
  var chevron: js.UndefOr[Boolean | PartialIconProps | ReactElement] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var input: js.UndefOr[InputProps] = js.undefined
  
  var leftAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.undefined
  
  var leftElement: js.UndefOr[ReactElement] = js.undefined
  
  var leftIcon: js.UndefOr[PartialIconProps | ReactElement] = js.undefined
  
  var pad: js.UndefOr[Double] = js.undefined
  
  var rightAvatar: js.UndefOr[PartialAvatarProps | ReactElement] = js.undefined
  
  var rightContentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var rightElement: js.UndefOr[ReactElement] = js.undefined
  
  var rightIcon: js.UndefOr[PartialIconProps | ReactElement] = js.undefined
  
  var rightSubtitle: js.UndefOr[String | ReactElement] = js.undefined
  
  var rightSubtitleProps: js.UndefOr[TextProperties] = js.undefined
  
  var rightSubtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var rightTitle: js.UndefOr[String | ReactElement] = js.undefined
  
  var rightTitleProps: js.UndefOr[TextProperties] = js.undefined
  
  var rightTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var scaleProps: js.UndefOr[ScaleProps] = js.undefined
  
  var subtitle: js.UndefOr[String | ReactElement] = js.undefined
  
  var subtitleProps: js.UndefOr[TextProperties] = js.undefined
  
  var subtitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var switch: js.UndefOr[SwitchProperties] = js.undefined
  
  var title: js.UndefOr[String | ReactElement] = js.undefined
  
  var titleProps: js.UndefOr[TextProperties] = js.undefined
  
  var titleStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var topDivider: js.UndefOr[Boolean] = js.undefined
}
object ListItemProps {
  
  inline def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  
  extension [Self <: ListItemProps](x: Self) {
    
    inline def setBadge(value: BadgeProps): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setBottomDivider(value: Boolean): Self = StObject.set(x, "bottomDivider", value.asInstanceOf[js.Any])
    
    inline def setBottomDividerUndefined: Self = StObject.set(x, "bottomDivider", js.undefined)
    
    inline def setButtonGroup(value: ButtonGroupProps): Self = StObject.set(x, "buttonGroup", value.asInstanceOf[js.Any])
    
    inline def setButtonGroupUndefined: Self = StObject.set(x, "buttonGroup", js.undefined)
    
    inline def setCheckBox(value: CheckBoxProps): Self = StObject.set(x, "checkBox", value.asInstanceOf[js.Any])
    
    inline def setCheckBoxUndefined: Self = StObject.set(x, "checkBox", js.undefined)
    
    inline def setCheckmark(value: Boolean | PartialIconProps | ReactElement): Self = StObject.set(x, "checkmark", value.asInstanceOf[js.Any])
    
    inline def setCheckmarkUndefined: Self = StObject.set(x, "checkmark", js.undefined)
    
    inline def setChevron(value: Boolean | PartialIconProps | ReactElement): Self = StObject.set(x, "chevron", value.asInstanceOf[js.Any])
    
    inline def setChevronUndefined: Self = StObject.set(x, "chevron", js.undefined)
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
    
    inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
    
    inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    inline def setInput(value: InputProps): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLeftAvatar(value: PartialAvatarProps | ReactElement): Self = StObject.set(x, "leftAvatar", value.asInstanceOf[js.Any])
    
    inline def setLeftAvatarUndefined: Self = StObject.set(x, "leftAvatar", js.undefined)
    
    inline def setLeftElement(value: ReactElement): Self = StObject.set(x, "leftElement", value.asInstanceOf[js.Any])
    
    inline def setLeftElementUndefined: Self = StObject.set(x, "leftElement", js.undefined)
    
    inline def setLeftIcon(value: PartialIconProps | ReactElement): Self = StObject.set(x, "leftIcon", value.asInstanceOf[js.Any])
    
    inline def setLeftIconUndefined: Self = StObject.set(x, "leftIcon", js.undefined)
    
    inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setRightAvatar(value: PartialAvatarProps | ReactElement): Self = StObject.set(x, "rightAvatar", value.asInstanceOf[js.Any])
    
    inline def setRightAvatarUndefined: Self = StObject.set(x, "rightAvatar", js.undefined)
    
    inline def setRightContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "rightContentContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setRightContentContainerStyleNull: Self = StObject.set(x, "rightContentContainerStyle", null)
    
    inline def setRightContentContainerStyleUndefined: Self = StObject.set(x, "rightContentContainerStyle", js.undefined)
    
    inline def setRightElement(value: ReactElement): Self = StObject.set(x, "rightElement", value.asInstanceOf[js.Any])
    
    inline def setRightElementUndefined: Self = StObject.set(x, "rightElement", js.undefined)
    
    inline def setRightIcon(value: PartialIconProps | ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
    
    inline def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
    
    inline def setRightSubtitle(value: String | ReactElement): Self = StObject.set(x, "rightSubtitle", value.asInstanceOf[js.Any])
    
    inline def setRightSubtitleProps(value: TextProperties): Self = StObject.set(x, "rightSubtitleProps", value.asInstanceOf[js.Any])
    
    inline def setRightSubtitlePropsUndefined: Self = StObject.set(x, "rightSubtitleProps", js.undefined)
    
    inline def setRightSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "rightSubtitleStyle", value.asInstanceOf[js.Any])
    
    inline def setRightSubtitleStyleNull: Self = StObject.set(x, "rightSubtitleStyle", null)
    
    inline def setRightSubtitleStyleUndefined: Self = StObject.set(x, "rightSubtitleStyle", js.undefined)
    
    inline def setRightSubtitleUndefined: Self = StObject.set(x, "rightSubtitle", js.undefined)
    
    inline def setRightTitle(value: String | ReactElement): Self = StObject.set(x, "rightTitle", value.asInstanceOf[js.Any])
    
    inline def setRightTitleProps(value: TextProperties): Self = StObject.set(x, "rightTitleProps", value.asInstanceOf[js.Any])
    
    inline def setRightTitlePropsUndefined: Self = StObject.set(x, "rightTitleProps", js.undefined)
    
    inline def setRightTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "rightTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setRightTitleStyleNull: Self = StObject.set(x, "rightTitleStyle", null)
    
    inline def setRightTitleStyleUndefined: Self = StObject.set(x, "rightTitleStyle", js.undefined)
    
    inline def setRightTitleUndefined: Self = StObject.set(x, "rightTitle", js.undefined)
    
    inline def setScaleProps(value: ScaleProps): Self = StObject.set(x, "scaleProps", value.asInstanceOf[js.Any])
    
    inline def setScalePropsUndefined: Self = StObject.set(x, "scaleProps", js.undefined)
    
    inline def setSubtitle(value: String | ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleProps(value: TextProperties): Self = StObject.set(x, "subtitleProps", value.asInstanceOf[js.Any])
    
    inline def setSubtitlePropsUndefined: Self = StObject.set(x, "subtitleProps", js.undefined)
    
    inline def setSubtitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "subtitleStyle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleStyleNull: Self = StObject.set(x, "subtitleStyle", null)
    
    inline def setSubtitleStyleUndefined: Self = StObject.set(x, "subtitleStyle", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSwitch(value: SwitchProperties): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    inline def setSwitchUndefined: Self = StObject.set(x, "switch", js.undefined)
    
    inline def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleProps(value: TextProperties): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
    
    inline def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
    
    inline def setTitleStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleNull: Self = StObject.set(x, "titleStyle", null)
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopDivider(value: Boolean): Self = StObject.set(x, "topDivider", value.asInstanceOf[js.Any])
    
    inline def setTopDividerUndefined: Self = StObject.set(x, "topDivider", js.undefined)
    
    inline def setViewComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
