package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reference information for external resources and the relationship of those resources to a document and vice-versa. This object inherits all of the properties and methods of the HTMLElement interface. */
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
  var crossOrigin: java.lang.String | Null = js.native
  var disabled: scala.Boolean = js.native
  /**
    * Sets or retrieves a destination URL or an anchor point.
    */
  var href: java.lang.String = js.native
  /**
    * Sets or retrieves the language code of the object.
    */
  var hreflang: java.lang.String = js.native
  var imageSizes: java.lang.String = js.native
  var imageSrcset: java.lang.String = js.native
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
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    * 
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    * 
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    * 
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
    * 
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    * 
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    */
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
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
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

