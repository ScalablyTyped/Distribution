package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParentNode extends js.Object {
  val childElementCount: scala.Double = js.native
  /**
    * Returns the child elements.
    */
  val children: HTMLCollection = js.native
  /**
    * Returns the first child that is an element, and null otherwise.
    */
  val firstElementChild: Element | scala.Null = js.native
  /**
    * Returns the last child that is an element, and null otherwise.
    */
  val lastElementChild: Element | scala.Null = js.native
  /**
    * Inserts nodes after the last child of node, while replacing
    * strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def append(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  /**
    * Inserts nodes before the first child of node, while
    * replacing strings in nodes with equivalent Text nodes.
    * Throws a "HierarchyRequestError" DOMException if the constraints of
    * the node tree are violated.
    */
  def prepend(nodes: (Node | java.lang.String)*): scala.Unit = js.native
  def querySelector[E /* <: Element */](selectors: java.lang.String): E | scala.Null = js.native
  def querySelectorAll[E /* <: Element */](selectors: java.lang.String): NodeListOf[E] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_a(selectors: stdLib.stdLibStrings.a): NodeListOf[HTMLAnchorElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_abbr(selectors: stdLib.stdLibStrings.abbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_address(selectors: stdLib.stdLibStrings.address): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_applet(selectors: stdLib.stdLibStrings.applet): NodeListOf[HTMLAppletElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_area(selectors: stdLib.stdLibStrings.area): NodeListOf[HTMLAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_article(selectors: stdLib.stdLibStrings.article): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_aside(selectors: stdLib.stdLibStrings.aside): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_audio(selectors: stdLib.stdLibStrings.audio): NodeListOf[HTMLAudioElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_b(selectors: stdLib.stdLibStrings.b): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_base(selectors: stdLib.stdLibStrings.base): NodeListOf[HTMLBaseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_basefont(selectors: stdLib.stdLibStrings.basefont): NodeListOf[HTMLBaseFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_bdi(selectors: stdLib.stdLibStrings.bdi): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_bdo(selectors: stdLib.stdLibStrings.bdo): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_blockquote(selectors: stdLib.stdLibStrings.blockquote): NodeListOf[HTMLQuoteElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_body(selectors: stdLib.stdLibStrings.body): NodeListOf[HTMLBodyElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_br(selectors: stdLib.stdLibStrings.br): NodeListOf[HTMLBRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_button(selectors: stdLib.stdLibStrings.button): NodeListOf[HTMLButtonElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_canvas(selectors: stdLib.stdLibStrings.canvas): NodeListOf[HTMLCanvasElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_caption(selectors: stdLib.stdLibStrings.caption): NodeListOf[HTMLTableCaptionElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_circle(selectors: stdLib.stdLibStrings.circle): NodeListOf[SVGCircleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_cite(selectors: stdLib.stdLibStrings.cite): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_clipPath(selectors: stdLib.stdLibStrings.clipPath): NodeListOf[SVGClipPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_code(selectors: stdLib.stdLibStrings.code): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_col(selectors: stdLib.stdLibStrings.col): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_colgroup(selectors: stdLib.stdLibStrings.colgroup): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_data(selectors: stdLib.stdLibStrings.data): NodeListOf[HTMLDataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_datalist(selectors: stdLib.stdLibStrings.datalist): NodeListOf[HTMLDataListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dd(selectors: stdLib.stdLibStrings.dd): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_defs(selectors: stdLib.stdLibStrings.defs): NodeListOf[SVGDefsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_del(selectors: stdLib.stdLibStrings.del): NodeListOf[HTMLModElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_desc(selectors: stdLib.stdLibStrings.desc): NodeListOf[SVGDescElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_details(selectors: stdLib.stdLibStrings.details): NodeListOf[HTMLDetailsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dfn(selectors: stdLib.stdLibStrings.dfn): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dialog(selectors: stdLib.stdLibStrings.dialog): NodeListOf[HTMLDialogElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dir(selectors: stdLib.stdLibStrings.dir): NodeListOf[HTMLDirectoryElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_div(selectors: stdLib.stdLibStrings.div): NodeListOf[HTMLDivElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dl(selectors: stdLib.stdLibStrings.dl): NodeListOf[HTMLDListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dt(selectors: stdLib.stdLibStrings.dt): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_ellipse(selectors: stdLib.stdLibStrings.ellipse): NodeListOf[SVGEllipseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_em(selectors: stdLib.stdLibStrings.em): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_embed(selectors: stdLib.stdLibStrings.embed): NodeListOf[HTMLEmbedElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feBlend(selectors: stdLib.stdLibStrings.feBlend): NodeListOf[SVGFEBlendElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feColorMatrix(selectors: stdLib.stdLibStrings.feColorMatrix): NodeListOf[SVGFEColorMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComponentTransfer(selectors: stdLib.stdLibStrings.feComponentTransfer): NodeListOf[SVGFEComponentTransferElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComposite(selectors: stdLib.stdLibStrings.feComposite): NodeListOf[SVGFECompositeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feConvolveMatrix(selectors: stdLib.stdLibStrings.feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDiffuseLighting(selectors: stdLib.stdLibStrings.feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDisplacementMap(selectors: stdLib.stdLibStrings.feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDistantLight(selectors: stdLib.stdLibStrings.feDistantLight): NodeListOf[SVGFEDistantLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFlood(selectors: stdLib.stdLibStrings.feFlood): NodeListOf[SVGFEFloodElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncA(selectors: stdLib.stdLibStrings.feFuncA): NodeListOf[SVGFEFuncAElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncB(selectors: stdLib.stdLibStrings.feFuncB): NodeListOf[SVGFEFuncBElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncG(selectors: stdLib.stdLibStrings.feFuncG): NodeListOf[SVGFEFuncGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncR(selectors: stdLib.stdLibStrings.feFuncR): NodeListOf[SVGFEFuncRElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feGaussianBlur(selectors: stdLib.stdLibStrings.feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feImage(selectors: stdLib.stdLibStrings.feImage): NodeListOf[SVGFEImageElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMerge(selectors: stdLib.stdLibStrings.feMerge): NodeListOf[SVGFEMergeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMergeNode(selectors: stdLib.stdLibStrings.feMergeNode): NodeListOf[SVGFEMergeNodeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMorphology(selectors: stdLib.stdLibStrings.feMorphology): NodeListOf[SVGFEMorphologyElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feOffset(selectors: stdLib.stdLibStrings.feOffset): NodeListOf[SVGFEOffsetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_fePointLight(selectors: stdLib.stdLibStrings.fePointLight): NodeListOf[SVGFEPointLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpecularLighting(selectors: stdLib.stdLibStrings.feSpecularLighting): NodeListOf[SVGFESpecularLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpotLight(selectors: stdLib.stdLibStrings.feSpotLight): NodeListOf[SVGFESpotLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTile(selectors: stdLib.stdLibStrings.feTile): NodeListOf[SVGFETileElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTurbulence(selectors: stdLib.stdLibStrings.feTurbulence): NodeListOf[SVGFETurbulenceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_fieldset(selectors: stdLib.stdLibStrings.fieldset): NodeListOf[HTMLFieldSetElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figcaption(selectors: stdLib.stdLibStrings.figcaption): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figure(selectors: stdLib.stdLibStrings.figure): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_filter(selectors: stdLib.stdLibStrings.filter): NodeListOf[SVGFilterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_font(selectors: stdLib.stdLibStrings.font): NodeListOf[HTMLFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_footer(selectors: stdLib.stdLibStrings.footer): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_foreignObject(selectors: stdLib.stdLibStrings.foreignObject): NodeListOf[SVGForeignObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_form(selectors: stdLib.stdLibStrings.form): NodeListOf[HTMLFormElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frame(selectors: stdLib.stdLibStrings.frame): NodeListOf[HTMLFrameElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frameset(selectors: stdLib.stdLibStrings.frameset): NodeListOf[HTMLFrameSetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_g(selectors: stdLib.stdLibStrings.g): NodeListOf[SVGGElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h1(selectors: stdLib.stdLibStrings.h1): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h2(selectors: stdLib.stdLibStrings.h2): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h3(selectors: stdLib.stdLibStrings.h3): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h4(selectors: stdLib.stdLibStrings.h4): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h5(selectors: stdLib.stdLibStrings.h5): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h6(selectors: stdLib.stdLibStrings.h6): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_head(selectors: stdLib.stdLibStrings.head): NodeListOf[HTMLHeadElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_header(selectors: stdLib.stdLibStrings.header): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hgroup(selectors: stdLib.stdLibStrings.hgroup): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hr(selectors: stdLib.stdLibStrings.hr): NodeListOf[HTMLHRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_html(selectors: stdLib.stdLibStrings.html): NodeListOf[HTMLHtmlElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_i(selectors: stdLib.stdLibStrings.i): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_iframe(selectors: stdLib.stdLibStrings.iframe): NodeListOf[HTMLIFrameElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_image(selectors: stdLib.stdLibStrings.image): NodeListOf[SVGImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_img(selectors: stdLib.stdLibStrings.img): NodeListOf[HTMLImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_input(selectors: stdLib.stdLibStrings.input): NodeListOf[HTMLInputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ins(selectors: stdLib.stdLibStrings.ins): NodeListOf[HTMLModElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_kbd(selectors: stdLib.stdLibStrings.kbd): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_label(selectors: stdLib.stdLibStrings.label): NodeListOf[HTMLLabelElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_legend(selectors: stdLib.stdLibStrings.legend): NodeListOf[HTMLLegendElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_li(selectors: stdLib.stdLibStrings.li): NodeListOf[HTMLLIElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_line(selectors: stdLib.stdLibStrings.line): NodeListOf[SVGLineElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_linearGradient(selectors: stdLib.stdLibStrings.linearGradient): NodeListOf[SVGLinearGradientElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_link(selectors: stdLib.stdLibStrings.link): NodeListOf[HTMLLinkElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_main(selectors: stdLib.stdLibStrings.main): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_map(selectors: stdLib.stdLibStrings.map): NodeListOf[HTMLMapElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_mark(selectors: stdLib.stdLibStrings.mark): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_marker(selectors: stdLib.stdLibStrings.marker): NodeListOf[SVGMarkerElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_marquee(selectors: stdLib.stdLibStrings.marquee): NodeListOf[HTMLMarqueeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_mask(selectors: stdLib.stdLibStrings.mask): NodeListOf[SVGMaskElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_menu(selectors: stdLib.stdLibStrings.menu): NodeListOf[HTMLMenuElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meta(selectors: stdLib.stdLibStrings.meta): NodeListOf[HTMLMetaElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_metadata(selectors: stdLib.stdLibStrings.metadata): NodeListOf[SVGMetadataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meter(selectors: stdLib.stdLibStrings.meter): NodeListOf[HTMLMeterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_nav(selectors: stdLib.stdLibStrings.nav): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_noscript(selectors: stdLib.stdLibStrings.noscript): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_object(selectors: stdLib.stdLibStrings.`object`): NodeListOf[HTMLObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ol(selectors: stdLib.stdLibStrings.ol): NodeListOf[HTMLOListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_optgroup(selectors: stdLib.stdLibStrings.optgroup): NodeListOf[HTMLOptGroupElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_option(selectors: stdLib.stdLibStrings.option): NodeListOf[HTMLOptionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_output(selectors: stdLib.stdLibStrings.output): NodeListOf[HTMLOutputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_p(selectors: stdLib.stdLibStrings.p): NodeListOf[HTMLParagraphElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_param(selectors: stdLib.stdLibStrings.param): NodeListOf[HTMLParamElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_path(selectors: stdLib.stdLibStrings.path): NodeListOf[SVGPathElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_pattern(selectors: stdLib.stdLibStrings.pattern): NodeListOf[SVGPatternElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_picture(selectors: stdLib.stdLibStrings.picture): NodeListOf[HTMLPictureElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polygon(selectors: stdLib.stdLibStrings.polygon): NodeListOf[SVGPolygonElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polyline(selectors: stdLib.stdLibStrings.polyline): NodeListOf[SVGPolylineElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_pre(selectors: stdLib.stdLibStrings.pre): NodeListOf[HTMLPreElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_progress(selectors: stdLib.stdLibStrings.progress): NodeListOf[HTMLProgressElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_q(selectors: stdLib.stdLibStrings.q): NodeListOf[HTMLQuoteElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_radialGradient(selectors: stdLib.stdLibStrings.radialGradient): NodeListOf[SVGRadialGradientElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_rect(selectors: stdLib.stdLibStrings.rect): NodeListOf[SVGRectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_rp(selectors: stdLib.stdLibStrings.rp): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_rt(selectors: stdLib.stdLibStrings.rt): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ruby(selectors: stdLib.stdLibStrings.ruby): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_s(selectors: stdLib.stdLibStrings.s): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_samp(selectors: stdLib.stdLibStrings.samp): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_script(selectors: stdLib.stdLibStrings.script): NodeListOf[HTMLScriptElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_section(selectors: stdLib.stdLibStrings.section): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_select(selectors: stdLib.stdLibStrings.select): NodeListOf[HTMLSelectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_slot(selectors: stdLib.stdLibStrings.slot): NodeListOf[HTMLSlotElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_small(selectors: stdLib.stdLibStrings.small): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_source(selectors: stdLib.stdLibStrings.source): NodeListOf[HTMLSourceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_span(selectors: stdLib.stdLibStrings.span): NodeListOf[HTMLSpanElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_stop(selectors: stdLib.stdLibStrings.stop): NodeListOf[SVGStopElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_strong(selectors: stdLib.stdLibStrings.strong): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_style(selectors: stdLib.stdLibStrings.style): NodeListOf[HTMLStyleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sub(selectors: stdLib.stdLibStrings.sub): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_summary(selectors: stdLib.stdLibStrings.summary): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sup(selectors: stdLib.stdLibStrings.sup): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_svg(selectors: stdLib.stdLibStrings.svg): NodeListOf[SVGSVGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_switch(selectors: stdLib.stdLibStrings.switch): NodeListOf[SVGSwitchElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_symbol(selectors: stdLib.stdLibStrings.symbol): NodeListOf[SVGSymbolElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_table(selectors: stdLib.stdLibStrings.table): NodeListOf[HTMLTableElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tbody(selectors: stdLib.stdLibStrings.tbody): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_td(selectors: stdLib.stdLibStrings.td): NodeListOf[HTMLTableDataCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_template(selectors: stdLib.stdLibStrings.template): NodeListOf[HTMLTemplateElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_text(selectors: stdLib.stdLibStrings.text): NodeListOf[SVGTextElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_textPath(selectors: stdLib.stdLibStrings.textPath): NodeListOf[SVGTextPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_textarea(selectors: stdLib.stdLibStrings.textarea): NodeListOf[HTMLTextAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tfoot(selectors: stdLib.stdLibStrings.tfoot): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_th(selectors: stdLib.stdLibStrings.th): NodeListOf[HTMLTableHeaderCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_thead(selectors: stdLib.stdLibStrings.thead): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_time(selectors: stdLib.stdLibStrings.time): NodeListOf[HTMLTimeElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_title(selectors: stdLib.stdLibStrings.title): NodeListOf[HTMLTitleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tr(selectors: stdLib.stdLibStrings.tr): NodeListOf[HTMLTableRowElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_track(selectors: stdLib.stdLibStrings.track): NodeListOf[HTMLTrackElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_tspan(selectors: stdLib.stdLibStrings.tspan): NodeListOf[SVGTSpanElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_u(selectors: stdLib.stdLibStrings.u): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ul(selectors: stdLib.stdLibStrings.ul): NodeListOf[HTMLUListElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_use(selectors: stdLib.stdLibStrings.use): NodeListOf[SVGUseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_var(selectors: stdLib.stdLibStrings.`var`): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_video(selectors: stdLib.stdLibStrings.video): NodeListOf[HTMLVideoElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_view(selectors: stdLib.stdLibStrings.view): NodeListOf[SVGViewElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_wbr(selectors: stdLib.stdLibStrings.wbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_a(selectors: stdLib.stdLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_abbr(selectors: stdLib.stdLibStrings.abbr): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_address(selectors: stdLib.stdLibStrings.address): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_applet(selectors: stdLib.stdLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_area(selectors: stdLib.stdLibStrings.area): HTMLAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_article(selectors: stdLib.stdLibStrings.article): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_aside(selectors: stdLib.stdLibStrings.aside): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_audio(selectors: stdLib.stdLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_b(selectors: stdLib.stdLibStrings.b): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_base(selectors: stdLib.stdLibStrings.base): HTMLBaseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_basefont(selectors: stdLib.stdLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_bdi(selectors: stdLib.stdLibStrings.bdi): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_bdo(selectors: stdLib.stdLibStrings.bdo): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_blockquote(selectors: stdLib.stdLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_body(selectors: stdLib.stdLibStrings.body): HTMLBodyElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_br(selectors: stdLib.stdLibStrings.br): HTMLBRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_button(selectors: stdLib.stdLibStrings.button): HTMLButtonElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_canvas(selectors: stdLib.stdLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_caption(selectors: stdLib.stdLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_circle(selectors: stdLib.stdLibStrings.circle): SVGCircleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_cite(selectors: stdLib.stdLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_clipPath(selectors: stdLib.stdLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_code(selectors: stdLib.stdLibStrings.code): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_col(selectors: stdLib.stdLibStrings.col): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_colgroup(selectors: stdLib.stdLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_data(selectors: stdLib.stdLibStrings.data): HTMLDataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_datalist(selectors: stdLib.stdLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dd(selectors: stdLib.stdLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_defs(selectors: stdLib.stdLibStrings.defs): SVGDefsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_del(selectors: stdLib.stdLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_desc(selectors: stdLib.stdLibStrings.desc): SVGDescElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_details(selectors: stdLib.stdLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dfn(selectors: stdLib.stdLibStrings.dfn): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dialog(selectors: stdLib.stdLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dir(selectors: stdLib.stdLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_div(selectors: stdLib.stdLibStrings.div): HTMLDivElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dl(selectors: stdLib.stdLibStrings.dl): HTMLDListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dt(selectors: stdLib.stdLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_ellipse(selectors: stdLib.stdLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_em(selectors: stdLib.stdLibStrings.em): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_embed(selectors: stdLib.stdLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feBlend(selectors: stdLib.stdLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feColorMatrix(selectors: stdLib.stdLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComponentTransfer(selectors: stdLib.stdLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComposite(selectors: stdLib.stdLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feConvolveMatrix(selectors: stdLib.stdLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDiffuseLighting(selectors: stdLib.stdLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDisplacementMap(selectors: stdLib.stdLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDistantLight(selectors: stdLib.stdLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFlood(selectors: stdLib.stdLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncA(selectors: stdLib.stdLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncB(selectors: stdLib.stdLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncG(selectors: stdLib.stdLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncR(selectors: stdLib.stdLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feGaussianBlur(selectors: stdLib.stdLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feImage(selectors: stdLib.stdLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMerge(selectors: stdLib.stdLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMergeNode(selectors: stdLib.stdLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMorphology(selectors: stdLib.stdLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feOffset(selectors: stdLib.stdLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_fePointLight(selectors: stdLib.stdLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpecularLighting(selectors: stdLib.stdLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpotLight(selectors: stdLib.stdLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTile(selectors: stdLib.stdLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTurbulence(selectors: stdLib.stdLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_fieldset(selectors: stdLib.stdLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figcaption(selectors: stdLib.stdLibStrings.figcaption): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figure(selectors: stdLib.stdLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_filter(selectors: stdLib.stdLibStrings.filter): SVGFilterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_font(selectors: stdLib.stdLibStrings.font): HTMLFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_footer(selectors: stdLib.stdLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_foreignObject(selectors: stdLib.stdLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_form(selectors: stdLib.stdLibStrings.form): HTMLFormElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frame(selectors: stdLib.stdLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frameset(selectors: stdLib.stdLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_g(selectors: stdLib.stdLibStrings.g): SVGGElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h1(selectors: stdLib.stdLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h2(selectors: stdLib.stdLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h3(selectors: stdLib.stdLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h4(selectors: stdLib.stdLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h5(selectors: stdLib.stdLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h6(selectors: stdLib.stdLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_head(selectors: stdLib.stdLibStrings.head): HTMLHeadElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_header(selectors: stdLib.stdLibStrings.header): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hgroup(selectors: stdLib.stdLibStrings.hgroup): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hr(selectors: stdLib.stdLibStrings.hr): HTMLHRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_html(selectors: stdLib.stdLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_i(selectors: stdLib.stdLibStrings.i): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_iframe(selectors: stdLib.stdLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_image(selectors: stdLib.stdLibStrings.image): SVGImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_img(selectors: stdLib.stdLibStrings.img): HTMLImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_input(selectors: stdLib.stdLibStrings.input): HTMLInputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ins(selectors: stdLib.stdLibStrings.ins): HTMLModElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_kbd(selectors: stdLib.stdLibStrings.kbd): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_label(selectors: stdLib.stdLibStrings.label): HTMLLabelElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_legend(selectors: stdLib.stdLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_li(selectors: stdLib.stdLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_line(selectors: stdLib.stdLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_linearGradient(selectors: stdLib.stdLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_link(selectors: stdLib.stdLibStrings.link): HTMLLinkElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_main(selectors: stdLib.stdLibStrings.main): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_map(selectors: stdLib.stdLibStrings.map): HTMLMapElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_mark(selectors: stdLib.stdLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_marker(selectors: stdLib.stdLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_marquee(selectors: stdLib.stdLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_mask(selectors: stdLib.stdLibStrings.mask): SVGMaskElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_menu(selectors: stdLib.stdLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meta(selectors: stdLib.stdLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_metadata(selectors: stdLib.stdLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meter(selectors: stdLib.stdLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_nav(selectors: stdLib.stdLibStrings.nav): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_noscript(selectors: stdLib.stdLibStrings.noscript): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_object(selectors: stdLib.stdLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ol(selectors: stdLib.stdLibStrings.ol): HTMLOListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_optgroup(selectors: stdLib.stdLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_option(selectors: stdLib.stdLibStrings.option): HTMLOptionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_output(selectors: stdLib.stdLibStrings.output): HTMLOutputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_p(selectors: stdLib.stdLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_param(selectors: stdLib.stdLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_path(selectors: stdLib.stdLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_pattern(selectors: stdLib.stdLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_picture(selectors: stdLib.stdLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polygon(selectors: stdLib.stdLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polyline(selectors: stdLib.stdLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_pre(selectors: stdLib.stdLibStrings.pre): HTMLPreElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_progress(selectors: stdLib.stdLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_q(selectors: stdLib.stdLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_radialGradient(selectors: stdLib.stdLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_rect(selectors: stdLib.stdLibStrings.rect): SVGRectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_rp(selectors: stdLib.stdLibStrings.rp): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_rt(selectors: stdLib.stdLibStrings.rt): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ruby(selectors: stdLib.stdLibStrings.ruby): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_s(selectors: stdLib.stdLibStrings.s): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_samp(selectors: stdLib.stdLibStrings.samp): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_script(selectors: stdLib.stdLibStrings.script): HTMLScriptElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_section(selectors: stdLib.stdLibStrings.section): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_select(selectors: stdLib.stdLibStrings.select): HTMLSelectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_slot(selectors: stdLib.stdLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_small(selectors: stdLib.stdLibStrings.small): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_source(selectors: stdLib.stdLibStrings.source): HTMLSourceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_span(selectors: stdLib.stdLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_stop(selectors: stdLib.stdLibStrings.stop): SVGStopElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_strong(selectors: stdLib.stdLibStrings.strong): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_style(selectors: stdLib.stdLibStrings.style): HTMLStyleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sub(selectors: stdLib.stdLibStrings.sub): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_summary(selectors: stdLib.stdLibStrings.summary): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sup(selectors: stdLib.stdLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_svg(selectors: stdLib.stdLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_switch(selectors: stdLib.stdLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_symbol(selectors: stdLib.stdLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_table(selectors: stdLib.stdLibStrings.table): HTMLTableElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tbody(selectors: stdLib.stdLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_td(selectors: stdLib.stdLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_template(selectors: stdLib.stdLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_text(selectors: stdLib.stdLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_textPath(selectors: stdLib.stdLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_textarea(selectors: stdLib.stdLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tfoot(selectors: stdLib.stdLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_th(selectors: stdLib.stdLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_thead(selectors: stdLib.stdLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_time(selectors: stdLib.stdLibStrings.time): HTMLTimeElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_title(selectors: stdLib.stdLibStrings.title): HTMLTitleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tr(selectors: stdLib.stdLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_track(selectors: stdLib.stdLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_tspan(selectors: stdLib.stdLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_u(selectors: stdLib.stdLibStrings.u): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ul(selectors: stdLib.stdLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_use(selectors: stdLib.stdLibStrings.use): SVGUseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_var(selectors: stdLib.stdLibStrings.`var`): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_video(selectors: stdLib.stdLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_view(selectors: stdLib.stdLibStrings.view): SVGViewElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_wbr(selectors: stdLib.stdLibStrings.wbr): HTMLElement | scala.Null = js.native
}

