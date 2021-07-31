package typings.rbx

import typings.rbx.anon.AsElementType
import typings.rbx.anon.BinVariablesbreakpointsLi
import typings.rbx.anon.KinVariablesbreakpointsto
import typings.rbx.anon.PickBadgeHelpersPropsFloa
import typings.rbx.anon.PreferHelpersPropsOverridBackgroundColor
import typings.rbx.anon.`6`
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.fieldLabelMod.FieldLabelProps
import typings.rbx.helpersMod.HelpersPropsOverrides
import typings.rbx.rbxNumbers.`1`
import typings.rbx.rbxNumbers.`2`
import typings.rbx.rbxNumbers.`3`
import typings.rbx.rbxNumbers.`4`
import typings.rbx.rbxNumbers.`5`
import typings.rbx.rbxNumbers.`7`
import typings.rbx.rbxStrings.`black-bis`
import typings.rbx.rbxStrings.`black-ter`
import typings.rbx.rbxStrings.`grey-dark`
import typings.rbx.rbxStrings.`grey-darker`
import typings.rbx.rbxStrings.`grey-light`
import typings.rbx.rbxStrings.`grey-lighter`
import typings.rbx.rbxStrings.`white-bis`
import typings.rbx.rbxStrings.`white-ter`
import typings.rbx.rbxStrings.addons
import typings.rbx.rbxStrings.align
import typings.rbx.rbxStrings.as
import typings.rbx.rbxStrings.backgroundColor
import typings.rbx.rbxStrings.badge
import typings.rbx.rbxStrings.badgeColor
import typings.rbx.rbxStrings.badgeOutlined
import typings.rbx.rbxStrings.badgeRounded
import typings.rbx.rbxStrings.badgeSize
import typings.rbx.rbxStrings.black
import typings.rbx.rbxStrings.bold
import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.capitalized
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.className
import typings.rbx.rbxStrings.clearfix
import typings.rbx.rbxStrings.clipped
import typings.rbx.rbxStrings.danger
import typings.rbx.rbxStrings.dark
import typings.rbx.rbxStrings.expanded
import typings.rbx.rbxStrings.grey
import typings.rbx.rbxStrings.group
import typings.rbx.rbxStrings.hidden
import typings.rbx.rbxStrings.horizontal
import typings.rbx.rbxStrings.info
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.kind
import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.light
import typings.rbx.rbxStrings.link
import typings.rbx.rbxStrings.lowercase
import typings.rbx.rbxStrings.marginless
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.multiline
import typings.rbx.rbxStrings.narrow
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.overlay
import typings.rbx.rbxStrings.paddingless
import typings.rbx.rbxStrings.primary
import typings.rbx.rbxStrings.pull
import typings.rbx.rbxStrings.radiusless
import typings.rbx.rbxStrings.relative
import typings.rbx.rbxStrings.responsive
import typings.rbx.rbxStrings.right
import typings.rbx.rbxStrings.semibold
import typings.rbx.rbxStrings.shadowless
import typings.rbx.rbxStrings.small
import typings.rbx.rbxStrings.srOnly
import typings.rbx.rbxStrings.success
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
import typings.rbx.rbxStrings.top
import typings.rbx.rbxStrings.unselectable
import typings.rbx.rbxStrings.uppercase
import typings.rbx.rbxStrings.warning
import typings.rbx.rbxStrings.white
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

object fieldMod {
  
  object FIELD_DEFAULTS {
    
    @JSImport("rbx/elements/form/field", "FIELD_DEFAULTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/elements/form/field", "FIELD_DEFAULTS.alignments")
    @js.native
    def alignments: js.Tuple2[centered, right] = js.native
    @scala.inline
    def alignments_=(x: js.Tuple2[centered, right]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignments")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/elements/form/field", "FIELD_DEFAULTS.kinds")
    @js.native
    def kinds: js.Tuple2[addons, group] = js.native
    @scala.inline
    def kinds_=(x: js.Tuple2[addons, group]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("kinds")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {None <TAsComponent extends react.react.ElementType<any> = react.react.ElementType<any>>(props : {  as :TAsComponent | undefined} & rbx.rbx/base/helpers.HelpersPropsOverrides & std.Pick<rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}, 'hidden' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly'> & rbx.rbx/elements/form/field.FieldModifierProps & std.Pick<react.react.ComponentProps<TAsComponent>, std.Exclude<keyof react.react.ComponentProps<TAsComponent>, 'hidden' | 'overlay' | 'expanded' | 'italic' | 'relative' | 'horizontal' | 'tooltip' | 'as' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly' | 'align' | 'kind' | 'multiline' | 'narrow'>> & react.react.RefAttributes<TAsComponent extends 'symbol' | 'object' | 'big' | 'link' | 'small' | 'sub' | 'sup' | 'track' | 'progress' | 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'source' | 'span' | 'strong' | 'style' | 'summary' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'svg' | 'switch' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' | 'menuitem' | 'keygen' | 'noindex' | 'webview' | 'animate' | 'animateMotion' | 'animateTransform' | 'feDropShadow' | 'mpath' ? rbx.rbx/base/exotic.FromReactType<TAsComponent> : TAsComponent>): react.react.<global>.JSX.Element | null,   defaultProps :{  as :react.react.ElementType<any>} & std.Partial<rbx.rbx/base/helpers.HelpersPropsOverrides & std.Pick<rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}, 'hidden' | 'overlay' | 'italic' | 'relative' | 'tooltip' | 'className' | 'badge' | 'badgeColor' | 'badgeOutlined' | 'badgeRounded' | 'badgeSize' | 'clearfix' | 'pull' | 'marginless' | 'paddingless' | 'radiusless' | 'shadowless' | 'unselectable' | 'clipped' | 'responsive' | 'textAlign' | 'textSize' | 'tooltipActive' | 'tooltipColor' | 'tooltipMultiline' | 'tooltipPosition' | 'tooltipResponsive' | 'backgroundColor' | 'textColor' | 'textTransform' | 'textWeight' | 'invisible' | 'srOnly'> & rbx.rbx/elements/form/field.FieldModifierProps & std.Pick<any, string | number | symbol>>,   displayName :string,   propTypes :react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}>,   Body :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/types.Prefer<rbx.rbx/base/helpers.HelpersPropsOverrides, rbx.rbx/base/helpers/badge.BadgeHelpersProps & rbx.rbx/base/helpers/float.FloatHelpersProps & rbx.rbx/base/helpers/overflow.OverflowHelpersProps & rbx.rbx/base/helpers/overlay.OverlayHelpersProps & rbx.rbx/base/helpers/tooltip.TooltipHelpersProps & rbx.rbx/base/helpers/typography.TypographyHelpersProps & rbx.rbx/base/helpers/visibility.VisibilityHelpersProps & rbx.rbx/base/helpers/other.OtherHelpersProps & rbx.rbx/base/helpers/responsive.ResponsiveHelpersProps & {  className :string | undefined}>, react.react.ElementType<any>>,   Label :rbx.rbx/base/exotic.ForwardRefAsExoticComponent<rbx.rbx/elements/form/field-label.FieldLabelProps, react.react.ElementType<any>>} & std.Pick<react.react.ForwardRefExoticComponent<react.react.ElementType<any>>, 'displayName' | '$$typeof'> */
  object Field {
    
    @scala.inline
    def apply[TAsComponent /* <: ElementType[js.Any] */](
      props: `6`[TAsComponent] & HelpersPropsOverrides & PickBadgeHelpersPropsFloa & FieldModifierProps & (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | expanded | italic | relative | horizontal | tooltip | as | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | align | kind | multiline | narrow
          ]
        ]) & (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("rbx/elements/form/field", "Field")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rbx/elements/form/field", "Field.Body")
    @js.native
    def Body: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]] = js.native
    @scala.inline
    def Body_=(x: ForwardRefAsExoticComponent[PreferHelpersPropsOverridBackgroundColor, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/elements/form/field", "Field.Label")
    @js.native
    def Label: ForwardRefAsExoticComponent[FieldLabelProps, ElementType[js.Any]] = js.native
    @scala.inline
    def Label_=(x: ForwardRefAsExoticComponent[FieldLabelProps, ElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Label")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/elements/form/field", "Field.defaultProps")
    @js.native
    def defaultProps: AsElementType & (Partial[
        HelpersPropsOverrides & PickBadgeHelpersPropsFloa & FieldModifierProps & (Pick[js.Any, String | Double | js.Symbol])
      ]) = js.native
    @scala.inline
    def defaultProps_=(
      x: AsElementType & (Partial[
          HelpersPropsOverrides & PickBadgeHelpersPropsFloa & FieldModifierProps & (Pick[js.Any, String | Double | js.Symbol])
        ])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/elements/form/field", "Field.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("rbx/elements/form/field", "Field.$$typeof")
    @js.native
    def typeof: js.Symbol = js.native
    
    @scala.inline
    def typeof_=(x: js.Symbol): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$$typeof")(x.asInstanceOf[js.Any])
    
    /* Inlined react.react.WeakValidationMap<{[x: string] : any, [x: number] : any}> */
    object propTypes
  }
  
  trait FieldModifierProps extends StObject {
    
    var align: js.UndefOr[centered | right] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var kind: js.UndefOr[addons | group] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var narrow: js.UndefOr[Boolean] = js.undefined
  }
  object FieldModifierProps {
    
    @scala.inline
    def apply(): FieldModifierProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldModifierProps]
    }
    
    @scala.inline
    implicit class FieldModifierPropsMutableBuilder[Self <: FieldModifierProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: centered | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setKind(value: addons | group): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setNarrow(value: Boolean): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/base/helpers.HelpersProps & rbx.rbx/elements/form/field.FieldModifierProps */
  trait FieldProps extends StObject {
    
    var align: js.UndefOr[centered | right] = js.undefined
    
    var backgroundColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.undefined
    
    var badge: js.UndefOr[Double | String] = js.undefined
    
    var badgeColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var badgeOutlined: js.UndefOr[Boolean] = js.undefined
    
    var badgeRounded: js.UndefOr[Boolean] = js.undefined
    
    var badgeSize: js.UndefOr[small | medium | large] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearfix: js.UndefOr[Boolean] = js.undefined
    
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var invisible: js.UndefOr[Boolean] = js.undefined
    
    var italic: js.UndefOr[Boolean] = js.undefined
    
    var kind: js.UndefOr[addons | group] = js.undefined
    
    var marginless: js.UndefOr[Boolean] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var narrow: js.UndefOr[Boolean] = js.undefined
    
    var overlay: js.UndefOr[Boolean] = js.undefined
    
    var paddingless: js.UndefOr[Boolean] = js.undefined
    
    var pull: js.UndefOr[left | right] = js.undefined
    
    var radiusless: js.UndefOr[Boolean] = js.undefined
    
    var relative: js.UndefOr[Boolean] = js.undefined
    
    var responsive: js.UndefOr[BinVariablesbreakpointsLi] = js.undefined
    
    var shadowless: js.UndefOr[Boolean] = js.undefined
    
    var srOnly: js.UndefOr[Boolean] = js.undefined
    
    var textAlign: js.UndefOr[centered | justified | left | right] = js.undefined
    
    var textColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ] = js.undefined
    
    var textSize: js.UndefOr[`1` | `2` | `3` | `4` | `5` | typings.rbx.rbxNumbers.`6` | `7`] = js.undefined
    
    var textTransform: js.UndefOr[capitalized | lowercase | uppercase] = js.undefined
    
    var textWeight: js.UndefOr[light | medium | normal | semibold | bold] = js.undefined
    
    var tooltip: js.UndefOr[Double | String] = js.undefined
    
    var tooltipActive: js.UndefOr[Boolean] = js.undefined
    
    var tooltipColor: js.UndefOr[
        primary | success | info | warning | danger | light | dark | white | black | link
      ] = js.undefined
    
    var tooltipMultiline: js.UndefOr[Boolean] = js.undefined
    
    var tooltipPosition: js.UndefOr[top | right | bottom | left] = js.undefined
    
    var tooltipResponsive: js.UndefOr[KinVariablesbreakpointsto] = js.undefined
    
    var unselectable: js.UndefOr[Boolean] = js.undefined
  }
  object FieldProps {
    
    @scala.inline
    def apply(): FieldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps]
    }
    
    @scala.inline
    implicit class FieldPropsMutableBuilder[Self <: FieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: centered | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBackgroundColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBadge(value: Double | String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "badgeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeColorUndefined: Self = StObject.set(x, "badgeColor", js.undefined)
      
      @scala.inline
      def setBadgeOutlined(value: Boolean): Self = StObject.set(x, "badgeOutlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeOutlinedUndefined: Self = StObject.set(x, "badgeOutlined", js.undefined)
      
      @scala.inline
      def setBadgeRounded(value: Boolean): Self = StObject.set(x, "badgeRounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeRoundedUndefined: Self = StObject.set(x, "badgeRounded", js.undefined)
      
      @scala.inline
      def setBadgeSize(value: small | medium | large): Self = StObject.set(x, "badgeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeSizeUndefined: Self = StObject.set(x, "badgeSize", js.undefined)
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearfix(value: Boolean): Self = StObject.set(x, "clearfix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearfixUndefined: Self = StObject.set(x, "clearfix", js.undefined)
      
      @scala.inline
      def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setKind(value: addons | group): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setMarginless(value: Boolean): Self = StObject.set(x, "marginless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginlessUndefined: Self = StObject.set(x, "marginless", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setNarrow(value: Boolean): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
      
      @scala.inline
      def setOverlay(value: Boolean): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPaddingless(value: Boolean): Self = StObject.set(x, "paddingless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddinglessUndefined: Self = StObject.set(x, "paddingless", js.undefined)
      
      @scala.inline
      def setPull(value: left | right): Self = StObject.set(x, "pull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
      
      @scala.inline
      def setRadiusless(value: Boolean): Self = StObject.set(x, "radiusless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiuslessUndefined: Self = StObject.set(x, "radiusless", js.undefined)
      
      @scala.inline
      def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
      
      @scala.inline
      def setResponsive(value: BinVariablesbreakpointsLi): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setShadowless(value: Boolean): Self = StObject.set(x, "shadowless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowlessUndefined: Self = StObject.set(x, "shadowless", js.undefined)
      
      @scala.inline
      def setSrOnly(value: Boolean): Self = StObject.set(x, "srOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrOnlyUndefined: Self = StObject.set(x, "srOnly", js.undefined)
      
      @scala.inline
      def setTextAlign(value: centered | justified | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextColor(
        value: primary | success | info | warning | danger | light | dark | white | black | link | `black-bis` | `black-ter` | `grey-darker` | `grey-dark` | grey | `grey-light` | `grey-lighter` | `white-ter` | `white-bis`
      ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextSize(value: `1` | `2` | `3` | `4` | `5` | typings.rbx.rbxNumbers.`6` | `7`): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      @scala.inline
      def setTextTransform(value: capitalized | lowercase | uppercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
      
      @scala.inline
      def setTextWeight(value: light | medium | normal | semibold | bold): Self = StObject.set(x, "textWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextWeightUndefined: Self = StObject.set(x, "textWeight", js.undefined)
      
      @scala.inline
      def setTooltip(value: Double | String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActive(value: Boolean): Self = StObject.set(x, "tooltipActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipActiveUndefined: Self = StObject.set(x, "tooltipActive", js.undefined)
      
      @scala.inline
      def setTooltipColor(value: primary | success | info | warning | danger | light | dark | white | black | link): Self = StObject.set(x, "tooltipColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipColorUndefined: Self = StObject.set(x, "tooltipColor", js.undefined)
      
      @scala.inline
      def setTooltipMultiline(value: Boolean): Self = StObject.set(x, "tooltipMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipMultilineUndefined: Self = StObject.set(x, "tooltipMultiline", js.undefined)
      
      @scala.inline
      def setTooltipPosition(value: top | right | bottom | left): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      @scala.inline
      def setTooltipResponsive(value: KinVariablesbreakpointsto): Self = StObject.set(x, "tooltipResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipResponsiveUndefined: Self = StObject.set(x, "tooltipResponsive", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setUnselectable(value: Boolean): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
    }
  }
  
  /* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/field.FieldVariablesOverrides, rbx.rbx/elements/form/field.FieldVariablesDefaults> */
  trait FieldVariables extends StObject {
    
    var alignments: centered | right
    
    var kinds: addons | group
  }
  object FieldVariables {
    
    @scala.inline
    def apply(alignments: centered | right, kinds: addons | group): FieldVariables = {
      val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldVariables]
    }
    
    @scala.inline
    implicit class FieldVariablesMutableBuilder[Self <: FieldVariables] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignments(value: centered | right): Self = StObject.set(x, "alignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinds(value: addons | group): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldVariablesDefaults extends StObject {
    
    var alignments: centered | right
    
    var kinds: addons | group
  }
  object FieldVariablesDefaults {
    
    @scala.inline
    def apply(alignments: centered | right, kinds: addons | group): FieldVariablesDefaults = {
      val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldVariablesDefaults]
    }
    
    @scala.inline
    implicit class FieldVariablesDefaultsMutableBuilder[Self <: FieldVariablesDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignments(value: centered | right): Self = StObject.set(x, "alignments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKinds(value: addons | group): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldVariablesOverrides extends StObject
}
