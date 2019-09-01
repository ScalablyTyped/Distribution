package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityInfoStatic extends js.Object {
  /**
    * Add an event handler. Supported events:
    * - announcementFinished: iOS-only event. Fires when the screen reader has finished making an announcement.
    *                         The argument to the event handler is a dictionary with these keys:
    *                          - announcement: The string announced by the screen reader.
    *                          - success: A boolean indicating whether the announcement was successfully made.
    * - AccessibilityEventName constants other than announcementFinished: Fires on accessibility feature change.
    *            The argument to the event handler is a boolean.
    *            The boolean is true when the related event's feature is enabled and false otherwise.
    *
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
    *
    * @deprecated use isScreenReaderChanged instead
    */
  def fetch(): js.Function0[js.Promise[Boolean]]
  /**
    * Query whether bold text is currently enabled.
    *
    * @platform ios
    */
  def isBoldTextEnabled(): js.Promise[Boolean]
  /**
    * Query whether grayscale is currently enabled.
    *
    * @platform ios
    */
  def isGrayscaleEnabled(): js.Promise[Boolean]
  /**
    * Query whether invert colors is currently enabled.
    *
    * @platform ios
    */
  def isInvertColorsEnabled(): js.Promise[Boolean]
  /**
    * Query whether reduce motion is currently enabled.
    */
  def isReduceMotionEnabled(): js.Promise[Boolean]
  /**
    * Query whether reduce transparency is currently enabled.
    *
    * @platform ios
    */
  def isReduceTransparencyEnabled(): js.Promise[Boolean]
  /**
    * Query whether a screen reader is currently enabled.
    */
  def isScreenReaderEnabled(): js.Promise[Boolean]
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
    fetch: () => js.Function0[js.Promise[Boolean]],
    isBoldTextEnabled: () => js.Promise[Boolean],
    isGrayscaleEnabled: () => js.Promise[Boolean],
    isInvertColorsEnabled: () => js.Promise[Boolean],
    isReduceMotionEnabled: () => js.Promise[Boolean],
    isReduceTransparencyEnabled: () => js.Promise[Boolean],
    isScreenReaderEnabled: () => js.Promise[Boolean],
    removeEventListener: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Unit,
    setAccessibilityFocus: Double => Unit
  ): AccessibilityInfoStatic = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), announceForAccessibility = js.Any.fromFunction1(announceForAccessibility), fetch = js.Any.fromFunction0(fetch), isBoldTextEnabled = js.Any.fromFunction0(isBoldTextEnabled), isGrayscaleEnabled = js.Any.fromFunction0(isGrayscaleEnabled), isInvertColorsEnabled = js.Any.fromFunction0(isInvertColorsEnabled), isReduceMotionEnabled = js.Any.fromFunction0(isReduceMotionEnabled), isReduceTransparencyEnabled = js.Any.fromFunction0(isReduceTransparencyEnabled), isScreenReaderEnabled = js.Any.fromFunction0(isScreenReaderEnabled), removeEventListener = js.Any.fromFunction2(removeEventListener), setAccessibilityFocus = js.Any.fromFunction1(setAccessibilityFocus))
  
    __obj.asInstanceOf[AccessibilityInfoStatic]
  }
}

