package typings.storybookComponents.inputMod

import typings.emotionStyledBase.helperMod.PropsOf
import typings.emotionStyledBase.mod.StyledComponent
import typings.react.HTMLWebViewElement
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.AreaHTMLAttributes
import typings.react.mod.AudioHTMLAttributes
import typings.react.mod.BaseHTMLAttributes
import typings.react.mod.BlockquoteHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.CanvasHTMLAttributes
import typings.react.mod.ColHTMLAttributes
import typings.react.mod.ColgroupHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.DataHTMLAttributes
import typings.react.mod.DelHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.DetailsHTMLAttributes
import typings.react.mod.DialogHTMLAttributes
import typings.react.mod.EmbedHTMLAttributes
import typings.react.mod.FieldsetHTMLAttributes
import typings.react.mod.FormHTMLAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.HtmlHTMLAttributes
import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.InsHTMLAttributes
import typings.react.mod.KeygenHTMLAttributes
import typings.react.mod.LabelHTMLAttributes
import typings.react.mod.LiHTMLAttributes
import typings.react.mod.LinkHTMLAttributes
import typings.react.mod.MapHTMLAttributes
import typings.react.mod.MenuHTMLAttributes
import typings.react.mod.MetaHTMLAttributes
import typings.react.mod.MeterHTMLAttributes
import typings.react.mod.ObjectHTMLAttributes
import typings.react.mod.OlHTMLAttributes
import typings.react.mod.OptgroupHTMLAttributes
import typings.react.mod.OptionHTMLAttributes
import typings.react.mod.OutputHTMLAttributes
import typings.react.mod.ParamHTMLAttributes
import typings.react.mod.ProgressHTMLAttributes
import typings.react.mod.QuoteHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.SVGProps
import typings.react.mod.ScriptHTMLAttributes
import typings.react.mod.SelectHTMLAttributes
import typings.react.mod.SourceHTMLAttributes
import typings.react.mod.StyleHTMLAttributes
import typings.react.mod.TableHTMLAttributes
import typings.react.mod.TdHTMLAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.react.mod.ThHTMLAttributes
import typings.react.mod.TimeHTMLAttributes
import typings.react.mod.TrackHTMLAttributes
import typings.react.mod.ValidationMap
import typings.react.mod.VideoHTMLAttributes
import typings.react.mod.WebViewHTMLAttributes
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
import typings.storybookComponents.PartialPickSelectHTMLAttr
import typings.storybookComponents.PropsWithChildrenPickSeleAbout
import typings.storybookComponents.WeakValidationMapPickSele
import typings.storybookComponents.storybookComponentsStrings.`object`
import typings.storybookComponents.storybookComponentsStrings.`var`
import typings.storybookComponents.storybookComponentsStrings.a
import typings.storybookComponents.storybookComponentsStrings.abbr
import typings.storybookComponents.storybookComponentsStrings.address
import typings.storybookComponents.storybookComponentsStrings.animate
import typings.storybookComponents.storybookComponentsStrings.animateMotion
import typings.storybookComponents.storybookComponentsStrings.animateTransform
import typings.storybookComponents.storybookComponentsStrings.area
import typings.storybookComponents.storybookComponentsStrings.article
import typings.storybookComponents.storybookComponentsStrings.aside
import typings.storybookComponents.storybookComponentsStrings.audio
import typings.storybookComponents.storybookComponentsStrings.b
import typings.storybookComponents.storybookComponentsStrings.base
import typings.storybookComponents.storybookComponentsStrings.bdi
import typings.storybookComponents.storybookComponentsStrings.bdo
import typings.storybookComponents.storybookComponentsStrings.big
import typings.storybookComponents.storybookComponentsStrings.blockquote
import typings.storybookComponents.storybookComponentsStrings.body
import typings.storybookComponents.storybookComponentsStrings.br
import typings.storybookComponents.storybookComponentsStrings.button
import typings.storybookComponents.storybookComponentsStrings.canvas
import typings.storybookComponents.storybookComponentsStrings.caption
import typings.storybookComponents.storybookComponentsStrings.circle
import typings.storybookComponents.storybookComponentsStrings.cite
import typings.storybookComponents.storybookComponentsStrings.clipPath
import typings.storybookComponents.storybookComponentsStrings.code
import typings.storybookComponents.storybookComponentsStrings.col
import typings.storybookComponents.storybookComponentsStrings.colgroup
import typings.storybookComponents.storybookComponentsStrings.data
import typings.storybookComponents.storybookComponentsStrings.datalist
import typings.storybookComponents.storybookComponentsStrings.dd
import typings.storybookComponents.storybookComponentsStrings.defs
import typings.storybookComponents.storybookComponentsStrings.del
import typings.storybookComponents.storybookComponentsStrings.desc
import typings.storybookComponents.storybookComponentsStrings.details
import typings.storybookComponents.storybookComponentsStrings.dfn
import typings.storybookComponents.storybookComponentsStrings.dialog
import typings.storybookComponents.storybookComponentsStrings.div
import typings.storybookComponents.storybookComponentsStrings.dl
import typings.storybookComponents.storybookComponentsStrings.dt
import typings.storybookComponents.storybookComponentsStrings.ellipse
import typings.storybookComponents.storybookComponentsStrings.em
import typings.storybookComponents.storybookComponentsStrings.embed
import typings.storybookComponents.storybookComponentsStrings.feBlend
import typings.storybookComponents.storybookComponentsStrings.feColorMatrix
import typings.storybookComponents.storybookComponentsStrings.feComponentTransfer
import typings.storybookComponents.storybookComponentsStrings.feComposite
import typings.storybookComponents.storybookComponentsStrings.feConvolveMatrix
import typings.storybookComponents.storybookComponentsStrings.feDiffuseLighting
import typings.storybookComponents.storybookComponentsStrings.feDisplacementMap
import typings.storybookComponents.storybookComponentsStrings.feDistantLight
import typings.storybookComponents.storybookComponentsStrings.feDropShadow
import typings.storybookComponents.storybookComponentsStrings.feFlood
import typings.storybookComponents.storybookComponentsStrings.feFuncA
import typings.storybookComponents.storybookComponentsStrings.feFuncB
import typings.storybookComponents.storybookComponentsStrings.feFuncG
import typings.storybookComponents.storybookComponentsStrings.feFuncR
import typings.storybookComponents.storybookComponentsStrings.feGaussianBlur
import typings.storybookComponents.storybookComponentsStrings.feImage
import typings.storybookComponents.storybookComponentsStrings.feMerge
import typings.storybookComponents.storybookComponentsStrings.feMergeNode
import typings.storybookComponents.storybookComponentsStrings.feMorphology
import typings.storybookComponents.storybookComponentsStrings.feOffset
import typings.storybookComponents.storybookComponentsStrings.fePointLight
import typings.storybookComponents.storybookComponentsStrings.feSpecularLighting
import typings.storybookComponents.storybookComponentsStrings.feSpotLight
import typings.storybookComponents.storybookComponentsStrings.feTile
import typings.storybookComponents.storybookComponentsStrings.feTurbulence
import typings.storybookComponents.storybookComponentsStrings.fieldset
import typings.storybookComponents.storybookComponentsStrings.figcaption
import typings.storybookComponents.storybookComponentsStrings.figure
import typings.storybookComponents.storybookComponentsStrings.filter
import typings.storybookComponents.storybookComponentsStrings.footer
import typings.storybookComponents.storybookComponentsStrings.foreignObject
import typings.storybookComponents.storybookComponentsStrings.form
import typings.storybookComponents.storybookComponentsStrings.g
import typings.storybookComponents.storybookComponentsStrings.h1
import typings.storybookComponents.storybookComponentsStrings.h2
import typings.storybookComponents.storybookComponentsStrings.h3
import typings.storybookComponents.storybookComponentsStrings.h4
import typings.storybookComponents.storybookComponentsStrings.h5
import typings.storybookComponents.storybookComponentsStrings.h6
import typings.storybookComponents.storybookComponentsStrings.head
import typings.storybookComponents.storybookComponentsStrings.header
import typings.storybookComponents.storybookComponentsStrings.hgroup
import typings.storybookComponents.storybookComponentsStrings.hr
import typings.storybookComponents.storybookComponentsStrings.html
import typings.storybookComponents.storybookComponentsStrings.i
import typings.storybookComponents.storybookComponentsStrings.iframe
import typings.storybookComponents.storybookComponentsStrings.image
import typings.storybookComponents.storybookComponentsStrings.img
import typings.storybookComponents.storybookComponentsStrings.input
import typings.storybookComponents.storybookComponentsStrings.ins
import typings.storybookComponents.storybookComponentsStrings.kbd
import typings.storybookComponents.storybookComponentsStrings.keygen
import typings.storybookComponents.storybookComponentsStrings.label
import typings.storybookComponents.storybookComponentsStrings.legend
import typings.storybookComponents.storybookComponentsStrings.li
import typings.storybookComponents.storybookComponentsStrings.line
import typings.storybookComponents.storybookComponentsStrings.linearGradient
import typings.storybookComponents.storybookComponentsStrings.link
import typings.storybookComponents.storybookComponentsStrings.main
import typings.storybookComponents.storybookComponentsStrings.map
import typings.storybookComponents.storybookComponentsStrings.mark
import typings.storybookComponents.storybookComponentsStrings.marker
import typings.storybookComponents.storybookComponentsStrings.mask
import typings.storybookComponents.storybookComponentsStrings.menu
import typings.storybookComponents.storybookComponentsStrings.menuitem
import typings.storybookComponents.storybookComponentsStrings.meta
import typings.storybookComponents.storybookComponentsStrings.metadata
import typings.storybookComponents.storybookComponentsStrings.meter
import typings.storybookComponents.storybookComponentsStrings.mpath
import typings.storybookComponents.storybookComponentsStrings.nav
import typings.storybookComponents.storybookComponentsStrings.noindex
import typings.storybookComponents.storybookComponentsStrings.noscript
import typings.storybookComponents.storybookComponentsStrings.ol
import typings.storybookComponents.storybookComponentsStrings.optgroup
import typings.storybookComponents.storybookComponentsStrings.option
import typings.storybookComponents.storybookComponentsStrings.output
import typings.storybookComponents.storybookComponentsStrings.p
import typings.storybookComponents.storybookComponentsStrings.param
import typings.storybookComponents.storybookComponentsStrings.path
import typings.storybookComponents.storybookComponentsStrings.pattern
import typings.storybookComponents.storybookComponentsStrings.picture
import typings.storybookComponents.storybookComponentsStrings.polygon
import typings.storybookComponents.storybookComponentsStrings.polyline
import typings.storybookComponents.storybookComponentsStrings.pre
import typings.storybookComponents.storybookComponentsStrings.progress
import typings.storybookComponents.storybookComponentsStrings.q
import typings.storybookComponents.storybookComponentsStrings.radialGradient
import typings.storybookComponents.storybookComponentsStrings.rect
import typings.storybookComponents.storybookComponentsStrings.rp
import typings.storybookComponents.storybookComponentsStrings.rt
import typings.storybookComponents.storybookComponentsStrings.ruby
import typings.storybookComponents.storybookComponentsStrings.s
import typings.storybookComponents.storybookComponentsStrings.samp
import typings.storybookComponents.storybookComponentsStrings.script
import typings.storybookComponents.storybookComponentsStrings.section
import typings.storybookComponents.storybookComponentsStrings.select
import typings.storybookComponents.storybookComponentsStrings.small
import typings.storybookComponents.storybookComponentsStrings.source
import typings.storybookComponents.storybookComponentsStrings.span
import typings.storybookComponents.storybookComponentsStrings.stop
import typings.storybookComponents.storybookComponentsStrings.strong
import typings.storybookComponents.storybookComponentsStrings.style
import typings.storybookComponents.storybookComponentsStrings.sub
import typings.storybookComponents.storybookComponentsStrings.summary
import typings.storybookComponents.storybookComponentsStrings.sup
import typings.storybookComponents.storybookComponentsStrings.svg
import typings.storybookComponents.storybookComponentsStrings.switch
import typings.storybookComponents.storybookComponentsStrings.symbol
import typings.storybookComponents.storybookComponentsStrings.table
import typings.storybookComponents.storybookComponentsStrings.tbody
import typings.storybookComponents.storybookComponentsStrings.td
import typings.storybookComponents.storybookComponentsStrings.template
import typings.storybookComponents.storybookComponentsStrings.text
import typings.storybookComponents.storybookComponentsStrings.textPath
import typings.storybookComponents.storybookComponentsStrings.textarea
import typings.storybookComponents.storybookComponentsStrings.tfoot
import typings.storybookComponents.storybookComponentsStrings.th
import typings.storybookComponents.storybookComponentsStrings.thead
import typings.storybookComponents.storybookComponentsStrings.time
import typings.storybookComponents.storybookComponentsStrings.title
import typings.storybookComponents.storybookComponentsStrings.tr
import typings.storybookComponents.storybookComponentsStrings.track
import typings.storybookComponents.storybookComponentsStrings.tspan
import typings.storybookComponents.storybookComponentsStrings.u
import typings.storybookComponents.storybookComponentsStrings.ul
import typings.storybookComponents.storybookComponentsStrings.use
import typings.storybookComponents.storybookComponentsStrings.video
import typings.storybookComponents.storybookComponentsStrings.view
import typings.storybookComponents.storybookComponentsStrings.wbr
import typings.storybookComponents.storybookComponentsStrings.webview
import typings.storybookTheming.typesMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/components/dist/form/input/input", "Select")
@js.native
object Select extends js.Object {
  var __emotion_styles: js.Any = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialPickSelectHTMLAttr] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapPickSele] = js.native
  def apply(props: PropsWithChildrenPickSeleAbout): ReactElement | Null = js.native
  def apply(props: PropsWithChildrenPickSeleAbout, context: js.Any): ReactElement | Null = js.native
  def withComponent[Tag /* <: ComponentType[_] */](tag: Tag): StyledComponent[PropsOf[Tag], SelectProps, Theme] = js.native
  /**
    * @desc this method is type-unsafe
    */
  @JSName("withComponent")
  def withComponent_a(tag: a): StyledComponent[
    DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_abbr(tag: abbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_address(tag: address): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_animate(tag: animate): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_animateMotion(tag: animateMotion): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_animateTransform(tag: animateTransform): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_area(tag: area): StyledComponent[
    DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_article(tag: article): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_aside(tag: aside): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_audio(tag: audio): StyledComponent[
    DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_b(tag: b): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_base(tag: base): StyledComponent[
    DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_bdi(tag: bdi): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_bdo(tag: bdo): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_big(tag: big): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_blockquote(tag: blockquote): StyledComponent[
    DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLElement], HTMLElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_body(tag: body): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_br(tag: br): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_button(tag: button): StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_canvas(tag: canvas): StyledComponent[
    DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_caption(tag: caption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_circle(tag: circle): StyledComponent[SVGProps[SVGCircleElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_cite(tag: cite): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_clipPath(tag: clipPath): StyledComponent[SVGProps[SVGClipPathElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_code(tag: code): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_col(tag: col): StyledComponent[
    DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_colgroup(tag: colgroup): StyledComponent[
    DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_data(tag: data): StyledComponent[
    DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_datalist(tag: datalist): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_dd(tag: dd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_defs(tag: defs): StyledComponent[SVGProps[SVGDefsElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_del(tag: del): StyledComponent[DetailedHTMLProps[DelHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_desc(tag: desc): StyledComponent[SVGProps[SVGDescElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_details(tag: details): StyledComponent[
    DetailedHTMLProps[DetailsHTMLAttributes[HTMLElement], HTMLElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_dfn(tag: dfn): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_dialog(tag: dialog): StyledComponent[
    DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_div(tag: div): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_dl(tag: dl): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_dt(tag: dt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_ellipse(tag: ellipse): StyledComponent[SVGProps[SVGEllipseElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_em(tag: em): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_embed(tag: embed): StyledComponent[
    DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_feBlend(tag: feBlend): StyledComponent[SVGProps[SVGFEBlendElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feColorMatrix(tag: feColorMatrix): StyledComponent[SVGProps[SVGFEColorMatrixElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feComponentTransfer(tag: feComponentTransfer): StyledComponent[SVGProps[SVGFEComponentTransferElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feComposite(tag: feComposite): StyledComponent[SVGProps[SVGFECompositeElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feConvolveMatrix(tag: feConvolveMatrix): StyledComponent[SVGProps[SVGFEConvolveMatrixElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feDiffuseLighting(tag: feDiffuseLighting): StyledComponent[SVGProps[SVGFEDiffuseLightingElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feDisplacementMap(tag: feDisplacementMap): StyledComponent[SVGProps[SVGFEDisplacementMapElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feDistantLight(tag: feDistantLight): StyledComponent[SVGProps[SVGFEDistantLightElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feDropShadow(tag: feDropShadow): StyledComponent[SVGProps[SVGFEDropShadowElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feFlood(tag: feFlood): StyledComponent[SVGProps[SVGFEFloodElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feFuncA(tag: feFuncA): StyledComponent[SVGProps[SVGFEFuncAElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feFuncB(tag: feFuncB): StyledComponent[SVGProps[SVGFEFuncBElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feFuncG(tag: feFuncG): StyledComponent[SVGProps[SVGFEFuncGElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feFuncR(tag: feFuncR): StyledComponent[SVGProps[SVGFEFuncRElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feGaussianBlur(tag: feGaussianBlur): StyledComponent[SVGProps[SVGFEGaussianBlurElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feImage(tag: feImage): StyledComponent[SVGProps[SVGFEImageElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feMerge(tag: feMerge): StyledComponent[SVGProps[SVGFEMergeElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feMergeNode(tag: feMergeNode): StyledComponent[SVGProps[SVGFEMergeNodeElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feMorphology(tag: feMorphology): StyledComponent[SVGProps[SVGFEMorphologyElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feOffset(tag: feOffset): StyledComponent[SVGProps[SVGFEOffsetElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_fePointLight(tag: fePointLight): StyledComponent[SVGProps[SVGFEPointLightElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feSpecularLighting(tag: feSpecularLighting): StyledComponent[SVGProps[SVGFESpecularLightingElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feSpotLight(tag: feSpotLight): StyledComponent[SVGProps[SVGFESpotLightElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feTile(tag: feTile): StyledComponent[SVGProps[SVGFETileElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_feTurbulence(tag: feTurbulence): StyledComponent[SVGProps[SVGFETurbulenceElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_fieldset(tag: fieldset): StyledComponent[
    DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_figcaption(tag: figcaption): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_figure(tag: figure): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_filter(tag: filter): StyledComponent[SVGProps[SVGFilterElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_footer(tag: footer): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_foreignObject(tag: foreignObject): StyledComponent[SVGProps[SVGForeignObjectElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_form(tag: form): StyledComponent[
    DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_g(tag: g): StyledComponent[SVGProps[SVGGElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_h1(tag: h1): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_h2(tag: h2): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_h3(tag: h3): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_h4(tag: h4): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_h5(tag: h5): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_h6(tag: h6): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_head(tag: head): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_header(tag: header): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_hgroup(tag: hgroup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_hr(tag: hr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_html(tag: html): StyledComponent[
    DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_i(tag: i): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_iframe(tag: iframe): StyledComponent[
    DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_image(tag: image): StyledComponent[SVGProps[SVGImageElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_img(tag: img): StyledComponent[
    DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_input(tag: input): StyledComponent[
    DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_ins(tag: ins): StyledComponent[
    DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_kbd(tag: kbd): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_keygen(tag: keygen): StyledComponent[
    DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_label(tag: label): StyledComponent[
    DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_legend(tag: legend): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_li(tag: li): StyledComponent[
    DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_line(tag: line): StyledComponent[SVGProps[SVGLineElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_linearGradient(tag: linearGradient): StyledComponent[SVGProps[SVGLinearGradientElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_link(tag: link): StyledComponent[
    DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_main(tag: main): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_map(tag: map): StyledComponent[
    DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_mark(tag: mark): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_marker(tag: marker): StyledComponent[SVGProps[SVGMarkerElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_mask(tag: mask): StyledComponent[SVGProps[SVGMaskElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_menu(tag: menu): StyledComponent[DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_menuitem(tag: menuitem): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_meta(tag: meta): StyledComponent[
    DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_metadata(tag: metadata): StyledComponent[SVGProps[SVGMetadataElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_meter(tag: meter): StyledComponent[DetailedHTMLProps[MeterHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_mpath(tag: mpath): StyledComponent[SVGProps[SVGElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_nav(tag: nav): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_noindex(tag: noindex): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_noscript(tag: noscript): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_object(tag: `object`): StyledComponent[
    DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_ol(tag: ol): StyledComponent[
    DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_optgroup(tag: optgroup): StyledComponent[
    DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_option(tag: option): StyledComponent[
    DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_output(tag: output): StyledComponent[
    DetailedHTMLProps[OutputHTMLAttributes[HTMLElement], HTMLElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_p(tag: p): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_param(tag: param): StyledComponent[
    DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_path(tag: path): StyledComponent[SVGProps[SVGPathElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_pattern(tag: pattern): StyledComponent[SVGProps[SVGPatternElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_picture(tag: picture): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_polygon(tag: polygon): StyledComponent[SVGProps[SVGPolygonElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_polyline(tag: polyline): StyledComponent[SVGProps[SVGPolylineElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_pre(tag: pre): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_progress(tag: progress): StyledComponent[
    DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_q(tag: q): StyledComponent[
    DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_radialGradient(tag: radialGradient): StyledComponent[SVGProps[SVGRadialGradientElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_rect(tag: rect): StyledComponent[SVGProps[SVGRectElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_rp(tag: rp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_rt(tag: rt): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_ruby(tag: ruby): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_s(tag: s): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_samp(tag: samp): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_script(tag: script): StyledComponent[
    DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_section(tag: section): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_select(tag: select): StyledComponent[
    DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_small(tag: small): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_source(tag: source): StyledComponent[
    DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_span(tag: span): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_stop(tag: stop): StyledComponent[SVGProps[SVGStopElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_strong(tag: strong): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_style(tag: style): StyledComponent[
    DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_sub(tag: sub): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_summary(tag: summary): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_sup(tag: sup): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_svg(tag: svg): StyledComponent[SVGProps[SVGSVGElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_switch(tag: switch): StyledComponent[SVGProps[SVGSwitchElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_symbol(tag: symbol): StyledComponent[SVGProps[SVGSymbolElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_table(tag: table): StyledComponent[
    DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_tbody(tag: tbody): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_td(tag: td): StyledComponent[
    DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_template(tag: template): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_text(tag: text): StyledComponent[SVGProps[SVGTextElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_textPath(tag: textPath): StyledComponent[SVGProps[SVGTextPathElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_textarea(tag: textarea): StyledComponent[
    DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_tfoot(tag: tfoot): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_th(tag: th): StyledComponent[
    DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_thead(tag: thead): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_time(tag: time): StyledComponent[DetailedHTMLProps[TimeHTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_title(tag: title): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_tr(tag: tr): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_track(tag: track): StyledComponent[
    DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_tspan(tag: tspan): StyledComponent[SVGProps[SVGTSpanElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_u(tag: u): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_ul(tag: ul): StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_use(tag: use): StyledComponent[SVGProps[SVGUseElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_var(tag: `var`): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_video(tag: video): StyledComponent[
    DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement], 
    SelectProps, 
    Theme
  ] = js.native
  @JSName("withComponent")
  def withComponent_view(tag: view): StyledComponent[SVGProps[SVGViewElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_wbr(tag: wbr): StyledComponent[DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement], SelectProps, Theme] = js.native
  @JSName("withComponent")
  def withComponent_webview(tag: webview): StyledComponent[
    DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement], 
    SelectProps, 
    Theme
  ] = js.native
}

