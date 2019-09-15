package typings.atStorybookComponents.atStorybookComponentsMod

import typings.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
import typings.atStorybookComponents.Anon_About
import typings.atStorybookComponents.Anon_DefaultProps
import typings.atStorybookComponents.Anon_Theme
import typings.atStorybookComponents.distActionBarActionBarMod.ActionBarProps
import typings.atStorybookComponents.distAddonDashPanelAddonDashPanelMod.AddonPanelProps
import typings.atStorybookComponents.distBadgeBadgeMod.BadgeProps
import typings.atStorybookComponents.distBarBarMod.FlexBarProps
import typings.atStorybookComponents.distBarButtonMod.IconButtonProps
import typings.atStorybookComponents.distBarButtonMod.TabButtonProps
import typings.atStorybookComponents.distBarSeparatorMod.SeparatorProps
import typings.atStorybookComponents.distBlocksColorPaletteMod.ColorProps
import typings.atStorybookComponents.distBlocksDescriptionMod.DescriptionProps
import typings.atStorybookComponents.distBlocksDocsPageMod.DocsPageProps
import typings.atStorybookComponents.distBlocksIconGalleryMod.IconItemProps
import typings.atStorybookComponents.distBlocksPreviewMod.PreviewProps
import typings.atStorybookComponents.distBlocksPropsTablePropsTableMod.PropsTableProps
import typings.atStorybookComponents.distBlocksSourceMod.SourceProps
import typings.atStorybookComponents.distBlocksStoryMod.StoryProps
import typings.atStorybookComponents.distBlocksTypesetMod.TypesetProps
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
import typings.react.reactMod.DetailedHTMLProps
import typings.react.reactMod.FormHTMLAttributes
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.NamedExoticComponent
import typings.react.reactMod.RefAttributes
import typings.react.reactMod.TableHTMLAttributes
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLFormElement
import typings.std.HTMLSpanElement
import typings.std.HTMLTableElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ActionBar: FunctionComponent[ActionBarProps] = js.native
  val Badge: FunctionComponent[BadgeProps] = js.native
  val Bar: StyledComponent[js.Any, (Pick[_, String | Double | js.Symbol]) with Anon_Theme, Theme] = js.native
  val Button: (ForwardRefExoticComponent[ButtonProps with RefAttributes[_]]) with Anon_DefaultProps = js.native
  val ColorItem: FunctionComponent[ColorProps] = js.native
  val ColorPalette: FunctionComponent[js.Object] = js.native
  val Description: FunctionComponent[DescriptionProps] = js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  /**
    * An out-of-the box documentation page for components that shows the
    * title & subtitle and a collection of blocks including `Description`,
    * and `Preview`s for each of the component's stories.
    */
  val DocsPage: FunctionComponent[DocsPageProps] = js.native
  val DocsPageWrapper: FunctionComponent[js.Object] = js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  val DocumentWrapper: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 254 */ js.Any
    ], 
    Theme
  ] = js.native
  val FlexBar: FunctionComponent[FlexBarProps] = js.native
  val Form: (StyledComponent[
    DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
    Pick[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 262 */ js.Any
    ], 
    Theme
  ]) with Anon_About = js.native
  val IconButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    IconButtonProps, 
    Theme
  ] = js.native
  val IconGallery: FunctionComponent[js.Object] = js.native
  val IconItem: FunctionComponent[IconItemProps] = js.native
  val Icons: FunctionComponent[IconsProps] = js.native
  val Link: FunctionComponent[LinkProps with AProps] = js.native
  val Placeholder: FunctionComponent[js.Object] = js.native
  /**
    * A preview component for showing one or more component `Story`
    * items. The preview also shows the source for the component
    * as a drop-down.
    */
  val Preview: FunctionComponent[PreviewProps] = js.native
  /**
    * Display the props for a component as a props table. Each row is a collection of
    * PropDefs, usually derived from docgen info for the component.
    */
  val PropsTable: FunctionComponent[PropsTableProps] = js.native
  val ScrollArea: FunctionComponent[ScrollAreaProps] = js.native
  val Separator: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    SeparatorProps, 
    Theme
  ] = js.native
  /**
    * Syntax-highlighted source code for a component (or anything!)
    */
  val Source: FunctionComponent[SourceProps] = js.native
  val Spaced: FunctionComponent[SpacedProps] = js.native
  /**
    * A story element, either renderend inline or in an iframe,
    * with configurable height.
    */
  val Story: FunctionComponent[StoryProps] = js.native
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
  val Table: StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    js.Object, 
    Theme
  ] = js.native
  val Tabs: NamedExoticComponent[TabsProps] = js.native
  val TooltipLinkList: FunctionComponent[TooltipLinkListProps] = js.native
  val TooltipMessage: FunctionComponent[TooltipMessageProps] = js.native
  val TooltipNote: FunctionComponent[TooltipNoteProps] = js.native
  val Typeset: FunctionComponent[TypesetProps] = js.native
  val WithTooltipPure: FunctionComponent[WithTooltipPureProps] = js.native
  def AddonPanel(hasActiveChildren: AddonPanelProps): Element = js.native
  def interleaveSeparators(list: js.Array[_]): js.Any = js.native
}

