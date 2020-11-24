package typings.rbx.dropdownDropdownMod

import typings.rbx.anon.AsElementType
import typings.rbx.anon.PickDropdownContainerProp
import typings.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typings.rbx.anon.TypeofDropdownContainer
import typings.rbx.anon.`6`
import typings.rbx.dropdownContextMod.DropdownContextValue
import typings.rbx.dropdownItemMod.DropdownItemProps
import typings.rbx.dropdownTriggerMod.DropdownTriggerProps
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.rbxStrings.active
import typings.rbx.rbxStrings.align
import typings.rbx.rbxStrings.as
import typings.rbx.rbxStrings.backgroundColor
import typings.rbx.rbxStrings.badge
import typings.rbx.rbxStrings.badgeColor
import typings.rbx.rbxStrings.badgeOutlined
import typings.rbx.rbxStrings.badgeRounded
import typings.rbx.rbxStrings.badgeSize
import typings.rbx.rbxStrings.className
import typings.rbx.rbxStrings.clearfix
import typings.rbx.rbxStrings.clipped
import typings.rbx.rbxStrings.hidden
import typings.rbx.rbxStrings.hoverable
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
import typings.rbx.rbxStrings.managed
import typings.rbx.rbxStrings.marginless
import typings.rbx.rbxStrings.overlay
import typings.rbx.rbxStrings.paddingless
import typings.rbx.rbxStrings.pull
import typings.rbx.rbxStrings.radiusless
import typings.rbx.rbxStrings.relative
import typings.rbx.rbxStrings.responsive
import typings.rbx.rbxStrings.shadowless
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
import typings.rbx.rbxStrings.up
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbx/components/dropdown/dropdown", "Dropdown")
@js.native
object Dropdown extends js.Object {
  
  def apply[TAsComponent /* <: ElementType[_] */](
    props: `6`[TAsComponent] with PickDropdownContainerProp with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        active | hidden | up | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | hoverable | managed
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Element | Null = js.native
  
  var Container: TypeofDropdownContainer = js.native
  
  var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
  
  var Context: typings.react.mod.Context[DropdownContextValue] = js.native
  
  var Divider: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
  
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  
  var Item: ForwardRefAsExoticComponent[DropdownItemProps, ElementType[_]] = js.native
  
  var Menu: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
  
  var Trigger: ForwardRefAsExoticComponent[DropdownTriggerProps, ElementType[_]] = js.native
  
  var defaultProps: AsElementType with (Partial[PickDropdownContainerProp with (Pick[_, String | Double | js.Symbol])]) = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
