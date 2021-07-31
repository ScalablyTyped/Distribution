package typings.rbx.mod

import typings.rbx.anon.AsElementType
import typings.rbx.anon.NoneTAsComponentextendsElContainer
import typings.rbx.anon.PickNavbarContainerPropsf
import typings.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typings.rbx.anon.TypeofNavbarContainer
import typings.rbx.anon.`6`
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.navbarBurgerMod.NavbarBurgerProps
import typings.rbx.navbarContainerMod.NavbarContainer
import typings.rbx.navbarContainerMod.NavbarContainerProps
import typings.rbx.navbarContextMod.NavbarContextValue
import typings.rbx.navbarDropdownMod.NavbarDropdownProps
import typings.rbx.navbarLinkMod.NavbarLinkProps
import typings.rbx.navbarSegmentMod.NavbarSegmentProps
import typings.rbx.rbxStrings.active
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
import typings.rbx.rbxStrings.color
import typings.rbx.rbxStrings.document
import typings.rbx.rbxStrings.fixed
import typings.rbx.rbxStrings.hidden
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
import typings.rbx.rbxStrings.transparent
import typings.rbx.rbxStrings.unselectable
import typings.react.mod.ComponentProps
import typings.react.mod.Context
import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as :TAsComponent | undefined} & std.Pick<rbx.rbx/components/navbar/navbar-container.NavbarContainerProps, 'fixed' | 'transparent' | 'active' | 'hidden' | 'document' | 'color' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'managed'> & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'fixed' | 'transparent' | 'active' | 'hidden' | 'document' | 'color' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'as' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'managed'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :react.react.ElementType<any>} & std.Partial<std.Pick<rbx.rbx/components/navbar/navbar-container.NavbarContainerProps, 'fixed' | 'transparent' | 'active' | 'hidden' | 'document' | 'color' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'managed'> & std.Pick<any, string | number | symbol>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Brand :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Burger :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-burger.NavbarBurgerProps, react.react.ElementType<any>>,   Container :{  defaultProps :{  transparent :boolean},   displayName :string, new (props : rbx.rbx/components/navbar/navbar-container.NavbarContainerProps): rbx.rbx/components/navbar/navbar-container.NavbarContainer},   Context :react.react.Context<rbx.rbx/components/navbar/navbar-context.NavbarContextValue>,   Divider :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Dropdown :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-dropdown.NavbarDropdownProps, react.react.ElementType<any>>,   Item :{None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as :TAsComponent | undefined} & std.Pick<rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainerProps, 'active' | 'hidden' | 'up' | 'overlay' | 'expanded' | 'italic' | 'relative' | 'tab' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'hoverable' | 'managed' | 'dropdown' | 'onClick'> & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'active' | 'hidden' | 'up' | 'overlay' | 'expanded' | 'italic' | 'relative' | 'tab' | 'tooltip' | 'as' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'hoverable' | 'managed' | 'dropdown' | 'onClick'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :react.react.ElementType<any>} & std.Partial<std.Pick<rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainerProps, 'active' | 'hidden' | 'up' | 'overlay' | 'expanded' | 'italic' | 'relative' | 'tab' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'hoverable' | 'managed' | 'dropdown' | 'onClick'> & std.Pick<any, string | number | symbol>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Container :{  displayName :string, new (props : rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainerProps): rbx.rbx/components/navbar/navbar-item-container.NavbarItemContainer}} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'>,   Link :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-link.NavbarLinkProps, react.react.ElementType<any>>,   Menu :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Segment :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/navbar/navbar-segment.NavbarSegmentProps, react.react.ElementType<any>>} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'> */
object Navbar {
  
  @scala.inline
  def apply[TAsComponent /* <: ElementType[js.Any] */](
    props: `6`[TAsComponent] & PickNavbarContainerPropsf & (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        fixed | transparent | active | hidden | document | color | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | managed
      ]
    ]) & (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("rbx", "Navbar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rbx", "Navbar.Brand")
  @js.native
  def Brand: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]] = js.native
  @scala.inline
  def Brand_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brand")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Burger")
  @js.native
  def Burger: ForwardRefAsExoticComponent[NavbarBurgerProps, ElementType[js.Any]] = js.native
  @scala.inline
  def Burger_=(x: ForwardRefAsExoticComponent[NavbarBurgerProps, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Burger")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rbx", "Navbar.Container")
  @js.native
  class Container protected () extends NavbarContainer {
    def this(props: NavbarContainerProps) = this()
  }
  @JSImport("rbx", "Navbar.Container")
  @js.native
  def Container: TypeofNavbarContainer = js.native
  @scala.inline
  def Container_=(x: TypeofNavbarContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Container")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Context")
  @js.native
  def Context: typings.react.mod.Context[NavbarContextValue] = js.native
  @scala.inline
  def Context_=(x: Context[NavbarContextValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Context")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Divider")
  @js.native
  def Divider: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]] = js.native
  @scala.inline
  def Divider_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Dropdown")
  @js.native
  def Dropdown: ForwardRefAsExoticComponent[NavbarDropdownProps, ElementType[js.Any]] = js.native
  @scala.inline
  def Dropdown_=(x: ForwardRefAsExoticComponent[NavbarDropdownProps, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dropdown")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Item")
  @js.native
  def Item: NoneTAsComponentextendsElContainer = js.native
  @scala.inline
  def Item_=(x: NoneTAsComponentextendsElContainer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Link")
  @js.native
  def Link: ForwardRefAsExoticComponent[NavbarLinkProps, ElementType[js.Any]] = js.native
  @scala.inline
  def Link_=(x: ForwardRefAsExoticComponent[NavbarLinkProps, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Menu")
  @js.native
  def Menu: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]] = js.native
  @scala.inline
  def Menu_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.Segment")
  @js.native
  def Segment: ForwardRefAsExoticComponent[NavbarSegmentProps, ElementType[js.Any]] = js.native
  @scala.inline
  def Segment_=(x: ForwardRefAsExoticComponent[NavbarSegmentProps, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Segment")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.defaultProps")
  @js.native
  def defaultProps: AsElementType & (Partial[PickNavbarContainerPropsf & (Pick[js.Any, String | Double | js.Symbol])]) = js.native
  @scala.inline
  def defaultProps_=(
    x: AsElementType & (Partial[PickNavbarContainerPropsf & (Pick[js.Any, String | Double | js.Symbol])])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Navbar.$$typeof")
  @js.native
  def typeof: js.Symbol = js.native
  
  @scala.inline
  def typeof_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(x.asInstanceOf[js.Any])
  
  /* Inlined react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}> */
  object propTypes
}
