package typings.reactPlotlyJs.anon

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
import typings.std.Document
import typings.std.DragEvent
import typings.std.Element
import typings.std.Error
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLAnchorElement
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSlotElement
import typings.std.InsertPosition
import typings.std.KeyboardEvent
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.HTMLElement> */
@js.native
trait ReadonlyHTMLElement extends js.Object {
  
  val ATTRIBUTE_NODE: Double = js.native
  
  val CDATA_SECTION_NODE: Double = js.native
  
  val COMMENT_NODE: Double = js.native
  
  val DOCUMENT_FRAGMENT_NODE: Double = js.native
  
  val DOCUMENT_NODE: Double = js.native
  
  val DOCUMENT_POSITION_CONTAINED_BY: Double = js.native
  
  val DOCUMENT_POSITION_CONTAINS: Double = js.native
  
  val DOCUMENT_POSITION_DISCONNECTED: Double = js.native
  
  val DOCUMENT_POSITION_FOLLOWING: Double = js.native
  
  val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Double = js.native
  
  val DOCUMENT_POSITION_PRECEDING: Double = js.native
  
  val DOCUMENT_TYPE_NODE: Double = js.native
  
  val ELEMENT_NODE: Double = js.native
  
  val ENTITY_NODE: Double = js.native
  
  val ENTITY_REFERENCE_NODE: Double = js.native
  
  val NOTATION_NODE: Double = js.native
  
  val PROCESSING_INSTRUCTION_NODE: Double = js.native
  
  val TEXT_NODE: Double = js.native
  
  val accessKey: String = js.native
  
  val accessKeyLabel: String = js.native
  
  val addEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
    Unit
  ] = js.native
  
  val after: js.Function1[/* repeated */ Node | String, Unit] = js.native
  
  val animate: js.Function0[Animation] = js.native
  
  val append: js.Function1[/* repeated */ Node | String, Unit] = js.native
  
  val appendChild: js.Function1[/* newChild */ Node, Node] = js.native
  
  val assignedSlot: js.UndefOr[HTMLSlotElement | Null] = js.native
  
  val attachShadow: js.Function1[/* init */ ShadowRootInit, ShadowRoot] = js.native
  
  val attributes: NamedNodeMap = js.native
  
  val autocapitalize: String = js.native
  
  val autofocus: Boolean = js.native
  
  val baseURI: String = js.native
  
  val before: js.Function1[/* repeated */ Node | String, Unit] = js.native
  
  val blur: js.Function0[Unit] = js.native
  
  val childElementCount: Double = js.native
  
  val childNodes: NodeListOf[ChildNode] = js.native
  
  val children: HTMLCollection = js.native
  
  val classList: DOMTokenList = js.native
  
  val className: String = js.native
  
  val click: js.Function0[Unit] = js.native
  
  val clientHeight: Double = js.native
  
  val clientLeft: Double = js.native
  
  val clientTop: Double = js.native
  
  val clientWidth: Double = js.native
  
  val cloneNode: js.Function0[Node] = js.native
  
  val closest: js.Function1[a, HTMLAnchorElement | Null] = js.native
  
  val compareDocumentPosition: js.Function1[/* other */ Node, Double] = js.native
  
  val contains: js.Function0[Boolean] = js.native
  
  val contentEditable: String = js.native
  
  val dataset: DOMStringMap = js.native
  
  val dir: String = js.native
  
  val dispatchEvent: js.Function1[/* event */ Event, Boolean] = js.native
  
  val draggable: Boolean = js.native
  
  val enterKeyHint: String = js.native
  
  val firstChild: js.UndefOr[ChildNode | Null] = js.native
  
  val firstElementChild: js.UndefOr[Element | Null] = js.native
  
  val focus: js.Function0[Unit] = js.native
  
  val getAnimations: js.Function0[js.Array[Animation]] = js.native
  
  val getAttribute: js.Function1[/* qualifiedName */ String, String | Null] = js.native
  
  val getAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, String | Null] = js.native
  
  val getAttributeNames: js.Function0[js.Array[String]] = js.native
  
  val getAttributeNode: js.Function1[/* qualifiedName */ String, Attr | Null] = js.native
  
  val getAttributeNodeNS: js.Function2[/* namespace */ String, /* localName */ String, Attr | Null] = js.native
  
  val getBoundingClientRect: js.Function0[DOMRect] = js.native
  
  val getClientRects: js.Function0[DOMRectList] = js.native
  
  val getElementsByClassName: js.Function1[/* classNames */ String, HTMLCollectionOf[Element]] = js.native
  
  val getElementsByTagName: js.Function1[a, HTMLCollectionOf[HTMLAnchorElement]] = js.native
  
  val getElementsByTagNameNS: js.Function2[
    httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, 
    /* localName */ String, 
    HTMLCollectionOf[HTMLElement]
  ] = js.native
  
  val getRootNode: js.Function0[Node] = js.native
  
  val hasAttribute: js.Function1[/* qualifiedName */ String, Boolean] = js.native
  
  val hasAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Boolean] = js.native
  
  val hasAttributes: js.Function0[Boolean] = js.native
  
  val hasChildNodes: js.Function0[Boolean] = js.native
  
  val hasPointerCapture: js.Function1[/* pointerId */ Double, Boolean] = js.native
  
  val hidden: Boolean = js.native
  
  val id: String = js.native
  
  val innerHTML: String = js.native
  
  val innerText: String = js.native
  
  val inputMode: String = js.native
  
  val insertAdjacentElement: js.Function2[/* position */ InsertPosition, /* insertedElement */ Element, Element | Null] = js.native
  
  val insertAdjacentHTML: js.Function2[/* where */ InsertPosition, /* html */ String, Unit] = js.native
  
  val insertAdjacentText: js.Function2[/* where */ InsertPosition, /* text */ String, Unit] = js.native
  
  val insertBefore: js.Function1[/* newChild */ Node, Node] = js.native
  
  val isConnected: Boolean = js.native
  
  val isContentEditable: Boolean = js.native
  
  val isDefaultNamespace: js.Function0[Boolean] = js.native
  
  val isEqualNode: js.Function0[Boolean] = js.native
  
  val isSameNode: js.Function0[Boolean] = js.native
  
  val lang: String = js.native
  
  val lastChild: js.UndefOr[ChildNode | Null] = js.native
  
  val lastElementChild: js.UndefOr[Element | Null] = js.native
  
  val localName: String = js.native
  
  val lookupNamespaceURI: js.Function0[String | Null] = js.native
  
  val lookupPrefix: js.Function0[String | Null] = js.native
  
  val matches: js.Function1[/* selectors */ String, Boolean] = js.native
  
  val msGetRegionContent: js.Function0[_] = js.native
  
  val namespaceURI: js.UndefOr[String | Null] = js.native
  
  val nextElementSibling: js.UndefOr[Element | Null] = js.native
  
  val nextSibling: js.UndefOr[ChildNode | Null] = js.native
  
  val nodeName: String = js.native
  
  val nodeType: Double = js.native
  
  val nodeValue: js.UndefOr[String | Null] = js.native
  
  val nonce: js.UndefOr[String] = js.native
  
  val normalize: js.Function0[Unit] = js.native
  
  val offsetHeight: Double = js.native
  
  val offsetLeft: Double = js.native
  
  val offsetParent: js.UndefOr[Element | Null] = js.native
  
  val offsetTop: Double = js.native
  
  val offsetWidth: Double = js.native
  
  val onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null] = js.native
  
  val onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  
  val onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  
  val onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  
  val onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, _]) | Null] = js.native
  
  val onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null] = js.native
  
  val oncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val oncopy: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null] = js.native
  
  val oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val oncut: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null] = js.native
  
  val ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  
  val ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  
  val ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  
  val ondragexit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  
  val ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  
  val ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  
  val ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, _]) | Null] = js.native
  
  val ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onerror: OnErrorEventHandler = js.native
  
  val onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, _]) | Null] = js.native
  
  val onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  
  val onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  
  val onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, _]) | Null] = js.native
  
  val onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, _]) | Null] = js.native
  
  val onpaste: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | Null] = js.native
  
  val onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, _]) | Null] = js.native
  
  val onprogress: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], _]) | Null
  ] = js.native
  
  val onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, _]) | Null] = js.native
  
  val onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onsecuritypolicyviolation: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, _]) | Null
  ] = js.native
  
  val onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  
  val ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  
  val ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  
  val ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, _]) | Null] = js.native
  
  val ontransitioncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  
  val ontransitionend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  
  val ontransitionrun: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  
  val ontransitionstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, _]) | Null] = js.native
  
  val onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null] = js.native
  
  val onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, _]) | Null] = js.native
  
  val outerHTML: String = js.native
  
  val ownerDocument: Document = js.native
  
  val parentElement: js.UndefOr[HTMLElement | Null] = js.native
  
  val parentNode: js.UndefOr[(Node with ParentNode) | Null] = js.native
  
  val prefix: js.UndefOr[String | Null] = js.native
  
  val prepend: js.Function1[/* repeated */ Node | String, Unit] = js.native
  
  val previousElementSibling: js.UndefOr[Element | Null] = js.native
  
  val previousSibling: js.UndefOr[ChildNode | Null] = js.native
  
  val querySelector: js.Function1[a, HTMLAnchorElement | Null] = js.native
  
  val querySelectorAll: js.Function1[a, NodeListOf[HTMLAnchorElement]] = js.native
  
  val releasePointerCapture: js.Function1[/* pointerId */ Double, Unit] = js.native
  
  val remove: js.Function0[Unit] = js.native
  
  val removeAttribute: js.Function1[/* qualifiedName */ String, Unit] = js.native
  
  val removeAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, Unit] = js.native
  
  val removeAttributeNode: js.Function1[/* attr */ Attr, Attr] = js.native
  
  val removeChild: js.Function1[/* oldChild */ Node, Node] = js.native
  
  val removeEventListener: js.Function2[
    fullscreenchange, 
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, _], 
    Unit
  ] = js.native
  
  val replaceChild: js.Function2[/* newChild */ Node, /* oldChild */ Node, Node] = js.native
  
  val replaceWith: js.Function1[/* repeated */ Node | String, Unit] = js.native
  
  val requestFullscreen: js.Function0[js.Promise[Unit]] = js.native
  
  val requestPointerLock: js.Function0[Unit] = js.native
  
  val scroll: js.Function0[Unit] = js.native
  
  val scrollBy: js.Function0[Unit] = js.native
  
  val scrollHeight: Double = js.native
  
  val scrollIntoView: js.Function0[Unit] = js.native
  
  val scrollLeft: Double = js.native
  
  val scrollTo: js.Function0[Unit] = js.native
  
  val scrollTop: Double = js.native
  
  val scrollWidth: Double = js.native
  
  val setAttribute: js.Function2[/* qualifiedName */ String, /* value */ String, Unit] = js.native
  
  val setAttributeNS: js.Function3[/* namespace */ String, /* qualifiedName */ String, /* value */ String, Unit] = js.native
  
  val setAttributeNode: js.Function1[/* attr */ Attr, Attr | Null] = js.native
  
  val setAttributeNodeNS: js.Function1[/* attr */ Attr, Attr | Null] = js.native
  
  val setPointerCapture: js.Function1[/* pointerId */ Double, Unit] = js.native
  
  val shadowRoot: js.UndefOr[ShadowRoot | Null] = js.native
  
  val slot: String = js.native
  
  val spellcheck: Boolean = js.native
  
  val style: CSSStyleDeclaration = js.native
  
  val tabIndex: Double = js.native
  
  val tagName: String = js.native
  
  val textContent: js.UndefOr[String | Null] = js.native
  
  val title: String = js.native
  
  val toggleAttribute: js.Function1[/* qualifiedName */ String, Boolean] = js.native
  
  val translate: Boolean = js.native
  
  val webkitMatchesSelector: js.Function1[/* selectors */ String, Boolean] = js.native
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
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]) => Unit,
    after: /* repeated */ Node | String => Unit,
    animate: () => Animation,
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
    contains: () => Boolean,
    contentEditable: String,
    dataset: DOMStringMap,
    dir: String,
    dispatchEvent: /* event */ Event => Boolean,
    draggable: Boolean,
    enterKeyHint: String,
    focus: () => Unit,
    getAnimations: () => js.Array[Animation],
    getAttribute: /* qualifiedName */ String => String | Null,
    getAttributeNS: (/* namespace */ String, /* localName */ String) => String | Null,
    getAttributeNames: () => js.Array[String],
    getAttributeNode: /* qualifiedName */ String => Attr | Null,
    getAttributeNodeNS: (/* namespace */ String, /* localName */ String) => Attr | Null,
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
    insertBefore: /* newChild */ Node => Node,
    isConnected: Boolean,
    isContentEditable: Boolean,
    isDefaultNamespace: () => Boolean,
    isEqualNode: () => Boolean,
    isSameNode: () => Boolean,
    lang: String,
    localName: String,
    lookupNamespaceURI: () => String | Null,
    lookupPrefix: () => String | Null,
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
    ownerDocument: Document,
    prepend: /* repeated */ Node | String => Unit,
    querySelector: a => HTMLAnchorElement | Null,
    querySelectorAll: a => NodeListOf[HTMLAnchorElement],
    releasePointerCapture: /* pointerId */ Double => Unit,
    remove: () => Unit,
    removeAttribute: /* qualifiedName */ String => Unit,
    removeAttributeNS: (/* namespace */ String, /* localName */ String) => Unit,
    removeAttributeNode: /* attr */ Attr => Attr,
    removeChild: /* oldChild */ Node => Node,
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]) => Unit,
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
    webkitMatchesSelector: /* selectors */ String => Boolean
  ): ReadonlyHTMLElement = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINED_BY = DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINS = DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any], DOCUMENT_POSITION_DISCONNECTED = DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any], DOCUMENT_POSITION_FOLLOWING = DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any], DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any], DOCUMENT_POSITION_PRECEDING = DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], accessKey = accessKey.asInstanceOf[js.Any], accessKeyLabel = accessKeyLabel.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), after = js.Any.fromFunction1(after), animate = js.Any.fromFunction0(animate), append = js.Any.fromFunction1(append), appendChild = js.Any.fromFunction1(appendChild), attachShadow = js.Any.fromFunction1(attachShadow), attributes = attributes.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], baseURI = baseURI.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), blur = js.Any.fromFunction0(blur), childElementCount = childElementCount.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), clientHeight = clientHeight.asInstanceOf[js.Any], clientLeft = clientLeft.asInstanceOf[js.Any], clientTop = clientTop.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction0(cloneNode), closest = js.Any.fromFunction1(closest), compareDocumentPosition = js.Any.fromFunction1(compareDocumentPosition), contains = js.Any.fromFunction0(contains), contentEditable = contentEditable.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), draggable = draggable.asInstanceOf[js.Any], enterKeyHint = enterKeyHint.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getAnimations = js.Any.fromFunction0(getAnimations), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getRootNode = js.Any.fromFunction0(getRootNode), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasPointerCapture = js.Any.fromFunction1(hasPointerCapture), hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], insertAdjacentElement = js.Any.fromFunction2(insertAdjacentElement), insertAdjacentHTML = js.Any.fromFunction2(insertAdjacentHTML), insertAdjacentText = js.Any.fromFunction2(insertAdjacentText), insertBefore = js.Any.fromFunction1(insertBefore), isConnected = isConnected.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any], isDefaultNamespace = js.Any.fromFunction0(isDefaultNamespace), isEqualNode = js.Any.fromFunction0(isEqualNode), isSameNode = js.Any.fromFunction0(isSameNode), lang = lang.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], lookupNamespaceURI = js.Any.fromFunction0(lookupNamespaceURI), lookupPrefix = js.Any.fromFunction0(lookupPrefix), matches = js.Any.fromFunction1(matches), msGetRegionContent = js.Any.fromFunction0(msGetRegionContent), nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend), querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll), releasePointerCapture = js.Any.fromFunction1(releasePointerCapture), remove = js.Any.fromFunction0(remove), removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), replaceWith = js.Any.fromFunction1(replaceWith), requestFullscreen = js.Any.fromFunction0(requestFullscreen), requestPointerLock = js.Any.fromFunction0(requestPointerLock), scroll = js.Any.fromFunction0(scroll), scrollBy = js.Any.fromFunction0(scrollBy), scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollIntoView = js.Any.fromFunction0(scrollIntoView), scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTo = js.Any.fromFunction0(scrollTo), scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setPointerCapture = js.Any.fromFunction1(setPointerCapture), slot = slot.asInstanceOf[js.Any], spellcheck = spellcheck.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toggleAttribute = js.Any.fromFunction1(toggleAttribute), translate = translate.asInstanceOf[js.Any], webkitMatchesSelector = js.Any.fromFunction1(webkitMatchesSelector))
    __obj.asInstanceOf[ReadonlyHTMLElement]
  }
  
  @scala.inline
  implicit class ReadonlyHTMLElementOps[Self <: ReadonlyHTMLElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setATTRIBUTE_NODE(value: Double): Self = this.set("ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCDATA_SECTION_NODE(value: Double): Self = this.set("CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMMENT_NODE(value: Double): Self = this.set("COMMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = this.set("DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_NODE(value: Double): Self = this.set("DOCUMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = this.set("DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = this.set("DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = this.set("DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = this.set("DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = this.set("DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = this.set("DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_TYPE_NODE(value: Double): Self = this.set("DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setELEMENT_NODE(value: Double): Self = this.set("ELEMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENTITY_NODE(value: Double): Self = this.set("ENTITY_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENTITY_REFERENCE_NODE(value: Double): Self = this.set("ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOTATION_NODE(value: Double): Self = this.set("NOTATION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = this.set("PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_NODE(value: Double): Self = this.set("TEXT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyLabel(value: String): Self = this.set("accessKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]) => Unit
    ): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfter(value: /* repeated */ Node | String => Unit): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnimate(value: () => Animation): Self = this.set("animate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAppend(value: /* repeated */ Node | String => Unit): Self = this.set("append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendChild(value: /* newChild */ Node => Node): Self = this.set("appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = this.set("attachShadow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributes(value: NamedNodeMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocapitalize(value: String): Self = this.set("autocapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURI(value: String): Self = this.set("baseURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildElementCount(value: Double): Self = this.set("childElementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodes(value: NodeListOf[ChildNode]): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: HTMLCollection): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassList(value: DOMTokenList): Self = this.set("classList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: () => Unit): Self = this.set("click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClientHeight(value: Double): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLeft(value: Double): Self = this.set("clientLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTop(value: Double): Self = this.set("clientTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneNode(value: () => Node): Self = this.set("cloneNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosest(value: a => HTMLAnchorElement | Null): Self = this.set("closest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareDocumentPosition(value: /* other */ Node => Double): Self = this.set("compareDocumentPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContains(value: () => Boolean): Self = this.set("contains", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentEditable(value: String): Self = this.set("contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataset(value: DOMStringMap): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchEvent(value: /* event */ Event => Boolean): Self = this.set("dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyHint(value: String): Self = this.set("enterKeyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnimations(value: () => js.Array[Animation]): Self = this.set("getAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = this.set("getAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeNames(value: () => js.Array[String]): Self = this.set("getAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttributeNode(value: /* qualifiedName */ String => Attr | Null): Self = this.set("getAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): Self = this.set("getAttributeNodeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBoundingClientRect(value: () => DOMRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientRects(value: () => DOMRectList): Self = this.set("getClientRects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = this.set("getElementsByClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = this.set("getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self = this.set("getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRootNode(value: () => Node): Self = this.set("getRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = this.set("hasAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = this.set("hasAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasAttributes(value: () => Boolean): Self = this.set("hasAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = this.set("hasPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHTML(value: String): Self = this.set("innerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMode(value: String): Self = this.set("inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = this.set("insertAdjacentElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = this.set("insertAdjacentHTML", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = this.set("insertAdjacentText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertBefore(value: /* newChild */ Node => Node): Self = this.set("insertBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = this.set("isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContentEditable(value: Boolean): Self = this.set("isContentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultNamespace(value: () => Boolean): Self = this.set("isDefaultNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEqualNode(value: () => Boolean): Self = this.set("isEqualNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSameNode(value: () => Boolean): Self = this.set("isSameNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupNamespaceURI(value: () => String | Null): Self = this.set("lookupNamespaceURI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookupPrefix(value: () => String | Null): Self = this.set("lookupPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMatches(value: /* selectors */ String => Boolean): Self = this.set("matches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMsGetRegionContent(value: () => _): Self = this.set("msGetRegionContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: Double): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = this.set("normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffsetHeight(value: Double): Self = this.set("offsetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetWidth(value: Double): Self = this.set("offsetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterHTML(value: String): Self = this.set("outerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerDocument(value: Document): Self = this.set("ownerDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepend(value: /* repeated */ Node | String => Unit): Self = this.set("prepend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = this.set("querySelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement]): Self = this.set("querySelectorAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = this.set("releasePointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = this.set("removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = this.set("removeAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = this.set("removeAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChild(value: /* oldChild */ Node => Node): Self = this.set("removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]) => Unit
    ): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = this.set("replaceChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = this.set("replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestFullscreen(value: () => js.Promise[Unit]): Self = this.set("requestFullscreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestPointerLock(value: () => Unit): Self = this.set("requestPointerLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScroll(value: () => Unit): Self = this.set("scroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollBy(value: () => Unit): Self = this.set("scrollBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollIntoView(value: () => Unit): Self = this.set("scrollIntoView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTo(value: () => Unit): Self = this.set("scrollTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = this.set("setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = this.set("setAttributeNS", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = this.set("setAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = this.set("setAttributeNodeNS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = this.set("setPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlot(value: String): Self = this.set("slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSStyleDeclaration): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = this.set("toggleAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranslate(value: Boolean): Self = this.set("translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = this.set("webkitMatchesSelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssignedSlot(value: HTMLSlotElement): Self = this.set("assignedSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedSlot: Self = this.set("assignedSlot", js.undefined)
    
    @scala.inline
    def setAssignedSlotNull: Self = this.set("assignedSlot", null)
    
    @scala.inline
    def setFirstChild(value: ChildNode): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstChild: Self = this.set("firstChild", js.undefined)
    
    @scala.inline
    def setFirstChildNull: Self = this.set("firstChild", null)
    
    @scala.inline
    def setFirstElementChild(value: Element): Self = this.set("firstElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstElementChild: Self = this.set("firstElementChild", js.undefined)
    
    @scala.inline
    def setFirstElementChildNull: Self = this.set("firstElementChild", null)
    
    @scala.inline
    def setLastChild(value: ChildNode): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastChild: Self = this.set("lastChild", js.undefined)
    
    @scala.inline
    def setLastChildNull: Self = this.set("lastChild", null)
    
    @scala.inline
    def setLastElementChild(value: Element): Self = this.set("lastElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastElementChild: Self = this.set("lastElementChild", js.undefined)
    
    @scala.inline
    def setLastElementChildNull: Self = this.set("lastElementChild", null)
    
    @scala.inline
    def setNamespaceURI(value: String): Self = this.set("namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceURI: Self = this.set("namespaceURI", js.undefined)
    
    @scala.inline
    def setNamespaceURINull: Self = this.set("namespaceURI", null)
    
    @scala.inline
    def setNextElementSibling(value: Element): Self = this.set("nextElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextElementSibling: Self = this.set("nextElementSibling", js.undefined)
    
    @scala.inline
    def setNextElementSiblingNull: Self = this.set("nextElementSibling", null)
    
    @scala.inline
    def setNextSibling(value: ChildNode): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSibling: Self = this.set("nextSibling", js.undefined)
    
    @scala.inline
    def setNextSiblingNull: Self = this.set("nextSibling", null)
    
    @scala.inline
    def setNodeValue(value: String): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeValue: Self = this.set("nodeValue", js.undefined)
    
    @scala.inline
    def setNodeValueNull: Self = this.set("nodeValue", null)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setOffsetParent(value: Element): Self = this.set("offsetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetParent: Self = this.set("offsetParent", js.undefined)
    
    @scala.inline
    def setOffsetParentNull: Self = this.set("offsetParent", null)
    
    @scala.inline
    def setOnabort(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _]): Self = this.set("onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnabort: Self = this.set("onabort", js.undefined)
    
    @scala.inline
    def setOnabortNull: Self = this.set("onabort", null)
    
    @scala.inline
    def setOnanimationcancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnanimationcancel: Self = this.set("onanimationcancel", js.undefined)
    
    @scala.inline
    def setOnanimationcancelNull: Self = this.set("onanimationcancel", null)
    
    @scala.inline
    def setOnanimationend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnanimationend: Self = this.set("onanimationend", js.undefined)
    
    @scala.inline
    def setOnanimationendNull: Self = this.set("onanimationend", null)
    
    @scala.inline
    def setOnanimationiteration(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationiteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnanimationiteration: Self = this.set("onanimationiteration", js.undefined)
    
    @scala.inline
    def setOnanimationiterationNull: Self = this.set("onanimationiteration", null)
    
    @scala.inline
    def setOnanimationstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, _]): Self = this.set("onanimationstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnanimationstart: Self = this.set("onanimationstart", js.undefined)
    
    @scala.inline
    def setOnanimationstartNull: Self = this.set("onanimationstart", null)
    
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onauxclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnauxclick: Self = this.set("onauxclick", js.undefined)
    
    @scala.inline
    def setOnauxclickNull: Self = this.set("onauxclick", null)
    
    @scala.inline
    def setOnblur(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _]): Self = this.set("onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnblur: Self = this.set("onblur", js.undefined)
    
    @scala.inline
    def setOnblurNull: Self = this.set("onblur", null)
    
    @scala.inline
    def setOncancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("oncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncancel: Self = this.set("oncancel", js.undefined)
    
    @scala.inline
    def setOncancelNull: Self = this.set("oncancel", null)
    
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("oncanplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncanplay: Self = this.set("oncanplay", js.undefined)
    
    @scala.inline
    def setOncanplayNull: Self = this.set("oncanplay", null)
    
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("oncanplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncanplaythrough: Self = this.set("oncanplaythrough", js.undefined)
    
    @scala.inline
    def setOncanplaythroughNull: Self = this.set("oncanplaythrough", null)
    
    @scala.inline
    def setOnchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnchange: Self = this.set("onchange", js.undefined)
    
    @scala.inline
    def setOnchangeNull: Self = this.set("onchange", null)
    
    @scala.inline
    def setOnclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setOnclickNull: Self = this.set("onclick", null)
    
    @scala.inline
    def setOnclose(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setOncloseNull: Self = this.set("onclose", null)
    
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("oncontextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncontextmenu: Self = this.set("oncontextmenu", js.undefined)
    
    @scala.inline
    def setOncontextmenuNull: Self = this.set("oncontextmenu", null)
    
    @scala.inline
    def setOncopy(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _]): Self = this.set("oncopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncopy: Self = this.set("oncopy", js.undefined)
    
    @scala.inline
    def setOncopyNull: Self = this.set("oncopy", null)
    
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("oncuechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncuechange: Self = this.set("oncuechange", js.undefined)
    
    @scala.inline
    def setOncuechangeNull: Self = this.set("oncuechange", null)
    
    @scala.inline
    def setOncut(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _]): Self = this.set("oncut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncut: Self = this.set("oncut", js.undefined)
    
    @scala.inline
    def setOncutNull: Self = this.set("oncut", null)
    
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("ondblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndblclick: Self = this.set("ondblclick", js.undefined)
    
    @scala.inline
    def setOndblclickNull: Self = this.set("ondblclick", null)
    
    @scala.inline
    def setOndrag(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = this.set("ondrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndrag: Self = this.set("ondrag", js.undefined)
    
    @scala.inline
    def setOndragNull: Self = this.set("ondrag", null)
    
    @scala.inline
    def setOndragend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = this.set("ondragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragend: Self = this.set("ondragend", js.undefined)
    
    @scala.inline
    def setOndragendNull: Self = this.set("ondragend", null)
    
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = this.set("ondragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragenter: Self = this.set("ondragenter", js.undefined)
    
    @scala.inline
    def setOndragenterNull: Self = this.set("ondragenter", null)
    
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("ondragexit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragexit: Self = this.set("ondragexit", js.undefined)
    
    @scala.inline
    def setOndragexitNull: Self = this.set("ondragexit", null)
    
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = this.set("ondragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragleave: Self = this.set("ondragleave", js.undefined)
    
    @scala.inline
    def setOndragleaveNull: Self = this.set("ondragleave", null)
    
    @scala.inline
    def setOndragover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = this.set("ondragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragover: Self = this.set("ondragover", js.undefined)
    
    @scala.inline
    def setOndragoverNull: Self = this.set("ondragover", null)
    
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = this.set("ondragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndragstart: Self = this.set("ondragstart", js.undefined)
    
    @scala.inline
    def setOndragstartNull: Self = this.set("ondragstart", null)
    
    @scala.inline
    def setOndrop(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, _]): Self = this.set("ondrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndrop: Self = this.set("ondrop", js.undefined)
    
    @scala.inline
    def setOndropNull: Self = this.set("ondrop", null)
    
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("ondurationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndurationchange: Self = this.set("ondurationchange", js.undefined)
    
    @scala.inline
    def setOndurationchangeNull: Self = this.set("ondurationchange", null)
    
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onemptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnemptied: Self = this.set("onemptied", js.undefined)
    
    @scala.inline
    def setOnemptiedNull: Self = this.set("onemptied", null)
    
    @scala.inline
    def setOnended(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnended: Self = this.set("onended", js.undefined)
    
    @scala.inline
    def setOnendedNull: Self = this.set("onended", null)
    
    @scala.inline
    def setOnerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any
    ): Self = this.set("onerror", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnerrorNull: Self = this.set("onerror", null)
    
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, _]): Self = this.set("onfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnfocus: Self = this.set("onfocus", js.undefined)
    
    @scala.inline
    def setOnfocusNull: Self = this.set("onfocus", null)
    
    @scala.inline
    def setOnfullscreenchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onfullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnfullscreenchange: Self = this.set("onfullscreenchange", js.undefined)
    
    @scala.inline
    def setOnfullscreenchangeNull: Self = this.set("onfullscreenchange", null)
    
    @scala.inline
    def setOnfullscreenerror(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onfullscreenerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnfullscreenerror: Self = this.set("onfullscreenerror", js.undefined)
    
    @scala.inline
    def setOnfullscreenerrorNull: Self = this.set("onfullscreenerror", null)
    
    @scala.inline
    def setOngotpointercapture(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("ongotpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOngotpointercapture: Self = this.set("ongotpointercapture", js.undefined)
    
    @scala.inline
    def setOngotpointercaptureNull: Self = this.set("ongotpointercapture", null)
    
    @scala.inline
    def setOninput(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("oninput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOninput: Self = this.set("oninput", js.undefined)
    
    @scala.inline
    def setOninputNull: Self = this.set("oninput", null)
    
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("oninvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOninvalid: Self = this.set("oninvalid", js.undefined)
    
    @scala.inline
    def setOninvalidNull: Self = this.set("oninvalid", null)
    
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _]): Self = this.set("onkeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnkeydown: Self = this.set("onkeydown", js.undefined)
    
    @scala.inline
    def setOnkeydownNull: Self = this.set("onkeydown", null)
    
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _]): Self = this.set("onkeypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnkeypress: Self = this.set("onkeypress", js.undefined)
    
    @scala.inline
    def setOnkeypressNull: Self = this.set("onkeypress", null)
    
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, _]): Self = this.set("onkeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnkeyup: Self = this.set("onkeyup", js.undefined)
    
    @scala.inline
    def setOnkeyupNull: Self = this.set("onkeyup", null)
    
    @scala.inline
    def setOnload(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnload: Self = this.set("onload", js.undefined)
    
    @scala.inline
    def setOnloadNull: Self = this.set("onload", null)
    
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onloadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadeddata: Self = this.set("onloadeddata", js.undefined)
    
    @scala.inline
    def setOnloadeddataNull: Self = this.set("onloadeddata", null)
    
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onloadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadedmetadata: Self = this.set("onloadedmetadata", js.undefined)
    
    @scala.inline
    def setOnloadedmetadataNull: Self = this.set("onloadedmetadata", null)
    
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnloadstart: Self = this.set("onloadstart", js.undefined)
    
    @scala.inline
    def setOnloadstartNull: Self = this.set("onloadstart", null)
    
    @scala.inline
    def setOnlostpointercapture(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onlostpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlostpointercapture: Self = this.set("onlostpointercapture", js.undefined)
    
    @scala.inline
    def setOnlostpointercaptureNull: Self = this.set("onlostpointercapture", null)
    
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onmousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmousedown: Self = this.set("onmousedown", js.undefined)
    
    @scala.inline
    def setOnmousedownNull: Self = this.set("onmousedown", null)
    
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseenter: Self = this.set("onmouseenter", js.undefined)
    
    @scala.inline
    def setOnmouseenterNull: Self = this.set("onmouseenter", null)
    
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseleave: Self = this.set("onmouseleave", js.undefined)
    
    @scala.inline
    def setOnmouseleaveNull: Self = this.set("onmouseleave", null)
    
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onmousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmousemove: Self = this.set("onmousemove", js.undefined)
    
    @scala.inline
    def setOnmousemoveNull: Self = this.set("onmousemove", null)
    
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseoutNull: Self = this.set("onmouseout", null)
    
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    
    @scala.inline
    def setOnmouseoverNull: Self = this.set("onmouseover", null)
    
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, _]): Self = this.set("onmouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnmouseup: Self = this.set("onmouseup", js.undefined)
    
    @scala.inline
    def setOnmouseupNull: Self = this.set("onmouseup", null)
    
    @scala.inline
    def setOnpaste(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, _]): Self = this.set("onpaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpaste: Self = this.set("onpaste", js.undefined)
    
    @scala.inline
    def setOnpasteNull: Self = this.set("onpaste", null)
    
    @scala.inline
    def setOnpause(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onpause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpause: Self = this.set("onpause", js.undefined)
    
    @scala.inline
    def setOnpauseNull: Self = this.set("onpause", null)
    
    @scala.inline
    def setOnplay(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnplay: Self = this.set("onplay", js.undefined)
    
    @scala.inline
    def setOnplayNull: Self = this.set("onplay", null)
    
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onplaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnplaying: Self = this.set("onplaying", js.undefined)
    
    @scala.inline
    def setOnplayingNull: Self = this.set("onplaying", null)
    
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointercancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointercancel: Self = this.set("onpointercancel", js.undefined)
    
    @scala.inline
    def setOnpointercancelNull: Self = this.set("onpointercancel", null)
    
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerdown: Self = this.set("onpointerdown", js.undefined)
    
    @scala.inline
    def setOnpointerdownNull: Self = this.set("onpointerdown", null)
    
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerenter: Self = this.set("onpointerenter", js.undefined)
    
    @scala.inline
    def setOnpointerenterNull: Self = this.set("onpointerenter", null)
    
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerleave: Self = this.set("onpointerleave", js.undefined)
    
    @scala.inline
    def setOnpointerleaveNull: Self = this.set("onpointerleave", null)
    
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointermove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointermove: Self = this.set("onpointermove", js.undefined)
    
    @scala.inline
    def setOnpointermoveNull: Self = this.set("onpointermove", null)
    
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerout: Self = this.set("onpointerout", js.undefined)
    
    @scala.inline
    def setOnpointeroutNull: Self = this.set("onpointerout", null)
    
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerover: Self = this.set("onpointerover", js.undefined)
    
    @scala.inline
    def setOnpointeroverNull: Self = this.set("onpointerover", null)
    
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, _]): Self = this.set("onpointerup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnpointerup: Self = this.set("onpointerup", js.undefined)
    
    @scala.inline
    def setOnpointerupNull: Self = this.set("onpointerup", null)
    
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ProgressEvent[EventTarget], _]): Self = this.set("onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnprogress: Self = this.set("onprogress", js.undefined)
    
    @scala.inline
    def setOnprogressNull: Self = this.set("onprogress", null)
    
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnratechange: Self = this.set("onratechange", js.undefined)
    
    @scala.inline
    def setOnratechangeNull: Self = this.set("onratechange", null)
    
    @scala.inline
    def setOnreset(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnreset: Self = this.set("onreset", js.undefined)
    
    @scala.inline
    def setOnresetNull: Self = this.set("onreset", null)
    
    @scala.inline
    def setOnresize(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, _]): Self = this.set("onresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnresize: Self = this.set("onresize", js.undefined)
    
    @scala.inline
    def setOnresizeNull: Self = this.set("onresize", null)
    
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnscroll: Self = this.set("onscroll", js.undefined)
    
    @scala.inline
    def setOnscrollNull: Self = this.set("onscroll", null)
    
    @scala.inline
    def setOnsecuritypolicyviolation(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ SecurityPolicyViolationEvent, _]): Self = this.set("onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnsecuritypolicyviolation: Self = this.set("onsecuritypolicyviolation", js.undefined)
    
    @scala.inline
    def setOnsecuritypolicyviolationNull: Self = this.set("onsecuritypolicyviolation", null)
    
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onseeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnseeked: Self = this.set("onseeked", js.undefined)
    
    @scala.inline
    def setOnseekedNull: Self = this.set("onseeked", null)
    
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onseeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnseeking: Self = this.set("onseeking", js.undefined)
    
    @scala.inline
    def setOnseekingNull: Self = this.set("onseeking", null)
    
    @scala.inline
    def setOnselect(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselect: Self = this.set("onselect", js.undefined)
    
    @scala.inline
    def setOnselectNull: Self = this.set("onselect", null)
    
    @scala.inline
    def setOnselectionchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onselectionchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselectionchange: Self = this.set("onselectionchange", js.undefined)
    
    @scala.inline
    def setOnselectionchangeNull: Self = this.set("onselectionchange", null)
    
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onselectstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnselectstart: Self = this.set("onselectstart", js.undefined)
    
    @scala.inline
    def setOnselectstartNull: Self = this.set("onselectstart", null)
    
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnstalled: Self = this.set("onstalled", js.undefined)
    
    @scala.inline
    def setOnstalledNull: Self = this.set("onstalled", null)
    
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnsubmit: Self = this.set("onsubmit", js.undefined)
    
    @scala.inline
    def setOnsubmitNull: Self = this.set("onsubmit", null)
    
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onsuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnsuspend: Self = this.set("onsuspend", js.undefined)
    
    @scala.inline
    def setOnsuspendNull: Self = this.set("onsuspend", null)
    
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("ontimeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntimeupdate: Self = this.set("ontimeupdate", js.undefined)
    
    @scala.inline
    def setOntimeupdateNull: Self = this.set("ontimeupdate", null)
    
    @scala.inline
    def setOntoggle(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("ontoggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntoggle: Self = this.set("ontoggle", js.undefined)
    
    @scala.inline
    def setOntoggleNull: Self = this.set("ontoggle", null)
    
    @scala.inline
    def setOntouchcancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntouchcancel: Self = this.set("ontouchcancel", js.undefined)
    
    @scala.inline
    def setOntouchcancelNull: Self = this.set("ontouchcancel", null)
    
    @scala.inline
    def setOntouchend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntouchend: Self = this.set("ontouchend", js.undefined)
    
    @scala.inline
    def setOntouchendNull: Self = this.set("ontouchend", null)
    
    @scala.inline
    def setOntouchmove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntouchmove: Self = this.set("ontouchmove", js.undefined)
    
    @scala.inline
    def setOntouchmoveNull: Self = this.set("ontouchmove", null)
    
    @scala.inline
    def setOntouchstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, _]): Self = this.set("ontouchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntouchstart: Self = this.set("ontouchstart", js.undefined)
    
    @scala.inline
    def setOntouchstartNull: Self = this.set("ontouchstart", null)
    
    @scala.inline
    def setOntransitioncancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitioncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntransitioncancel: Self = this.set("ontransitioncancel", js.undefined)
    
    @scala.inline
    def setOntransitioncancelNull: Self = this.set("ontransitioncancel", null)
    
    @scala.inline
    def setOntransitionend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntransitionend: Self = this.set("ontransitionend", js.undefined)
    
    @scala.inline
    def setOntransitionendNull: Self = this.set("ontransitionend", null)
    
    @scala.inline
    def setOntransitionrun(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntransitionrun: Self = this.set("ontransitionrun", js.undefined)
    
    @scala.inline
    def setOntransitionrunNull: Self = this.set("ontransitionrun", null)
    
    @scala.inline
    def setOntransitionstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, _]): Self = this.set("ontransitionstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOntransitionstart: Self = this.set("ontransitionstart", js.undefined)
    
    @scala.inline
    def setOntransitionstartNull: Self = this.set("ontransitionstart", null)
    
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onvolumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnvolumechange: Self = this.set("onvolumechange", js.undefined)
    
    @scala.inline
    def setOnvolumechangeNull: Self = this.set("onvolumechange", null)
    
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, _]): Self = this.set("onwaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnwaiting: Self = this.set("onwaiting", js.undefined)
    
    @scala.inline
    def setOnwaitingNull: Self = this.set("onwaiting", null)
    
    @scala.inline
    def setOnwheel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ WheelEvent, _]): Self = this.set("onwheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnwheel: Self = this.set("onwheel", js.undefined)
    
    @scala.inline
    def setOnwheelNull: Self = this.set("onwheel", null)
    
    @scala.inline
    def setParentElement(value: HTMLElement): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentElement: Self = this.set("parentElement", js.undefined)
    
    @scala.inline
    def setParentElementNull: Self = this.set("parentElement", null)
    
    @scala.inline
    def setParentNode(value: Node with ParentNode): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
    
    @scala.inline
    def setParentNodeNull: Self = this.set("parentNode", null)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPrefixNull: Self = this.set("prefix", null)
    
    @scala.inline
    def setPreviousElementSibling(value: Element): Self = this.set("previousElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousElementSibling: Self = this.set("previousElementSibling", js.undefined)
    
    @scala.inline
    def setPreviousElementSiblingNull: Self = this.set("previousElementSibling", null)
    
    @scala.inline
    def setPreviousSibling(value: ChildNode): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousSibling: Self = this.set("previousSibling", js.undefined)
    
    @scala.inline
    def setPreviousSiblingNull: Self = this.set("previousSibling", null)
    
    @scala.inline
    def setShadowRoot(value: ShadowRoot): Self = this.set("shadowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowRoot: Self = this.set("shadowRoot", js.undefined)
    
    @scala.inline
    def setShadowRootNull: Self = this.set("shadowRoot", null)
    
    @scala.inline
    def setTextContent(value: String): Self = this.set("textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContent: Self = this.set("textContent", js.undefined)
    
    @scala.inline
    def setTextContentNull: Self = this.set("textContent", null)
  }
}
