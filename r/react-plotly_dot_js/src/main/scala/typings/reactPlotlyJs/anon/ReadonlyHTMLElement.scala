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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.HTMLElement> */
trait ReadonlyHTMLElement extends StObject {
  
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
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any], 
    Unit
  ]
  
  val after: js.Function1[/* repeated */ Node | String, Unit]
  
  val animate: js.Function0[Animation]
  
  val append: js.Function1[/* repeated */ Node | String, Unit]
  
  val appendChild: js.Function1[/* newChild */ Node, Node]
  
  val assignedSlot: js.UndefOr[HTMLSlotElement | Null] = js.undefined
  
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
  
  val contains: js.Function0[Boolean]
  
  val contentEditable: String
  
  val dataset: DOMStringMap
  
  val dir: String
  
  val dispatchEvent: js.Function1[/* event */ Event, Boolean]
  
  val draggable: Boolean
  
  val enterKeyHint: String
  
  val firstChild: js.UndefOr[ChildNode | Null] = js.undefined
  
  val firstElementChild: js.UndefOr[Element | Null] = js.undefined
  
  val focus: js.Function0[Unit]
  
  val getAnimations: js.Function0[js.Array[Animation]]
  
  val getAttribute: js.Function1[/* qualifiedName */ String, String | Null]
  
  val getAttributeNS: js.Function2[/* namespace */ String, /* localName */ String, String | Null]
  
  val getAttributeNames: js.Function0[js.Array[String]]
  
  val getAttributeNode: js.Function1[/* qualifiedName */ String, Attr | Null]
  
  val getAttributeNodeNS: js.Function2[/* namespace */ String, /* localName */ String, Attr | Null]
  
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
  
  val insertBefore: js.Function1[/* newChild */ Node, Node]
  
  val isConnected: Boolean
  
  val isContentEditable: Boolean
  
  val isDefaultNamespace: js.Function0[Boolean]
  
  val isEqualNode: js.Function0[Boolean]
  
  val isSameNode: js.Function0[Boolean]
  
  val lang: String
  
  val lastChild: js.UndefOr[ChildNode | Null] = js.undefined
  
  val lastElementChild: js.UndefOr[Element | Null] = js.undefined
  
  val localName: String
  
  val lookupNamespaceURI: js.Function0[String | Null]
  
  val lookupPrefix: js.Function0[String | Null]
  
  val matches: js.Function1[/* selectors */ String, Boolean]
  
  val msGetRegionContent: js.Function0[js.Any]
  
  val namespaceURI: js.UndefOr[String | Null] = js.undefined
  
  val nextElementSibling: js.UndefOr[Element | Null] = js.undefined
  
  val nextSibling: js.UndefOr[ChildNode | Null] = js.undefined
  
  val nodeName: String
  
  val nodeType: Double
  
  val nodeValue: js.UndefOr[String | Null] = js.undefined
  
  val nonce: js.UndefOr[String] = js.undefined
  
  val normalize: js.Function0[Unit]
  
  val offsetHeight: Double
  
  val offsetLeft: Double
  
  val offsetParent: js.UndefOr[Element | Null] = js.undefined
  
  val offsetTop: Double
  
  val offsetWidth: Double
  
  val onabort: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any]) | Null] = js.undefined
  
  val onanimationcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  val onanimationend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  val onanimationiteration: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  val onanimationstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ AnimationEvent, js.Any]) | Null] = js.undefined
  
  val onauxclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onblur: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, js.Any]) | Null] = js.undefined
  
  val oncancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val oncanplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val oncanplaythrough: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onclose: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val oncontextmenu: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val oncopy: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, js.Any]) | Null] = js.undefined
  
  val oncuechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val oncut: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, js.Any]) | Null] = js.undefined
  
  val ondblclick: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val ondrag: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  val ondragend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  val ondragenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  val ondragexit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val ondragleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  val ondragover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  val ondragstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  val ondrop: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ DragEvent, js.Any]) | Null] = js.undefined
  
  val ondurationchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onemptied: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onended: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onerror: OnErrorEventHandler
  
  val onfocus: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ FocusEvent, js.Any]) | Null] = js.undefined
  
  val onfullscreenchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onfullscreenerror: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val ongotpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val oninput: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val oninvalid: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onkeydown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
  
  val onkeypress: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
  
  val onkeyup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ KeyboardEvent, js.Any]) | Null] = js.undefined
  
  val onload: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onloadeddata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onloadedmetadata: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onloadstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onlostpointercapture: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onmousedown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onmouseenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onmouseleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onmousemove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onmouseout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onmouseover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onmouseup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ MouseEvent, js.Any]) | Null] = js.undefined
  
  val onpaste: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, js.Any]) | Null] = js.undefined
  
  val onpause: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onplay: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onplaying: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onpointercancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onpointerdown: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onpointerenter: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onpointerleave: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onpointermove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onpointerout: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onpointerover: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onpointerup: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ PointerEvent, js.Any]) | Null] = js.undefined
  
  val onprogress: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent[EventTarget], js.Any]) | Null
  ] = js.undefined
  
  val onratechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onreset: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onresize: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ UIEvent, js.Any]) | Null] = js.undefined
  
  val onscroll: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onsecuritypolicyviolation: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ SecurityPolicyViolationEvent, js.Any]) | Null
  ] = js.undefined
  
  val onseeked: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onseeking: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onselect: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onselectionchange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onselectstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onstalled: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onsubmit: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onsuspend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val ontimeupdate: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val ontoggle: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val ontouchcancel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  val ontouchend: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  val ontouchmove: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  val ontouchstart: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ TouchEvent, js.Any]) | Null] = js.undefined
  
  val ontransitioncancel: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  val ontransitionend: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  val ontransitionrun: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  val ontransitionstart: js.UndefOr[
    (js.ThisFunction1[/* this */ this.type, /* ev */ TransitionEvent, js.Any]) | Null
  ] = js.undefined
  
  val onvolumechange: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onwaiting: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null] = js.undefined
  
  val onwheel: js.UndefOr[(js.ThisFunction1[/* this */ this.type, /* ev */ WheelEvent, js.Any]) | Null] = js.undefined
  
  val outerHTML: String
  
  val ownerDocument: Document
  
  val parentElement: js.UndefOr[HTMLElement | Null] = js.undefined
  
  val parentNode: js.UndefOr[(Node & ParentNode) | Null] = js.undefined
  
  val prefix: js.UndefOr[String | Null] = js.undefined
  
  val prepend: js.Function1[/* repeated */ Node | String, Unit]
  
  val previousElementSibling: js.UndefOr[Element | Null] = js.undefined
  
  val previousSibling: js.UndefOr[ChildNode | Null] = js.undefined
  
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
    /* listener */ js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any], 
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
  
  val shadowRoot: js.UndefOr[ShadowRoot | Null] = js.undefined
  
  val slot: String
  
  val spellcheck: Boolean
  
  val style: CSSStyleDeclaration
  
  val tabIndex: Double
  
  val tagName: String
  
  val textContent: js.UndefOr[String | Null] = js.undefined
  
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
    addEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]) => Unit,
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
    msGetRegionContent: () => js.Any,
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
    removeEventListener: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]) => Unit,
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
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE.asInstanceOf[js.Any], CDATA_SECTION_NODE = CDATA_SECTION_NODE.asInstanceOf[js.Any], COMMENT_NODE = COMMENT_NODE.asInstanceOf[js.Any], DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE.asInstanceOf[js.Any], DOCUMENT_NODE = DOCUMENT_NODE.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINED_BY = DOCUMENT_POSITION_CONTAINED_BY.asInstanceOf[js.Any], DOCUMENT_POSITION_CONTAINS = DOCUMENT_POSITION_CONTAINS.asInstanceOf[js.Any], DOCUMENT_POSITION_DISCONNECTED = DOCUMENT_POSITION_DISCONNECTED.asInstanceOf[js.Any], DOCUMENT_POSITION_FOLLOWING = DOCUMENT_POSITION_FOLLOWING.asInstanceOf[js.Any], DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC.asInstanceOf[js.Any], DOCUMENT_POSITION_PRECEDING = DOCUMENT_POSITION_PRECEDING.asInstanceOf[js.Any], DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE.asInstanceOf[js.Any], ELEMENT_NODE = ELEMENT_NODE.asInstanceOf[js.Any], ENTITY_NODE = ENTITY_NODE.asInstanceOf[js.Any], ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE.asInstanceOf[js.Any], NOTATION_NODE = NOTATION_NODE.asInstanceOf[js.Any], PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE.asInstanceOf[js.Any], TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], accessKey = accessKey.asInstanceOf[js.Any], accessKeyLabel = accessKeyLabel.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), after = js.Any.fromFunction1(after), animate = js.Any.fromFunction0(animate), append = js.Any.fromFunction1(append), appendChild = js.Any.fromFunction1(appendChild), attachShadow = js.Any.fromFunction1(attachShadow), attributes = attributes.asInstanceOf[js.Any], autocapitalize = autocapitalize.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], baseURI = baseURI.asInstanceOf[js.Any], before = js.Any.fromFunction1(before), blur = js.Any.fromFunction0(blur), childElementCount = childElementCount.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], classList = classList.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], click = js.Any.fromFunction0(click), clientHeight = clientHeight.asInstanceOf[js.Any], clientLeft = clientLeft.asInstanceOf[js.Any], clientTop = clientTop.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction0(cloneNode), closest = js.Any.fromFunction1(closest), compareDocumentPosition = js.Any.fromFunction1(compareDocumentPosition), contains = js.Any.fromFunction0(contains), contentEditable = contentEditable.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), draggable = draggable.asInstanceOf[js.Any], enterKeyHint = enterKeyHint.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getAnimations = js.Any.fromFunction0(getAnimations), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNames = js.Any.fromFunction0(getAttributeNames), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect), getClientRects = js.Any.fromFunction0(getClientRects), getElementsByClassName = js.Any.fromFunction1(getElementsByClassName), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getRootNode = js.Any.fromFunction0(getRootNode), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), hasPointerCapture = js.Any.fromFunction1(hasPointerCapture), hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], innerText = innerText.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], insertAdjacentElement = js.Any.fromFunction2(insertAdjacentElement), insertAdjacentHTML = js.Any.fromFunction2(insertAdjacentHTML), insertAdjacentText = js.Any.fromFunction2(insertAdjacentText), insertBefore = js.Any.fromFunction1(insertBefore), isConnected = isConnected.asInstanceOf[js.Any], isContentEditable = isContentEditable.asInstanceOf[js.Any], isDefaultNamespace = js.Any.fromFunction0(isDefaultNamespace), isEqualNode = js.Any.fromFunction0(isEqualNode), isSameNode = js.Any.fromFunction0(isSameNode), lang = lang.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], lookupNamespaceURI = js.Any.fromFunction0(lookupNamespaceURI), lookupPrefix = js.Any.fromFunction0(lookupPrefix), matches = js.Any.fromFunction1(matches), msGetRegionContent = js.Any.fromFunction0(msGetRegionContent), nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], outerHTML = outerHTML.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend), querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll), releasePointerCapture = js.Any.fromFunction1(releasePointerCapture), remove = js.Any.fromFunction0(remove), removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), replaceWith = js.Any.fromFunction1(replaceWith), requestFullscreen = js.Any.fromFunction0(requestFullscreen), requestPointerLock = js.Any.fromFunction0(requestPointerLock), scroll = js.Any.fromFunction0(scroll), scrollBy = js.Any.fromFunction0(scrollBy), scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollIntoView = js.Any.fromFunction0(scrollIntoView), scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTo = js.Any.fromFunction0(scrollTo), scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setPointerCapture = js.Any.fromFunction1(setPointerCapture), slot = slot.asInstanceOf[js.Any], spellcheck = spellcheck.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toggleAttribute = js.Any.fromFunction1(toggleAttribute), translate = translate.asInstanceOf[js.Any], webkitMatchesSelector = js.Any.fromFunction1(webkitMatchesSelector), onerror = null)
    __obj.asInstanceOf[ReadonlyHTMLElement]
  }
  
  @scala.inline
  implicit class ReadonlyHTMLElementMutableBuilder[Self <: ReadonlyHTMLElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setATTRIBUTE_NODE(value: Double): Self = StObject.set(x, "ATTRIBUTE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyLabel(value: String): Self = StObject.set(x, "accessKeyLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]) => Unit
    ): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfter(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnimate(value: () => Animation): Self = StObject.set(x, "animate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAppend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendChild(value: /* newChild */ Node => Node): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAssignedSlot(value: HTMLSlotElement): Self = StObject.set(x, "assignedSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedSlotNull: Self = StObject.set(x, "assignedSlot", null)
    
    @scala.inline
    def setAssignedSlotUndefined: Self = StObject.set(x, "assignedSlot", js.undefined)
    
    @scala.inline
    def setAttachShadow(value: /* init */ ShadowRootInit => ShadowRoot): Self = StObject.set(x, "attachShadow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttributes(value: NamedNodeMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocapitalize(value: String): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCDATA_SECTION_NODE(value: Double): Self = StObject.set(x, "CDATA_SECTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOMMENT_NODE(value: Double): Self = StObject.set(x, "COMMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildElementCount(value: Double): Self = StObject.set(x, "childElementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildNodes(value: NodeListOf[ChildNode]): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: HTMLCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassList(value: DOMTokenList): Self = StObject.set(x, "classList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLeft(value: Double): Self = StObject.set(x, "clientLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTop(value: Double): Self = StObject.set(x, "clientTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneNode(value: () => Node): Self = StObject.set(x, "cloneNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosest(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompareDocumentPosition(value: /* other */ Node => Double): Self = StObject.set(x, "compareDocumentPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContains(value: () => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentEditable(value: String): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_FRAGMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_FRAGMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINED_BY(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINED_BY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_CONTAINS(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_CONTAINS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_DISCONNECTED(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_FOLLOWING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_FOLLOWING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_POSITION_PRECEDING(value: Double): Self = StObject.set(x, "DOCUMENT_POSITION_PRECEDING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOCUMENT_TYPE_NODE(value: Double): Self = StObject.set(x, "DOCUMENT_TYPE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataset(value: DOMStringMap): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchEvent(value: /* event */ Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setELEMENT_NODE(value: Double): Self = StObject.set(x, "ELEMENT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENTITY_NODE(value: Double): Self = StObject.set(x, "ENTITY_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENTITY_REFERENCE_NODE(value: Double): Self = StObject.set(x, "ENTITY_REFERENCE_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyHint(value: String): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChild(value: ChildNode): Self = StObject.set(x, "firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChildNull: Self = StObject.set(x, "firstChild", null)
    
    @scala.inline
    def setFirstChildUndefined: Self = StObject.set(x, "firstChild", js.undefined)
    
    @scala.inline
    def setFirstElementChild(value: Element): Self = StObject.set(x, "firstElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstElementChildNull: Self = StObject.set(x, "firstElementChild", null)
    
    @scala.inline
    def setFirstElementChildUndefined: Self = StObject.set(x, "firstElementChild", js.undefined)
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAnimations(value: () => js.Array[Animation]): Self = StObject.set(x, "getAnimations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttribute(value: /* qualifiedName */ String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNS(value: (/* namespace */ String, /* localName */ String) => String | Null): Self = StObject.set(x, "getAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetAttributeNames(value: () => js.Array[String]): Self = StObject.set(x, "getAttributeNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAttributeNode(value: /* qualifiedName */ String => Attr | Null): Self = StObject.set(x, "getAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeNodeNS(value: (/* namespace */ String, /* localName */ String) => Attr | Null): Self = StObject.set(x, "getAttributeNodeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBoundingClientRect(value: () => DOMRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClientRects(value: () => DOMRectList): Self = StObject.set(x, "getClientRects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetElementsByClassName(value: /* classNames */ String => HTMLCollectionOf[Element]): Self = StObject.set(x, "getElementsByClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagName(value: a => HTMLCollectionOf[HTMLAnchorElement]): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagNameNS(
      value: (httpColonSlashSlashwwwDotw3DotorgSlash1999Slashxhtml, /* localName */ String) => HTMLCollectionOf[HTMLElement]
    ): Self = StObject.set(x, "getElementsByTagNameNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetRootNode(value: () => Node): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "hasAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasAttributeNS(value: (/* namespace */ String, /* localName */ String) => Boolean): Self = StObject.set(x, "hasAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasAttributes(value: () => Boolean): Self = StObject.set(x, "hasAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = StObject.set(x, "hasChildNodes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasPointerCapture(value: /* pointerId */ Double => Boolean): Self = StObject.set(x, "hasPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMode(value: String): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertAdjacentElement(value: (/* position */ InsertPosition, /* insertedElement */ Element) => Element | Null): Self = StObject.set(x, "insertAdjacentElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAdjacentHTML(value: (/* where */ InsertPosition, /* html */ String) => Unit): Self = StObject.set(x, "insertAdjacentHTML", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAdjacentText(value: (/* where */ InsertPosition, /* text */ String) => Unit): Self = StObject.set(x, "insertAdjacentText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertBefore(value: /* newChild */ Node => Node): Self = StObject.set(x, "insertBefore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsConnected(value: Boolean): Self = StObject.set(x, "isConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContentEditable(value: Boolean): Self = StObject.set(x, "isContentEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultNamespace(value: () => Boolean): Self = StObject.set(x, "isDefaultNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEqualNode(value: () => Boolean): Self = StObject.set(x, "isEqualNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSameNode(value: () => Boolean): Self = StObject.set(x, "isSameNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChild(value: ChildNode): Self = StObject.set(x, "lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChildNull: Self = StObject.set(x, "lastChild", null)
    
    @scala.inline
    def setLastChildUndefined: Self = StObject.set(x, "lastChild", js.undefined)
    
    @scala.inline
    def setLastElementChild(value: Element): Self = StObject.set(x, "lastElementChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastElementChildNull: Self = StObject.set(x, "lastElementChild", null)
    
    @scala.inline
    def setLastElementChildUndefined: Self = StObject.set(x, "lastElementChild", js.undefined)
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupNamespaceURI(value: () => String | Null): Self = StObject.set(x, "lookupNamespaceURI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLookupPrefix(value: () => String | Null): Self = StObject.set(x, "lookupPrefix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMatches(value: /* selectors */ String => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMsGetRegionContent(value: () => js.Any): Self = StObject.set(x, "msGetRegionContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNOTATION_NODE(value: Double): Self = StObject.set(x, "NOTATION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceURINull: Self = StObject.set(x, "namespaceURI", null)
    
    @scala.inline
    def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
    
    @scala.inline
    def setNextElementSibling(value: Element): Self = StObject.set(x, "nextElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextElementSiblingNull: Self = StObject.set(x, "nextElementSibling", null)
    
    @scala.inline
    def setNextElementSiblingUndefined: Self = StObject.set(x, "nextElementSibling", js.undefined)
    
    @scala.inline
    def setNextSibling(value: ChildNode): Self = StObject.set(x, "nextSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSiblingNull: Self = StObject.set(x, "nextSibling", null)
    
    @scala.inline
    def setNextSiblingUndefined: Self = StObject.set(x, "nextSibling", js.undefined)
    
    @scala.inline
    def setNodeName(value: String): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: Double): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeValueNull: Self = StObject.set(x, "nodeValue", null)
    
    @scala.inline
    def setNodeValueUndefined: Self = StObject.set(x, "nodeValue", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setNormalize(value: () => Unit): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetParent(value: Element): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetParentNull: Self = StObject.set(x, "offsetParent", null)
    
    @scala.inline
    def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
    
    @scala.inline
    def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnabort(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onabort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnabortNull: Self = StObject.set(x, "onabort", null)
    
    @scala.inline
    def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
    
    @scala.inline
    def setOnanimationcancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationcancelNull: Self = StObject.set(x, "onanimationcancel", null)
    
    @scala.inline
    def setOnanimationcancelUndefined: Self = StObject.set(x, "onanimationcancel", js.undefined)
    
    @scala.inline
    def setOnanimationend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationendNull: Self = StObject.set(x, "onanimationend", null)
    
    @scala.inline
    def setOnanimationendUndefined: Self = StObject.set(x, "onanimationend", js.undefined)
    
    @scala.inline
    def setOnanimationiteration(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationiteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationiterationNull: Self = StObject.set(x, "onanimationiteration", null)
    
    @scala.inline
    def setOnanimationiterationUndefined: Self = StObject.set(x, "onanimationiteration", js.undefined)
    
    @scala.inline
    def setOnanimationstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ AnimationEvent, js.Any]): Self = StObject.set(x, "onanimationstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnanimationstartNull: Self = StObject.set(x, "onanimationstart", null)
    
    @scala.inline
    def setOnanimationstartUndefined: Self = StObject.set(x, "onanimationstart", js.undefined)
    
    @scala.inline
    def setOnauxclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onauxclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnauxclickNull: Self = StObject.set(x, "onauxclick", null)
    
    @scala.inline
    def setOnauxclickUndefined: Self = StObject.set(x, "onauxclick", js.undefined)
    
    @scala.inline
    def setOnblur(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onblur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnblurNull: Self = StObject.set(x, "onblur", null)
    
    @scala.inline
    def setOnblurUndefined: Self = StObject.set(x, "onblur", js.undefined)
    
    @scala.inline
    def setOncancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncancelNull: Self = StObject.set(x, "oncancel", null)
    
    @scala.inline
    def setOncancelUndefined: Self = StObject.set(x, "oncancel", js.undefined)
    
    @scala.inline
    def setOncanplay(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncanplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncanplayNull: Self = StObject.set(x, "oncanplay", null)
    
    @scala.inline
    def setOncanplayUndefined: Self = StObject.set(x, "oncanplay", js.undefined)
    
    @scala.inline
    def setOncanplaythrough(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncanplaythrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncanplaythroughNull: Self = StObject.set(x, "oncanplaythrough", null)
    
    @scala.inline
    def setOncanplaythroughUndefined: Self = StObject.set(x, "oncanplaythrough", js.undefined)
    
    @scala.inline
    def setOnchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnchangeNull: Self = StObject.set(x, "onchange", null)
    
    @scala.inline
    def setOnchangeUndefined: Self = StObject.set(x, "onchange", js.undefined)
    
    @scala.inline
    def setOnclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclickNull: Self = StObject.set(x, "onclick", null)
    
    @scala.inline
    def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    @scala.inline
    def setOnclose(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncloseNull: Self = StObject.set(x, "onclose", null)
    
    @scala.inline
    def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
    
    @scala.inline
    def setOncontextmenu(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "oncontextmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncontextmenuNull: Self = StObject.set(x, "oncontextmenu", null)
    
    @scala.inline
    def setOncontextmenuUndefined: Self = StObject.set(x, "oncontextmenu", js.undefined)
    
    @scala.inline
    def setOncopy(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, js.Any]): Self = StObject.set(x, "oncopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncopyNull: Self = StObject.set(x, "oncopy", null)
    
    @scala.inline
    def setOncopyUndefined: Self = StObject.set(x, "oncopy", js.undefined)
    
    @scala.inline
    def setOncuechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "oncuechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncuechangeNull: Self = StObject.set(x, "oncuechange", null)
    
    @scala.inline
    def setOncuechangeUndefined: Self = StObject.set(x, "oncuechange", js.undefined)
    
    @scala.inline
    def setOncut(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, js.Any]): Self = StObject.set(x, "oncut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOncutNull: Self = StObject.set(x, "oncut", null)
    
    @scala.inline
    def setOncutUndefined: Self = StObject.set(x, "oncut", js.undefined)
    
    @scala.inline
    def setOndblclick(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "ondblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndblclickNull: Self = StObject.set(x, "ondblclick", null)
    
    @scala.inline
    def setOndblclickUndefined: Self = StObject.set(x, "ondblclick", js.undefined)
    
    @scala.inline
    def setOndrag(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragNull: Self = StObject.set(x, "ondrag", null)
    
    @scala.inline
    def setOndragUndefined: Self = StObject.set(x, "ondrag", js.undefined)
    
    @scala.inline
    def setOndragend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragendNull: Self = StObject.set(x, "ondragend", null)
    
    @scala.inline
    def setOndragendUndefined: Self = StObject.set(x, "ondragend", js.undefined)
    
    @scala.inline
    def setOndragenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragenterNull: Self = StObject.set(x, "ondragenter", null)
    
    @scala.inline
    def setOndragenterUndefined: Self = StObject.set(x, "ondragenter", js.undefined)
    
    @scala.inline
    def setOndragexit(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "ondragexit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragexitNull: Self = StObject.set(x, "ondragexit", null)
    
    @scala.inline
    def setOndragexitUndefined: Self = StObject.set(x, "ondragexit", js.undefined)
    
    @scala.inline
    def setOndragleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragleaveNull: Self = StObject.set(x, "ondragleave", null)
    
    @scala.inline
    def setOndragleaveUndefined: Self = StObject.set(x, "ondragleave", js.undefined)
    
    @scala.inline
    def setOndragover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragoverNull: Self = StObject.set(x, "ondragover", null)
    
    @scala.inline
    def setOndragoverUndefined: Self = StObject.set(x, "ondragover", js.undefined)
    
    @scala.inline
    def setOndragstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondragstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndragstartNull: Self = StObject.set(x, "ondragstart", null)
    
    @scala.inline
    def setOndragstartUndefined: Self = StObject.set(x, "ondragstart", js.undefined)
    
    @scala.inline
    def setOndrop(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ DragEvent, js.Any]): Self = StObject.set(x, "ondrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndropNull: Self = StObject.set(x, "ondrop", null)
    
    @scala.inline
    def setOndropUndefined: Self = StObject.set(x, "ondrop", js.undefined)
    
    @scala.inline
    def setOndurationchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "ondurationchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOndurationchangeNull: Self = StObject.set(x, "ondurationchange", null)
    
    @scala.inline
    def setOndurationchangeUndefined: Self = StObject.set(x, "ondurationchange", js.undefined)
    
    @scala.inline
    def setOnemptied(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onemptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnemptiedNull: Self = StObject.set(x, "onemptied", null)
    
    @scala.inline
    def setOnemptiedUndefined: Self = StObject.set(x, "onemptied", js.undefined)
    
    @scala.inline
    def setOnended(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnendedNull: Self = StObject.set(x, "onended", null)
    
    @scala.inline
    def setOnendedUndefined: Self = StObject.set(x, "onended", js.undefined)
    
    @scala.inline
    def setOnerror(
      value: (/* event */ Event | String, /* source */ js.UndefOr[String], /* lineno */ js.UndefOr[Double], /* colno */ js.UndefOr[Double], /* error */ js.UndefOr[Error]) => js.Any
    ): Self = StObject.set(x, "onerror", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnerrorNull: Self = StObject.set(x, "onerror", null)
    
    @scala.inline
    def setOnfocus(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ FocusEvent, js.Any]): Self = StObject.set(x, "onfocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfocusNull: Self = StObject.set(x, "onfocus", null)
    
    @scala.inline
    def setOnfocusUndefined: Self = StObject.set(x, "onfocus", js.undefined)
    
    @scala.inline
    def setOnfullscreenchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onfullscreenchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfullscreenchangeNull: Self = StObject.set(x, "onfullscreenchange", null)
    
    @scala.inline
    def setOnfullscreenchangeUndefined: Self = StObject.set(x, "onfullscreenchange", js.undefined)
    
    @scala.inline
    def setOnfullscreenerror(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onfullscreenerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnfullscreenerrorNull: Self = StObject.set(x, "onfullscreenerror", null)
    
    @scala.inline
    def setOnfullscreenerrorUndefined: Self = StObject.set(x, "onfullscreenerror", js.undefined)
    
    @scala.inline
    def setOngotpointercapture(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "ongotpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOngotpointercaptureNull: Self = StObject.set(x, "ongotpointercapture", null)
    
    @scala.inline
    def setOngotpointercaptureUndefined: Self = StObject.set(x, "ongotpointercapture", js.undefined)
    
    @scala.inline
    def setOninput(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "oninput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninputNull: Self = StObject.set(x, "oninput", null)
    
    @scala.inline
    def setOninputUndefined: Self = StObject.set(x, "oninput", js.undefined)
    
    @scala.inline
    def setOninvalid(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOninvalidNull: Self = StObject.set(x, "oninvalid", null)
    
    @scala.inline
    def setOninvalidUndefined: Self = StObject.set(x, "oninvalid", js.undefined)
    
    @scala.inline
    def setOnkeydown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeydown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeydownNull: Self = StObject.set(x, "onkeydown", null)
    
    @scala.inline
    def setOnkeydownUndefined: Self = StObject.set(x, "onkeydown", js.undefined)
    
    @scala.inline
    def setOnkeypress(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeypress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeypressNull: Self = StObject.set(x, "onkeypress", null)
    
    @scala.inline
    def setOnkeypressUndefined: Self = StObject.set(x, "onkeypress", js.undefined)
    
    @scala.inline
    def setOnkeyup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ KeyboardEvent, js.Any]): Self = StObject.set(x, "onkeyup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnkeyupNull: Self = StObject.set(x, "onkeyup", null)
    
    @scala.inline
    def setOnkeyupUndefined: Self = StObject.set(x, "onkeyup", js.undefined)
    
    @scala.inline
    def setOnload(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadNull: Self = StObject.set(x, "onload", null)
    
    @scala.inline
    def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
    
    @scala.inline
    def setOnloadeddata(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadeddata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadeddataNull: Self = StObject.set(x, "onloadeddata", null)
    
    @scala.inline
    def setOnloadeddataUndefined: Self = StObject.set(x, "onloadeddata", js.undefined)
    
    @scala.inline
    def setOnloadedmetadata(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadedmetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadedmetadataNull: Self = StObject.set(x, "onloadedmetadata", null)
    
    @scala.inline
    def setOnloadedmetadataUndefined: Self = StObject.set(x, "onloadedmetadata", js.undefined)
    
    @scala.inline
    def setOnloadstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onloadstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnloadstartNull: Self = StObject.set(x, "onloadstart", null)
    
    @scala.inline
    def setOnloadstartUndefined: Self = StObject.set(x, "onloadstart", js.undefined)
    
    @scala.inline
    def setOnlostpointercapture(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onlostpointercapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlostpointercaptureNull: Self = StObject.set(x, "onlostpointercapture", null)
    
    @scala.inline
    def setOnlostpointercaptureUndefined: Self = StObject.set(x, "onlostpointercapture", js.undefined)
    
    @scala.inline
    def setOnmousedown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmousedownNull: Self = StObject.set(x, "onmousedown", null)
    
    @scala.inline
    def setOnmousedownUndefined: Self = StObject.set(x, "onmousedown", js.undefined)
    
    @scala.inline
    def setOnmouseenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseenterNull: Self = StObject.set(x, "onmouseenter", null)
    
    @scala.inline
    def setOnmouseenterUndefined: Self = StObject.set(x, "onmouseenter", js.undefined)
    
    @scala.inline
    def setOnmouseleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseleaveNull: Self = StObject.set(x, "onmouseleave", null)
    
    @scala.inline
    def setOnmouseleaveUndefined: Self = StObject.set(x, "onmouseleave", js.undefined)
    
    @scala.inline
    def setOnmousemove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmousemoveNull: Self = StObject.set(x, "onmousemove", null)
    
    @scala.inline
    def setOnmousemoveUndefined: Self = StObject.set(x, "onmousemove", js.undefined)
    
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoutNull: Self = StObject.set(x, "onmouseout", null)
    
    @scala.inline
    def setOnmouseoutUndefined: Self = StObject.set(x, "onmouseout", js.undefined)
    
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseoverNull: Self = StObject.set(x, "onmouseover", null)
    
    @scala.inline
    def setOnmouseoverUndefined: Self = StObject.set(x, "onmouseover", js.undefined)
    
    @scala.inline
    def setOnmouseup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ MouseEvent, js.Any]): Self = StObject.set(x, "onmouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnmouseupNull: Self = StObject.set(x, "onmouseup", null)
    
    @scala.inline
    def setOnmouseupUndefined: Self = StObject.set(x, "onmouseup", js.undefined)
    
    @scala.inline
    def setOnpaste(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ClipboardEvent, js.Any]): Self = StObject.set(x, "onpaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpasteNull: Self = StObject.set(x, "onpaste", null)
    
    @scala.inline
    def setOnpasteUndefined: Self = StObject.set(x, "onpaste", js.undefined)
    
    @scala.inline
    def setOnpause(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpauseNull: Self = StObject.set(x, "onpause", null)
    
    @scala.inline
    def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
    
    @scala.inline
    def setOnplay(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplayNull: Self = StObject.set(x, "onplay", null)
    
    @scala.inline
    def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
    
    @scala.inline
    def setOnplaying(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onplaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnplayingNull: Self = StObject.set(x, "onplaying", null)
    
    @scala.inline
    def setOnplayingUndefined: Self = StObject.set(x, "onplaying", js.undefined)
    
    @scala.inline
    def setOnpointercancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointercancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointercancelNull: Self = StObject.set(x, "onpointercancel", null)
    
    @scala.inline
    def setOnpointercancelUndefined: Self = StObject.set(x, "onpointercancel", js.undefined)
    
    @scala.inline
    def setOnpointerdown(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerdownNull: Self = StObject.set(x, "onpointerdown", null)
    
    @scala.inline
    def setOnpointerdownUndefined: Self = StObject.set(x, "onpointerdown", js.undefined)
    
    @scala.inline
    def setOnpointerenter(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerenterNull: Self = StObject.set(x, "onpointerenter", null)
    
    @scala.inline
    def setOnpointerenterUndefined: Self = StObject.set(x, "onpointerenter", js.undefined)
    
    @scala.inline
    def setOnpointerleave(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerleave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerleaveNull: Self = StObject.set(x, "onpointerleave", null)
    
    @scala.inline
    def setOnpointerleaveUndefined: Self = StObject.set(x, "onpointerleave", js.undefined)
    
    @scala.inline
    def setOnpointermove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointermove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointermoveNull: Self = StObject.set(x, "onpointermove", null)
    
    @scala.inline
    def setOnpointermoveUndefined: Self = StObject.set(x, "onpointermove", js.undefined)
    
    @scala.inline
    def setOnpointerout(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointeroutNull: Self = StObject.set(x, "onpointerout", null)
    
    @scala.inline
    def setOnpointeroutUndefined: Self = StObject.set(x, "onpointerout", js.undefined)
    
    @scala.inline
    def setOnpointerover(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointeroverNull: Self = StObject.set(x, "onpointerover", null)
    
    @scala.inline
    def setOnpointeroverUndefined: Self = StObject.set(x, "onpointerover", js.undefined)
    
    @scala.inline
    def setOnpointerup(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ PointerEvent, js.Any]): Self = StObject.set(x, "onpointerup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnpointerupNull: Self = StObject.set(x, "onpointerup", null)
    
    @scala.inline
    def setOnpointerupUndefined: Self = StObject.set(x, "onpointerup", js.undefined)
    
    @scala.inline
    def setOnprogress(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ ProgressEvent[EventTarget], js.Any]): Self = StObject.set(x, "onprogress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnprogressNull: Self = StObject.set(x, "onprogress", null)
    
    @scala.inline
    def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    
    @scala.inline
    def setOnratechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onratechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnratechangeNull: Self = StObject.set(x, "onratechange", null)
    
    @scala.inline
    def setOnratechangeUndefined: Self = StObject.set(x, "onratechange", js.undefined)
    
    @scala.inline
    def setOnreset(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onreset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresetNull: Self = StObject.set(x, "onreset", null)
    
    @scala.inline
    def setOnresetUndefined: Self = StObject.set(x, "onreset", js.undefined)
    
    @scala.inline
    def setOnresize(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ UIEvent, js.Any]): Self = StObject.set(x, "onresize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnresizeNull: Self = StObject.set(x, "onresize", null)
    
    @scala.inline
    def setOnresizeUndefined: Self = StObject.set(x, "onresize", js.undefined)
    
    @scala.inline
    def setOnscroll(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnscrollNull: Self = StObject.set(x, "onscroll", null)
    
    @scala.inline
    def setOnscrollUndefined: Self = StObject.set(x, "onscroll", js.undefined)
    
    @scala.inline
    def setOnsecuritypolicyviolation(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ SecurityPolicyViolationEvent, js.Any]): Self = StObject.set(x, "onsecuritypolicyviolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsecuritypolicyviolationNull: Self = StObject.set(x, "onsecuritypolicyviolation", null)
    
    @scala.inline
    def setOnsecuritypolicyviolationUndefined: Self = StObject.set(x, "onsecuritypolicyviolation", js.undefined)
    
    @scala.inline
    def setOnseeked(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onseeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnseekedNull: Self = StObject.set(x, "onseeked", null)
    
    @scala.inline
    def setOnseekedUndefined: Self = StObject.set(x, "onseeked", js.undefined)
    
    @scala.inline
    def setOnseeking(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onseeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnseekingNull: Self = StObject.set(x, "onseeking", null)
    
    @scala.inline
    def setOnseekingUndefined: Self = StObject.set(x, "onseeking", js.undefined)
    
    @scala.inline
    def setOnselect(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectNull: Self = StObject.set(x, "onselect", null)
    
    @scala.inline
    def setOnselectUndefined: Self = StObject.set(x, "onselect", js.undefined)
    
    @scala.inline
    def setOnselectionchange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselectionchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectionchangeNull: Self = StObject.set(x, "onselectionchange", null)
    
    @scala.inline
    def setOnselectionchangeUndefined: Self = StObject.set(x, "onselectionchange", js.undefined)
    
    @scala.inline
    def setOnselectstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onselectstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnselectstartNull: Self = StObject.set(x, "onselectstart", null)
    
    @scala.inline
    def setOnselectstartUndefined: Self = StObject.set(x, "onselectstart", js.undefined)
    
    @scala.inline
    def setOnstalled(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onstalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnstalledNull: Self = StObject.set(x, "onstalled", null)
    
    @scala.inline
    def setOnstalledUndefined: Self = StObject.set(x, "onstalled", js.undefined)
    
    @scala.inline
    def setOnsubmit(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onsubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsubmitNull: Self = StObject.set(x, "onsubmit", null)
    
    @scala.inline
    def setOnsubmitUndefined: Self = StObject.set(x, "onsubmit", js.undefined)
    
    @scala.inline
    def setOnsuspend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onsuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnsuspendNull: Self = StObject.set(x, "onsuspend", null)
    
    @scala.inline
    def setOnsuspendUndefined: Self = StObject.set(x, "onsuspend", js.undefined)
    
    @scala.inline
    def setOntimeupdate(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "ontimeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntimeupdateNull: Self = StObject.set(x, "ontimeupdate", null)
    
    @scala.inline
    def setOntimeupdateUndefined: Self = StObject.set(x, "ontimeupdate", js.undefined)
    
    @scala.inline
    def setOntoggle(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "ontoggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntoggleNull: Self = StObject.set(x, "ontoggle", null)
    
    @scala.inline
    def setOntoggleUndefined: Self = StObject.set(x, "ontoggle", js.undefined)
    
    @scala.inline
    def setOntouchcancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchcancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchcancelNull: Self = StObject.set(x, "ontouchcancel", null)
    
    @scala.inline
    def setOntouchcancelUndefined: Self = StObject.set(x, "ontouchcancel", js.undefined)
    
    @scala.inline
    def setOntouchend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchendNull: Self = StObject.set(x, "ontouchend", null)
    
    @scala.inline
    def setOntouchendUndefined: Self = StObject.set(x, "ontouchend", js.undefined)
    
    @scala.inline
    def setOntouchmove(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchmoveNull: Self = StObject.set(x, "ontouchmove", null)
    
    @scala.inline
    def setOntouchmoveUndefined: Self = StObject.set(x, "ontouchmove", js.undefined)
    
    @scala.inline
    def setOntouchstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TouchEvent, js.Any]): Self = StObject.set(x, "ontouchstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntouchstartNull: Self = StObject.set(x, "ontouchstart", null)
    
    @scala.inline
    def setOntouchstartUndefined: Self = StObject.set(x, "ontouchstart", js.undefined)
    
    @scala.inline
    def setOntransitioncancel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitioncancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitioncancelNull: Self = StObject.set(x, "ontransitioncancel", null)
    
    @scala.inline
    def setOntransitioncancelUndefined: Self = StObject.set(x, "ontransitioncancel", js.undefined)
    
    @scala.inline
    def setOntransitionend(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitionendNull: Self = StObject.set(x, "ontransitionend", null)
    
    @scala.inline
    def setOntransitionendUndefined: Self = StObject.set(x, "ontransitionend", js.undefined)
    
    @scala.inline
    def setOntransitionrun(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionrun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitionrunNull: Self = StObject.set(x, "ontransitionrun", null)
    
    @scala.inline
    def setOntransitionrunUndefined: Self = StObject.set(x, "ontransitionrun", js.undefined)
    
    @scala.inline
    def setOntransitionstart(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ TransitionEvent, js.Any]): Self = StObject.set(x, "ontransitionstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOntransitionstartNull: Self = StObject.set(x, "ontransitionstart", null)
    
    @scala.inline
    def setOntransitionstartUndefined: Self = StObject.set(x, "ontransitionstart", js.undefined)
    
    @scala.inline
    def setOnvolumechange(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onvolumechange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnvolumechangeNull: Self = StObject.set(x, "onvolumechange", null)
    
    @scala.inline
    def setOnvolumechangeUndefined: Self = StObject.set(x, "onvolumechange", js.undefined)
    
    @scala.inline
    def setOnwaiting(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]): Self = StObject.set(x, "onwaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwaitingNull: Self = StObject.set(x, "onwaiting", null)
    
    @scala.inline
    def setOnwaitingUndefined: Self = StObject.set(x, "onwaiting", js.undefined)
    
    @scala.inline
    def setOnwheel(value: js.ThisFunction1[ReadonlyHTMLElement, /* ev */ WheelEvent, js.Any]): Self = StObject.set(x, "onwheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnwheelNull: Self = StObject.set(x, "onwheel", null)
    
    @scala.inline
    def setOnwheelUndefined: Self = StObject.set(x, "onwheel", js.undefined)
    
    @scala.inline
    def setOuterHTML(value: String): Self = StObject.set(x, "outerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerDocument(value: Document): Self = StObject.set(x, "ownerDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPROCESSING_INSTRUCTION_NODE(value: Double): Self = StObject.set(x, "PROCESSING_INSTRUCTION_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElement(value: HTMLElement): Self = StObject.set(x, "parentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentElementNull: Self = StObject.set(x, "parentElement", null)
    
    @scala.inline
    def setParentElementUndefined: Self = StObject.set(x, "parentElement", js.undefined)
    
    @scala.inline
    def setParentNode(value: Node & ParentNode): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNodeNull: Self = StObject.set(x, "parentNode", null)
    
    @scala.inline
    def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setPrepend(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreviousElementSibling(value: Element): Self = StObject.set(x, "previousElementSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousElementSiblingNull: Self = StObject.set(x, "previousElementSibling", null)
    
    @scala.inline
    def setPreviousElementSiblingUndefined: Self = StObject.set(x, "previousElementSibling", js.undefined)
    
    @scala.inline
    def setPreviousSibling(value: ChildNode): Self = StObject.set(x, "previousSibling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSiblingNull: Self = StObject.set(x, "previousSibling", null)
    
    @scala.inline
    def setPreviousSiblingUndefined: Self = StObject.set(x, "previousSibling", js.undefined)
    
    @scala.inline
    def setQuerySelector(value: a => HTMLAnchorElement | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQuerySelectorAll(value: a => NodeListOf[HTMLAnchorElement]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleasePointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "releasePointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveAttribute(value: /* qualifiedName */ String => Unit): Self = StObject.set(x, "removeAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAttributeNS(value: (/* namespace */ String, /* localName */ String) => Unit): Self = StObject.set(x, "removeAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAttributeNode(value: /* attr */ Attr => Attr): Self = StObject.set(x, "removeAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChild(value: /* oldChild */ Node => Node): Self = StObject.set(x, "removeChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(
      value: (fullscreenchange, /* listener */ js.ThisFunction1[ReadonlyHTMLElement, /* ev */ Event, js.Any]) => Unit
    ): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceChild(value: (/* newChild */ Node, /* oldChild */ Node) => Node): Self = StObject.set(x, "replaceChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReplaceWith(value: /* repeated */ Node | String => Unit): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestFullscreen(value: () => js.Promise[Unit]): Self = StObject.set(x, "requestFullscreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestPointerLock(value: () => Unit): Self = StObject.set(x, "requestPointerLock", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScroll(value: () => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollBy(value: () => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollIntoView(value: () => Unit): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTo(value: () => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAttribute(value: (/* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetAttributeNS(value: (/* namespace */ String, /* qualifiedName */ String, /* value */ String) => Unit): Self = StObject.set(x, "setAttributeNS", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAttributeNode(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAttributeNodeNS(value: /* attr */ Attr => Attr | Null): Self = StObject.set(x, "setAttributeNodeNS", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPointerCapture(value: /* pointerId */ Double => Unit): Self = StObject.set(x, "setPointerCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShadowRoot(value: ShadowRoot): Self = StObject.set(x, "shadowRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowRootNull: Self = StObject.set(x, "shadowRoot", null)
    
    @scala.inline
    def setShadowRootUndefined: Self = StObject.set(x, "shadowRoot", js.undefined)
    
    @scala.inline
    def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: CSSStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEXT_NODE(value: Double): Self = StObject.set(x, "TEXT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentNull: Self = StObject.set(x, "textContent", null)
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleAttribute(value: /* qualifiedName */ String => Boolean): Self = StObject.set(x, "toggleAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTranslate(value: Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebkitMatchesSelector(value: /* selectors */ String => Boolean): Self = StObject.set(x, "webkitMatchesSelector", js.Any.fromFunction1(value))
  }
}
