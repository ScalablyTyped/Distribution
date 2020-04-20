package typings.rbx

import typings.rbx.buttonButtonMod.ButtonModifierProps
import typings.rbx.buttonGroupMod.ButtonGroupProps
import typings.rbx.containerContainerMod.ContainerProps
import typings.rbx.contentContentMod.ContentModifierProps
import typings.rbx.controlMod.ControlProps
import typings.rbx.deleteMod.DeleteProps
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.fieldLabelMod.FieldLabelProps
import typings.rbx.fieldMod.FieldModifierProps
import typings.rbx.fieldsetMod.FieldsetProps
import typings.rbx.fileMod.FileModifierProps
import typings.rbx.helpMod.HelpProps
import typings.rbx.helpersMod.HelpersPropsOverrides
import typings.rbx.iconIconMod.IconProps
import typings.rbx.imageContainerMod.ImageContainerProps
import typings.rbx.imageImageMod.ImageModifierProps
import typings.rbx.inputMod.InputProps
import typings.rbx.labelMod.LabelProps
import typings.rbx.notificationNotificationMod.NotificationProps
import typings.rbx.pageLoaderPageLoaderMod.PageLoaderProps
import typings.rbx.progressProgressMod.ProgressProps
import typings.rbx.rbxStrings.align
import typings.rbx.rbxStrings.as
import typings.rbx.rbxStrings.backgroundColor
import typings.rbx.rbxStrings.badge
import typings.rbx.rbxStrings.badgeColor
import typings.rbx.rbxStrings.badgeOutlined
import typings.rbx.rbxStrings.badgeRounded
import typings.rbx.rbxStrings.badgeSize
import typings.rbx.rbxStrings.bordered
import typings.rbx.rbxStrings.boxed
import typings.rbx.rbxStrings.className
import typings.rbx.rbxStrings.clearfix
import typings.rbx.rbxStrings.clipped
import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.delete
import typings.rbx.rbxStrings.expanded
import typings.rbx.rbxStrings.fullwidth
import typings.rbx.rbxStrings.hasName
import typings.rbx.rbxStrings.hidden
import typings.rbx.rbxStrings.horizontal
import typings.rbx.rbxStrings.hoverable
import typings.rbx.rbxStrings.inverted
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
import typings.rbx.rbxStrings.kind
import typings.rbx.rbxStrings.marginless
import typings.rbx.rbxStrings.multiline
import typings.rbx.rbxStrings.narrow
import typings.rbx.rbxStrings.outlined
import typings.rbx.rbxStrings.overlay
import typings.rbx.rbxStrings.paddingless
import typings.rbx.rbxStrings.pull
import typings.rbx.rbxStrings.radiusless
import typings.rbx.rbxStrings.relative
import typings.rbx.rbxStrings.responsive
import typings.rbx.rbxStrings.rounded
import typings.rbx.rbxStrings.selected
import typings.rbx.rbxStrings.shadowless
import typings.rbx.rbxStrings.size
import typings.rbx.rbxStrings.srOnly
import typings.rbx.rbxStrings.state
import typings.rbx.rbxStrings.static
import typings.rbx.rbxStrings.striped
import typings.rbx.rbxStrings.tbody
import typings.rbx.rbxStrings.text
import typings.rbx.rbxStrings.textAlign
import typings.rbx.rbxStrings.textColor
import typings.rbx.rbxStrings.textSize
import typings.rbx.rbxStrings.textTransform
import typings.rbx.rbxStrings.textWeight
import typings.rbx.rbxStrings.tooltip
import typings.rbx.rbxStrings.tooltipActive
import typings.rbx.rbxStrings.tooltipColor
import typings.rbx.rbxStrings.tooltipMultiline
import typings.rbx.rbxStrings.tooltipPosition
import typings.rbx.rbxStrings.tooltipResponsive
import typings.rbx.rbxStrings.unselectable
import typings.rbx.selectMod.SelectContainerProps
import typings.rbx.tableRowMod.TableRowProps
import typings.rbx.tableTableMod.TableModifierProps
import typings.rbx.tagGroupMod.TagGroupProps
import typings.rbx.tagTagMod.TagModifierProps
import typings.rbx.textareaMod.TextareaProps
import typings.rbx.titleTitleMod.TitleProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.react.mod._Global_.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/elements", JSImport.Namespace)
@js.native
object elementsMod extends js.Object {
  val Block: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Box: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Checkbox: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Container: ForwardRefAsExoticComponent[ContainerProps, ElementType[js.Any]] = js.native
  val Control: ForwardRefAsExoticComponent[ControlProps, ElementType[js.Any]] = js.native
  val Delete: ForwardRefAsExoticComponent[DeleteProps, ElementType[js.Any]] = js.native
  val Fieldset: ForwardRefAsExoticComponent[FieldsetProps, ElementType[js.Any]] = js.native
  val Heading: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Help: ForwardRefAsExoticComponent[HelpProps, ElementType[js.Any]] = js.native
  val Highlight: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Icon: ForwardRefAsExoticComponent[IconProps, ElementType[js.Any]] = js.native
  val Input: ForwardRefAsExoticComponent[InputProps, ElementType[js.Any]] = js.native
  val Label: ForwardRefAsExoticComponent[LabelProps, ElementType[js.Any]] = js.native
  val Loader: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Notification: ForwardRefAsExoticComponent[NotificationProps, ElementType[js.Any]] = js.native
  val Numeric: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val PageLoader: ForwardRefAsExoticComponent[PageLoaderProps, ElementType[js.Any]] = js.native
  val Progress: ForwardRefAsExoticComponent[ProgressProps, ElementType[js.Any]] = js.native
  val Radio: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Textarea: ForwardRefAsExoticComponent[TextareaProps, ElementType[js.Any]] = js.native
  val Title: ForwardRefAsExoticComponent[TitleProps, ElementType[js.Any]] = js.native
  @js.native
  object Button extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Group: ForwardRefAsExoticComponent[ButtonGroupProps, ElementType[_]] = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ButtonModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ButtonModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | text | color | overlay | size | italic | relative | static | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | fullwidth | inverted | outlined | rounded | selected | state
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Content extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var OrderedList: NoneTAsComponentextendsElItem = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ContentModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ContentModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Field extends js.Object {
    var Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Label: ForwardRefAsExoticComponent[FieldLabelProps, ElementType[_]] = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FieldModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FieldModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | expanded | italic | relative | horizontal | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | kind | multiline | narrow
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object File extends js.Object {
    var CTA: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Icon: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Input: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Label: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Name: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FileModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FileModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | color | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | fullwidth | boxed | hasName
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Image extends js.Object {
    var Container: ForwardRefAsExoticComponent[ImageContainerProps, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ImageModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ImageModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | rounded
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Select extends js.Object {
    var Container: ForwardRefAsExoticComponent[SelectContainerProps, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Option: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Table extends js.Object {
    var Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, tbody] = js.native
    var Cell: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Foot: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Head: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Heading: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Row: ForwardRefAsExoticComponent[TableRowProps, ElementType[_]] = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TableModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TableModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | hoverable | fullwidth | narrow | bordered | striped
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Tag extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Group: ForwardRefAsExoticComponent[TagGroupProps, ElementType[_]] = js.native
    var defaultProps: AnonAsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TagModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TagModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | color | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | rounded | delete
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
}

