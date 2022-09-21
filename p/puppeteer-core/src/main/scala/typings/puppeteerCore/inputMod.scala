package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Input.DragData
import typings.puppeteerCore.anon.DelayText
import typings.puppeteerCore.anon.MouseOptionsdelaynumberun
import typings.puppeteerCore.anon.Steps
import typings.puppeteerCore.anon.Text
import typings.puppeteerCore.anon.`0`
import typings.puppeteerCore.commonConnectionMod.CDPSession
import typings.puppeteerCore.jshandleMod.Point
import typings.puppeteerCore.uskeyboardlayoutMod.KeyInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Input", "Keyboard")
  @js.native
  open class Keyboard protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession) = this()
    
    /**
      * @internal
      */
    var _modifiers: Double = js.native
    
    /* private */ var charIsKey: Any = js.native
    
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
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Input", "Mouse")
  @js.native
  open class Mouse protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, keyboard: Keyboard) = this()
    
    /**
      * Shortcut for `mouse.move`, `mouse.down` and `mouse.up`.
      * @param x - Horizontal position of the mouse.
      * @param y - Vertical position of the mouse.
      * @param options - Optional `MouseOptions`.
      */
    def click(x: Double, y: Double): js.Promise[Unit] = js.native
    def click(x: Double, y: Double, options: MouseOptionsdelaynumberun): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `mousedown` event.
      * @param options - Optional `MouseOptions`.
      */
    def down(): js.Promise[Unit] = js.native
    def down(options: MouseOptions): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `drag` event.
      * @param start - starting point for drag
      * @param target - point to drag to
      */
    def drag(start: Point, target: Point): js.Promise[DragData] = js.native
    
    /**
      * Performs a drag, dragenter, dragover, and drop in sequence.
      * @param target - point to drag from
      * @param target - point to drop on
      * @param options - An object of options. Accepts delay which,
      * if specified, is the time to wait between `dragover` and `drop` in milliseconds.
      * Defaults to 0.
      */
    def dragAndDrop(start: Point, target: Point): js.Promise[Unit] = js.native
    def dragAndDrop(start: Point, target: Point, options: `0`): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `dragenter` event.
      * @param target - point for emitting `dragenter` event
      * @param data - drag data containing items and operations mask
      */
    def dragEnter(target: Point, data: DragData): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `dragover` event.
      * @param target - point for emitting `dragover` event
      * @param data - drag data containing items and operations mask
      */
    def dragOver(target: Point, data: DragData): js.Promise[Unit] = js.native
    
    /**
      * Performs a dragenter, dragover, and drop in sequence.
      * @param target - point to drop on
      * @param data - drag data containing items and operations mask
      */
    def drop(target: Point, data: DragData): js.Promise[Unit] = js.native
    
    /**
      * Dispatches a `mousemove` event.
      * @param x - Horizontal position of the mouse.
      * @param y - Vertical position of the mouse.
      * @param options - Optional object. If specified, the `steps` property
      * sends intermediate `mousemove` events when set to `1` (default).
      */
    def move(x: Double, y: Double): js.Promise[Unit] = js.native
    def move(x: Double, y: Double, options: Steps): js.Promise[Unit] = js.native
    
    /* private */ var `private`: Any = js.native
    
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
      *
      * ```ts
      * await page.goto(
      *   'https://mdn.mozillademos.org/en-US/docs/Web/API/Element/wheel_event$samples/Scaling_an_element_via_the_wheel?revision=1587366'
      * );
      *
      * const elem = await page.$('div');
      * const boundingBox = await elem.boundingBox();
      * await page.mouse.move(
      *   boundingBox.x + boundingBox.width / 2,
      *   boundingBox.y + boundingBox.height / 2
      * );
      *
      * await page.mouse.wheel({deltaY: -100});
      * ```
      */
    def wheel(): js.Promise[Unit] = js.native
    def wheel(options: MouseWheelOptions): js.Promise[Unit] = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Input", "Touchscreen")
  @js.native
  open class Touchscreen protected () extends StObject {
    /**
      * @internal
      */
    def this(client: CDPSession, keyboard: Keyboard) = this()
    
    /* private */ var `private`: Any = js.native
    
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
    - typings.puppeteerCore.puppeteerCoreStrings.back
    - typings.puppeteerCore.puppeteerCoreStrings.forward
  */
  trait MouseButton extends StObject
  object MouseButton {
    
    inline def back: typings.puppeteerCore.puppeteerCoreStrings.back = "back".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.back]
    
    inline def forward: typings.puppeteerCore.puppeteerCoreStrings.forward = "forward".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.forward]
    
    inline def left: typings.puppeteerCore.puppeteerCoreStrings.left = "left".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.left]
    
    inline def middle: typings.puppeteerCore.puppeteerCoreStrings.middle = "middle".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.middle]
    
    inline def right: typings.puppeteerCore.puppeteerCoreStrings.right = "right".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.right]
  }
  
  trait MouseOptions extends StObject {
    
    var button: js.UndefOr[MouseButton] = js.undefined
    
    var clickCount: js.UndefOr[Double] = js.undefined
  }
  object MouseOptions {
    
    inline def apply(): MouseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseOptions]
    }
    
    extension [Self <: MouseOptions](x: Self) {
      
      inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    }
  }
  
  trait MouseWheelOptions extends StObject {
    
    var deltaX: js.UndefOr[Double] = js.undefined
    
    var deltaY: js.UndefOr[Double] = js.undefined
  }
  object MouseWheelOptions {
    
    inline def apply(): MouseWheelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseWheelOptions]
    }
    
    extension [Self <: MouseWheelOptions](x: Self) {
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    }
  }
}
