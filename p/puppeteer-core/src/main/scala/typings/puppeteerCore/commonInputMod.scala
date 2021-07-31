package typings.puppeteerCore

import typings.puppeteerCore.anon.DelayText
import typings.puppeteerCore.anon.MouseOptionsdelaynumberunButton
import typings.puppeteerCore.anon.Steps
import typings.puppeteerCore.anon.Text
import typings.puppeteerCore.anon.`0`
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.commonUskeyboardlayoutMod.KeyInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonInputMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Input", "Keyboard")
  @js.native
  class Keyboard protected () extends StObject {
    /** @internal */
    def this(client: CDPSession) = this()
    
    var _client: js.Any = js.native
    
    var _keyDescriptionForString: js.Any = js.native
    
    var _modifierBit: js.Any = js.native
    
    /** @internal */
    var _modifiers: Double = js.native
    
    var _pressedKeys: js.Any = js.native
    
    var charIsKey: js.Any = js.native
    
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
    
    /**
      * Dispatches a `keypress` and `input` event.
      * This does not send a `keydown` or `keyup` event.
      *
      * @remarks
      * Modifier keys DO NOT effect {@link Keyboard.sendCharacter | Keyboard.sendCharacter}.
      * Holding down `Shift` will not type the text in upper case.
      *
      * @example
      * ```js
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
      * ```js
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
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Input", "Mouse")
  @js.native
  class Mouse protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, keyboard: Keyboard) = this()
    
    var _button: js.Any = js.native
    
    var _client: js.Any = js.native
    
    var _keyboard: js.Any = js.native
    
    var _x: js.Any = js.native
    
    var _y: js.Any = js.native
    
    /**
      * Shortcut for `mouse.move`, `mouse.down` and `mouse.up`.
      * @param x - Horizontal position of the mouse.
      * @param y - Vertical position of the mouse.
      * @param options - Optional `MouseOptions`.
      */
    def click(x: Double, y: Double): js.Promise[Unit] = js.native
    def click(x: Double, y: Double, options: MouseOptionsdelaynumberunButton): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `mousedown` event.
      * @param options - Optional `MouseOptions`.
      */
    def down(): js.Promise[Unit] = js.native
    def down(options: MouseOptions): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `mousemove` event.
      * @param x - Horizontal position of the mouse.
      * @param y - Vertical position of the mouse.
      * @param options - Optional object. If specified, the `steps` property
      * sends intermediate `mousemove` events when set to `1` (default).
      */
    def move(x: Double, y: Double): js.Promise[Unit] = js.native
    def move(x: Double, y: Double, options: Steps): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `mouseup` event.
      * @param options - Optional `MouseOptions`.
      */
    def up(): js.Promise[Unit] = js.native
    def up(options: MouseOptions): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `mousewheel` event.
      * @param options - Optional: `MouseWheelOptions`.
      *
      * @example
      * An example of zooming into an element:
      * ```js
      * await page.goto('https://mdn.mozillademos.org/en-US/docs/Web/API/Element/wheel_event$samples/Scaling_an_element_via_the_wheel?revision=1587366');
      *
      * const elem = await page.$('div');
      * const boundingBox = await elem.boundingBox();
      * await page.mouse.move(
      *   boundingBox.x + boundingBox.width / 2,
      *   boundingBox.y + boundingBox.height / 2
      * );
      *
      * await page.mouse.wheel({ deltaY: -100 })
      * ```
      */
    def wheel(): js.Promise[Unit] = js.native
    def wheel(options: MouseWheelOptions): js.Promise[Unit] = js.native
  }
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/common/Input", "Touchscreen")
  @js.native
  class Touchscreen protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, keyboard: Keyboard) = this()
    
    var _client: js.Any = js.native
    
    var _keyboard: js.Any = js.native
    
    /**
      * Dispatches a `touchstart` and `touchend` event.
      * @param x - Horizontal position of the tap.
      * @param y - Vertical position of the tap.
      */
    def tap(x: Double, y: Double): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.left
    - typings.puppeteerCore.puppeteerCoreStrings.right
    - typings.puppeteerCore.puppeteerCoreStrings.middle
  */
  trait MouseButton extends StObject
  object MouseButton {
    
    @scala.inline
    def left: typings.puppeteerCore.puppeteerCoreStrings.left = "left".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.left]
    
    @scala.inline
    def middle: typings.puppeteerCore.puppeteerCoreStrings.middle = "middle".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.middle]
    
    @scala.inline
    def right: typings.puppeteerCore.puppeteerCoreStrings.right = "right".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.right]
  }
  
  trait MouseOptions extends StObject {
    
    var button: js.UndefOr[MouseButton] = js.undefined
    
    var clickCount: js.UndefOr[Double] = js.undefined
  }
  object MouseOptions {
    
    @scala.inline
    def apply(): MouseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseOptions]
    }
    
    @scala.inline
    implicit class MouseOptionsMutableBuilder[Self <: MouseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    }
  }
  
  trait MouseWheelOptions extends StObject {
    
    var deltaX: js.UndefOr[Double] = js.undefined
    
    var deltaY: js.UndefOr[Double] = js.undefined
  }
  object MouseWheelOptions {
    
    @scala.inline
    def apply(): MouseWheelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseWheelOptions]
    }
    
    @scala.inline
    implicit class MouseWheelOptionsMutableBuilder[Self <: MouseWheelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    }
  }
}
