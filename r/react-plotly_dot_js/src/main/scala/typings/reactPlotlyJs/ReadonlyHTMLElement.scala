package typings.reactPlotlyJs

import typings.reactPlotlyJs.reactPlotlyJsStrings.a
import typings.reactPlotlyJs.reactPlotlyJsStrings.fullscreenchange
import typings.reactPlotlyJs.reactPlotlyJsStrings.httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml
import typings.std.Animation
import typings.std.AnimationEvent
import typings.std.Attr
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.ClipboardEvent
import typings.std.DOMRect
import typings.std.DOMRectList
import typings.std.DOMStringMap
import typings.std.DOMTokenList
import typings.std.Document_
import typings.std.DragEvent
import typings.std.Element
import typings.std.Error
import typings.std.EventTarget
import typings.std.Event_
import typings.std.FocusEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.KeyboardEvent
import typings.std.Keyframe
import typings.std.MouseEvent
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeListOf
import typings.std.OnErrorEventHandler
import typings.std.ParentNode
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.ShadowRoot
import typings.std.ShadowRootInit
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.HTMLElement> */
trait ReadonlyHTMLElement extends js.Object {
  val ATTRIBUTE_NODE: Double
  val CDATA_SECTION_NODE: Double
  val COMMENT_NODE: Double
  val DOCUMENT_FRAGMENT_NODE: Double
  val DOCUMENT_NODE: Double
  val DOCUMENT_POSITION_CONTAINED_BY: Double
  val DOCUMENT_POSITION_CONTAINS: Double
  val DOCUMENT_POSITION_DISCONNECTED: Double
  val DOCUMENT_POSITION_FOLLOWING: Double
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double
  val DOCUMENT_POSITION_PRECEDING: Double
  val DOCUMENT_TYPE_NODE: Double
  val ELEMENT_NODE: Double
  val ENTITY_NODE: Double
  val ENTITY_REFERENCE_NODE: Double
  val NOTATION_NODE: Double
  val PROCESSING_INSTRUCTION_NODE: Double
  val TEXT_NODE: Double
  val accessKey: String
  val accessKeyLabel: String
  val addEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
    Unit
  ]
  val after: js.Function1[/* repeated */ Node | String, Unit]
  val animate: js.Function1[/* keyframes */ js.Array[Keyframe], Animation]
  val append: js.Function1[/* repeated */ Node | String, Unit]
  val appendChild: js.Function1[/* newChild */ Node, Node]
  val assignedSlot: js.UndefOr[HTMLSlotElement] = js.undefined
  val attachShadow: js.Function1[/* init */ ShadowRootInit, ShadowRoot]
  val attributes: NamedNodeMap
  val autocapitalize: String
  val autofocus: Boolean
  val baseURI: String
  val before: js.Function1[/* repeated */ Node | String, Unit]
  val blur: js.Function0[Unit]
  val childElementCount: Double
  val childNodes: NodeListOf[ChildNode]
  val children: HTMLCollection
  val classList: DOMTokenList
  val className: String
  val click: js.Function0[Unit]
  val clientHeight: Double
  val clientLeft: Double
  val clientTop: Double
  val clientWidth: Double
  val cloneNode: js.Function0[Node]
  val closest: js.Function1[a, HTMLAnchorElement | Null]
  val compareDocumentPosition: js.Function1[/* other */ Node, Double]
  val contains: js.Function1[/* other */ Node, Boolean]
  val contentEditable: String
  val dataset: DOMStringMap
  val dir: String
  val dispatchEvent: js.Function1[/* event */ Event_, Boolean]
  val draggable: Boolean
  val firstChild: js.UndefOr[ChildNode] = js.undefined
  val firstElementChild: js.UndefOr[Element] = js.undefined
  val focus: js.Function0[Unit]
  val getAnimations: js.Function0[js.Array[Animation]]
  val getAttribute: js.Function1[/* qualifiedName */ String, String | Null]
  val getAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, String | Null]
  val getAttributeNames: js.Function0[js.Array[String]]
  val getAttributeNode: js.Function1[/* name */ String, Attr | Null]
  val getAttributeNodeNS: js.Function2[/* namespaceURI */ String, /* localName */ String, Attr | Null]
  val getBoundingClientRect: js.Function0[DOMRect]
  val getClientRects: js.Function0[DOMRectList]
  val getElementsByClassName: js.Function1[/* classNames */ String, HTMLCollectionOf[Element]]
  val getElementsByTagName: js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]]
  val getElementsByTagNameNS: js.Function2[
    httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
    /* localName */ String, 
    HTMLCollectionOf[HTMLElement]
  ]
  val getRootNode: js.Function0[Node]
  val hasAttribute: js.Function1[/* qualifiedName */ String, Boolean]
  val hasAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Boolean]
  val hasAttributes: js.Function0[Boolean]
  val hasChildNodes: js.Function0[Boolean]
  val hasPointerCapture: js.Function1[/* pointerId */ Double, Boolean]
  val hidden: Boolean
  val id: String
  val innerHTML: String
  val innerText: String
  val inputMode: String
  val insertAdjacentElement: js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null]
  val insertAdjacentHTML: js.Function2[/* where */ InsertPosition, /* html */ String, Unit]
  val insertAdjacentText: js.Function2[/* where */ InsertPosition, /* text */ String, Unit]
  val insertBefore: js.Function2[/* newChild */ Node, /* refChild */ Node, Node]
  val isConnected: Boolean
  val isContentEditable: Boolean
  val isDefaultNamespace: js.Function1[/* namespace */ String, Boolean]
  val isEqualNode: js.Function1[/* otherNode */ Node, Boolean]
  val isSameNode: js.Function1[/* otherNode */ Node, Boolean]
  val lang: String
  val lastChild: js.UndefOr[ChildNode] = js.undefined
  val lastElementChild: js.UndefOr[Element] = js.undefined
  val localName: String
  val lookupNamespaceURI: js.Function1[/* prefix */ String, String | Null]
  val lookupPrefix: js.Function1[/* namespace */ String, String | Null]
  val matches: js.Function1[/* selectors */ String, Boolean]
  val msGetRegionContent: js.Function0[_]
  val namespaceURI: js.UndefOr[String] = js.undefined
  val nextElementSibling: js.UndefOr[Element] = js.undefined
  val nextSibling: js.UndefOr[ChildNode] = js.undefined
  val nodeName: String
  val nodeType: Double
  val nodeValue: js.UndefOr[String] = js.undefined
  val nonce: js.UndefOr[String] = js.undefined
  val normalize: js.Function0[Unit]
  val offsetHeight: Double
  val offsetLeft: Double
  val offsetParent: js.UndefOr[Element] = js.undefined
  val offsetTop: Double
  val offsetWidth: Double
  val onabort: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  val onanimationcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onanimationend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onanimationiteration: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onanimationstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]] = js.undefined
  val onauxclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onblur: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  val oncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncanplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncanplaythrough: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onclose: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncontextmenu: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val oncopy: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  val oncuechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oncut: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  val ondblclick: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val ondrag: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragexit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ondragleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondragstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondrop: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]] = js.undefined
  val ondurationchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onemptied: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onended: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onerror: OnErrorEventHandler
  val onfocus: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]] = js.undefined
  val onfullscreenchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onfullscreenerror: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ongotpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val oninput: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val oninvalid: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onkeydown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  val onkeypress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  val onkeyup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]] = js.undefined
  val onload: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onloadeddata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onloadedmetadata: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onloadstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onlostpointercapture: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onmousedown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmousemove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onmouseup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]] = js.undefined
  val onpaste: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]] = js.undefined
  val onpause: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onplay: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onplaying: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onpointercancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerdown: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerenter: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerleave: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointermove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerout: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerover: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onpointerup: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]] = js.undefined
  val onprogress: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]] = js.undefined
  val onratechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onreset: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onresize: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]] = js.undefined
  val onscroll: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onsecuritypolicyviolation: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]] = js.undefined
  val onseeked: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onseeking: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onselect: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onselectionchange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onselectstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onstalled: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onsubmit: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onsuspend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ontimeupdate: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ontoggle: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val ontouchcancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontouchend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontouchmove: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontouchstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]] = js.undefined
  val ontransitioncancel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val ontransitionend: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val ontransitionrun: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val ontransitionstart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]] = js.undefined
  val onvolumechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onwaiting: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]] = js.undefined
  val onwheel: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]] = js.undefined
  val outerHTML: String
  val ownerDocument: js.UndefOr[Document_] = js.undefined
  val parentElement: js.UndefOr[HTMLElement] = js.undefined
  val parentNode: js.UndefOr[Node with ParentNode] = js.undefined
  val prefix: js.UndefOr[String] = js.undefined
  val prepend: js.Function1[/* repeated */ Node | String, Unit]
  val previousElementSibling: js.UndefOr[Element] = js.undefined
  val previousSibling: js.UndefOr[ChildNode] = js.undefined
  val querySelector: js.Function1[a, HTMLAnchorElement | Null]
  val querySelectorAll: js.Function1[a, NodeListOf[HTMLAnchorElement]]
  val releasePointerCapture: js.Function1[/* pointerId */ Double, Unit]
  val remove: js.Function0[Unit]
  val removeAttribute: js.Function1[/* qualifiedName */ String, Unit]
  val removeAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Unit]
  val removeAttributeNode: js.Function1[/* attr */ Attr, Attr]
  val removeChild: js.Function1[/* oldChild */ Node, Node]
  val removeEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _], 
    Unit
  ]
  val replaceChild: js.Function2[/* newChild */ Node, /* oldChild */ Node, Node]
  val replaceWith: js.Function1[/* repeated */ Node | String, Unit]
  val requestFullscreen: js.Function0[js.Promise[Unit]]
  val requestPointerLock: js.Function0[Unit]
  val scroll: js.Function0[Unit]
  val scrollBy: js.Function0[Unit]
  val scrollHeight: Double
  val scrollIntoView: js.Function0[Unit]
  val scrollLeft: Double
  val scrollTo: js.Function0[Unit]
  val scrollTop: Double
  val scrollWidth: Double
  val setAttribute: js.Function2[/* qualifiedName */ String, /* value */ String, Unit]
  val setAttributeNS: js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit]
  val setAttributeNode: js.Function1[/* attr */ Attr, Attr | Null]
  val setAttributeNodeNS: js.Function1[/* attr */ Attr, Attr | Null]
  val setPointerCapture: js.Function1[/* pointerId */ Double, Unit]
  val shadowRoot: js.UndefOr[ShadowRoot] = js.undefined
  val slot: String
  val spellcheck: Boolean
  val style: CSSStyleDeclaration
  val tabIndex: Double
  val tagName: String
  val textContent: js.UndefOr[String] = js.undefined
  val title: String
  val toggleAttribute: js.Function1[/* qualifiedName */ String, Boolean]
  val translate: Boolean
  val webkitMatchesSelector: js.Function1[/* selectors */ String, Boolean]
}

object ReadonlyHTMLElement {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Double,
    CDATA_SECTION_NODE: Double,
    COMMENT_NODE: Double,
    DOCUMENT_FRAGMENT_NODE: Double,
    DOCUMENT_NODE: Double,
    DOCUMENT_POSITION_CONTAINED_BY: Double,
    DOCUMENT_POSITION_CONTAINS: Double,
    DOCUMENT_POSITION_DISCONNECTED: Double,
    DOCUMENT_POSITION_FOLLOWING: Double,
    DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double,
    DOCUMENT_POSITION_PRECEDING: Double,
    DOCUMENT_TYPE_NODE: Double,
    ELEMENT_NODE: Double,
    ENTITY_NODE: Double,
    ENTITY_REFERENCE_NODE: Double,
    NOTATION_NODE: Double,
    PROCESSING_INSTRUCTION_NODE: Double,
    TEXT_NODE: Double,
    accessKey: String,
    accessKeyLabel: String,
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]) => Unit,
    after: /* repeated */ Node | String => Unit,
    animate: /* keyframes */ js.Array[Keyframe] => Animation,
    append: /* repeated */ Node | String => Unit,
    appendChild: /* newChild */ Node => Node,
    attachShadow: /* init */ ShadowRootInit => ShadowRoot,
    attributes: NamedNodeMap,
    autocapitalize: String,
    autofocus: Boolean,
    baseURI: String,
    before: /* repeated */ Node | String => Unit,
    blur: () => Unit,
    childElementCount: Double,
    childNodes: NodeListOf[ChildNode],
    children: HTMLCollection,
    classList: DOMTokenList,
    className: String,
    click: () => Unit,
    clientHeight: Double,
    clientLeft: Double,
    clientTop: Double,
    clientWidth: Double,
    cloneNode: () => Node,
    closest: a => HTMLAnchorElement | Null,
    compareDocumentPosition: /* other */ Node => Double,
    contains: /* other */ Node => Boolean,
    contentEditable: String,
    dataset: DOMStringMap,
    dir: String,
    dispatchEvent: /* event */ Event_ => Boolean,
    draggable: Boolean,
    focus: () => Unit,
    getAnimations: () => js.Array[Animation],
    getAttribute: /* qualifiedName */ String => String | Null,
    getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null,
    getAttributeNames: () => js.Array[String],
    getAttributeNode: /* name */ String => Attr | Null,
    getAttributeNodeNS: (/* namespaceURI */ String, /* localName */ String) => Attr | Null,
    getBoundingClientRect: () => DOMRect,
    getClientRects: () => DOMRectList,
    getElementsByClassName: /* classNames */ String => HTMLCollectionOf[Element],
    getElementsByTagName: a => HTMLCollectionOf[HTMLAnchorElement],
    getElementsByTagNameNS: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement],
    getRootNode: () => Node,
    hasAttribute: /* qualifiedName */ String => Boolean,
    hasAttributeNS: (/* namespace */ String, /* localName */ String) => Boolean,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    hasPointerCapture: /* pointerId */ Double => Boolean,
    hidden: Boolean,
    id: String,
    innerHTML: String,
    innerText: String,
    inputMode: String,
    insertAdjacentElement: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null,
    insertAdjacentHTML: (/* where */ InsertPosition, /* html */ String) => Unit,
    insertAdjacentText: (/* where */ InsertPosition, /* text */ String) => Unit,
    insertBefore: (/* newChild */ Node, /* refChild */ Node) => Node,
    isConnected: Boolean,
    isContentEditable: Boolean,
    isDefaultNamespace: /* namespace */ String => Boolean,
    isEqualNode: /* otherNode */ Node => Boolean,
    isSameNode: /* otherNode */ Node => Boolean,
    lang: String,
    localName: String,
    lookupNamespaceURI: /* prefix */ String => String | Null,
    lookupPrefix: /* namespace */ String => String | Null,
    matches: /* selectors */ String => Boolean,
    msGetRegionContent: () => _,
    nodeName: String,
    nodeType: Double,
    normalize: () => Unit,
    offsetHeight: Double,
    offsetLeft: Double,
    offsetTop: Double,
    offsetWidth: Double,
    outerHTML: String,
    prepend: /* repeated */ Node | String => Unit,
    querySelector: a => HTMLAnchorElement | Null,
    querySelectorAll: a => NodeListOf[HTMLAnchorElement],
    releasePointerCapture: /* pointerId */ Double => Unit,
    remove: () => Unit,
    removeAttribute: /* qualifiedName */ String => Unit,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Unit,
    removeAttributeNode: /* attr */ Attr => Attr,
    removeChild: /* oldChild */ Node => Node,
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _]) => Unit,
    replaceChild: (/* newChild */ Node, /* oldChild */ Node) => Node,
    replaceWith: /* repeated */ Node | String => Unit,
    requestFullscreen: () => js.Promise[Unit],
    requestPointerLock: () => Unit,
    scroll: () => Unit,
    scrollBy: () => Unit,
    scrollHeight: Double,
    scrollIntoView: () => Unit,
    scrollLeft: Double,
    scrollTo: () => Unit,
    scrollTop: Double,
    scrollWidth: Double,
    setAttribute: (/* qualifiedName */ String, /* value */ String) => Unit,
    setAttributeNS: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit,
    setAttributeNode: /* attr */ Attr => Attr | Null,
    setAttributeNodeNS: /* attr */ Attr => Attr | Null,
    setPointerCapture: /* pointerId */ Double => Unit,
    slot: String,
    spellcheck: Boolean,
    style: CSSStyleDeclaration,
    tabIndex: Double,
    tagName: String,
    title: String,
    toggleAttribute: /* qualifiedName */ String => Boolean,
    translate: Boolean,
    webkitMatchesSelector: /* selectors */ String => Boolean,
    assignedSlot: HTMLSlotElement = null,
    firstChild: ChildNode = null,
    firstElementChild: Element = null,
    lastChild: ChildNode = null,
    lastElementChild: Element = null,
    namespaceURI: String = null,
    nextElementSibling: Element = null,
    nextSibling: ChildNode = null,
    nodeValue: String = null,
    nonce: String = null,
    offsetParent: Element = null,
    onabort: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _] = null,
    onanimationcancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onanimationend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onanimationiteration: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onanimationstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _] = null,
    onauxclick: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onblur: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _] = null,
    oncancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncanplay: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncanplaythrough: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onclick: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onclose: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncontextmenu: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    oncopy: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _] = null,
    oncuechange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oncut: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _] = null,
    ondblclick: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    ondrag: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragenter: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragexit: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ondragleave: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragover: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondragstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondrop: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _] = null,
    ondurationchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onemptied: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onended: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onerror: (/* event */ Event_ | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any = null,
    onfocus: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _] = null,
    onfullscreenchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onfullscreenerror: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ongotpointercapture: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    oninput: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    oninvalid: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onkeydown: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _] = null,
    onkeypress: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _] = null,
    onkeyup: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _] = null,
    onload: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onloadeddata: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onloadedmetadata: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onloadstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onlostpointercapture: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onmousedown: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseenter: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseleave: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmousemove: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseout: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseover: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onmouseup: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _] = null,
    onpaste: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _] = null,
    onpause: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onplay: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onplaying: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onpointercancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerdown: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerenter: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerleave: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointermove: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerout: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerover: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onpointerup: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _] = null,
    onprogress: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ProgressEvent[EventTarget], _] = null,
    onratechange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onreset: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onresize: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _] = null,
    onscroll: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onsecuritypolicyviolation: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ SecurityPolicyViolationEvent, _] = null,
    onseeked: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onseeking: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onselect: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onselectionchange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onselectstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onstalled: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onsubmit: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onsuspend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ontimeupdate: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ontoggle: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    ontouchcancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontouchend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontouchmove: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontouchstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _] = null,
    ontransitioncancel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    ontransitionend: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    ontransitionrun: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    ontransitionstart: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _] = null,
    onvolumechange: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onwaiting: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event_, _] = null,
    onwheel: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ WheelEvent, _] = null,
    ownerDocument: Document_ = null,
    parentElement: HTMLElement = null,
    parentNode: Node with ParentNode = null,
    prefix: String = null,
    previousElementSibling: Element = null,
    previousSibling: ChildNode = null,
    shadowRoot: ShadowRoot = null,
    textContent: String = null
  ): ReadonlyHTMLElement = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINED_BY = DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINS = DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any], DOCUMENT_POSITION_DISCONNECTED = DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any], DOCUMENT_POSITION_FOLLOWING = DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any], DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any], DOCUMENT_POSITION_PRECEDING = DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], accessKey = accessKey.asInstanceOf[js.Any], accessKeyLabel = accessKeyLabel.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), after = js.Any.fromFunction1(after), animate = js.Any.fromFunction1(animate), append = js.Any.fromFunction1(append), appendChild = js.Any.fromFunction1(appendChild), attachShadow = js.Any.fromFunction1(attachShadow), attributes = attributes.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], baseURI = baseURI.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), blur = js.Any.fromFunction0(blur), childElementCount = childElementCount.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), clientHeight = clientHeight.asInstanceOf[js.Any], clientLeft = clientLeft.asInstanceOf[js.Any], clientTop = clientTop.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction0(cloneNode), closest = js.Any.fromFunction1(closest), compareDocumentPosition = js.Any.fromFunction1(compareDocumentPosition), contains = js.Any.fromFunction1(contains), contentEditable = contentEditable.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), draggable = draggable.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getAnimations = js.Any.fromFunction0(getAnimations), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getRootNode = js.Any.fromFunction0(getRootNode), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasPointerCapture = js.Any.fromFunction1(hasPointerCapture), hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], insertAdjacentElement = js.Any.fromFunction2(insertAdjacentElement), insertAdjacentHTML = js.Any.fromFunction2(insertAdjacentHTML), insertAdjacentText = js.Any.fromFunction2(insertAdjacentText), insertBefore = js.Any.fromFunction2(insertBefore), isConnected = isConnected.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any], isDefaultNamespace = js.Any.fromFunction1(isDefaultNamespace), isEqualNode = js.Any.fromFunction1(isEqualNode), isSameNode = js.Any.fromFunction1(isSameNode), lang = lang.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], lookupNamespaceURI = js.Any.fromFunction1(lookupNamespaceURI), lookupPrefix = js.Any.fromFunction1(lookupPrefix), matches = js.Any.fromFunction1(matches), msGetRegionContent = js.Any.fromFunction0(msGetRegionContent), nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend), querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll), releasePointerCapture = js.Any.fromFunction1(releasePointerCapture), remove = js.Any.fromFunction0(remove), removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), replaceWith = js.Any.fromFunction1(replaceWith), requestFullscreen = js.Any.fromFunction0(requestFullscreen), requestPointerLock = js.Any.fromFunction0(requestPointerLock), scroll = js.Any.fromFunction0(scroll), scrollBy = js.Any.fromFunction0(scrollBy), scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollIntoView = js.Any.fromFunction0(scrollIntoView), scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTo = js.Any.fromFunction0(scrollTo), scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setPointerCapture = js.Any.fromFunction1(setPointerCapture), slot = slot.asInstanceOf[js.Any], spellcheck = spellcheck.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toggleAttribute = js.Any.fromFunction1(toggleAttribute), translate = translate.asInstanceOf[js.Any], webkitMatchesSelector = js.Any.fromFunction1(webkitMatchesSelector))
    if (assignedSlot != null) __obj.updateDynamic("assignedSlot")(assignedSlot.asInstanceOf[js.Any])
    if (firstChild != null) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (firstElementChild != null) __obj.updateDynamic("firstElementChild")(firstElementChild.asInstanceOf[js.Any])
    if (lastChild != null) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (lastElementChild != null) __obj.updateDynamic("lastElementChild")(lastElementChild.asInstanceOf[js.Any])
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling.asInstanceOf[js.Any])
    if (nextSibling != null) __obj.updateDynamic("nextSibling")(nextSibling.asInstanceOf[js.Any])
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (offsetParent != null) __obj.updateDynamic("offsetParent")(offsetParent.asInstanceOf[js.Any])
    if (onabort != null) __obj.updateDynamic("onabort")(onabort.asInstanceOf[js.Any])
    if (onanimationcancel != null) __obj.updateDynamic("onanimationcancel")(onanimationcancel.asInstanceOf[js.Any])
    if (onanimationend != null) __obj.updateDynamic("onanimationend")(onanimationend.asInstanceOf[js.Any])
    if (onanimationiteration != null) __obj.updateDynamic("onanimationiteration")(onanimationiteration.asInstanceOf[js.Any])
    if (onanimationstart != null) __obj.updateDynamic("onanimationstart")(onanimationstart.asInstanceOf[js.Any])
    if (onauxclick != null) __obj.updateDynamic("onauxclick")(onauxclick.asInstanceOf[js.Any])
    if (onblur != null) __obj.updateDynamic("onblur")(onblur.asInstanceOf[js.Any])
    if (oncancel != null) __obj.updateDynamic("oncancel")(oncancel.asInstanceOf[js.Any])
    if (oncanplay != null) __obj.updateDynamic("oncanplay")(oncanplay.asInstanceOf[js.Any])
    if (oncanplaythrough != null) __obj.updateDynamic("oncanplaythrough")(oncanplaythrough.asInstanceOf[js.Any])
    if (onchange != null) __obj.updateDynamic("onchange")(onchange.asInstanceOf[js.Any])
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onclose != null) __obj.updateDynamic("onclose")(onclose.asInstanceOf[js.Any])
    if (oncontextmenu != null) __obj.updateDynamic("oncontextmenu")(oncontextmenu.asInstanceOf[js.Any])
    if (oncopy != null) __obj.updateDynamic("oncopy")(oncopy.asInstanceOf[js.Any])
    if (oncuechange != null) __obj.updateDynamic("oncuechange")(oncuechange.asInstanceOf[js.Any])
    if (oncut != null) __obj.updateDynamic("oncut")(oncut.asInstanceOf[js.Any])
    if (ondblclick != null) __obj.updateDynamic("ondblclick")(ondblclick.asInstanceOf[js.Any])
    if (ondrag != null) __obj.updateDynamic("ondrag")(ondrag.asInstanceOf[js.Any])
    if (ondragend != null) __obj.updateDynamic("ondragend")(ondragend.asInstanceOf[js.Any])
    if (ondragenter != null) __obj.updateDynamic("ondragenter")(ondragenter.asInstanceOf[js.Any])
    if (ondragexit != null) __obj.updateDynamic("ondragexit")(ondragexit.asInstanceOf[js.Any])
    if (ondragleave != null) __obj.updateDynamic("ondragleave")(ondragleave.asInstanceOf[js.Any])
    if (ondragover != null) __obj.updateDynamic("ondragover")(ondragover.asInstanceOf[js.Any])
    if (ondragstart != null) __obj.updateDynamic("ondragstart")(ondragstart.asInstanceOf[js.Any])
    if (ondrop != null) __obj.updateDynamic("ondrop")(ondrop.asInstanceOf[js.Any])
    if (ondurationchange != null) __obj.updateDynamic("ondurationchange")(ondurationchange.asInstanceOf[js.Any])
    if (onemptied != null) __obj.updateDynamic("onemptied")(onemptied.asInstanceOf[js.Any])
    if (onended != null) __obj.updateDynamic("onended")(onended.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction5(onerror))
    if (onfocus != null) __obj.updateDynamic("onfocus")(onfocus.asInstanceOf[js.Any])
    if (onfullscreenchange != null) __obj.updateDynamic("onfullscreenchange")(onfullscreenchange.asInstanceOf[js.Any])
    if (onfullscreenerror != null) __obj.updateDynamic("onfullscreenerror")(onfullscreenerror.asInstanceOf[js.Any])
    if (ongotpointercapture != null) __obj.updateDynamic("ongotpointercapture")(ongotpointercapture.asInstanceOf[js.Any])
    if (oninput != null) __obj.updateDynamic("oninput")(oninput.asInstanceOf[js.Any])
    if (oninvalid != null) __obj.updateDynamic("oninvalid")(oninvalid.asInstanceOf[js.Any])
    if (onkeydown != null) __obj.updateDynamic("onkeydown")(onkeydown.asInstanceOf[js.Any])
    if (onkeypress != null) __obj.updateDynamic("onkeypress")(onkeypress.asInstanceOf[js.Any])
    if (onkeyup != null) __obj.updateDynamic("onkeyup")(onkeyup.asInstanceOf[js.Any])
    if (onload != null) __obj.updateDynamic("onload")(onload.asInstanceOf[js.Any])
    if (onloadeddata != null) __obj.updateDynamic("onloadeddata")(onloadeddata.asInstanceOf[js.Any])
    if (onloadedmetadata != null) __obj.updateDynamic("onloadedmetadata")(onloadedmetadata.asInstanceOf[js.Any])
    if (onloadstart != null) __obj.updateDynamic("onloadstart")(onloadstart.asInstanceOf[js.Any])
    if (onlostpointercapture != null) __obj.updateDynamic("onlostpointercapture")(onlostpointercapture.asInstanceOf[js.Any])
    if (onmousedown != null) __obj.updateDynamic("onmousedown")(onmousedown.asInstanceOf[js.Any])
    if (onmouseenter != null) __obj.updateDynamic("onmouseenter")(onmouseenter.asInstanceOf[js.Any])
    if (onmouseleave != null) __obj.updateDynamic("onmouseleave")(onmouseleave.asInstanceOf[js.Any])
    if (onmousemove != null) __obj.updateDynamic("onmousemove")(onmousemove.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (onmouseup != null) __obj.updateDynamic("onmouseup")(onmouseup.asInstanceOf[js.Any])
    if (onpaste != null) __obj.updateDynamic("onpaste")(onpaste.asInstanceOf[js.Any])
    if (onpause != null) __obj.updateDynamic("onpause")(onpause.asInstanceOf[js.Any])
    if (onplay != null) __obj.updateDynamic("onplay")(onplay.asInstanceOf[js.Any])
    if (onplaying != null) __obj.updateDynamic("onplaying")(onplaying.asInstanceOf[js.Any])
    if (onpointercancel != null) __obj.updateDynamic("onpointercancel")(onpointercancel.asInstanceOf[js.Any])
    if (onpointerdown != null) __obj.updateDynamic("onpointerdown")(onpointerdown.asInstanceOf[js.Any])
    if (onpointerenter != null) __obj.updateDynamic("onpointerenter")(onpointerenter.asInstanceOf[js.Any])
    if (onpointerleave != null) __obj.updateDynamic("onpointerleave")(onpointerleave.asInstanceOf[js.Any])
    if (onpointermove != null) __obj.updateDynamic("onpointermove")(onpointermove.asInstanceOf[js.Any])
    if (onpointerout != null) __obj.updateDynamic("onpointerout")(onpointerout.asInstanceOf[js.Any])
    if (onpointerover != null) __obj.updateDynamic("onpointerover")(onpointerover.asInstanceOf[js.Any])
    if (onpointerup != null) __obj.updateDynamic("onpointerup")(onpointerup.asInstanceOf[js.Any])
    if (onprogress != null) __obj.updateDynamic("onprogress")(onprogress.asInstanceOf[js.Any])
    if (onratechange != null) __obj.updateDynamic("onratechange")(onratechange.asInstanceOf[js.Any])
    if (onreset != null) __obj.updateDynamic("onreset")(onreset.asInstanceOf[js.Any])
    if (onresize != null) __obj.updateDynamic("onresize")(onresize.asInstanceOf[js.Any])
    if (onscroll != null) __obj.updateDynamic("onscroll")(onscroll.asInstanceOf[js.Any])
    if (onsecuritypolicyviolation != null) __obj.updateDynamic("onsecuritypolicyviolation")(onsecuritypolicyviolation.asInstanceOf[js.Any])
    if (onseeked != null) __obj.updateDynamic("onseeked")(onseeked.asInstanceOf[js.Any])
    if (onseeking != null) __obj.updateDynamic("onseeking")(onseeking.asInstanceOf[js.Any])
    if (onselect != null) __obj.updateDynamic("onselect")(onselect.asInstanceOf[js.Any])
    if (onselectionchange != null) __obj.updateDynamic("onselectionchange")(onselectionchange.asInstanceOf[js.Any])
    if (onselectstart != null) __obj.updateDynamic("onselectstart")(onselectstart.asInstanceOf[js.Any])
    if (onstalled != null) __obj.updateDynamic("onstalled")(onstalled.asInstanceOf[js.Any])
    if (onsubmit != null) __obj.updateDynamic("onsubmit")(onsubmit.asInstanceOf[js.Any])
    if (onsuspend != null) __obj.updateDynamic("onsuspend")(onsuspend.asInstanceOf[js.Any])
    if (ontimeupdate != null) __obj.updateDynamic("ontimeupdate")(ontimeupdate.asInstanceOf[js.Any])
    if (ontoggle != null) __obj.updateDynamic("ontoggle")(ontoggle.asInstanceOf[js.Any])
    if (ontouchcancel != null) __obj.updateDynamic("ontouchcancel")(ontouchcancel.asInstanceOf[js.Any])
    if (ontouchend != null) __obj.updateDynamic("ontouchend")(ontouchend.asInstanceOf[js.Any])
    if (ontouchmove != null) __obj.updateDynamic("ontouchmove")(ontouchmove.asInstanceOf[js.Any])
    if (ontouchstart != null) __obj.updateDynamic("ontouchstart")(ontouchstart.asInstanceOf[js.Any])
    if (ontransitioncancel != null) __obj.updateDynamic("ontransitioncancel")(ontransitioncancel.asInstanceOf[js.Any])
    if (ontransitionend != null) __obj.updateDynamic("ontransitionend")(ontransitionend.asInstanceOf[js.Any])
    if (ontransitionrun != null) __obj.updateDynamic("ontransitionrun")(ontransitionrun.asInstanceOf[js.Any])
    if (ontransitionstart != null) __obj.updateDynamic("ontransitionstart")(ontransitionstart.asInstanceOf[js.Any])
    if (onvolumechange != null) __obj.updateDynamic("onvolumechange")(onvolumechange.asInstanceOf[js.Any])
    if (onwaiting != null) __obj.updateDynamic("onwaiting")(onwaiting.asInstanceOf[js.Any])
    if (onwheel != null) __obj.updateDynamic("onwheel")(onwheel.asInstanceOf[js.Any])
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement.asInstanceOf[js.Any])
    if (parentNode != null) __obj.updateDynamic("parentNode")(parentNode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling.asInstanceOf[js.Any])
    if (previousSibling != null) __obj.updateDynamic("previousSibling")(previousSibling.asInstanceOf[js.Any])
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHTMLElement]
  }
}

