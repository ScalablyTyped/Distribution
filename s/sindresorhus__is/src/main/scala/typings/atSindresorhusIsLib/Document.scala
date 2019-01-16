package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document
  extends Node
     with NonElementParentNode
     with DocumentOrShadowRoot
     with ParentNode
     with GlobalEventHandlers
     with DocumentAndElementEventHandlers {
  /**
    * Sets or gets the URL for the current document.
    */
  val URL: java.lang.String = js.native
  /**
    * Sets or gets the color of all active links in the document.
    */
  /** @deprecated */
  var alinkColor: java.lang.String = js.native
  /**
    * Returns a reference to the collection of elements contained by the object.
    */
  /** @deprecated */
  val all: HTMLAllCollection = js.native
  /**
    * Retrieves a collection of all a objects that have a name and/or id property. Objects in this collection are in HTML source order.
    */
  /** @deprecated */
  val anchors: HTMLCollectionOf[HTMLAnchorElement] = js.native
  /**
    * Retrieves a collection of all applet objects in the document.
    */
  /** @deprecated */
  val applets: HTMLCollectionOf[HTMLAppletElement] = js.native
  /**
    * Deprecated. Sets or retrieves a value that indicates the background color behind the object.
    */
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /**
    * Specifies the beginning and end of the document body.
    */
  var body: HTMLElement = js.native
  /**
    * Returns document's encoding.
    */
  val characterSet: java.lang.String = js.native
  /**
    * Gets or sets the character set used to encode the object.
    */
  val charset: java.lang.String = js.native
  /**
    * Gets a value that indicates whether standards-compliant mode is switched on for the object.
    */
  val compatMode: java.lang.String = js.native
  /**
    * Returns document's content type.
    */
  val contentType: java.lang.String = js.native
  /**
    * Returns the HTTP cookies that apply to the Document. If there are no cookies or
    * cookies can't be applied to this resource, the empty string will be returned.
    * Can be set, to add a new cookie to the element's set of HTTP cookies.
    * If the contents are sandboxed into a
    * unique origin (e.g. in an iframe with the sandbox attribute), a
    * "SecurityError" DOMException will be thrown on getting
    * and setting.
    */
  var cookie: java.lang.String = js.native
  /**
    * Returns the script element, or the SVG script element,
    * that is currently executing, as long as the element represents a classic script.
    * In the case of reentrant script execution, returns the one that most recently started executing
    * amongst those that have not yet finished executing.
    * Returns null if the Document is not currently executing a script
    * or SVG script element (e.g., because the running script is an event
    * handler, or a timeout), or if the currently executing script or SVG
    * script element represents a module script.
    */
  val currentScript: HTMLOrSVGScriptElement | scala.Null = js.native
  val defaultView: WindowProxy | scala.Null = js.native
  /**
    * Sets or gets a value that indicates whether the document can be edited.
    */
  var designMode: java.lang.String = js.native
  /**
    * Sets or retrieves a value that indicates the reading order of the object.
    */
  var dir: java.lang.String = js.native
  /**
    * Gets an object representing the document type declaration associated with the current document.
    */
  val doctype: DocumentType | scala.Null = js.native
  /**
    * Gets a reference to the root node of the document.
    */
  val documentElement: HTMLElement = js.native
  /**
    * Returns document's URL.
    */
  val documentURI: java.lang.String = js.native
  /**
    * Sets or gets the security domain of the document.
    */
  var domain: java.lang.String = js.native
  /**
    * Retrieves a collection of all embed objects in the document.
    */
  val embeds: HTMLCollectionOf[HTMLEmbedElement] = js.native
  /**
    * Sets or gets the foreground (text) color of the document.
    */
  /** @deprecated */
  var fgColor: java.lang.String = js.native
  /**
    * Retrieves a collection, in source order, of all form objects in the document.
    */
  val forms: HTMLCollectionOf[HTMLFormElement] = js.native
  /** @deprecated */
  val fullscreen: scala.Boolean = js.native
  /**
    * Returns true if document has the ability to display elements fullscreen
    * and fullscreen is supported, or false otherwise.
    */
  val fullscreenEnabled: scala.Boolean = js.native
  /**
    * Returns the head element.
    */
  val head: HTMLHeadElement = js.native
  val hidden: scala.Boolean = js.native
  /**
    * Retrieves a collection, in source order, of img objects in the document.
    */
  val images: HTMLCollectionOf[HTMLImageElement] = js.native
  /**
    * Gets the implementation object of the current document.
    */
  val implementation: DOMImplementation = js.native
  /**
    * Returns the character encoding used to create the webpage that is loaded into the document object.
    */
  val inputEncoding: java.lang.String = js.native
  /**
    * Gets the date that the page was last modified, if the page supplies one.
    */
  val lastModified: java.lang.String = js.native
  /**
    * Sets or gets the color of the document links.
    */
  /** @deprecated */
  var linkColor: java.lang.String = js.native
  /**
    * Retrieves a collection of all a objects that specify the href property and all area objects in the document.
    */
  val links: HTMLCollectionOf[HTMLAnchorElement | HTMLAreaElement] = js.native
  /**
    * Contains information about the current URL.
    */
  var location: Location = js.native
  var onfullscreenchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onfullscreenerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Fires when the state of the object has changed.
    * @param ev The event
    */
  var onreadystatechange: (js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]) | scala.Null = js.native
  var onvisibilitychange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Returns document's origin.
    */
  val origin: java.lang.String = js.native
  /**
    * Return an HTMLCollection of the embed elements in the Document.
    */
  val plugins: HTMLCollectionOf[HTMLEmbedElement] = js.native
  /**
    * Retrieves a value that indicates the current state of the object.
    */
  val readyState: DocumentReadyState = js.native
  /**
    * Gets the URL of the location that referred the user to the current page.
    */
  val referrer: java.lang.String = js.native
  /**
    * Retrieves a collection of all script objects in the document.
    */
  val scripts: HTMLCollectionOf[HTMLScriptElement] = js.native
  val scrollingElement: Element | scala.Null = js.native
  val timeline: DocumentTimeline = js.native
  /**
    * Contains the title of the document.
    */
  var title: java.lang.String = js.native
  val visibilityState: VisibilityState = js.native
  /**
    * Sets or gets the color of the links that the user has visited.
    */
  /** @deprecated */
  var vlinkColor: java.lang.String = js.native
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * The options argument sets listener-specific options. For compatibility this can be a
    * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
    * be removed.
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
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
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
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
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
    */
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Moves node from another document and returns it.
    * If node is a document, throws a "NotSupportedError" DOMException or, if node is a shadow root, throws a
    * "HierarchyRequestError" DOMException.
    */
  def adoptNode[T /* <: Node */](source: T): T = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  /** @deprecated */
  def clear(): scala.Unit = js.native
  /**
    * Closes an output stream and forces the sent data to display.
    */
  def close(): scala.Unit = js.native
  /**
    * Creates an attribute object with a specified name.
    * @param name String that sets the attribute object's name.
    */
  def createAttribute(localName: java.lang.String): Attr = js.native
  def createAttributeNS(namespace: java.lang.String, qualifiedName: java.lang.String): Attr = js.native
  def createAttributeNS(namespace: scala.Null, qualifiedName: java.lang.String): Attr = js.native
  /**
    * Returns a CDATASection node whose data is data.
    */
  def createCDATASection(data: java.lang.String): CDATASection = js.native
  /**
    * Creates a comment object with the specified data.
    * @param data Sets the comment object's data.
    */
  def createComment(data: java.lang.String): Comment = js.native
  /**
    * Creates a new document.
    */
  def createDocumentFragment(): DocumentFragment = js.native
  def createElement(tagName: java.lang.String): HTMLElement = js.native
  def createElement(tagName: java.lang.String, options: ElementCreationOptions): HTMLElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.a
  ): SVGAElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.circle
  ): SVGCircleElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.clipPath
  ): SVGClipPathElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.componentTransferFunction
  ): SVGComponentTransferFunctionElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.cursor
  ): SVGCursorElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.defs
  ): SVGDefsElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.desc
  ): SVGDescElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ellipse
  ): SVGEllipseElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feBlend
  ): SVGFEBlendElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feColorMatrix
  ): SVGFEColorMatrixElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComponentTransfer
  ): SVGFEComponentTransferElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feComposite
  ): SVGFECompositeElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feConvolveMatrix
  ): SVGFEConvolveMatrixElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDiffuseLighting
  ): SVGFEDiffuseLightingElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDisplacementMap
  ): SVGFEDisplacementMapElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feDistantLight
  ): SVGFEDistantLightElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFlood
  ): SVGFEFloodElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncA
  ): SVGFEFuncAElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncB
  ): SVGFEFuncBElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncG
  ): SVGFEFuncGElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feFuncR
  ): SVGFEFuncRElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feGaussianBlur
  ): SVGFEGaussianBlurElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feImage
  ): SVGFEImageElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMerge
  ): SVGFEMergeElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMergeNode
  ): SVGFEMergeNodeElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feMorphology
  ): SVGFEMorphologyElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feOffset
  ): SVGFEOffsetElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.fePointLight
  ): SVGFEPointLightElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpecularLighting
  ): SVGFESpecularLightingElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feSpotLight
  ): SVGFESpotLightElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTile
  ): SVGFETileElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.feTurbulence
  ): SVGFETurbulenceElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.filter
  ): SVGFilterElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.foreignObject
  ): SVGForeignObjectElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.g
  ): SVGGElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.gradient
  ): SVGGradientElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.image
  ): SVGImageElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.line
  ): SVGLineElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.linearGradient
  ): SVGLinearGradientElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.marker
  ): SVGMarkerElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.mask
  ): SVGMaskElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.metadata
  ): SVGMetadataElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.path
  ): SVGPathElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.pattern
  ): SVGPatternElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.polygon
  ): SVGPolygonElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.polyline
  ): SVGPolylineElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.radialGradient
  ): SVGRadialGradientElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.rect
  ): SVGRectElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.script
  ): SVGScriptElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.stop
  ): SVGStopElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.style
  ): SVGStyleElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.svg
  ): SVGSVGElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.switch
  ): SVGSwitchElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.symbol
  ): SVGSymbolElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.text
  ): SVGTextElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textContent
  ): SVGTextContentElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textPath
  ): SVGTextPathElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textPositioning
  ): SVGTextPositioningElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.title
  ): SVGTitleElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tspan
  ): SVGTSpanElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.use
  ): SVGUseElement = js.native
  def createElementNS(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.view
  ): SVGViewElement = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(namespace: java.lang.String, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  def createElementNS(namespace: scala.Null, qualifiedName: java.lang.String, options: java.lang.String): Element = js.native
  /**
    * Returns an element with namespace namespace. Its namespace prefix will be everything before ":" (U+003E) in qualifiedName or null. Its local name will be everything after
    * ":" (U+003E) in qualifiedName or qualifiedName.
    * If localName does not match the Name production an
    * "InvalidCharacterError" DOMException will be thrown.
    * If one of the following conditions is true a "NamespaceError" DOMException will be thrown:
    * localName does not match the QName production.
    * Namespace prefix is not null and namespace is the empty string.
    * Namespace prefix is "xml" and namespace is not the XML namespace.
    * qualifiedName or namespace prefix is "xmlns" and namespace is not the XMLNS namespace.
    * namespace is the XMLNS namespace and
    * neither qualifiedName nor namespace prefix is "xmlns".
    * When supplied, options's is can be used to create a customized built-in element.
    */
  @JSName("createElementNS")
  def `createElementNS_http://wwww3org/1999/xhtml`(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    qualifiedName: java.lang.String
  ): HTMLElement = js.native
  @JSName("createElementNS")
  def `createElementNS_http://wwww3org/2000/svg`(
    namespaceURI: atSindresorhusIsLib.atSindresorhusIsLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: java.lang.String
  ): SVGElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_a(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.a): HTMLAnchorElement = js.native
  @JSName("createElement")
  def createElement_a(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.a, options: ElementCreationOptions): HTMLAnchorElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_abbr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.abbr): HTMLElement = js.native
  @JSName("createElement")
  def createElement_abbr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.abbr, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_address(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.address): HTMLElement = js.native
  @JSName("createElement")
  def createElement_address(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.address, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_applet(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.applet): HTMLAppletElement = js.native
  @JSName("createElement")
  def createElement_applet(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.applet, options: ElementCreationOptions): HTMLAppletElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_area(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.area): HTMLAreaElement = js.native
  @JSName("createElement")
  def createElement_area(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.area, options: ElementCreationOptions): HTMLAreaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_article(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.article): HTMLElement = js.native
  @JSName("createElement")
  def createElement_article(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.article, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_aside(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.aside): HTMLElement = js.native
  @JSName("createElement")
  def createElement_aside(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.aside, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_audio(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.audio): HTMLAudioElement = js.native
  @JSName("createElement")
  def createElement_audio(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.audio, options: ElementCreationOptions): HTMLAudioElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_b(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.b): HTMLElement = js.native
  @JSName("createElement")
  def createElement_b(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.b, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_base(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.base): HTMLBaseElement = js.native
  @JSName("createElement")
  def createElement_base(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.base, options: ElementCreationOptions): HTMLBaseElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_basefont(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.basefont): HTMLBaseFontElement = js.native
  @JSName("createElement")
  def createElement_basefont(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.basefont, options: ElementCreationOptions): HTMLBaseFontElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_bdo(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.bdo): HTMLElement = js.native
  @JSName("createElement")
  def createElement_bdo(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.bdo, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_blockquote(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.blockquote): HTMLQuoteElement = js.native
  @JSName("createElement")
  def createElement_blockquote(
    tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.blockquote,
    options: ElementCreationOptions
  ): HTMLQuoteElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_body(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.body): HTMLBodyElement = js.native
  @JSName("createElement")
  def createElement_body(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.body, options: ElementCreationOptions): HTMLBodyElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_br(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.br): HTMLBRElement = js.native
  @JSName("createElement")
  def createElement_br(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.br, options: ElementCreationOptions): HTMLBRElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_button(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.button): HTMLButtonElement = js.native
  @JSName("createElement")
  def createElement_button(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.button, options: ElementCreationOptions): HTMLButtonElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_canvas(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.canvas): HTMLCanvasElement = js.native
  @JSName("createElement")
  def createElement_canvas(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.canvas, options: ElementCreationOptions): HTMLCanvasElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_caption(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.caption): HTMLTableCaptionElement = js.native
  @JSName("createElement")
  def createElement_caption(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.caption, options: ElementCreationOptions): HTMLTableCaptionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_cite(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.cite): HTMLElement = js.native
  @JSName("createElement")
  def createElement_cite(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.cite, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_code(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.code): HTMLElement = js.native
  @JSName("createElement")
  def createElement_code(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.code, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_col(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.col): HTMLTableColElement = js.native
  @JSName("createElement")
  def createElement_col(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.col, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_colgroup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.colgroup): HTMLTableColElement = js.native
  @JSName("createElement")
  def createElement_colgroup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.colgroup, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_data(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.data): HTMLDataElement = js.native
  @JSName("createElement")
  def createElement_data(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.data, options: ElementCreationOptions): HTMLDataElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_datalist(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.datalist): HTMLDataListElement = js.native
  @JSName("createElement")
  def createElement_datalist(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.datalist, options: ElementCreationOptions): HTMLDataListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dd(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dd): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dd(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dd, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_del(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.del): HTMLModElement = js.native
  @JSName("createElement")
  def createElement_del(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.del, options: ElementCreationOptions): HTMLModElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_details(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.details): HTMLDetailsElement = js.native
  @JSName("createElement")
  def createElement_details(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.details, options: ElementCreationOptions): HTMLDetailsElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dfn(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dfn): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dfn(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dfn, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dialog(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dialog): HTMLDialogElement = js.native
  @JSName("createElement")
  def createElement_dialog(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dialog, options: ElementCreationOptions): HTMLDialogElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dir(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dir): HTMLDirectoryElement = js.native
  @JSName("createElement")
  def createElement_dir(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dir, options: ElementCreationOptions): HTMLDirectoryElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_div(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.div): HTMLDivElement = js.native
  @JSName("createElement")
  def createElement_div(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.div, options: ElementCreationOptions): HTMLDivElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dl(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dl): HTMLDListElement = js.native
  @JSName("createElement")
  def createElement_dl(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dl, options: ElementCreationOptions): HTMLDListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_dt(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dt): HTMLElement = js.native
  @JSName("createElement")
  def createElement_dt(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dt, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_em(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.em): HTMLElement = js.native
  @JSName("createElement")
  def createElement_em(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.em, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_embed(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.embed): HTMLEmbedElement = js.native
  @JSName("createElement")
  def createElement_embed(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.embed, options: ElementCreationOptions): HTMLEmbedElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_fieldset(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.fieldset): HTMLFieldSetElement = js.native
  @JSName("createElement")
  def createElement_fieldset(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.fieldset, options: ElementCreationOptions): HTMLFieldSetElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_figcaption(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figcaption): HTMLElement = js.native
  @JSName("createElement")
  def createElement_figcaption(
    tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figcaption,
    options: ElementCreationOptions
  ): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_figure(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figure): HTMLElement = js.native
  @JSName("createElement")
  def createElement_figure(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figure, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_font(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.font): HTMLFontElement = js.native
  @JSName("createElement")
  def createElement_font(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.font, options: ElementCreationOptions): HTMLFontElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_footer(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.footer): HTMLElement = js.native
  @JSName("createElement")
  def createElement_footer(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.footer, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_form(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.form): HTMLFormElement = js.native
  @JSName("createElement")
  def createElement_form(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.form, options: ElementCreationOptions): HTMLFormElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_frame(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frame): HTMLFrameElement = js.native
  @JSName("createElement")
  def createElement_frame(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frame, options: ElementCreationOptions): HTMLFrameElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_frameset(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frameset): HTMLFrameSetElement = js.native
  @JSName("createElement")
  def createElement_frameset(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frameset, options: ElementCreationOptions): HTMLFrameSetElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h1(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h1): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h1(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h1, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h2(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h2): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h2(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h2, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h3(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h3): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h3(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h3, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h4(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h4): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h4(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h4, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h5(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h5): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h5(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h5, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_h6(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h6): HTMLHeadingElement = js.native
  @JSName("createElement")
  def createElement_h6(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h6, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_head(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.head): HTMLHeadElement = js.native
  @JSName("createElement")
  def createElement_head(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.head, options: ElementCreationOptions): HTMLHeadElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_header(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.header): HTMLElement = js.native
  @JSName("createElement")
  def createElement_header(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.header, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_hgroup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hgroup): HTMLElement = js.native
  @JSName("createElement")
  def createElement_hgroup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hgroup, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_hr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hr): HTMLHRElement = js.native
  @JSName("createElement")
  def createElement_hr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hr, options: ElementCreationOptions): HTMLHRElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_html(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.html): HTMLHtmlElement = js.native
  @JSName("createElement")
  def createElement_html(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.html, options: ElementCreationOptions): HTMLHtmlElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_i(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.i): HTMLElement = js.native
  @JSName("createElement")
  def createElement_i(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.i, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_iframe(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.iframe): HTMLIFrameElement = js.native
  @JSName("createElement")
  def createElement_iframe(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.iframe, options: ElementCreationOptions): HTMLIFrameElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_img(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.img): HTMLImageElement = js.native
  @JSName("createElement")
  def createElement_img(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.img, options: ElementCreationOptions): HTMLImageElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_input(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.input): HTMLInputElement = js.native
  @JSName("createElement")
  def createElement_input(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.input, options: ElementCreationOptions): HTMLInputElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ins(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ins): HTMLModElement = js.native
  @JSName("createElement")
  def createElement_ins(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ins, options: ElementCreationOptions): HTMLModElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_kbd(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.kbd): HTMLElement = js.native
  @JSName("createElement")
  def createElement_kbd(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.kbd, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_label(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.label): HTMLLabelElement = js.native
  @JSName("createElement")
  def createElement_label(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.label, options: ElementCreationOptions): HTMLLabelElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_legend(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.legend): HTMLLegendElement = js.native
  @JSName("createElement")
  def createElement_legend(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.legend, options: ElementCreationOptions): HTMLLegendElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_li(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.li): HTMLLIElement = js.native
  @JSName("createElement")
  def createElement_li(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.li, options: ElementCreationOptions): HTMLLIElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_link(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.link): HTMLLinkElement = js.native
  @JSName("createElement")
  def createElement_link(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.link, options: ElementCreationOptions): HTMLLinkElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_listing(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.listing): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_listing(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.listing, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_map(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.map): HTMLMapElement = js.native
  @JSName("createElement")
  def createElement_map(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.map, options: ElementCreationOptions): HTMLMapElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_mark(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.mark): HTMLElement = js.native
  @JSName("createElement")
  def createElement_mark(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.mark, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_marquee(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.marquee): HTMLMarqueeElement = js.native
  @JSName("createElement")
  def createElement_marquee(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.marquee, options: ElementCreationOptions): HTMLMarqueeElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_menu(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.menu): HTMLMenuElement = js.native
  @JSName("createElement")
  def createElement_menu(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.menu, options: ElementCreationOptions): HTMLMenuElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_meta(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meta): HTMLMetaElement = js.native
  @JSName("createElement")
  def createElement_meta(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meta, options: ElementCreationOptions): HTMLMetaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_meter(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meter): HTMLMeterElement = js.native
  @JSName("createElement")
  def createElement_meter(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meter, options: ElementCreationOptions): HTMLMeterElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_nav(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.nav): HTMLElement = js.native
  @JSName("createElement")
  def createElement_nav(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.nav, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_noscript(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.noscript): HTMLElement = js.native
  @JSName("createElement")
  def createElement_noscript(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.noscript, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_object(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`object`): HTMLObjectElement = js.native
  @JSName("createElement")
  def createElement_object(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`object`, options: ElementCreationOptions): HTMLObjectElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ol(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ol): HTMLOListElement = js.native
  @JSName("createElement")
  def createElement_ol(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ol, options: ElementCreationOptions): HTMLOListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_optgroup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.optgroup): HTMLOptGroupElement = js.native
  @JSName("createElement")
  def createElement_optgroup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.optgroup, options: ElementCreationOptions): HTMLOptGroupElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_option(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.option): HTMLOptionElement = js.native
  @JSName("createElement")
  def createElement_option(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.option, options: ElementCreationOptions): HTMLOptionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_output(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.output): HTMLOutputElement = js.native
  @JSName("createElement")
  def createElement_output(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.output, options: ElementCreationOptions): HTMLOutputElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_p(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.p): HTMLParagraphElement = js.native
  @JSName("createElement")
  def createElement_p(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.p, options: ElementCreationOptions): HTMLParagraphElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_param(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.param): HTMLParamElement = js.native
  @JSName("createElement")
  def createElement_param(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.param, options: ElementCreationOptions): HTMLParamElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_picture(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.picture): HTMLPictureElement = js.native
  @JSName("createElement")
  def createElement_picture(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.picture, options: ElementCreationOptions): HTMLPictureElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_pre(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.pre): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_pre(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.pre, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_progress(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress): HTMLProgressElement = js.native
  @JSName("createElement")
  def createElement_progress(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress, options: ElementCreationOptions): HTMLProgressElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_q(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.q): HTMLQuoteElement = js.native
  @JSName("createElement")
  def createElement_q(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.q, options: ElementCreationOptions): HTMLQuoteElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_rt(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.rt): HTMLElement = js.native
  @JSName("createElement")
  def createElement_rt(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.rt, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ruby(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ruby): HTMLElement = js.native
  @JSName("createElement")
  def createElement_ruby(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ruby, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_s(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.s): HTMLElement = js.native
  @JSName("createElement")
  def createElement_s(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.s, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_samp(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.samp): HTMLElement = js.native
  @JSName("createElement")
  def createElement_samp(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.samp, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_script(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.script): HTMLScriptElement = js.native
  @JSName("createElement")
  def createElement_script(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.script, options: ElementCreationOptions): HTMLScriptElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_section(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.section): HTMLElement = js.native
  @JSName("createElement")
  def createElement_section(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.section, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_select(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.select): HTMLSelectElement = js.native
  @JSName("createElement")
  def createElement_select(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.select, options: ElementCreationOptions): HTMLSelectElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_slot(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.slot): HTMLSlotElement = js.native
  @JSName("createElement")
  def createElement_slot(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.slot, options: ElementCreationOptions): HTMLSlotElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_small(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.small): HTMLElement = js.native
  @JSName("createElement")
  def createElement_small(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.small, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_source(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.source): HTMLSourceElement = js.native
  @JSName("createElement")
  def createElement_source(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.source, options: ElementCreationOptions): HTMLSourceElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_span(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.span): HTMLSpanElement = js.native
  @JSName("createElement")
  def createElement_span(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.span, options: ElementCreationOptions): HTMLSpanElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_strong(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.strong): HTMLElement = js.native
  @JSName("createElement")
  def createElement_strong(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.strong, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_style(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.style): HTMLStyleElement = js.native
  @JSName("createElement")
  def createElement_style(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.style, options: ElementCreationOptions): HTMLStyleElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_sub(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sub): HTMLElement = js.native
  @JSName("createElement")
  def createElement_sub(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sub, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_sup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sup): HTMLElement = js.native
  @JSName("createElement")
  def createElement_sup(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sup, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_table(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.table): HTMLTableElement = js.native
  @JSName("createElement")
  def createElement_table(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.table, options: ElementCreationOptions): HTMLTableElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tbody(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tbody): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_tbody(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tbody, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_td(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.td): HTMLTableDataCellElement = js.native
  @JSName("createElement")
  def createElement_td(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.td, options: ElementCreationOptions): HTMLTableDataCellElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_template(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.template): HTMLTemplateElement = js.native
  @JSName("createElement")
  def createElement_template(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.template, options: ElementCreationOptions): HTMLTemplateElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_textarea(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textarea): HTMLTextAreaElement = js.native
  @JSName("createElement")
  def createElement_textarea(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textarea, options: ElementCreationOptions): HTMLTextAreaElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tfoot(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tfoot): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_tfoot(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tfoot, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_th(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.th): HTMLTableHeaderCellElement = js.native
  @JSName("createElement")
  def createElement_th(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.th, options: ElementCreationOptions): HTMLTableHeaderCellElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_thead(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.thead): HTMLTableSectionElement = js.native
  @JSName("createElement")
  def createElement_thead(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.thead, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_time(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.time): HTMLTimeElement = js.native
  @JSName("createElement")
  def createElement_time(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.time, options: ElementCreationOptions): HTMLTimeElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_title(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.title): HTMLTitleElement = js.native
  @JSName("createElement")
  def createElement_title(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.title, options: ElementCreationOptions): HTMLTitleElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_tr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tr): HTMLTableRowElement = js.native
  @JSName("createElement")
  def createElement_tr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tr, options: ElementCreationOptions): HTMLTableRowElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_track(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.track): HTMLTrackElement = js.native
  @JSName("createElement")
  def createElement_track(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.track, options: ElementCreationOptions): HTMLTrackElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_u(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.u): HTMLElement = js.native
  @JSName("createElement")
  def createElement_u(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.u, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_ul(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ul): HTMLUListElement = js.native
  @JSName("createElement")
  def createElement_ul(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ul, options: ElementCreationOptions): HTMLUListElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_var(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`var`): HTMLElement = js.native
  @JSName("createElement")
  def createElement_var(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`var`, options: ElementCreationOptions): HTMLElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_video(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.video): HTMLVideoElement = js.native
  @JSName("createElement")
  def createElement_video(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.video, options: ElementCreationOptions): HTMLVideoElement = js.native
  /**
    * Creates an instance of the element for the specified tag.
    * @param tagName The name of an element.
    */
  @JSName("createElement")
  def createElement_wbr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.wbr): HTMLElement = js.native
  @JSName("createElement")
  def createElement_wbr(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.wbr, options: ElementCreationOptions): HTMLElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_xmp(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.xmp): HTMLPreElement = js.native
  @JSName("createElement")
  def createElement_xmp(tagName: atSindresorhusIsLib.atSindresorhusIsLibStrings.xmp, options: ElementCreationOptions): HTMLPreElement = js.native
  def createEvent(eventInterface: java.lang.String): Event = js.native
  @JSName("createEvent")
  def createEvent_AnimationEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.AnimationEvent): AnimationEvent = js.native
  @JSName("createEvent")
  def createEvent_AnimationPlaybackEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.AnimationPlaybackEvent): AnimationPlaybackEvent = js.native
  @JSName("createEvent")
  def createEvent_AudioProcessingEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.AudioProcessingEvent): AudioProcessingEvent = js.native
  @JSName("createEvent")
  def createEvent_BeforeUnloadEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.BeforeUnloadEvent): BeforeUnloadEvent = js.native
  @JSName("createEvent")
  def createEvent_ClipboardEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.ClipboardEvent): ClipboardEvent = js.native
  @JSName("createEvent")
  def createEvent_CloseEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.CloseEvent): CloseEvent = js.native
  @JSName("createEvent")
  def createEvent_CompositionEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.CompositionEvent): CompositionEvent = js.native
  @JSName("createEvent")
  def createEvent_CustomEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.CustomEvent): CustomEvent[_] = js.native
  @JSName("createEvent")
  def createEvent_DeviceLightEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.DeviceLightEvent): DeviceLightEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceMotionEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.DeviceMotionEvent): DeviceMotionEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceOrientationEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.DeviceOrientationEvent): DeviceOrientationEvent = js.native
  @JSName("createEvent")
  def createEvent_DragEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.DragEvent): DragEvent = js.native
  @JSName("createEvent")
  def createEvent_ErrorEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.ErrorEvent): ErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_Event(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.Event): Event = js.native
  @JSName("createEvent")
  def createEvent_Events(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.Events): Event = js.native
  @JSName("createEvent")
  def createEvent_FocusEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.FocusEvent): FocusEvent = js.native
  @JSName("createEvent")
  def createEvent_FocusNavigationEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.FocusNavigationEvent): FocusNavigationEvent = js.native
  @JSName("createEvent")
  def createEvent_GamepadEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.GamepadEvent): GamepadEvent = js.native
  @JSName("createEvent")
  def createEvent_HashChangeEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.HashChangeEvent): HashChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_IDBVersionChangeEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.IDBVersionChangeEvent): IDBVersionChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_KeyboardEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.KeyboardEvent): KeyboardEvent = js.native
  @JSName("createEvent")
  def createEvent_ListeningStateChangedEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.ListeningStateChangedEvent): ListeningStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_MSGestureEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSGestureEvent): MSGestureEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyMessageEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSMediaKeyMessageEvent): MSMediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyNeededEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSMediaKeyNeededEvent): MSMediaKeyNeededEvent = js.native
  @JSName("createEvent")
  def createEvent_MSPointerEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MSPointerEvent): MSPointerEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaEncryptedEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MediaEncryptedEvent): MediaEncryptedEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaKeyMessageEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MediaKeyMessageEvent): MediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaQueryListEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MediaQueryListEvent): MediaQueryListEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamErrorEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MediaStreamErrorEvent): MediaStreamErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MediaStreamEvent): MediaStreamEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamTrackEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MediaStreamTrackEvent): MediaStreamTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_MessageEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MessageEvent): MessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MouseEvent): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvents(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MouseEvents): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MutationEvent): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvents(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.MutationEvents): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_OfflineAudioCompletionEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.OfflineAudioCompletionEvent): OfflineAudioCompletionEvent = js.native
  @JSName("createEvent")
  def createEvent_OverflowEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.OverflowEvent): OverflowEvent = js.native
  @JSName("createEvent")
  def createEvent_PageTransitionEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.PageTransitionEvent): PageTransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_PaymentRequestUpdateEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.PaymentRequestUpdateEvent): PaymentRequestUpdateEvent = js.native
  @JSName("createEvent")
  def createEvent_PermissionRequestedEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.PermissionRequestedEvent): PermissionRequestedEvent = js.native
  @JSName("createEvent")
  def createEvent_PointerEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.PointerEvent): PointerEvent = js.native
  @JSName("createEvent")
  def createEvent_PopStateEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.PopStateEvent): PopStateEvent = js.native
  @JSName("createEvent")
  def createEvent_ProgressEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.ProgressEvent): ProgressEvent = js.native
  @JSName("createEvent")
  def createEvent_PromiseRejectionEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.PromiseRejectionEvent): PromiseRejectionEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDTMFToneChangeEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCDTMFToneChangeEvent): RTCDTMFToneChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDataChannelEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCDataChannelEvent): RTCDataChannelEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDtlsTransportStateChangedEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCDtlsTransportStateChangedEvent): RTCDtlsTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCErrorEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCErrorEvent): RTCErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceCandidatePairChangedEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCIceCandidatePairChangedEvent): RTCIceCandidatePairChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceGathererEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCIceGathererEvent): RTCIceGathererEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceTransportStateChangedEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCIceTransportStateChangedEvent): RTCIceTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceErrorEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCPeerConnectionIceErrorEvent): RTCPeerConnectionIceErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCPeerConnectionIceEvent): RTCPeerConnectionIceEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCSsrcConflictEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCSsrcConflictEvent): RTCSsrcConflictEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCStatsEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCStatsEvent): RTCStatsEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCTrackEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.RTCTrackEvent): RTCTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.SVGZoomEvent): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvents(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.SVGZoomEvents): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SecurityPolicyViolationEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.SecurityPolicyViolationEvent): SecurityPolicyViolationEvent = js.native
  @JSName("createEvent")
  def createEvent_ServiceWorkerMessageEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.ServiceWorkerMessageEvent): ServiceWorkerMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionError(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.SpeechRecognitionError): SpeechRecognitionError = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.SpeechRecognitionEvent): SpeechRecognitionEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisErrorEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.SpeechSynthesisErrorEvent): SpeechSynthesisErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.SpeechSynthesisEvent): SpeechSynthesisEvent = js.native
  @JSName("createEvent")
  def createEvent_StorageEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.StorageEvent): StorageEvent = js.native
  @JSName("createEvent")
  def createEvent_TextEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.TextEvent): TextEvent = js.native
  @JSName("createEvent")
  def createEvent_TouchEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.TouchEvent): TouchEvent = js.native
  @JSName("createEvent")
  def createEvent_TrackEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.TrackEvent): TrackEvent = js.native
  @JSName("createEvent")
  def createEvent_TransitionEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.TransitionEvent): TransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.UIEvent): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvents(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.UIEvents): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_VRDisplayEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.VRDisplayEvent): VRDisplayEvent = js.native
  @JSName("createEvent")
  def `createEvent_VRDisplayEvent `(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.`VRDisplayEvent `): VRDisplayEvent = js.native
  @JSName("createEvent")
  def createEvent_WebGLContextEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.WebGLContextEvent): WebGLContextEvent = js.native
  @JSName("createEvent")
  def createEvent_WheelEvent(eventInterface: atSindresorhusIsLib.atSindresorhusIsLibStrings.WheelEvent): WheelEvent = js.native
  /**
    * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list
    * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
    * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
    */
  def createNodeIterator(root: Node): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: scala.Double): NodeIterator = js.native
  def createNodeIterator(root: Node, whatToShow: scala.Double, filter: NodeFilter): NodeIterator = js.native
  /**
    * Returns a ProcessingInstruction node whose target is target and data is data.
    * If target does not match the Name production an
    * "InvalidCharacterError" DOMException will be thrown.
    * If data contains "?>" an
    * "InvalidCharacterError" DOMException will be thrown.
    */
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): ProcessingInstruction = js.native
  /**
    *  Returns an empty range object that has both of its boundary points positioned at the beginning of the document.
    */
  def createRange(): Range = js.native
  /**
    * Creates a text string from the specified value.
    * @param data String that specifies the nodeValue property of the text node.
    */
  def createTextNode(data: java.lang.String): Text = js.native
  def createTouch(
    view: WindowProxy,
    target: EventTarget,
    identifier: scala.Double,
    pageX: scala.Double,
    pageY: scala.Double,
    screenX: scala.Double,
    screenY: scala.Double
  ): Touch = js.native
  def createTouchList(touches: Touch*): TouchList = js.native
  /**
    * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
    * @param filter A custom NodeFilter function to use.
    * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
    */
  def createTreeWalker(root: Node): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: scala.Null, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double
  ): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: js.Function1[/* prefix */ java.lang.String, java.lang.String | scala.Null],
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: scala.Null, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: scala.Null,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  /**
    * Executes a command on the current document, current selection, or the given range.
    * @param commandId String that specifies the command to execute. This command can be any of the command identifiers that can be executed in script.
    * @param showUI Display the user interface, defaults to false.
    * @param value Value to assign.
    */
  def execCommand(commandId: java.lang.String): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean, value: java.lang.String): scala.Boolean = js.native
  /**
    * Stops document's fullscreen element from being displayed fullscreen and
    * resolves promise when done.
    */
  def exitFullscreen(): Promise[scala.Unit] = js.native
  def getAnimations(): Array[Animation] = js.native
  /**
    * collection = element . getElementsByClassName(classNames)
    */
  def getElementsByClassName(classNames: java.lang.String): HTMLCollectionOf[Element] = js.native
  /**
    * Gets a collection of objects based on the value of the NAME or ID attribute.
    * @param elementName Gets a collection of objects based on the value of the NAME or ID attribute.
    */
  def getElementsByName(elementName: java.lang.String): NodeListOf[HTMLElement] = js.native
  def getElementsByTagName(qualifiedName: java.lang.String): HTMLCollectionOf[Element] = js.native
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localName: java.lang.String): HTMLCollectionOf[Element] = js.native
  /**
    * If namespace and localName are
    * "*" returns a HTMLCollection of all descendant elements.
    * If only namespace is "*" returns a HTMLCollection of all descendant elements whose local name is localName.
    * If only localName is "*" returns a HTMLCollection of all descendant elements whose namespace is namespace.
    * Otherwise, returns a HTMLCollection of all descendant elements whose namespace is namespace and local name is localName.
    */
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
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
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
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  /**
    * Retrieves a collection of objects based on the specified element name.
    * @param name Specifies the name of an element.
    */
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: atSindresorhusIsLib.atSindresorhusIsLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
    * Gets a value indicating whether the object currently has focus.
    */
  def hasFocus(): scala.Boolean = js.native
  def importNode[T /* <: Node */](importedNode: T, deep: scala.Boolean): T = js.native
  /**
    * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
    * @param url Specifies a MIME type for the document.
    * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
    * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
    * @param replace Specifies whether the existing entry for the document is replaced in the history list.
    */
  def open(): Document = js.native
  def open(url: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String): Document = js.native
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String, replace: scala.Boolean): Document = js.native
  /**
    * Returns a Boolean value that indicates whether a specified command can be successfully executed using execCommand, given the current state of the document.
    * @param commandId Specifies a command identifier.
    */
  def queryCommandEnabled(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether the specified command is in the indeterminate state.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandIndeterm(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates the current state of the command.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandState(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns a Boolean value that indicates whether the current command is supported on the current range.
    * @param commandId Specifies a command identifier.
    */
  def queryCommandSupported(commandId: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the current value of the document, range, or current selection for the given command.
    * @param commandId String that specifies a command identifier.
    */
  def queryCommandValue(commandId: java.lang.String): java.lang.String = js.native
  /** @deprecated */
  def releaseEvents(): scala.Unit = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
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
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Writes one or more HTML expressions to a document in the specified window.
    * @param content Specifies the text and HTML tags to write.
    */
  def write(text: java.lang.String*): scala.Unit = js.native
  /**
    * Writes one or more HTML expressions, followed by a carriage return, to a document in the specified window.
    * @param content The text and HTML tags to write.
    */
  def writeln(text: java.lang.String*): scala.Unit = js.native
}

@JSGlobal("Document")
@js.native
object Document
  extends org.scalablytyped.runtime.Instantiable0[Document]

