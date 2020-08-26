package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** HTML <script> elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of <script> elements (beyond the inherited HTMLElement interface). */
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
  var crossOrigin: java.lang.String | Null = js.native
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
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
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
}

