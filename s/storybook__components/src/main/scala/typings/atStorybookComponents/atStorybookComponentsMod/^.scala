package typings.atStorybookComponents.atStorybookComponentsMod

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookComponents.Anon_Button
import typings.atStorybookComponents.atStorybookComponentsStrings.children
import typings.atStorybookComponents.atStorybookComponentsStrings.closeOnClick
import typings.atStorybookComponents.atStorybookComponentsStrings.hasChrome
import typings.atStorybookComponents.atStorybookComponentsStrings.modifiers
import typings.atStorybookComponents.atStorybookComponentsStrings.onDoubleClick
import typings.atStorybookComponents.atStorybookComponentsStrings.onVisibilityChange
import typings.atStorybookComponents.atStorybookComponentsStrings.placement
import typings.atStorybookComponents.atStorybookComponentsStrings.svg
import typings.atStorybookComponents.atStorybookComponentsStrings.tooltip
import typings.atStorybookComponents.atStorybookComponentsStrings.tooltipShown
import typings.atStorybookComponents.atStorybookComponentsStrings.trigger
import typings.atStorybookComponents.distActionBarActionBarMod.ActionBarProps
import typings.atStorybookComponents.distBadgeBadgeMod.BadgeProps
import typings.atStorybookComponents.distBarBarMod.FlexBarProps
import typings.atStorybookComponents.distBarButtonMod.IconButtonProps
import typings.atStorybookComponents.distBarButtonMod.TabButtonProps
import typings.atStorybookComponents.distBarSeparatorMod.SeparatorProps
import typings.atStorybookComponents.distBrandStorybookLogoMod.StorybookLogoProps
import typings.atStorybookComponents.distButtonButtonMod.ButtonProps
import typings.atStorybookComponents.distIconIconMod.IconsProps
import typings.atStorybookComponents.distScrollAreaScrollAreaMod.ScrollAreaProps
import typings.atStorybookComponents.distSpacedSpacedMod.SpacedProps
import typings.atStorybookComponents.distTabsTabsMod.TabWrapperProps
import typings.atStorybookComponents.distTabsTabsMod.TabsProps
import typings.atStorybookComponents.distTooltipTooltipLinkListMod.TooltipLinkListProps
import typings.atStorybookComponents.distTooltipTooltipMessageMod.TooltipMessageProps
import typings.atStorybookComponents.distTooltipTooltipNoteMod.TooltipNoteProps
import typings.atStorybookComponents.distTooltipWithTooltipMod.WithTooltipPureProps
import typings.atStorybookComponents.distTypographyLinkLinkMod.AProps
import typings.atStorybookComponents.distTypographyLinkLinkMod.LinkProps
import typings.atStorybookTheming.distTypesMod.Theme
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FormHTMLAttributes
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.NamedExoticComponent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLFormElement
import typings.std.HTMLSpanElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ActionBar: FunctionComponent[ActionBarProps] = js.native
  val Badge: FunctionComponent[BadgeProps] = js.native
  val Bar: StyledComponent[js.Any, Pick[js.Any, String | Double | js.Symbol], Theme] = js.native
  val Button: FunctionComponent[ButtonProps] = js.native
  val FlexBar: FunctionComponent[FlexBarProps] = js.native
  val Form: (StyledComponent[
    DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
    Pick[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 262 */ js.Any
    ], 
    Theme
  ]) with Anon_Button = js.native
  val IconButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    IconButtonProps, 
    Theme
  ] = js.native
  val Icons: FunctionComponent[IconsProps] = js.native
  val Link: FunctionComponent[LinkProps with AProps] = js.native
  val Placeholder: FunctionComponent[js.Object] = js.native
  val ScrollArea: FunctionComponent[ScrollAreaProps] = js.native
  val Separator: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    SeparatorProps, 
    Theme
  ] = js.native
  val Spaced: FunctionComponent[SpacedProps] = js.native
  val StorybookIcon: FunctionComponent[js.Object] = js.native
  val StorybookLogo: FunctionComponent[StorybookLogoProps] = js.native
  val TabBar: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  val TabButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    TabButtonProps, 
    Theme
  ] = js.native
  val TabWrapper: FunctionComponent[TabWrapperProps] = js.native
  val Tabs: NamedExoticComponent[TabsProps] = js.native
  val TooltipLinkList: FunctionComponent[TooltipLinkListProps] = js.native
  val TooltipMessage: FunctionComponent[TooltipMessageProps] = js.native
  val TooltipNote: FunctionComponent[TooltipNoteProps] = js.native
  val WithTooltip: ComponentClass[
    Pick[
      WithTooltipPureProps, 
      children | onDoubleClick | tooltip | svg | placement | hasChrome | trigger | closeOnClick | modifiers | tooltipShown | onVisibilityChange
    ], 
    js.Any
  ] = js.native
  def DocumentFormatting(props: js.Any): Element = js.native
  def interleaveSeparators(list: js.Array[_]): js.Any = js.native
}

