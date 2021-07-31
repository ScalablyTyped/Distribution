package typings.rax.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    type Element = RaxElement[js.Any, js.Any]
    
    trait ElementAttributesProperty extends StObject
    
    trait ElementChildrenAttribute extends StObject
    
    @js.native
    trait ElementClass
      extends Component[js.Any, js.Object, js.Any]
    
    type IntrinsicAttributes = Attributes
    
    type IntrinsicClassAttributes[T] = ClassAttributes[T]
    
    trait IntrinsicElements extends StObject {
      
      // HTML
      var a: DetailedHTMLProps[AnchorHTMLAttributes[typings.std.HTMLAnchorElement], typings.std.HTMLAnchorElement]
      
      var abbr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var ad: js.Any
      
      var address: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var animate: SVGProps[typings.std.SVGElement]
      
      // TODO: It is SVGAnimateElement but is not in TypeScript's lib.dom.d.ts for now.
      var animateMotion: SVGProps[typings.std.SVGElement]
      
      var animateTransform: SVGProps[typings.std.SVGElement]
      
      var area: DetailedHTMLProps[AreaHTMLAttributes[typings.std.HTMLAreaElement], typings.std.HTMLAreaElement]
      
      var `aria-component`: js.Any
      
      var article: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var aside: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var audio: DetailedHTMLProps[AudioHTMLAttributes[typings.std.HTMLAudioElement], typings.std.HTMLAudioElement]
      
      var b: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var base: DetailedHTMLProps[BaseHTMLAttributes[typings.std.HTMLBaseElement], typings.std.HTMLBaseElement]
      
      var bdi: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var bdo: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var big: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var blockquote: DetailedHTMLProps[BlockquoteHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var body: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLBodyElement], typings.std.HTMLBodyElement]
      
      var br: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLBRElement], typings.std.HTMLBRElement]
      
      var button: DetailedHTMLProps[ButtonHTMLAttributes[typings.std.HTMLButtonElement], typings.std.HTMLButtonElement]
      
      var canvas: DetailedHTMLProps[CanvasHTMLAttributes[typings.std.HTMLCanvasElement], typings.std.HTMLCanvasElement]
      
      var caption: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var cell: js.Any
      
      // TODO: It is SVGAnimateTransformElement but is not in TypeScript's lib.dom.d.ts for now.
      var circle: SVGProps[typings.std.SVGCircleElement]
      
      var cite: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var clipPath: SVGProps[typings.std.SVGClipPathElement]
      
      var code: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var col: DetailedHTMLProps[
            ColHTMLAttributes[typings.std.HTMLTableColElement], 
            typings.std.HTMLTableColElement
          ]
      
      var colgroup: DetailedHTMLProps[
            ColgroupHTMLAttributes[typings.std.HTMLTableColElement], 
            typings.std.HTMLTableColElement
          ]
      
      var `contact-button`: js.Any
      
      var `cover-image`: js.Any
      
      var `cover-view`: js.Any
      
      var data: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var datalist: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDataListElement], typings.std.HTMLDataListElement]
      
      var dd: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var defs: SVGProps[typings.std.SVGDefsElement]
      
      var del: DetailedHTMLProps[DelHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var desc: SVGProps[typings.std.SVGDescElement]
      
      var details: DetailedHTMLProps[DetailsHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var dfn: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var dialog: DetailedHTMLProps[DialogHTMLAttributes[typings.std.HTMLDialogElement], typings.std.HTMLDialogElement]
      
      var div: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDivElement], typings.std.HTMLDivElement]
      
      var dl: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDListElement], typings.std.HTMLDListElement]
      
      var dt: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var ellipse: SVGProps[typings.std.SVGEllipseElement]
      
      var em: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var embed: DetailedHTMLProps[EmbedHTMLAttributes[typings.std.HTMLEmbedElement], typings.std.HTMLEmbedElement]
      
      var feBlend: SVGProps[typings.std.SVGFEBlendElement]
      
      var feColorMatrix: SVGProps[typings.std.SVGFEColorMatrixElement]
      
      var feComponentTransfer: SVGProps[typings.std.SVGFEComponentTransferElement]
      
      var feComposite: SVGProps[typings.std.SVGFECompositeElement]
      
      var feConvolveMatrix: SVGProps[typings.std.SVGFEConvolveMatrixElement]
      
      var feDiffuseLighting: SVGProps[typings.std.SVGFEDiffuseLightingElement]
      
      var feDisplacementMap: SVGProps[typings.std.SVGFEDisplacementMapElement]
      
      var feDistantLight: SVGProps[typings.std.SVGFEDistantLightElement]
      
      var feDropShadow: SVGProps[typings.std.SVGFEDropShadowElement]
      
      var feFlood: SVGProps[typings.std.SVGFEFloodElement]
      
      var feFuncA: SVGProps[typings.std.SVGFEFuncAElement]
      
      var feFuncB: SVGProps[typings.std.SVGFEFuncBElement]
      
      var feFuncG: SVGProps[typings.std.SVGFEFuncGElement]
      
      var feFuncR: SVGProps[typings.std.SVGFEFuncRElement]
      
      var feGaussianBlur: SVGProps[typings.std.SVGFEGaussianBlurElement]
      
      var feImage: SVGProps[typings.std.SVGFEImageElement]
      
      var feMerge: SVGProps[typings.std.SVGFEMergeElement]
      
      var feMergeNode: SVGProps[typings.std.SVGFEMergeNodeElement]
      
      var feMorphology: SVGProps[typings.std.SVGFEMorphologyElement]
      
      var feOffset: SVGProps[typings.std.SVGFEOffsetElement]
      
      var fePointLight: SVGProps[typings.std.SVGFEPointLightElement]
      
      var feSpecularLighting: SVGProps[typings.std.SVGFESpecularLightingElement]
      
      var feSpotLight: SVGProps[typings.std.SVGFESpotLightElement]
      
      var feTile: SVGProps[typings.std.SVGFETileElement]
      
      var feTurbulence: SVGProps[typings.std.SVGFETurbulenceElement]
      
      var fieldset: DetailedHTMLProps[
            FieldsetHTMLAttributes[typings.std.HTMLFieldSetElement], 
            typings.std.HTMLFieldSetElement
          ]
      
      var figcaption: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var figure: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var filter: SVGProps[typings.std.SVGFilterElement]
      
      var footer: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var foreignObject: SVGProps[typings.std.SVGForeignObjectElement]
      
      var form: DetailedHTMLProps[FormHTMLAttributes[typings.std.HTMLFormElement], typings.std.HTMLFormElement]
      
      var `functional-page-navigator`: js.Any
      
      var g: SVGProps[typings.std.SVGGElement]
      
      var h1: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
      
      var h2: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
      
      var h3: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
      
      var h4: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
      
      var h5: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
      
      var h6: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
      
      var head: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadElement], typings.std.HTMLHeadElement]
      
      var header: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var hgroup: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var hr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHRElement], typings.std.HTMLHRElement]
      
      var html: DetailedHTMLProps[HtmlHTMLAttributes[typings.std.HTMLHtmlElement], typings.std.HTMLHtmlElement]
      
      var i: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var icon: js.Any
      
      var iframe: DetailedHTMLProps[IframeHTMLAttributes[typings.std.HTMLIFrameElement], typings.std.HTMLIFrameElement]
      
      var image: SVGProps[typings.std.SVGImageElement]
      
      var img: DetailedHTMLProps[ImgHTMLAttributes[typings.std.HTMLImageElement], typings.std.HTMLImageElement]
      
      var indicator: js.Any
      
      var input: DetailedHTMLProps[InputHTMLAttributes[typings.std.HTMLInputElement], typings.std.HTMLInputElement]
      
      var ins: DetailedHTMLProps[InsHTMLAttributes[typings.std.HTMLModElement], typings.std.HTMLModElement]
      
      var `ive-pusher`: js.Any
      
      var kbd: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var keygen: DetailedHTMLProps[KeygenHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var label: DetailedHTMLProps[LabelHTMLAttributes[typings.std.HTMLLabelElement], typings.std.HTMLLabelElement]
      
      var legend: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLLegendElement], typings.std.HTMLLegendElement]
      
      var li: DetailedHTMLProps[LiHTMLAttributes[typings.std.HTMLLIElement], typings.std.HTMLLIElement]
      
      var lifestyle: js.Any
      
      var line: SVGProps[typings.std.SVGLineElement]
      
      var linearGradient: SVGProps[typings.std.SVGLinearGradientElement]
      
      var link: DetailedHTMLProps[LinkHTMLAttributes[typings.std.HTMLLinkElement], typings.std.HTMLLinkElement]
      
      // weex
      var list: js.Any
      
      var `live-player`: js.Any
      
      var loading: js.Any
      
      var main: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var map: DetailedHTMLProps[MapHTMLAttributes[typings.std.HTMLMapElement], typings.std.HTMLMapElement]
      
      var mark: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var marker: SVGProps[typings.std.SVGMarkerElement]
      
      var mask: SVGProps[typings.std.SVGMaskElement]
      
      var menu: DetailedHTMLProps[MenuHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var menuitem: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var meta: DetailedHTMLProps[MetaHTMLAttributes[typings.std.HTMLMetaElement], typings.std.HTMLMetaElement]
      
      var metadata: SVGProps[typings.std.SVGMetadataElement]
      
      var meter: DetailedHTMLProps[MeterHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var `movable-area`: js.Any
      
      var `movable-view`: js.Any
      
      var mpath: SVGProps[typings.std.SVGElement]
      
      var nav: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var `navigation-bar`: js.Any
      
      var navigator: js.Any
      
      var noindex: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var noscript: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var `object`: DetailedHTMLProps[ObjectHTMLAttributes[typings.std.HTMLObjectElement], typings.std.HTMLObjectElement]
      
      var ol: DetailedHTMLProps[OlHTMLAttributes[typings.std.HTMLOListElement], typings.std.HTMLOListElement]
      
      var `open-data`: js.Any
      
      var optgroup: DetailedHTMLProps[
            OptgroupHTMLAttributes[typings.std.HTMLOptGroupElement], 
            typings.std.HTMLOptGroupElement
          ]
      
      var option: DetailedHTMLProps[OptionHTMLAttributes[typings.std.HTMLOptionElement], typings.std.HTMLOptionElement]
      
      var output: DetailedHTMLProps[OutputHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var p: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLParagraphElement], typings.std.HTMLParagraphElement]
      
      var `page-meta`: js.Any
      
      var param: DetailedHTMLProps[ParamHTMLAttributes[typings.std.HTMLParamElement], typings.std.HTMLParamElement]
      
      var path: SVGProps[typings.std.SVGPathElement]
      
      var pattern: SVGProps[typings.std.SVGPatternElement]
      
      var picker: js.Any
      
      var `picker-view`: js.Any
      
      var picture: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var polygon: SVGProps[typings.std.SVGPolygonElement]
      
      var polyline: SVGProps[typings.std.SVGPolylineElement]
      
      var pre: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLPreElement], typings.std.HTMLPreElement]
      
      var progress: DetailedHTMLProps[
            ProgressHTMLAttributes[typings.std.HTMLProgressElement], 
            typings.std.HTMLProgressElement
          ]
      
      var q: DetailedHTMLProps[QuoteHTMLAttributes[typings.std.HTMLQuoteElement], typings.std.HTMLQuoteElement]
      
      var radialGradient: SVGProps[typings.std.SVGRadialGradientElement]
      
      var rect: SVGProps[typings.std.SVGRectElement]
      
      var `recycle-list`: js.Any
      
      var refresh: js.Any
      
      var `rich-text`: js.Any
      
      var richtext: js.Any
      
      var rp: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var rt: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var ruby: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var s: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var samp: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var script: DetailedHTMLProps[ScriptHTMLAttributes[typings.std.HTMLScriptElement], typings.std.HTMLScriptElement]
      
      var `scroll-view`: js.Any
      
      var scroller: js.Any
      
      var section: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var select: DetailedHTMLProps[SelectHTMLAttributes[typings.std.HTMLSelectElement], typings.std.HTMLSelectElement]
      
      var slider: js.Any
      
      // MiniApp
      var slot: js.Any
      
      var small: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var source: DetailedHTMLProps[SourceHTMLAttributes[typings.std.HTMLSourceElement], typings.std.HTMLSourceElement]
      
      var span: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLSpanElement], typings.std.HTMLSpanElement]
      
      var stop: SVGProps[typings.std.SVGStopElement]
      
      var strong: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var style: DetailedHTMLProps[StyleHTMLAttributes[typings.std.HTMLStyleElement], typings.std.HTMLStyleElement]
      
      var sub: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var summary: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var sup: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      // SVG
      var svg: SVGProps[typings.std.SVGSVGElement]
      
      var swiper: js.Any
      
      var `swiper-item`: js.Any
      
      var switch: SVGProps[typings.std.SVGSwitchElement]
      
      var symbol: SVGProps[typings.std.SVGSymbolElement]
      
      var table: DetailedHTMLProps[TableHTMLAttributes[typings.std.HTMLTableElement], typings.std.HTMLTableElement]
      
      var tbody: DetailedHTMLProps[
            HTMLAttributes[typings.std.HTMLTableSectionElement], 
            typings.std.HTMLTableSectionElement
          ]
      
      var td: DetailedHTMLProps[
            TdHTMLAttributes[typings.std.HTMLTableDataCellElement], 
            typings.std.HTMLTableDataCellElement
          ]
      
      var text: SVGProps[typings.std.SVGTextElement]
      
      var textPath: SVGProps[typings.std.SVGTextPathElement]
      
      var textarea: DetailedHTMLProps[
            TextareaHTMLAttributes[typings.std.HTMLTextAreaElement], 
            typings.std.HTMLTextAreaElement
          ]
      
      var tfoot: DetailedHTMLProps[
            HTMLAttributes[typings.std.HTMLTableSectionElement], 
            typings.std.HTMLTableSectionElement
          ]
      
      var th: DetailedHTMLProps[
            ThHTMLAttributes[typings.std.HTMLTableHeaderCellElement], 
            typings.std.HTMLTableHeaderCellElement
          ]
      
      var thead: DetailedHTMLProps[
            HTMLAttributes[typings.std.HTMLTableSectionElement], 
            typings.std.HTMLTableSectionElement
          ]
      
      var time: DetailedHTMLProps[TimeHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var title: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLTitleElement], typings.std.HTMLTitleElement]
      
      var tr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLTableRowElement], typings.std.HTMLTableRowElement]
      
      var track: DetailedHTMLProps[TrackHTMLAttributes[typings.std.HTMLTrackElement], typings.std.HTMLTrackElement]
      
      var tspan: SVGProps[typings.std.SVGTSpanElement]
      
      var u: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var ul: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLUListElement], typings.std.HTMLUListElement]
      
      var use: SVGProps[typings.std.SVGUseElement]
      
      var `var`: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var video: DetailedHTMLProps[VideoHTMLAttributes[typings.std.HTMLVideoElement], typings.std.HTMLVideoElement]
      
      var view: SVGProps[typings.std.SVGViewElement]
      
      var waterfall: js.Any
      
      var wbr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
      
      var web: js.Any
      
      var `web-view`: js.Any
      
      var webview: DetailedHTMLProps[
            WebViewHTMLAttributes[typings.rax.HTMLWebViewElement], 
            typings.rax.HTMLWebViewElement
          ]
    }
    object IntrinsicElements {
      
      @scala.inline
      def apply(
        a: DetailedHTMLProps[AnchorHTMLAttributes[typings.std.HTMLAnchorElement], typings.std.HTMLAnchorElement],
        abbr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        ad: js.Any,
        address: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        animate: SVGProps[typings.std.SVGElement],
        animateMotion: SVGProps[typings.std.SVGElement],
        animateTransform: SVGProps[typings.std.SVGElement],
        area: DetailedHTMLProps[AreaHTMLAttributes[typings.std.HTMLAreaElement], typings.std.HTMLAreaElement],
        `aria-component`: js.Any,
        article: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        aside: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        audio: DetailedHTMLProps[AudioHTMLAttributes[typings.std.HTMLAudioElement], typings.std.HTMLAudioElement],
        b: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        base: DetailedHTMLProps[BaseHTMLAttributes[typings.std.HTMLBaseElement], typings.std.HTMLBaseElement],
        bdi: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        bdo: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        big: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        blockquote: DetailedHTMLProps[BlockquoteHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        body: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLBodyElement], typings.std.HTMLBodyElement],
        br: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLBRElement], typings.std.HTMLBRElement],
        button: DetailedHTMLProps[ButtonHTMLAttributes[typings.std.HTMLButtonElement], typings.std.HTMLButtonElement],
        canvas: DetailedHTMLProps[CanvasHTMLAttributes[typings.std.HTMLCanvasElement], typings.std.HTMLCanvasElement],
        caption: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        cell: js.Any,
        circle: SVGProps[typings.std.SVGCircleElement],
        cite: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        clipPath: SVGProps[typings.std.SVGClipPathElement],
        code: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        col: DetailedHTMLProps[
              ColHTMLAttributes[typings.std.HTMLTableColElement], 
              typings.std.HTMLTableColElement
            ],
        colgroup: DetailedHTMLProps[
              ColgroupHTMLAttributes[typings.std.HTMLTableColElement], 
              typings.std.HTMLTableColElement
            ],
        `contact-button`: js.Any,
        `cover-image`: js.Any,
        `cover-view`: js.Any,
        data: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        datalist: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDataListElement], typings.std.HTMLDataListElement],
        dd: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        defs: SVGProps[typings.std.SVGDefsElement],
        del: DetailedHTMLProps[DelHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        desc: SVGProps[typings.std.SVGDescElement],
        details: DetailedHTMLProps[DetailsHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        dfn: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        dialog: DetailedHTMLProps[DialogHTMLAttributes[typings.std.HTMLDialogElement], typings.std.HTMLDialogElement],
        div: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDivElement], typings.std.HTMLDivElement],
        dl: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDListElement], typings.std.HTMLDListElement],
        dt: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        ellipse: SVGProps[typings.std.SVGEllipseElement],
        em: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        embed: DetailedHTMLProps[EmbedHTMLAttributes[typings.std.HTMLEmbedElement], typings.std.HTMLEmbedElement],
        feBlend: SVGProps[typings.std.SVGFEBlendElement],
        feColorMatrix: SVGProps[typings.std.SVGFEColorMatrixElement],
        feComponentTransfer: SVGProps[typings.std.SVGFEComponentTransferElement],
        feComposite: SVGProps[typings.std.SVGFECompositeElement],
        feConvolveMatrix: SVGProps[typings.std.SVGFEConvolveMatrixElement],
        feDiffuseLighting: SVGProps[typings.std.SVGFEDiffuseLightingElement],
        feDisplacementMap: SVGProps[typings.std.SVGFEDisplacementMapElement],
        feDistantLight: SVGProps[typings.std.SVGFEDistantLightElement],
        feDropShadow: SVGProps[typings.std.SVGFEDropShadowElement],
        feFlood: SVGProps[typings.std.SVGFEFloodElement],
        feFuncA: SVGProps[typings.std.SVGFEFuncAElement],
        feFuncB: SVGProps[typings.std.SVGFEFuncBElement],
        feFuncG: SVGProps[typings.std.SVGFEFuncGElement],
        feFuncR: SVGProps[typings.std.SVGFEFuncRElement],
        feGaussianBlur: SVGProps[typings.std.SVGFEGaussianBlurElement],
        feImage: SVGProps[typings.std.SVGFEImageElement],
        feMerge: SVGProps[typings.std.SVGFEMergeElement],
        feMergeNode: SVGProps[typings.std.SVGFEMergeNodeElement],
        feMorphology: SVGProps[typings.std.SVGFEMorphologyElement],
        feOffset: SVGProps[typings.std.SVGFEOffsetElement],
        fePointLight: SVGProps[typings.std.SVGFEPointLightElement],
        feSpecularLighting: SVGProps[typings.std.SVGFESpecularLightingElement],
        feSpotLight: SVGProps[typings.std.SVGFESpotLightElement],
        feTile: SVGProps[typings.std.SVGFETileElement],
        feTurbulence: SVGProps[typings.std.SVGFETurbulenceElement],
        fieldset: DetailedHTMLProps[
              FieldsetHTMLAttributes[typings.std.HTMLFieldSetElement], 
              typings.std.HTMLFieldSetElement
            ],
        figcaption: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        figure: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        filter: SVGProps[typings.std.SVGFilterElement],
        footer: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        foreignObject: SVGProps[typings.std.SVGForeignObjectElement],
        form: DetailedHTMLProps[FormHTMLAttributes[typings.std.HTMLFormElement], typings.std.HTMLFormElement],
        `functional-page-navigator`: js.Any,
        g: SVGProps[typings.std.SVGGElement],
        h1: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement],
        h2: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement],
        h3: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement],
        h4: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement],
        h5: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement],
        h6: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement],
        head: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadElement], typings.std.HTMLHeadElement],
        header: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        hgroup: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        hr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHRElement], typings.std.HTMLHRElement],
        html: DetailedHTMLProps[HtmlHTMLAttributes[typings.std.HTMLHtmlElement], typings.std.HTMLHtmlElement],
        i: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        icon: js.Any,
        iframe: DetailedHTMLProps[IframeHTMLAttributes[typings.std.HTMLIFrameElement], typings.std.HTMLIFrameElement],
        image: SVGProps[typings.std.SVGImageElement],
        img: DetailedHTMLProps[ImgHTMLAttributes[typings.std.HTMLImageElement], typings.std.HTMLImageElement],
        indicator: js.Any,
        input: DetailedHTMLProps[InputHTMLAttributes[typings.std.HTMLInputElement], typings.std.HTMLInputElement],
        ins: DetailedHTMLProps[InsHTMLAttributes[typings.std.HTMLModElement], typings.std.HTMLModElement],
        `ive-pusher`: js.Any,
        kbd: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        keygen: DetailedHTMLProps[KeygenHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        label: DetailedHTMLProps[LabelHTMLAttributes[typings.std.HTMLLabelElement], typings.std.HTMLLabelElement],
        legend: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLLegendElement], typings.std.HTMLLegendElement],
        li: DetailedHTMLProps[LiHTMLAttributes[typings.std.HTMLLIElement], typings.std.HTMLLIElement],
        lifestyle: js.Any,
        line: SVGProps[typings.std.SVGLineElement],
        linearGradient: SVGProps[typings.std.SVGLinearGradientElement],
        link: DetailedHTMLProps[LinkHTMLAttributes[typings.std.HTMLLinkElement], typings.std.HTMLLinkElement],
        list: js.Any,
        `live-player`: js.Any,
        loading: js.Any,
        main: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        map: DetailedHTMLProps[MapHTMLAttributes[typings.std.HTMLMapElement], typings.std.HTMLMapElement],
        mark: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        marker: SVGProps[typings.std.SVGMarkerElement],
        mask: SVGProps[typings.std.SVGMaskElement],
        menu: DetailedHTMLProps[MenuHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        menuitem: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        meta: DetailedHTMLProps[MetaHTMLAttributes[typings.std.HTMLMetaElement], typings.std.HTMLMetaElement],
        metadata: SVGProps[typings.std.SVGMetadataElement],
        meter: DetailedHTMLProps[MeterHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        `movable-area`: js.Any,
        `movable-view`: js.Any,
        mpath: SVGProps[typings.std.SVGElement],
        nav: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        `navigation-bar`: js.Any,
        navigator: js.Any,
        noindex: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        noscript: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        `object`: DetailedHTMLProps[ObjectHTMLAttributes[typings.std.HTMLObjectElement], typings.std.HTMLObjectElement],
        ol: DetailedHTMLProps[OlHTMLAttributes[typings.std.HTMLOListElement], typings.std.HTMLOListElement],
        `open-data`: js.Any,
        optgroup: DetailedHTMLProps[
              OptgroupHTMLAttributes[typings.std.HTMLOptGroupElement], 
              typings.std.HTMLOptGroupElement
            ],
        option: DetailedHTMLProps[OptionHTMLAttributes[typings.std.HTMLOptionElement], typings.std.HTMLOptionElement],
        output: DetailedHTMLProps[OutputHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        p: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLParagraphElement], typings.std.HTMLParagraphElement],
        `page-meta`: js.Any,
        param: DetailedHTMLProps[ParamHTMLAttributes[typings.std.HTMLParamElement], typings.std.HTMLParamElement],
        path: SVGProps[typings.std.SVGPathElement],
        pattern: SVGProps[typings.std.SVGPatternElement],
        picker: js.Any,
        `picker-view`: js.Any,
        picture: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        polygon: SVGProps[typings.std.SVGPolygonElement],
        polyline: SVGProps[typings.std.SVGPolylineElement],
        pre: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLPreElement], typings.std.HTMLPreElement],
        progress: DetailedHTMLProps[
              ProgressHTMLAttributes[typings.std.HTMLProgressElement], 
              typings.std.HTMLProgressElement
            ],
        q: DetailedHTMLProps[QuoteHTMLAttributes[typings.std.HTMLQuoteElement], typings.std.HTMLQuoteElement],
        radialGradient: SVGProps[typings.std.SVGRadialGradientElement],
        rect: SVGProps[typings.std.SVGRectElement],
        `recycle-list`: js.Any,
        refresh: js.Any,
        `rich-text`: js.Any,
        richtext: js.Any,
        rp: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        rt: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        ruby: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        s: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        samp: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        script: DetailedHTMLProps[ScriptHTMLAttributes[typings.std.HTMLScriptElement], typings.std.HTMLScriptElement],
        `scroll-view`: js.Any,
        scroller: js.Any,
        section: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        select: DetailedHTMLProps[SelectHTMLAttributes[typings.std.HTMLSelectElement], typings.std.HTMLSelectElement],
        slider: js.Any,
        slot: js.Any,
        small: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        source: DetailedHTMLProps[SourceHTMLAttributes[typings.std.HTMLSourceElement], typings.std.HTMLSourceElement],
        span: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLSpanElement], typings.std.HTMLSpanElement],
        stop: SVGProps[typings.std.SVGStopElement],
        strong: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        style: DetailedHTMLProps[StyleHTMLAttributes[typings.std.HTMLStyleElement], typings.std.HTMLStyleElement],
        sub: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        summary: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        sup: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        svg: SVGProps[typings.std.SVGSVGElement],
        swiper: js.Any,
        `swiper-item`: js.Any,
        switch: SVGProps[typings.std.SVGSwitchElement],
        symbol: SVGProps[typings.std.SVGSymbolElement],
        table: DetailedHTMLProps[TableHTMLAttributes[typings.std.HTMLTableElement], typings.std.HTMLTableElement],
        tbody: DetailedHTMLProps[
              HTMLAttributes[typings.std.HTMLTableSectionElement], 
              typings.std.HTMLTableSectionElement
            ],
        td: DetailedHTMLProps[
              TdHTMLAttributes[typings.std.HTMLTableDataCellElement], 
              typings.std.HTMLTableDataCellElement
            ],
        text: SVGProps[typings.std.SVGTextElement],
        textPath: SVGProps[typings.std.SVGTextPathElement],
        textarea: DetailedHTMLProps[
              TextareaHTMLAttributes[typings.std.HTMLTextAreaElement], 
              typings.std.HTMLTextAreaElement
            ],
        tfoot: DetailedHTMLProps[
              HTMLAttributes[typings.std.HTMLTableSectionElement], 
              typings.std.HTMLTableSectionElement
            ],
        th: DetailedHTMLProps[
              ThHTMLAttributes[typings.std.HTMLTableHeaderCellElement], 
              typings.std.HTMLTableHeaderCellElement
            ],
        thead: DetailedHTMLProps[
              HTMLAttributes[typings.std.HTMLTableSectionElement], 
              typings.std.HTMLTableSectionElement
            ],
        time: DetailedHTMLProps[TimeHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        title: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLTitleElement], typings.std.HTMLTitleElement],
        tr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLTableRowElement], typings.std.HTMLTableRowElement],
        track: DetailedHTMLProps[TrackHTMLAttributes[typings.std.HTMLTrackElement], typings.std.HTMLTrackElement],
        tspan: SVGProps[typings.std.SVGTSpanElement],
        u: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        ul: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLUListElement], typings.std.HTMLUListElement],
        use: SVGProps[typings.std.SVGUseElement],
        `var`: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        video: DetailedHTMLProps[VideoHTMLAttributes[typings.std.HTMLVideoElement], typings.std.HTMLVideoElement],
        view: SVGProps[typings.std.SVGViewElement],
        waterfall: js.Any,
        wbr: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement],
        web: js.Any,
        `web-view`: js.Any,
        webview: DetailedHTMLProps[
              WebViewHTMLAttributes[typings.rax.HTMLWebViewElement], 
              typings.rax.HTMLWebViewElement
            ]
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], ad = ad.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], lifestyle = lifestyle.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], noindex = noindex.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], richtext = richtext.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scroller = scroller.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], swiper = swiper.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], waterfall = waterfall.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
        __obj.updateDynamic("aria-component")(`aria-component`.asInstanceOf[js.Any])
        __obj.updateDynamic("contact-button")(`contact-button`.asInstanceOf[js.Any])
        __obj.updateDynamic("cover-image")(`cover-image`.asInstanceOf[js.Any])
        __obj.updateDynamic("cover-view")(`cover-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("functional-page-navigator")(`functional-page-navigator`.asInstanceOf[js.Any])
        __obj.updateDynamic("ive-pusher")(`ive-pusher`.asInstanceOf[js.Any])
        __obj.updateDynamic("live-player")(`live-player`.asInstanceOf[js.Any])
        __obj.updateDynamic("movable-area")(`movable-area`.asInstanceOf[js.Any])
        __obj.updateDynamic("movable-view")(`movable-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("navigation-bar")(`navigation-bar`.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.updateDynamic("open-data")(`open-data`.asInstanceOf[js.Any])
        __obj.updateDynamic("page-meta")(`page-meta`.asInstanceOf[js.Any])
        __obj.updateDynamic("picker-view")(`picker-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("recycle-list")(`recycle-list`.asInstanceOf[js.Any])
        __obj.updateDynamic("rich-text")(`rich-text`.asInstanceOf[js.Any])
        __obj.updateDynamic("scroll-view")(`scroll-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("swiper-item")(`swiper-item`.asInstanceOf[js.Any])
        __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
        __obj.updateDynamic("web-view")(`web-view`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      @scala.inline
      implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(
          value: DetailedHTMLProps[AnchorHTMLAttributes[typings.std.HTMLAnchorElement], typings.std.HTMLAnchorElement]
        ): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbbr(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAd(value: js.Any): Self = StObject.set(x, "ad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimate(value: SVGProps[typings.std.SVGElement]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateMotion(value: SVGProps[typings.std.SVGElement]): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateTransform(value: SVGProps[typings.std.SVGElement]): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArea(
          value: DetailedHTMLProps[AreaHTMLAttributes[typings.std.HTMLAreaElement], typings.std.HTMLAreaElement]
        ): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setAria-component`(value: js.Any): Self = StObject.set(x, "aria-component", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArticle(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAside(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudio(
          value: DetailedHTMLProps[AudioHTMLAttributes[typings.std.HTMLAudioElement], typings.std.HTMLAudioElement]
        ): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setB(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBase(
          value: DetailedHTMLProps[BaseHTMLAttributes[typings.std.HTMLBaseElement], typings.std.HTMLBaseElement]
        ): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdi(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdo(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBig(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockquote(
          value: DetailedHTMLProps[BlockquoteHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]
        ): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBody(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLBodyElement], typings.std.HTMLBodyElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBr(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLBRElement], typings.std.HTMLBRElement]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButton(
          value: DetailedHTMLProps[ButtonHTMLAttributes[typings.std.HTMLButtonElement], typings.std.HTMLButtonElement]
        ): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanvas(
          value: DetailedHTMLProps[CanvasHTMLAttributes[typings.std.HTMLCanvasElement], typings.std.HTMLCanvasElement]
        ): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaption(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCell(value: js.Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCircle(value: SVGProps[typings.std.SVGCircleElement]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCite(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipPath(value: SVGProps[typings.std.SVGClipPathElement]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCode(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCol(
          value: DetailedHTMLProps[
                  ColHTMLAttributes[typings.std.HTMLTableColElement], 
                  typings.std.HTMLTableColElement
                ]
        ): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColgroup(
          value: DetailedHTMLProps[
                  ColgroupHTMLAttributes[typings.std.HTMLTableColElement], 
                  typings.std.HTMLTableColElement
                ]
        ): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setContact-button`(value: js.Any): Self = StObject.set(x, "contact-button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCover-image`(value: js.Any): Self = StObject.set(x, "cover-image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCover-view`(value: js.Any): Self = StObject.set(x, "cover-view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatalist(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDataListElement], typings.std.HTMLDataListElement]
        ): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDd(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefs(value: SVGProps[typings.std.SVGDefsElement]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDel(value: DetailedHTMLProps[DelHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDesc(value: SVGProps[typings.std.SVGDescElement]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetails(value: DetailedHTMLProps[DetailsHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDfn(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDialog(
          value: DetailedHTMLProps[DialogHTMLAttributes[typings.std.HTMLDialogElement], typings.std.HTMLDialogElement]
        ): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiv(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDivElement], typings.std.HTMLDivElement]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDl(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLDListElement], typings.std.HTMLDListElement]
        ): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDt(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEllipse(value: SVGProps[typings.std.SVGEllipseElement]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEm(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmbed(
          value: DetailedHTMLProps[EmbedHTMLAttributes[typings.std.HTMLEmbedElement], typings.std.HTMLEmbedElement]
        ): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeBlend(value: SVGProps[typings.std.SVGFEBlendElement]): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeColorMatrix(value: SVGProps[typings.std.SVGFEColorMatrixElement]): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComponentTransfer(value: SVGProps[typings.std.SVGFEComponentTransferElement]): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComposite(value: SVGProps[typings.std.SVGFECompositeElement]): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeConvolveMatrix(value: SVGProps[typings.std.SVGFEConvolveMatrixElement]): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDiffuseLighting(value: SVGProps[typings.std.SVGFEDiffuseLightingElement]): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDisplacementMap(value: SVGProps[typings.std.SVGFEDisplacementMapElement]): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDistantLight(value: SVGProps[typings.std.SVGFEDistantLightElement]): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDropShadow(value: SVGProps[typings.std.SVGFEDropShadowElement]): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFlood(value: SVGProps[typings.std.SVGFEFloodElement]): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncA(value: SVGProps[typings.std.SVGFEFuncAElement]): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncB(value: SVGProps[typings.std.SVGFEFuncBElement]): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncG(value: SVGProps[typings.std.SVGFEFuncGElement]): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncR(value: SVGProps[typings.std.SVGFEFuncRElement]): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeGaussianBlur(value: SVGProps[typings.std.SVGFEGaussianBlurElement]): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeImage(value: SVGProps[typings.std.SVGFEImageElement]): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMerge(value: SVGProps[typings.std.SVGFEMergeElement]): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMergeNode(value: SVGProps[typings.std.SVGFEMergeNodeElement]): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMorphology(value: SVGProps[typings.std.SVGFEMorphologyElement]): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeOffset(value: SVGProps[typings.std.SVGFEOffsetElement]): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFePointLight(value: SVGProps[typings.std.SVGFEPointLightElement]): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeSpecularLighting(value: SVGProps[typings.std.SVGFESpecularLightingElement]): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeSpotLight(value: SVGProps[typings.std.SVGFESpotLightElement]): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTile(value: SVGProps[typings.std.SVGFETileElement]): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTurbulence(value: SVGProps[typings.std.SVGFETurbulenceElement]): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldset(
          value: DetailedHTMLProps[
                  FieldsetHTMLAttributes[typings.std.HTMLFieldSetElement], 
                  typings.std.HTMLFieldSetElement
                ]
        ): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigcaption(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigure(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilter(value: SVGProps[typings.std.SVGFilterElement]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFooter(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForeignObject(value: SVGProps[typings.std.SVGForeignObjectElement]): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForm(
          value: DetailedHTMLProps[FormHTMLAttributes[typings.std.HTMLFormElement], typings.std.HTMLFormElement]
        ): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setFunctional-page-navigator`(value: js.Any): Self = StObject.set(x, "functional-page-navigator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG(value: SVGProps[typings.std.SVGGElement]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH1(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
        ): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH2(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
        ): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH3(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
        ): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH4(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
        ): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH5(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
        ): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH6(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadingElement], typings.std.HTMLHeadingElement]
        ): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHead(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHeadElement], typings.std.HTMLHeadElement]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeader(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHgroup(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHr(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLHRElement], typings.std.HTMLHRElement]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtml(
          value: DetailedHTMLProps[HtmlHTMLAttributes[typings.std.HTMLHtmlElement], typings.std.HTMLHtmlElement]
        ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setI(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIframe(
          value: DetailedHTMLProps[IframeHTMLAttributes[typings.std.HTMLIFrameElement], typings.std.HTMLIFrameElement]
        ): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImage(value: SVGProps[typings.std.SVGImageElement]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImg(
          value: DetailedHTMLProps[ImgHTMLAttributes[typings.std.HTMLImageElement], typings.std.HTMLImageElement]
        ): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndicator(value: js.Any): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInput(
          value: DetailedHTMLProps[InputHTMLAttributes[typings.std.HTMLInputElement], typings.std.HTMLInputElement]
        ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIns(
          value: DetailedHTMLProps[InsHTMLAttributes[typings.std.HTMLModElement], typings.std.HTMLModElement]
        ): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setIve-pusher`(value: js.Any): Self = StObject.set(x, "ive-pusher", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKbd(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeygen(value: DetailedHTMLProps[KeygenHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(
          value: DetailedHTMLProps[LabelHTMLAttributes[typings.std.HTMLLabelElement], typings.std.HTMLLabelElement]
        ): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegend(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLLegendElement], typings.std.HTMLLegendElement]
        ): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLi(value: DetailedHTMLProps[LiHTMLAttributes[typings.std.HTMLLIElement], typings.std.HTMLLIElement]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLifestyle(value: js.Any): Self = StObject.set(x, "lifestyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: SVGProps[typings.std.SVGLineElement]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinearGradient(value: SVGProps[typings.std.SVGLinearGradientElement]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLink(
          value: DetailedHTMLProps[LinkHTMLAttributes[typings.std.HTMLLinkElement], typings.std.HTMLLinkElement]
        ): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setList(value: js.Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLive-player`(value: js.Any): Self = StObject.set(x, "live-player", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoading(value: js.Any): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMain(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMap(
          value: DetailedHTMLProps[MapHTMLAttributes[typings.std.HTMLMapElement], typings.std.HTMLMapElement]
        ): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMark(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarker(value: SVGProps[typings.std.SVGMarkerElement]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMask(value: SVGProps[typings.std.SVGMaskElement]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenu(value: DetailedHTMLProps[MenuHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuitem(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeta(
          value: DetailedHTMLProps[MetaHTMLAttributes[typings.std.HTMLMetaElement], typings.std.HTMLMetaElement]
        ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: SVGProps[typings.std.SVGMetadataElement]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeter(value: DetailedHTMLProps[MeterHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMovable-area`(value: js.Any): Self = StObject.set(x, "movable-area", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setMovable-view`(value: js.Any): Self = StObject.set(x, "movable-view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMpath(value: SVGProps[typings.std.SVGElement]): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNav(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setNavigation-bar`(value: js.Any): Self = StObject.set(x, "navigation-bar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNavigator(value: js.Any): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoindex(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoscript(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObject(
          value: DetailedHTMLProps[ObjectHTMLAttributes[typings.std.HTMLObjectElement], typings.std.HTMLObjectElement]
        ): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOl(
          value: DetailedHTMLProps[OlHTMLAttributes[typings.std.HTMLOListElement], typings.std.HTMLOListElement]
        ): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setOpen-data`(value: js.Any): Self = StObject.set(x, "open-data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptgroup(
          value: DetailedHTMLProps[
                  OptgroupHTMLAttributes[typings.std.HTMLOptGroupElement], 
                  typings.std.HTMLOptGroupElement
                ]
        ): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOption(
          value: DetailedHTMLProps[OptionHTMLAttributes[typings.std.HTMLOptionElement], typings.std.HTMLOptionElement]
        ): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutput(value: DetailedHTMLProps[OutputHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setP(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLParagraphElement], typings.std.HTMLParagraphElement]
        ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setPage-meta`(value: js.Any): Self = StObject.set(x, "page-meta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParam(
          value: DetailedHTMLProps[ParamHTMLAttributes[typings.std.HTMLParamElement], typings.std.HTMLParamElement]
        ): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: SVGProps[typings.std.SVGPathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPattern(value: SVGProps[typings.std.SVGPatternElement]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPicker(value: js.Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setPicker-view`(value: js.Any): Self = StObject.set(x, "picker-view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPicture(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolygon(value: SVGProps[typings.std.SVGPolygonElement]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolyline(value: SVGProps[typings.std.SVGPolylineElement]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPre(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLPreElement], typings.std.HTMLPreElement]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgress(
          value: DetailedHTMLProps[
                  ProgressHTMLAttributes[typings.std.HTMLProgressElement], 
                  typings.std.HTMLProgressElement
                ]
        ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQ(
          value: DetailedHTMLProps[QuoteHTMLAttributes[typings.std.HTMLQuoteElement], typings.std.HTMLQuoteElement]
        ): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadialGradient(value: SVGProps[typings.std.SVGRadialGradientElement]): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRect(value: SVGProps[typings.std.SVGRectElement]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setRecycle-list`(value: js.Any): Self = StObject.set(x, "recycle-list", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefresh(value: js.Any): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setRich-text`(value: js.Any): Self = StObject.set(x, "rich-text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRichtext(value: js.Any): Self = StObject.set(x, "richtext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRp(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRt(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuby(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSamp(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScript(
          value: DetailedHTMLProps[ScriptHTMLAttributes[typings.std.HTMLScriptElement], typings.std.HTMLScriptElement]
        ): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setScroll-view`(value: js.Any): Self = StObject.set(x, "scroll-view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScroller(value: js.Any): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSection(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelect(
          value: DetailedHTMLProps[SelectHTMLAttributes[typings.std.HTMLSelectElement], typings.std.HTMLSelectElement]
        ): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlider(value: js.Any): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlot(value: js.Any): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmall(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(
          value: DetailedHTMLProps[SourceHTMLAttributes[typings.std.HTMLSourceElement], typings.std.HTMLSourceElement]
        ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLSpanElement], typings.std.HTMLSpanElement]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStop(value: SVGProps[typings.std.SVGStopElement]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrong(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyle(
          value: DetailedHTMLProps[StyleHTMLAttributes[typings.std.HTMLStyleElement], typings.std.HTMLStyleElement]
        ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSub(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummary(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSup(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSvg(value: SVGProps[typings.std.SVGSVGElement]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSwiper(value: js.Any): Self = StObject.set(x, "swiper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSwiper-item`(value: js.Any): Self = StObject.set(x, "swiper-item", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSwitch(value: SVGProps[typings.std.SVGSwitchElement]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbol(value: SVGProps[typings.std.SVGSymbolElement]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTable(
          value: DetailedHTMLProps[TableHTMLAttributes[typings.std.HTMLTableElement], typings.std.HTMLTableElement]
        ): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTbody(
          value: DetailedHTMLProps[
                  HTMLAttributes[typings.std.HTMLTableSectionElement], 
                  typings.std.HTMLTableSectionElement
                ]
        ): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTd(
          value: DetailedHTMLProps[
                  TdHTMLAttributes[typings.std.HTMLTableDataCellElement], 
                  typings.std.HTMLTableDataCellElement
                ]
        ): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: SVGProps[typings.std.SVGTextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextPath(value: SVGProps[typings.std.SVGTextPathElement]): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextarea(
          value: DetailedHTMLProps[
                  TextareaHTMLAttributes[typings.std.HTMLTextAreaElement], 
                  typings.std.HTMLTextAreaElement
                ]
        ): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTfoot(
          value: DetailedHTMLProps[
                  HTMLAttributes[typings.std.HTMLTableSectionElement], 
                  typings.std.HTMLTableSectionElement
                ]
        ): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTh(
          value: DetailedHTMLProps[
                  ThHTMLAttributes[typings.std.HTMLTableHeaderCellElement], 
                  typings.std.HTMLTableHeaderCellElement
                ]
        ): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThead(
          value: DetailedHTMLProps[
                  HTMLAttributes[typings.std.HTMLTableSectionElement], 
                  typings.std.HTMLTableSectionElement
                ]
        ): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: DetailedHTMLProps[TimeHTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLTitleElement], typings.std.HTMLTitleElement]
        ): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTr(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLTableRowElement], typings.std.HTMLTableRowElement]
        ): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrack(
          value: DetailedHTMLProps[TrackHTMLAttributes[typings.std.HTMLTrackElement], typings.std.HTMLTrackElement]
        ): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTspan(value: SVGProps[typings.std.SVGTSpanElement]): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setU(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUl(
          value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLUListElement], typings.std.HTMLUListElement]
        ): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUse(value: SVGProps[typings.std.SVGUseElement]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVar(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo(
          value: DetailedHTMLProps[VideoHTMLAttributes[typings.std.HTMLVideoElement], typings.std.HTMLVideoElement]
        ): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setView(value: SVGProps[typings.std.SVGViewElement]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWaterfall(value: js.Any): Self = StObject.set(x, "waterfall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWbr(value: DetailedHTMLProps[HTMLAttributes[typings.std.HTMLElement], typings.std.HTMLElement]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWeb(value: js.Any): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setWeb-view`(value: js.Any): Self = StObject.set(x, "web-view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebview(
          value: DetailedHTMLProps[
                  WebViewHTMLAttributes[typings.rax.HTMLWebViewElement], 
                  typings.rax.HTMLWebViewElement
                ]
        ): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
      }
    }
    
    // We can't recurse forever because `type` can't be self-referential;
    // let's assume it's reasonable to do a single Rax.lazy() around a single Rax.memo() / vice-versa
    type LibraryManagedAttributes[C, P] = RaxManagedAttributes[js.Any | C, P]
  }
}
