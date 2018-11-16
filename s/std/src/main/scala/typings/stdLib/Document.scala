package typings
package stdLib

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
  val documentElement: HTMLElement | scala.Null = js.native
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
  val head: HTMLHeadElement | scala.Null = js.native
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
  var location: Location | scala.Null = js.native
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
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_fullscreenchange(
    `type`: stdLib.stdLibStrings.fullscreenchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_fullscreenerror(
    `type`: stdLib.stdLibStrings.fullscreenerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: stdLib.stdLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: stdLib.stdLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Returns an object representing the current selection of the document that is loaded into the object displaying a webpage.
       */
  @JSName("addEventListener")
  def addEventListener_visibilitychange(
    `type`: stdLib.stdLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Moves node from another document and returns it.
       * If node is a document, throws a "NotSupportedError" DOMException or, if node is a shadow root, throws a
       * "HierarchyRequestError" DOMException.
       */
  def adoptNode[T /* <: Node */](source: T): T = js.native
  /** @deprecated */
  def captureEvents(): scala.Unit = js.native
  def caretPositionFromPoint(x: scala.Double, y: scala.Double): CaretPosition | scala.Null = js.native
  def caretRangeFromPoint(x: scala.Double, y: scala.Double): Range = js.native
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
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: java.lang.String, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String): Element = js.native
  def createElementNS(namespaceURI: scala.Null, qualifiedName: java.lang.String, options: ElementCreationOptions): Element = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.a
  ): SVGAElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.circle
  ): SVGCircleElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.clipPath
  ): SVGClipPathElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.componentTransferFunction
  ): SVGComponentTransferFunctionElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.defs
  ): SVGDefsElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.desc
  ): SVGDescElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.ellipse
  ): SVGEllipseElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feBlend
  ): SVGFEBlendElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feColorMatrix
  ): SVGFEColorMatrixElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feComponentTransfer
  ): SVGFEComponentTransferElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feComposite
  ): SVGFECompositeElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feConvolveMatrix
  ): SVGFEConvolveMatrixElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feDiffuseLighting
  ): SVGFEDiffuseLightingElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feDisplacementMap
  ): SVGFEDisplacementMapElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feDistantLight
  ): SVGFEDistantLightElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feFlood
  ): SVGFEFloodElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feFuncA
  ): SVGFEFuncAElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feFuncB
  ): SVGFEFuncBElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feFuncG
  ): SVGFEFuncGElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feFuncR
  ): SVGFEFuncRElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feGaussianBlur
  ): SVGFEGaussianBlurElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feImage
  ): SVGFEImageElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feMerge
  ): SVGFEMergeElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feMergeNode
  ): SVGFEMergeNodeElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feMorphology
  ): SVGFEMorphologyElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feOffset
  ): SVGFEOffsetElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.fePointLight
  ): SVGFEPointLightElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feSpecularLighting
  ): SVGFESpecularLightingElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feSpotLight
  ): SVGFESpotLightElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feTile
  ): SVGFETileElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.feTurbulence
  ): SVGFETurbulenceElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.filter
  ): SVGFilterElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.foreignObject
  ): SVGForeignObjectElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.g
  ): SVGGElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.gradient
  ): SVGGradientElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.image
  ): SVGImageElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.line
  ): SVGLineElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.linearGradient
  ): SVGLinearGradientElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.marker
  ): SVGMarkerElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.mask
  ): SVGMaskElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.metadata
  ): SVGMetadataElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.path
  ): SVGPathElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.pattern
  ): SVGPatternElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.polygon
  ): SVGPolygonElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.polyline
  ): SVGPolylineElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.radialGradient
  ): SVGRadialGradientElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.rect
  ): SVGRectElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.script
  ): SVGScriptElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.stop
  ): SVGStopElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.style
  ): SVGStyleElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.svg
  ): SVGSVGElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.switch
  ): SVGSwitchElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.symbol
  ): SVGSymbolElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.text
  ): SVGTextElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.textContent
  ): SVGTextContentElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.textPath
  ): SVGTextPathElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.textPositioning
  ): SVGTextPositioningElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.title
  ): SVGTitleElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.tspan
  ): SVGTSpanElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.use
  ): SVGUseElement = js.native
  def createElementNS(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: stdLib.stdLibStrings.view
  ): SVGViewElement = js.native
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
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`,
    qualifiedName: java.lang.String
  ): HTMLElement = js.native
  @JSName("createElementNS")
  def `createElementNS_http://wwww3org/2000/svg`(
    namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`,
    qualifiedName: java.lang.String
  ): SVGElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_a(tagName: stdLib.stdLibStrings.a): HTMLAnchorElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_a(tagName: stdLib.stdLibStrings.a, options: ElementCreationOptions): HTMLAnchorElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_abbr(tagName: stdLib.stdLibStrings.abbr): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_abbr(tagName: stdLib.stdLibStrings.abbr, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_address(tagName: stdLib.stdLibStrings.address): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_address(tagName: stdLib.stdLibStrings.address, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_applet(tagName: stdLib.stdLibStrings.applet): HTMLAppletElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_applet(tagName: stdLib.stdLibStrings.applet, options: ElementCreationOptions): HTMLAppletElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_area(tagName: stdLib.stdLibStrings.area): HTMLAreaElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_area(tagName: stdLib.stdLibStrings.area, options: ElementCreationOptions): HTMLAreaElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_article(tagName: stdLib.stdLibStrings.article): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_article(tagName: stdLib.stdLibStrings.article, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_aside(tagName: stdLib.stdLibStrings.aside): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_aside(tagName: stdLib.stdLibStrings.aside, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_audio(tagName: stdLib.stdLibStrings.audio): HTMLAudioElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_audio(tagName: stdLib.stdLibStrings.audio, options: ElementCreationOptions): HTMLAudioElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_b(tagName: stdLib.stdLibStrings.b): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_b(tagName: stdLib.stdLibStrings.b, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_base(tagName: stdLib.stdLibStrings.base): HTMLBaseElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_base(tagName: stdLib.stdLibStrings.base, options: ElementCreationOptions): HTMLBaseElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_basefont(tagName: stdLib.stdLibStrings.basefont): HTMLBaseFontElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_basefont(tagName: stdLib.stdLibStrings.basefont, options: ElementCreationOptions): HTMLBaseFontElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_bdo(tagName: stdLib.stdLibStrings.bdo): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_bdo(tagName: stdLib.stdLibStrings.bdo, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_blockquote(tagName: stdLib.stdLibStrings.blockquote): HTMLQuoteElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_blockquote(tagName: stdLib.stdLibStrings.blockquote, options: ElementCreationOptions): HTMLQuoteElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_body(tagName: stdLib.stdLibStrings.body): HTMLBodyElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_body(tagName: stdLib.stdLibStrings.body, options: ElementCreationOptions): HTMLBodyElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_br(tagName: stdLib.stdLibStrings.br): HTMLBRElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_br(tagName: stdLib.stdLibStrings.br, options: ElementCreationOptions): HTMLBRElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_button(tagName: stdLib.stdLibStrings.button): HTMLButtonElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_button(tagName: stdLib.stdLibStrings.button, options: ElementCreationOptions): HTMLButtonElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_canvas(tagName: stdLib.stdLibStrings.canvas): HTMLCanvasElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_canvas(tagName: stdLib.stdLibStrings.canvas, options: ElementCreationOptions): HTMLCanvasElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_caption(tagName: stdLib.stdLibStrings.caption): HTMLTableCaptionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_caption(tagName: stdLib.stdLibStrings.caption, options: ElementCreationOptions): HTMLTableCaptionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_cite(tagName: stdLib.stdLibStrings.cite): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_cite(tagName: stdLib.stdLibStrings.cite, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_code(tagName: stdLib.stdLibStrings.code): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_code(tagName: stdLib.stdLibStrings.code, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_col(tagName: stdLib.stdLibStrings.col): HTMLTableColElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_col(tagName: stdLib.stdLibStrings.col, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_colgroup(tagName: stdLib.stdLibStrings.colgroup): HTMLTableColElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_colgroup(tagName: stdLib.stdLibStrings.colgroup, options: ElementCreationOptions): HTMLTableColElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_data(tagName: stdLib.stdLibStrings.data): HTMLDataElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_data(tagName: stdLib.stdLibStrings.data, options: ElementCreationOptions): HTMLDataElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_datalist(tagName: stdLib.stdLibStrings.datalist): HTMLDataListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_datalist(tagName: stdLib.stdLibStrings.datalist, options: ElementCreationOptions): HTMLDataListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dd(tagName: stdLib.stdLibStrings.dd): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dd(tagName: stdLib.stdLibStrings.dd, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_del(tagName: stdLib.stdLibStrings.del): HTMLModElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_del(tagName: stdLib.stdLibStrings.del, options: ElementCreationOptions): HTMLModElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_details(tagName: stdLib.stdLibStrings.details): HTMLDetailsElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_details(tagName: stdLib.stdLibStrings.details, options: ElementCreationOptions): HTMLDetailsElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dfn(tagName: stdLib.stdLibStrings.dfn): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dfn(tagName: stdLib.stdLibStrings.dfn, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dialog(tagName: stdLib.stdLibStrings.dialog): HTMLDialogElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dialog(tagName: stdLib.stdLibStrings.dialog, options: ElementCreationOptions): HTMLDialogElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dir(tagName: stdLib.stdLibStrings.dir): HTMLDirectoryElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dir(tagName: stdLib.stdLibStrings.dir, options: ElementCreationOptions): HTMLDirectoryElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_div(tagName: stdLib.stdLibStrings.div): HTMLDivElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_div(tagName: stdLib.stdLibStrings.div, options: ElementCreationOptions): HTMLDivElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dl(tagName: stdLib.stdLibStrings.dl): HTMLDListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dl(tagName: stdLib.stdLibStrings.dl, options: ElementCreationOptions): HTMLDListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dt(tagName: stdLib.stdLibStrings.dt): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_dt(tagName: stdLib.stdLibStrings.dt, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_em(tagName: stdLib.stdLibStrings.em): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_em(tagName: stdLib.stdLibStrings.em, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_embed(tagName: stdLib.stdLibStrings.embed): HTMLEmbedElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_embed(tagName: stdLib.stdLibStrings.embed, options: ElementCreationOptions): HTMLEmbedElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_fieldset(tagName: stdLib.stdLibStrings.fieldset): HTMLFieldSetElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_fieldset(tagName: stdLib.stdLibStrings.fieldset, options: ElementCreationOptions): HTMLFieldSetElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_figcaption(tagName: stdLib.stdLibStrings.figcaption): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_figcaption(tagName: stdLib.stdLibStrings.figcaption, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_figure(tagName: stdLib.stdLibStrings.figure): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_figure(tagName: stdLib.stdLibStrings.figure, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_font(tagName: stdLib.stdLibStrings.font): HTMLFontElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_font(tagName: stdLib.stdLibStrings.font, options: ElementCreationOptions): HTMLFontElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_footer(tagName: stdLib.stdLibStrings.footer): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_footer(tagName: stdLib.stdLibStrings.footer, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_form(tagName: stdLib.stdLibStrings.form): HTMLFormElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_form(tagName: stdLib.stdLibStrings.form, options: ElementCreationOptions): HTMLFormElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_frame(tagName: stdLib.stdLibStrings.frame): HTMLFrameElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_frame(tagName: stdLib.stdLibStrings.frame, options: ElementCreationOptions): HTMLFrameElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_frameset(tagName: stdLib.stdLibStrings.frameset): HTMLFrameSetElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_frameset(tagName: stdLib.stdLibStrings.frameset, options: ElementCreationOptions): HTMLFrameSetElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h1(tagName: stdLib.stdLibStrings.h1): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h1(tagName: stdLib.stdLibStrings.h1, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h2(tagName: stdLib.stdLibStrings.h2): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h2(tagName: stdLib.stdLibStrings.h2, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h3(tagName: stdLib.stdLibStrings.h3): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h3(tagName: stdLib.stdLibStrings.h3, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h4(tagName: stdLib.stdLibStrings.h4): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h4(tagName: stdLib.stdLibStrings.h4, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h5(tagName: stdLib.stdLibStrings.h5): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h5(tagName: stdLib.stdLibStrings.h5, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h6(tagName: stdLib.stdLibStrings.h6): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_h6(tagName: stdLib.stdLibStrings.h6, options: ElementCreationOptions): HTMLHeadingElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_head(tagName: stdLib.stdLibStrings.head): HTMLHeadElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_head(tagName: stdLib.stdLibStrings.head, options: ElementCreationOptions): HTMLHeadElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_header(tagName: stdLib.stdLibStrings.header): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_header(tagName: stdLib.stdLibStrings.header, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_hgroup(tagName: stdLib.stdLibStrings.hgroup): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_hgroup(tagName: stdLib.stdLibStrings.hgroup, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_hr(tagName: stdLib.stdLibStrings.hr): HTMLHRElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_hr(tagName: stdLib.stdLibStrings.hr, options: ElementCreationOptions): HTMLHRElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_html(tagName: stdLib.stdLibStrings.html): HTMLHtmlElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_html(tagName: stdLib.stdLibStrings.html, options: ElementCreationOptions): HTMLHtmlElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_i(tagName: stdLib.stdLibStrings.i): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_i(tagName: stdLib.stdLibStrings.i, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_iframe(tagName: stdLib.stdLibStrings.iframe): HTMLIFrameElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_iframe(tagName: stdLib.stdLibStrings.iframe, options: ElementCreationOptions): HTMLIFrameElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_img(tagName: stdLib.stdLibStrings.img): HTMLImageElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_img(tagName: stdLib.stdLibStrings.img, options: ElementCreationOptions): HTMLImageElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_input(tagName: stdLib.stdLibStrings.input): HTMLInputElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_input(tagName: stdLib.stdLibStrings.input, options: ElementCreationOptions): HTMLInputElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ins(tagName: stdLib.stdLibStrings.ins): HTMLModElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ins(tagName: stdLib.stdLibStrings.ins, options: ElementCreationOptions): HTMLModElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_kbd(tagName: stdLib.stdLibStrings.kbd): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_kbd(tagName: stdLib.stdLibStrings.kbd, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_label(tagName: stdLib.stdLibStrings.label): HTMLLabelElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_label(tagName: stdLib.stdLibStrings.label, options: ElementCreationOptions): HTMLLabelElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_legend(tagName: stdLib.stdLibStrings.legend): HTMLLegendElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_legend(tagName: stdLib.stdLibStrings.legend, options: ElementCreationOptions): HTMLLegendElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_li(tagName: stdLib.stdLibStrings.li): HTMLLIElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_li(tagName: stdLib.stdLibStrings.li, options: ElementCreationOptions): HTMLLIElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_link(tagName: stdLib.stdLibStrings.link): HTMLLinkElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_link(tagName: stdLib.stdLibStrings.link, options: ElementCreationOptions): HTMLLinkElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_listing(tagName: stdLib.stdLibStrings.listing): HTMLPreElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_listing(tagName: stdLib.stdLibStrings.listing, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_map(tagName: stdLib.stdLibStrings.map): HTMLMapElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_map(tagName: stdLib.stdLibStrings.map, options: ElementCreationOptions): HTMLMapElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_mark(tagName: stdLib.stdLibStrings.mark): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_mark(tagName: stdLib.stdLibStrings.mark, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_marquee(tagName: stdLib.stdLibStrings.marquee): HTMLMarqueeElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_marquee(tagName: stdLib.stdLibStrings.marquee, options: ElementCreationOptions): HTMLMarqueeElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_menu(tagName: stdLib.stdLibStrings.menu): HTMLMenuElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_menu(tagName: stdLib.stdLibStrings.menu, options: ElementCreationOptions): HTMLMenuElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_meta(tagName: stdLib.stdLibStrings.meta): HTMLMetaElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_meta(tagName: stdLib.stdLibStrings.meta, options: ElementCreationOptions): HTMLMetaElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_meter(tagName: stdLib.stdLibStrings.meter): HTMLMeterElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_meter(tagName: stdLib.stdLibStrings.meter, options: ElementCreationOptions): HTMLMeterElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_nav(tagName: stdLib.stdLibStrings.nav): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_nav(tagName: stdLib.stdLibStrings.nav, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_noscript(tagName: stdLib.stdLibStrings.noscript): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_noscript(tagName: stdLib.stdLibStrings.noscript, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_object(tagName: stdLib.stdLibStrings.`object`): HTMLObjectElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_object(tagName: stdLib.stdLibStrings.`object`, options: ElementCreationOptions): HTMLObjectElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ol(tagName: stdLib.stdLibStrings.ol): HTMLOListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ol(tagName: stdLib.stdLibStrings.ol, options: ElementCreationOptions): HTMLOListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_optgroup(tagName: stdLib.stdLibStrings.optgroup): HTMLOptGroupElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_optgroup(tagName: stdLib.stdLibStrings.optgroup, options: ElementCreationOptions): HTMLOptGroupElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_option(tagName: stdLib.stdLibStrings.option): HTMLOptionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_option(tagName: stdLib.stdLibStrings.option, options: ElementCreationOptions): HTMLOptionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_output(tagName: stdLib.stdLibStrings.output): HTMLOutputElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_output(tagName: stdLib.stdLibStrings.output, options: ElementCreationOptions): HTMLOutputElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_p(tagName: stdLib.stdLibStrings.p): HTMLParagraphElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_p(tagName: stdLib.stdLibStrings.p, options: ElementCreationOptions): HTMLParagraphElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_param(tagName: stdLib.stdLibStrings.param): HTMLParamElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_param(tagName: stdLib.stdLibStrings.param, options: ElementCreationOptions): HTMLParamElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_picture(tagName: stdLib.stdLibStrings.picture): HTMLPictureElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_picture(tagName: stdLib.stdLibStrings.picture, options: ElementCreationOptions): HTMLPictureElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_pre(tagName: stdLib.stdLibStrings.pre): HTMLPreElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_pre(tagName: stdLib.stdLibStrings.pre, options: ElementCreationOptions): HTMLPreElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_progress(tagName: stdLib.stdLibStrings.progress): HTMLProgressElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_progress(tagName: stdLib.stdLibStrings.progress, options: ElementCreationOptions): HTMLProgressElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_q(tagName: stdLib.stdLibStrings.q): HTMLQuoteElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_q(tagName: stdLib.stdLibStrings.q, options: ElementCreationOptions): HTMLQuoteElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_rt(tagName: stdLib.stdLibStrings.rt): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_rt(tagName: stdLib.stdLibStrings.rt, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ruby(tagName: stdLib.stdLibStrings.ruby): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ruby(tagName: stdLib.stdLibStrings.ruby, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_s(tagName: stdLib.stdLibStrings.s): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_s(tagName: stdLib.stdLibStrings.s, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_samp(tagName: stdLib.stdLibStrings.samp): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_samp(tagName: stdLib.stdLibStrings.samp, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_script(tagName: stdLib.stdLibStrings.script): HTMLScriptElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_script(tagName: stdLib.stdLibStrings.script, options: ElementCreationOptions): HTMLScriptElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_section(tagName: stdLib.stdLibStrings.section): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_section(tagName: stdLib.stdLibStrings.section, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_select(tagName: stdLib.stdLibStrings.select): HTMLSelectElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_select(tagName: stdLib.stdLibStrings.select, options: ElementCreationOptions): HTMLSelectElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_slot(tagName: stdLib.stdLibStrings.slot): HTMLSlotElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_slot(tagName: stdLib.stdLibStrings.slot, options: ElementCreationOptions): HTMLSlotElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_small(tagName: stdLib.stdLibStrings.small): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_small(tagName: stdLib.stdLibStrings.small, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_source(tagName: stdLib.stdLibStrings.source): HTMLSourceElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_source(tagName: stdLib.stdLibStrings.source, options: ElementCreationOptions): HTMLSourceElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_span(tagName: stdLib.stdLibStrings.span): HTMLSpanElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_span(tagName: stdLib.stdLibStrings.span, options: ElementCreationOptions): HTMLSpanElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_strong(tagName: stdLib.stdLibStrings.strong): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_strong(tagName: stdLib.stdLibStrings.strong, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_style(tagName: stdLib.stdLibStrings.style): HTMLStyleElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_style(tagName: stdLib.stdLibStrings.style, options: ElementCreationOptions): HTMLStyleElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_sub(tagName: stdLib.stdLibStrings.sub): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_sub(tagName: stdLib.stdLibStrings.sub, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_sup(tagName: stdLib.stdLibStrings.sup): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_sup(tagName: stdLib.stdLibStrings.sup, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_table(tagName: stdLib.stdLibStrings.table): HTMLTableElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_table(tagName: stdLib.stdLibStrings.table, options: ElementCreationOptions): HTMLTableElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_tbody(tagName: stdLib.stdLibStrings.tbody): HTMLTableSectionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_tbody(tagName: stdLib.stdLibStrings.tbody, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_td(tagName: stdLib.stdLibStrings.td): HTMLTableDataCellElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_td(tagName: stdLib.stdLibStrings.td, options: ElementCreationOptions): HTMLTableDataCellElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_template(tagName: stdLib.stdLibStrings.template): HTMLTemplateElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_template(tagName: stdLib.stdLibStrings.template, options: ElementCreationOptions): HTMLTemplateElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_textarea(tagName: stdLib.stdLibStrings.textarea): HTMLTextAreaElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_textarea(tagName: stdLib.stdLibStrings.textarea, options: ElementCreationOptions): HTMLTextAreaElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_tfoot(tagName: stdLib.stdLibStrings.tfoot): HTMLTableSectionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_tfoot(tagName: stdLib.stdLibStrings.tfoot, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_th(tagName: stdLib.stdLibStrings.th): HTMLTableHeaderCellElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_th(tagName: stdLib.stdLibStrings.th, options: ElementCreationOptions): HTMLTableHeaderCellElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_thead(tagName: stdLib.stdLibStrings.thead): HTMLTableSectionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_thead(tagName: stdLib.stdLibStrings.thead, options: ElementCreationOptions): HTMLTableSectionElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_time(tagName: stdLib.stdLibStrings.time): HTMLTimeElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_time(tagName: stdLib.stdLibStrings.time, options: ElementCreationOptions): HTMLTimeElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_title(tagName: stdLib.stdLibStrings.title): HTMLTitleElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_title(tagName: stdLib.stdLibStrings.title, options: ElementCreationOptions): HTMLTitleElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_tr(tagName: stdLib.stdLibStrings.tr): HTMLTableRowElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_tr(tagName: stdLib.stdLibStrings.tr, options: ElementCreationOptions): HTMLTableRowElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_track(tagName: stdLib.stdLibStrings.track): HTMLTrackElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_track(tagName: stdLib.stdLibStrings.track, options: ElementCreationOptions): HTMLTrackElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_u(tagName: stdLib.stdLibStrings.u): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_u(tagName: stdLib.stdLibStrings.u, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ul(tagName: stdLib.stdLibStrings.ul): HTMLUListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_ul(tagName: stdLib.stdLibStrings.ul, options: ElementCreationOptions): HTMLUListElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_var(tagName: stdLib.stdLibStrings.`var`): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_var(tagName: stdLib.stdLibStrings.`var`, options: ElementCreationOptions): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_video(tagName: stdLib.stdLibStrings.video): HTMLVideoElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_video(tagName: stdLib.stdLibStrings.video, options: ElementCreationOptions): HTMLVideoElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_wbr(tagName: stdLib.stdLibStrings.wbr): HTMLElement = js.native
  /**
       * Creates an instance of the element for the specified tag.
       * @param tagName The name of an element.
       */
  @JSName("createElement")
  def createElement_wbr(tagName: stdLib.stdLibStrings.wbr, options: ElementCreationOptions): HTMLElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_xmp(tagName: stdLib.stdLibStrings.xmp): HTMLPreElement = js.native
  /** @deprecated */
  @JSName("createElement")
  def createElement_xmp(tagName: stdLib.stdLibStrings.xmp, options: ElementCreationOptions): HTMLPreElement = js.native
  def createEvent(eventInterface: java.lang.String): Event = js.native
  @JSName("createEvent")
  def createEvent_AnimationEvent(eventInterface: stdLib.stdLibStrings.AnimationEvent): AnimationEvent = js.native
  @JSName("createEvent")
  def createEvent_AnimationPlaybackEvent(eventInterface: stdLib.stdLibStrings.AnimationPlaybackEvent): AnimationPlaybackEvent = js.native
  @JSName("createEvent")
  def createEvent_AudioProcessingEvent(eventInterface: stdLib.stdLibStrings.AudioProcessingEvent): AudioProcessingEvent = js.native
  @JSName("createEvent")
  def createEvent_BeforeUnloadEvent(eventInterface: stdLib.stdLibStrings.BeforeUnloadEvent): BeforeUnloadEvent = js.native
  @JSName("createEvent")
  def createEvent_ClipboardEvent(eventInterface: stdLib.stdLibStrings.ClipboardEvent): ClipboardEvent = js.native
  @JSName("createEvent")
  def createEvent_CloseEvent(eventInterface: stdLib.stdLibStrings.CloseEvent): CloseEvent = js.native
  @JSName("createEvent")
  def createEvent_CompositionEvent(eventInterface: stdLib.stdLibStrings.CompositionEvent): CompositionEvent = js.native
  @JSName("createEvent")
  def createEvent_CustomEvent(eventInterface: stdLib.stdLibStrings.CustomEvent): CustomEvent[_] = js.native
  @JSName("createEvent")
  def createEvent_DeviceLightEvent(eventInterface: stdLib.stdLibStrings.DeviceLightEvent): DeviceLightEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceMotionEvent(eventInterface: stdLib.stdLibStrings.DeviceMotionEvent): DeviceMotionEvent = js.native
  @JSName("createEvent")
  def createEvent_DeviceOrientationEvent(eventInterface: stdLib.stdLibStrings.DeviceOrientationEvent): DeviceOrientationEvent = js.native
  @JSName("createEvent")
  def createEvent_DragEvent(eventInterface: stdLib.stdLibStrings.DragEvent): DragEvent = js.native
  @JSName("createEvent")
  def createEvent_ErrorEvent(eventInterface: stdLib.stdLibStrings.ErrorEvent): ErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_Event(eventInterface: stdLib.stdLibStrings.Event): Event = js.native
  @JSName("createEvent")
  def createEvent_Events(eventInterface: stdLib.stdLibStrings.Events): Event = js.native
  @JSName("createEvent")
  def createEvent_FocusEvent(eventInterface: stdLib.stdLibStrings.FocusEvent): FocusEvent = js.native
  @JSName("createEvent")
  def createEvent_FocusNavigationEvent(eventInterface: stdLib.stdLibStrings.FocusNavigationEvent): FocusNavigationEvent = js.native
  @JSName("createEvent")
  def createEvent_GamepadEvent(eventInterface: stdLib.stdLibStrings.GamepadEvent): GamepadEvent = js.native
  @JSName("createEvent")
  def createEvent_HashChangeEvent(eventInterface: stdLib.stdLibStrings.HashChangeEvent): HashChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_IDBVersionChangeEvent(eventInterface: stdLib.stdLibStrings.IDBVersionChangeEvent): IDBVersionChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_KeyboardEvent(eventInterface: stdLib.stdLibStrings.KeyboardEvent): KeyboardEvent = js.native
  @JSName("createEvent")
  def createEvent_ListeningStateChangedEvent(eventInterface: stdLib.stdLibStrings.ListeningStateChangedEvent): ListeningStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_MSGestureEvent(eventInterface: stdLib.stdLibStrings.MSGestureEvent): MSGestureEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyMessageEvent(eventInterface: stdLib.stdLibStrings.MSMediaKeyMessageEvent): MSMediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MSMediaKeyNeededEvent(eventInterface: stdLib.stdLibStrings.MSMediaKeyNeededEvent): MSMediaKeyNeededEvent = js.native
  @JSName("createEvent")
  def createEvent_MSPointerEvent(eventInterface: stdLib.stdLibStrings.MSPointerEvent): MSPointerEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaEncryptedEvent(eventInterface: stdLib.stdLibStrings.MediaEncryptedEvent): MediaEncryptedEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaKeyMessageEvent(eventInterface: stdLib.stdLibStrings.MediaKeyMessageEvent): MediaKeyMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaQueryListEvent(eventInterface: stdLib.stdLibStrings.MediaQueryListEvent): MediaQueryListEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamErrorEvent(eventInterface: stdLib.stdLibStrings.MediaStreamErrorEvent): MediaStreamErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamEvent(eventInterface: stdLib.stdLibStrings.MediaStreamEvent): MediaStreamEvent = js.native
  @JSName("createEvent")
  def createEvent_MediaStreamTrackEvent(eventInterface: stdLib.stdLibStrings.MediaStreamTrackEvent): MediaStreamTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_MessageEvent(eventInterface: stdLib.stdLibStrings.MessageEvent): MessageEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvent(eventInterface: stdLib.stdLibStrings.MouseEvent): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MouseEvents(eventInterface: stdLib.stdLibStrings.MouseEvents): MouseEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvent(eventInterface: stdLib.stdLibStrings.MutationEvent): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_MutationEvents(eventInterface: stdLib.stdLibStrings.MutationEvents): MutationEvent = js.native
  @JSName("createEvent")
  def createEvent_OfflineAudioCompletionEvent(eventInterface: stdLib.stdLibStrings.OfflineAudioCompletionEvent): OfflineAudioCompletionEvent = js.native
  @JSName("createEvent")
  def createEvent_OverflowEvent(eventInterface: stdLib.stdLibStrings.OverflowEvent): OverflowEvent = js.native
  @JSName("createEvent")
  def createEvent_PageTransitionEvent(eventInterface: stdLib.stdLibStrings.PageTransitionEvent): PageTransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_PaymentRequestUpdateEvent(eventInterface: stdLib.stdLibStrings.PaymentRequestUpdateEvent): PaymentRequestUpdateEvent = js.native
  @JSName("createEvent")
  def createEvent_PermissionRequestedEvent(eventInterface: stdLib.stdLibStrings.PermissionRequestedEvent): PermissionRequestedEvent = js.native
  @JSName("createEvent")
  def createEvent_PointerEvent(eventInterface: stdLib.stdLibStrings.PointerEvent): PointerEvent = js.native
  @JSName("createEvent")
  def createEvent_PopStateEvent(eventInterface: stdLib.stdLibStrings.PopStateEvent): PopStateEvent = js.native
  @JSName("createEvent")
  def createEvent_ProgressEvent(eventInterface: stdLib.stdLibStrings.ProgressEvent): ProgressEvent = js.native
  @JSName("createEvent")
  def createEvent_PromiseRejectionEvent(eventInterface: stdLib.stdLibStrings.PromiseRejectionEvent): PromiseRejectionEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDTMFToneChangeEvent(eventInterface: stdLib.stdLibStrings.RTCDTMFToneChangeEvent): RTCDTMFToneChangeEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDataChannelEvent(eventInterface: stdLib.stdLibStrings.RTCDataChannelEvent): RTCDataChannelEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCDtlsTransportStateChangedEvent(eventInterface: stdLib.stdLibStrings.RTCDtlsTransportStateChangedEvent): RTCDtlsTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCErrorEvent(eventInterface: stdLib.stdLibStrings.RTCErrorEvent): RTCErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceCandidatePairChangedEvent(eventInterface: stdLib.stdLibStrings.RTCIceCandidatePairChangedEvent): RTCIceCandidatePairChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceGathererEvent(eventInterface: stdLib.stdLibStrings.RTCIceGathererEvent): RTCIceGathererEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCIceTransportStateChangedEvent(eventInterface: stdLib.stdLibStrings.RTCIceTransportStateChangedEvent): RTCIceTransportStateChangedEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceErrorEvent(eventInterface: stdLib.stdLibStrings.RTCPeerConnectionIceErrorEvent): RTCPeerConnectionIceErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCPeerConnectionIceEvent(eventInterface: stdLib.stdLibStrings.RTCPeerConnectionIceEvent): RTCPeerConnectionIceEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCSsrcConflictEvent(eventInterface: stdLib.stdLibStrings.RTCSsrcConflictEvent): RTCSsrcConflictEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCStatsEvent(eventInterface: stdLib.stdLibStrings.RTCStatsEvent): RTCStatsEvent = js.native
  @JSName("createEvent")
  def createEvent_RTCTrackEvent(eventInterface: stdLib.stdLibStrings.RTCTrackEvent): RTCTrackEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvent(eventInterface: stdLib.stdLibStrings.SVGZoomEvent): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SVGZoomEvents(eventInterface: stdLib.stdLibStrings.SVGZoomEvents): SVGZoomEvent = js.native
  @JSName("createEvent")
  def createEvent_SecurityPolicyViolationEvent(eventInterface: stdLib.stdLibStrings.SecurityPolicyViolationEvent): SecurityPolicyViolationEvent = js.native
  @JSName("createEvent")
  def createEvent_ServiceWorkerMessageEvent(eventInterface: stdLib.stdLibStrings.ServiceWorkerMessageEvent): ServiceWorkerMessageEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionError(eventInterface: stdLib.stdLibStrings.SpeechRecognitionError): SpeechRecognitionError = js.native
  @JSName("createEvent")
  def createEvent_SpeechRecognitionEvent(eventInterface: stdLib.stdLibStrings.SpeechRecognitionEvent): SpeechRecognitionEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisErrorEvent(eventInterface: stdLib.stdLibStrings.SpeechSynthesisErrorEvent): SpeechSynthesisErrorEvent = js.native
  @JSName("createEvent")
  def createEvent_SpeechSynthesisEvent(eventInterface: stdLib.stdLibStrings.SpeechSynthesisEvent): SpeechSynthesisEvent = js.native
  @JSName("createEvent")
  def createEvent_StorageEvent(eventInterface: stdLib.stdLibStrings.StorageEvent): StorageEvent = js.native
  @JSName("createEvent")
  def createEvent_TextEvent(eventInterface: stdLib.stdLibStrings.TextEvent): TextEvent = js.native
  @JSName("createEvent")
  def createEvent_TouchEvent(eventInterface: stdLib.stdLibStrings.TouchEvent): TouchEvent = js.native
  @JSName("createEvent")
  def createEvent_TrackEvent(eventInterface: stdLib.stdLibStrings.TrackEvent): TrackEvent = js.native
  @JSName("createEvent")
  def createEvent_TransitionEvent(eventInterface: stdLib.stdLibStrings.TransitionEvent): TransitionEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvent(eventInterface: stdLib.stdLibStrings.UIEvent): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_UIEvents(eventInterface: stdLib.stdLibStrings.UIEvents): UIEvent = js.native
  @JSName("createEvent")
  def createEvent_VRDisplayEvent(eventInterface: stdLib.stdLibStrings.VRDisplayEvent): VRDisplayEvent = js.native
  @JSName("createEvent")
  def `createEvent_VRDisplayEvent `(eventInterface: stdLib.stdLibStrings.`VRDisplayEvent `): VRDisplayEvent = js.native
  @JSName("createEvent")
  def createEvent_WebGLContextEvent(eventInterface: stdLib.stdLibStrings.WebGLContextEvent): WebGLContextEvent = js.native
  @JSName("createEvent")
  def createEvent_WheelEvent(eventInterface: stdLib.stdLibStrings.WheelEvent): WheelEvent = js.native
  /**
       * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
       * @param root The root element or node to start traversing on.
       * @param whatToShow The type of nodes or elements to appear in the node list
       * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
       * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
       */
  def createNodeIterator(root: Node): NodeIterator = js.native
  /**
       * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
       * @param root The root element or node to start traversing on.
       * @param whatToShow The type of nodes or elements to appear in the node list
       * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
       * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
       */
  def createNodeIterator(root: Node, whatToShow: scala.Double): NodeIterator = js.native
  /**
       * Creates a NodeIterator object that you can use to traverse filtered lists of nodes or elements in a document.
       * @param root The root element or node to start traversing on.
       * @param whatToShow The type of nodes or elements to appear in the node list
       * @param filter A custom NodeFilter function to use. For more information, see filter. Use null for no filter.
       * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
       */
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
  /**
       * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
       * @param root The root element or node to start traversing on.
       * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
       * @param filter A custom NodeFilter function to use.
       * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
       */
  def createTreeWalker(root: Node, whatToShow: scala.Double): TreeWalker = js.native
  /**
       * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
       * @param root The root element or node to start traversing on.
       * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
       * @param filter A custom NodeFilter function to use.
       * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
       */
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: scala.Null, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  /**
       * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
       * @param root The root element or node to start traversing on.
       * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
       * @param filter A custom NodeFilter function to use.
       * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
       */
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter): TreeWalker = js.native
  /**
       * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
       * @param root The root element or node to start traversing on.
       * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
       * @param filter A custom NodeFilter function to use.
       * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded.
       */
  def createTreeWalker(root: Node, whatToShow: scala.Double, filter: NodeFilter, entityReferenceExpansion: scala.Boolean): TreeWalker = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: scala.Null, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: scala.Null,
    `type`: scala.Double,
    result: XPathResult
  ): XPathResult = js.native
  def evaluate(expression: java.lang.String, contextNode: Node, resolver: XPathNSResolver, `type`: scala.Double): XPathResult = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: Node,
    resolver: XPathNSResolver,
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
  /**
       * Executes a command on the current document, current selection, or the given range.
       * @param commandId String that specifies the command to execute. This command can be any of the command identifiers that can be executed in script.
       * @param showUI Display the user interface, defaults to false.
       * @param value Value to assign.
       */
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean): scala.Boolean = js.native
  /**
       * Executes a command on the current document, current selection, or the given range.
       * @param commandId String that specifies the command to execute. This command can be any of the command identifiers that can be executed in script.
       * @param showUI Display the user interface, defaults to false.
       * @param value Value to assign.
       */
  def execCommand(commandId: java.lang.String, showUI: scala.Boolean, value: java.lang.String): scala.Boolean = js.native
  /**
       * Stops document's fullscreen element from being displayed fullscreen and
       * resolves promise when done.
       */
  def exitFullscreen(): Promise[scala.Unit] = js.native
  def getAnimations(): js.Array[Animation] = js.native
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
  def `getElementsByTagNameNS_http://wwww3org/1999/xhtml`(namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/1999/xhtml`, localName: java.lang.String): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagNameNS")
  def `getElementsByTagNameNS_http://wwww3org/2000/svg`(namespaceURI: stdLib.stdLibStrings.`http://wwwDOTw3DOTorg/2000/svg`, localName: java.lang.String): HTMLCollectionOf[SVGElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_a(qualifiedName: stdLib.stdLibStrings.a): HTMLCollectionOf[HTMLAnchorElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_abbr(qualifiedName: stdLib.stdLibStrings.abbr): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_address(qualifiedName: stdLib.stdLibStrings.address): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_applet(qualifiedName: stdLib.stdLibStrings.applet): HTMLCollectionOf[HTMLAppletElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_area(qualifiedName: stdLib.stdLibStrings.area): HTMLCollectionOf[HTMLAreaElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_article(qualifiedName: stdLib.stdLibStrings.article): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_aside(qualifiedName: stdLib.stdLibStrings.aside): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_audio(qualifiedName: stdLib.stdLibStrings.audio): HTMLCollectionOf[HTMLAudioElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_b(qualifiedName: stdLib.stdLibStrings.b): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_base(qualifiedName: stdLib.stdLibStrings.base): HTMLCollectionOf[HTMLBaseElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_basefont(qualifiedName: stdLib.stdLibStrings.basefont): HTMLCollectionOf[HTMLBaseFontElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_bdo(qualifiedName: stdLib.stdLibStrings.bdo): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_blockquote(qualifiedName: stdLib.stdLibStrings.blockquote): HTMLCollectionOf[HTMLQuoteElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_body(qualifiedName: stdLib.stdLibStrings.body): HTMLCollectionOf[HTMLBodyElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_br(qualifiedName: stdLib.stdLibStrings.br): HTMLCollectionOf[HTMLBRElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_button(qualifiedName: stdLib.stdLibStrings.button): HTMLCollectionOf[HTMLButtonElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_canvas(qualifiedName: stdLib.stdLibStrings.canvas): HTMLCollectionOf[HTMLCanvasElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_caption(qualifiedName: stdLib.stdLibStrings.caption): HTMLCollectionOf[HTMLTableCaptionElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_circle(qualifiedName: stdLib.stdLibStrings.circle): HTMLCollectionOf[SVGCircleElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_cite(qualifiedName: stdLib.stdLibStrings.cite): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_clipPath(qualifiedName: stdLib.stdLibStrings.clipPath): HTMLCollectionOf[SVGClipPathElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_code(qualifiedName: stdLib.stdLibStrings.code): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_col(qualifiedName: stdLib.stdLibStrings.col): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_colgroup(qualifiedName: stdLib.stdLibStrings.colgroup): HTMLCollectionOf[HTMLTableColElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_data(qualifiedName: stdLib.stdLibStrings.data): HTMLCollectionOf[HTMLDataElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_datalist(qualifiedName: stdLib.stdLibStrings.datalist): HTMLCollectionOf[HTMLDataListElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dd(qualifiedName: stdLib.stdLibStrings.dd): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_defs(qualifiedName: stdLib.stdLibStrings.defs): HTMLCollectionOf[SVGDefsElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_del(qualifiedName: stdLib.stdLibStrings.del): HTMLCollectionOf[HTMLModElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_desc(qualifiedName: stdLib.stdLibStrings.desc): HTMLCollectionOf[SVGDescElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_details(qualifiedName: stdLib.stdLibStrings.details): HTMLCollectionOf[HTMLDetailsElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dfn(qualifiedName: stdLib.stdLibStrings.dfn): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dialog(qualifiedName: stdLib.stdLibStrings.dialog): HTMLCollectionOf[HTMLDialogElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dir(qualifiedName: stdLib.stdLibStrings.dir): HTMLCollectionOf[HTMLDirectoryElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_div(qualifiedName: stdLib.stdLibStrings.div): HTMLCollectionOf[HTMLDivElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dl(qualifiedName: stdLib.stdLibStrings.dl): HTMLCollectionOf[HTMLDListElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_dt(qualifiedName: stdLib.stdLibStrings.dt): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_ellipse(qualifiedName: stdLib.stdLibStrings.ellipse): HTMLCollectionOf[SVGEllipseElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_em(qualifiedName: stdLib.stdLibStrings.em): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
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
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_fieldset(qualifiedName: stdLib.stdLibStrings.fieldset): HTMLCollectionOf[HTMLFieldSetElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figcaption(qualifiedName: stdLib.stdLibStrings.figcaption): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_figure(qualifiedName: stdLib.stdLibStrings.figure): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_filter(qualifiedName: stdLib.stdLibStrings.filter): HTMLCollectionOf[SVGFilterElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_font(qualifiedName: stdLib.stdLibStrings.font): HTMLCollectionOf[HTMLFontElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_footer(qualifiedName: stdLib.stdLibStrings.footer): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_foreignObject(qualifiedName: stdLib.stdLibStrings.foreignObject): HTMLCollectionOf[SVGForeignObjectElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_form(qualifiedName: stdLib.stdLibStrings.form): HTMLCollectionOf[HTMLFormElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frame(qualifiedName: stdLib.stdLibStrings.frame): HTMLCollectionOf[HTMLFrameElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_frameset(qualifiedName: stdLib.stdLibStrings.frameset): HTMLCollectionOf[HTMLFrameSetElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_g(qualifiedName: stdLib.stdLibStrings.g): HTMLCollectionOf[SVGGElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h1(qualifiedName: stdLib.stdLibStrings.h1): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h2(qualifiedName: stdLib.stdLibStrings.h2): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h3(qualifiedName: stdLib.stdLibStrings.h3): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h4(qualifiedName: stdLib.stdLibStrings.h4): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h5(qualifiedName: stdLib.stdLibStrings.h5): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_h6(qualifiedName: stdLib.stdLibStrings.h6): HTMLCollectionOf[HTMLHeadingElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_head(qualifiedName: stdLib.stdLibStrings.head): HTMLCollectionOf[HTMLHeadElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_header(qualifiedName: stdLib.stdLibStrings.header): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hgroup(qualifiedName: stdLib.stdLibStrings.hgroup): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_hr(qualifiedName: stdLib.stdLibStrings.hr): HTMLCollectionOf[HTMLHRElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_html(qualifiedName: stdLib.stdLibStrings.html): HTMLCollectionOf[HTMLHtmlElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_i(qualifiedName: stdLib.stdLibStrings.i): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_iframe(qualifiedName: stdLib.stdLibStrings.iframe): HTMLCollectionOf[HTMLIFrameElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_image(qualifiedName: stdLib.stdLibStrings.image): HTMLCollectionOf[SVGImageElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_img(qualifiedName: stdLib.stdLibStrings.img): HTMLCollectionOf[HTMLImageElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_input(qualifiedName: stdLib.stdLibStrings.input): HTMLCollectionOf[HTMLInputElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ins(qualifiedName: stdLib.stdLibStrings.ins): HTMLCollectionOf[HTMLModElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_kbd(qualifiedName: stdLib.stdLibStrings.kbd): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_label(qualifiedName: stdLib.stdLibStrings.label): HTMLCollectionOf[HTMLLabelElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_legend(qualifiedName: stdLib.stdLibStrings.legend): HTMLCollectionOf[HTMLLegendElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_li(qualifiedName: stdLib.stdLibStrings.li): HTMLCollectionOf[HTMLLIElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_line(qualifiedName: stdLib.stdLibStrings.line): HTMLCollectionOf[SVGLineElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_linearGradient(qualifiedName: stdLib.stdLibStrings.linearGradient): HTMLCollectionOf[SVGLinearGradientElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_link(qualifiedName: stdLib.stdLibStrings.link): HTMLCollectionOf[HTMLLinkElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_map(qualifiedName: stdLib.stdLibStrings.map): HTMLCollectionOf[HTMLMapElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_mark(qualifiedName: stdLib.stdLibStrings.mark): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_marker(qualifiedName: stdLib.stdLibStrings.marker): HTMLCollectionOf[SVGMarkerElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_marquee(qualifiedName: stdLib.stdLibStrings.marquee): HTMLCollectionOf[HTMLMarqueeElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_mask(qualifiedName: stdLib.stdLibStrings.mask): HTMLCollectionOf[SVGMaskElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_menu(qualifiedName: stdLib.stdLibStrings.menu): HTMLCollectionOf[HTMLMenuElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meta(qualifiedName: stdLib.stdLibStrings.meta): HTMLCollectionOf[HTMLMetaElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_metadata(qualifiedName: stdLib.stdLibStrings.metadata): HTMLCollectionOf[SVGMetadataElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_meter(qualifiedName: stdLib.stdLibStrings.meter): HTMLCollectionOf[HTMLMeterElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_nav(qualifiedName: stdLib.stdLibStrings.nav): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_noscript(qualifiedName: stdLib.stdLibStrings.noscript): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_object(qualifiedName: stdLib.stdLibStrings.`object`): HTMLCollectionOf[HTMLObjectElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ol(qualifiedName: stdLib.stdLibStrings.ol): HTMLCollectionOf[HTMLOListElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_optgroup(qualifiedName: stdLib.stdLibStrings.optgroup): HTMLCollectionOf[HTMLOptGroupElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_option(qualifiedName: stdLib.stdLibStrings.option): HTMLCollectionOf[HTMLOptionElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_output(qualifiedName: stdLib.stdLibStrings.output): HTMLCollectionOf[HTMLOutputElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_p(qualifiedName: stdLib.stdLibStrings.p): HTMLCollectionOf[HTMLParagraphElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_param(qualifiedName: stdLib.stdLibStrings.param): HTMLCollectionOf[HTMLParamElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_path(qualifiedName: stdLib.stdLibStrings.path): HTMLCollectionOf[SVGPathElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_pattern(qualifiedName: stdLib.stdLibStrings.pattern): HTMLCollectionOf[SVGPatternElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_picture(qualifiedName: stdLib.stdLibStrings.picture): HTMLCollectionOf[HTMLPictureElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polygon(qualifiedName: stdLib.stdLibStrings.polygon): HTMLCollectionOf[SVGPolygonElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_polyline(qualifiedName: stdLib.stdLibStrings.polyline): HTMLCollectionOf[SVGPolylineElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_pre(qualifiedName: stdLib.stdLibStrings.pre): HTMLCollectionOf[HTMLPreElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_progress(qualifiedName: stdLib.stdLibStrings.progress): HTMLCollectionOf[HTMLProgressElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_q(qualifiedName: stdLib.stdLibStrings.q): HTMLCollectionOf[HTMLQuoteElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_radialGradient(qualifiedName: stdLib.stdLibStrings.radialGradient): HTMLCollectionOf[SVGRadialGradientElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_rect(qualifiedName: stdLib.stdLibStrings.rect): HTMLCollectionOf[SVGRectElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_rt(qualifiedName: stdLib.stdLibStrings.rt): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ruby(qualifiedName: stdLib.stdLibStrings.ruby): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_s(qualifiedName: stdLib.stdLibStrings.s): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_samp(qualifiedName: stdLib.stdLibStrings.samp): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_script(qualifiedName: stdLib.stdLibStrings.script): HTMLCollectionOf[HTMLScriptElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_section(qualifiedName: stdLib.stdLibStrings.section): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_select(qualifiedName: stdLib.stdLibStrings.select): HTMLCollectionOf[HTMLSelectElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_slot(qualifiedName: stdLib.stdLibStrings.slot): HTMLCollectionOf[HTMLSlotElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_small(qualifiedName: stdLib.stdLibStrings.small): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_source(qualifiedName: stdLib.stdLibStrings.source): HTMLCollectionOf[HTMLSourceElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_span(qualifiedName: stdLib.stdLibStrings.span): HTMLCollectionOf[HTMLSpanElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_stop(qualifiedName: stdLib.stdLibStrings.stop): HTMLCollectionOf[SVGStopElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_strong(qualifiedName: stdLib.stdLibStrings.strong): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_style(qualifiedName: stdLib.stdLibStrings.style): HTMLCollectionOf[HTMLStyleElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sub(qualifiedName: stdLib.stdLibStrings.sub): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_sup(qualifiedName: stdLib.stdLibStrings.sup): HTMLCollectionOf[HTMLElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_svg(qualifiedName: stdLib.stdLibStrings.svg): HTMLCollectionOf[SVGSVGElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_switch(qualifiedName: stdLib.stdLibStrings.switch): HTMLCollectionOf[SVGSwitchElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_symbol(qualifiedName: stdLib.stdLibStrings.symbol): HTMLCollectionOf[SVGSymbolElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_table(qualifiedName: stdLib.stdLibStrings.table): HTMLCollectionOf[HTMLTableElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tbody(qualifiedName: stdLib.stdLibStrings.tbody): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_td(qualifiedName: stdLib.stdLibStrings.td): HTMLCollectionOf[HTMLTableDataCellElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_template(qualifiedName: stdLib.stdLibStrings.template): HTMLCollectionOf[HTMLTemplateElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_text(qualifiedName: stdLib.stdLibStrings.text): HTMLCollectionOf[SVGTextElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_textPath(qualifiedName: stdLib.stdLibStrings.textPath): HTMLCollectionOf[SVGTextPathElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_textarea(qualifiedName: stdLib.stdLibStrings.textarea): HTMLCollectionOf[HTMLTextAreaElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tfoot(qualifiedName: stdLib.stdLibStrings.tfoot): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_th(qualifiedName: stdLib.stdLibStrings.th): HTMLCollectionOf[HTMLTableHeaderCellElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_thead(qualifiedName: stdLib.stdLibStrings.thead): HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_time(qualifiedName: stdLib.stdLibStrings.time): HTMLCollectionOf[HTMLTimeElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_title(qualifiedName: stdLib.stdLibStrings.title): HTMLCollectionOf[HTMLTitleElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_tr(qualifiedName: stdLib.stdLibStrings.tr): HTMLCollectionOf[HTMLTableRowElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_track(qualifiedName: stdLib.stdLibStrings.track): HTMLCollectionOf[HTMLTrackElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_tspan(qualifiedName: stdLib.stdLibStrings.tspan): HTMLCollectionOf[SVGTSpanElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_u(qualifiedName: stdLib.stdLibStrings.u): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_ul(qualifiedName: stdLib.stdLibStrings.ul): HTMLCollectionOf[HTMLUListElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_use(qualifiedName: stdLib.stdLibStrings.use): HTMLCollectionOf[SVGUseElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_var(qualifiedName: stdLib.stdLibStrings.`var`): HTMLCollectionOf[HTMLElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_video(qualifiedName: stdLib.stdLibStrings.video): HTMLCollectionOf[HTMLVideoElement] = js.native
  @JSName("getElementsByTagName")
  def getElementsByTagName_view(qualifiedName: stdLib.stdLibStrings.view): HTMLCollectionOf[SVGViewElement] = js.native
  /**
       * Retrieves a collection of objects based on the specified element name.
       * @param name Specifies the name of an element.
       */
  @JSName("getElementsByTagName")
  def getElementsByTagName_wbr(qualifiedName: stdLib.stdLibStrings.wbr): HTMLCollectionOf[HTMLElement] = js.native
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
  /**
       * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
       * @param url Specifies a MIME type for the document.
       * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
       * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
       * @param replace Specifies whether the existing entry for the document is replaced in the history list.
       */
  def open(url: java.lang.String): Document = js.native
  /**
       * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
       * @param url Specifies a MIME type for the document.
       * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
       * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
       * @param replace Specifies whether the existing entry for the document is replaced in the history list.
       */
  def open(url: java.lang.String, name: java.lang.String): Document = js.native
  /**
       * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
       * @param url Specifies a MIME type for the document.
       * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
       * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
       * @param replace Specifies whether the existing entry for the document is replaced in the history list.
       */
  def open(url: java.lang.String, name: java.lang.String, features: java.lang.String): Document = js.native
  /**
       * Opens a new window and loads a document specified by a given URL. Also, opens a new window that uses the url parameter and the name parameter to collect the output of the write method and the writeln method.
       * @param url Specifies a MIME type for the document.
       * @param name Specifies the name of the window. This name is used as the value for the TARGET attribute on a form or an anchor element.
       * @param features Contains a list of items separated by commas. Each item consists of an option and a value, separated by an equals sign (for example, "fullscreen=yes, toolbar=yes"). The following values are supported.
       * @param replace Specifies whether the existing entry for the document is replaced in the history list.
       */
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
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
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
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readystatechange(
    `type`: stdLib.stdLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ProgressEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: stdLib.stdLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: stdLib.stdLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychange(
    `type`: stdLib.stdLibStrings.visibilitychange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
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
  extends ScalablyTyped.runtime.Instantiable0[Document]

