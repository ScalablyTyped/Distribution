package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertIOSStatic extends js.Object {
  /**
    * Create and display a popup alert.
    * @param title The dialog's title.
    * @param message An optional message that appears below
    *     the dialog's title.
    * @param callbackOrButtons This optional argument should
    *    be either a single-argument function or an array of buttons. If passed
    *    a function, it will be called when the user taps 'OK'.
    *
    *    If passed an array of button configurations, each button should include
    *    a `text` key, as well as optional `onPress` and `style` keys. `style`
    *    should be one of 'default', 'cancel' or 'destructive'.
    * @param type Deprecated, do not use.
    */
  def alert(title: String): Unit = js.native
  def alert(title: String, message: String): Unit = js.native
  def alert(title: String, message: String, callbackOrButtons: js.Array[AlertIOSButton]): Unit = js.native
  def alert(title: String, message: String, callbackOrButtons: js.Array[AlertIOSButton], `type`: AlertType): Unit = js.native
  def alert(title: String, message: String, callbackOrButtons: js.Function0[Unit]): Unit = js.native
  def alert(title: String, message: String, callbackOrButtons: js.Function0[Unit], `type`: AlertType): Unit = js.native
  /**
    * Create and display a prompt to enter some text.
    * @param title The dialog's title.
    * @param message An optional message that appears above the text
    *    input.
    * @param callbackOrButtons This optional argument should
    *    be either a single-argument function or an array of buttons. If passed
    *    a function, it will be called with the prompt's value when the user
    *    taps 'OK'.
    *
    *    If passed an array of button configurations, each button should include
    *    a `text` key, as well as optional `onPress` and `style` keys (see
    *    example). `style` should be one of 'default', 'cancel' or 'destructive'.
    * @param type This configures the text input. One of 'plain-text',
    *    'secure-text' or 'login-password'.
    * @param defaultValue The default text in text input.
    */
  def prompt(title: String): Unit = js.native
  def prompt(title: String, message: String): Unit = js.native
  def prompt(title: String, message: String, callbackOrButtons: js.Array[AlertIOSButton]): Unit = js.native
  def prompt(title: String, message: String, callbackOrButtons: js.Array[AlertIOSButton], `type`: AlertType): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType,
    defaultValue: String
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType,
    defaultValue: String,
    keyboardType: KeyboardType
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType,
    defaultValue: String,
    keyboardType: KeyboardTypeIOS
  ): Unit = js.native
  def prompt(title: String, message: String, callbackOrButtons: js.Function1[/* value */ String, Unit]): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Function1[/* value */ String, Unit],
    `type`: AlertType
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Function1[/* value */ String, Unit],
    `type`: AlertType,
    defaultValue: String
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Function1[/* value */ String, Unit],
    `type`: AlertType,
    defaultValue: String,
    keyboardType: KeyboardType
  ): Unit = js.native
  def prompt(
    title: String,
    message: String,
    callbackOrButtons: js.Function1[/* value */ String, Unit],
    `type`: AlertType,
    defaultValue: String,
    keyboardType: KeyboardTypeIOS
  ): Unit = js.native
}

