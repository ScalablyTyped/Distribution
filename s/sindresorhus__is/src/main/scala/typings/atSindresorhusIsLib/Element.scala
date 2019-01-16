package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element
  extends ChildNode
     with ParentNode
     with NonDocumentTypeChildNode
     with Slotable
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
  var innerHTML: java.lang.String = js.native
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
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Creates a shadow root for element and returns it.
    */
  def attachShadow(shadowRootInitDict: ShadowRootInit): ShadowRoot = js.native
  def closest(selector: java.lang.String): Element | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_a(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_abbr(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.abbr): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_address(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.address): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_applet(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_area(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.area): HTMLAreaElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_article(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.article): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_aside(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.aside): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_audio(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_b(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.b): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_base(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.base): HTMLBaseElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_basefont(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_bdo(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.bdo): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_blockquote(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_body(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.body): HTMLBodyElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_br(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.br): HTMLBRElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_button(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.button): HTMLButtonElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_canvas(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_caption(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("closest")
  def closest_circle(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.circle): SVGCircleElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_cite(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_clipPath(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_code(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.code): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_col(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.col): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_colgroup(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_data(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.data): HTMLDataElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_datalist(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dd(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_defs(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.defs): SVGDefsElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_del(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("closest")
  def closest_desc(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.desc): SVGDescElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_details(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dfn(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.dfn): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dialog(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dir(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_div(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.div): HTMLDivElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dl(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.dl): HTMLDListElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_dt(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_ellipse(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_em(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.em): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_embed(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("closest")
  def closest_feBlend(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("closest")
  def closest_feColorMatrix(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComponentTransfer(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("closest")
  def closest_feComposite(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feConvolveMatrix(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDiffuseLighting(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDisplacementMap(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("closest")
  def closest_feDistantLight(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFlood(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncA(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncB(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncG(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("closest")
  def closest_feFuncR(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("closest")
  def closest_feGaussianBlur(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("closest")
  def closest_feImage(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMerge(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMergeNode(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("closest")
  def closest_feMorphology(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("closest")
  def closest_feOffset(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("closest")
  def closest_fePointLight(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpecularLighting(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("closest")
  def closest_feSpotLight(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTile(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("closest")
  def closest_feTurbulence(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_fieldset(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_figcaption(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.figcaption): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_figure(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_filter(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.filter): SVGFilterElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_font(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.font): HTMLFontElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_footer(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_foreignObject(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_form(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.form): HTMLFormElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_frame(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_frameset(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("closest")
  def closest_g(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.g): SVGGElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h1(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h2(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h3(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h4(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h5(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_h6(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_head(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.head): HTMLHeadElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_header(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.header): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_hgroup(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.hgroup): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_hr(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.hr): HTMLHRElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_html(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_i(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.i): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_iframe(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("closest")
  def closest_image(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.image): SVGImageElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_img(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.img): HTMLImageElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_input(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.input): HTMLInputElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ins(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.ins): HTMLModElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_kbd(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.kbd): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_label(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.label): HTMLLabelElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_legend(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_li(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("closest")
  def closest_line(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("closest")
  def closest_linearGradient(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_link(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.link): HTMLLinkElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_map(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.map): HTMLMapElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_mark(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_marker(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_marquee(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("closest")
  def closest_mask(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.mask): SVGMaskElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_menu(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_meta(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("closest")
  def closest_metadata(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_meter(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_nav(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.nav): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_noscript(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.noscript): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_object(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ol(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.ol): HTMLOListElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_optgroup(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_option(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.option): HTMLOptionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_output(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.output): HTMLOutputElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_p(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_param(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("closest")
  def closest_path(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("closest")
  def closest_pattern(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_picture(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("closest")
  def closest_polygon(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("closest")
  def closest_polyline(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_pre(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.pre): HTMLPreElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_progress(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_q(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("closest")
  def closest_radialGradient(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("closest")
  def closest_rect(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.rect): SVGRectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_rt(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.rt): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ruby(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.ruby): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_s(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.s): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_samp(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.samp): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_script(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.script): HTMLScriptElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_section(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.section): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_select(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.select): HTMLSelectElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_slot(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_small(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.small): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_source(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.source): HTMLSourceElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_span(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("closest")
  def closest_stop(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.stop): SVGStopElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_strong(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.strong): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_style(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.style): HTMLStyleElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_sub(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.sub): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_sup(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("closest")
  def closest_svg(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("closest")
  def closest_switch(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("closest")
  def closest_symbol(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_table(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.table): HTMLTableElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_tbody(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_td(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_template(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("closest")
  def closest_text(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("closest")
  def closest_textPath(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_textarea(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_tfoot(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_th(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_thead(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_time(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.time): HTMLTimeElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_title(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.title): HTMLTitleElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_tr(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_track(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("closest")
  def closest_tspan(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_u(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.u): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_ul(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("closest")
  def closest_use(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.use): SVGUseElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_var(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.`var`): HTMLElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_video(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("closest")
  def closest_view(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.view): SVGViewElement | scala.Null = js.native
  /**
    * Returns the first (starting at element) inclusive ancestor that matches selectors, and null otherwise.
    */
  @JSName("closest")
  def closest_wbr(selector: atSindresorhusIsLib.atSindresorhusIsLibStrings.wbr): HTMLElement | scala.Null = js.native
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
  def getAttributeNames(): Array[java.lang.String] = js.native
  def getAttributeNode(name: java.lang.String): Attr | scala.Null = js.native
  def getAttributeNodeNS(namespaceURI: java.lang.String, localName: java.lang.String): Attr | scala.Null = js.native
  def getBoundingClientRect(): ClientRect | DOMRect = js.native
  def getClientRects(): ClientRectList | DOMRectList = js.native
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/1999/xhtml`(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    localName: java.lang.String
  ): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/2000/svg`(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    localName: java.lang.String
  ): HTMLCollectionOf[SVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_embed(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.embed): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feBlend(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feBlend): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feColorMatrix(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feColorMatrix): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComponentTransfer(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComponentTransfer): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feComposite(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComposite): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feConvolveMatrix(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feConvolveMatrix): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDiffuseLighting(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDiffuseLighting): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDisplacementMap(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDisplacementMap): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feDistantLight(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDistantLight): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFlood(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFlood): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncA(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncA): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncB(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncB): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncG(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncG): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feFuncR(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncR): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feGaussianBlur(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feGaussianBlur): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feImage(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feImage): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMerge(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMerge): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMergeNode(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMergeNode): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feMorphology(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMorphology): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feOffset(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feOffset): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fePointLight(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.fePointLight): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpecularLighting(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpecularLighting): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feSpotLight(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpotLight): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTile(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTile): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_feTurbulence(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTurbulence): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
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
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_fullscreenerror(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Displays element fullscreen and resolves promise when done.
    */
  def requestFullscreen(): Promise[scala.Unit] = js.native
  def scroll(): scala.Unit = js.native
  def scroll(options: ScrollToOptions): scala.Unit = js.native
  def scroll(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollBy(): scala.Unit = js.native
  def scrollBy(options: ScrollToOptions): scala.Unit = js.native
  def scrollBy(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(arg: ScrollIntoViewOptions): scala.Unit = js.native
  def scrollIntoView(arg: scala.Boolean): scala.Unit = js.native
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
object Element
  extends org.scalablytyped.runtime.Instantiable0[Element]

