package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any HTML element. Some elements directly implement this interface, while others implement it via an interface that inherits it. */
@js.native
trait HTMLElement
  extends Element
     with DocumentAndElementEventHandlers
     with ElementCSSInlineStyle
     with ElementContentEditable
     with GlobalEventHandlers
     with HTMLOrSVGElement {
  var accessKey: java.lang.String = js.native
  val accessKeyLabel: java.lang.String = js.native
  var autocapitalize: java.lang.String = js.native
  var dir: java.lang.String = js.native
  var draggable: scala.Boolean = js.native
  var hidden: scala.Boolean = js.native
  var innerText: java.lang.String = js.native
  var lang: java.lang.String = js.native
  val offsetHeight: Double = js.native
  val offsetLeft: Double = js.native
  val offsetParent: Element | Null = js.native
  val offsetTop: Double = js.native
  val offsetWidth: Double = js.native
  var spellcheck: scala.Boolean = js.native
  var title: java.lang.String = js.native
  var translate: scala.Boolean = js.native
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
  def click(): Unit = js.native
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

