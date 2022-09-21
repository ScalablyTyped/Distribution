package typings.puppeteer

import typings.devtoolsProtocol.mod.Protocol.Input.DragData
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typings.node.bufferMod.global.Buffer
import typings.puppeteer.anon.Delay
import typings.puppeteer.anon.Hidden
import typings.puppeteer.anon.Threshold
import typings.puppeteer.executionContextMod.ExecutionContext
import typings.puppeteer.frameMod.Frame
import typings.puppeteer.isolatedWorldMod.WaitForSelectorOptions
import typings.puppeteer.jshandleMod.BoundingBox
import typings.puppeteer.jshandleMod.BoxModel
import typings.puppeteer.jshandleMod.ClickOptions
import typings.puppeteer.jshandleMod.JSHandle
import typings.puppeteer.jshandleMod.Offset
import typings.puppeteer.jshandleMod.Point
import typings.puppeteer.jshandleMod.PressOptions
import typings.puppeteer.pageMod.ScreenshotOptions
import typings.puppeteer.typesMod.EvaluateFunc
import typings.puppeteer.typesMod.NodeFor
import typings.puppeteer.uskeyboardlayoutMod.KeyInput
import typings.std.Awaited
import typings.std.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementHandleMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.puppeteer.typesMod._HandleOr because Already inherited
  - typings.puppeteer.typesMod.HandleFor because Already inherited */ @JSImport("puppeteer/lib/cjs/puppeteer/common/ElementHandle", "ElementHandle")
  @js.native
  open class ElementHandle[ElementType /* <: Node */] protected () extends JSHandle[ElementType] {
    /**
      * @internal
      */
    def this(context: ExecutionContext, remoteObject: RemoteObject, frame: Frame) = this()
    
    /**
      * Queries the current element for an element matching the given selector.
      *
      * @param selector - The selector to query for.
      * @returns A {@link ElementHandle | element handle} to the first element
      * matching the given selector. Otherwise, `null`.
      */
    @JSName("$")
    def $[Selector /* <: String */](selector: Selector): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
    
    /**
      * Runs the given function on the first element matching the given selector in
      * the current element.
      *
      * If the given function returns a promise, then this method will wait till
      * the promise resolves.
      *
      * @example
      *
      * ```ts
      * const tweetHandle = await page.$('.tweet');
      * expect(await tweetHandle.$eval('.like', node => node.innerText)).toBe(
      *   '100'
      * );
      * expect(await tweetHandle.$eval('.retweets', node => node.innerText)).toBe(
      *   '10'
      * );
      * ```
      *
      * @param selector - The selector to query for.
      * @param pageFunction - The function to be evaluated in this element's page's
      * context. The first element matching the selector will be passed in as the
      * first argument.
      * @param args - Additional arguments to pass to `pageFunction`.
      * @returns A promise to the result of the function.
      */
    @JSName("$eval")
    def $eval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    @JSName("$eval")
    def $eval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
    /**
      * @deprecated Use {@link ElementHandle.$$} with the `xpath` prefix.
      *
      * The method evaluates the XPath expression relative to the elementHandle.
      * If there are no such elements, the method will resolve to an empty array.
      * @param expression - Expression to {@link https://developer.mozilla.org/en-US/docs/Web/API/Document/evaluate | evaluate}
      */
    @JSName("$x")
    def $x(expression: String): js.Promise[js.Array[ElementHandle[Node]]] = js.native
    
    /**
      * Queries the current element for all elements matching the given selector.
      *
      * @param selector - The selector to query for.
      * @returns An array of {@link ElementHandle | element handles} that point to
      * elements matching the given selector.
      */
    @JSName("$$")
    def DollarDollar[Selector /* <: String */](selector: Selector): js.Promise[js.Array[ElementHandle[NodeFor[Selector]]]] = js.native
    
    /**
      * Runs the given function on an array of elements matching the given selector
      * in the current element.
      *
      * If the given function returns a promise, then this method will wait till
      * the promise resolves.
      *
      * @example
      * HTML:
      *
      * ```html
      * <div class="feed">
      *   <div class="tweet">Hello!</div>
      *   <div class="tweet">Hi!</div>
      * </div>
      * ```
      *
      * JavaScript:
      *
      * ```js
      * const feedHandle = await page.$('.feed');
      * expect(
      *   await feedHandle.$$eval('.tweet', nodes => nodes.map(n => n.innerText))
      * ).toEqual(['Hello!', 'Hi!']);
      * ```
      *
      * @param selector - The selector to query for.
      * @param pageFunction - The function to be evaluated in the element's page's
      * context. An array of elements matching the given selector will be passed to
      * the function as its first argument.
      * @param args - Additional arguments to pass to `pageFunction`.
      * @returns A promise to the result of the function.
      */
    @JSName("$$eval")
    def DollarDollareval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: Func,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    @JSName("$$eval")
    def DollarDollareval[Selector /* <: String */, Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[
        /* import warning: importer.ImportType#apply c repeated non-array type: Params */ js.Array[Params]
      ] */](
      selector: Selector,
      pageFunction: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
    ): js.Promise[Awaited[ReturnType[Func]]] = js.native
    
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
      * Returns the middle point within an element unless a specific offset is provided.
      */
    def clickablePoint(): js.Promise[Point] = js.native
    def clickablePoint(offset: Offset): js.Promise[Point] = js.native
    
    /**
      * Resolves to the content frame for element handles referencing
      * iframe nodes, or null otherwise
      */
    def contentFrame(): js.Promise[Frame | Null] = js.native
    
    /**
      * This method creates and captures a dragevent from the element.
      */
    def drag(target: Point): js.Promise[DragData] = js.native
    
    /**
      * This method triggers a dragenter, dragover, and drop on the element.
      */
    def dragAndDrop(target: ElementHandle[Node]): js.Promise[Unit] = js.native
    def dragAndDrop(target: ElementHandle[Node], options: Delay): js.Promise[Unit] = js.native
    
    /**
      * This method creates a `dragenter` event on the element.
      */
    def dragEnter(): js.Promise[Unit] = js.native
    def dragEnter(data: DragData): js.Promise[Unit] = js.native
    
    /**
      * This method creates a `dragover` event on the element.
      */
    def dragOver(): js.Promise[Unit] = js.native
    def dragOver(data: DragData): js.Promise[Unit] = js.native
    
    /**
      * This method triggers a drop on the element.
      */
    def drop(): js.Promise[Unit] = js.native
    def drop(data: DragData): js.Promise[Unit] = js.native
    
    /**
      * Calls {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement/focus | focus} on the element.
      */
    def focus(): js.Promise[Unit] = js.native
    
    def frame: Frame = js.native
    
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
    def isIntersectingViewport(options: Threshold): js.Promise[Boolean] = js.native
    
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
      * See {@link KeyInput} for a list of all key names.
      */
    def press(key: KeyInput): js.Promise[Unit] = js.native
    def press(key: KeyInput, options: PressOptions): js.Promise[Unit] = js.native
    
    /**
      * This method scrolls element into view if needed, and then uses
      * {@link Page.screenshot} to take a screenshot of the element.
      * If the element is detached from DOM, the method throws an error.
      */
    def screenshot(): js.Promise[String | Buffer] = js.native
    def screenshot(options: ScreenshotOptions): js.Promise[String | Buffer] = js.native
    
    /**
      * Triggers a `change` and `input` event once all the provided options have been
      * selected. If there's no `<select>` element matching `selector`, the method
      * throws an error.
      *
      * @example
      *
      * ```ts
      * handle.select('blue'); // single selection
      * handle.select('red', 'green', 'blue'); // multiple selections
      * ```
      *
      * @param values - Values of options to select. If the `<select>` has the
      * `multiple` attribute, all values are considered, otherwise only the first
      * one is taken into account.
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
      *
      * ```ts
      * await elementHandle.type('Hello'); // Types instantly
      * await elementHandle.type('World', {delay: 100}); // Types slower, like a user
      * ```
      *
      * @example
      * An example of typing into a text field and then submitting the form:
      *
      * ```ts
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
      *
      * @param filePaths - Sets the value of the file input to these paths.
      * If a path is relative, then it is resolved against the
      * {@link https://nodejs.org/api/process.html#process_process_cwd | current working directory}.
      * Note for locals script connecting to remote chrome environments,
      * paths must be absolute.
      */
    def uploadFile(filePaths: String*): js.Promise[Unit] = js.native
    
    /**
      * Wait for an element matching the given selector to appear in the current
      * element.
      *
      * Unlike {@link Frame.waitForSelector}, this method does not work across
      * navigations or if the element is detached from DOM.
      *
      * @example
      *
      * ```ts
      * const puppeteer = require('puppeteer');
      *
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   const page = await browser.newPage();
      *   let currentURL;
      *   page
      *     .mainFrame()
      *     .waitForSelector('img')
      *     .then(() => console.log('First URL with image: ' + currentURL));
      *
      *   for (currentURL of [
      *     'https://example.com',
      *     'https://google.com',
      *     'https://bbc.com',
      *   ]) {
      *     await page.goto(currentURL);
      *   }
      *   await browser.close();
      * })();
      * ```
      *
      * @param selector - The selector to query and wait for.
      * @param options - Options for customizing waiting behavior.
      * @returns An element matching the given selector.
      * @throws Throws if an element matching the given selector doesn't appear.
      */
    def waitForSelector[Selector /* <: String */](selector: Selector): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
    def waitForSelector[Selector /* <: String */](selector: Selector, options: WaitForSelectorOptions): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
    
    /**
      * @deprecated Use {@link ElementHandle.waitForSelector} with the `xpath`
      * prefix.
      *
      * Wait for the `xpath` within the element. If at the moment of calling the
      * method the `xpath` already exists, the method will return immediately. If
      * the `xpath` doesn't appear after the `timeout` milliseconds of waiting, the
      * function will throw.
      *
      * If `xpath` starts with `//` instead of `.//`, the dot will be appended
      * automatically.
      *
      * This method works across navigation
      *
      * ```ts
      * const puppeteer = require('puppeteer');
      * (async () => {
      *   const browser = await puppeteer.launch();
      *   const page = await browser.newPage();
      *   let currentURL;
      *   page
      *     .waitForXPath('//img')
      *     .then(() => console.log('First URL with image: ' + currentURL));
      *   for (currentURL of [
      *     'https://example.com',
      *     'https://google.com',
      *     'https://bbc.com',
      *   ]) {
      *     await page.goto(currentURL);
      *   }
      *   await browser.close();
      * })();
      * ```
      *
      * @param xpath - A
      * {@link https://developer.mozilla.org/en-US/docs/Web/XPath | xpath} of an
      * element to wait for
      * @param options - Optional waiting parameters
      * @returns Promise which resolves when element specified by xpath string is
      * added to DOM. Resolves to `null` if waiting for `hidden: true` and xpath is
      * not found in DOM.
      * @remarks
      * The optional Argument `options` have properties:
      *
      * - `visible`: A boolean to wait for element to be present in DOM and to be
      *   visible, i.e. to not have `display: none` or `visibility: hidden` CSS
      *   properties. Defaults to `false`.
      *
      * - `hidden`: A boolean wait for element to not be found in the DOM or to be
      *   hidden, i.e. have `display: none` or `visibility: hidden` CSS properties.
      *   Defaults to `false`.
      *
      * - `timeout`: A number which is maximum time to wait for in milliseconds.
      *   Defaults to `30000` (30 seconds). Pass `0` to disable timeout. The
      *   default value can be changed by using the {@link Page.setDefaultTimeout}
      *   method.
      */
    def waitForXPath(xpath: String): js.Promise[ElementHandle[Node] | Null] = js.native
    def waitForXPath(xpath: String, options: Hidden): js.Promise[ElementHandle[Node] | Null] = js.native
  }
}
