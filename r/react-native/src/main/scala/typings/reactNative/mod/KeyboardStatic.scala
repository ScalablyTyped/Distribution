package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardStatic
  extends StObject
     with NativeEventEmitter {
  
  /**
    * The `addListener` function connects a JavaScript function to an identified native
    * keyboard notification event.
    *
    * This function then returns the reference to the listener.
    *
    * {string} eventName The `nativeEvent` is the string that identifies the event you're listening for.  This
    *can be any of the following:
    *
    * - `keyboardWillShow`
    * - `keyboardDidShow`
    * - `keyboardWillHide`
    * - `keyboardDidHide`
    * - `keyboardWillChangeFrame`
    * - `keyboardDidChangeFrame`
    *
    * Note that if you set `android:windowSoftInputMode` to `adjustResize`  or `adjustNothing`,
    * only `keyboardDidShow` and `keyboardDidHide` events will be available on Android.
    * `keyboardWillShow` as well as `keyboardWillHide` are generally not available on Android
    * since there is no native corresponding event.
    *
    * {function} callback function to be called when the event fires.
    */
  def addListener(eventType: KeyboardEventName, listener: KeyboardEventListener): EmitterSubscription = js.native
  
  /**
    * Dismisses the active keyboard and removes focus.
    */
  def dismiss(): Unit = js.native
  
  /**
    * Useful for syncing TextInput (or other keyboard accessory view) size of
    * position changes with keyboard movements.
    */
  def scheduleLayoutAnimation(event: KeyboardEvent): Unit = js.native
}
