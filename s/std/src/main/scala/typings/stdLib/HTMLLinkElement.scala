package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLLinkElement interface represents reference information for external resources and the relationship of those resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement interface. */
@js.native
trait HTMLLinkElement
  extends HTMLElement
     with LinkStyle {
  var as: java.lang.String = js.native
  /**
    * Sets or retrieves the character set used to encode the object.
    */
  /** @deprecated */
  var charset: java.lang.String = js.native
  var crossOrigin: java.lang.String | scala.Null = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Sets or retrieves a destination URL or an anchor point.
    */
  var href: java.lang.String = js.native
  /**
    * Sets or retrieves the language code of the object.
    */
  var hreflang: java.lang.String = js.native
  var integrity: java.lang.String = js.native
  /**
    * Sets or retrieves the media type.
    */
  var media: java.lang.String = js.native
  var referrerPolicy: java.lang.String = js.native
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    */
  var rel: java.lang.String = js.native
  val relList: DOMTokenList = js.native
  /**
    * Sets or retrieves the relationship between the object and the destination of the link.
    */
  /** @deprecated */
  var rev: java.lang.String = js.native
  val sizes: DOMTokenList = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  /** @deprecated */
  var target: java.lang.String = js.native
  /**
    * Sets or retrieves the MIME type of the object.
    */
  var `type`: java.lang.String = js.native
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

@JSGlobal("HTMLLinkElement")
@js.native
class HTMLLinkElementCls () extends HTMLLinkElement {
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
  override val sheet: StyleSheet | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLLinkElement")
@js.native
object HTMLLinkElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLLinkElement]

