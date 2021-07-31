package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.node.Buffer
import typings.puppeteerCore.anon.Delay
import typings.puppeteerCore.anon.X
import typings.puppeteerCore.connectionMod.CDPSession
import typings.puppeteerCore.evalTypesMod.EvaluateFn
import typings.puppeteerCore.evalTypesMod.EvaluateFnReturnType
import typings.puppeteerCore.evalTypesMod.EvaluateHandleFn
import typings.puppeteerCore.evalTypesMod.SerializableOrJSHandle
import typings.puppeteerCore.evalTypesMod.UnwrapPromiseLike
import typings.puppeteerCore.evalTypesMod.WrapElementHandle
import typings.puppeteerCore.evalTypesMod._SerializableOrJSHandle
import typings.puppeteerCore.executionContextMod.ExecutionContext
import typings.puppeteerCore.frameManagerMod.Frame
import typings.puppeteerCore.frameManagerMod.FrameManager
import typings.puppeteerCore.pageMod.Page
import typings.puppeteerCore.puppeteerCoreStrings.left
import typings.puppeteerCore.puppeteerCoreStrings.middle
import typings.puppeteerCore.puppeteerCoreStrings.right
import typings.puppeteerCore.uskeyboardlayoutMod.KeyInput
import typings.std.Element
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jshandleMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/JSHandle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/JSHandle", "ElementHandle")
  @js.native
  class ElementHandle[ElementType /* <: Element */] protected () extends JSHandle {
    /**
      * @internal
      */
    def this(
      context: ExecutionContext,
      client: CDPSession,
      remoteObject: RemoteObject,
      page: Page,
      frameManager: FrameManager
    ) = this()
    
    /**
      * Runs `element.querySelector` within the page. If no element matches the selector,
      * the return value resolves to `null`.
      */
    @JSName("$")
    def $(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
    
    /**
      * This method runs `document.querySelector` within the element and passes it as
      * the first argument to `pageFunction`. If there's no element matching `selector`,
      * the method throws an error.
      *
      * If `pageFunction` returns a Promise, then `frame.$eval` would wait for the promise
      * to resolve and return its value.
      *
      * @example
      * ```js
      * const tweetHandle = await page.$('.tweet');
      * expect(await tweetHandle.$eval('.like', node => node.innerText)).toBe('100');
      * expect(await tweetHandle.$eval('.retweets', node => node.innerText)).toBe('10');
      * ```
      */
    @JSName("$eval")
    def $eval[ReturnType](
      selector: String,
      pageFunction: js.Function2[/* element */ Element, /* repeated */ js.Any, ReturnType | js.Promise[ReturnType]],
      args: SerializableOrJSHandle*
    ): js.Promise[WrapElementHandle[ReturnType]] = js.native
    
    /**
      * The method evaluates the XPath expression relative to the elementHandle.
      * If there are no such elements, the method will resolve to an empty array.
      * @param expression - Expression to {@link https://developer.mozilla.org/en-US/docs/Web/API/Document/evaluate | evaluate}
      */
    @JSName("$x")
    def $x(expression: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    /**
      * Runs `element.querySelectorAll` within the page. If no elements match the selector,
      * the return value resolves to `[]`.
      */
    @JSName("$$")
    def DollarDollar(selector: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
    
    /**
      * This method runs `document.querySelectorAll` within the element and passes it as
      * the first argument to `pageFunction`. If there's no element matching `selector`,
      * the method throws an error.
      *
      * If `pageFunction` returns a Promise, then `frame.$$eval` would wait for the
      * promise to resolve and return its value.
      *
      * @example
      * ```html
      * <div class="feed">
      *   <div class="tweet">Hello!</div>
      *   <div class="tweet">Hi!</div>
      * </div>
      * ```
      *
      * @example
      * ```js
      * const feedHandle = await page.$('.feed');
      * expect(await feedHandle.$$eval('.tweet', nodes => nodes.map(n => n.innerText)))
      *  .toEqual(['Hello!', 'Hi!']);
      * ```
      */
    @JSName("$$eval")
    def DollarDollareval[ReturnType](
      selector: String,
      pageFunction: js.Function2[
          /* elements */ js.Array[Element], 
          /* repeated */ js.Any, 
          ReturnType | js.Promise[ReturnType]
        ],
      args: SerializableOrJSHandle*
    ): js.Promise[WrapElementHandle[ReturnType]] = js.native
    
    var _clickablePoint: js.Any = js.native
    
    var _frameManager: js.Any = js.native
    
    var _fromProtocolQuad: js.Any = js.native
    
    var _getBoxModel: js.Any = js.native
    
    var _intersectQuadWithViewport: js.Any = js.native
    
    var _page: js.Any = js.native
    
    var _scrollIntoViewIfNeeded: js.Any = js.native
    
    /**
      * This method returns the bounding box of the element (relative to the main frame),
      * or `null` if the element is not visible.
      */
    def boundingBox(): js.Promise[BoundingBox | Null] = js.native
    
    /**
      * This method returns boxes of the element, or `null` if the element is not visible.
      *
      * @remarks
      *
      * Boxes are represented as an array of points;
      * Each Point is an object `{x, y}`. Box points are sorted clock-wise.
      */
    def boxModel(): js.Promise[BoxModel | Null] = js.native
    
    /**
      * This method scrolls element into view if needed, and then
      * uses {@link Page.mouse} to click in the center of the element.
      * If the element is detached from DOM, the method throws an error.
      */
    def click(): js.Promise[Unit] = js.native
    def click(options: ClickOptions): js.Promise[Unit] = js.native
    
    /**
      * Resolves to the content frame for element handles referencing
      * iframe nodes, or null otherwise
      */
    def contentFrame(): js.Promise[Frame | Null] = js.native
    
    /**
      * Calls {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/focus | focus} on the element.
      */
    def focus(): js.Promise[Unit] = js.native
    
    /**
      * This method scrolls element into view if needed, and then
      * uses {@link Page.mouse} to hover over the center of the element.
      * If the element is detached from DOM, the method throws an error.
      */
    def hover(): js.Promise[Unit] = js.native
    
    /**
      * Resolves to true if the element is visible in the current viewport.
      */
    def isIntersectingViewport(): js.Promise[Boolean] = js.native
    
    /**
      * Focuses the element, and then uses {@link Keyboard.down} and {@link Keyboard.up}.
      *
      * @remarks
      * If `key` is a single character and no modifier keys besides `Shift`
      * are being held down, a `keypress`/`input` event will also be generated.
      * The `text` option can be specified to force an input event to be generated.
      *
      * **NOTE** Modifier keys DO affect `elementHandle.press`. Holding down `Shift`
      * will type the text in upper case.
      *
      * @param key - Name of key to press, such as `ArrowLeft`.
      *    See {@link KeyInput} for a list of all key names.
      */
    def press(key: KeyInput): js.Promise[Unit] = js.native
    def press(key: KeyInput, options: PressOptions): js.Promise[Unit] = js.native
    
    /**
      * This method scrolls element into view if needed, and then uses
      * {@link Page.screenshot} to take a screenshot of the element.
      * If the element is detached from DOM, the method throws an error.
      */
    def screenshot(): js.Promise[String | Buffer | Unit] = js.native
    def screenshot(options: js.Object): js.Promise[String | Buffer | Unit] = js.native
    
    /**
      * Triggers a `change` and `input` event once all the provided options have been
      * selected. If there's no `<select>` element matching `selector`, the method
      * throws an error.
      *
      * @example
      * ```js
      * handle.select('blue'); // single selection
      * handle.select('red', 'green', 'blue'); // multiple selections
      * ```
      * @param values - Values of options to select. If the `<select>` has the
      *    `multiple` attribute, all values are considered, otherwise only the first
      *    one is taken into account.
      */
    def select(values: String*): js.Promise[js.Array[String]] = js.native
    
    /**
      * This method scrolls element into view if needed, and then uses
      * {@link Touchscreen.tap} to tap in the center of the element.
      * If the element is detached from DOM, the method throws an error.
      */
    def tap(): js.Promise[Unit] = js.native
    
    /**
      * Focuses the element, and then sends a `keydown`, `keypress`/`input`, and
      * `keyup` event for each character in the text.
      *
      * To press a special key, like `Control` or `ArrowDown`,
      * use {@link ElementHandle.press}.
      *
      * @example
      * ```js
      * await elementHandle.type('Hello'); // Types instantly
      * await elementHandle.type('World', {delay: 100}); // Types slower, like a user
      * ```
      *
      * @example
      * An example of typing into a text field and then submitting the form:
      *
      * ```js
      * const elementHandle = await page.$('input');
      * await elementHandle.type('some text');
      * await elementHandle.press('Enter');
      * ```
      */
    def `type`(text: String): js.Promise[Unit] = js.native
    def `type`(text: String, options: Delay): js.Promise[Unit] = js.native
    
    /**
      * This method expects `elementHandle` to point to an
      * {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input | input element}.
      * @param filePaths - Sets the value of the file input to these paths.
      *    If some of the  `filePaths` are relative paths, then they are resolved
      *    relative to the {@link https://nodejs.org/api/process.html#process_process_cwd | current working directory}
      */
    def uploadFile(filePaths: String*): js.Promise[Unit] = js.native
  }
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/JSHandle", "JSHandle")
  @js.native
  class JSHandle protected ()
    extends StObject
       with _SerializableOrJSHandle {
    /**
      * @internal
      */
    def this(context: ExecutionContext, client: CDPSession, remoteObject: RemoteObject) = this()
    
    /**
      * @internal
      */
    var _client: CDPSession = js.native
    
    /**
      * @internal
      */
    var _context: ExecutionContext = js.native
    
    /**
      * @internal
      */
    var _disposed: Boolean = js.native
    
    /**
      * @internal
      */
    var _remoteObject: RemoteObject = js.native
    
    /**
      * Returns either `null` or the object handle itself, if the object handle is
      * an instance of {@link ElementHandle}.
      */
    def asElement(): ElementHandle[Element] | Null = js.native
    
    /**
      * Stops referencing the element handle, and resolves when the object handle is
      * successfully disposed of.
      */
    def dispose(): js.Promise[Unit] = js.native
    
    /**
      * This method passes this handle as the first argument to `pageFunction`.
      * If `pageFunction` returns a Promise, then `handle.evaluate` would wait
      * for the promise to resolve and return its value.
      *
      * @example
      * ```js
      * const tweetHandle = await page.$('.tweet .retweets');
      * expect(await tweetHandle.evaluate(node => node.innerText)).toBe('10');
      * ```
      */
    def evaluate[T /* <: EvaluateFn[js.Any] */](pageFunction: T, args: SerializableOrJSHandle*): js.Promise[UnwrapPromiseLike[EvaluateFnReturnType[T]]] = js.native
    def evaluate[T /* <: EvaluateFn[js.Any] */](pageFunction: String, args: SerializableOrJSHandle*): js.Promise[UnwrapPromiseLike[EvaluateFnReturnType[T]]] = js.native
    
    /**
      * This method passes this handle as the first argument to `pageFunction`.
      *
      * @remarks
      *
      * The only difference between `jsHandle.evaluate` and
      * `jsHandle.evaluateHandle` is that `jsHandle.evaluateHandle`
      * returns an in-page object (JSHandle).
      *
      * If the function passed to `jsHandle.evaluateHandle` returns a Promise,
      * then `evaluateHandle.evaluateHandle` waits for the promise to resolve and
      * returns its value.
      *
      * See {@link Page.evaluateHandle} for more details.
      */
    def evaluateHandle[HandleType /* <: JSHandle */](pageFunction: EvaluateHandleFn, args: SerializableOrJSHandle*): js.Promise[HandleType] = js.native
    
    /** Returns the execution context the handle belongs to.
      */
    def executionContext(): ExecutionContext = js.native
    
    /**
      * The method returns a map with property names as keys and JSHandle
      * instances for the property values.
      *
      * @example
      * ```js
      * const listHandle = await page.evaluateHandle(() => document.body.children);
      * const properties = await listHandle.getProperties();
      * const children = [];
      * for (const property of properties.values()) {
      *   const element = property.asElement();
      *   if (element)
      *     children.push(element);
      * }
      * children; // holds elementHandles to all children of document.body
      * ```
      */
    def getProperties(): js.Promise[Map[String, JSHandle]] = js.native
    
    /** Fetches a single property from the referenced object.
      */
    def getProperty(propertyName: String): js.Promise[js.UndefOr[JSHandle]] = js.native
    
    /**
      * Returns a JSON representation of the object.
      *
      * @remarks
      *
      * The JSON is generated by running {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify | JSON.stringify}
      * on the object in page and consequent {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse | JSON.parse} in puppeteer.
      * **NOTE** The method throws if the referenced object is not stringifiable.
      */
    def jsonValue(): js.Promise[Record[String, js.Any]] = js.native
  }
  
  @scala.inline
  def createJSHandle(context: ExecutionContext, remoteObject: RemoteObject): JSHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("createJSHandle")(context.asInstanceOf[js.Any], remoteObject.asInstanceOf[js.Any])).asInstanceOf[JSHandle]
  
  trait BoundingBox extends StObject {
    
    /**
      * the height of the element in pixels.
      */
    var height: Double
    
    /**
      * the width of the element in pixels.
      */
    var width: Double
    
    /**
      * the x coordinate of the element in pixels.
      */
    var x: Double
    
    /**
      * the y coordinate of the element in pixels.
      */
    var y: Double
  }
  object BoundingBox {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundingBox]
    }
    
    @scala.inline
    implicit class BoundingBoxMutableBuilder[Self <: BoundingBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait BoxModel extends StObject {
    
    var border: js.Array[X]
    
    var content: js.Array[X]
    
    var height: Double
    
    var margin: js.Array[X]
    
    var padding: js.Array[X]
    
    var width: Double
  }
  object BoxModel {
    
    @scala.inline
    def apply(
      border: js.Array[X],
      content: js.Array[X],
      height: Double,
      margin: js.Array[X],
      padding: js.Array[X],
      width: Double
    ): BoxModel = {
      val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxModel]
    }
    
    @scala.inline
    implicit class BoxModelMutableBuilder[Self <: BoxModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: js.Array[X]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderVarargs(value: X*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setContent(value: js.Array[X]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: X*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin(value: js.Array[X]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginVarargs(value: X*): Self = StObject.set(x, "margin", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: js.Array[X]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingVarargs(value: X*): Self = StObject.set(x, "padding", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClickOptions extends StObject {
    
    /**
      * @defaultValue 'left'
      */
    var button: js.UndefOr[left | right | middle] = js.undefined
    
    /**
      * @defaultValue 1
      */
    var clickCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Time to wait between `mousedown` and `mouseup` in milliseconds.
      *
      * @defaultValue 0
      */
    var delay: js.UndefOr[Double] = js.undefined
  }
  object ClickOptions {
    
    @scala.inline
    def apply(): ClickOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickOptions]
    }
    
    @scala.inline
    implicit class ClickOptionsMutableBuilder[Self <: ClickOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: left | right | middle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait PressOptions extends StObject {
    
    /**
      * Time to wait between `keydown` and `keyup` in milliseconds. Defaults to 0.
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * If specified, generates an input event with this text.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object PressOptions {
    
    @scala.inline
    def apply(): PressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PressOptions]
    }
    
    @scala.inline
    implicit class PressOptionsMutableBuilder[Self <: PressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
