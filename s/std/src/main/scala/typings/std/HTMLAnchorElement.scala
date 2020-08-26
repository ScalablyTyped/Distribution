package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Hyperlink elements and provides special properties and methods (beyond those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and presentation of such elements. */
@js.native
trait HTMLAnchorElement
  extends HTMLElement
     with HTMLHyperlinkElementUtils {
  /**
    * Sets or retrieves the character set used to encode the object.
    */
  /** @deprecated */
  var charset: java.lang.String = js.native
  /**
    * Sets or retrieves the coordinates of the object.
    */
  /** @deprecated */
  var coords: java.lang.String = js.native
  var download: java.lang.String = js.native
  /**
    * Sets or retrieves the language code of the object.
    */
  var hreflang: java.lang.String = js.native
  /**
    * Sets or retrieves the shape of the object.
    */
  /** @deprecated */
  var name: java.lang.String = js.native
  var ping: java.lang.String = js.native
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
  /**
    * Sets or retrieves the shape of the object.
    */
  /** @deprecated */
  var shape: java.lang.String = js.native
  /**
    * Sets or retrieves the window or frame at which to target content.
    */
  var target: java.lang.String = js.native
  /**
    * Retrieves or sets the text of the object as a string.
    */
  var text: java.lang.String = js.native
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

