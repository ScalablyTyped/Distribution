package typings.rbx

import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.helpersMod.HelpersPropsOverrides
import typings.rbx.menuListItemMod.MenuListItemProps
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
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
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

/* Inlined {None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as ? :TAsComponent | undefined} & rbx.rbx/base/helpers.HelpersPropsOverrides & std.Pick<rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className ? :string | undefined}, 'hidden' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly'> & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'hidden' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'as' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react._Global_.JSX.Element | null,   defaultProps  :{  as  :react.react.ElementType<any>} & std.Partial<rbx.rbx/base/helpers.HelpersPropsOverrides & std.Pick<rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className ? :string | undefined}, 'hidden' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly'> & std.Pick<any, string | number | symbol>>,   displayName  :string,   propTypes  :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Item  :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/components/menu/menu-list-item.MenuListItemProps, react.react.ElementType<any>>} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'> */
@js.native
trait NoneTAsComponentextendsElDefaultProps extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol = js.native
  var Item: ForwardRefAsExoticComponent[MenuListItemProps, ElementType[_]] = js.native
  var defaultProps: AnonAsElementType with (Partial[
    HelpersPropsOverrides with PickBadgeHelpersPropsFloaBackgroundColor with (Pick[_, String | Double | js.Symbol])
  ]) = js.native
  var displayName: js.UndefOr[String] = js.native
  def apply[TAsComponent /* <: ElementType[_] */](
    props: Anon7[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloaBackgroundColor with (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        hidden | overlay | italic | relative | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly
      ]
    ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Element | Null = js.native
}

