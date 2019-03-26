package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLScriptElement
  extends HTMLElement
     with HTMLOrSVGScriptElement {
  var async: scala.Boolean = js.native
  /**
    * Sets or retrieves the character set used to encode the object.
    */
  /** @deprecated */
  var charset: java.lang.String = js.native
  var crossOrigin: java.lang.String | scala.Null = js.native
  /**
    * Sets or retrieves the status of the script.
    */
  var defer: scala.Boolean = js.native
  /**
    * Sets or retrieves the event for which the script is written.
    */
  /** @deprecated */
  var event: java.lang.String = js.native
  /**
    * Sets or retrieves the object that is bound to the event script.
    */
  /** @deprecated */
  var htmlFor: java.lang.String = js.native
  var integrity: java.lang.String = js.native
  var noModule: scala.Boolean = js.native
  var referrerPolicy: java.lang.String = js.native
  /**
    * Retrieves the URL to an external file that contains the source code or data.
    */
  var src: java.lang.String = js.native
  /**
    * Retrieves or sets the text of the object as a string.
    */
  var text: java.lang.String = js.native
  /**
    * Sets or retrieves the MIME type for the associated scripting engine.
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

@JSGlobal("HTMLScriptElement")
@js.native
class HTMLScriptElementCls () extends HTMLScriptElement {
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

@JSGlobal("HTMLScriptElement")
@js.native
object HTMLScriptElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLScriptElement]

