package typings.reactFoundation

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.reactFoundation.accordionMod.AccordianContentProps
import typings.reactFoundation.accordionMod.AccordianItemProps
import typings.reactFoundation.accordionMod.AccordianProps
import typings.reactFoundation.accordionMod.AccordionTitleProps
import typings.reactFoundation.anon.AlignX
import typings.reactFoundation.anon.Breakpoint
import typings.reactFoundation.badgeMod.BadgeProps
import typings.reactFoundation.breadcrumbsMod.BreadcrumbItemProps
import typings.reactFoundation.breadcrumbsMod.BreadcrumbsProps
import typings.reactFoundation.buttonGroupMod.ButtonGroupProps
import typings.reactFoundation.buttonMod.ButtonProps
import typings.reactFoundation.buttonMod.LinkProps
import typings.reactFoundation.calloutMod.CalloutProps
import typings.reactFoundation.closeButtonMod.CloseButtonProps
import typings.reactFoundation.elementMod.BlockProps
import typings.reactFoundation.elementMod.InlineProps
import typings.reactFoundation.enumsMod.BadgeColors
import typings.reactFoundation.enumsMod.ButtonColors
import typings.reactFoundation.enumsMod.ButtonSizes
import typings.reactFoundation.enumsMod.HorizontalAlignments
import typings.reactFoundation.enumsMod.MenuAlignments
import typings.reactFoundation.enumsMod.ProgressColors
import typings.reactFoundation.enumsMod.SwitchInputTypes
import typings.reactFoundation.enumsMod.VerticalAlignments
import typings.reactFoundation.flexVideoMod.FlexVideoProps
import typings.reactFoundation.gridMod.ColumnProps
import typings.reactFoundation.gridMod.RowProps
import typings.reactFoundation.iconMod.IconProps
import typings.reactFoundation.labelMod.LabelProps
import typings.reactFoundation.mediaObjectMod.MediaObjectProps
import typings.reactFoundation.mediaObjectMod.MediaObjectSectionProps
import typings.reactFoundation.menuMod.MenuItemProps
import typings.reactFoundation.menuMod.MenuProps
import typings.reactFoundation.paginationMod.PaginationItemProps
import typings.reactFoundation.paginationMod.PaginationProps
import typings.reactFoundation.progressBarMod.NativeProgressProps
import typings.reactFoundation.progressBarMod.ProgressMeterProps
import typings.reactFoundation.progressBarMod.ProgressMeterTextProps
import typings.reactFoundation.progressBarMod.ProgressMeterWithTextProps
import typings.reactFoundation.responsiveMod.MenuIconProps
import typings.reactFoundation.responsiveMod.TitleBarProps
import typings.reactFoundation.responsiveMod.TitleBarTitleProps
import typings.reactFoundation.sliderMod.SliderFillProps
import typings.reactFoundation.sliderMod.SliderHandleProps
import typings.reactFoundation.switchMod.SwitchActiveProps
import typings.reactFoundation.switchMod.SwitchInactiveProps
import typings.reactFoundation.switchMod.SwitchInputProps
import typings.reactFoundation.switchMod.SwitchPaddleProps
import typings.reactFoundation.switchMod.SwitchProps
import typings.reactFoundation.tabsMod.TabItemProps
import typings.reactFoundation.tabsMod.TabPanelProps
import typings.reactFoundation.tabsMod.TabsContentProps
import typings.reactFoundation.tabsMod.TabsProps
import typings.reactFoundation.thumbnailMod.ThumbnailProps
import typings.reactFoundation.topBarMod.TopBarProps
import typings.reactFoundation.xyGridMod.CellProps
import typings.reactFoundation.xyGridMod.GridContainerProps
import typings.reactFoundation.xyGridMod.GridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-foundation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-foundation", "Accordion")
  @js.native
  val Accordion: FunctionComponent[AccordianProps] = js.native
  
  @JSImport("react-foundation", "AccordionContent")
  @js.native
  val AccordionContent: FunctionComponent[AccordianContentProps] = js.native
  
  @JSImport("react-foundation", "AccordionItem")
  @js.native
  val AccordionItem: FunctionComponent[AccordianItemProps] = js.native
  
  @JSImport("react-foundation", "AccordionTitle")
  @js.native
  val AccordionTitle: FunctionComponent[AccordionTitleProps] = js.native
  
  object Alignments {
    
    @JSImport("react-foundation", "Alignments")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Alignments.BOTTOM")
    @js.native
    def BOTTOM: VerticalAlignments = js.native
    inline def BOTTOM_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.CENTER")
    @js.native
    def CENTER: MenuAlignments = js.native
    inline def CENTER_=(x: MenuAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.JUSTIFY")
    @js.native
    def JUSTIFY: HorizontalAlignments = js.native
    inline def JUSTIFY_=(x: HorizontalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JUSTIFY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.MIDDLE")
    @js.native
    def MIDDLE: VerticalAlignments = js.native
    inline def MIDDLE_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIDDLE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.RIGHT")
    @js.native
    def RIGHT: MenuAlignments = js.native
    inline def RIGHT_=(x: MenuAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.SPACED")
    @js.native
    def SPACED: HorizontalAlignments = js.native
    inline def SPACED_=(x: HorizontalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPACED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.STRETCH")
    @js.native
    def STRETCH: VerticalAlignments = js.native
    inline def STRETCH_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRETCH")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Alignments.TOP")
    @js.native
    def TOP: VerticalAlignments = js.native
    inline def TOP_=(x: VerticalAlignments): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Badge")
  @js.native
  val Badge: FunctionComponent[BadgeProps] = js.native
  
  @JSImport("react-foundation", "Block")
  @js.native
  val Block: FunctionComponent[BlockProps] = js.native
  
  @JSImport("react-foundation", "BreadcrumbItem")
  @js.native
  val BreadcrumbItem: FunctionComponent[BreadcrumbItemProps] = js.native
  
  @JSImport("react-foundation", "Breadcrumbs")
  @js.native
  val Breadcrumbs: FunctionComponent[BreadcrumbsProps] = js.native
  
  object Breakpoints {
    
    @JSImport("react-foundation", "Breakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Breakpoints.LARGE")
    @js.native
    def LARGE: typings.reactFoundation.enumsMod.Breakpoints = js.native
    inline def LARGE_=(x: typings.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.MEDIUM")
    @js.native
    def MEDIUM: typings.reactFoundation.enumsMod.Breakpoints = js.native
    inline def MEDIUM_=(x: typings.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.SMALL")
    @js.native
    def SMALL: typings.reactFoundation.enumsMod.Breakpoints = js.native
    inline def SMALL_=(x: typings.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.XLARGE")
    @js.native
    def XLARGE: typings.reactFoundation.enumsMod.Breakpoints = js.native
    inline def XLARGE_=(x: typings.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XLARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Breakpoints.XXLARGE")
    @js.native
    def XXLARGE: typings.reactFoundation.enumsMod.Breakpoints = js.native
    inline def XXLARGE_=(x: typings.reactFoundation.enumsMod.Breakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XXLARGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Button")
  @js.native
  val Button: FunctionComponent[ButtonProps] = js.native
  
  @JSImport("react-foundation", "ButtonGroup")
  @js.native
  val ButtonGroup: FunctionComponent[ButtonGroupProps] = js.native
  
  @JSImport("react-foundation", "Callout")
  @js.native
  val Callout: FunctionComponent[CalloutProps] = js.native
  
  @JSImport("react-foundation", "Cell")
  @js.native
  val Cell: FunctionComponent[CellProps] = js.native
  
  @JSImport("react-foundation", "CloseButton")
  @js.native
  val CloseButton: FunctionComponent[CloseButtonProps] = js.native
  
  object Colors {
    
    @JSImport("react-foundation", "Colors")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Colors.ALERT")
    @js.native
    def ALERT: ProgressColors = js.native
    inline def ALERT_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALERT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.INFO")
    @js.native
    def INFO: BadgeColors = js.native
    inline def INFO_=(x: BadgeColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.PRIMARY")
    @js.native
    def PRIMARY: ButtonColors = js.native
    inline def PRIMARY_=(x: ButtonColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIMARY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.SECONDARY")
    @js.native
    def SECONDARY: ProgressColors = js.native
    inline def SECONDARY_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECONDARY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.SUCCESS")
    @js.native
    def SUCCESS: ProgressColors = js.native
    inline def SUCCESS_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Colors.WARNING")
    @js.native
    def WARNING: ProgressColors = js.native
    inline def WARNING_=(x: ProgressColors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Column")
  @js.native
  val Column: FunctionComponent[ColumnProps] = js.native
  
  object ExtendedBreakpoints {
    
    @JSImport("react-foundation", "ExtendedBreakpoints")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "ExtendedBreakpoints.ALL")
    @js.native
    def ALL: typings.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def ALL_=(x: typings.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.LARGE")
    @js.native
    def LARGE: typings.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def LARGE_=(x: typings.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.MEDIUM")
    @js.native
    def MEDIUM: typings.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def MEDIUM_=(x: typings.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUM")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.SMALL")
    @js.native
    def SMALL: typings.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def SMALL_=(x: typings.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.XLARGE")
    @js.native
    def XLARGE: typings.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def XLARGE_=(x: typings.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XLARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ExtendedBreakpoints.XXLARGE")
    @js.native
    def XXLARGE: typings.reactFoundation.enumsMod.ExtendedBreakpoints = js.native
    inline def XXLARGE_=(x: typings.reactFoundation.enumsMod.ExtendedBreakpoints): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XXLARGE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "FlexVideo")
  @js.native
  val FlexVideo: FunctionComponent[FlexVideoProps] = js.native
  
  object FloatTypes {
    
    @JSImport("react-foundation", "FloatTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "FloatTypes.CENTER")
    @js.native
    def CENTER: typings.reactFoundation.enumsMod.FloatTypes = js.native
    inline def CENTER_=(x: typings.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "FloatTypes.LEFT")
    @js.native
    def LEFT: typings.reactFoundation.enumsMod.FloatTypes = js.native
    inline def LEFT_=(x: typings.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "FloatTypes.RIGHT")
    @js.native
    def RIGHT: typings.reactFoundation.enumsMod.FloatTypes = js.native
    inline def RIGHT_=(x: typings.reactFoundation.enumsMod.FloatTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Grid")
  @js.native
  val Grid: FunctionComponent[GridProps] = js.native
  
  @JSImport("react-foundation", "GridContainer")
  @js.native
  val GridContainer: FunctionComponent[GridContainerProps] = js.native
  
  object GutterTypes {
    
    @JSImport("react-foundation", "GutterTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "GutterTypes.MARGIN")
    @js.native
    def MARGIN: typings.reactFoundation.enumsMod.GutterTypes = js.native
    inline def MARGIN_=(x: typings.reactFoundation.enumsMod.GutterTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "GutterTypes.PADDING")
    @js.native
    def PADDING: typings.reactFoundation.enumsMod.GutterTypes = js.native
    inline def PADDING_=(x: typings.reactFoundation.enumsMod.GutterTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PADDING")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Icon")
  @js.native
  val Icon: FunctionComponent[IconProps] = js.native
  
  @JSImport("react-foundation", "Inline")
  @js.native
  val Inline: FunctionComponent[InlineProps] = js.native
  
  object InputTypes {
    
    @JSImport("react-foundation", "InputTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "InputTypes.CHECKBOX")
    @js.native
    def CHECKBOX: SwitchInputTypes = js.native
    inline def CHECKBOX_=(x: SwitchInputTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "InputTypes.RADIO")
    @js.native
    def RADIO: SwitchInputTypes = js.native
    inline def RADIO_=(x: SwitchInputTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RADIO")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Label")
  @js.native
  val Label: FunctionComponent[LabelProps] = js.native
  
  @JSImport("react-foundation", "Link")
  @js.native
  val Link: FunctionComponent[LinkProps] = js.native
  
  @JSImport("react-foundation", "MediaObject")
  @js.native
  val MediaObject: FunctionComponent[MediaObjectProps] = js.native
  
  @JSImport("react-foundation", "MediaObjectSection")
  @js.native
  val MediaObjectSection: FunctionComponent[MediaObjectSectionProps] = js.native
  
  @JSImport("react-foundation", "Menu")
  @js.native
  val Menu: FunctionComponent[MenuProps] = js.native
  
  @JSImport("react-foundation", "MenuIcon")
  @js.native
  val MenuIcon: FunctionComponent[MenuIconProps] = js.native
  
  @JSImport("react-foundation", "MenuItem")
  @js.native
  val MenuItem: FunctionComponent[MenuItemProps] = js.native
  
  inline def MenuText(props: MenuItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuText")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-foundation", "NativeProgress")
  @js.native
  val NativeProgress: FunctionComponent[NativeProgressProps] = js.native
  
  @JSImport("react-foundation", "Pagination")
  @js.native
  val Pagination: FunctionComponent[PaginationProps] = js.native
  
  @JSImport("react-foundation", "PaginationEllipsis")
  @js.native
  val PaginationEllipsis: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationItem")
  @js.native
  val PaginationItem: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationNext")
  @js.native
  val PaginationNext: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "PaginationPrevious")
  @js.native
  val PaginationPrevious: FunctionComponent[PaginationItemProps] = js.native
  
  @JSImport("react-foundation", "Progress")
  @js.native
  val Progress: FunctionComponent[typings.reactFoundation.progressBarMod.PaginationProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeter")
  @js.native
  val ProgressMeter: FunctionComponent[ProgressMeterProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeterText")
  @js.native
  val ProgressMeterText: FunctionComponent[ProgressMeterTextProps] = js.native
  
  @JSImport("react-foundation", "ProgressMeterWithText")
  @js.native
  val ProgressMeterWithText: FunctionComponent[ProgressMeterWithTextProps] = js.native
  
  @JSImport("react-foundation", "ResponsiveNavigation")
  @js.native
  open class ResponsiveNavigation ()
    extends typings.reactFoundation.responsiveMod.ResponsiveNavigation
  /* static members */
  object ResponsiveNavigation {
    
    @JSImport("react-foundation", "ResponsiveNavigation")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "ResponsiveNavigation.defaultProps")
    @js.native
    def defaultProps: Breakpoint = js.native
    inline def defaultProps_=(x: Breakpoint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "ResponsiveNavigation.propTypes")
    @js.native
    def propTypes: AlignX = js.native
    inline def propTypes_=(x: AlignX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Reveal")
  @js.native
  val Reveal: FunctionComponent[typings.reactFoundation.revealMod.PaginationProps] = js.native
  
  @JSImport("react-foundation", "Row")
  @js.native
  val Row: FunctionComponent[RowProps] = js.native
  
  object Sizes {
    
    @JSImport("react-foundation", "Sizes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "Sizes.LARGE")
    @js.native
    def LARGE: ButtonSizes = js.native
    inline def LARGE_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LARGE")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Sizes.SMALL")
    @js.native
    def SMALL: ButtonSizes = js.native
    inline def SMALL_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SMALL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "Sizes.TINY")
    @js.native
    def TINY: ButtonSizes = js.native
    inline def TINY_=(x: ButtonSizes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TINY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Slider")
  @js.native
  open class Slider ()
    extends typings.reactFoundation.sliderMod.Slider
  
  @JSImport("react-foundation", "SliderFill")
  @js.native
  val SliderFill: FunctionComponent[SliderFillProps] = js.native
  
  @JSImport("react-foundation", "SliderHandle")
  @js.native
  val SliderHandle: FunctionComponent[SliderHandleProps] = js.native
  
  object SpaceControls {
    
    @JSImport("react-foundation", "SpaceControls")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-foundation", "SpaceControls.AUTO")
    @js.native
    def AUTO: typings.reactFoundation.enumsMod.SpaceControls = js.native
    inline def AUTO_=(x: typings.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "SpaceControls.GROW")
    @js.native
    def GROW: typings.reactFoundation.enumsMod.SpaceControls = js.native
    inline def GROW_=(x: typings.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROW")(x.asInstanceOf[js.Any])
    
    @JSImport("react-foundation", "SpaceControls.SHRINK")
    @js.native
    def SHRINK: typings.reactFoundation.enumsMod.SpaceControls = js.native
    inline def SHRINK_=(x: typings.reactFoundation.enumsMod.SpaceControls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHRINK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-foundation", "Switch")
  @js.native
  val Switch: FunctionComponent[SwitchProps] = js.native
  
  @JSImport("react-foundation", "SwitchActive")
  @js.native
  val SwitchActive: FunctionComponent[SwitchActiveProps] = js.native
  
  @JSImport("react-foundation", "SwitchInactive")
  @js.native
  val SwitchInactive: FunctionComponent[SwitchInactiveProps] = js.native
  
  @JSImport("react-foundation", "SwitchInput")
  @js.native
  val SwitchInput: FunctionComponent[SwitchInputProps] = js.native
  
  @JSImport("react-foundation", "SwitchPaddle")
  @js.native
  val SwitchPaddle: FunctionComponent[SwitchPaddleProps] = js.native
  
  @JSImport("react-foundation", "TabItem")
  @js.native
  val TabItem: FunctionComponent[TabItemProps] = js.native
  
  @JSImport("react-foundation", "TabPanel")
  @js.native
  val TabPanel: FunctionComponent[TabPanelProps] = js.native
  
  @JSImport("react-foundation", "Tabs")
  @js.native
  val Tabs: FunctionComponent[TabsProps] = js.native
  
  @JSImport("react-foundation", "TabsContent")
  @js.native
  val TabsContent: FunctionComponent[TabsContentProps] = js.native
  
  @JSImport("react-foundation", "Thumbnail")
  @js.native
  val Thumbnail: FunctionComponent[ThumbnailProps] = js.native
  
  @JSImport("react-foundation", "ThumbnailLink")
  @js.native
  val ThumbnailLink: FunctionComponent[ThumbnailProps] = js.native
  
  @JSImport("react-foundation", "TitleBar")
  @js.native
  val TitleBar: FunctionComponent[TitleBarProps] = js.native
  
  @JSImport("react-foundation", "TitleBarTitle")
  @js.native
  val TitleBarTitle: FunctionComponent[TitleBarTitleProps] = js.native
  
  @JSImport("react-foundation", "TopBar")
  @js.native
  val TopBar: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarLeft")
  @js.native
  val TopBarLeft: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarRight")
  @js.native
  val TopBarRight: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TopBarTitle")
  @js.native
  val TopBarTitle: FunctionComponent[TopBarProps] = js.native
  
  @JSImport("react-foundation", "TwoHandleSlider")
  @js.native
  open class TwoHandleSlider ()
    extends typings.reactFoundation.sliderMod.TwoHandleSlider
}
