package typings
package reactDashNativeLib.reactDashNativeMod

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
  def alert(title: java.lang.String): scala.Unit = js.native
  def alert(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def alert(title: java.lang.String, message: java.lang.String, callbackOrButtons: js.Array[AlertIOSButton]): scala.Unit = js.native
  def alert(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType
  ): scala.Unit = js.native
  def alert(title: java.lang.String, message: java.lang.String, callbackOrButtons: js.Function0[scala.Unit]): scala.Unit = js.native
  def alert(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Function0[scala.Unit],
    `type`: AlertType
  ): scala.Unit = js.native
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
  def prompt(title: java.lang.String): scala.Unit = js.native
  def prompt(title: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def prompt(title: java.lang.String, message: java.lang.String, callbackOrButtons: js.Array[AlertIOSButton]): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType,
    defaultValue: java.lang.String
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType,
    defaultValue: java.lang.String,
    keyboardType: KeyboardType
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Array[AlertIOSButton],
    `type`: AlertType,
    defaultValue: java.lang.String,
    keyboardType: KeyboardTypeIOS
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Function1[/* value */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Function1[/* value */ java.lang.String, scala.Unit],
    `type`: AlertType
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Function1[/* value */ java.lang.String, scala.Unit],
    `type`: AlertType,
    defaultValue: java.lang.String
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Function1[/* value */ java.lang.String, scala.Unit],
    `type`: AlertType,
    defaultValue: java.lang.String,
    keyboardType: KeyboardType
  ): scala.Unit = js.native
  def prompt(
    title: java.lang.String,
    message: java.lang.String,
    callbackOrButtons: js.Function1[/* value */ java.lang.String, scala.Unit],
    `type`: AlertType,
    defaultValue: java.lang.String,
    keyboardType: KeyboardTypeIOS
  ): scala.Unit = js.native
}

