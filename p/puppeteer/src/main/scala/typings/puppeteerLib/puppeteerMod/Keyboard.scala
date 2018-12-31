package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyboard extends js.Object {
  /**
    * Dispatches a keydown event.
    * @param key Name of key to press, such as ArrowLeft.
    * @param options Specifies a input text event.
    */
  def down(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def down(key: java.lang.String, options: puppeteerLib.Anon_Text): js.Promise[scala.Unit] = js.native
  /** Shortcut for `keyboard.down` and `keyboard.up`. */
  def press(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def press(key: java.lang.String, options: puppeteerLib.Anon_TextDelay): js.Promise[scala.Unit] = js.native
  /** Dispatches a `keypress` and `input` event. This does not send a `keydown` or keyup `event`. */
  def sendCharacter(char: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Sends a keydown, keypress/input, and keyup event for each character in the text.
    * @param text A text to type into a focused element.
    * @param options Specifies the typing options.
    */
  def `type`(text: java.lang.String): js.Promise[scala.Unit] = js.native
  def `type`(text: java.lang.String, options: puppeteerLib.Anon_Delay): js.Promise[scala.Unit] = js.native
  /**
    * Dispatches a keyup event.
    * @param key Name of key to release, such as ArrowLeft.
    */
  def up(key: java.lang.String): js.Promise[scala.Unit] = js.native
}

