package typings.rbx

import typings.rbx.anon.Active
import typings.rbx.anon.AsElementType
import typings.rbx.anon.NoneTAsComponentextendsEl
import typings.rbx.anon.NoneTAsComponentextendsElBody
import typings.rbx.anon.NoneTAsComponentextendsElCall
import typings.rbx.anon.NoneTAsComponentextendsElContainer
import typings.rbx.anon.NoneTAsComponentextendsElDefaultProps
import typings.rbx.anon.NoneTAsComponentextendsElDisplayName
import typings.rbx.anon.PickBadgeHelpersPropsFloa
import typings.rbx.anon.PickDropdownContainerProp
import typings.rbx.anon.PickModalContainerPropsac
import typings.rbx.anon.PickNavbarContainerPropsf
import typings.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typings.rbx.anon.TypeofDropdownContainer
import typings.rbx.anon.TypeofModalContainer
import typings.rbx.anon.TypeofModalPortal
import typings.rbx.anon.TypeofNavbarContainer
import typings.rbx.anon.`6`
import typings.rbx.breadcrumbBreadcrumbMod.BreadcrumbModifierProps
import typings.rbx.breadcrumbItemMod.BreadcrumbItemProps
import typings.rbx.dropdownContextMod.DropdownContextValue
import typings.rbx.dropdownItemMod.DropdownItemProps
import typings.rbx.dropdownTriggerMod.DropdownTriggerProps
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.helpersMod.HelpersPropsOverrides
import typings.rbx.levelItemMod.LevelItemProps
import typings.rbx.levelLevelMod.LevelModifierProps
import typings.rbx.listItemMod.ListItemProps
import typings.rbx.mediaItemMod.MediaItemProps
import typings.rbx.messageMessageMod.MessageModifierProps
import typings.rbx.modalBackgroundMod.ModalBackgroundProps
import typings.rbx.modalCloseMod.ModalCloseProps
import typings.rbx.modalContextMod.ModalContextValue
import typings.rbx.navbarBurgerMod.NavbarBurgerProps
import typings.rbx.navbarContextMod.NavbarContextValue
import typings.rbx.navbarDropdownMod.NavbarDropdownProps
import typings.rbx.navbarLinkMod.NavbarLinkProps
import typings.rbx.navbarSegmentMod.NavbarSegmentProps
import typings.rbx.paginationLinkMod.PaginationLinkProps
import typings.rbx.paginationPaginationMod.PaginationModifiers
import typings.rbx.paginationStepMod.PaginationStepProps
import typings.rbx.panelBlockMod.PanelBlockProps
import typings.rbx.rbxStrings.active
import typings.rbx.rbxStrings.align
import typings.rbx.rbxStrings.as
import typings.rbx.rbxStrings.backgroundColor
import typings.rbx.rbxStrings.badge
import typings.rbx.rbxStrings.badgeColor
import typings.rbx.rbxStrings.badgeOutlined
import typings.rbx.rbxStrings.badgeRounded
import typings.rbx.rbxStrings.badgeSize
import typings.rbx.rbxStrings.breakpoint
import typings.rbx.rbxStrings.children
import typings.rbx.rbxStrings.className
import typings.rbx.rbxStrings.clearfix
import typings.rbx.rbxStrings.clipped
import typings.rbx.rbxStrings.closeOnBlur
import typings.rbx.rbxStrings.closeOnEsc
import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.containerClassName
import typings.rbx.rbxStrings.document
import typings.rbx.rbxStrings.fixed
import typings.rbx.rbxStrings.hidden
import typings.rbx.rbxStrings.hoverable
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
import typings.rbx.rbxStrings.managed
import typings.rbx.rbxStrings.marginless
import typings.rbx.rbxStrings.onClose
import typings.rbx.rbxStrings.overlay
import typings.rbx.rbxStrings.paddingless
import typings.rbx.rbxStrings.pull
import typings.rbx.rbxStrings.radiusless
import typings.rbx.rbxStrings.relative
import typings.rbx.rbxStrings.responsive
import typings.rbx.rbxStrings.rounded
import typings.rbx.rbxStrings.separator
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
import typings.rbx.rbxStrings.transparent
import typings.rbx.rbxStrings.unselectable
import typings.rbx.rbxStrings.up
import typings.rbx.tabGroupMod.TabGroupProps
import typings.rbx.tabTabMod.TabModifierProps
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

@JSImport("rbx/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  @js.native
  object Breadcrumb extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Item: ForwardRefAsExoticComponent[BreadcrumbItemProps, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with BreadcrumbModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with BreadcrumbModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | size | italic | relative | separator | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Card extends js.Object {
    var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Footer: NoneTAsComponentextendsEl = js.native
    var Header: NoneTAsComponentextendsElCall = js.native
    var Image: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
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
  
  @js.native
  object Dropdown extends js.Object {
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
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with PickDropdownContainerProp with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            active | hidden | up | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | hoverable | managed
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Level extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Item: ForwardRefAsExoticComponent[LevelItemProps, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with LevelModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with LevelModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | breakpoint
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object List extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Item: ForwardRefAsExoticComponent[ListItemProps, ElementType[_]] = js.native
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
  
  @js.native
  object Media extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Item: ForwardRefAsExoticComponent[MediaItemProps, ElementType[_]] = js.native
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
  
  @js.native
  object Menu extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Label: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var List: NoneTAsComponentextendsElDefaultProps = js.native
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
  
  @js.native
  object Message extends js.Object {
    var Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Header: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with MessageModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with MessageModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | color | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Modal extends js.Object {
    var Background: ForwardRefAsExoticComponent[ModalBackgroundProps, ElementType[_]] = js.native
    var Card: NoneTAsComponentextendsElBody = js.native
    var Close: ForwardRefAsExoticComponent[ModalCloseProps, ElementType[_]] = js.native
    var Container: TypeofModalContainer = js.native
    var Content: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Context: typings.react.mod.Context[ModalContextValue] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Portal: TypeofModalPortal = js.native
    var defaultProps: AsElementType with (Partial[PickModalContainerPropsac with (Pick[_, String | Double | js.Symbol])]) = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: Active = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with PickModalContainerPropsac with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            active | document | children | as | clipped | closeOnBlur | closeOnEsc | onClose | containerClassName
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Navbar extends js.Object {
    var Brand: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Burger: ForwardRefAsExoticComponent[NavbarBurgerProps, ElementType[_]] = js.native
    var Container: TypeofNavbarContainer = js.native
    var Context: typings.react.mod.Context[NavbarContextValue] = js.native
    var Divider: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Dropdown: ForwardRefAsExoticComponent[NavbarDropdownProps, ElementType[_]] = js.native
    var Item: NoneTAsComponentextendsElContainer = js.native
    var Link: ForwardRefAsExoticComponent[NavbarLinkProps, ElementType[_]] = js.native
    var Menu: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Segment: ForwardRefAsExoticComponent[NavbarSegmentProps, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[PickNavbarContainerPropsf with (Pick[_, String | Double | js.Symbol])]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with PickNavbarContainerPropsf with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            fixed | transparent | active | hidden | document | color | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | managed
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Pagination extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Ellipsis: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Link: ForwardRefAsExoticComponent[PaginationLinkProps, ElementType[_]] = js.native
    var List: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Step: ForwardRefAsExoticComponent[PaginationStepProps, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with PaginationModifiers with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with PaginationModifiers with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | size | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | rounded
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
  @js.native
  object Panel extends js.Object {
    var Block: ForwardRefAsExoticComponent[PanelBlockProps, ElementType[_]] = js.native
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Heading: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Icon: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[_]] = js.native
    var Tab: NoneTAsComponentextendsElDisplayName = js.native
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
  
  @js.native
  object Tab extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Group: ForwardRefAsExoticComponent[TabGroupProps, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TabModifierProps with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: `6`[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with TabModifierProps with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            active | hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
}

