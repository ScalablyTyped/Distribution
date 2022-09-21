package typings.rax.mod

import typings.rax.HTMLWebViewElement
import typings.std.HTMLAnchorElement
import typings.std.HTMLAreaElement
import typings.std.HTMLAudioElement
import typings.std.HTMLBRElement
import typings.std.HTMLBaseElement
import typings.std.HTMLBodyElement
import typings.std.HTMLButtonElement
import typings.std.HTMLCanvasElement
import typings.std.HTMLDListElement
import typings.std.HTMLDataListElement
import typings.std.HTMLDialogElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLEmbedElement
import typings.std.HTMLFieldSetElement
import typings.std.HTMLFormElement
import typings.std.HTMLHRElement
import typings.std.HTMLHeadElement
import typings.std.HTMLHeadingElement
import typings.std.HTMLHtmlElement
import typings.std.HTMLIFrameElement
import typings.std.HTMLImageElement
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import typings.std.HTMLLabelElement
import typings.std.HTMLLegendElement
import typings.std.HTMLLinkElement
import typings.std.HTMLMapElement
import typings.std.HTMLMetaElement
import typings.std.HTMLModElement
import typings.std.HTMLOListElement
import typings.std.HTMLObjectElement
import typings.std.HTMLOptGroupElement
import typings.std.HTMLOptionElement
import typings.std.HTMLParagraphElement
import typings.std.HTMLParamElement
import typings.std.HTMLPreElement
import typings.std.HTMLProgressElement
import typings.std.HTMLQuoteElement
import typings.std.HTMLScriptElement
import typings.std.HTMLSelectElement
import typings.std.HTMLSourceElement
import typings.std.HTMLSpanElement
import typings.std.HTMLStyleElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTextAreaElement
import typings.std.HTMLTitleElement
import typings.std.HTMLTrackElement
import typings.std.HTMLUListElement
import typings.std.HTMLVideoElement
import typings.std.SVGCircleElement
import typings.std.SVGClipPathElement
import typings.std.SVGDefsElement
import typings.std.SVGDescElement
import typings.std.SVGElement
import typings.std.SVGEllipseElement
import typings.std.SVGFEBlendElement
import typings.std.SVGFEColorMatrixElement
import typings.std.SVGFEComponentTransferElement
import typings.std.SVGFECompositeElement
import typings.std.SVGFEConvolveMatrixElement
import typings.std.SVGFEDiffuseLightingElement
import typings.std.SVGFEDisplacementMapElement
import typings.std.SVGFEDistantLightElement
import typings.std.SVGFEDropShadowElement
import typings.std.SVGFEFloodElement
import typings.std.SVGFEFuncAElement
import typings.std.SVGFEFuncBElement
import typings.std.SVGFEFuncGElement
import typings.std.SVGFEFuncRElement
import typings.std.SVGFEGaussianBlurElement
import typings.std.SVGFEImageElement
import typings.std.SVGFEMergeElement
import typings.std.SVGFEMergeNodeElement
import typings.std.SVGFEMorphologyElement
import typings.std.SVGFEOffsetElement
import typings.std.SVGFEPointLightElement
import typings.std.SVGFESpecularLightingElement
import typings.std.SVGFESpotLightElement
import typings.std.SVGFETileElement
import typings.std.SVGFETurbulenceElement
import typings.std.SVGFilterElement
import typings.std.SVGForeignObjectElement
import typings.std.SVGGElement
import typings.std.SVGImageElement
import typings.std.SVGLineElement
import typings.std.SVGLinearGradientElement
import typings.std.SVGMarkerElement
import typings.std.SVGMaskElement
import typings.std.SVGMetadataElement
import typings.std.SVGPathElement
import typings.std.SVGPatternElement
import typings.std.SVGPolygonElement
import typings.std.SVGPolylineElement
import typings.std.SVGRadialGradientElement
import typings.std.SVGRectElement
import typings.std.SVGSVGElement
import typings.std.SVGStopElement
import typings.std.SVGSwitchElement
import typings.std.SVGSymbolElement
import typings.std.SVGTSpanElement
import typings.std.SVGTextElement
import typings.std.SVGTextPathElement
import typings.std.SVGUseElement
import typings.std.SVGViewElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    type Element = RaxElement[Any, Any]
    
    trait ElementAttributesProperty extends StObject
    
    trait ElementChildrenAttribute extends StObject
    
    @js.native
    trait ElementClass
      extends Component[Any, js.Object, Any]
    
    type IntrinsicAttributes = Attributes
    
    type IntrinsicClassAttributes[T] = ClassAttributes[T]
    
    trait IntrinsicElements extends StObject {
      
      // HTML
      var a: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]
      
      var abbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var ad: Any
      
      var `ad-custom`: Any
      
      var address: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var animate: SVGProps[SVGElement]
      
      // TODO: It is SVGAnimateElement but is not in TypeScript's lib.dom.d.ts for now.
      var animateMotion: SVGProps[SVGElement]
      
      var animateTransform: SVGProps[SVGElement]
      
      var area: DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]
      
      var `aria-component`: Any
      
      var article: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var aside: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var audio: DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]
      
      var b: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var base: DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]
      
      var bdi: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var bdo: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var big: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var blockquote: DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement]
      
      var body: DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]
      
      var br: DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement]
      
      var button: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]
      
      var camera: Any
      
      var canvas: DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]
      
      var caption: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var cell: Any
      
      // TODO: It is SVGAnimateTransformElement but is not in TypeScript's lib.dom.d.ts for now.
      var circle: SVGProps[SVGCircleElement]
      
      var cite: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var clipPath: SVGProps[SVGClipPathElement]
      
      var code: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var col: DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]
      
      var colgroup: DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]
      
      var `contact-button`: Any
      
      var `cover-image`: Any
      
      var `cover-view`: Any
      
      var data: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var datalist: DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement]
      
      var dd: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var defs: SVGProps[SVGDefsElement]
      
      var del: DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement]
      
      var desc: SVGProps[SVGDescElement]
      
      var details: DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement]
      
      var dfn: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var dialog: DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]
      
      var div: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
      
      var dl: DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement]
      
      var dt: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var ellipse: SVGProps[SVGEllipseElement]
      
      var em: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var embed: DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]
      
      var feBlend: SVGProps[SVGFEBlendElement]
      
      var feColorMatrix: SVGProps[SVGFEColorMatrixElement]
      
      var feComponentTransfer: SVGProps[SVGFEComponentTransferElement]
      
      var feComposite: SVGProps[SVGFECompositeElement]
      
      var feConvolveMatrix: SVGProps[SVGFEConvolveMatrixElement]
      
      var feDiffuseLighting: SVGProps[SVGFEDiffuseLightingElement]
      
      var feDisplacementMap: SVGProps[SVGFEDisplacementMapElement]
      
      var feDistantLight: SVGProps[SVGFEDistantLightElement]
      
      var feDropShadow: SVGProps[SVGFEDropShadowElement]
      
      var feFlood: SVGProps[SVGFEFloodElement]
      
      var feFuncA: SVGProps[SVGFEFuncAElement]
      
      var feFuncB: SVGProps[SVGFEFuncBElement]
      
      var feFuncG: SVGProps[SVGFEFuncGElement]
      
      var feFuncR: SVGProps[SVGFEFuncRElement]
      
      var feGaussianBlur: SVGProps[SVGFEGaussianBlurElement]
      
      var feImage: SVGProps[SVGFEImageElement]
      
      var feMerge: SVGProps[SVGFEMergeElement]
      
      var feMergeNode: SVGProps[SVGFEMergeNodeElement]
      
      var feMorphology: SVGProps[SVGFEMorphologyElement]
      
      var feOffset: SVGProps[SVGFEOffsetElement]
      
      var fePointLight: SVGProps[SVGFEPointLightElement]
      
      var feSpecularLighting: SVGProps[SVGFESpecularLightingElement]
      
      var feSpotLight: SVGProps[SVGFESpotLightElement]
      
      var feTile: SVGProps[SVGFETileElement]
      
      var feTurbulence: SVGProps[SVGFETurbulenceElement]
      
      var fieldset: DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]
      
      var figcaption: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var figure: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var filter: SVGProps[SVGFilterElement]
      
      var footer: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var foreignObject: SVGProps[SVGForeignObjectElement]
      
      var form: DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]
      
      var `functional-page-navigator`: Any
      
      var g: SVGProps[SVGGElement]
      
      var h1: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h2: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h3: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h4: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h5: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var h6: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]
      
      var head: DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]
      
      var header: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var hgroup: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var hr: DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]
      
      var html: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]
      
      var i: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var icon: Any
      
      var iframe: DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]
      
      var image: SVGProps[SVGImageElement]
      
      var img: DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]
      
      var indicator: Any
      
      var input: DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]
      
      var ins: DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement]
      
      var kbd: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var keygen: DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement]
      
      var label: DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]
      
      var legend: DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement]
      
      var li: DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]
      
      var lifestyle: Any
      
      var line: SVGProps[SVGLineElement]
      
      var linearGradient: SVGProps[SVGLinearGradientElement]
      
      var link: DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
      
      // weex
      var list: Any
      
      var `live-player`: Any
      
      var `live-pusher`: Any
      
      var loading: Any
      
      var main: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var map: DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement]
      
      var mark: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var marker: SVGProps[SVGMarkerElement]
      
      var mask: SVGProps[SVGMaskElement]
      
      var `match-media`: Any
      
      var menu: DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement]
      
      var menuitem: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var meta: DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
      
      var metadata: SVGProps[SVGMetadataElement]
      
      var meter: DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement]
      
      var `movable-area`: Any
      
      var `movable-view`: Any
      
      var mpath: SVGProps[SVGElement]
      
      var nav: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var `navigation-bar`: Any
      
      var navigator: Any
      
      var noindex: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var noscript: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var `object`: DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]
      
      var `official-account`: Any
      
      var ol: DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]
      
      var `open-data`: Any
      
      var optgroup: DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]
      
      var option: DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]
      
      var output: DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement]
      
      var p: DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]
      
      var `page-meta`: Any
      
      var param: DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]
      
      var path: SVGProps[SVGPathElement]
      
      var pattern: SVGProps[SVGPatternElement]
      
      var picker: Any
      
      var `picker-view`: Any
      
      var `picker-view-column`: Any
      
      var picture: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var polygon: SVGProps[SVGPolygonElement]
      
      var polyline: SVGProps[SVGPolylineElement]
      
      var pre: DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement]
      
      var progress: DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]
      
      var q: DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]
      
      var radialGradient: SVGProps[SVGRadialGradientElement]
      
      var radio: Any
      
      var `radio-group`: Any
      
      var rect: SVGProps[SVGRectElement]
      
      var `recycle-list`: Any
      
      var refresh: Any
      
      var `rich-text`: Any
      
      var richtext: Any
      
      var rp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var rt: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var ruby: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var s: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var samp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var script: DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]
      
      var `scroll-view`: Any
      
      var scroller: Any
      
      var section: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var select: DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]
      
      var slider: Any
      
      // MiniApp
      var slot: Any
      
      var small: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var source: DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]
      
      var span: DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]
      
      var stop: SVGProps[SVGStopElement]
      
      var strong: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var style: DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]
      
      var sub: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var summary: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var sup: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      // SVG
      var svg: SVGProps[SVGSVGElement]
      
      var swiper: Any
      
      var `swiper-item`: Any
      
      var switch: SVGProps[SVGSwitchElement]
      
      var symbol: SVGProps[SVGSymbolElement]
      
      var table: DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]
      
      var tbody: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
      
      var td: DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement]
      
      var text: SVGProps[SVGTextElement]
      
      var textPath: SVGProps[SVGTextPathElement]
      
      var textarea: DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]
      
      var tfoot: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
      
      var th: DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement]
      
      var thead: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]
      
      var time: DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement]
      
      var title: DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement]
      
      var tr: DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]
      
      var track: DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]
      
      var tspan: SVGProps[SVGTSpanElement]
      
      var u: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var ul: DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]
      
      var use: SVGProps[SVGUseElement]
      
      var `var`: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var video: DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]
      
      var view: SVGProps[SVGViewElement]
      
      var `voip-room`: Any
      
      var waterfall: Any
      
      var wbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]
      
      var web: Any
      
      var `web-view`: Any
      
      var webview: DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]
    }
    object IntrinsicElements {
      
      inline def apply(
        a: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement],
        abbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        ad: Any,
        `ad-custom`: Any,
        address: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        animate: SVGProps[SVGElement],
        animateMotion: SVGProps[SVGElement],
        animateTransform: SVGProps[SVGElement],
        area: DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement],
        `aria-component`: Any,
        article: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        aside: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        audio: DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement],
        b: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        base: DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement],
        bdi: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        bdo: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        big: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        blockquote: DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement],
        body: DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement],
        br: DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement],
        button: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement],
        camera: Any,
        canvas: DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement],
        caption: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        cell: Any,
        circle: SVGProps[SVGCircleElement],
        cite: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        clipPath: SVGProps[SVGClipPathElement],
        code: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        col: DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
        colgroup: DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
        `contact-button`: Any,
        `cover-image`: Any,
        `cover-view`: Any,
        data: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        datalist: DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement],
        dd: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        defs: SVGProps[SVGDefsElement],
        del: DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement],
        desc: SVGProps[SVGDescElement],
        details: DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement],
        dfn: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        dialog: DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement],
        div: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement],
        dl: DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement],
        dt: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        ellipse: SVGProps[SVGEllipseElement],
        em: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        embed: DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement],
        feBlend: SVGProps[SVGFEBlendElement],
        feColorMatrix: SVGProps[SVGFEColorMatrixElement],
        feComponentTransfer: SVGProps[SVGFEComponentTransferElement],
        feComposite: SVGProps[SVGFECompositeElement],
        feConvolveMatrix: SVGProps[SVGFEConvolveMatrixElement],
        feDiffuseLighting: SVGProps[SVGFEDiffuseLightingElement],
        feDisplacementMap: SVGProps[SVGFEDisplacementMapElement],
        feDistantLight: SVGProps[SVGFEDistantLightElement],
        feDropShadow: SVGProps[SVGFEDropShadowElement],
        feFlood: SVGProps[SVGFEFloodElement],
        feFuncA: SVGProps[SVGFEFuncAElement],
        feFuncB: SVGProps[SVGFEFuncBElement],
        feFuncG: SVGProps[SVGFEFuncGElement],
        feFuncR: SVGProps[SVGFEFuncRElement],
        feGaussianBlur: SVGProps[SVGFEGaussianBlurElement],
        feImage: SVGProps[SVGFEImageElement],
        feMerge: SVGProps[SVGFEMergeElement],
        feMergeNode: SVGProps[SVGFEMergeNodeElement],
        feMorphology: SVGProps[SVGFEMorphologyElement],
        feOffset: SVGProps[SVGFEOffsetElement],
        fePointLight: SVGProps[SVGFEPointLightElement],
        feSpecularLighting: SVGProps[SVGFESpecularLightingElement],
        feSpotLight: SVGProps[SVGFESpotLightElement],
        feTile: SVGProps[SVGFETileElement],
        feTurbulence: SVGProps[SVGFETurbulenceElement],
        fieldset: DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement],
        figcaption: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        figure: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        filter: SVGProps[SVGFilterElement],
        footer: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        foreignObject: SVGProps[SVGForeignObjectElement],
        form: DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement],
        `functional-page-navigator`: Any,
        g: SVGProps[SVGGElement],
        h1: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h2: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h3: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h4: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h5: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        h6: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement],
        head: DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement],
        header: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        hgroup: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        hr: DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement],
        html: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement],
        i: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        icon: Any,
        iframe: DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement],
        image: SVGProps[SVGImageElement],
        img: DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement],
        indicator: Any,
        input: DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement],
        ins: DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement],
        kbd: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        keygen: DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement],
        label: DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement],
        legend: DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement],
        li: DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement],
        lifestyle: Any,
        line: SVGProps[SVGLineElement],
        linearGradient: SVGProps[SVGLinearGradientElement],
        link: DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement],
        list: Any,
        `live-player`: Any,
        `live-pusher`: Any,
        loading: Any,
        main: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        map: DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement],
        mark: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        marker: SVGProps[SVGMarkerElement],
        mask: SVGProps[SVGMaskElement],
        `match-media`: Any,
        menu: DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement],
        menuitem: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        meta: DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement],
        metadata: SVGProps[SVGMetadataElement],
        meter: DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement],
        `movable-area`: Any,
        `movable-view`: Any,
        mpath: SVGProps[SVGElement],
        nav: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        `navigation-bar`: Any,
        navigator: Any,
        noindex: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        noscript: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        `object`: DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement],
        `official-account`: Any,
        ol: DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement],
        `open-data`: Any,
        optgroup: DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement],
        option: DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement],
        output: DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement],
        p: DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement],
        `page-meta`: Any,
        param: DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement],
        path: SVGProps[SVGPathElement],
        pattern: SVGProps[SVGPatternElement],
        picker: Any,
        `picker-view`: Any,
        `picker-view-column`: Any,
        picture: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        polygon: SVGProps[SVGPolygonElement],
        polyline: SVGProps[SVGPolylineElement],
        pre: DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement],
        progress: DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement],
        q: DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement],
        radialGradient: SVGProps[SVGRadialGradientElement],
        radio: Any,
        `radio-group`: Any,
        rect: SVGProps[SVGRectElement],
        `recycle-list`: Any,
        refresh: Any,
        `rich-text`: Any,
        richtext: Any,
        rp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        rt: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        ruby: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        s: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        samp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        script: DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement],
        `scroll-view`: Any,
        scroller: Any,
        section: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        select: DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement],
        slider: Any,
        slot: Any,
        small: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        source: DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement],
        span: DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement],
        stop: SVGProps[SVGStopElement],
        strong: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        style: DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement],
        sub: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        summary: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        sup: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        svg: SVGProps[SVGSVGElement],
        swiper: Any,
        `swiper-item`: Any,
        switch: SVGProps[SVGSwitchElement],
        symbol: SVGProps[SVGSymbolElement],
        table: DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement],
        tbody: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
        td: DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement],
        text: SVGProps[SVGTextElement],
        textPath: SVGProps[SVGTextPathElement],
        textarea: DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement],
        tfoot: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
        th: DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement],
        thead: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
        time: DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement],
        title: DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement],
        tr: DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement],
        track: DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement],
        tspan: SVGProps[SVGTSpanElement],
        u: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        ul: DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement],
        use: SVGProps[SVGUseElement],
        `var`: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        video: DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement],
        view: SVGProps[SVGViewElement],
        `voip-room`: Any,
        waterfall: Any,
        wbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        web: Any,
        `web-view`: Any,
        webview: DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], ad = ad.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], cell = cell.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], lifestyle = lifestyle.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], navigator = navigator.asInstanceOf[js.Any], noindex = noindex.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], richtext = richtext.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], scroller = scroller.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], swiper = swiper.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], waterfall = waterfall.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
        __obj.updateDynamic("ad-custom")(`ad-custom`.asInstanceOf[js.Any])
        __obj.updateDynamic("aria-component")(`aria-component`.asInstanceOf[js.Any])
        __obj.updateDynamic("contact-button")(`contact-button`.asInstanceOf[js.Any])
        __obj.updateDynamic("cover-image")(`cover-image`.asInstanceOf[js.Any])
        __obj.updateDynamic("cover-view")(`cover-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("functional-page-navigator")(`functional-page-navigator`.asInstanceOf[js.Any])
        __obj.updateDynamic("live-player")(`live-player`.asInstanceOf[js.Any])
        __obj.updateDynamic("live-pusher")(`live-pusher`.asInstanceOf[js.Any])
        __obj.updateDynamic("match-media")(`match-media`.asInstanceOf[js.Any])
        __obj.updateDynamic("movable-area")(`movable-area`.asInstanceOf[js.Any])
        __obj.updateDynamic("movable-view")(`movable-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("navigation-bar")(`navigation-bar`.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.updateDynamic("official-account")(`official-account`.asInstanceOf[js.Any])
        __obj.updateDynamic("open-data")(`open-data`.asInstanceOf[js.Any])
        __obj.updateDynamic("page-meta")(`page-meta`.asInstanceOf[js.Any])
        __obj.updateDynamic("picker-view")(`picker-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("picker-view-column")(`picker-view-column`.asInstanceOf[js.Any])
        __obj.updateDynamic("radio-group")(`radio-group`.asInstanceOf[js.Any])
        __obj.updateDynamic("recycle-list")(`recycle-list`.asInstanceOf[js.Any])
        __obj.updateDynamic("rich-text")(`rich-text`.asInstanceOf[js.Any])
        __obj.updateDynamic("scroll-view")(`scroll-view`.asInstanceOf[js.Any])
        __obj.updateDynamic("swiper-item")(`swiper-item`.asInstanceOf[js.Any])
        __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
        __obj.updateDynamic("voip-room")(`voip-room`.asInstanceOf[js.Any])
        __obj.updateDynamic("web-view")(`web-view`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      extension [Self <: IntrinsicElements](x: Self) {
        
        inline def setA(value: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setAbbr(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        inline def setAd(value: Any): Self = StObject.set(x, "ad", value.asInstanceOf[js.Any])
        
        inline def `setAd-custom`(value: Any): Self = StObject.set(x, "ad-custom", value.asInstanceOf[js.Any])
        
        inline def setAddress(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAnimate(value: SVGProps[SVGElement]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        inline def setAnimateMotion(value: SVGProps[SVGElement]): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
        
        inline def setAnimateTransform(value: SVGProps[SVGElement]): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        inline def setArea(value: DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        inline def `setAria-component`(value: Any): Self = StObject.set(x, "aria-component", value.asInstanceOf[js.Any])
        
        inline def setArticle(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        inline def setAside(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        inline def setAudio(value: DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        inline def setB(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setBase(value: DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        inline def setBdi(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        inline def setBdo(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        inline def setBig(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
        
        inline def setBlockquote(value: DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        inline def setBody(value: DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setBr(value: DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        inline def setButton(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setCamera(value: Any): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
        
        inline def setCanvas(value: DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        inline def setCaption(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
        
        inline def setCircle(value: SVGProps[SVGCircleElement]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        inline def setCite(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        inline def setClipPath(value: SVGProps[SVGClipPathElement]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        inline def setCode(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setCol(value: DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        inline def setColgroup(value: DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        inline def `setContact-button`(value: Any): Self = StObject.set(x, "contact-button", value.asInstanceOf[js.Any])
        
        inline def `setCover-image`(value: Any): Self = StObject.set(x, "cover-image", value.asInstanceOf[js.Any])
        
        inline def `setCover-view`(value: Any): Self = StObject.set(x, "cover-view", value.asInstanceOf[js.Any])
        
        inline def setData(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDatalist(value: DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement]): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        inline def setDd(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        inline def setDefs(value: SVGProps[SVGDefsElement]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        inline def setDel(value: DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        inline def setDesc(value: SVGProps[SVGDescElement]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDetails(value: DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        inline def setDfn(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        inline def setDialog(value: DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        inline def setDiv(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        inline def setDl(value: DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        inline def setDt(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        inline def setEllipse(value: SVGProps[SVGEllipseElement]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        inline def setEm(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        inline def setEmbed(value: DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        inline def setFeBlend(value: SVGProps[SVGFEBlendElement]): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        inline def setFeColorMatrix(value: SVGProps[SVGFEColorMatrixElement]): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeComponentTransfer(value: SVGProps[SVGFEComponentTransferElement]): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        inline def setFeComposite(value: SVGProps[SVGFECompositeElement]): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        inline def setFeConvolveMatrix(value: SVGProps[SVGFEConvolveMatrixElement]): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        inline def setFeDiffuseLighting(value: SVGProps[SVGFEDiffuseLightingElement]): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        inline def setFeDisplacementMap(value: SVGProps[SVGFEDisplacementMapElement]): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        inline def setFeDistantLight(value: SVGProps[SVGFEDistantLightElement]): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
        
        inline def setFeDropShadow(value: SVGProps[SVGFEDropShadowElement]): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        inline def setFeFlood(value: SVGProps[SVGFEFloodElement]): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        inline def setFeFuncA(value: SVGProps[SVGFEFuncAElement]): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
        
        inline def setFeFuncB(value: SVGProps[SVGFEFuncBElement]): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
        
        inline def setFeFuncG(value: SVGProps[SVGFEFuncGElement]): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
        
        inline def setFeFuncR(value: SVGProps[SVGFEFuncRElement]): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
        
        inline def setFeGaussianBlur(value: SVGProps[SVGFEGaussianBlurElement]): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        inline def setFeImage(value: SVGProps[SVGFEImageElement]): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        inline def setFeMerge(value: SVGProps[SVGFEMergeElement]): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        inline def setFeMergeNode(value: SVGProps[SVGFEMergeNodeElement]): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        inline def setFeMorphology(value: SVGProps[SVGFEMorphologyElement]): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        inline def setFeOffset(value: SVGProps[SVGFEOffsetElement]): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        inline def setFePointLight(value: SVGProps[SVGFEPointLightElement]): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
        
        inline def setFeSpecularLighting(value: SVGProps[SVGFESpecularLightingElement]): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        inline def setFeSpotLight(value: SVGProps[SVGFESpotLightElement]): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
        
        inline def setFeTile(value: SVGProps[SVGFETileElement]): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        inline def setFeTurbulence(value: SVGProps[SVGFETurbulenceElement]): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        inline def setFieldset(value: DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        inline def setFigcaption(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        inline def setFigure(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        inline def setFilter(value: SVGProps[SVGFilterElement]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        inline def setFooter(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        inline def setForeignObject(value: SVGProps[SVGForeignObjectElement]): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        inline def setForm(value: DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        inline def `setFunctional-page-navigator`(value: Any): Self = StObject.set(x, "functional-page-navigator", value.asInstanceOf[js.Any])
        
        inline def setG(value: SVGProps[SVGGElement]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setH1(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        inline def setH2(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        inline def setH3(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        inline def setH4(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        inline def setH5(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        inline def setH6(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        inline def setHead(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        inline def setHeader(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHgroup(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        inline def setHr(value: DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        inline def setHtml(value: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        inline def setI(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIframe(value: DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        inline def setImage(value: SVGProps[SVGImageElement]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImg(value: DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        inline def setIndicator(value: Any): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
        
        inline def setInput(value: DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setIns(value: DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        inline def setKbd(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        inline def setKeygen(value: DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLegend(value: DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        inline def setLi(value: DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        inline def setLifestyle(value: Any): Self = StObject.set(x, "lifestyle", value.asInstanceOf[js.Any])
        
        inline def setLine(value: SVGProps[SVGLineElement]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        inline def setLinearGradient(value: SVGProps[SVGLinearGradientElement]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        inline def setLink(value: DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setList(value: Any): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
        
        inline def `setLive-player`(value: Any): Self = StObject.set(x, "live-player", value.asInstanceOf[js.Any])
        
        inline def `setLive-pusher`(value: Any): Self = StObject.set(x, "live-pusher", value.asInstanceOf[js.Any])
        
        inline def setLoading(value: Any): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
        
        inline def setMain(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        inline def setMap(value: DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        inline def setMark(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        inline def setMarker(value: SVGProps[SVGMarkerElement]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        inline def setMask(value: SVGProps[SVGMaskElement]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        inline def `setMatch-media`(value: Any): Self = StObject.set(x, "match-media", value.asInstanceOf[js.Any])
        
        inline def setMenu(value: DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setMenuitem(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
        
        inline def setMeta(value: DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: SVGProps[SVGMetadataElement]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMeter(value: DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        inline def `setMovable-area`(value: Any): Self = StObject.set(x, "movable-area", value.asInstanceOf[js.Any])
        
        inline def `setMovable-view`(value: Any): Self = StObject.set(x, "movable-view", value.asInstanceOf[js.Any])
        
        inline def setMpath(value: SVGProps[SVGElement]): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
        
        inline def setNav(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        inline def `setNavigation-bar`(value: Any): Self = StObject.set(x, "navigation-bar", value.asInstanceOf[js.Any])
        
        inline def setNavigator(value: Any): Self = StObject.set(x, "navigator", value.asInstanceOf[js.Any])
        
        inline def setNoindex(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
        
        inline def setNoscript(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        inline def setObject(value: DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        inline def `setOfficial-account`(value: Any): Self = StObject.set(x, "official-account", value.asInstanceOf[js.Any])
        
        inline def setOl(value: DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        inline def `setOpen-data`(value: Any): Self = StObject.set(x, "open-data", value.asInstanceOf[js.Any])
        
        inline def setOptgroup(value: DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        inline def setOption(value: DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        inline def setOutput(value: DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        inline def setP(value: DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        inline def `setPage-meta`(value: Any): Self = StObject.set(x, "page-meta", value.asInstanceOf[js.Any])
        
        inline def setParam(value: DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
        
        inline def setPath(value: SVGProps[SVGPathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPattern(value: SVGProps[SVGPatternElement]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPicker(value: Any): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
        
        inline def `setPicker-view`(value: Any): Self = StObject.set(x, "picker-view", value.asInstanceOf[js.Any])
        
        inline def `setPicker-view-column`(value: Any): Self = StObject.set(x, "picker-view-column", value.asInstanceOf[js.Any])
        
        inline def setPicture(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        inline def setPolygon(value: SVGProps[SVGPolygonElement]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        inline def setPolyline(value: SVGProps[SVGPolylineElement]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        inline def setPre(value: DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        inline def setProgress(value: DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setQ(value: DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        inline def setRadialGradient(value: SVGProps[SVGRadialGradientElement]): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        inline def setRadio(value: Any): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
        
        inline def `setRadio-group`(value: Any): Self = StObject.set(x, "radio-group", value.asInstanceOf[js.Any])
        
        inline def setRect(value: SVGProps[SVGRectElement]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        inline def `setRecycle-list`(value: Any): Self = StObject.set(x, "recycle-list", value.asInstanceOf[js.Any])
        
        inline def setRefresh(value: Any): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
        
        inline def `setRich-text`(value: Any): Self = StObject.set(x, "rich-text", value.asInstanceOf[js.Any])
        
        inline def setRichtext(value: Any): Self = StObject.set(x, "richtext", value.asInstanceOf[js.Any])
        
        inline def setRp(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        inline def setRt(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        inline def setRuby(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        inline def setS(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        inline def setSamp(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        inline def setScript(value: DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        inline def `setScroll-view`(value: Any): Self = StObject.set(x, "scroll-view", value.asInstanceOf[js.Any])
        
        inline def setScroller(value: Any): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
        
        inline def setSection(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        inline def setSelect(value: DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        inline def setSlider(value: Any): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
        
        inline def setSlot(value: Any): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        inline def setSmall(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        inline def setSource(value: DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSpan(value: DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        inline def setStop(value: SVGProps[SVGStopElement]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        inline def setStrong(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        inline def setStyle(value: DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setSub(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        inline def setSummary(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSup(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        inline def setSvg(value: SVGProps[SVGSVGElement]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        inline def setSwiper(value: Any): Self = StObject.set(x, "swiper", value.asInstanceOf[js.Any])
        
        inline def `setSwiper-item`(value: Any): Self = StObject.set(x, "swiper-item", value.asInstanceOf[js.Any])
        
        inline def setSwitch(value: SVGProps[SVGSwitchElement]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        inline def setSymbol(value: SVGProps[SVGSymbolElement]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        inline def setTable(value: DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        inline def setTbody(value: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        inline def setTd(value: DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        inline def setText(value: SVGProps[SVGTextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        inline def setTextPath(value: SVGProps[SVGTextPathElement]): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
        
        inline def setTextarea(value: DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        inline def setTfoot(value: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        inline def setTh(value: DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        inline def setThead(value: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        inline def setTime(value: DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTr(value: DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        inline def setTrack(value: DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        inline def setTspan(value: SVGProps[SVGTSpanElement]): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        inline def setU(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        inline def setUl(value: DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        inline def setUse(value: SVGProps[SVGUseElement]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        inline def setVar(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        inline def setVideo(value: DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        inline def setView(value: SVGProps[SVGViewElement]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        inline def `setVoip-room`(value: Any): Self = StObject.set(x, "voip-room", value.asInstanceOf[js.Any])
        
        inline def setWaterfall(value: Any): Self = StObject.set(x, "waterfall", value.asInstanceOf[js.Any])
        
        inline def setWbr(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
        
        inline def setWeb(value: Any): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
        
        inline def `setWeb-view`(value: Any): Self = StObject.set(x, "web-view", value.asInstanceOf[js.Any])
        
        inline def setWebview(value: DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
      }
    }
    
    // We can't recurse forever because `type` can't be self-referential;
    // let's assume it's reasonable to do a single Rax.lazy() around a single Rax.memo() / vice-versa
    type LibraryManagedAttributes[C, P] = RaxManagedAttributes[Any | C, P]
  }
}
