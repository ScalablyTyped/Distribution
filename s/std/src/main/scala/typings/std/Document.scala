package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any web page loaded in the browser and serves as an entry point into the web page's content, which is the DOM tree. */
@js.native
trait Document
  extends StObject
     with DocumentAndElementEventHandlers
     with DocumentOrShadowRoot
     with FontFaceSource
     with GlobalEventHandlers
     with NonElementParentNode
     with ParentNode
     with XPathEvaluatorBase {
  
  /** Sets or gets the URL for the current document. */
  /* standard dom */
  val URL: java.lang.String = js.native
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_readystatechange")
  def addEventListener(`type`: "readystatechange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pointerlockchange")
  def addEventListener(`type`: "pointerlockchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenchange")
  def addEventListener(`type`: "fullscreenchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_visibilitychange")
  def addEventListener(`type`: "visibilitychange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pointerlockerror")
  def addEventListener(`type`: "pointerlockerror", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_DOMContentLoaded")
  def addEventListener(`type`: "DOMContentLoaded", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenerror")
  def addEventListener(`type`: "fullscreenerror", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenchange")
  def addEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenerror")
  def addEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_visibilitychange")
  def addEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pointerlockchange")
  def addEventListener(
    `type`: "pointerlockchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_DOMContentLoaded")
  def addEventListener(
    `type`: "DOMContentLoaded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_readystatechange")
  def addEventListener(
    `type`: "readystatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pointerlockerror")
  def addEventListener(
    `type`: "pointerlockerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pointerlockerror")
  def addEventListener(
    `type`: "pointerlockerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenerror")
  def addEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_pointerlockchange")
  def addEventListener(
    `type`: "pointerlockchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_readystatechange")
  def addEventListener(
    `type`: "readystatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_visibilitychange")
  def addEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_fullscreenchange")
  def addEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_DOMContentLoaded")
  def addEventListener(
    `type`: "DOMContentLoaded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Moves node from another document and returns it.
    *
    * If node is a document, throws a "NotSupportedError" DOMException or, if node is a shadow root, throws a "HierarchyRequestError" DOMException.
    */
  /* standard dom */
  def adoptNode[T /* <: Node */](node: T): T = js.native
  
  /**
    * Sets or gets the color of all active links in the document.
    * @deprecated
    */
  /* standard dom */
  var alinkColor: java.lang.String = js.native
  
  /**
    * Returns a reference to the collection of elements contained by the object.
    * @deprecated
    */
  /* standard dom */
  val all: HTMLAllCollection = js.native
  
  /**
    * Retrieves a collection of all a objects that have a name and/or id property. Objects in this collection are in HTML source order.
    * @deprecated
    */
  /* standard dom */
  val anchors: HTMLCollectionOf[HTMLAnchorElement] = js.native
  
  /**
    * Retrieves a collection of all applet objects in the document.
    * @deprecated
    */
  /* standard dom */
  val applets: HTMLCollection = js.native
  
  /**
    * Deprecated. Sets or retrieves a value that indicates the background color behind the object.
    * @deprecated
    */
  /* standard dom */
  var bgColor: java.lang.String = js.native
  
  /** Specifies the beginning and end of the document body. */
  /* standard dom */
  var body: HTMLElement = js.native
  
  /** @deprecated */
  /* standard dom */
  def captureEvents(): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def caretRangeFromPoint(x: Double, y: Double): Range | Null = js.native
  
  /** Returns document's encoding. */
  /* standard dom */
  val characterSet: java.lang.String = js.native
  
  /**
    * Gets or sets the character set used to encode the object.
    * @deprecated This is a legacy alias of `characterSet`.
    */
  /* standard dom */
  val charset: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  def clear(): Unit = js.native
  
  /** Closes an output stream and forces the sent data to display. */
  /* standard dom */
  def close(): Unit = js.native
  
  /** Gets a value that indicates whether standards-compliant mode is switched on for the object. */
  /* standard dom */
  val compatMode: java.lang.String = js.native
  
  /** Returns document's content type. */
  /* standard dom */
  val contentType: java.lang.String = js.native
  
  /**
    * Returns the HTTP cookies that apply to the Document. If there are no cookies or cookies can't be applied to this resource, the empty string will be returned.
    *
    * Can be set, to add a new cookie to the element's set of HTTP cookies.
    *
    * If the contents are sandboxed into a unique origin (e.g. in an iframe with the sandbox attribute), a "SecurityError" DOMException will be thrown on getting and setting.
    */
  /* standard dom */
  var cookie: java.lang.String = js.native
  
  /**
    * Creates an attribute object with a specified name.
    * @param name String that sets the attribute object's name.
    */
  /* standard dom */
  def createAttribute(localName: java.lang.String): Attr = js.native
  
  /* standard dom */
  def createAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String): Attr = js.native
  def createAttributeNS(namespace: Null, qualifiedName: java.lang.String): Attr = js.native
  
  /** Returns a CDATASection node whose data is data. */
  /* standard dom */
  def createCDATASection(data: java.lang.String): CDATASection = js.native
  
  /**
    * Creates a comment object with the specified data.
    * @param data Sets the comment object's data.
    */
  /* standard dom */
  def createComment(data: java.lang.String): Comment = js.native
  
  /** Creates a new document. */
  /* standard dom */
  def createDocumentFragment(): DocumentFragment = js.native
  
  @JSName("createElement")
  @scala.annotation.targetName("createElement_hgroup")
  def createElement(tagName: "hgroup"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_bgsound")
  def createElement(tagName: "bgsound"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_head")
  def createElement(tagName: "head"): HTMLHeadElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dfn")
  def createElement(tagName: "dfn"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_code")
  def createElement(tagName: "code"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_nextid")
  def createElement(tagName: "nextid"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rp")
  def createElement(tagName: "rp"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_title")
  def createElement(tagName: "title"): HTMLTitleElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_font")
  def createElement(tagName: "font"): HTMLFontElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_div")
  def createElement(tagName: "div"): HTMLDivElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rtc")
  def createElement(tagName: "rtc"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_figure")
  def createElement(tagName: "figure"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_bdo")
  def createElement(tagName: "bdo"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_template")
  def createElement(tagName: "template"): HTMLTemplateElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_nobr")
  def createElement(tagName: "nobr"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_table")
  def createElement(tagName: "table"): HTMLTableElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ol")
  def createElement(tagName: "ol"): HTMLOListElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_data")
  def createElement(tagName: "data"): HTMLDataElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_p")
  def createElement(tagName: "p"): HTMLParagraphElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_script")
  def createElement(tagName: "script"): HTMLScriptElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_var")
  def createElement(tagName: "var"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tfoot")
  def createElement(tagName: "tfoot"): HTMLTableSectionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_col")
  def createElement(tagName: "col"): HTMLTableColElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_b")
  def createElement(tagName: "b"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_sup")
  def createElement(tagName: "sup"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ruby")
  def createElement(tagName: "ruby"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_button")
  def createElement(tagName: "button"): HTMLButtonElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_i")
  def createElement(tagName: "i"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_header")
  def createElement(tagName: "header"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_colgroup")
  def createElement(tagName: "colgroup"): HTMLTableColElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_video")
  def createElement(tagName: "video"): HTMLVideoElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_kbd")
  def createElement(tagName: "kbd"): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  /* standard dom */
  @JSName("createElement")
  @scala.annotation.targetName("createElement_a")
  def createElement(tagName: "a"): HTMLAnchorElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_textarea")
  def createElement(tagName: "textarea"): HTMLTextAreaElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_li")
  def createElement(tagName: "li"): HTMLLIElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_address")
  def createElement(tagName: "address"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_u")
  def createElement(tagName: "u"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_cite")
  def createElement(tagName: "cite"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dir")
  def createElement(tagName: "dir"): HTMLDirectoryElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ins")
  def createElement(tagName: "ins"): HTMLModElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_span")
  def createElement(tagName: "span"): HTMLSpanElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_frame")
  def createElement(tagName: "frame"): HTMLFrameElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_abbr")
  def createElement(tagName: "abbr"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_html")
  def createElement(tagName: "html"): HTMLHtmlElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_mark")
  def createElement(tagName: "mark"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tbody")
  def createElement(tagName: "tbody"): HTMLTableSectionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_audio")
  def createElement(tagName: "audio"): HTMLAudioElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_object")
  def createElement(tagName: "object"): HTMLObjectElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_fieldset")
  def createElement(tagName: "fieldset"): HTMLFieldSetElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_meta")
  def createElement(tagName: "meta"): HTMLMetaElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_meter")
  def createElement(tagName: "meter"): HTMLMeterElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_s")
  def createElement(tagName: "s"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_caption")
  def createElement(tagName: "caption"): HTMLTableCaptionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_base")
  def createElement(tagName: "base"): HTMLBaseElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_details")
  def createElement(tagName: "details"): HTMLDetailsElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ul")
  def createElement(tagName: "ul"): HTMLUListElement = js.native
  /** @deprecated */
  /* standard dom */
  @JSName("createElement")
  @scala.annotation.targetName("createElement_acronym")
  def createElement(tagName: "acronym"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tt")
  def createElement(tagName: "tt"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_img")
  def createElement(tagName: "img"): HTMLImageElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_aside")
  def createElement(tagName: "aside"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_area")
  def createElement(tagName: "area"): HTMLAreaElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_embed")
  def createElement(tagName: "embed"): HTMLEmbedElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_option")
  def createElement(tagName: "option"): HTMLOptionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_basefont")
  def createElement(tagName: "basefont"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_del")
  def createElement(tagName: "del"): HTMLModElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_style")
  def createElement(tagName: "style"): HTMLStyleElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_form")
  def createElement(tagName: "form"): HTMLFormElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_thead")
  def createElement(tagName: "thead"): HTMLTableSectionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_listing")
  def createElement(tagName: "listing"): HTMLPreElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_optgroup")
  def createElement(tagName: "optgroup"): HTMLOptGroupElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_map")
  def createElement(tagName: "map"): HTMLMapElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_small")
  def createElement(tagName: "small"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h3")
  def createElement(tagName: "h3"): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_nav")
  def createElement(tagName: "nav"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rt")
  def createElement(tagName: "rt"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_center")
  def createElement(tagName: "center"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_strong")
  def createElement(tagName: "strong"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_input")
  def createElement(tagName: "input"): HTMLInputElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_footer")
  def createElement(tagName: "footer"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dd")
  def createElement(tagName: "dd"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_track")
  def createElement(tagName: "track"): HTMLTrackElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_keygen")
  def createElement(tagName: "keygen"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_applet")
  def createElement(tagName: "applet"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_q")
  def createElement(tagName: "q"): HTMLQuoteElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_plaintext")
  def createElement(tagName: "plaintext"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_main")
  def createElement(tagName: "main"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_output")
  def createElement(tagName: "output"): HTMLOutputElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_frameset")
  def createElement(tagName: "frameset"): HTMLFrameSetElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_datalist")
  def createElement(tagName: "datalist"): HTMLDataListElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_section")
  def createElement(tagName: "section"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_samp")
  def createElement(tagName: "samp"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_label")
  def createElement(tagName: "label"): HTMLLabelElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_select")
  def createElement(tagName: "select"): HTMLSelectElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_hr")
  def createElement(tagName: "hr"): HTMLHRElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dt")
  def createElement(tagName: "dt"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_body")
  def createElement(tagName: "body"): HTMLBodyElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_big")
  def createElement(tagName: "big"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_br")
  def createElement(tagName: "br"): HTMLBRElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_menuitem")
  def createElement(tagName: "menuitem"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_blockquote")
  def createElement(tagName: "blockquote"): HTMLQuoteElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_em")
  def createElement(tagName: "em"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_figcaption")
  def createElement(tagName: "figcaption"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_wbr")
  def createElement(tagName: "wbr"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_link")
  def createElement(tagName: "link"): HTMLLinkElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_canvas")
  def createElement(tagName: "canvas"): HTMLCanvasElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_time")
  def createElement(tagName: "time"): HTMLTimeElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_strike")
  def createElement(tagName: "strike"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tr")
  def createElement(tagName: "tr"): HTMLTableRowElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h4")
  def createElement(tagName: "h4"): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h1")
  def createElement(tagName: "h1"): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_noframes")
  def createElement(tagName: "noframes"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_slot")
  def createElement(tagName: "slot"): HTMLSlotElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h5")
  def createElement(tagName: "h5"): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dl")
  def createElement(tagName: "dl"): HTMLDListElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_summary")
  def createElement(tagName: "summary"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_menu")
  def createElement(tagName: "menu"): HTMLMenuElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dialog")
  def createElement(tagName: "dialog"): HTMLDialogElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_sub")
  def createElement(tagName: "sub"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_blink")
  def createElement(tagName: "blink"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_td")
  def createElement(tagName: "td"): HTMLTableCellElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_param")
  def createElement(tagName: "param"): HTMLParamElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h2")
  def createElement(tagName: "h2"): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_marquee")
  def createElement(tagName: "marquee"): HTMLMarqueeElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_multicol")
  def createElement(tagName: "multicol"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_bdi")
  def createElement(tagName: "bdi"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_article")
  def createElement(tagName: "article"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_progress")
  def createElement(tagName: "progress"): HTMLProgressElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_isindex")
  def createElement(tagName: "isindex"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h6")
  def createElement(tagName: "h6"): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_picture")
  def createElement(tagName: "picture"): HTMLPictureElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_xmp")
  def createElement(tagName: "xmp"): HTMLPreElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_pre")
  def createElement(tagName: "pre"): HTMLPreElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_noscript")
  def createElement(tagName: "noscript"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_legend")
  def createElement(tagName: "legend"): HTMLLegendElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_noembed")
  def createElement(tagName: "noembed"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rb")
  def createElement(tagName: "rb"): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_th")
  def createElement(tagName: "th"): HTMLTableCellElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_iframe")
  def createElement(tagName: "iframe"): HTMLIFrameElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_source")
  def createElement(tagName: "source"): HTMLSourceElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_spacer")
  def createElement(tagName: "spacer"): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_big")
  def createElement(tagName: "big", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_p")
  def createElement(tagName: "p", options: ElementCreationOptions): HTMLParagraphElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_footer")
  def createElement(tagName: "footer", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_section")
  def createElement(tagName: "section", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_body")
  def createElement(tagName: "body", options: ElementCreationOptions): HTMLBodyElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_input")
  def createElement(tagName: "input", options: ElementCreationOptions): HTMLInputElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ul")
  def createElement(tagName: "ul", options: ElementCreationOptions): HTMLUListElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_noframes")
  def createElement(tagName: "noframes", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_mark")
  def createElement(tagName: "mark", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_figure")
  def createElement(tagName: "figure", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_menuitem")
  def createElement(tagName: "menuitem", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_li")
  def createElement(tagName: "li", options: ElementCreationOptions): HTMLLIElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_s")
  def createElement(tagName: "s", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_embed")
  def createElement(tagName: "embed", options: ElementCreationOptions): HTMLEmbedElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_audio")
  def createElement(tagName: "audio", options: ElementCreationOptions): HTMLAudioElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_menu")
  def createElement(tagName: "menu", options: ElementCreationOptions): HTMLMenuElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_title")
  def createElement(tagName: "title", options: ElementCreationOptions): HTMLTitleElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_keygen")
  def createElement(tagName: "keygen", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_figcaption")
  def createElement(tagName: "figcaption", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_sub")
  def createElement(tagName: "sub", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_picture")
  def createElement(tagName: "picture", options: ElementCreationOptions): HTMLPictureElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_br")
  def createElement(tagName: "br", options: ElementCreationOptions): HTMLBRElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_noscript")
  def createElement(tagName: "noscript", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_kbd")
  def createElement(tagName: "kbd", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_plaintext")
  def createElement(tagName: "plaintext", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tbody")
  def createElement(tagName: "tbody", options: ElementCreationOptions): HTMLTableSectionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dl")
  def createElement(tagName: "dl", options: ElementCreationOptions): HTMLDListElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_spacer")
  def createElement(tagName: "spacer", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_noembed")
  def createElement(tagName: "noembed", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_textarea")
  def createElement(tagName: "textarea", options: ElementCreationOptions): HTMLTextAreaElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_optgroup")
  def createElement(tagName: "optgroup", options: ElementCreationOptions): HTMLOptGroupElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_blockquote")
  def createElement(tagName: "blockquote", options: ElementCreationOptions): HTMLQuoteElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_span")
  def createElement(tagName: "span", options: ElementCreationOptions): HTMLSpanElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_pre")
  def createElement(tagName: "pre", options: ElementCreationOptions): HTMLPreElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_em")
  def createElement(tagName: "em", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_nobr")
  def createElement(tagName: "nobr", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rb")
  def createElement(tagName: "rb", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_meta")
  def createElement(tagName: "meta", options: ElementCreationOptions): HTMLMetaElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_center")
  def createElement(tagName: "center", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_bdo")
  def createElement(tagName: "bdo", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h5")
  def createElement(tagName: "h5", options: ElementCreationOptions): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rt")
  def createElement(tagName: "rt", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_fieldset")
  def createElement(tagName: "fieldset", options: ElementCreationOptions): HTMLFieldSetElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_i")
  def createElement(tagName: "i", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_template")
  def createElement(tagName: "template", options: ElementCreationOptions): HTMLTemplateElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_multicol")
  def createElement(tagName: "multicol", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ins")
  def createElement(tagName: "ins", options: ElementCreationOptions): HTMLModElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_samp")
  def createElement(tagName: "samp", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dir")
  def createElement(tagName: "dir", options: ElementCreationOptions): HTMLDirectoryElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_font")
  def createElement(tagName: "font", options: ElementCreationOptions): HTMLFontElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_article")
  def createElement(tagName: "article", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dfn")
  def createElement(tagName: "dfn", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_select")
  def createElement(tagName: "select", options: ElementCreationOptions): HTMLSelectElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_slot")
  def createElement(tagName: "slot", options: ElementCreationOptions): HTMLSlotElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_th")
  def createElement(tagName: "th", options: ElementCreationOptions): HTMLTableCellElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_bgsound")
  def createElement(tagName: "bgsound", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_param")
  def createElement(tagName: "param", options: ElementCreationOptions): HTMLParamElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tt")
  def createElement(tagName: "tt", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_main")
  def createElement(tagName: "main", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_label")
  def createElement(tagName: "label", options: ElementCreationOptions): HTMLLabelElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h1")
  def createElement(tagName: "h1", options: ElementCreationOptions): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_colgroup")
  def createElement(tagName: "colgroup", options: ElementCreationOptions): HTMLTableColElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_col")
  def createElement(tagName: "col", options: ElementCreationOptions): HTMLTableColElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_cite")
  def createElement(tagName: "cite", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_area")
  def createElement(tagName: "area", options: ElementCreationOptions): HTMLAreaElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_button")
  def createElement(tagName: "button", options: ElementCreationOptions): HTMLButtonElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_listing")
  def createElement(tagName: "listing", options: ElementCreationOptions): HTMLPreElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rp")
  def createElement(tagName: "rp", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_base")
  def createElement(tagName: "base", options: ElementCreationOptions): HTMLBaseElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_source")
  def createElement(tagName: "source", options: ElementCreationOptions): HTMLSourceElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_frameset")
  def createElement(tagName: "frameset", options: ElementCreationOptions): HTMLFrameSetElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_head")
  def createElement(tagName: "head", options: ElementCreationOptions): HTMLHeadElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_map")
  def createElement(tagName: "map", options: ElementCreationOptions): HTMLMapElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_meter")
  def createElement(tagName: "meter", options: ElementCreationOptions): HTMLMeterElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_basefont")
  def createElement(tagName: "basefont", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_q")
  def createElement(tagName: "q", options: ElementCreationOptions): HTMLQuoteElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_time")
  def createElement(tagName: "time", options: ElementCreationOptions): HTMLTimeElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_data")
  def createElement(tagName: "data", options: ElementCreationOptions): HTMLDataElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_strike")
  def createElement(tagName: "strike", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h4")
  def createElement(tagName: "h4", options: ElementCreationOptions): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_summary")
  def createElement(tagName: "summary", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_applet")
  def createElement(tagName: "applet", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_video")
  def createElement(tagName: "video", options: ElementCreationOptions): HTMLVideoElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dt")
  def createElement(tagName: "dt", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tfoot")
  def createElement(tagName: "tfoot", options: ElementCreationOptions): HTMLTableSectionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_hgroup")
  def createElement(tagName: "hgroup", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_nextid")
  def createElement(tagName: "nextid", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_track")
  def createElement(tagName: "track", options: ElementCreationOptions): HTMLTrackElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_header")
  def createElement(tagName: "header", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_datalist")
  def createElement(tagName: "datalist", options: ElementCreationOptions): HTMLDataListElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_abbr")
  def createElement(tagName: "abbr", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_isindex")
  def createElement(tagName: "isindex", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_blink")
  def createElement(tagName: "blink", options: ElementCreationOptions): HTMLUnknownElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_address")
  def createElement(tagName: "address", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_marquee")
  def createElement(tagName: "marquee", options: ElementCreationOptions): HTMLMarqueeElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ruby")
  def createElement(tagName: "ruby", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_code")
  def createElement(tagName: "code", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_aside")
  def createElement(tagName: "aside", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_frame")
  def createElement(tagName: "frame", options: ElementCreationOptions): HTMLFrameElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_output")
  def createElement(tagName: "output", options: ElementCreationOptions): HTMLOutputElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_acronym")
  def createElement(tagName: "acronym", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_nav")
  def createElement(tagName: "nav", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_sup")
  def createElement(tagName: "sup", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_iframe")
  def createElement(tagName: "iframe", options: ElementCreationOptions): HTMLIFrameElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_ol")
  def createElement(tagName: "ol", options: ElementCreationOptions): HTMLOListElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h6")
  def createElement(tagName: "h6", options: ElementCreationOptions): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_xmp")
  def createElement(tagName: "xmp", options: ElementCreationOptions): HTMLPreElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_div")
  def createElement(tagName: "div", options: ElementCreationOptions): HTMLDivElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_wbr")
  def createElement(tagName: "wbr", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_thead")
  def createElement(tagName: "thead", options: ElementCreationOptions): HTMLTableSectionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h3")
  def createElement(tagName: "h3", options: ElementCreationOptions): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_bdi")
  def createElement(tagName: "bdi", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_h2")
  def createElement(tagName: "h2", options: ElementCreationOptions): HTMLHeadingElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_tr")
  def createElement(tagName: "tr", options: ElementCreationOptions): HTMLTableRowElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_u")
  def createElement(tagName: "u", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_script")
  def createElement(tagName: "script", options: ElementCreationOptions): HTMLScriptElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_var")
  def createElement(tagName: "var", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_option")
  def createElement(tagName: "option", options: ElementCreationOptions): HTMLOptionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dialog")
  def createElement(tagName: "dialog", options: ElementCreationOptions): HTMLDialogElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_details")
  def createElement(tagName: "details", options: ElementCreationOptions): HTMLDetailsElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_html")
  def createElement(tagName: "html", options: ElementCreationOptions): HTMLHtmlElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_canvas")
  def createElement(tagName: "canvas", options: ElementCreationOptions): HTMLCanvasElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_a")
  def createElement(tagName: "a", options: ElementCreationOptions): HTMLAnchorElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_small")
  def createElement(tagName: "small", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_dd")
  def createElement(tagName: "dd", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_rtc")
  def createElement(tagName: "rtc", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_hr")
  def createElement(tagName: "hr", options: ElementCreationOptions): HTMLHRElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_form")
  def createElement(tagName: "form", options: ElementCreationOptions): HTMLFormElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_img")
  def createElement(tagName: "img", options: ElementCreationOptions): HTMLImageElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_style")
  def createElement(tagName: "style", options: ElementCreationOptions): HTMLStyleElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_td")
  def createElement(tagName: "td", options: ElementCreationOptions): HTMLTableCellElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_progress")
  def createElement(tagName: "progress", options: ElementCreationOptions): HTMLProgressElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_object")
  def createElement(tagName: "object", options: ElementCreationOptions): HTMLObjectElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_table")
  def createElement(tagName: "table", options: ElementCreationOptions): HTMLTableElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_strong")
  def createElement(tagName: "strong", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_b")
  def createElement(tagName: "b", options: ElementCreationOptions): HTMLElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_caption")
  def createElement(tagName: "caption", options: ElementCreationOptions): HTMLTableCaptionElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_legend")
  def createElement(tagName: "legend", options: ElementCreationOptions): HTMLLegendElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_del")
  def createElement(tagName: "del", options: ElementCreationOptions): HTMLModElement = js.native
  @JSName("createElement")
  @scala.annotation.targetName("createElement_link")
  def createElement(tagName: "link", options: ElementCreationOptions): HTMLLinkElement = js.native
  /* standard dom */
  def createElement(tagName: java.lang.String): HTMLElement = js.native
  def createElement(tagName: java.lang.String, options: ElementCreationOptions): HTMLElement = js.native
  
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_animate")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "animate"): SVGAnimateElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feGaussianBlur")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feGaussianBlur"): SVGFEGaussianBlurElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_line")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "line"): SVGLineElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feConvolveMatrix")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feConvolveMatrix"): SVGFEConvolveMatrixElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_svg")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "svg"): SVGSVGElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feFuncG")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feFuncG"): SVGFEFuncGElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_stop")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "stop"): SVGStopElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_rect")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "rect"): SVGRectElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feMergeNode")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feMergeNode"): SVGFEMergeNodeElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feDropShadow")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feDropShadow"): SVGFEDropShadowElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_polygon")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "polygon"): SVGPolygonElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_foreignObject")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "foreignObject"): SVGForeignObjectElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feBlend")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feBlend"): SVGFEBlendElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_desc")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "desc"): SVGDescElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_mpath")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "mpath"): SVGMPathElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feFuncA")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feFuncA"): SVGFEFuncAElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_pattern")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "pattern"): SVGPatternElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_textPath")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "textPath"): SVGTextPathElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feColorMatrix")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feColorMatrix"): SVGFEColorMatrixElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_animateMotion")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "animateMotion"): SVGAnimateMotionElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_clipPath")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "clipPath"): SVGClipPathElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_title")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "title"): SVGTitleElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feDisplacementMap")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feDisplacementMap"): SVGFEDisplacementMapElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_use")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "use"): SVGUseElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feTile")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feTile"): SVGFETileElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_view")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "view"): SVGViewElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_filter")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "filter"): SVGFilterElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_circle")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "circle"): SVGCircleElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feMerge")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feMerge"): SVGFEMergeElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_set")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "set"): SVGSetElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feMorphology")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feMorphology"): SVGFEMorphologyElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feTurbulence")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feTurbulence"): SVGFETurbulenceElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_radialGradient")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "radialGradient"): SVGRadialGradientElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_image")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "image"): SVGImageElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_defs")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "defs"): SVGDefsElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_linearGradient")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "linearGradient"): SVGLinearGradientElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feComponentTransfer")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feComponentTransfer"): SVGFEComponentTransferElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_polyline")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "polyline"): SVGPolylineElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feSpotLight")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feSpotLight"): SVGFESpotLightElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_animateTransform")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "animateTransform"): SVGAnimateTransformElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_fePointLight")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "fePointLight"): SVGFEPointLightElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feFlood")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feFlood"): SVGFEFloodElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feImage")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feImage"): SVGFEImageElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feOffset")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feOffset"): SVGFEOffsetElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_mask")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "mask"): SVGMaskElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_script")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "script"): SVGScriptElement = js.native
  /* standard dom */
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_a")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "a"): SVGAElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feFuncB")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feFuncB"): SVGFEFuncBElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feSpecularLighting")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feSpecularLighting"): SVGFESpecularLightingElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_tspan")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "tspan"): SVGTSpanElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_path")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "path"): SVGPathElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_marker")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "marker"): SVGMarkerElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_style")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "style"): SVGStyleElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_symbol")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "symbol"): SVGSymbolElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_ellipse")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "ellipse"): SVGEllipseElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_switch")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "switch"): SVGSwitchElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feDistantLight")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feDistantLight"): SVGFEDistantLightElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feFuncR")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feFuncR"): SVGFEFuncRElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feDiffuseLighting")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feDiffuseLighting"): SVGFEDiffuseLightingElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_metadata")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "metadata"): SVGMetadataElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_text")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "text"): SVGTextElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_feComposite")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "feComposite"): SVGFECompositeElement = js.native
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg_g")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: "g"): SVGGElement = js.native
  /* standard dom */
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org2000svg")
  def createElementNS(namespaceURI: "http://www.w3.org/2000/svg", qualifiedName: java.lang.String): SVGElement = js.native
  /**
    * Returns an element with namespace namespace. Its namespace prefix will be everything before ":" (U+003E) in qualifiedName or null. Its local name will be everything after ":" (U+003E) in qualifiedName or qualifiedName.
    *
    * If localName does not match the Name production an "InvalidCharacterError" DOMException will be thrown.
    *
    * If one of the following conditions is true a "NamespaceError" DOMException will be thrown:
    *
    * localName does not match the QName production.
    * Namespace prefix is not null and namespace is the empty string.
    * Namespace prefix is "xml" and namespace is not the XML namespace.
    * qualifiedName or namespace prefix is "xmlns" and namespace is not the XMLNS namespace.
    * namespace is the XMLNS namespace and neither qualifiedName nor namespace prefix is "xmlns".
    *
    * When supplied, options's is can be used to create a customized built-in element.
    */
  /* standard dom */
  @JSName("createElementNS")
  @scala.annotation.targetName("createElementNS_httpwwww3org1999xhtml")
  def createElementNS(namespaceURI: "http://www.w3.org/1999/xhtml", qualifiedName: java.lang.String): HTMLElement = js.native
  /* standard dom */
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(namespaceURI: Null, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: Null, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(namespace: java.lang.String, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  def createElementNS(namespace: Null, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_WebGLContextEvent")
  def createEvent(eventInterface: "WebGLContextEvent"): WebGLContextEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_DeviceMotionEvent")
  def createEvent(eventInterface: "DeviceMotionEvent"): DeviceMotionEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_RTCPeerConnectionIceEvent")
  def createEvent(eventInterface: "RTCPeerConnectionIceEvent"): RTCPeerConnectionIceEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_FontFaceSetLoadEvent")
  def createEvent(eventInterface: "FontFaceSetLoadEvent"): FontFaceSetLoadEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_DeviceOrientationEvent")
  def createEvent(eventInterface: "DeviceOrientationEvent"): DeviceOrientationEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_OfflineAudioCompletionEvent")
  def createEvent(eventInterface: "OfflineAudioCompletionEvent"): OfflineAudioCompletionEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_PaymentMethodChangeEvent")
  def createEvent(eventInterface: "PaymentMethodChangeEvent"): PaymentMethodChangeEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MediaKeyMessageEvent")
  def createEvent(eventInterface: "MediaKeyMessageEvent"): MediaKeyMessageEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MutationEvents")
  def createEvent(eventInterface: "MutationEvents"): MutationEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_PictureInPictureEvent")
  def createEvent(eventInterface: "PictureInPictureEvent"): PictureInPictureEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_HashChangeEvent")
  def createEvent(eventInterface: "HashChangeEvent"): HashChangeEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_Event")
  def createEvent(eventInterface: "Event"): Event = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_UIEvent")
  def createEvent(eventInterface: "UIEvent"): UIEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_RTCErrorEvent")
  def createEvent(eventInterface: "RTCErrorEvent"): RTCErrorEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_RTCPeerConnectionIceErrorEvent")
  def createEvent(eventInterface: "RTCPeerConnectionIceErrorEvent"): RTCPeerConnectionIceErrorEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_PageTransitionEvent")
  def createEvent(eventInterface: "PageTransitionEvent"): PageTransitionEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_IDBVersionChangeEvent")
  def createEvent(eventInterface: "IDBVersionChangeEvent"): IDBVersionChangeEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_SubmitEvent")
  def createEvent(eventInterface: "SubmitEvent"): SubmitEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_GamepadEvent")
  def createEvent(eventInterface: "GamepadEvent"): GamepadEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_Events")
  def createEvent(eventInterface: "Events"): Event = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_SecurityPolicyViolationEvent")
  def createEvent(eventInterface: "SecurityPolicyViolationEvent"): SecurityPolicyViolationEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_StorageEvent")
  def createEvent(eventInterface: "StorageEvent"): StorageEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_BlobEvent")
  def createEvent(eventInterface: "BlobEvent"): BlobEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_DragEvent")
  def createEvent(eventInterface: "DragEvent"): DragEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_PopStateEvent")
  def createEvent(eventInterface: "PopStateEvent"): PopStateEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_BeforeUnloadEvent")
  def createEvent(eventInterface: "BeforeUnloadEvent"): BeforeUnloadEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_UIEvents")
  def createEvent(eventInterface: "UIEvents"): UIEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MouseEvent")
  def createEvent(eventInterface: "MouseEvent"): MouseEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MouseEvents")
  def createEvent(eventInterface: "MouseEvents"): MouseEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_AnimationPlaybackEvent")
  def createEvent(eventInterface: "AnimationPlaybackEvent"): AnimationPlaybackEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_ProgressEvent")
  def createEvent(eventInterface: "ProgressEvent"): ProgressEvent[EventTarget] = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_KeyboardEvent")
  def createEvent(eventInterface: "KeyboardEvent"): KeyboardEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_CloseEvent")
  def createEvent(eventInterface: "CloseEvent"): CloseEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_PointerEvent")
  def createEvent(eventInterface: "PointerEvent"): PointerEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MediaQueryListEvent")
  def createEvent(eventInterface: "MediaQueryListEvent"): MediaQueryListEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_CustomEvent")
  def createEvent(eventInterface: "CustomEvent"): CustomEvent[Any] = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_ErrorEvent")
  def createEvent(eventInterface: "ErrorEvent"): ErrorEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_ClipboardEvent")
  def createEvent(eventInterface: "ClipboardEvent"): ClipboardEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_WheelEvent")
  def createEvent(eventInterface: "WheelEvent"): WheelEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MediaStreamTrackEvent")
  def createEvent(eventInterface: "MediaStreamTrackEvent"): MediaStreamTrackEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_TrackEvent")
  def createEvent(eventInterface: "TrackEvent"): TrackEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_FormDataEvent")
  def createEvent(eventInterface: "FormDataEvent"): FormDataEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_PaymentRequestUpdateEvent")
  def createEvent(eventInterface: "PaymentRequestUpdateEvent"): PaymentRequestUpdateEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_CompositionEvent")
  def createEvent(eventInterface: "CompositionEvent"): CompositionEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MessageEvent")
  def createEvent(eventInterface: "MessageEvent"): MessageEvent[Any] = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MediaEncryptedEvent")
  def createEvent(eventInterface: "MediaEncryptedEvent"): MediaEncryptedEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_InputEvent")
  def createEvent(eventInterface: "InputEvent"): InputEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_FocusEvent")
  def createEvent(eventInterface: "FocusEvent"): FocusEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_AudioProcessingEvent")
  def createEvent(eventInterface: "AudioProcessingEvent"): AudioProcessingEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_SpeechSynthesisEvent")
  def createEvent(eventInterface: "SpeechSynthesisEvent"): SpeechSynthesisEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_PromiseRejectionEvent")
  def createEvent(eventInterface: "PromiseRejectionEvent"): PromiseRejectionEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_RTCTrackEvent")
  def createEvent(eventInterface: "RTCTrackEvent"): RTCTrackEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_RTCDataChannelEvent")
  def createEvent(eventInterface: "RTCDataChannelEvent"): RTCDataChannelEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_SpeechSynthesisErrorEvent")
  def createEvent(eventInterface: "SpeechSynthesisErrorEvent"): SpeechSynthesisErrorEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_MutationEvent")
  def createEvent(eventInterface: "MutationEvent"): MutationEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_RTCDTMFToneChangeEvent")
  def createEvent(eventInterface: "RTCDTMFToneChangeEvent"): RTCDTMFToneChangeEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_TransitionEvent")
  def createEvent(eventInterface: "TransitionEvent"): TransitionEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_TouchEvent")
  def createEvent(eventInterface: "TouchEvent"): TouchEvent = js.native
  /* standard dom */
  @JSName("createEvent")
  @scala.annotation.targetName("createEvent_AnimationEvent")
  def createEvent(eventInterface: "AnimationEvent"): AnimationEvent = js.native
  /* standard dom */
  def createEvent(eventInterface: java.lang.String): Event = js.native
  
  /**
    * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list
    * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
    */
  /* standard dom */
  def createNodeIterator(root: Node): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: Double): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: Double, filter: NodeFilter): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: Unit, filter: NodeFilter): NodeIterator = js.native
  
  /** Returns a ProcessingInstruction node whose target is target and data is data. If target does not match the Name production an "InvalidCharacterError" DOMException will be thrown. If data contains "?>" an "InvalidCharacterError" DOMException will be thrown. */
  /* standard dom */
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): ProcessingInstruction = js.native
  
  /**  Returns an empty range object that has both of its boundary points positioned at the beginning of the document. */
  /* standard dom */
  def createRange(): Range = js.native
  
  /**
    * Creates a text string from the specified value.
    * @param data String that specifies the nodeValue property of the text node.
    */
  /* standard dom */
  def createTextNode(data: java.lang.String): Text = js.native
  
  /**
    * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
    * @param filter A custom NodeFilter function to use.
    */
  /* standard dom */
  def createTreeWalker(root: Node): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: Double): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: Double, filter: NodeFilter): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: Unit, filter: NodeFilter): TreeWalker = js.native
  
  /**
    * Returns the script element, or the SVG script element, that is currently executing, as long as the element represents a classic script. In the case of reentrant script execution, returns the one that most recently started executing amongst those that have not yet finished executing.
    *
    * Returns null if the Document is not currently executing a script or SVG script element (e.g., because the running script is an event handler, or a timeout), or if the currently executing script or SVG script element represents a module script.
    */
  /* standard dom */
  val currentScript: HTMLOrSVGScriptElement | Null = js.native
  
  /** Returns the Window object of the active document. */
  /* standard dom */
  val defaultView: (WindowProxy & (/* globalThis */ Any)) | Null = js.native
  
  /** Sets or gets a value that indicates whether the document can be edited. */
  /* standard dom */
  var designMode: java.lang.String = js.native
  
  /** Sets or retrieves a value that indicates the reading order of the object. */
  /* standard dom */
  var dir: java.lang.String = js.native
  
  /** Gets an object representing the document type declaration associated with the current document. */
  /* standard dom */
  val doctype: DocumentType | Null = js.native
  
  /** Gets a reference to the root node of the document. */
  /* standard dom */
  val documentElement: HTMLElement = js.native
  
  /** Returns document's URL. */
  /* standard dom */
  val documentURI: java.lang.String = js.native
  
  /**
    * Sets or gets the security domain of the document.
    * @deprecated
    */
  /* standard dom */
  var domain: java.lang.String = js.native
  
  /** Retrieves a collection of all embed objects in the document. */
  /* standard dom */
  val embeds: HTMLCollectionOf[HTMLEmbedElement] = js.native
  
  /**
    * Executes a command on the current document, current selection, or the given range.
    * @param commandId String that specifies the command to execute. This command can be any of the command identifiers that can be executed in script.
    * @param showUI Display the user interface, defaults to false.
    * @param value Value to assign.
    * @deprecated
    */
  /* standard dom */
  def execCommand(commandId: java.lang.String): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean, value: java.lang.String): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: Unit, value: java.lang.String): scala.Boolean = js.native
  
  /** Stops document's fullscreen element from being displayed fullscreen and resolves promise when done. */
  /* standard dom */
  def exitFullscreen(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def exitPictureInPicture(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def exitPointerLock(): Unit = js.native
  
  /**
    * Sets or gets the foreground (text) color of the document.
    * @deprecated
    */
  /* standard dom */
  var fgColor: java.lang.String = js.native
  
  /** Retrieves a collection, in source order, of all form objects in the document. */
  /* standard dom */
  val forms: HTMLCollectionOf[HTMLFormElement] = js.native
  
  /** @deprecated */
  /* standard dom */
  val fullscreen: scala.Boolean = js.native
  
  /** Returns true if document has the ability to display elements fullscreen and fullscreen is supported, or false otherwise. */
  /* standard dom */
  val fullscreenEnabled: scala.Boolean = js.native
  
  /** Returns a HTMLCollection of the elements in the object on which the method was invoked (a document or an element) that have all the classes given by classNames. The classNames argument is interpreted as a space-separated list of classes. */
  /* standard dom */
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  
  /**
    * Gets a collection of objects based on the value of the NAME or ID attribute.
    * @param elementName Gets a collection of objects based on the value of the NAME or ID attribute.
    */
  /* standard dom */
  def getElementsByName(elementName: java.lang.String): NodeListOf[HTMLElement] = js.native
  
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_head")
  def getElementsByTagName(qualifiedName: "head"): HTMLCollectionOf[HTMLHeadElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h4")
  def getElementsByTagName(qualifiedName: "h4"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_col")
  def getElementsByTagName(qualifiedName: "col"): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_set")
  def getElementsByTagName(qualifiedName: "set"): HTMLCollectionOf[SVGSetElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncR")
  def getElementsByTagName(qualifiedName: "feFuncR"): HTMLCollectionOf[SVGFEFuncRElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ins")
  def getElementsByTagName(qualifiedName: "ins"): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_p")
  def getElementsByTagName(qualifiedName: "p"): HTMLCollectionOf[HTMLParagraphElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_i")
  def getElementsByTagName(qualifiedName: "i"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_output")
  def getElementsByTagName(qualifiedName: "output"): HTMLCollectionOf[HTMLOutputElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_td")
  def getElementsByTagName(qualifiedName: "td"): HTMLCollectionOf[HTMLTableCellElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_clipPath")
  def getElementsByTagName(qualifiedName: "clipPath"): HTMLCollectionOf[SVGClipPathElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_span")
  def getElementsByTagName(qualifiedName: "span"): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_slot")
  def getElementsByTagName(qualifiedName: "slot"): HTMLCollectionOf[HTMLSlotElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_caption")
  def getElementsByTagName(qualifiedName: "caption"): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feDistantLight")
  def getElementsByTagName(qualifiedName: "feDistantLight"): HTMLCollectionOf[SVGFEDistantLightElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_switch")
  def getElementsByTagName(qualifiedName: "switch"): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_hgroup")
  def getElementsByTagName(qualifiedName: "hgroup"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_th")
  def getElementsByTagName(qualifiedName: "th"): HTMLCollectionOf[HTMLTableCellElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_data")
  def getElementsByTagName(qualifiedName: "data"): HTMLCollectionOf[HTMLDataElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dd")
  def getElementsByTagName(qualifiedName: "dd"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_table")
  def getElementsByTagName(qualifiedName: "table"): HTMLCollectionOf[HTMLTableElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_figcaption")
  def getElementsByTagName(qualifiedName: "figcaption"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_canvas")
  def getElementsByTagName(qualifiedName: "canvas"): HTMLCollectionOf[HTMLCanvasElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_audio")
  def getElementsByTagName(qualifiedName: "audio"): HTMLCollectionOf[HTMLAudioElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFlood")
  def getElementsByTagName(qualifiedName: "feFlood"): HTMLCollectionOf[SVGFEFloodElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h2")
  def getElementsByTagName(qualifiedName: "h2"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_li")
  def getElementsByTagName(qualifiedName: "li"): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_wbr")
  def getElementsByTagName(qualifiedName: "wbr"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_object")
  def getElementsByTagName(qualifiedName: "object"): HTMLCollectionOf[HTMLObjectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feComposite")
  def getElementsByTagName(qualifiedName: "feComposite"): HTMLCollectionOf[SVGFECompositeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_marker")
  def getElementsByTagName(qualifiedName: "marker"): HTMLCollectionOf[SVGMarkerElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_animateMotion")
  def getElementsByTagName(qualifiedName: "animateMotion"): HTMLCollectionOf[SVGAnimateMotionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dl")
  def getElementsByTagName(qualifiedName: "dl"): HTMLCollectionOf[HTMLDListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_track")
  def getElementsByTagName(qualifiedName: "track"): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_polyline")
  def getElementsByTagName(qualifiedName: "polyline"): HTMLCollectionOf[SVGPolylineElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feMorphology")
  def getElementsByTagName(qualifiedName: "feMorphology"): HTMLCollectionOf[SVGFEMorphologyElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_b")
  def getElementsByTagName(qualifiedName: "b"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feSpotLight")
  def getElementsByTagName(qualifiedName: "feSpotLight"): HTMLCollectionOf[SVGFESpotLightElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_progress")
  def getElementsByTagName(qualifiedName: "progress"): HTMLCollectionOf[HTMLProgressElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_code")
  def getElementsByTagName(qualifiedName: "code"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h5")
  def getElementsByTagName(qualifiedName: "h5"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feDropShadow")
  def getElementsByTagName(qualifiedName: "feDropShadow"): HTMLCollectionOf[SVGFEDropShadowElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_u")
  def getElementsByTagName(qualifiedName: "u"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feTurbulence")
  def getElementsByTagName(qualifiedName: "feTurbulence"): HTMLCollectionOf[SVGFETurbulenceElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_meter")
  def getElementsByTagName(qualifiedName: "meter"): HTMLCollectionOf[HTMLMeterElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_video")
  def getElementsByTagName(qualifiedName: "video"): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feDiffuseLighting")
  def getElementsByTagName(qualifiedName: "feDiffuseLighting"): HTMLCollectionOf[SVGFEDiffuseLightingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_bdo")
  def getElementsByTagName(qualifiedName: "bdo"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_address")
  def getElementsByTagName(qualifiedName: "address"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feColorMatrix")
  def getElementsByTagName(qualifiedName: "feColorMatrix"): HTMLCollectionOf[SVGFEColorMatrixElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_picture")
  def getElementsByTagName(qualifiedName: "picture"): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tfoot")
  def getElementsByTagName(qualifiedName: "tfoot"): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_summary")
  def getElementsByTagName(qualifiedName: "summary"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_section")
  def getElementsByTagName(qualifiedName: "section"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_use")
  def getElementsByTagName(qualifiedName: "use"): HTMLCollectionOf[SVGUseElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_desc")
  def getElementsByTagName(qualifiedName: "desc"): HTMLCollectionOf[SVGDescElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_fePointLight")
  def getElementsByTagName(qualifiedName: "fePointLight"): HTMLCollectionOf[SVGFEPointLightElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_mpath")
  def getElementsByTagName(qualifiedName: "mpath"): HTMLCollectionOf[SVGMPathElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_em")
  def getElementsByTagName(qualifiedName: "em"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feMergeNode")
  def getElementsByTagName(qualifiedName: "feMergeNode"): HTMLCollectionOf[SVGFEMergeNodeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_map")
  def getElementsByTagName(qualifiedName: "map"): HTMLCollectionOf[HTMLMapElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_filter")
  def getElementsByTagName(qualifiedName: "filter"): HTMLCollectionOf[SVGFilterElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tr")
  def getElementsByTagName(qualifiedName: "tr"): HTMLCollectionOf[HTMLTableRowElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_optgroup")
  def getElementsByTagName(qualifiedName: "optgroup"): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_title")
  def getElementsByTagName(qualifiedName: "title"): HTMLCollectionOf[HTMLTitleElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feTile")
  def getElementsByTagName(qualifiedName: "feTile"): HTMLCollectionOf[SVGFETileElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feImage")
  def getElementsByTagName(qualifiedName: "feImage"): HTMLCollectionOf[SVGFEImageElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_text")
  def getElementsByTagName(qualifiedName: "text"): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feDisplacementMap")
  def getElementsByTagName(qualifiedName: "feDisplacementMap"): HTMLCollectionOf[SVGFEDisplacementMapElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h1")
  def getElementsByTagName(qualifiedName: "h1"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_button")
  def getElementsByTagName(qualifiedName: "button"): HTMLCollectionOf[HTMLButtonElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_area")
  def getElementsByTagName(qualifiedName: "area"): HTMLCollectionOf[HTMLAreaElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_time")
  def getElementsByTagName(qualifiedName: "time"): HTMLCollectionOf[HTMLTimeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dfn")
  def getElementsByTagName(qualifiedName: "dfn"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_meta")
  def getElementsByTagName(qualifiedName: "meta"): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h6")
  def getElementsByTagName(qualifiedName: "h6"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_circle")
  def getElementsByTagName(qualifiedName: "circle"): HTMLCollectionOf[SVGCircleElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_link")
  def getElementsByTagName(qualifiedName: "link"): HTMLCollectionOf[HTMLLinkElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_textarea")
  def getElementsByTagName(qualifiedName: "textarea"): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncB")
  def getElementsByTagName(qualifiedName: "feFuncB"): HTMLCollectionOf[SVGFEFuncBElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_abbr")
  def getElementsByTagName(qualifiedName: "abbr"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_datalist")
  def getElementsByTagName(qualifiedName: "datalist"): HTMLCollectionOf[HTMLDataListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feComponentTransfer")
  def getElementsByTagName(qualifiedName: "feComponentTransfer"): HTMLCollectionOf[SVGFEComponentTransferElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_sup")
  def getElementsByTagName(qualifiedName: "sup"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncA")
  def getElementsByTagName(qualifiedName: "feFuncA"): HTMLCollectionOf[SVGFEFuncAElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ellipse")
  def getElementsByTagName(qualifiedName: "ellipse"): HTMLCollectionOf[SVGEllipseElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_menu")
  def getElementsByTagName(qualifiedName: "menu"): HTMLCollectionOf[HTMLMenuElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_figure")
  def getElementsByTagName(qualifiedName: "figure"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_stop")
  def getElementsByTagName(qualifiedName: "stop"): HTMLCollectionOf[SVGStopElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_input")
  def getElementsByTagName(qualifiedName: "input"): HTMLCollectionOf[HTMLInputElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_mask")
  def getElementsByTagName(qualifiedName: "mask"): HTMLCollectionOf[SVGMaskElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_source")
  def getElementsByTagName(qualifiedName: "source"): HTMLCollectionOf[HTMLSourceElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_embed")
  def getElementsByTagName(qualifiedName: "embed"): HTMLCollectionOf[HTMLEmbedElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ruby")
  def getElementsByTagName(qualifiedName: "ruby"): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  /* standard dom */
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_a")
  def getElementsByTagName(qualifiedName: "a"): HTMLCollectionOf[HTMLAnchorElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tspan")
  def getElementsByTagName(qualifiedName: "tspan"): HTMLCollectionOf[SVGTSpanElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_option")
  def getElementsByTagName(qualifiedName: "option"): HTMLCollectionOf[HTMLOptionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_blockquote")
  def getElementsByTagName(qualifiedName: "blockquote"): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_view")
  def getElementsByTagName(qualifiedName: "view"): HTMLCollectionOf[SVGViewElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_cite")
  def getElementsByTagName(qualifiedName: "cite"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feFuncG")
  def getElementsByTagName(qualifiedName: "feFuncG"): HTMLCollectionOf[SVGFEFuncGElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_del")
  def getElementsByTagName(qualifiedName: "del"): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_rect")
  def getElementsByTagName(qualifiedName: "rect"): HTMLCollectionOf[SVGRectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_animate")
  def getElementsByTagName(qualifiedName: "animate"): HTMLCollectionOf[SVGAnimateElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_style")
  def getElementsByTagName(qualifiedName: "style"): HTMLCollectionOf[HTMLStyleElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_q")
  def getElementsByTagName(qualifiedName: "q"): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_div")
  def getElementsByTagName(qualifiedName: "div"): HTMLCollectionOf[HTMLDivElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_fieldset")
  def getElementsByTagName(qualifiedName: "fieldset"): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_header")
  def getElementsByTagName(qualifiedName: "header"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_line")
  def getElementsByTagName(qualifiedName: "line"): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_h3")
  def getElementsByTagName(qualifiedName: "h3"): HTMLCollectionOf[HTMLHeadingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_main")
  def getElementsByTagName(qualifiedName: "main"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_g")
  def getElementsByTagName(qualifiedName: "g"): HTMLCollectionOf[SVGGElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_path")
  def getElementsByTagName(qualifiedName: "path"): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_small")
  def getElementsByTagName(qualifiedName: "small"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_animateTransform")
  def getElementsByTagName(qualifiedName: "animateTransform"): HTMLCollectionOf[SVGAnimateTransformElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_metadata")
  def getElementsByTagName(qualifiedName: "metadata"): HTMLCollectionOf[SVGMetadataElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_samp")
  def getElementsByTagName(qualifiedName: "samp"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_aside")
  def getElementsByTagName(qualifiedName: "aside"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_iframe")
  def getElementsByTagName(qualifiedName: "iframe"): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_body")
  def getElementsByTagName(qualifiedName: "body"): HTMLCollectionOf[HTMLBodyElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_kbd")
  def getElementsByTagName(qualifiedName: "kbd"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_details")
  def getElementsByTagName(qualifiedName: "details"): HTMLCollectionOf[HTMLDetailsElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_script")
  def getElementsByTagName(qualifiedName: "script"): HTMLCollectionOf[HTMLScriptElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_var")
  def getElementsByTagName(qualifiedName: "var"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_svg")
  def getElementsByTagName(qualifiedName: "svg"): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_rp")
  def getElementsByTagName(qualifiedName: "rp"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_defs")
  def getElementsByTagName(qualifiedName: "defs"): HTMLCollectionOf[SVGDefsElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feConvolveMatrix")
  def getElementsByTagName(qualifiedName: "feConvolveMatrix"): HTMLCollectionOf[SVGFEConvolveMatrixElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_sub")
  def getElementsByTagName(qualifiedName: "sub"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_label")
  def getElementsByTagName(qualifiedName: "label"): HTMLCollectionOf[HTMLLabelElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_template")
  def getElementsByTagName(qualifiedName: "template"): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ol")
  def getElementsByTagName(qualifiedName: "ol"): HTMLCollectionOf[HTMLOListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feGaussianBlur")
  def getElementsByTagName(qualifiedName: "feGaussianBlur"): HTMLCollectionOf[SVGFEGaussianBlurElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feSpecularLighting")
  def getElementsByTagName(qualifiedName: "feSpecularLighting"): HTMLCollectionOf[SVGFESpecularLightingElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_rt")
  def getElementsByTagName(qualifiedName: "rt"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_footer")
  def getElementsByTagName(qualifiedName: "footer"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_linearGradient")
  def getElementsByTagName(qualifiedName: "linearGradient"): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_nav")
  def getElementsByTagName(qualifiedName: "nav"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_pre")
  def getElementsByTagName(qualifiedName: "pre"): HTMLCollectionOf[HTMLPreElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_image")
  def getElementsByTagName(qualifiedName: "image"): HTMLCollectionOf[SVGImageElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_textPath")
  def getElementsByTagName(qualifiedName: "textPath"): HTMLCollectionOf[SVGTextPathElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_thead")
  def getElementsByTagName(qualifiedName: "thead"): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feMerge")
  def getElementsByTagName(qualifiedName: "feMerge"): HTMLCollectionOf[SVGFEMergeElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feOffset")
  def getElementsByTagName(qualifiedName: "feOffset"): HTMLCollectionOf[SVGFEOffsetElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dt")
  def getElementsByTagName(qualifiedName: "dt"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_ul")
  def getElementsByTagName(qualifiedName: "ul"): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_form")
  def getElementsByTagName(qualifiedName: "form"): HTMLCollectionOf[HTMLFormElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_radialGradient")
  def getElementsByTagName(qualifiedName: "radialGradient"): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_select")
  def getElementsByTagName(qualifiedName: "select"): HTMLCollectionOf[HTMLSelectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_bdi")
  def getElementsByTagName(qualifiedName: "bdi"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_s")
  def getElementsByTagName(qualifiedName: "s"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_foreignObject")
  def getElementsByTagName(qualifiedName: "foreignObject"): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_symbol")
  def getElementsByTagName(qualifiedName: "symbol"): HTMLCollectionOf[SVGSymbolElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_mark")
  def getElementsByTagName(qualifiedName: "mark"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_colgroup")
  def getElementsByTagName(qualifiedName: "colgroup"): HTMLCollectionOf[HTMLTableColElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_html")
  def getElementsByTagName(qualifiedName: "html"): HTMLCollectionOf[HTMLHtmlElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_strong")
  def getElementsByTagName(qualifiedName: "strong"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_feBlend")
  def getElementsByTagName(qualifiedName: "feBlend"): HTMLCollectionOf[SVGFEBlendElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_pattern")
  def getElementsByTagName(qualifiedName: "pattern"): HTMLCollectionOf[SVGPatternElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_tbody")
  def getElementsByTagName(qualifiedName: "tbody"): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_br")
  def getElementsByTagName(qualifiedName: "br"): HTMLCollectionOf[HTMLBRElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_article")
  def getElementsByTagName(qualifiedName: "article"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_base")
  def getElementsByTagName(qualifiedName: "base"): HTMLCollectionOf[HTMLBaseElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_noscript")
  def getElementsByTagName(qualifiedName: "noscript"): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_polygon")
  def getElementsByTagName(qualifiedName: "polygon"): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_hr")
  def getElementsByTagName(qualifiedName: "hr"): HTMLCollectionOf[HTMLHRElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_img")
  def getElementsByTagName(qualifiedName: "img"): HTMLCollectionOf[HTMLImageElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_legend")
  def getElementsByTagName(qualifiedName: "legend"): HTMLCollectionOf[HTMLLegendElement] = js.native
  @JSName("getElementsByTagName")
  @scala.annotation.targetName("getElementsByTagName_dialog")
  def getElementsByTagName(qualifiedName: "dialog"): HTMLCollectionOf[HTMLDialogElement] = js.native
  /* standard dom */
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  
  /**
    * If namespace and localName are "*" returns a HTMLCollection of all descendant elements.
    *
    * If only namespace is "*" returns a HTMLCollection of all descendant elements whose local name is localName.
    *
    * If only localName is "*" returns a HTMLCollection of all descendant elements whose namespace is namespace.
    *
    * Otherwise, returns a HTMLCollection of all descendant elements whose namespace is namespace and local name is localName.
    */
  /* standard dom */
  @JSName("getElementsByTagNameNS")
  @scala.annotation.targetName("getElementsByTagNameNS_httpwwww3org1999xhtml")
  def getElementsByTagNameNS(namespaceURI: "http://www.w3.org/1999/xhtml", localName: java.lang.String): HTMLCollectionOf[HTMLElement] = js.native
  /* standard dom */
  @JSName("getElementsByTagNameNS")
  @scala.annotation.targetName("getElementsByTagNameNS_httpwwww3org2000svg")
  def getElementsByTagNameNS(namespaceURI: "http://www.w3.org/2000/svg", localName: java.lang.String): HTMLCollectionOf[SVGElement] = js.native
  /* standard dom */
  def getElementsByTagNameNS(namespace: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespace: Null, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  
  /** Returns an object representing the current selection of the document that is loaded into the object displaying a webpage. */
  /* standard dom */
  def getSelection(): Selection | Null = js.native
  
  /** Gets a value indicating whether the object currently has focus. */
  /* standard dom */
  def hasFocus(): scala.Boolean = js.native
  
  /* standard dom */
  def hasStorageAccess(): js.Promise[scala.Boolean] = js.native
  
  /** Returns the head element. */
  /* standard dom */
  val head: HTMLHeadElement = js.native
  
  /* standard dom */
  val hidden: scala.Boolean = js.native
  
  /** Retrieves a collection, in source order, of img objects in the document. */
  /* standard dom */
  val images: HTMLCollectionOf[HTMLImageElement] = js.native
  
  /** Gets the implementation object of the current document. */
  /* standard dom */
  val implementation: DOMImplementation = js.native
  
  /**
    * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
    *
    * If node is a document or a shadow root, throws a "NotSupportedError" DOMException.
    */
  /* standard dom */
  def importNode[T /* <: Node */](node: T): T = js.native
  def importNode[T /* <: Node */](node: T, deep: scala.Boolean): T = js.native
  
  /**
    * Returns the character encoding used to create the webpage that is loaded into the document object.
    * @deprecated This is a legacy alias of `characterSet`.
    */
  /* standard dom */
  val inputEncoding: java.lang.String = js.native
  
  /** Gets the date that the page was last modified, if the page supplies one. */
  /* standard dom */
  val lastModified: java.lang.String = js.native
  
  /**
    * Sets or gets the color of the document links.
    * @deprecated
    */
  /* standard dom */
  var linkColor: java.lang.String = js.native
  
  /** Retrieves a collection of all a objects that specify the href property and all area objects in the document. */
  /* standard dom */
  val links: HTMLCollectionOf[HTMLAnchorElement | HTMLAreaElement] = js.native
  
  /** Contains information about the current URL. */
  /* standard dom */
  def location: Location = js.native
  /* standard dom */
  def location_=(href: java.lang.String | Location): Unit = js.native
  
  /* standard dom */
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onpointerlockchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onpointerlockerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /**
    * Fires when the state of the object has changed.
    * @param ev The event
    */
  /* standard dom */
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onvisibilitychange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /**
    * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
    * @param url Specifies a MIME type for the document.
    * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
    * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
    * @param replace Specifies whether the existing entry for the document is replaced in the history list.
    */
  /* standard dom */
  def open(): Document = js.native
  def open(unused1: java.lang.String): Document = js.native
  def open(unused1: java.lang.String, unused2: java.lang.String): Document = js.native
  def open(unused1: Unit, unused2: java.lang.String): Document = js.native
  /* standard dom */
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String): WindowProxy | Null = js.native
  def open(url: typings.std.URL, name: java.lang.String, features: java.lang.String): WindowProxy | Null = js.native
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_Document: Null = js.native
  
  /* standard dom */
  val pictureInPictureEnabled: scala.Boolean = js.native
  
  /** Return an HTMLCollection of the embed elements in the Document. */
  /* standard dom */
  val plugins: HTMLCollectionOf[HTMLEmbedElement] = js.native
  
  /**
    * Returns a Boolean value that indicates whether a specified command can be successfully executed using execCommand, given the current state of the document.
    * @param commandId Specifies a command identifier.
    * @deprecated
    */
  /* standard dom */
  def queryCommandEnabled(commandId: java.lang.String): scala.Boolean = js.native
  
  /**
    * Returns a Boolean value that indicates whether the specified command is in the indeterminate state.
    * @param commandId String that specifies a command identifier.
    * @deprecated
    */
  /* standard dom */
  def queryCommandIndeterm(commandId: java.lang.String): scala.Boolean = js.native
  
  /**
    * Returns a Boolean value that indicates the current state of the command.
    * @param commandId String that specifies a command identifier.
    * @deprecated
    */
  /* standard dom */
  def queryCommandState(commandId: java.lang.String): scala.Boolean = js.native
  
  /**
    * Returns a Boolean value that indicates whether the current command is supported on the current range.
    * @param commandId Specifies a command identifier.
    * @deprecated
    */
  /* standard dom */
  def queryCommandSupported(commandId: java.lang.String): scala.Boolean = js.native
  
  /**
    * Returns the current value of the document, range, or current selection for the given command.
    * @param commandId String that specifies a command identifier.
    * @deprecated
    */
  /* standard dom */
  def queryCommandValue(commandId: java.lang.String): java.lang.String = js.native
  
  /** Retrieves a value that indicates the current state of the object. */
  /* standard dom */
  val readyState: DocumentReadyState = js.native
  
  /** Gets the URL of the location that referred the user to the current page. */
  /* standard dom */
  val referrer: java.lang.String = js.native
  
  /** @deprecated */
  /* standard dom */
  def releaseEvents(): Unit = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenerror")
  def removeEventListener(`type`: "fullscreenerror", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_visibilitychange")
  def removeEventListener(`type`: "visibilitychange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pointerlockerror")
  def removeEventListener(`type`: "pointerlockerror", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_DOMContentLoaded")
  def removeEventListener(`type`: "DOMContentLoaded", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pointerlockchange")
  def removeEventListener(`type`: "pointerlockchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_readystatechange")
  def removeEventListener(`type`: "readystatechange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenchange")
  def removeEventListener(`type`: "fullscreenchange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_readystatechange")
  def removeEventListener(
    `type`: "readystatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_DOMContentLoaded")
  def removeEventListener(
    `type`: "DOMContentLoaded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pointerlockerror")
  def removeEventListener(
    `type`: "pointerlockerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenchange")
  def removeEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_visibilitychange")
  def removeEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pointerlockchange")
  def removeEventListener(
    `type`: "pointerlockchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenerror")
  def removeEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_readystatechange")
  def removeEventListener(
    `type`: "readystatechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pointerlockerror")
  def removeEventListener(
    `type`: "pointerlockerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_DOMContentLoaded")
  def removeEventListener(
    `type`: "DOMContentLoaded",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenerror")
  def removeEventListener(
    `type`: "fullscreenerror",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_pointerlockchange")
  def removeEventListener(
    `type`: "pointerlockchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_fullscreenchange")
  def removeEventListener(
    `type`: "fullscreenchange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_visibilitychange")
  def removeEventListener(
    `type`: "visibilitychange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def requestStorageAccess(): js.Promise[Unit] = js.native
  
  /** @deprecated */
  /* standard dom */
  val rootElement: SVGSVGElement | Null = js.native
  
  /** Retrieves a collection of all script objects in the document. */
  /* standard dom */
  val scripts: HTMLCollectionOf[HTMLScriptElement] = js.native
  
  /* standard dom */
  val scrollingElement: Element | Null = js.native
  
  /* standard dom */
  val timeline: DocumentTimeline = js.native
  
  /** Contains the title of the document. */
  /* standard dom */
  var title: java.lang.String = js.native
  
  /* standard dom */
  val visibilityState: DocumentVisibilityState = js.native
  
  /**
    * Sets or gets the color of the links that the user has visited.
    * @deprecated
    */
  /* standard dom */
  var vlinkColor: java.lang.String = js.native
  
  /**
    * Writes one or more HTML expressions to a document in the specified window.
    * @param content Specifies the text and HTML tags to write.
    */
  /* standard dom */
  def write(text: java.lang.String*): Unit = js.native
  
  /**
    * Writes one or more HTML expressions, followed by a carriage return, to a document in the specified window.
    * @param content The text and HTML tags to write.
    */
  /* standard dom */
  def writeln(text: java.lang.String*): Unit = js.native
}
