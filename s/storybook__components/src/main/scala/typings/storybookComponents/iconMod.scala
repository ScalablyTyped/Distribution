package typings.storybookComponents

import typings.react.mod.FunctionComponent
import typings.storybookComponents.iconsMod.IconKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@storybook/components/dist/icon/icon", "Icons")
  @js.native
  val Icons: FunctionComponent[IconsProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @emotion/styled-base.@emotion/styled-base.StyledComponent<react.react.SVGProps<std.SVGSVGElement>, @storybook/components.@storybook/components/dist/icon/svg.SvgProps, @storybook/theming.@storybook/theming/dist/types.Theme> extends react.react.JSXElementConstructor<infer P> ? any : @emotion/styled-base.@emotion/styled-base.StyledComponent<react.react.SVGProps<std.SVGSVGElement>, @storybook/components.@storybook/components/dist/icon/svg.SvgProps, @storybook/theming.@storybook/theming/dist/types.Theme> extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ? react.react.<global>.JSX.IntrinsicElements[@emotion/styled-base.@emotion/styled-base.StyledComponent<react.react.SVGProps<std.SVGSVGElement>, @storybook/components.@storybook/components/dist/icon/svg.SvgProps, @storybook/theming.@storybook/theming/dist/types.Theme>] : {} */ trait IconsProps extends StObject {
    
    var icon: IconKey
  }
  object IconsProps {
    
    inline def apply(icon: IconKey): IconsProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconsProps]
    }
    
    extension [Self <: IconsProps](x: Self) {
      
      inline def setIcon(value: IconKey): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
}
