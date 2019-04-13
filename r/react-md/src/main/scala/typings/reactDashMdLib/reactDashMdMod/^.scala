package typings
package reactDashMdLib.reactDashMdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-md", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Autocomplete: reactDashMdLib.libAutocompletesAutocompleteMod.AutocompleteComponent = js.native
  val Avatar: reactLib.reactMod.ComponentClass[reactDashMdLib.libAvatarsAvatarMod.AvatarProps, reactLib.reactMod.ComponentState] = js.native
  val Badge: reactLib.reactMod.ComponentClass[reactDashMdLib.libBadgesBadgeMod.BadgeProps, reactLib.reactMod.ComponentState] = js.native
  val BottomNavigation: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libBottomNavigationsBottomNavigationMod.BottomNavigationProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  val Button: reactDashMdLib.libButtonsButtonMod.ButtonComponent = js.native
  val Chip: reactLib.reactMod.ComponentClass[reactDashMdLib.libChipsChipMod.ChipProps, reactLib.reactMod.ComponentState] = js.native
  val Divider: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libDividersDividerMod.DividerProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  val Drawer: reactDashMdLib.libDrawersDrawerMod.DrawerComponent = js.native
  val FontIcon: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libFontIconsFontIconMod.FontIconProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  val Paper: reactLib.reactMod.ComponentClass[reactDashMdLib.libPapersPaperMod.PaperProps, reactLib.reactMod.ComponentState] = js.native
  val SVGIcon: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libSVGIconsSVGIconMod.SVGIconProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  val SelectField: reactDashMdLib.libSelectFieldsSelectFieldMod.SelectFieldComponent = js.native
  val Slider: reactLib.reactMod.ComponentClass[reactDashMdLib.libSlidersSliderMod.SliderProps, reactLib.reactMod.ComponentState] = js.native
  val Snackbar: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libSnackbarsSnackbarContainerMod.SnackbarProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  val Subheader: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libSubheadersSubheaderMod.SubheaderProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  val TextField: reactDashMdLib.libTextFieldsTextFieldMod.TextFieldComponent = js.native
  val Toolbar: reactLib.reactMod.ComponentClass[
    reactDashMdLib.libToolbarsToolbarMod.ToolbarProps, 
    reactLib.reactMod.ComponentState
  ] = js.native
  def bem(block: java.lang.String, elements: (java.lang.String | reactDashMdLib.libUtilsBemMod.Modifiers)*): java.lang.String = js.native
  def injectInk[ComposedProps](
    ComposedComponent: reactLib.reactMod.ComponentType[ComposedProps with reactDashMdLib.libInksInjectInkMod.InkProps]
  ): (reactLib.reactMod.ComponentClass[
    ComposedProps with reactDashMdLib.libInksInjectInkMod.InjectedInkProps, 
    reactLib.reactMod.ComponentState
  ]) with reactDashMdLib.libInksInjectInkMod.InkedComponent = js.native
  def injectTooltip[ComposedProps](
    ComposedComponent: reactLib.reactMod.ComponentType[ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.TooltipProps]
  ): (reactLib.reactMod.ComponentClass[
    ComposedProps with reactDashMdLib.libTooltipsInjectTooltipMod.InjectedTooltipProps, 
    reactLib.reactMod.ComponentState
  ]) with reactDashMdLib.libTooltipsInjectTooltipMod.TooltippedComponent = js.native
}

