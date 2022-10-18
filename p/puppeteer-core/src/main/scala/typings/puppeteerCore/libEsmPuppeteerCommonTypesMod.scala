package typings.puppeteerCore

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonTypesMod {
  
  type Awaitable[T] = T | PromiseLike[T]
  
  type EvaluateFunc[T /* <: js.Array[Any] */] = js.Function1[/* params */ InnerParams[T], Awaitable[Any]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/types.HandleOr<infer U> ? U : never
    }}}
    */
  @js.native
  trait FlattenHandle[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/LazyArg.LazyArg<infer U> ? U : T
    }}}
    */
  @js.native
  trait FlattenLazyArg[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Node ? puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/ElementHandle.ElementHandle<T> : puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/JSHandle.JSHandle<T>
    }}}
    */
  @js.native
  trait HandleFor[T]
    extends StObject
       with _HandleOr[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.libEsmPuppeteerCommonTypesMod.HandleFor[T]
    - typings.puppeteerCore.libEsmPuppeteerCommonJshandleMod.JSHandle[T]
    - T
  */
  type HandleOr[T] = _HandleOr[T] | T
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/types.FlattenLazyArg<T[K]>}
    }}}
    */
  @js.native
  trait InnerLazyParams[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: puppeteer-core.puppeteer-core/lib/esm/puppeteer/common/types.FlattenHandle<T[K]>}
    }}}
    */
  @js.native
  trait InnerParams[T /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Selector extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ? std.HTMLElementTagNameMap[Selector] : Selector extends 'a' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'script' | 'set' | 'stop' | 'style' | 'svg' | 'switch' | 'symbol' | 'text' | 'textPath' | 'title' | 'tspan' | 'use' | 'view' ? std.SVGElementTagNameMap[Selector] : std.Element
    }}}
    */
  @js.native
  trait NodeFor[Selector /* <: String */] extends StObject
  
  trait _HandleOr[T] extends StObject
}
