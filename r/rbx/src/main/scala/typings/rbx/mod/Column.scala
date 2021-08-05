package typings.rbx.mod

import typings.rbx.anon.AsElementType
import typings.rbx.anon.ColumnGroupPropsBackgroundColor
import typings.rbx.anon.Desktop
import typings.rbx.anon.Fullhd
import typings.rbx.anon.PickBadgeHelpersPropsFloa
import typings.rbx.columnMod.ColumnBreakpointOptions
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.helpersMod.HelpersPropsOverrides
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
import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.fullhd
import typings.rbx.rbxStrings.hidden
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
import typings.rbx.rbxStrings.marginless
import typings.rbx.rbxStrings.mobile
import typings.rbx.rbxStrings.narrow
import typings.rbx.rbxStrings.offset
import typings.rbx.rbxStrings.overlay
import typings.rbx.rbxStrings.paddingless
import typings.rbx.rbxStrings.pull
import typings.rbx.rbxStrings.radiusless
import typings.rbx.rbxStrings.relative
import typings.rbx.rbxStrings.responsive
import typings.rbx.rbxStrings.shadowless
import typings.rbx.rbxStrings.size
import typings.rbx.rbxStrings.srOnly
import typings.rbx.rbxStrings.tablet
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
import typings.rbx.rbxStrings.touch
import typings.rbx.rbxStrings.unselectable
import typings.rbx.rbxStrings.widescreen
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as :TAsComponent | undefined,   touch :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   mobile :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   tablet :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   desktop :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   widescreen :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   fullhd :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined} & rbx.rbx/base/helpers.HelpersPropsOverrides & std.Pick<rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}, 'hidden' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly'> & rbx.rbx/grid/columns/column.ColumnBreakpointOptions & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'hidden' | 'overlay' | 'size' | 'italic' | 'relative' | 'tooltip' | 'touch' | 'as' | 'mobile' | 'tablet' | 'desktop' | 'widescreen' | 'fullhd' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'narrow' | 'offset'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :react.react.ElementType<any>} & std.Partial<rbx.rbx/base/helpers.HelpersPropsOverrides & std.Pick<rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}, 'hidden' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly'> & {  touch :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   mobile :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   tablet :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   desktop :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   widescreen :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined,   fullhd :rbx.rbx/grid/columns/column.ColumnBreakpointOptions | undefined} & rbx.rbx/grid/columns/column.ColumnBreakpointOptions & std.Pick<any, string | number | symbol>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Group :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/grid/columns/column-group.ColumnGroupProps, react.react.ElementType<any>>} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'> */
object Column {
  
  inline def apply[TAsComponent /* <: ElementType[js.Any] */](
    props: Desktop[TAsComponent] & HelpersPropsOverrides & PickBadgeHelpersPropsFloa & ColumnBreakpointOptions & (Pick[
      ComponentProps[TAsComponent], 
      Exclude[
        /* keyof react.react.ComponentProps<TAsComponent> */ String, 
        hidden | overlay | size | italic | relative | tooltip | touch | as | mobile | tablet | desktop | widescreen | fullhd | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | narrow | offset
      ]
    ]) & (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
  ): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("rbx", "Column")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rbx", "Column.Group")
  @js.native
  def Group: ForwardRefAsExoticComponent[ColumnGroupPropsBackgroundColor, ElementType[js.Any]] = js.native
  inline def Group_=(x: ForwardRefAsExoticComponent[ColumnGroupPropsBackgroundColor, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Column.defaultProps")
  @js.native
  def defaultProps: AsElementType & (Partial[
    HelpersPropsOverrides & PickBadgeHelpersPropsFloa & Fullhd & ColumnBreakpointOptions & (Pick[js.Any, String | Double | js.Symbol])
  ]) = js.native
  inline def defaultProps_=(
    x: AsElementType & (Partial[
      HelpersPropsOverrides & PickBadgeHelpersPropsFloa & Fullhd & ColumnBreakpointOptions & (Pick[js.Any, String | Double | js.Symbol])
    ])
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Column.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("rbx", "Column.$$typeof")
  @js.native
  def typeof: js.Symbol = js.native
  
  inline def typeof_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(x.asInstanceOf[js.Any])
  
  /* Inlined react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}> */
  object propTypes
}
