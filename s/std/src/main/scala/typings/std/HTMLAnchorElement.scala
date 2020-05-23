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

