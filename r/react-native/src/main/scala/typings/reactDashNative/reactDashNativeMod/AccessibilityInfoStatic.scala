package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityInfoStatic extends js.Object {
  /**
    * Add an event handler. Supported events:
    *  - change: Fires when the state of the screen reader changes.
    *            The argument to the event handler is a boolean.
    *            The boolean is true when a screen reader is enabled and false otherwise.
    *
    * - announcementFinished: iOS-only event. Fires when the screen reader has finished making an announcement.
    *                         The argument to the event handler is a dictionary with these keys:
    *                          - announcement: The string announced by the screen reader.
    *                          - success: A boolean indicating whether the announcement was successfully made.
    */
  def addEventListener(eventName: AccessibilityEventName, handler: js.Function1[/* event */ AccessibilityEvent, Unit]): Unit
  /**
    * Post a string to be announced by the screen reader.
    *
    * @platform ios
    */
  def announceForAccessibility(announcement: String): Unit
  /**
    * Query whether a screen reader is currently enabled.
    * Returns a promise which resolves to a boolean. The result is true when a screen reader is enabled and false otherwise.
    */
  def fetch(): js.Promise[Boolean]
  /**
    * Remove an event handler.
    */
  def removeEventListener(eventName: AccessibilityEventName, handler: js.Function1[/* event */ AccessibilityEvent, Unit]): Unit
  /**
    * Set acessibility focus to a react component.
    *
    * @platform ios
    */
  def setAccessibilityFocus(reactTag: Double): Unit
}

object AccessibilityInfoStatic {
  @scala.inline
  def apply(
    addEventListener: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Unit,
    announceForAccessibility: String => Unit,
    fetch: () => js.Promise[Boolean],
    removeEventListener: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Unit,
    setAccessibilityFocus: Double => Unit
  ): AccessibilityInfoStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), announceForAccessibility = js.Any.fromFunction1(announceForAccessibility), fetch = js.Any.fromFunction0(fetch), removeEventListener = js.Any.fromFunction2(removeEventListener), setAccessibilityFocus = js.Any.fromFunction1(setAccessibilityFocus))
  
    __obj.asInstanceOf[AccessibilityInfoStatic]
  }
}

