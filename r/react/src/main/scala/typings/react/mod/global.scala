package typings.react.mod

import typings.react.HTMLWebViewElement
import typings.std.HTMLAnchorElement
import typings.std.HTMLAreaElement
import typings.std.HTMLAudioElement
import typings.std.HTMLBRElement
import typings.std.HTMLBaseElement
import typings.std.HTMLBodyElement
import typings.std.HTMLButtonElement
import typings.std.HTMLCanvasElement
import typings.std.HTMLDListElement
import typings.std.HTMLDataElement
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
import typings.std.HTMLSlotElement
import typings.std.HTMLSourceElement
import typings.std.HTMLSpanElement
import typings.std.HTMLStyleElement
import typings.std.HTMLTableColElement
import typings.std.HTMLTableDataCellElement
import typings.std.HTMLTableElement
import typings.std.HTMLTableHeaderCellElement
import typings.std.HTMLTableRowElement
import typings.std.HTMLTableSectionElement
import typings.std.HTMLTemplateElement
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object JSX {
    
    type Element = ReactElement
    
    @js.native
    trait ElementAttributesProperty extends StObject
    
    @js.native
    trait ElementChildrenAttribute extends StObject
    
    @js.native
    trait ElementClass
      extends Component[js.Any, js.Object, js.Any]
    
    type IntrinsicAttributes = Attributes
    
    type IntrinsicClassAttributes[T] = ClassAttributes[T]
    
    @js.native
    trait IntrinsicElements extends StObject {
      
      // HTML
      var a: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement] = js.native
      
      var abbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var address: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var animate: SVGProps[SVGElement] = js.native
      
      // TODO: It is SVGAnimateElement but is not in TypeScript's lib.dom.d.ts for now.
      var animateMotion: SVGProps[SVGElement] = js.native
      
      var animateTransform: SVGProps[SVGElement] = js.native
      
      var area: DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement] = js.native
      
      var article: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var aside: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var audio: DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement] = js.native
      
      var b: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var base: DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement] = js.native
      
      var bdi: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var bdo: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var big: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var blockquote: DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var body: DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement] = js.native
      
      var br: DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement] = js.native
      
      var button: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement] = js.native
      
      var canvas: DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement] = js.native
      
      var caption: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      // TODO: It is SVGAnimateTransformElement but is not in TypeScript's lib.dom.d.ts for now.
      var circle: SVGProps[SVGCircleElement] = js.native
      
      var cite: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var clipPath: SVGProps[SVGClipPathElement] = js.native
      
      var code: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var col: DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement] = js.native
      
      var colgroup: DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement] = js.native
      
      var data: DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement] = js.native
      
      var datalist: DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement] = js.native
      
      var dd: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var defs: SVGProps[SVGDefsElement] = js.native
      
      var del: DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var desc: SVGProps[SVGDescElement] = js.native
      
      var details: DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var dfn: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var dialog: DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement] = js.native
      
      var div: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement] = js.native
      
      var dl: DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement] = js.native
      
      var dt: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var ellipse: SVGProps[SVGEllipseElement] = js.native
      
      var em: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var embed: DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement] = js.native
      
      var feBlend: SVGProps[SVGFEBlendElement] = js.native
      
      var feColorMatrix: SVGProps[SVGFEColorMatrixElement] = js.native
      
      var feComponentTransfer: SVGProps[SVGFEComponentTransferElement] = js.native
      
      var feComposite: SVGProps[SVGFECompositeElement] = js.native
      
      var feConvolveMatrix: SVGProps[SVGFEConvolveMatrixElement] = js.native
      
      var feDiffuseLighting: SVGProps[SVGFEDiffuseLightingElement] = js.native
      
      var feDisplacementMap: SVGProps[SVGFEDisplacementMapElement] = js.native
      
      var feDistantLight: SVGProps[SVGFEDistantLightElement] = js.native
      
      var feDropShadow: SVGProps[SVGFEDropShadowElement] = js.native
      
      var feFlood: SVGProps[SVGFEFloodElement] = js.native
      
      var feFuncA: SVGProps[SVGFEFuncAElement] = js.native
      
      var feFuncB: SVGProps[SVGFEFuncBElement] = js.native
      
      var feFuncG: SVGProps[SVGFEFuncGElement] = js.native
      
      var feFuncR: SVGProps[SVGFEFuncRElement] = js.native
      
      var feGaussianBlur: SVGProps[SVGFEGaussianBlurElement] = js.native
      
      var feImage: SVGProps[SVGFEImageElement] = js.native
      
      var feMerge: SVGProps[SVGFEMergeElement] = js.native
      
      var feMergeNode: SVGProps[SVGFEMergeNodeElement] = js.native
      
      var feMorphology: SVGProps[SVGFEMorphologyElement] = js.native
      
      var feOffset: SVGProps[SVGFEOffsetElement] = js.native
      
      var fePointLight: SVGProps[SVGFEPointLightElement] = js.native
      
      var feSpecularLighting: SVGProps[SVGFESpecularLightingElement] = js.native
      
      var feSpotLight: SVGProps[SVGFESpotLightElement] = js.native
      
      var feTile: SVGProps[SVGFETileElement] = js.native
      
      var feTurbulence: SVGProps[SVGFETurbulenceElement] = js.native
      
      var fieldset: DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement] = js.native
      
      var figcaption: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var figure: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var filter: SVGProps[SVGFilterElement] = js.native
      
      var footer: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var foreignObject: SVGProps[SVGForeignObjectElement] = js.native
      
      var form: DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement] = js.native
      
      var g: SVGProps[SVGGElement] = js.native
      
      var h1: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement] = js.native
      
      var h2: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement] = js.native
      
      var h3: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement] = js.native
      
      var h4: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement] = js.native
      
      var h5: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement] = js.native
      
      var h6: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement] = js.native
      
      var head: DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement] = js.native
      
      var header: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var hgroup: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var hr: DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement] = js.native
      
      var html: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement] = js.native
      
      var i: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var iframe: DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement] = js.native
      
      var image: SVGProps[SVGImageElement] = js.native
      
      var img: DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement] = js.native
      
      var input: DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = js.native
      
      var ins: DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement] = js.native
      
      var kbd: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var keygen: DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var label: DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement] = js.native
      
      var legend: DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement] = js.native
      
      var li: DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement] = js.native
      
      var line: SVGProps[SVGLineElement] = js.native
      
      var linearGradient: SVGProps[SVGLinearGradientElement] = js.native
      
      var link: DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement] = js.native
      
      var main: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var map: DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement] = js.native
      
      var mark: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var marker: SVGProps[SVGMarkerElement] = js.native
      
      var mask: SVGProps[SVGMaskElement] = js.native
      
      var menu: DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var menuitem: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var meta: DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement] = js.native
      
      var metadata: SVGProps[SVGMetadataElement] = js.native
      
      var meter: DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var mpath: SVGProps[SVGElement] = js.native
      
      var nav: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var noindex: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var noscript: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var `object`: DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement] = js.native
      
      var ol: DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement] = js.native
      
      var optgroup: DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement] = js.native
      
      var option: DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement] = js.native
      
      var output: DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var p: DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement] = js.native
      
      var param: DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement] = js.native
      
      var path: SVGProps[SVGPathElement] = js.native
      
      var pattern: SVGProps[SVGPatternElement] = js.native
      
      var picture: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var polygon: SVGProps[SVGPolygonElement] = js.native
      
      var polyline: SVGProps[SVGPolylineElement] = js.native
      
      var pre: DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement] = js.native
      
      var progress: DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement] = js.native
      
      var q: DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement] = js.native
      
      var radialGradient: SVGProps[SVGRadialGradientElement] = js.native
      
      var rect: SVGProps[SVGRectElement] = js.native
      
      var rp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var rt: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var ruby: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var s: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var samp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var script: DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement] = js.native
      
      var section: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var select: DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement] = js.native
      
      var slot: DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement] = js.native
      
      var small: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var source: DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement] = js.native
      
      var span: DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement] = js.native
      
      var stop: SVGProps[SVGStopElement] = js.native
      
      var strong: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var style: DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement] = js.native
      
      var sub: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var summary: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var sup: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      // SVG
      var svg: SVGProps[SVGSVGElement] = js.native
      
      var switch: SVGProps[SVGSwitchElement] = js.native
      
      var symbol: SVGProps[SVGSymbolElement] = js.native
      
      var table: DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement] = js.native
      
      var tbody: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement] = js.native
      
      var td: DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement] = js.native
      
      var template: DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement] = js.native
      
      var text: SVGProps[SVGTextElement] = js.native
      
      var textPath: SVGProps[SVGTextPathElement] = js.native
      
      var textarea: DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement] = js.native
      
      var tfoot: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement] = js.native
      
      var th: DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement] = js.native
      
      var thead: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement] = js.native
      
      var time: DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var title: DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement] = js.native
      
      var tr: DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement] = js.native
      
      var track: DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement] = js.native
      
      var tspan: SVGProps[SVGTSpanElement] = js.native
      
      var u: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var ul: DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement] = js.native
      
      var use: SVGProps[SVGUseElement] = js.native
      
      var `var`: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var video: DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement] = js.native
      
      var view: SVGProps[SVGViewElement] = js.native
      
      var wbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement] = js.native
      
      var webview: DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement] = js.native
    }
    object IntrinsicElements {
      
      @scala.inline
      def apply(
        a: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement],
        abbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        address: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        animate: SVGProps[SVGElement],
        animateMotion: SVGProps[SVGElement],
        animateTransform: SVGProps[SVGElement],
        area: DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement],
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
        canvas: DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement],
        caption: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        circle: SVGProps[SVGCircleElement],
        cite: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        clipPath: SVGProps[SVGClipPathElement],
        code: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        col: DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
        colgroup: DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement],
        data: DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement],
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
        iframe: DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement],
        image: SVGProps[SVGImageElement],
        img: DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement],
        input: DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement],
        ins: DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement],
        kbd: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        keygen: DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement],
        label: DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement],
        legend: DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement],
        li: DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement],
        line: SVGProps[SVGLineElement],
        linearGradient: SVGProps[SVGLinearGradientElement],
        link: DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement],
        main: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        map: DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement],
        mark: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        marker: SVGProps[SVGMarkerElement],
        mask: SVGProps[SVGMaskElement],
        menu: DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement],
        menuitem: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        meta: DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement],
        metadata: SVGProps[SVGMetadataElement],
        meter: DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement],
        mpath: SVGProps[SVGElement],
        nav: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        noindex: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        noscript: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        `object`: DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement],
        ol: DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement],
        optgroup: DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement],
        option: DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement],
        output: DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement],
        p: DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement],
        param: DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement],
        path: SVGProps[SVGPathElement],
        pattern: SVGProps[SVGPatternElement],
        picture: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        polygon: SVGProps[SVGPolygonElement],
        polyline: SVGProps[SVGPolylineElement],
        pre: DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement],
        progress: DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement],
        q: DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement],
        radialGradient: SVGProps[SVGRadialGradientElement],
        rect: SVGProps[SVGRectElement],
        rp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        rt: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        ruby: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        s: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        samp: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        script: DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement],
        section: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        select: DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement],
        slot: DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement],
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
        switch: SVGProps[SVGSwitchElement],
        symbol: SVGProps[SVGSymbolElement],
        table: DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement],
        tbody: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement],
        td: DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement],
        template: DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement],
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
        wbr: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement],
        webview: DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]
      ): IntrinsicElements = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noindex = noindex.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
        __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
        __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicElements]
      }
      
      @scala.inline
      implicit class IntrinsicElementsMutableBuilder[Self <: IntrinsicElements] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAbbr(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddress(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimate(value: SVGProps[SVGElement]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateMotion(value: SVGProps[SVGElement]): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnimateTransform(value: SVGProps[SVGElement]): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArea(value: DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArticle(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAside(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudio(value: DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setB(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBase(value: DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdi(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBdo(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBig(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlockquote(value: DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBody(value: DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBr(value: DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButton(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanvas(value: DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaption(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCircle(value: SVGProps[SVGCircleElement]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCite(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClipPath(value: SVGProps[SVGClipPathElement]): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCode(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCol(value: DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColgroup(value: DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setData(value: DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDatalist(value: DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement]): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDd(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefs(value: SVGProps[SVGDefsElement]): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDel(value: DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDesc(value: SVGProps[SVGDescElement]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetails(value: DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDfn(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDialog(value: DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDiv(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDl(value: DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement]): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDt(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEllipse(value: SVGProps[SVGEllipseElement]): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEm(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmbed(value: DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeBlend(value: SVGProps[SVGFEBlendElement]): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeColorMatrix(value: SVGProps[SVGFEColorMatrixElement]): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComponentTransfer(value: SVGProps[SVGFEComponentTransferElement]): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeComposite(value: SVGProps[SVGFECompositeElement]): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeConvolveMatrix(value: SVGProps[SVGFEConvolveMatrixElement]): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDiffuseLighting(value: SVGProps[SVGFEDiffuseLightingElement]): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDisplacementMap(value: SVGProps[SVGFEDisplacementMapElement]): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDistantLight(value: SVGProps[SVGFEDistantLightElement]): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeDropShadow(value: SVGProps[SVGFEDropShadowElement]): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFlood(value: SVGProps[SVGFEFloodElement]): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncA(value: SVGProps[SVGFEFuncAElement]): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncB(value: SVGProps[SVGFEFuncBElement]): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncG(value: SVGProps[SVGFEFuncGElement]): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeFuncR(value: SVGProps[SVGFEFuncRElement]): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeGaussianBlur(value: SVGProps[SVGFEGaussianBlurElement]): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeImage(value: SVGProps[SVGFEImageElement]): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMerge(value: SVGProps[SVGFEMergeElement]): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMergeNode(value: SVGProps[SVGFEMergeNodeElement]): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeMorphology(value: SVGProps[SVGFEMorphologyElement]): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeOffset(value: SVGProps[SVGFEOffsetElement]): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFePointLight(value: SVGProps[SVGFEPointLightElement]): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeSpecularLighting(value: SVGProps[SVGFESpecularLightingElement]): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeSpotLight(value: SVGProps[SVGFESpotLightElement]): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTile(value: SVGProps[SVGFETileElement]): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFeTurbulence(value: SVGProps[SVGFETurbulenceElement]): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldset(value: DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigcaption(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFigure(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilter(value: SVGProps[SVGFilterElement]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFooter(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForeignObject(value: SVGProps[SVGForeignObjectElement]): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForm(value: DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setG(value: SVGProps[SVGGElement]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH1(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH2(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH3(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH4(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH5(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setH6(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHead(value: DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeader(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHgroup(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHr(value: DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtml(value: DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setI(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIframe(value: DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImage(value: SVGProps[SVGImageElement]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImg(value: DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInput(value: DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIns(value: DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKbd(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeygen(value: DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLegend(value: DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLi(value: DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLine(value: SVGProps[SVGLineElement]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinearGradient(value: SVGProps[SVGLinearGradientElement]): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLink(value: DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMain(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMap(value: DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMark(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarker(value: SVGProps[SVGMarkerElement]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMask(value: SVGProps[SVGMaskElement]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenu(value: DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMenuitem(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeta(value: DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: SVGProps[SVGMetadataElement]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeter(value: DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMpath(value: SVGProps[SVGElement]): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNav(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoindex(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNoscript(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setObject(value: DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOl(value: DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptgroup(value: DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOption(value: DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutput(value: DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setP(value: DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParam(value: DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPath(value: SVGProps[SVGPathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPattern(value: SVGProps[SVGPatternElement]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPicture(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolygon(value: SVGProps[SVGPolygonElement]): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPolyline(value: SVGProps[SVGPolylineElement]): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPre(value: DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgress(value: DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setQ(value: DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRadialGradient(value: SVGProps[SVGRadialGradientElement]): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRect(value: SVGProps[SVGRectElement]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRp(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRt(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRuby(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setS(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSamp(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScript(value: DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSection(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelect(value: DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSlot(value: DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement]): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSmall(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpan(value: DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStop(value: SVGProps[SVGStopElement]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStrong(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyle(value: DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSub(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummary(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSup(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSvg(value: SVGProps[SVGSVGElement]): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSwitch(value: SVGProps[SVGSwitchElement]): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSymbol(value: SVGProps[SVGSymbolElement]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTable(value: DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTbody(value: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTd(value: DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplate(value: DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: SVGProps[SVGTextElement]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextPath(value: SVGProps[SVGTextPathElement]): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextarea(value: DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTfoot(value: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTh(value: DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThead(value: DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTr(value: DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTrack(value: DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTspan(value: SVGProps[SVGTSpanElement]): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setU(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUl(value: DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUse(value: SVGProps[SVGUseElement]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVar(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo(value: DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setView(value: SVGProps[SVGViewElement]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWbr(value: DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebview(value: DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
      }
    }
    
    // We can't recurse forever because `type` can't be self-referential;
    // let's assume it's reasonable to do a single React.lazy() around a single React.memo() / vice-versa
    type LibraryManagedAttributes[C, P] = ReactManagedAttributes[js.Any | C, P]
  }
}
