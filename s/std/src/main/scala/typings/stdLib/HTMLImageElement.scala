package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLImageElement interface provides special properties and methods  for manipulating the layout and presentation of <img> elements. */
@js.native
trait HTMLImageElement
  extends HTMLElement
     with HTMLOrSVGImageElement
     with TexImageSource {
  /**
    * Sets or retrieves how the object is aligned with adjacent text.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a text alternative to the graphic.
    */
  var alt: java.lang.String = js.native
  /**
    * Specifies the properties of a border drawn around an object.
    */
  /** @deprecated */
  var border: java.lang.String = js.native
  /**
    * Retrieves whether the object is fully loaded.
    */
  val complete: scala.Boolean = js.native
  var crossOrigin: java.lang.String | scala.Null = js.native
  val currentSrc: java.lang.String = js.native
  var decoding: stdLib.stdLibStrings.async | stdLib.stdLibStrings.sync | stdLib.stdLibStrings.auto = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: scala.Double = js.native
  /**
    * Sets or retrieves the width of the border to draw around the object.
    */
  /** @deprecated */
  var hspace: scala.Double = js.native
  /**
    * Sets or retrieves whether the image is a server-side image map.
    */
  var isMap: scala.Boolean = js.native
  /**
    * Sets or retrieves a Uniform Resource Identifier (URI) to a long description of the object.
    */
  /** @deprecated */
  var longDesc: java.lang.String = js.native
  /** @deprecated */
  var lowsrc: java.lang.String = js.native
  /**
    * Sets or retrieves the name of the object.
    */
  /** @deprecated */
  var name: java.lang.String = js.native
  /**
    * The original height of the image resource before sizing.
    */
  val naturalHeight: scala.Double = js.native
  /**
    * The original width of the image resource before sizing.
    */
  val naturalWidth: scala.Double = js.native
  var referrerPolicy: java.lang.String = js.native
  var sizes: java.lang.String = js.native
  /**
    * The address or URL of the a media resource that is to be considered.
    */
  var src: java.lang.String = js.native
  var srcset: java.lang.String = js.native
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    */
  var useMap: java.lang.String = js.native
  /**
    * Sets or retrieves the vertical margin for the object.
    */
  /** @deprecated */
  var vspace: scala.Double = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: scala.Double = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
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
  def decode(): js.Promise[scala.Unit] = js.native
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
}

@JSGlobal("HTMLImageElement")
@js.native
class HTMLImageElementCls () extends HTMLImageElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLImageElement")
@js.native
object HTMLImageElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLImageElement]

