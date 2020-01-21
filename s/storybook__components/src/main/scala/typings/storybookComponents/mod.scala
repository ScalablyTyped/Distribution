package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.react.mod.TableHTMLAttributes
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLFormElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLSpanElement
import typings.std.HTMLTableElement
import typings.std.Pick
import typings.storybookComponents.actionBarMod.ActionBarProps
import typings.storybookComponents.addonPanelMod.AddonPanelProps
import typings.storybookComponents.badgeMod.BadgeProps
import typings.storybookComponents.barMod.FlexBarProps
import typings.storybookComponents.buttonButtonMod.ButtonProps
import typings.storybookComponents.buttonMod.IconButtonProps
import typings.storybookComponents.buttonMod.TabButtonProps
import typings.storybookComponents.colorPaletteMod.ColorProps
import typings.storybookComponents.descriptionMod.DescriptionProps
import typings.storybookComponents.iconGalleryMod.IconItemProps
import typings.storybookComponents.iconMod.IconsProps
import typings.storybookComponents.linkMod.AProps
import typings.storybookComponents.linkMod.LinkProps
import typings.storybookComponents.previewMod.PreviewProps
import typings.storybookComponents.propsTableMod.PropsTableProps
import typings.storybookComponents.scrollAreaMod.ScrollAreaProps
import typings.storybookComponents.separatorMod.SeparatorProps
import typings.storybookComponents.sourceMod.SourceProps
import typings.storybookComponents.spacedMod.SpacedProps
import typings.storybookComponents.storyMod.StoryProps
import typings.storybookComponents.storybookLogoMod.StorybookLogoProps
import typings.storybookComponents.syntaxhighlighterMod.Props
import typings.storybookComponents.tabsMod.TabWrapperProps
import typings.storybookComponents.tabsMod.TabsProps
import typings.storybookComponents.tabsMod.TabsStateProps
import typings.storybookComponents.tooltipLinkListMod.TooltipLinkListProps
import typings.storybookComponents.tooltipMessageMod.TooltipMessageProps
import typings.storybookComponents.tooltipNoteMod.TooltipNoteProps
import typings.storybookComponents.typesetMod.TypesetProps
import typings.storybookComponents.withTooltipMod.WithTooltipPureProps
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IFrame ()
    extends typings.storybookComponents.iframeMod.IFrame
  
  @js.native
  class TabsState protected ()
    extends typings.storybookComponents.tabsMod.TabsState {
    def this(props: TabsStateProps) = this()
  }
  
  val ActionBar: FunctionComponent[ActionBarProps] = js.native
  val Badge: FunctionComponent[BadgeProps] = js.native
  val Bar: StyledComponent[js.Any, Pick[js.Any, String | Double | js.Symbol], Theme] = js.native
  val Button: (ForwardRefExoticComponent[ButtonProps with RefAttributes[_]]) with AnonDefaultProps = js.native
  val ColorItem: FunctionComponent[ColorProps] = js.native
  val ColorPalette: FunctionComponent[js.Object] = js.native
  val Description: FunctionComponent[DescriptionProps] = js.native
  val DocsContent: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
    ], 
    Theme
  ] = js.native
  val DocsPageWrapper: FunctionComponent[js.Object] = js.native
  val DocsWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  val DocumentWrapper: StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], js.Object, Theme] = js.native
  val FlexBar: FunctionComponent[FlexBarProps] = js.native
  val Form: (StyledComponent[
    DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
    Pick[
      DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 263 */ js.Any
    ], 
    Theme
  ]) with AnonAbout = js.native
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
  val PropsTable: FC[PropsTableProps] = js.native
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
  val Subtitle: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  val SyntaxHighlighter: FunctionComponent[Props] = js.native
  val TabBar: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Pick[
      DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
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
  val Tabs: FunctionComponent[TabsProps] = js.native
  val Title: StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    js.Object, 
    Theme
  ] = js.native
  val TooltipLinkList: FunctionComponent[TooltipLinkListProps] = js.native
  val TooltipMessage: FunctionComponent[TooltipMessageProps] = js.native
  val TooltipNote: FunctionComponent[TooltipNoteProps] = js.native
  val Typeset: FunctionComponent[TypesetProps] = js.native
  val WithTooltipPure: FunctionComponent[WithTooltipPureProps] = js.native
  def AddonPanel(hasActiveChildren: AddonPanelProps): Element = js.native
  def interleaveSeparators(list: js.Array[_]): js.Any = js.native
  @js.native
  object PropsTableError extends js.Object {
    /* "No component found" */ val NO_COMPONENT: typings.storybookComponents.propsTableMod.PropsTableError.NO_COMPONENT with String = js.native
    /* "Props unsupported. See Props documentation for your framework." */ val PROPS_UNSUPPORTED: typings.storybookComponents.propsTableMod.PropsTableError.PROPS_UNSUPPORTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.propsTableMod.PropsTableError with String] = js.native
  }
  
  @js.native
  object SourceError extends js.Object {
    /* "There\\u2019s no story here." */ val NO_STORY: typings.storybookComponents.sourceMod.SourceError.NO_STORY with String = js.native
    /* "Oh no! The source is not available." */ val SOURCE_UNAVAILABLE: typings.storybookComponents.sourceMod.SourceError.SOURCE_UNAVAILABLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.sourceMod.SourceError with String] = js.native
  }
  
  @js.native
  object StoryError extends js.Object {
    /* "No component or story to display" */ val NO_STORY: typings.storybookComponents.storyMod.StoryError.NO_STORY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.storybookComponents.storyMod.StoryError with String] = js.native
  }
  
  /* static members */
  @js.native
  object TabsState extends js.Object {
    var defaultProps: TabsStateProps = js.native
  }
  
}

