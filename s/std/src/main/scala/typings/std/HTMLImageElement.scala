package typings.std

import typings.std.stdStrings.async
import typings.std.stdStrings.auto
import typings.std.stdStrings.sync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods for manipulating <img> elements. */
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
  var crossOrigin: java.lang.String | Null = js.native
  val currentSrc: java.lang.String = js.native
  var decoding: async | sync | auto = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: Double = js.native
  /**
    * Sets or retrieves the width of the border to draw around the object.
    */
  /** @deprecated */
  var hspace: Double = js.native
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
  val naturalHeight: Double = js.native
  /**
    * The original width of the image resource before sizing.
    */
  val naturalWidth: Double = js.native
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
  var vspace: Double = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: Double = js.native
  val x: Double = js.native
  val y: Double = js.native
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
  def decode(): js.Promise[Unit] = js.native
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

