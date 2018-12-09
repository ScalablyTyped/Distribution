package typings
package reactDashNativeLib.reactDashNativeMod

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
  def addEventListener(
    eventName: reactDashNativeLib.AccessibilityEventName,
    handler: js.Function1[/* event */ reactDashNativeLib.AccessibilityEvent, scala.Unit]
  ): scala.Unit
  /**
       * Post a string to be announced by the screen reader.
       *
       * @platform ios
       */
  def announceForAccessibility(announcement: java.lang.String): scala.Unit
  /**
       * Query whether a screen reader is currently enabled.
       * Returns a promise which resolves to a boolean. The result is true when a screen reader is enabled and false otherwise.
       */
  def fetch(): js.Promise[scala.Boolean]
  /**
       * Remove an event handler.
       */
  def removeEventListener(
    eventName: reactDashNativeLib.AccessibilityEventName,
    handler: js.Function1[/* event */ reactDashNativeLib.AccessibilityEvent, scala.Unit]
  ): scala.Unit
  /**
       * Set acessibility focus to a react component.
       *
       * @platform ios
       */
  def setAccessibilityFocus(reactTag: scala.Double): scala.Unit
}

