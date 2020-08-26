package typings.reactMdUtils.touchesMod

import typings.std.AddEventListenerOptions
import typings.std.HTMLElement
import typings.std.TouchEvent
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/events/touches", "removeTouchEvent")
@js.native
object removeTouchEvent extends js.Object {
  def apply(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  def apply(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  def apply(
    el: HTMLElement,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit]
  ): Unit = js.native
  def apply(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: js.UndefOr[scala.Nothing],
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
  def apply(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean
  ): Unit = js.native
  def apply(
    el: Window,
    eventType: TouchTypes,
    /**
    * The touch event callback function to use.
    */
  callback: js.Function1[/* e */ TouchEvent, Unit],
    /**
    * Boolean if the event should be captured if the browser does not support
    * passive events.
    */
  capture: Boolean,
    /**
    * Any additional options to provide to the passive event.
    */
  options: AddEventListenerOptions
  ): Unit = js.native
}

