package typings.puppeteerCore.mod

import typings.puppeteerCore.anon.DelayText
import typings.puppeteerCore.anon.Text
import typings.puppeteerCore.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "Keyboard")
@js.native
open class Keyboard () extends StObject {
  
  /* private */ var charIsKey: Any = js.native
  
  /* Excluded from this release type: _modifiers */
  /* Excluded from this release type: __constructor */
  /**
    * Dispatches a `keydown` event.
    *
    * @remarks
    * If `key` is a single character and no modifier keys besides `Shift`
    * are being held down, a `keypress`/`input` event will also generated.
    * The `text` option can be specified to force an input event to be generated.
    * If `key` is a modifier key, `Shift`, `Meta`, `Control`, or `Alt`,
    * subsequent key presses will be sent with that modifier active.
    * To release the modifier key, use {@link Keyboard.up}.
    *
    * After the key is pressed once, subsequent calls to
    * {@link Keyboard.down} will have
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/repeat | repeat}
    * set to true. To release the key, use {@link Keyboard.up}.
    *
    * Modifier keys DO influence {@link Keyboard.down}.
    * Holding down `Shift` will type the text in upper case.
    *
    * @param key - Name of key to press, such as `ArrowLeft`.
    * See {@link KeyInput} for a list of all key names.
    *
    * @param options - An object of options. Accepts text which, if specified,
    * generates an input event with this text.
    */
  def down(key: KeyInput): js.Promise[Unit] = js.native
  def down(key: KeyInput, options: Text): js.Promise[Unit] = js.native
  
  /**
    * Shortcut for {@link Keyboard.down}
    * and {@link Keyboard.up}.
    *
    * @remarks
    * If `key` is a single character and no modifier keys besides `Shift`
    * are being held down, a `keypress`/`input` event will also generated.
    * The `text` option can be specified to force an input event to be generated.
    *
    * Modifier keys DO effect {@link Keyboard.press}.
    * Holding down `Shift` will type the text in upper case.
    *
    * @param key - Name of key to press, such as `ArrowLeft`.
    * See {@link KeyInput} for a list of all key names.
    *
    * @param options - An object of options. Accepts text which, if specified,
    * generates an input event with this text. Accepts delay which,
    * if specified, is the time to wait between `keydown` and `keyup` in milliseconds.
    * Defaults to 0.
    */
  def press(key: KeyInput): js.Promise[Unit] = js.native
  def press(key: KeyInput, options: DelayText): js.Promise[Unit] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * Dispatches a `keypress` and `input` event.
    * This does not send a `keydown` or `keyup` event.
    *
    * @remarks
    * Modifier keys DO NOT effect {@link Keyboard.sendCharacter | Keyboard.sendCharacter}.
    * Holding down `Shift` will not type the text in upper case.
    *
    * @example
    *
    * ```ts
    * page.keyboard.sendCharacter('嗨');
    * ```
    *
    * @param char - Character to send into the page.
    */
  def sendCharacter(char: String): js.Promise[Unit] = js.native
  
  /**
    * Sends a `keydown`, `keypress`/`input`,
    * and `keyup` event for each character in the text.
    *
    * @remarks
    * To press a special key, like `Control` or `ArrowDown`,
    * use {@link Keyboard.press}.
    *
    * Modifier keys DO NOT effect `keyboard.type`.
    * Holding down `Shift` will not type the text in upper case.
    *
    * @example
    *
    * ```ts
    * await page.keyboard.type('Hello'); // Types instantly
    * await page.keyboard.type('World', {delay: 100}); // Types slower, like a user
    * ```
    *
    * @param text - A text to type into a focused element.
    * @param options - An object of options. Accepts delay which,
    * if specified, is the time to wait between `keydown` and `keyup` in milliseconds.
    * Defaults to 0.
    */
  def `type`(text: String): js.Promise[Unit] = js.native
  def `type`(text: String, options: `0`): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `keyup` event.
    *
    * @param key - Name of key to release, such as `ArrowLeft`.
    * See {@link KeyInput | KeyInput}
    * for a list of all key names.
    */
  def up(key: KeyInput): js.Promise[Unit] = js.native
}
