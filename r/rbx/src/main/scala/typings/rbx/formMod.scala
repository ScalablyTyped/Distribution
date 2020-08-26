package typings.rbx

import typings.rbx.anon.AsElementType
import typings.rbx.anon.PickBadgeHelpersPropsFloa
import typings.rbx.anon.PreferHelpersPropsOverrid
import typings.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typings.rbx.anon.`6`
import typings.rbx.controlMod.ControlProps
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.fieldLabelMod.FieldLabelProps
import typings.rbx.fieldMod.FieldModifierProps
import typings.rbx.fieldsetMod.FieldsetProps
import typings.rbx.fileMod.FileModifierProps
import typings.rbx.helpMod.HelpProps
import typings.rbx.helpersMod.HelpersPropsOverrides
import typings.rbx.inputMod.InputProps
import typings.rbx.labelMod.LabelProps
import typings.rbx.rbxStrings.align
import typings.rbx.rbxStrings.as
import typings.rbx.rbxStrings.backgroundColor
import typings.rbx.rbxStrings.badge
import typings.rbx.rbxStrings.badgeColor
import typings.rbx.rbxStrings.badgeOutlined
import typings.rbx.rbxStrings.badgeRounded
import typings.rbx.rbxStrings.badgeSize
import typings.rbx.rbxStrings.boxed
import typings.rbx.rbxStrings.className
import typings.rbx.rbxStrings.clearfix
import typings.rbx.rbxStrings.clipped
import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.expanded
import typings.rbx.rbxStrings.fullwidth
import typings.rbx.rbxStrings.hasName
import typings.rbx.rbxStrings.hidden
import typings.rbx.rbxStrings.horizontal
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
import typings.rbx.rbxStrings.kind
import typings.rbx.rbxStrings.marginless
import typings.rbx.rbxStrings.multiline
import typings.rbx.rbxStrings.narrow
import typings.rbx.rbxStrings.overlay
import typings.rbx.rbxStrings.paddingless
import typings.rbx.rbxStrings.pull
import typings.rbx.rbxStrings.radiusless
import typings.rbx.rbxStrings.relative
import typings.rbx.rbxStrings.responsive
import typings.rbx.rbxStrings.shadowless
import typings.rbx.rbxStrings.size
import typings.rbx.rbxStrings.srOnly
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
import typings.rbx.textareaMod.TextareaProps
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/elements/form", JSImport.Namespace)
@js.native
object formMod extends js.Object {
  val Checkbox: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Control: ForwardRefAsExoticComponent[ControlProps, ElementType[js.Any]] = js.native
  val Fieldset: ForwardRefAsExoticComponent[FieldsetProps, ElementType[js.Any]] = js.native
  val Help: ForwardRefAsExoticComponent[HelpProps, ElementType[js.Any]] = js.native
  val Input: ForwardRefAsExoticComponent[InputProps, ElementType[js.Any]] = js.native
  val Label: ForwardRefAsExoticComponent[LabelProps, ElementType[js.Any]] = js.native
  val Radio: ForwardRefAsExoticComponent[PreferHelpersPropsOverrid, ElementType[js.Any]] = js.native
  val Textarea: ForwardRefAsExoticComponent[TextareaProps, ElementType[js.Any]] = js.native
  @js.native
  object Field extends js.Object {
    var Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Label: ForwardRefAsExoticComponent[FieldLabelProps, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FieldModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FieldModifierProps with (Pick[
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
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FileModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with FileModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | color | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | fullwidth | boxed | hasName
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
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
}

