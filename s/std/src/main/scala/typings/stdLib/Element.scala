package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Element is the most general base class from which all objects in a Document inherit. It only has methods and properties common to all kinds of elements. More specific classes inherit from Element. */
@js.native
trait Element
  extends ChildNode
     with ParentNode
     with NonDocumentTypeChildNode
     with Slotable
     with InnerHTML
     with Animatable {
  val attributes: NamedNodeMap = js.native
  /**
    * Allows for manipulation of element's class content attribute as a
    * set of whitespace-separated tokens through a DOMTokenList object.
    */
  val classList: DOMTokenList = js.native
  /**
    * Returns the value of element's class content attribute. Can be set
    * to change it.
    */
  var className: java.lang.String = js.native
  val clientHeight: scala.Double = js.native
  val clientLeft: scala.Double = js.native
  val clientTop: scala.Double = js.native
  val clientWidth: scala.Double = js.native
  /**
    * Returns the value of element's id content attribute. Can be set to
    * change it.
    */
  var id: java.lang.String = js.native
  /**
    * Returns the local name.
    */
  val localName: java.lang.String = js.native
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var outerHTML: java.lang.String = js.native
  /**
    * Returns the namespace prefix.
    */
  val prefix: java.lang.String | scala.Null = js.native
  val scrollHeight: scala.Double = js.native
  var scrollLeft: scala.Double = js.native
  var scrollTop: scala.Double = js.native
  val scrollWidth: scala.Double = js.native
  /**
    * Returns element's shadow root, if any, and if shadow root's mode is "open", and null otherwise.
    */
  val shadowRoot: ShadowRoot | scala.Null = js.native
  /**
    * Returns the value of element's slot content attribute. Can be set to
    * change it.
    */
  var slot: java.lang.String = js.native
  /**
    * Returns the HTML-uppercased qualified name.
    */
  val tagName: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Creates a shadow root for element and returns it.
    */
  def attachShadow(init: ShadowRootInit): ShadowRoot = js.native
  def closest(selector: java.lang.String): Element | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_a(selector: stdLib.stdLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  @JSName("closest")
  def closest_abbr(selector: stdLib.stdLibStrings.abbr): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_address(selector: stdLib.stdLibStrings.address): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_applet(selector: stdLib.stdLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  @JSName("closest")
  def closest_area(selector: stdLib.stdLibStrings.area): HTMLAreaElement | scala.Null = js.native
  @JSName("closest")
  def closest_article(selector: stdLib.stdLibStrings.article): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_aside(selector: stdLib.stdLibStrings.aside): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_audio(selector: stdLib.stdLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  @JSName("closest")
  def closest_b(selector: stdLib.stdLibStrings.b): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_base(selector: stdLib.stdLibStrings.base): HTMLBaseElement | scala.Null = js.native
  @JSName("closest")
  def closest_basefont(selector: stdLib.stdLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  @JSName("closest")
  def closest_bdi(selector: stdLib.stdLibStrings.bdi): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_bdo(selector: stdLib.stdLibStrings.bdo): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_blockquote(selector: stdLib.stdLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  @JSName("closest")
  def closest_body(selector: stdLib.stdLibStrings.body): HTMLBodyElement | scala.Null = js.native
  @JSName("closest")
  def closest_br(selector: stdLib.stdLibStrings.br): HTMLBRElement | scala.Null = js.native
  @JSName("closest")
  def closest_button(selector: stdLib.stdLibStrings.button): HTMLButtonElement | scala.Null = js.native
  @JSName("closest")
  def closest_canvas(selector: stdLib.stdLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  @JSName("closest")
  def closest_caption(selector: stdLib.stdLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("closest")
  def closest_circle(selector: stdLib.stdLibStrings.circle): SVGCircleElement | scala.Null = js.native
  @JSName("closest")
  def closest_cite(selector: stdLib.stdLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_clipPath(selector: stdLib.stdLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  @JSName("closest")
  def closest_code(selector: stdLib.stdLibStrings.code): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_col(selector: stdLib.stdLibStrings.col): HTMLTableColElement | scala.Null = js.native
  @JSName("closest")
  def closest_colgroup(selector: stdLib.stdLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  @JSName("closest")
  def closest_data(selector: stdLib.stdLibStrings.data): HTMLDataElement | scala.Null = js.native
  @JSName("closest")
  def closest_datalist(selector: stdLib.stdLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  @JSName("closest")
  def closest_dd(selector: stdLib.stdLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_defs(selector: stdLib.stdLibStrings.defs): SVGDefsElement | scala.Null = js.native
  @JSName("closest")
  def closest_del(selector: stdLib.stdLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("closest")
  def closest_desc(selector: stdLib.stdLibStrings.desc): SVGDescElement | scala.Null = js.native
  @JSName("closest")
  def closest_details(selector: stdLib.stdLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  @JSName("closest")
  def closest_dfn(selector: stdLib.stdLibStrings.dfn): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_dialog(selector: stdLib.stdLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  @JSName("closest")
  def closest_dir(selector: stdLib.stdLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  @JSName("closest")
  def closest_div(selector: stdLib.stdLibStrings.div): HTMLDivElement | scala.Null = js.native
  @JSName("closest")
  def closest_dl(selector: stdLib.stdLibStrings.dl): HTMLDListElement | scala.Null = js.native
  @JSName("closest")
  def closest_dt(selector: stdLib.stdLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_ellipse(selector: stdLib.stdLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  @JSName("closest")
  def closest_em(selector: stdLib.stdLibStrings.em): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_embed(selector: stdLib.stdLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("closest")
  def closest_feBlend(selector: stdLib.stdLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("closest")
  def closest_feColorMatrix(selector: stdLib.stdLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComponentTransfer(selector: stdLib.stdLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComposite(selector: stdLib.stdLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feConvolveMatrix(selector: stdLib.stdLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDiffuseLighting(selector: stdLib.stdLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDisplacementMap(selector: stdLib.stdLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDistantLight(selector: stdLib.stdLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFlood(selector: stdLib.stdLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncA(selector: stdLib.stdLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncB(selector: stdLib.stdLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncG(selector: stdLib.stdLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncR(selector: stdLib.stdLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("closest")
  def closest_feGaussianBlur(selector: stdLib.stdLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("closest")
  def closest_feImage(selector: stdLib.stdLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMerge(selector: stdLib.stdLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMergeNode(selector: stdLib.stdLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMorphology(selector: stdLib.stdLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("closest")
  def closest_feOffset(selector: stdLib.stdLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("closest")
  def closest_fePointLight(selector: stdLib.stdLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpecularLighting(selector: stdLib.stdLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpotLight(selector: stdLib.stdLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTile(selector: stdLib.stdLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTurbulence(selector: stdLib.stdLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  @JSName("closest")
  def closest_fieldset(selector: stdLib.stdLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  @JSName("closest")
  def closest_figcaption(selector: stdLib.stdLibStrings.figcaption): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_figure(selector: stdLib.stdLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_filter(selector: stdLib.stdLibStrings.filter): SVGFilterElement | scala.Null = js.native
  @JSName("closest")
  def closest_font(selector: stdLib.stdLibStrings.font): HTMLFontElement | scala.Null = js.native
  @JSName("closest")
  def closest_footer(selector: stdLib.stdLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_foreignObject(selector: stdLib.stdLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  @JSName("closest")
  def closest_form(selector: stdLib.stdLibStrings.form): HTMLFormElement | scala.Null = js.native
  @JSName("closest")
  def closest_frame(selector: stdLib.stdLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  @JSName("closest")
  def closest_frameset(selector: stdLib.stdLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("closest")
  def closest_g(selector: stdLib.stdLibStrings.g): SVGGElement | scala.Null = js.native
  @JSName("closest")
  def closest_h1(selector: stdLib.stdLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  @JSName("closest")
  def closest_h2(selector: stdLib.stdLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  @JSName("closest")
  def closest_h3(selector: stdLib.stdLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  @JSName("closest")
  def closest_h4(selector: stdLib.stdLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  @JSName("closest")
  def closest_h5(selector: stdLib.stdLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  @JSName("closest")
  def closest_h6(selector: stdLib.stdLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  @JSName("closest")
  def closest_head(selector: stdLib.stdLibStrings.head): HTMLHeadElement | scala.Null = js.native
  @JSName("closest")
  def closest_header(selector: stdLib.stdLibStrings.header): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_hgroup(selector: stdLib.stdLibStrings.hgroup): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_hr(selector: stdLib.stdLibStrings.hr): HTMLHRElement | scala.Null = js.native
  @JSName("closest")
  def closest_html(selector: stdLib.stdLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  @JSName("closest")
  def closest_i(selector: stdLib.stdLibStrings.i): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_iframe(selector: stdLib.stdLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("closest")
  def closest_image(selector: stdLib.stdLibStrings.image): SVGImageElement | scala.Null = js.native
  @JSName("closest")
  def closest_img(selector: stdLib.stdLibStrings.img): HTMLImageElement | scala.Null = js.native
  @JSName("closest")
  def closest_input(selector: stdLib.stdLibStrings.input): HTMLInputElement | scala.Null = js.native
  @JSName("closest")
  def closest_ins(selector: stdLib.stdLibStrings.ins): HTMLModElement | scala.Null = js.native
  @JSName("closest")
  def closest_kbd(selector: stdLib.stdLibStrings.kbd): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_label(selector: stdLib.stdLibStrings.label): HTMLLabelElement | scala.Null = js.native
  @JSName("closest")
  def closest_legend(selector: stdLib.stdLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  @JSName("closest")
  def closest_li(selector: stdLib.stdLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("closest")
  def closest_line(selector: stdLib.stdLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("closest")
  def closest_linearGradient(selector: stdLib.stdLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  @JSName("closest")
  def closest_link(selector: stdLib.stdLibStrings.link): HTMLLinkElement | scala.Null = js.native
  @JSName("closest")
  def closest_main(selector: stdLib.stdLibStrings.main): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_map(selector: stdLib.stdLibStrings.map): HTMLMapElement | scala.Null = js.native
  @JSName("closest")
  def closest_mark(selector: stdLib.stdLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_marker(selector: stdLib.stdLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  @JSName("closest")
  def closest_marquee(selector: stdLib.stdLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("closest")
  def closest_mask(selector: stdLib.stdLibStrings.mask): SVGMaskElement | scala.Null = js.native
  @JSName("closest")
  def closest_menu(selector: stdLib.stdLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  @JSName("closest")
  def closest_meta(selector: stdLib.stdLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("closest")
  def closest_metadata(selector: stdLib.stdLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  @JSName("closest")
  def closest_meter(selector: stdLib.stdLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  @JSName("closest")
  def closest_nav(selector: stdLib.stdLibStrings.nav): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_noscript(selector: stdLib.stdLibStrings.noscript): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_object(selector: stdLib.stdLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  @JSName("closest")
  def closest_ol(selector: stdLib.stdLibStrings.ol): HTMLOListElement | scala.Null = js.native
  @JSName("closest")
  def closest_optgroup(selector: stdLib.stdLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  @JSName("closest")
  def closest_option(selector: stdLib.stdLibStrings.option): HTMLOptionElement | scala.Null = js.native
  @JSName("closest")
  def closest_output(selector: stdLib.stdLibStrings.output): HTMLOutputElement | scala.Null = js.native
  @JSName("closest")
  def closest_p(selector: stdLib.stdLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  @JSName("closest")
  def closest_param(selector: stdLib.stdLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("closest")
  def closest_path(selector: stdLib.stdLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("closest")
  def closest_pattern(selector: stdLib.stdLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  @JSName("closest")
  def closest_picture(selector: stdLib.stdLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("closest")
  def closest_polygon(selector: stdLib.stdLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("closest")
  def closest_polyline(selector: stdLib.stdLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  @JSName("closest")
  def closest_pre(selector: stdLib.stdLibStrings.pre): HTMLPreElement | scala.Null = js.native
  @JSName("closest")
  def closest_progress(selector: stdLib.stdLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  @JSName("closest")
  def closest_q(selector: stdLib.stdLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("closest")
  def closest_radialGradient(selector: stdLib.stdLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("closest")
  def closest_rect(selector: stdLib.stdLibStrings.rect): SVGRectElement | scala.Null = js.native
  @JSName("closest")
  def closest_rp(selector: stdLib.stdLibStrings.rp): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_rt(selector: stdLib.stdLibStrings.rt): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_ruby(selector: stdLib.stdLibStrings.ruby): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_s(selector: stdLib.stdLibStrings.s): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_samp(selector: stdLib.stdLibStrings.samp): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_script(selector: stdLib.stdLibStrings.script): HTMLScriptElement | scala.Null = js.native
  @JSName("closest")
  def closest_section(selector: stdLib.stdLibStrings.section): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_select(selector: stdLib.stdLibStrings.select): HTMLSelectElement | scala.Null = js.native
  @JSName("closest")
  def closest_slot(selector: stdLib.stdLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  @JSName("closest")
  def closest_small(selector: stdLib.stdLibStrings.small): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_source(selector: stdLib.stdLibStrings.source): HTMLSourceElement | scala.Null = js.native
  @JSName("closest")
  def closest_span(selector: stdLib.stdLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("closest")
  def closest_stop(selector: stdLib.stdLibStrings.stop): SVGStopElement | scala.Null = js.native
  @JSName("closest")
  def closest_strong(selector: stdLib.stdLibStrings.strong): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_style(selector: stdLib.stdLibStrings.style): HTMLStyleElement | scala.Null = js.native
  @JSName("closest")
  def closest_sub(selector: stdLib.stdLibStrings.sub): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_summary(selector: stdLib.stdLibStrings.summary): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_sup(selector: stdLib.stdLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_svg(selector: stdLib.stdLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("closest")
  def closest_switch(selector: stdLib.stdLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("closest")
  def closest_symbol(selector: stdLib.stdLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  @JSName("closest")
  def closest_table(selector: stdLib.stdLibStrings.table): HTMLTableElement | scala.Null = js.native
  @JSName("closest")
  def closest_tbody(selector: stdLib.stdLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  @JSName("closest")
  def closest_td(selector: stdLib.stdLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  @JSName("closest")
  def closest_template(selector: stdLib.stdLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("closest")
  def closest_text(selector: stdLib.stdLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("closest")
  def closest_textPath(selector: stdLib.stdLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  @JSName("closest")
  def closest_textarea(selector: stdLib.stdLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  @JSName("closest")
  def closest_tfoot(selector: stdLib.stdLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  @JSName("closest")
  def closest_th(selector: stdLib.stdLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  @JSName("closest")
  def closest_thead(selector: stdLib.stdLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  @JSName("closest")
  def closest_time(selector: stdLib.stdLibStrings.time): HTMLTimeElement | scala.Null = js.native
  @JSName("closest")
  def closest_title(selector: stdLib.stdLibStrings.title): HTMLTitleElement | scala.Null = js.native
  @JSName("closest")
  def closest_tr(selector: stdLib.stdLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  @JSName("closest")
  def closest_track(selector: stdLib.stdLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("closest")
  def closest_tspan(selector: stdLib.stdLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  @JSName("closest")
  def closest_u(selector: stdLib.stdLibStrings.u): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_ul(selector: stdLib.stdLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("closest")
  def closest_use(selector: stdLib.stdLibStrings.use): SVGUseElement | scala.Null = js.native
  @JSName("closest")
  def closest_var(selector: stdLib.stdLibStrings.`var`): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_video(selector: stdLib.stdLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("closest")
  def closest_view(selector: stdLib.stdLibStrings.view): SVGViewElement | scala.Null = js.native
  @JSName("closest")
  def closest_wbr(selector: stdLib.stdLibStrings.wbr): HTMLElement | scala.Null = js.native
  /**
    * Returns element's first attribute whose qualified name is qualifiedName, and null if there is no such attribute otherwise.
    */
  def getAttribute(qualifiedName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Returns element's attribute whose namespace is namespace and local name is localName, and null if there is
    * no such attribute otherwise.
    */
  def getAttributeNS(namespace: java.lang.String, localName: java.lang.String): java.lang.String | scala.Null = js.native
  def getAttributeNS(namespace: scala.Null, localName: java.lang.String): java.lang.String | scala.Null = js.native
  /**
    * Returns the qualified names of all element's attributes.
    * Can contain duplicates.
    */
  def getAttributeNames(): js.Array[java.lang.String] = js.native
  def getAttributeNode(name: java.lang.String): Attr | scala.Null = js.native
  def getAttributeNodeNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr | scala.Null = js.native
  def getBoundingClientRect(): ClientRect | DOMRect = js.native
  def getClientRects(): ClientRectList | DOMRectList = js.native
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/1999/xhtml`(namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`, localName: java.lang.String): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/2000/svg`(namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`, localName: java.lang.String): HTMLCollectionOf[SVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: stdLib.stdLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: stdLib.stdLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: stdLib.stdLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: stdLib.stdLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: stdLib.stdLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: stdLib.stdLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: stdLib.stdLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: stdLib.stdLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: stdLib.stdLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: stdLib.stdLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: stdLib.stdLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdi(qualifiedName: stdLib.stdLibStrings.bdi): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: stdLib.stdLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: stdLib.stdLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: stdLib.stdLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: stdLib.stdLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: stdLib.stdLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: stdLib.stdLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: stdLib.stdLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: stdLib.stdLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: stdLib.stdLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: stdLib.stdLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: stdLib.stdLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: stdLib.stdLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: stdLib.stdLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: stdLib.stdLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: stdLib.stdLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: stdLib.stdLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: stdLib.stdLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: stdLib.stdLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: stdLib.stdLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: stdLib.stdLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: stdLib.stdLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: stdLib.stdLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: stdLib.stdLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: stdLib.stdLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: stdLib.stdLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: stdLib.stdLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: stdLib.stdLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: stdLib.stdLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_embed(qualifiedName: stdLib.stdLibStrings.embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feBlend(qualifiedName: stdLib.stdLibStrings.feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feColorMatrix(qualifiedName: stdLib.stdLibStrings.feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComponentTransfer(qualifiedName: stdLib.stdLibStrings.feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComposite(qualifiedName: stdLib.stdLibStrings.feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feConvolveMatrix(qualifiedName: stdLib.stdLibStrings.feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDiffuseLighting(qualifiedName: stdLib.stdLibStrings.feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDisplacementMap(qualifiedName: stdLib.stdLibStrings.feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDistantLight(qualifiedName: stdLib.stdLibStrings.feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFlood(qualifiedName: stdLib.stdLibStrings.feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncA(qualifiedName: stdLib.stdLibStrings.feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncB(qualifiedName: stdLib.stdLibStrings.feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncG(qualifiedName: stdLib.stdLibStrings.feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncR(qualifiedName: stdLib.stdLibStrings.feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feGaussianBlur(qualifiedName: stdLib.stdLibStrings.feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feImage(qualifiedName: stdLib.stdLibStrings.feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMerge(qualifiedName: stdLib.stdLibStrings.feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMergeNode(qualifiedName: stdLib.stdLibStrings.feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMorphology(qualifiedName: stdLib.stdLibStrings.feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feOffset(qualifiedName: stdLib.stdLibStrings.feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fePointLight(qualifiedName: stdLib.stdLibStrings.fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpecularLighting(qualifiedName: stdLib.stdLibStrings.feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpotLight(qualifiedName: stdLib.stdLibStrings.feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTile(qualifiedName: stdLib.stdLibStrings.feTile): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTurbulence(qualifiedName: stdLib.stdLibStrings.feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: stdLib.stdLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: stdLib.stdLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: stdLib.stdLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: stdLib.stdLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: stdLib.stdLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: stdLib.stdLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: stdLib.stdLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: stdLib.stdLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: stdLib.stdLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: stdLib.stdLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: stdLib.stdLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: stdLib.stdLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: stdLib.stdLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: stdLib.stdLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: stdLib.stdLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: stdLib.stdLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: stdLib.stdLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: stdLib.stdLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: stdLib.stdLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: stdLib.stdLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: stdLib.stdLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: stdLib.stdLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: stdLib.stdLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: stdLib.stdLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: stdLib.stdLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: stdLib.stdLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: stdLib.stdLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: stdLib.stdLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: stdLib.stdLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: stdLib.stdLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: stdLib.stdLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: stdLib.stdLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: stdLib.stdLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: stdLib.stdLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: stdLib.stdLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_main(qualifiedName: stdLib.stdLibStrings.main): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: stdLib.stdLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: stdLib.stdLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: stdLib.stdLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: stdLib.stdLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: stdLib.stdLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: stdLib.stdLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: stdLib.stdLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: stdLib.stdLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: stdLib.stdLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: stdLib.stdLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: stdLib.stdLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: stdLib.stdLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: stdLib.stdLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: stdLib.stdLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: stdLib.stdLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: stdLib.stdLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: stdLib.stdLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: stdLib.stdLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: stdLib.stdLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: stdLib.stdLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: stdLib.stdLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: stdLib.stdLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: stdLib.stdLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: stdLib.stdLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: stdLib.stdLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: stdLib.stdLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: stdLib.stdLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: stdLib.stdLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rp(qualifiedName: stdLib.stdLibStrings.rp): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: stdLib.stdLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: stdLib.stdLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: stdLib.stdLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: stdLib.stdLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: stdLib.stdLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: stdLib.stdLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: stdLib.stdLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: stdLib.stdLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: stdLib.stdLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: stdLib.stdLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: stdLib.stdLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: stdLib.stdLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: stdLib.stdLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: stdLib.stdLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: stdLib.stdLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_summary(qualifiedName: stdLib.stdLibStrings.summary): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: stdLib.stdLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: stdLib.stdLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: stdLib.stdLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: stdLib.stdLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: stdLib.stdLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: stdLib.stdLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: stdLib.stdLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: stdLib.stdLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: stdLib.stdLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: stdLib.stdLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: stdLib.stdLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: stdLib.stdLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: stdLib.stdLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: stdLib.stdLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: stdLib.stdLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: stdLib.stdLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: stdLib.stdLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: stdLib.stdLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: stdLib.stdLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: stdLib.stdLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: stdLib.stdLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: stdLib.stdLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: stdLib.stdLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: stdLib.stdLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: stdLib.stdLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: stdLib.stdLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Returns true if element has an attribute whose qualified name is qualifiedName, and false otherwise.
    */
  def hasAttribute(qualifiedName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if element has an attribute whose namespace is namespace and local name is localName.
    */
  def hasAttributeNS(namespace: java.lang.String, localName: java.lang.String): scala.Boolean = js.native
  def hasAttributeNS(namespace: scala.Null, localName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns true if element has attributes, and false otherwise.
    */
  def hasAttributes(): scala.Boolean = js.native
  def hasPointerCapture(pointerId: scala.Double): scala.Boolean = js.native
  def insertAdjacentElement(position: InsertPosition, insertedElement: Element): Element | scala.Null = js.native
  def insertAdjacentHTML(where: InsertPosition, html: java.lang.String): scala.Unit = js.native
  def insertAdjacentText(where: InsertPosition, text: java.lang.String): scala.Unit = js.native
  /**
    * Returns true if matching selectors against element's root yields element, and false otherwise.
    */
  def matches(selectors: java.lang.String): scala.Boolean = js.native
  def msGetRegionContent(): js.Any = js.native
  def releasePointerCapture(pointerId: scala.Double): scala.Unit = js.native
  /**
    * Removes element's first attribute whose qualified name is qualifiedName.
    */
  def removeAttribute(qualifiedName: java.lang.String): scala.Unit = js.native
  /**
    * Removes element's attribute whose namespace is namespace and local name is localName.
    */
  def removeAttributeNS(namespace: java.lang.String, localName: java.lang.String): scala.Unit = js.native
  def removeAttributeNS(namespace: scala.Null, localName: java.lang.String): scala.Unit = js.native
  def removeAttributeNode(attr: Attr): Attr = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  /**
    * Displays element fullscreen and resolves promise when done.
    * When supplied, options's navigationUI member indicates whether showing
    * navigation UI while in fullscreen is preferred or not. If set to "show", navigation
    * simplicity is preferred over screen space, and if set to "hide", more screen space
    * is preferred. User agents are always free to honor user preference over the application's. The
    * default value "auto" indicates no application preference.
    */
  def requestFullscreen(): js.Promise[scala.Unit] = js.native
  def requestFullscreen(options: FullscreenOptions): js.Promise[scala.Unit] = js.native
  def requestPointerLock(): scala.Unit = js.native
  def scroll(): scala.Unit = js.native
  def scroll(options: ScrollToOptions): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(): scala.Unit = js.native
  def scrollBy(options: ScrollToOptions): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(arg: scala.Boolean): scala.Unit = js.native
  def scrollIntoView(arg: ScrollIntoViewOptions): scala.Unit = js.native
  def scrollTo(): scala.Unit = js.native
  def scrollTo(options: ScrollToOptions): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Sets the value of element's first attribute whose qualified name is qualifiedName to value.
    */
  def setAttribute(qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Sets the value of element's attribute whose namespace is namespace and local name is localName to value.
    */
  def setAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeNS(namespace: scala.Null, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setAttributeNode(attr: Attr): Attr | scala.Null = js.native
  def setAttributeNodeNS(attr: Attr): Attr | scala.Null = js.native
  def setPointerCapture(pointerId: scala.Double): scala.Unit = js.native
  /**
    * If force is not given, "toggles" qualifiedName, removing it if it is
    * present and adding it if it is not present. If force is true, adds qualifiedName. If force is false, removes qualifiedName.
    * Returns true if qualifiedName is now present, and false otherwise.
    */
  def toggleAttribute(qualifiedName: java.lang.String): scala.Boolean = js.native
  def toggleAttribute(qualifiedName: java.lang.String, force: scala.Boolean): scala.Boolean = js.native
  def webkitMatchesSelector(selectors: java.lang.String): scala.Boolean = js.native
}

@JSGlobal("Element")
@js.native
class ElementCls () extends Element {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
}

@JSGlobal("Element")
@js.native
object Element
  extends org.scalablytyped.runtime.Instantiable0[Element]

