package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentNode
  extends StObject
     with Node {
  
  /**
    * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  /* standard dom */
  def append(nodes: (Node | java.lang.String)*): Unit = js.native
  
  /* standard dom */
  val childElementCount: Double = js.native
  
  /** Returns the child elements. */
  /* standard dom */
  val children: HTMLCollection = js.native
  
  /** Returns the first child that is an element, and null otherwise. */
  /* standard dom */
  val firstElementChild: Element | Null = js.native
  
  /** Returns the last child that is an element, and null otherwise. */
  /* standard dom */
  val lastElementChild: Element | Null = js.native
  
  /**
    * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  /* standard dom */
  def prepend(nodes: (Node | java.lang.String)*): Unit = js.native
  
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feImage")
  def querySelector(selectors: "feImage"): SVGFEImageElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_rect")
  def querySelector(selectors: "rect"): SVGRectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_del")
  def querySelector(selectors: "del"): HTMLModElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h5")
  def querySelector(selectors: "h5"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feColorMatrix")
  def querySelector(selectors: "feColorMatrix"): SVGFEColorMatrixElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_track")
  def querySelector(selectors: "track"): HTMLTrackElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ol")
  def querySelector(selectors: "ol"): HTMLOListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_em")
  def querySelector(selectors: "em"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_g")
  def querySelector(selectors: "g"): SVGGElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h4")
  def querySelector(selectors: "h4"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feSpotLight")
  def querySelector(selectors: "feSpotLight"): SVGFESpotLightElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_td")
  def querySelector(selectors: "td"): HTMLTableCellElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_br")
  def querySelector(selectors: "br"): HTMLBRElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_thead")
  def querySelector(selectors: "thead"): HTMLTableSectionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_figure")
  def querySelector(selectors: "figure"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_div")
  def querySelector(selectors: "div"): HTMLDivElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_sub")
  def querySelector(selectors: "sub"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_abbr")
  def querySelector(selectors: "abbr"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_blockquote")
  def querySelector(selectors: "blockquote"): HTMLQuoteElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feDistantLight")
  def querySelector(selectors: "feDistantLight"): SVGFEDistantLightElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_footer")
  def querySelector(selectors: "footer"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncR")
  def querySelector(selectors: "feFuncR"): SVGFEFuncRElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_body")
  def querySelector(selectors: "body"): HTMLBodyElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_mpath")
  def querySelector(selectors: "mpath"): SVGMPathElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_input")
  def querySelector(selectors: "input"): HTMLInputElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feComposite")
  def querySelector(selectors: "feComposite"): SVGFECompositeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_textarea")
  def querySelector(selectors: "textarea"): HTMLTextAreaElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_form")
  def querySelector(selectors: "form"): HTMLFormElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_s")
  def querySelector(selectors: "s"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_select")
  def querySelector(selectors: "select"): HTMLSelectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_script")
  def querySelector(selectors: "script"): HTMLScriptElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncA")
  def querySelector(selectors: "feFuncA"): SVGFEFuncAElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_col")
  def querySelector(selectors: "col"): HTMLTableColElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_link")
  def querySelector(selectors: "link"): HTMLLinkElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feTile")
  def querySelector(selectors: "feTile"): SVGFETileElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_picture")
  def querySelector(selectors: "picture"): HTMLPictureElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_foreignObject")
  def querySelector(selectors: "foreignObject"): SVGForeignObjectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_animate")
  def querySelector(selectors: "animate"): SVGAnimateElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_bdo")
  def querySelector(selectors: "bdo"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_animateTransform")
  def querySelector(selectors: "animateTransform"): SVGAnimateTransformElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_filter")
  def querySelector(selectors: "filter"): SVGFilterElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_svg")
  def querySelector(selectors: "svg"): SVGSVGElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_caption")
  def querySelector(selectors: "caption"): HTMLTableCaptionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ruby")
  def querySelector(selectors: "ruby"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feBlend")
  def querySelector(selectors: "feBlend"): SVGFEBlendElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tr")
  def querySelector(selectors: "tr"): HTMLTableRowElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h6")
  def querySelector(selectors: "h6"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_use")
  def querySelector(selectors: "use"): SVGUseElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tfoot")
  def querySelector(selectors: "tfoot"): HTMLTableSectionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_output")
  def querySelector(selectors: "output"): HTMLOutputElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dialog")
  def querySelector(selectors: "dialog"): HTMLDialogElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_audio")
  def querySelector(selectors: "audio"): HTMLAudioElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_colgroup")
  def querySelector(selectors: "colgroup"): HTMLTableColElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_option")
  def querySelector(selectors: "option"): HTMLOptionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_path")
  def querySelector(selectors: "path"): SVGPathElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feMorphology")
  def querySelector(selectors: "feMorphology"): SVGFEMorphologyElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feOffset")
  def querySelector(selectors: "feOffset"): SVGFEOffsetElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_img")
  def querySelector(selectors: "img"): HTMLImageElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_strong")
  def querySelector(selectors: "strong"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_video")
  def querySelector(selectors: "video"): HTMLVideoElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_menu")
  def querySelector(selectors: "menu"): HTMLMenuElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_rt")
  def querySelector(selectors: "rt"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feMerge")
  def querySelector(selectors: "feMerge"): SVGFEMergeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_main")
  def querySelector(selectors: "main"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_sup")
  def querySelector(selectors: "sup"): HTMLElement | Null = js.native
  /** Returns the first element that is a descendant of node that matches selectors. */
  /* standard dom */
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_a")
  def querySelector(selectors: "a"): HTMLAnchorElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_fieldset")
  def querySelector(selectors: "fieldset"): HTMLFieldSetElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_image")
  def querySelector(selectors: "image"): SVGImageElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_switch")
  def querySelector(selectors: "switch"): SVGSwitchElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_wbr")
  def querySelector(selectors: "wbr"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_p")
  def querySelector(selectors: "p"): HTMLParagraphElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_style")
  def querySelector(selectors: "style"): HTMLStyleElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h2")
  def querySelector(selectors: "h2"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feDropShadow")
  def querySelector(selectors: "feDropShadow"): SVGFEDropShadowElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_pattern")
  def querySelector(selectors: "pattern"): SVGPatternElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_marker")
  def querySelector(selectors: "marker"): SVGMarkerElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_mark")
  def querySelector(selectors: "mark"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_linearGradient")
  def querySelector(selectors: "linearGradient"): SVGLinearGradientElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFlood")
  def querySelector(selectors: "feFlood"): SVGFEFloodElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_th")
  def querySelector(selectors: "th"): HTMLTableCellElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_set")
  def querySelector(selectors: "set"): SVGSetElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_animateMotion")
  def querySelector(selectors: "animateMotion"): SVGAnimateMotionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feGaussianBlur")
  def querySelector(selectors: "feGaussianBlur"): SVGFEGaussianBlurElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_desc")
  def querySelector(selectors: "desc"): SVGDescElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_pre")
  def querySelector(selectors: "pre"): HTMLPreElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_meta")
  def querySelector(selectors: "meta"): HTMLMetaElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_li")
  def querySelector(selectors: "li"): HTMLLIElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_span")
  def querySelector(selectors: "span"): HTMLSpanElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_polyline")
  def querySelector(selectors: "polyline"): SVGPolylineElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_head")
  def querySelector(selectors: "head"): HTMLHeadElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_address")
  def querySelector(selectors: "address"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dd")
  def querySelector(selectors: "dd"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_time")
  def querySelector(selectors: "time"): HTMLTimeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_noscript")
  def querySelector(selectors: "noscript"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_rp")
  def querySelector(selectors: "rp"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_area")
  def querySelector(selectors: "area"): HTMLAreaElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ul")
  def querySelector(selectors: "ul"): HTMLUListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_mask")
  def querySelector(selectors: "mask"): SVGMaskElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h1")
  def querySelector(selectors: "h1"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_details")
  def querySelector(selectors: "details"): HTMLDetailsElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_hr")
  def querySelector(selectors: "hr"): HTMLHRElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_polygon")
  def querySelector(selectors: "polygon"): SVGPolygonElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_slot")
  def querySelector(selectors: "slot"): HTMLSlotElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ins")
  def querySelector(selectors: "ins"): HTMLModElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_cite")
  def querySelector(selectors: "cite"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tbody")
  def querySelector(selectors: "tbody"): HTMLTableSectionElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_nav")
  def querySelector(selectors: "nav"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_html")
  def querySelector(selectors: "html"): HTMLHtmlElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_textPath")
  def querySelector(selectors: "textPath"): SVGTextPathElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_table")
  def querySelector(selectors: "table"): HTMLTableElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_circle")
  def querySelector(selectors: "circle"): SVGCircleElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_iframe")
  def querySelector(selectors: "iframe"): HTMLIFrameElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_article")
  def querySelector(selectors: "article"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_stop")
  def querySelector(selectors: "stop"): SVGStopElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_b")
  def querySelector(selectors: "b"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_label")
  def querySelector(selectors: "label"): HTMLLabelElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_section")
  def querySelector(selectors: "section"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_template")
  def querySelector(selectors: "template"): HTMLTemplateElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dl")
  def querySelector(selectors: "dl"): HTMLDListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_var")
  def querySelector(selectors: "var"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_h3")
  def querySelector(selectors: "h3"): HTMLHeadingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feConvolveMatrix")
  def querySelector(selectors: "feConvolveMatrix"): SVGFEConvolveMatrixElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_view")
  def querySelector(selectors: "view"): SVGViewElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_ellipse")
  def querySelector(selectors: "ellipse"): SVGEllipseElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_data")
  def querySelector(selectors: "data"): HTMLDataElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_kbd")
  def querySelector(selectors: "kbd"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feMergeNode")
  def querySelector(selectors: "feMergeNode"): SVGFEMergeNodeElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_fePointLight")
  def querySelector(selectors: "fePointLight"): SVGFEPointLightElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_embed")
  def querySelector(selectors: "embed"): HTMLEmbedElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dfn")
  def querySelector(selectors: "dfn"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_clipPath")
  def querySelector(selectors: "clipPath"): SVGClipPathElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_symbol")
  def querySelector(selectors: "symbol"): SVGSymbolElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_bdi")
  def querySelector(selectors: "bdi"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_progress")
  def querySelector(selectors: "progress"): HTMLProgressElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feComponentTransfer")
  def querySelector(selectors: "feComponentTransfer"): SVGFEComponentTransferElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_i")
  def querySelector(selectors: "i"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_tspan")
  def querySelector(selectors: "tspan"): SVGTSpanElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_title")
  def querySelector(selectors: "title"): HTMLTitleElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_source")
  def querySelector(selectors: "source"): HTMLSourceElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_defs")
  def querySelector(selectors: "defs"): SVGDefsElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feSpecularLighting")
  def querySelector(selectors: "feSpecularLighting"): SVGFESpecularLightingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_legend")
  def querySelector(selectors: "legend"): HTMLLegendElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncG")
  def querySelector(selectors: "feFuncG"): SVGFEFuncGElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feDisplacementMap")
  def querySelector(selectors: "feDisplacementMap"): SVGFEDisplacementMapElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_datalist")
  def querySelector(selectors: "datalist"): HTMLDataListElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_u")
  def querySelector(selectors: "u"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_text")
  def querySelector(selectors: "text"): SVGTextElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feTurbulence")
  def querySelector(selectors: "feTurbulence"): SVGFETurbulenceElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_radialGradient")
  def querySelector(selectors: "radialGradient"): SVGRadialGradientElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_aside")
  def querySelector(selectors: "aside"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_optgroup")
  def querySelector(selectors: "optgroup"): HTMLOptGroupElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_meter")
  def querySelector(selectors: "meter"): HTMLMeterElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_summary")
  def querySelector(selectors: "summary"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_map")
  def querySelector(selectors: "map"): HTMLMapElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feDiffuseLighting")
  def querySelector(selectors: "feDiffuseLighting"): SVGFEDiffuseLightingElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_dt")
  def querySelector(selectors: "dt"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_object")
  def querySelector(selectors: "object"): HTMLObjectElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_figcaption")
  def querySelector(selectors: "figcaption"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_samp")
  def querySelector(selectors: "samp"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_small")
  def querySelector(selectors: "small"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_button")
  def querySelector(selectors: "button"): HTMLButtonElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_metadata")
  def querySelector(selectors: "metadata"): SVGMetadataElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_line")
  def querySelector(selectors: "line"): SVGLineElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_feFuncB")
  def querySelector(selectors: "feFuncB"): SVGFEFuncBElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_canvas")
  def querySelector(selectors: "canvas"): HTMLCanvasElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_code")
  def querySelector(selectors: "code"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_base")
  def querySelector(selectors: "base"): HTMLBaseElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_q")
  def querySelector(selectors: "q"): HTMLQuoteElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_hgroup")
  def querySelector(selectors: "hgroup"): HTMLElement | Null = js.native
  @JSName("querySelector")
  @scala.annotation.targetName("querySelector_header")
  def querySelector(selectors: "header"): HTMLElement | Null = js.native
  /* standard dom */
  def querySelector[E /* <: Element */](selectors: java.lang.String): E | Null = js.native
  
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_embed")
  def querySelectorAll(selectors: "embed"): NodeListOf[HTMLEmbedElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_colgroup")
  def querySelectorAll(selectors: "colgroup"): NodeListOf[HTMLTableColElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_desc")
  def querySelectorAll(selectors: "desc"): NodeListOf[SVGDescElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_area")
  def querySelectorAll(selectors: "area"): NodeListOf[HTMLAreaElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_form")
  def querySelectorAll(selectors: "form"): NodeListOf[HTMLFormElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_figcaption")
  def querySelectorAll(selectors: "figcaption"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ins")
  def querySelectorAll(selectors: "ins"): NodeListOf[HTMLModElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_wbr")
  def querySelectorAll(selectors: "wbr"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_time")
  def querySelectorAll(selectors: "time"): NodeListOf[HTMLTimeElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h1")
  def querySelectorAll(selectors: "h1"): NodeListOf[HTMLHeadingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_mpath")
  def querySelectorAll(selectors: "mpath"): NodeListOf[SVGMPathElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_img")
  def querySelectorAll(selectors: "img"): NodeListOf[HTMLImageElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_path")
  def querySelectorAll(selectors: "path"): NodeListOf[SVGPathElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_header")
  def querySelectorAll(selectors: "header"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_legend")
  def querySelectorAll(selectors: "legend"): NodeListOf[HTMLLegendElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_defs")
  def querySelectorAll(selectors: "defs"): NodeListOf[SVGDefsElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_rect")
  def querySelectorAll(selectors: "rect"): NodeListOf[SVGRectElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_polygon")
  def querySelectorAll(selectors: "polygon"): NodeListOf[SVGPolygonElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_link")
  def querySelectorAll(selectors: "link"): NodeListOf[HTMLLinkElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ellipse")
  def querySelectorAll(selectors: "ellipse"): NodeListOf[SVGEllipseElement] = js.native
  /** Returns all element descendants of node that match selectors. */
  /* standard dom */
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_a")
  def querySelectorAll(selectors: "a"): NodeListOf[HTMLAnchorElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_map")
  def querySelectorAll(selectors: "map"): NodeListOf[HTMLMapElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feMerge")
  def querySelectorAll(selectors: "feMerge"): NodeListOf[SVGFEMergeElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_filter")
  def querySelectorAll(selectors: "filter"): NodeListOf[SVGFilterElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_template")
  def querySelectorAll(selectors: "template"): NodeListOf[HTMLTemplateElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_u")
  def querySelectorAll(selectors: "u"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_div")
  def querySelectorAll(selectors: "div"): NodeListOf[HTMLDivElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_video")
  def querySelectorAll(selectors: "video"): NodeListOf[HTMLVideoElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_polyline")
  def querySelectorAll(selectors: "polyline"): NodeListOf[SVGPolylineElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_em")
  def querySelectorAll(selectors: "em"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feImage")
  def querySelectorAll(selectors: "feImage"): NodeListOf[SVGFEImageElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_text")
  def querySelectorAll(selectors: "text"): NodeListOf[SVGTextElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncG")
  def querySelectorAll(selectors: "feFuncG"): NodeListOf[SVGFEFuncGElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_br")
  def querySelectorAll(selectors: "br"): NodeListOf[HTMLBRElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_html")
  def querySelectorAll(selectors: "html"): NodeListOf[HTMLHtmlElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFlood")
  def querySelectorAll(selectors: "feFlood"): NodeListOf[SVGFEFloodElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_th")
  def querySelectorAll(selectors: "th"): NodeListOf[HTMLTableCellElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h2")
  def querySelectorAll(selectors: "h2"): NodeListOf[HTMLHeadingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_pattern")
  def querySelectorAll(selectors: "pattern"): NodeListOf[SVGPatternElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tspan")
  def querySelectorAll(selectors: "tspan"): NodeListOf[SVGTSpanElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feTurbulence")
  def querySelectorAll(selectors: "feTurbulence"): NodeListOf[SVGFETurbulenceElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_g")
  def querySelectorAll(selectors: "g"): NodeListOf[SVGGElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feDiffuseLighting")
  def querySelectorAll(selectors: "feDiffuseLighting"): NodeListOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_radialGradient")
  def querySelectorAll(selectors: "radialGradient"): NodeListOf[SVGRadialGradientElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_progress")
  def querySelectorAll(selectors: "progress"): NodeListOf[HTMLProgressElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_circle")
  def querySelectorAll(selectors: "circle"): NodeListOf[SVGCircleElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_details")
  def querySelectorAll(selectors: "details"): NodeListOf[HTMLDetailsElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_animate")
  def querySelectorAll(selectors: "animate"): NodeListOf[SVGAnimateElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_noscript")
  def querySelectorAll(selectors: "noscript"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_address")
  def querySelectorAll(selectors: "address"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_view")
  def querySelectorAll(selectors: "view"): NodeListOf[SVGViewElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_blockquote")
  def querySelectorAll(selectors: "blockquote"): NodeListOf[HTMLQuoteElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_animateMotion")
  def querySelectorAll(selectors: "animateMotion"): NodeListOf[SVGAnimateMotionElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_col")
  def querySelectorAll(selectors: "col"): NodeListOf[HTMLTableColElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_stop")
  def querySelectorAll(selectors: "stop"): NodeListOf[SVGStopElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_bdi")
  def querySelectorAll(selectors: "bdi"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_clipPath")
  def querySelectorAll(selectors: "clipPath"): NodeListOf[SVGClipPathElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_sub")
  def querySelectorAll(selectors: "sub"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_animateTransform")
  def querySelectorAll(selectors: "animateTransform"): NodeListOf[SVGAnimateTransformElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_marker")
  def querySelectorAll(selectors: "marker"): NodeListOf[SVGMarkerElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_menu")
  def querySelectorAll(selectors: "menu"): NodeListOf[HTMLMenuElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_footer")
  def querySelectorAll(selectors: "footer"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_s")
  def querySelectorAll(selectors: "s"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_cite")
  def querySelectorAll(selectors: "cite"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_b")
  def querySelectorAll(selectors: "b"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_figure")
  def querySelectorAll(selectors: "figure"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_textarea")
  def querySelectorAll(selectors: "textarea"): NodeListOf[HTMLTextAreaElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feTile")
  def querySelectorAll(selectors: "feTile"): NodeListOf[SVGFETileElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_meter")
  def querySelectorAll(selectors: "meter"): NodeListOf[HTMLMeterElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dialog")
  def querySelectorAll(selectors: "dialog"): NodeListOf[HTMLDialogElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feMorphology")
  def querySelectorAll(selectors: "feMorphology"): NodeListOf[SVGFEMorphologyElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_script")
  def querySelectorAll(selectors: "script"): NodeListOf[HTMLScriptElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feComponentTransfer")
  def querySelectorAll(selectors: "feComponentTransfer"): NodeListOf[SVGFEComponentTransferElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_track")
  def querySelectorAll(selectors: "track"): NodeListOf[HTMLTrackElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_label")
  def querySelectorAll(selectors: "label"): NodeListOf[HTMLLabelElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feDistantLight")
  def querySelectorAll(selectors: "feDistantLight"): NodeListOf[SVGFEDistantLightElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_samp")
  def querySelectorAll(selectors: "samp"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_linearGradient")
  def querySelectorAll(selectors: "linearGradient"): NodeListOf[SVGLinearGradientElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_object")
  def querySelectorAll(selectors: "object"): NodeListOf[HTMLObjectElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h5")
  def querySelectorAll(selectors: "h5"): NodeListOf[HTMLHeadingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncA")
  def querySelectorAll(selectors: "feFuncA"): NodeListOf[SVGFEFuncAElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h4")
  def querySelectorAll(selectors: "h4"): NodeListOf[HTMLHeadingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feGaussianBlur")
  def querySelectorAll(selectors: "feGaussianBlur"): NodeListOf[SVGFEGaussianBlurElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feSpecularLighting")
  def querySelectorAll(selectors: "feSpecularLighting"): NodeListOf[SVGFESpecularLightingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_i")
  def querySelectorAll(selectors: "i"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_rp")
  def querySelectorAll(selectors: "rp"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_symbol")
  def querySelectorAll(selectors: "symbol"): NodeListOf[SVGSymbolElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_rt")
  def querySelectorAll(selectors: "rt"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_select")
  def querySelectorAll(selectors: "select"): NodeListOf[HTMLSelectElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_svg")
  def querySelectorAll(selectors: "svg"): NodeListOf[SVGSVGElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_small")
  def querySelectorAll(selectors: "small"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_td")
  def querySelectorAll(selectors: "td"): NodeListOf[HTMLTableCellElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_article")
  def querySelectorAll(selectors: "article"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_style")
  def querySelectorAll(selectors: "style"): NodeListOf[HTMLStyleElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ruby")
  def querySelectorAll(selectors: "ruby"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_source")
  def querySelectorAll(selectors: "source"): NodeListOf[HTMLSourceElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_iframe")
  def querySelectorAll(selectors: "iframe"): NodeListOf[HTMLIFrameElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ol")
  def querySelectorAll(selectors: "ol"): NodeListOf[HTMLOListElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_data")
  def querySelectorAll(selectors: "data"): NodeListOf[HTMLDataElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feMergeNode")
  def querySelectorAll(selectors: "feMergeNode"): NodeListOf[SVGFEMergeNodeElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h6")
  def querySelectorAll(selectors: "h6"): NodeListOf[HTMLHeadingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_mask")
  def querySelectorAll(selectors: "mask"): NodeListOf[SVGMaskElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feDropShadow")
  def querySelectorAll(selectors: "feDropShadow"): NodeListOf[SVGFEDropShadowElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_q")
  def querySelectorAll(selectors: "q"): NodeListOf[HTMLQuoteElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dfn")
  def querySelectorAll(selectors: "dfn"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_output")
  def querySelectorAll(selectors: "output"): NodeListOf[HTMLOutputElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_button")
  def querySelectorAll(selectors: "button"): NodeListOf[HTMLButtonElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_optgroup")
  def querySelectorAll(selectors: "optgroup"): NodeListOf[HTMLOptGroupElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_thead")
  def querySelectorAll(selectors: "thead"): NodeListOf[HTMLTableSectionElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_main")
  def querySelectorAll(selectors: "main"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_picture")
  def querySelectorAll(selectors: "picture"): NodeListOf[HTMLPictureElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_meta")
  def querySelectorAll(selectors: "meta"): NodeListOf[HTMLMetaElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dd")
  def querySelectorAll(selectors: "dd"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_hr")
  def querySelectorAll(selectors: "hr"): NodeListOf[HTMLHRElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feBlend")
  def querySelectorAll(selectors: "feBlend"): NodeListOf[SVGFEBlendElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_metadata")
  def querySelectorAll(selectors: "metadata"): NodeListOf[SVGMetadataElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dl")
  def querySelectorAll(selectors: "dl"): NodeListOf[HTMLDListElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tbody")
  def querySelectorAll(selectors: "tbody"): NodeListOf[HTMLTableSectionElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_kbd")
  def querySelectorAll(selectors: "kbd"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feColorMatrix")
  def querySelectorAll(selectors: "feColorMatrix"): NodeListOf[SVGFEColorMatrixElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_body")
  def querySelectorAll(selectors: "body"): NodeListOf[HTMLBodyElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_section")
  def querySelectorAll(selectors: "section"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_foreignObject")
  def querySelectorAll(selectors: "foreignObject"): NodeListOf[SVGForeignObjectElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_input")
  def querySelectorAll(selectors: "input"): NodeListOf[HTMLInputElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_hgroup")
  def querySelectorAll(selectors: "hgroup"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_audio")
  def querySelectorAll(selectors: "audio"): NodeListOf[HTMLAudioElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_slot")
  def querySelectorAll(selectors: "slot"): NodeListOf[HTMLSlotElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_ul")
  def querySelectorAll(selectors: "ul"): NodeListOf[HTMLUListElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_li")
  def querySelectorAll(selectors: "li"): NodeListOf[HTMLLIElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_fePointLight")
  def querySelectorAll(selectors: "fePointLight"): NodeListOf[SVGFEPointLightElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_p")
  def querySelectorAll(selectors: "p"): NodeListOf[HTMLParagraphElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_span")
  def querySelectorAll(selectors: "span"): NodeListOf[HTMLSpanElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_del")
  def querySelectorAll(selectors: "del"): NodeListOf[HTMLModElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_head")
  def querySelectorAll(selectors: "head"): NodeListOf[HTMLHeadElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_caption")
  def querySelectorAll(selectors: "caption"): NodeListOf[HTMLTableCaptionElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_canvas")
  def querySelectorAll(selectors: "canvas"): NodeListOf[HTMLCanvasElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_nav")
  def querySelectorAll(selectors: "nav"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_dt")
  def querySelectorAll(selectors: "dt"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_strong")
  def querySelectorAll(selectors: "strong"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_sup")
  def querySelectorAll(selectors: "sup"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_switch")
  def querySelectorAll(selectors: "switch"): NodeListOf[SVGSwitchElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feDisplacementMap")
  def querySelectorAll(selectors: "feDisplacementMap"): NodeListOf[SVGFEDisplacementMapElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncB")
  def querySelectorAll(selectors: "feFuncB"): NodeListOf[SVGFEFuncBElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_var")
  def querySelectorAll(selectors: "var"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_pre")
  def querySelectorAll(selectors: "pre"): NodeListOf[HTMLPreElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_summary")
  def querySelectorAll(selectors: "summary"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_base")
  def querySelectorAll(selectors: "base"): NodeListOf[HTMLBaseElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feComposite")
  def querySelectorAll(selectors: "feComposite"): NodeListOf[SVGFECompositeElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feFuncR")
  def querySelectorAll(selectors: "feFuncR"): NodeListOf[SVGFEFuncRElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_line")
  def querySelectorAll(selectors: "line"): NodeListOf[SVGLineElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_table")
  def querySelectorAll(selectors: "table"): NodeListOf[HTMLTableElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feOffset")
  def querySelectorAll(selectors: "feOffset"): NodeListOf[SVGFEOffsetElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_set")
  def querySelectorAll(selectors: "set"): NodeListOf[SVGSetElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_image")
  def querySelectorAll(selectors: "image"): NodeListOf[SVGImageElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_bdo")
  def querySelectorAll(selectors: "bdo"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feSpotLight")
  def querySelectorAll(selectors: "feSpotLight"): NodeListOf[SVGFESpotLightElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_datalist")
  def querySelectorAll(selectors: "datalist"): NodeListOf[HTMLDataListElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_aside")
  def querySelectorAll(selectors: "aside"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_textPath")
  def querySelectorAll(selectors: "textPath"): NodeListOf[SVGTextPathElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_abbr")
  def querySelectorAll(selectors: "abbr"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_h3")
  def querySelectorAll(selectors: "h3"): NodeListOf[HTMLHeadingElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_title")
  def querySelectorAll(selectors: "title"): NodeListOf[HTMLTitleElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_feConvolveMatrix")
  def querySelectorAll(selectors: "feConvolveMatrix"): NodeListOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tfoot")
  def querySelectorAll(selectors: "tfoot"): NodeListOf[HTMLTableSectionElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_use")
  def querySelectorAll(selectors: "use"): NodeListOf[SVGUseElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_fieldset")
  def querySelectorAll(selectors: "fieldset"): NodeListOf[HTMLFieldSetElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_mark")
  def querySelectorAll(selectors: "mark"): NodeListOf[HTMLElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_tr")
  def querySelectorAll(selectors: "tr"): NodeListOf[HTMLTableRowElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_option")
  def querySelectorAll(selectors: "option"): NodeListOf[HTMLOptionElement] = js.native
  @JSName("querySelectorAll")
  @scala.annotation.targetName("querySelectorAll_code")
  def querySelectorAll(selectors: "code"): NodeListOf[HTMLElement] = js.native
  /* standard dom */
  def querySelectorAll[E /* <: Element */](selectors: java.lang.String): NodeListOf[E] = js.native
  
  /**
    * Replace all children of node with nodes, while replacing strings in nodes with equivalent Text nodes.
    *
    * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
    */
  /* standard dom */
  def replaceChildren(nodes: (Node | java.lang.String)*): Unit = js.native
}
