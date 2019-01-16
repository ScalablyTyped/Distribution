package typings
package atSindresorhusIsLib

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
  def querySelectorAll_a(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.a): NodeListOf[HTMLAnchorElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_abbr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.abbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_address(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.address): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_applet(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.applet): NodeListOf[HTMLAppletElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_area(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.area): NodeListOf[HTMLAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_article(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.article): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_aside(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.aside): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_audio(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.audio): NodeListOf[HTMLAudioElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_b(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.b): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_base(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.base): NodeListOf[HTMLBaseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_basefont(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.basefont): NodeListOf[HTMLBaseFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_bdo(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.bdo): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_blockquote(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.blockquote): NodeListOf[HTMLQuoteElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_body(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.body): NodeListOf[HTMLBodyElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_br(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.br): NodeListOf[HTMLBRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_button(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.button): NodeListOf[HTMLButtonElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_canvas(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.canvas): NodeListOf[HTMLCanvasElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_caption(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.caption): NodeListOf[HTMLTableCaptionElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_circle(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.circle): NodeListOf[SVGCircleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_cite(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.cite): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_clipPath(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.clipPath): NodeListOf[SVGClipPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_code(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.code): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_col(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.col): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_colgroup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.colgroup): NodeListOf[HTMLTableColElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_data(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.data): NodeListOf[HTMLDataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_datalist(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.datalist): NodeListOf[HTMLDataListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dd(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dd): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_defs(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.defs): NodeListOf[SVGDefsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_del(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.del): NodeListOf[HTMLModElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_desc(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.desc): NodeListOf[SVGDescElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_details(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.details): NodeListOf[HTMLDetailsElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dfn(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dfn): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dialog(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dialog): NodeListOf[HTMLDialogElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dir(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dir): NodeListOf[HTMLDirectoryElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_div(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.div): NodeListOf[HTMLDivElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dl(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dl): NodeListOf[HTMLDListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_dt(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dt): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_ellipse(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ellipse): NodeListOf[SVGEllipseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_em(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.em): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_embed(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.embed): NodeListOf[HTMLEmbedElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feBlend(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feBlend): NodeListOf[SVGFEBlendElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feColorMatrix(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feColorMatrix): NodeListOf[SVGFEColorMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComponentTransfer(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComponentTransfer): NodeListOf[SVGFEComponentTransferElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feComposite(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComposite): NodeListOf[SVGFECompositeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feConvolveMatrix(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feConvolveMatrix): NodeListOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDiffuseLighting(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDiffuseLighting): NodeListOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDisplacementMap(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDisplacementMap): NodeListOf[SVGFEDisplacementMapElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feDistantLight(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDistantLight): NodeListOf[SVGFEDistantLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFlood(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFlood): NodeListOf[SVGFEFloodElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncA(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncA): NodeListOf[SVGFEFuncAElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncB(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncB): NodeListOf[SVGFEFuncBElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncG(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncG): NodeListOf[SVGFEFuncGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feFuncR(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncR): NodeListOf[SVGFEFuncRElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feGaussianBlur(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feGaussianBlur): NodeListOf[SVGFEGaussianBlurElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feImage(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feImage): NodeListOf[SVGFEImageElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMerge(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMerge): NodeListOf[SVGFEMergeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMergeNode(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMergeNode): NodeListOf[SVGFEMergeNodeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feMorphology(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMorphology): NodeListOf[SVGFEMorphologyElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feOffset(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feOffset): NodeListOf[SVGFEOffsetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_fePointLight(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.fePointLight): NodeListOf[SVGFEPointLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpecularLighting(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpecularLighting): NodeListOf[SVGFESpecularLightingElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feSpotLight(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpotLight): NodeListOf[SVGFESpotLightElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTile(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTile): NodeListOf[SVGFETileElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_feTurbulence(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTurbulence): NodeListOf[SVGFETurbulenceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_fieldset(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.fieldset): NodeListOf[HTMLFieldSetElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figcaption(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.figcaption): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_figure(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.figure): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_filter(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.filter): NodeListOf[SVGFilterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_font(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.font): NodeListOf[HTMLFontElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_footer(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.footer): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_foreignObject(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.foreignObject): NodeListOf[SVGForeignObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_form(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.form): NodeListOf[HTMLFormElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frame(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.frame): NodeListOf[HTMLFrameElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_frameset(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.frameset): NodeListOf[HTMLFrameSetElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_g(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.g): NodeListOf[SVGGElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h1(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h1): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h2(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h2): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h3(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h3): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h4(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h4): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h5(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h5): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_h6(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h6): NodeListOf[HTMLHeadingElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_head(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.head): NodeListOf[HTMLHeadElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_header(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.header): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hgroup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.hgroup): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_hr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.hr): NodeListOf[HTMLHRElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_html(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.html): NodeListOf[HTMLHtmlElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_i(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.i): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_iframe(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.iframe): NodeListOf[HTMLIFrameElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_image(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.image): NodeListOf[SVGImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_img(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.img): NodeListOf[HTMLImageElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_input(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.input): NodeListOf[HTMLInputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ins(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ins): NodeListOf[HTMLModElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_kbd(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.kbd): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_label(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.label): NodeListOf[HTMLLabelElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_legend(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.legend): NodeListOf[HTMLLegendElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_li(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.li): NodeListOf[HTMLLIElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_line(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.line): NodeListOf[SVGLineElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_linearGradient(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.linearGradient): NodeListOf[SVGLinearGradientElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_link(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.link): NodeListOf[HTMLLinkElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_map(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.map): NodeListOf[HTMLMapElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_mark(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.mark): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_marker(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.marker): NodeListOf[SVGMarkerElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_marquee(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.marquee): NodeListOf[HTMLMarqueeElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_mask(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.mask): NodeListOf[SVGMaskElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_menu(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.menu): NodeListOf[HTMLMenuElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meta(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.meta): NodeListOf[HTMLMetaElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_metadata(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.metadata): NodeListOf[SVGMetadataElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_meter(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.meter): NodeListOf[HTMLMeterElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_nav(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.nav): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_noscript(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.noscript): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_object(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.`object`): NodeListOf[HTMLObjectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ol(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ol): NodeListOf[HTMLOListElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_optgroup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.optgroup): NodeListOf[HTMLOptGroupElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_option(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.option): NodeListOf[HTMLOptionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_output(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.output): NodeListOf[HTMLOutputElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_p(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.p): NodeListOf[HTMLParagraphElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_param(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.param): NodeListOf[HTMLParamElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_path(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.path): NodeListOf[SVGPathElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_pattern(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.pattern): NodeListOf[SVGPatternElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_picture(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.picture): NodeListOf[HTMLPictureElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polygon(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.polygon): NodeListOf[SVGPolygonElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_polyline(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.polyline): NodeListOf[SVGPolylineElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_pre(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.pre): NodeListOf[HTMLPreElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_progress(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress): NodeListOf[HTMLProgressElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_q(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.q): NodeListOf[HTMLQuoteElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_radialGradient(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.radialGradient): NodeListOf[SVGRadialGradientElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_rect(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.rect): NodeListOf[SVGRectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_rt(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.rt): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ruby(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ruby): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_s(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.s): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_samp(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.samp): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_script(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.script): NodeListOf[HTMLScriptElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_section(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.section): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_select(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.select): NodeListOf[HTMLSelectElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_slot(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.slot): NodeListOf[HTMLSlotElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_small(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.small): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_source(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.source): NodeListOf[HTMLSourceElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_span(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.span): NodeListOf[HTMLSpanElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_stop(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.stop): NodeListOf[SVGStopElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_strong(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.strong): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_style(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.style): NodeListOf[HTMLStyleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sub(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.sub): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_sup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.sup): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_svg(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.svg): NodeListOf[SVGSVGElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_switch(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.switch): NodeListOf[SVGSwitchElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_symbol(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.symbol): NodeListOf[SVGSymbolElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_table(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.table): NodeListOf[HTMLTableElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tbody(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tbody): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_td(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.td): NodeListOf[HTMLTableDataCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_template(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.template): NodeListOf[HTMLTemplateElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_text(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.text): NodeListOf[SVGTextElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_textPath(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.textPath): NodeListOf[SVGTextPathElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_textarea(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.textarea): NodeListOf[HTMLTextAreaElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tfoot(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tfoot): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_th(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.th): NodeListOf[HTMLTableHeaderCellElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_thead(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.thead): NodeListOf[HTMLTableSectionElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_time(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.time): NodeListOf[HTMLTimeElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_title(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.title): NodeListOf[HTMLTitleElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_tr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tr): NodeListOf[HTMLTableRowElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_track(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.track): NodeListOf[HTMLTrackElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_tspan(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tspan): NodeListOf[SVGTSpanElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_u(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.u): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_ul(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ul): NodeListOf[HTMLUListElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_use(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.use): NodeListOf[SVGUseElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_var(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.`var`): NodeListOf[HTMLElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_video(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.video): NodeListOf[HTMLVideoElement] = js.native
  @JSName("querySelectorAll")
  def querySelectorAll_view(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.view): NodeListOf[SVGViewElement] = js.native
  /**
    * Returns all element descendants of node that
    * match selectors.
    */
  @JSName("querySelectorAll")
  def querySelectorAll_wbr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.wbr): NodeListOf[HTMLElement] = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_a(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.a): HTMLAnchorElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_abbr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.abbr): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_address(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.address): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_applet(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.applet): HTMLAppletElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_area(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.area): HTMLAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_article(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.article): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_aside(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.aside): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_audio(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.audio): HTMLAudioElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_b(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.b): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_base(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.base): HTMLBaseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_basefont(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.basefont): HTMLBaseFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_bdo(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.bdo): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_blockquote(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.blockquote): HTMLQuoteElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_body(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.body): HTMLBodyElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_br(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.br): HTMLBRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_button(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.button): HTMLButtonElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_canvas(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.canvas): HTMLCanvasElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_caption(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.caption): HTMLTableCaptionElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_circle(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.circle): SVGCircleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_cite(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.cite): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_clipPath(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.clipPath): SVGClipPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_code(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.code): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_col(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.col): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_colgroup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.colgroup): HTMLTableColElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_data(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.data): HTMLDataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_datalist(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.datalist): HTMLDataListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dd(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dd): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_defs(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.defs): SVGDefsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_del(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.del): HTMLModElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_desc(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.desc): SVGDescElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_details(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.details): HTMLDetailsElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dfn(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dfn): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dialog(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dialog): HTMLDialogElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dir(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dir): HTMLDirectoryElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_div(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.div): HTMLDivElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dl(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dl): HTMLDListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_dt(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.dt): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_ellipse(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ellipse): SVGEllipseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_em(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.em): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_embed(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.embed): HTMLEmbedElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feBlend(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feBlend): SVGFEBlendElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feColorMatrix(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feColorMatrix): SVGFEColorMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComponentTransfer(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComponentTransfer): SVGFEComponentTransferElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feComposite(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComposite): SVGFECompositeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feConvolveMatrix(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feConvolveMatrix): SVGFEConvolveMatrixElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDiffuseLighting(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDiffuseLighting): SVGFEDiffuseLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDisplacementMap(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDisplacementMap): SVGFEDisplacementMapElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feDistantLight(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDistantLight): SVGFEDistantLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFlood(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFlood): SVGFEFloodElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncA(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncA): SVGFEFuncAElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncB(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncB): SVGFEFuncBElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncG(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncG): SVGFEFuncGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feFuncR(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncR): SVGFEFuncRElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feGaussianBlur(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feGaussianBlur): SVGFEGaussianBlurElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feImage(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feImage): SVGFEImageElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMerge(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMerge): SVGFEMergeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMergeNode(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMergeNode): SVGFEMergeNodeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feMorphology(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMorphology): SVGFEMorphologyElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feOffset(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feOffset): SVGFEOffsetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_fePointLight(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.fePointLight): SVGFEPointLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpecularLighting(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpecularLighting): SVGFESpecularLightingElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feSpotLight(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpotLight): SVGFESpotLightElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTile(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTile): SVGFETileElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_feTurbulence(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTurbulence): SVGFETurbulenceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_fieldset(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.fieldset): HTMLFieldSetElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figcaption(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.figcaption): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_figure(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.figure): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_filter(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.filter): SVGFilterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_font(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.font): HTMLFontElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_footer(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.footer): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_foreignObject(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.foreignObject): SVGForeignObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_form(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.form): HTMLFormElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frame(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.frame): HTMLFrameElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_frameset(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.frameset): HTMLFrameSetElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_g(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.g): SVGGElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h1(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h1): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h2(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h2): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h3(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h3): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h4(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h4): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h5(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h5): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_h6(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.h6): HTMLHeadingElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_head(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.head): HTMLHeadElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_header(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.header): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hgroup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.hgroup): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_hr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.hr): HTMLHRElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_html(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.html): HTMLHtmlElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_i(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.i): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_iframe(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.iframe): HTMLIFrameElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_image(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.image): SVGImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_img(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.img): HTMLImageElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_input(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.input): HTMLInputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ins(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ins): HTMLModElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_kbd(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.kbd): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_label(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.label): HTMLLabelElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_legend(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.legend): HTMLLegendElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_li(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.li): HTMLLIElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_line(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.line): SVGLineElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_linearGradient(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.linearGradient): SVGLinearGradientElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_link(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.link): HTMLLinkElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_map(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.map): HTMLMapElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_mark(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.mark): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_marker(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.marker): SVGMarkerElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_marquee(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.marquee): HTMLMarqueeElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_mask(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.mask): SVGMaskElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_menu(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.menu): HTMLMenuElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meta(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.meta): HTMLMetaElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_metadata(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.metadata): SVGMetadataElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_meter(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.meter): HTMLMeterElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_nav(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.nav): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_noscript(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.noscript): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_object(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.`object`): HTMLObjectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ol(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ol): HTMLOListElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_optgroup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.optgroup): HTMLOptGroupElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_option(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.option): HTMLOptionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_output(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.output): HTMLOutputElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_p(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.p): HTMLParagraphElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_param(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.param): HTMLParamElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_path(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.path): SVGPathElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_pattern(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.pattern): SVGPatternElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_picture(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.picture): HTMLPictureElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polygon(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.polygon): SVGPolygonElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_polyline(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.polyline): SVGPolylineElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_pre(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.pre): HTMLPreElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_progress(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress): HTMLProgressElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_q(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.q): HTMLQuoteElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_radialGradient(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.radialGradient): SVGRadialGradientElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_rect(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.rect): SVGRectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_rt(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.rt): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ruby(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ruby): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_s(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.s): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_samp(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.samp): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_script(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.script): HTMLScriptElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_section(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.section): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_select(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.select): HTMLSelectElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_slot(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.slot): HTMLSlotElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_small(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.small): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_source(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.source): HTMLSourceElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_span(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.span): HTMLSpanElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_stop(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.stop): SVGStopElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_strong(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.strong): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_style(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.style): HTMLStyleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sub(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.sub): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_sup(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.sup): HTMLElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_svg(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.svg): SVGSVGElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_switch(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.switch): SVGSwitchElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_symbol(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.symbol): SVGSymbolElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_table(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.table): HTMLTableElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tbody(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tbody): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_td(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.td): HTMLTableDataCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_template(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.template): HTMLTemplateElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_text(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.text): SVGTextElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_textPath(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.textPath): SVGTextPathElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_textarea(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.textarea): HTMLTextAreaElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tfoot(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tfoot): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_th(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.th): HTMLTableHeaderCellElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_thead(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.thead): HTMLTableSectionElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_time(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.time): HTMLTimeElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_title(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.title): HTMLTitleElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_tr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tr): HTMLTableRowElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_track(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.track): HTMLTrackElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_tspan(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.tspan): SVGTSpanElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_u(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.u): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_ul(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.ul): HTMLUListElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_use(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.use): SVGUseElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_var(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.`var`): HTMLElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_video(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.video): HTMLVideoElement | scala.Null = js.native
  @JSName("querySelector")
  def querySelector_view(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.view): SVGViewElement | scala.Null = js.native
  /**
    * Returns the first element that is a descendant of node that
    * matches selectors.
    */
  @JSName("querySelector")
  def querySelector_wbr(selectors: atSindresorhusIsLib.atSindresorhusIsLibStrings.wbr): HTMLElement | scala.Null = js.native
}

