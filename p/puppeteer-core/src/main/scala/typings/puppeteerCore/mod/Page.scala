package typings.puppeteerCore.mod

import typings.devtoolsProtocol.mod.Protocol.Emulation.UserAgentMetadata
import typings.devtoolsProtocol.mod.Protocol.Network.Cookie
import typings.devtoolsProtocol.mod.Protocol.Network.CookieParam
import typings.devtoolsProtocol.mod.Protocol.Network.DeleteCookiesRequest
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.puppeteerCore.anon.ButtonClickCount
import typings.puppeteerCore.anon.Default
import typings.puppeteerCore.anon.Delay
import typings.puppeteerCore.anon.Hidden
import typings.puppeteerCore.anon.IdleTime
import typings.puppeteerCore.anon.IsScreenUnlocked
import typings.puppeteerCore.anon.MetricsTitle
import typings.puppeteerCore.anon.OmitFrameAddStyleTagOptio
import typings.puppeteerCore.anon.RunBeforeUnload
import typings.puppeteerCore.anon.Timeout
import typings.puppeteerCore.anon.WaitForOptionsrefererstriTimeout
import typings.puppeteerCore.puppeteerCoreStrings.achromatopsia
import typings.puppeteerCore.puppeteerCoreStrings.blurredVision
import typings.puppeteerCore.puppeteerCoreStrings.close
import typings.puppeteerCore.puppeteerCoreStrings.console
import typings.puppeteerCore.puppeteerCoreStrings.deuteranopia
import typings.puppeteerCore.puppeteerCoreStrings.dialog
import typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import typings.puppeteerCore.puppeteerCoreStrings.error
import typings.puppeteerCore.puppeteerCoreStrings.frameattached
import typings.puppeteerCore.puppeteerCoreStrings.framedetached
import typings.puppeteerCore.puppeteerCoreStrings.framenavigated
import typings.puppeteerCore.puppeteerCoreStrings.load
import typings.puppeteerCore.puppeteerCoreStrings.metrics
import typings.puppeteerCore.puppeteerCoreStrings.none
import typings.puppeteerCore.puppeteerCoreStrings.pageerror
import typings.puppeteerCore.puppeteerCoreStrings.popup
import typings.puppeteerCore.puppeteerCoreStrings.protanopia
import typings.puppeteerCore.puppeteerCoreStrings.request
import typings.puppeteerCore.puppeteerCoreStrings.requestfailed
import typings.puppeteerCore.puppeteerCoreStrings.requestfinished
import typings.puppeteerCore.puppeteerCoreStrings.requestservedfromcache
import typings.puppeteerCore.puppeteerCoreStrings.response
import typings.puppeteerCore.puppeteerCoreStrings.tritanopia
import typings.puppeteerCore.puppeteerCoreStrings.workercreated
import typings.puppeteerCore.puppeteerCoreStrings.workerdestroyed
import typings.std.Awaited
import typings.std.HTMLLinkElement
import typings.std.HTMLScriptElement
import typings.std.HTMLStyleElement
import typings.std.Node
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "Page")
@js.native
open class Page () extends EventEmitter {
  
  /**
    * Runs `document.querySelector` within the page. If no element matches the
    * selector, the return value resolves to `null`.
    *
    * @param selector - A `selector` to query page for
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
    * to query page for.
    */
  @JSName("$")
  def $[Selector /* <: String */](selector: Selector): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
  
  /**
    * This method runs `document.querySelector` within the page and passes the
    * result as the first argument to the `pageFunction`.
    *
    * @remarks
    *
    * If no element is found matching `selector`, the method will throw an error.
    *
    * If `pageFunction` returns a promise `$eval` will wait for the promise to
    * resolve and then return its value.
    *
    * @example
    *
    * ```ts
    * const searchValue = await page.$eval('#search', el => el.value);
    * const preloadHref = await page.$eval('link[rel=preload]', el => el.href);
    * const html = await page.$eval('.main-container', el => el.outerHTML);
    * ```
    *
    * If you are using TypeScript, you may have to provide an explicit type to the
    * first argument of the `pageFunction`.
    * By default it is typed as `Element`, but you may need to provide a more
    * specific sub-type:
    *
    * @example
    *
    * ```ts
    * // if you don't provide HTMLInputElement here, TS will error
    * // as `value` is not on `Element`
    * const searchValue = await page.$eval(
    *   '#search',
    *   (el: HTMLInputElement) => el.value
    * );
    * ```
    *
    * The compiler should be able to infer the return type
    * from the `pageFunction` you provide. If it is unable to, you can use the generic
    * type to tell the compiler what return type you expect from `$eval`:
    *
    * @example
    *
    * ```ts
    * // The compiler can infer the return type in this case, but if it can't
    * // or if you want to be more explicit, provide it as the generic type.
    * const searchValue = await page.$eval<string>(
    *   '#search',
    *   (el: HTMLInputElement) => el.value
    * );
    * ```
    *
    * @param selector - the
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
    * to query for
    * @param pageFunction - the function to be evaluated in the page context.
    * Will be passed the result of `document.querySelector(selector)` as its
    * first argument.
    * @param args - any additional arguments to pass through to `pageFunction`.
    *
    * @returns The result of calling `pageFunction`. If it returns an element it
    * is wrapped in an {@link ElementHandle}, else the raw value itself is
    * returned.
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
    * The method evaluates the XPath expression relative to the page document as
    * its context node. If there are no such elements, the method resolves to an
    * empty array.
    *
    * @remarks
    * Shortcut for {@link Frame.$x | Page.mainFrame().$x(expression) }.
    *
    * @param expression - Expression to evaluate
    */
  @JSName("$x")
  def $x(expression: String): js.Promise[js.Array[ElementHandle[Node]]] = js.native
  
  /**
    * The method runs `document.querySelectorAll` within the page. If no elements
    * match the selector, the return value resolves to `[]`.
    * @remarks
    * Shortcut for {@link Frame.$$ | Page.mainFrame().$$(selector) }.
    * @param selector - A `selector` to query page for
    */
  @JSName("$$")
  def DollarDollar[Selector /* <: String */](selector: Selector): js.Promise[js.Array[ElementHandle[NodeFor[Selector]]]] = js.native
  
  /**
    * This method runs `Array.from(document.querySelectorAll(selector))` within
    * the page and passes the result as the first argument to the `pageFunction`.
    *
    * @remarks
    * If `pageFunction` returns a promise `$$eval` will wait for the promise to
    * resolve and then return its value.
    *
    * @example
    *
    * ```ts
    * // get the amount of divs on the page
    * const divCount = await page.$$eval('div', divs => divs.length);
    *
    * // get the text content of all the `.options` elements:
    * const options = await page.$$eval('div > span.options', options => {
    *   return options.map(option => option.textContent);
    * });
    * ```
    *
    * If you are using TypeScript, you may have to provide an explicit type to the
    * first argument of the `pageFunction`.
    * By default it is typed as `Element[]`, but you may need to provide a more
    * specific sub-type:
    *
    * @example
    *
    * ```ts
    * // if you don't provide HTMLInputElement here, TS will error
    * // as `value` is not on `Element`
    * await page.$$eval('input', (elements: HTMLInputElement[]) => {
    *   return elements.map(e => e.value);
    * });
    * ```
    *
    * The compiler should be able to infer the return type
    * from the `pageFunction` you provide. If it is unable to, you can use the generic
    * type to tell the compiler what return type you expect from `$$eval`:
    *
    * @example
    *
    * ```ts
    * // The compiler can infer the return type in this case, but if it can't
    * // or if you want to be more explicit, provide it as the generic type.
    * const allInputValues = await page.$$eval<string[]>(
    *   'input',
    *   (elements: HTMLInputElement[]) => elements.map(e => e.textContent)
    * );
    * ```
    *
    * @param selector - the
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
    * to query for
    * @param pageFunction - the function to be evaluated in the page context.
    * Will be passed the result of
    * `Array.from(document.querySelectorAll(selector))` as its first argument.
    * @param args - any additional arguments to pass through to `pageFunction`.
    *
    * @returns The result of calling `pageFunction`. If it returns an element it
    * is wrapped in an {@link ElementHandle}, else the raw value itself is
    * returned.
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
  
  def accessibility: Accessibility = js.native
  
  /**
    * Adds a `<script>` tag into the page with the desired URL or content.
    *
    * @remarks
    * Shortcut for
    * {@link Frame.addScriptTag | page.mainFrame().addScriptTag(options)}.
    *
    * @param options - Options for the script.
    * @returns An {@link ElementHandle | element handle} to the injected
    * `<script>` element.
    */
  def addScriptTag(options: FrameAddScriptTagOptions): js.Promise[ElementHandle[HTMLScriptElement]] = js.native
  
  /**
    * Adds a `<link rel="stylesheet">` tag into the page with the desired URL or
    * a `<style type="text/css">` tag with the content.
    *
    * Shortcut for
    * {@link Frame.addStyleTag | page.mainFrame().addStyleTag(options)}.
    *
    * @returns An {@link ElementHandle | element handle} to the injected `<link>`
    * or `<style>` element.
    */
  def addStyleTag(options: OmitFrameAddStyleTagOptio): js.Promise[ElementHandle[HTMLStyleElement]] = js.native
  def addStyleTag(options: FrameAddStyleTagOptions): js.Promise[ElementHandle[HTMLLinkElement]] = js.native
  
  /**
    * Provide credentials for `HTTP authentication`.
    *
    * @remarks
    * To disable authentication, pass `null`.
    */
  def authenticate(credentials: Credentials): js.Promise[Unit] = js.native
  
  /**
    * Brings page to front (activates tab).
    */
  def bringToFront(): js.Promise[Unit] = js.native
  
  /**
    * Get the browser the page belongs to.
    */
  def browser(): Browser = js.native
  
  /**
    * Get the browser context that the page belongs to.
    */
  def browserContext(): BrowserContext = js.native
  
  /**
    * This method fetches an element with `selector`, scrolls it into view if
    * needed, and then uses {@link Page.mouse} to click in the center of the
    * element. If there's no element matching `selector`, the method throws an
    * error.
    * @remarks Bear in mind that if `click()` triggers a navigation event and
    * there's a separate `page.waitForNavigation()` promise to be resolved, you
    * may end up with a race condition that yields unexpected results. The
    * correct pattern for click and wait for navigation is the following:
    *
    * ```ts
    * const [response] = await Promise.all([
    *   page.waitForNavigation(waitOptions),
    *   page.click(selector, clickOptions),
    * ]);
    * ```
    *
    * Shortcut for {@link Frame.click | page.mainFrame().click(selector[, options]) }.
    * @param selector - A `selector` to search for element to click. If there are
    * multiple elements satisfying the `selector`, the first will be clicked
    * @param options - `Object`
    * @returns Promise which resolves when the element matching `selector` is
    * successfully clicked. The Promise will be rejected if there is no element
    * matching `selector`.
    */
  def click(selector: String): js.Promise[Unit] = js.native
  def click(selector: String, options: ButtonClickCount): js.Promise[Unit] = js.native
  
  def close(): js.Promise[Unit] = js.native
  def close(options: RunBeforeUnload): js.Promise[Unit] = js.native
  
  def content(): js.Promise[String] = js.native
  
  /**
    * If no URLs are specified, this method returns cookies for the current page
    * URL. If URLs are specified, only cookies for those URLs are returned.
    */
  def cookies(urls: String*): js.Promise[js.Array[Cookie]] = js.native
  
  def coverage: Coverage = js.native
  
  /**
    * Generates a PDF of the page with the `print` CSS media type.
    * @remarks
    *
    * NOTE: PDF generation is only supported in Chrome headless mode.
    *
    * To generate a PDF with the `screen` media type, call
    * {@link Page.emulateMediaType | `page.emulateMediaType('screen')`} before
    * calling `page.pdf()`.
    *
    * By default, `page.pdf()` generates a pdf with modified colors for printing.
    * Use the
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/-webkit-print-color-adjust | `-webkit-print-color-adjust`}
    * property to force rendering of exact colors.
    *
    * @param options - options for generating the PDF.
    */
  def createPDFStream(): js.Promise[Readable] = js.native
  def createPDFStream(options: PDFOptions): js.Promise[Readable] = js.native
  
  def deleteCookie(cookies: DeleteCookiesRequest*): js.Promise[Unit] = js.native
  
  /**
    * Emulates a given device's metrics and user agent.
    *
    * To aid emulation, Puppeteer provides a list of known devices that can be
    * via {@link KnownDevices}.
    *
    * @remarks
    * This method is a shortcut for calling two methods:
    * {@link Page.setUserAgent} and {@link Page.setViewport}.
    *
    * @remarks
    * This method will resize the page. A lot of websites don't expect phones to
    * change size, so you should emulate before navigating to the page.
    *
    * @example
    *
    * ```ts
    * import {KnownDevices} from 'puppeteer';
    * const iPhone = KnownDevices['iPhone 6'];
    *
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   await page.emulate(iPhone);
    *   await page.goto('https://www.google.com');
    *   // other actions...
    *   await browser.close();
    * })();
    * ```
    */
  def emulate(device: Device): js.Promise[Unit] = js.native
  
  /**
    * Enables CPU throttling to emulate slow CPUs.
    * @param factor - slowdown factor (1 is no throttle, 2 is 2x slowdown, etc).
    */
  def emulateCPUThrottling(): js.Promise[Unit] = js.native
  def emulateCPUThrottling(factor: Double): js.Promise[Unit] = js.native
  
  /**
    * Emulates the idle state.
    * If no arguments set, clears idle state emulation.
    *
    * @example
    *
    * ```ts
    * // set idle emulation
    * await page.emulateIdleState({isUserActive: true, isScreenUnlocked: false});
    *
    * // do some checks here
    * ...
    *
    * // clear idle emulation
    * await page.emulateIdleState();
    * ```
    *
    * @param overrides - Mock idle state. If not set, clears idle overrides
    */
  def emulateIdleState(): js.Promise[Unit] = js.native
  def emulateIdleState(overrides: IsScreenUnlocked): js.Promise[Unit] = js.native
  
  /**
    * @param features - `<?Array<Object>>` Given an array of media feature
    * objects, emulates CSS media features on the page. Each media feature object
    * must have the following properties:
    * @example
    *
    * ```ts
    * await page.emulateMediaFeatures([
    *   {name: 'prefers-color-scheme', value: 'dark'},
    * ]);
    * await page.evaluate(
    *   () => matchMedia('(prefers-color-scheme: dark)').matches
    * );
    * // → true
    * await page.evaluate(
    *   () => matchMedia('(prefers-color-scheme: light)').matches
    * );
    * // → false
    *
    * await page.emulateMediaFeatures([
    *   {name: 'prefers-reduced-motion', value: 'reduce'},
    * ]);
    * await page.evaluate(
    *   () => matchMedia('(prefers-reduced-motion: reduce)').matches
    * );
    * // → true
    * await page.evaluate(
    *   () => matchMedia('(prefers-reduced-motion: no-preference)').matches
    * );
    * // → false
    *
    * await page.emulateMediaFeatures([
    *   {name: 'prefers-color-scheme', value: 'dark'},
    *   {name: 'prefers-reduced-motion', value: 'reduce'},
    * ]);
    * await page.evaluate(
    *   () => matchMedia('(prefers-color-scheme: dark)').matches
    * );
    * // → true
    * await page.evaluate(
    *   () => matchMedia('(prefers-color-scheme: light)').matches
    * );
    * // → false
    * await page.evaluate(
    *   () => matchMedia('(prefers-reduced-motion: reduce)').matches
    * );
    * // → true
    * await page.evaluate(
    *   () => matchMedia('(prefers-reduced-motion: no-preference)').matches
    * );
    * // → false
    *
    * await page.emulateMediaFeatures([{name: 'color-gamut', value: 'p3'}]);
    * await page.evaluate(() => matchMedia('(color-gamut: srgb)').matches);
    * // → true
    * await page.evaluate(() => matchMedia('(color-gamut: p3)').matches);
    * // → true
    * await page.evaluate(() => matchMedia('(color-gamut: rec2020)').matches);
    * // → false
    * ```
    */
  def emulateMediaFeatures(): js.Promise[Unit] = js.native
  def emulateMediaFeatures(features: js.Array[MediaFeature]): js.Promise[Unit] = js.native
  
  /**
    * @param type - Changes the CSS media type of the page. The only allowed
    * values are `screen`, `print` and `null`. Passing `null` disables CSS media
    * emulation.
    * @example
    *
    * ```ts
    * await page.evaluate(() => matchMedia('screen').matches);
    * // → true
    * await page.evaluate(() => matchMedia('print').matches);
    * // → false
    *
    * await page.emulateMediaType('print');
    * await page.evaluate(() => matchMedia('screen').matches);
    * // → false
    * await page.evaluate(() => matchMedia('print').matches);
    * // → true
    *
    * await page.emulateMediaType(null);
    * await page.evaluate(() => matchMedia('screen').matches);
    * // → true
    * await page.evaluate(() => matchMedia('print').matches);
    * // → false
    * ```
    */
  def emulateMediaType(): js.Promise[Unit] = js.native
  def emulateMediaType(`type`: String): js.Promise[Unit] = js.native
  
  /**
    * This does not affect WebSockets and WebRTC PeerConnections (see
    * https://crbug.com/563644). To set the page offline, you can use
    * {@link Page.setOfflineMode}.
    *
    * A list of predefined network conditions can be used by importing
    * {@link PredefinedNetworkConditions}.
    *
    * @example
    *
    * ```ts
    * import {PredefinedNetworkConditions} from 'puppeteer';
    * const slow3G = PredefinedNetworkConditions['Slow 3G'];
    *
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   await page.emulateNetworkConditions(slow3G);
    *   await page.goto('https://www.google.com');
    *   // other actions...
    *   await browser.close();
    * })();
    * ```
    *
    * @param networkConditions - Passing `null` disables network condition
    * emulation.
    */
  def emulateNetworkConditions(): js.Promise[Unit] = js.native
  def emulateNetworkConditions(networkConditions: NetworkConditions_): js.Promise[Unit] = js.native
  
  /**
    * @param timezoneId - Changes the timezone of the page. See
    * {@link https://source.chromium.org/chromium/chromium/deps/icu.git/+/faee8bc70570192d82d2978a71e2a615788597d1:source/data/misc/metaZones.txt | ICU’s metaZones.txt}
    * for a list of supported timezone IDs. Passing
    * `null` disables timezone emulation.
    */
  def emulateTimezone(): js.Promise[Unit] = js.native
  def emulateTimezone(timezoneId: String): js.Promise[Unit] = js.native
  
  /**
    * Simulates the given vision deficiency on the page.
    *
    * @example
    *
    * ```ts
    * const puppeteer = require('puppeteer');
    *
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   await page.goto('https://v8.dev/blog/10-years');
    *
    *   await page.emulateVisionDeficiency('achromatopsia');
    *   await page.screenshot({path: 'achromatopsia.png'});
    *
    *   await page.emulateVisionDeficiency('deuteranopia');
    *   await page.screenshot({path: 'deuteranopia.png'});
    *
    *   await page.emulateVisionDeficiency('blurredVision');
    *   await page.screenshot({path: 'blurred-vision.png'});
    *
    *   await browser.close();
    * })();
    * ```
    *
    * @param type - the type of deficiency to simulate, or `'none'` to reset.
    */
  def emulateVisionDeficiency(): js.Promise[Unit] = js.native
  def emulateVisionDeficiency(`type`: none | achromatopsia | blurredVision | deuteranopia | protanopia | tritanopia): js.Promise[Unit] = js.native
  
  /**
    * Evaluates a function in the page's context and returns the result.
    *
    * If the function passed to `page.evaluteHandle` returns a Promise, the
    * function will wait for the promise to resolve and return its value.
    *
    * @example
    *
    * ```ts
    * const result = await frame.evaluate(() => {
    *   return Promise.resolve(8 * 7);
    * });
    * console.log(result); // prints "56"
    * ```
    *
    * You can pass a string instead of a function (although functions are
    * recommended as they are easier to debug and use with TypeScript):
    *
    * @example
    *
    * ```ts
    * const aHandle = await page.evaluate('1 + 2');
    * ```
    *
    * To get the best TypeScript experience, you should pass in as the
    * generic the type of `pageFunction`:
    *
    * ```ts
    * const aHandle = await page.evaluate(() => 2);
    * ```
    *
    * @example
    *
    * {@link ElementHandle} instances (including {@link JSHandle}s) can be passed
    * as arguments to the `pageFunction`:
    *
    * ```ts
    * const bodyHandle = await page.$('body');
    * const html = await page.evaluate(body => body.innerHTML, bodyHandle);
    * await bodyHandle.dispose();
    * ```
    *
    * @param pageFunction - a function that is run within the page
    * @param args - arguments to be passed to the pageFunction
    *
    * @returns the return value of `pageFunction`.
    */
  def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: Func,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[Awaited[ReturnType[Func]]] = js.native
  def evaluate[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[Awaited[ReturnType[Func]]] = js.native
  
  /**
    * @remarks
    *
    * The only difference between {@link Page.evaluate | page.evaluate} and
    * `page.evaluateHandle` is that `evaluateHandle` will return the value
    * wrapped in an in-page object.
    *
    * If the function passed to `page.evaluteHandle` returns a Promise, the
    * function will wait for the promise to resolve and return its value.
    *
    * You can pass a string instead of a function (although functions are
    * recommended as they are easier to debug and use with TypeScript):
    *
    * @example
    *
    * ```ts
    * const aHandle = await page.evaluateHandle('document');
    * ```
    *
    * @example
    * {@link JSHandle} instances can be passed as arguments to the `pageFunction`:
    *
    * ```ts
    * const aHandle = await page.evaluateHandle(() => document.body);
    * const resultHandle = await page.evaluateHandle(
    *   body => body.innerHTML,
    *   aHandle
    * );
    * console.log(await resultHandle.jsonValue());
    * await resultHandle.dispose();
    * ```
    *
    * Most of the time this function returns a {@link JSHandle},
    * but if `pageFunction` returns a reference to an element,
    * you instead get an {@link ElementHandle} back:
    *
    * @example
    *
    * ```ts
    * const button = await page.evaluateHandle(() =>
    *   document.querySelector('button')
    * );
    * // can call `click` because `button` is an `ElementHandle`
    * await button.click();
    * ```
    *
    * The TypeScript definitions assume that `evaluateHandle` returns
    * a `JSHandle`, but if you know it's going to return an
    * `ElementHandle`, pass it as the generic argument:
    *
    * ```ts
    * const button = await page.evaluateHandle<ElementHandle>(...);
    * ```
    *
    * @param pageFunction - a function that is run within the page
    * @param args - arguments to be passed to the pageFunction
    */
  def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: Func,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  def evaluateHandle[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  
  /**
    * Adds a function which would be invoked in one of the following scenarios:
    *
    * - whenever the page is navigated
    *
    * - whenever the child frame is attached or navigated. In this case, the
    *   function is invoked in the context of the newly attached frame.
    *
    * The function is invoked after the document was created but before any of
    * its scripts were run. This is useful to amend the JavaScript environment,
    * e.g. to seed `Math.random`.
    * @param pageFunction - Function to be evaluated in browser context
    * @param args - Arguments to pass to `pageFunction`
    * @example
    * An example of overriding the navigator.languages property before the page loads:
    *
    * ```ts
    * // preload.js
    *
    * // overwrite the `languages` property to use a custom getter
    * Object.defineProperty(navigator, 'languages', {
    *   get: function () {
    *     return ['en-US', 'en', 'bn'];
    *   },
    * });
    *
    * // In your puppeteer script, assuming the preload.js file is
    * // in same folder of our script.
    * const preloadFile = fs.readFileSync('./preload.js', 'utf8');
    * await page.evaluateOnNewDocument(preloadFile);
    * ```
    */
  def evaluateOnNewDocument[Params /* <: js.Array[Any] */, Func /* <: js.Function1[/* args */ Params, Any] */](
    pageFunction: Func,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[Unit] = js.native
  def evaluateOnNewDocument[Params /* <: js.Array[Any] */, Func /* <: js.Function1[/* args */ Params, Any] */](
    pageFunction: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[Unit] = js.native
  
  /**
    * The method adds a function called `name` on the page's `window` object.
    * When called, the function executes `puppeteerFunction` in node.js and
    * returns a `Promise` which resolves to the return value of
    * `puppeteerFunction`.
    *
    * If the puppeteerFunction returns a `Promise`, it will be awaited.
    *
    * :::note
    *
    * Functions installed via `page.exposeFunction` survive navigations.
    *
    * :::note
    *
    * @example
    * An example of adding an `md5` function into the page:
    *
    * ```ts
    * const puppeteer = require('puppeteer');
    * const crypto = require('crypto');
    *
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   page.on('console', msg => console.log(msg.text()));
    *   await page.exposeFunction('md5', text =>
    *     crypto.createHash('md5').update(text).digest('hex')
    *   );
    *   await page.evaluate(async () => {
    *     // use window.md5 to compute hashes
    *     const myString = 'PUPPETEER';
    *     const myHash = await window.md5(myString);
    *     console.log(`md5 of ${myString} is ${myHash}`);
    *   });
    *   await browser.close();
    * })();
    * ```
    *
    * @example
    * An example of adding a `window.readfile` function into the page:
    *
    * ```ts
    * const puppeteer = require('puppeteer');
    * const fs = require('fs');
    *
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   page.on('console', msg => console.log(msg.text()));
    *   await page.exposeFunction('readfile', async filePath => {
    *     return new Promise((resolve, reject) => {
    *       fs.readFile(filePath, 'utf8', (err, text) => {
    *         if (err) reject(err);
    *         else resolve(text);
    *       });
    *     });
    *   });
    *   await page.evaluate(async () => {
    *     // use window.readfile to read contents of a file
    *     const content = await window.readfile('/etc/hosts');
    *     console.log(content);
    *   });
    *   await browser.close();
    * })();
    * ```
    *
    * @param name - Name of the function on the window object
    * @param pptrFunction - Callback function which will be called in Puppeteer's
    * context.
    */
  def exposeFunction(name: String, pptrFunction: js.Function): js.Promise[Unit] = js.native
  def exposeFunction(name: String, pptrFunction: Default): js.Promise[Unit] = js.native
  
  /**
    * This method fetches an element with `selector` and focuses it. If there's no
    * element matching `selector`, the method throws an error.
    * @param selector - A
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector }
    * of an element to focus. If there are multiple elements satisfying the
    * selector, the first will be focused.
    * @returns Promise which resolves when the element matching selector is
    * successfully focused. The promise will be rejected if there is no element
    * matching selector.
    * @remarks
    * Shortcut for {@link Frame.focus | page.mainFrame().focus(selector)}.
    */
  def focus(selector: String): js.Promise[Unit] = js.native
  
  /**
    * @returns An array of all frames attached to the page.
    */
  def frames(): js.Array[Frame] = js.native
  
  /**
    * @returns Maximum time in milliseconds.
    */
  def getDefaultTimeout(): Double = js.native
  
  /**
    * This method navigate to the previous page in history.
    * @param options - Navigation parameters
    * @returns Promise which resolves to the main resource response. In case of
    * multiple redirects, the navigation will resolve with the response of the
    * last redirect. If can not go back, resolves to `null`.
    * @remarks
    * The argument `options` might have the following properties:
    *
    * - `timeout` : Maximum navigation time in milliseconds, defaults to 30
    *   seconds, pass 0 to disable timeout. The default value can be changed by
    *   using the {@link Page.setDefaultNavigationTimeout} or
    *   {@link Page.setDefaultTimeout} methods.
    *
    * - `waitUntil` : When to consider navigation succeeded, defaults to `load`.
    *   Given an array of event strings, navigation is considered to be
    *   successful after all events have been fired. Events can be either:<br/>
    * - `load` : consider navigation to be finished when the load event is
    *   fired.<br/>
    * - `domcontentloaded` : consider navigation to be finished when the
    *   DOMContentLoaded event is fired.<br/>
    * - `networkidle0` : consider navigation to be finished when there are no
    *   more than 0 network connections for at least `500` ms.<br/>
    * - `networkidle2` : consider navigation to be finished when there are no
    *   more than 2 network connections for at least `500` ms.
    */
  def goBack(): js.Promise[HTTPResponse | Null] = js.native
  def goBack(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
  
  /**
    * This method navigate to the next page in history.
    * @param options - Navigation Parameter
    * @returns Promise which resolves to the main resource response. In case of
    * multiple redirects, the navigation will resolve with the response of the
    * last redirect. If can not go forward, resolves to `null`.
    * @remarks
    * The argument `options` might have the following properties:
    *
    * - `timeout` : Maximum navigation time in milliseconds, defaults to 30
    *   seconds, pass 0 to disable timeout. The default value can be changed by
    *   using the {@link Page.setDefaultNavigationTimeout} or
    *   {@link Page.setDefaultTimeout} methods.
    *
    * - `waitUntil`: When to consider navigation succeeded, defaults to `load`.
    *   Given an array of event strings, navigation is considered to be
    *   successful after all events have been fired. Events can be either:<br/>
    * - `load` : consider navigation to be finished when the load event is
    *   fired.<br/>
    * - `domcontentloaded` : consider navigation to be finished when the
    *   DOMContentLoaded event is fired.<br/>
    * - `networkidle0` : consider navigation to be finished when there are no
    *   more than 0 network connections for at least `500` ms.<br/>
    * - `networkidle2` : consider navigation to be finished when there are no
    *   more than 2 network connections for at least `500` ms.
    */
  def goForward(): js.Promise[HTTPResponse | Null] = js.native
  def goForward(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
  
  /**
    * @param url - URL to navigate page to. The URL should include scheme, e.g.
    * `https://`
    * @param options - Navigation Parameter
    * @returns Promise which resolves to the main resource response. In case of
    * multiple redirects, the navigation will resolve with the response of the
    * last redirect.
    * @remarks
    * The argument `options` might have the following properties:
    *
    * - `timeout` : Maximum navigation time in milliseconds, defaults to 30
    *   seconds, pass 0 to disable timeout. The default value can be changed by
    *   using the {@link Page.setDefaultNavigationTimeout} or
    *   {@link Page.setDefaultTimeout} methods.
    *
    * - `waitUntil`:When to consider navigation succeeded, defaults to `load`.
    *   Given an array of event strings, navigation is considered to be
    *   successful after all events have been fired. Events can be either:<br/>
    * - `load` : consider navigation to be finished when the load event is
    *   fired.<br/>
    * - `domcontentloaded` : consider navigation to be finished when the
    *   DOMContentLoaded event is fired.<br/>
    * - `networkidle0` : consider navigation to be finished when there are no
    *   more than 0 network connections for at least `500` ms.<br/>
    * - `networkidle2` : consider navigation to be finished when there are no
    *   more than 2 network connections for at least `500` ms.
    *
    * - `referer` : Referer header value. If provided it will take preference
    *   over the referer header value set by
    *   {@link Page.setExtraHTTPHeaders |page.setExtraHTTPHeaders()}.
    *
    * `page.goto` will throw an error if:
    *
    * - there's an SSL error (e.g. in case of self-signed certificates).
    * - target URL is invalid.
    * - the timeout is exceeded during navigation.
    * - the remote server does not respond or is unreachable.
    * - the main resource failed to load.
    *
    * `page.goto` will not throw an error when any valid HTTP status code is
    * returned by the remote server, including 404 "Not Found" and 500
    * "Internal Server Error". The status code for such responses can be
    * retrieved by calling response.status().
    *
    * NOTE: `page.goto` either throws an error or returns a main resource
    * response. The only exceptions are navigation to about:blank or navigation
    * to the same URL with a different hash, which would succeed and return null.
    *
    * NOTE: Headless mode doesn't support navigation to a PDF document. See the
    * {@link https://bugs.chromium.org/p/chromium/issues/detail?id=761295 |
    * upstream issue}.
    *
    * Shortcut for {@link Frame.goto | page.mainFrame().goto(url, options)}.
    */
  def goto(url: String): js.Promise[HTTPResponse | Null] = js.native
  def goto(url: String, options: WaitForOptionsrefererstriTimeout): js.Promise[HTTPResponse | Null] = js.native
  
  /**
    * This method fetches an element with `selector`, scrolls it into view if
    * needed, and then uses {@link Page.mouse} to hover over the center of the element.
    * If there's no element matching `selector`, the method throws an error.
    * @param selector - A
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
    * to search for element to hover. If there are multiple elements satisfying
    * the selector, the first will be hovered.
    * @returns Promise which resolves when the element matching `selector` is
    * successfully hovered. Promise gets rejected if there's no element matching
    * `selector`.
    * @remarks
    * Shortcut for {@link Page.hover | page.mainFrame().hover(selector)}.
    */
  def hover(selector: String): js.Promise[Unit] = js.native
  
  /**
    * Indicates that the page has been closed.
    * @returns
    */
  def isClosed(): Boolean = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * @returns `true` if drag events are being intercepted, `false` otherwise.
    */
  def isDragInterceptionEnabled(): Boolean = js.native
  
  /**
    * @returns `true` if the page has JavaScript enabled, `false` otherwise.
    */
  def isJavaScriptEnabled(): Boolean = js.native
  
  def keyboard: Keyboard = js.native
  
  /**
    * @returns The page's main frame.
    *
    * @remarks
    * Page is guaranteed to have a main frame which persists during navigations.
    */
  def mainFrame(): Frame = js.native
  
  /**
    * @returns Object containing metrics as key/value pairs.
    *
    * - `Timestamp` : The timestamp when the metrics sample was taken.
    *
    * - `Documents` : Number of documents in the page.
    *
    * - `Frames` : Number of frames in the page.
    *
    * - `JSEventListeners` : Number of events in the page.
    *
    * - `Nodes` : Number of DOM nodes in the page.
    *
    * - `LayoutCount` : Total number of full or partial page layout.
    *
    * - `RecalcStyleCount` : Total number of page style recalculations.
    *
    * - `LayoutDuration` : Combined durations of all page layouts.
    *
    * - `RecalcStyleDuration` : Combined duration of all page style
    *   recalculations.
    *
    * - `ScriptDuration` : Combined duration of JavaScript execution.
    *
    * - `TaskDuration` : Combined duration of all tasks performed by the browser.
    *
    * - `JSHeapUsedSize` : Used JavaScript heap size.
    *
    * - `JSHeapTotalSize` : Total JavaScript heap size.
    *
    * @remarks
    * All timestamps are in monotonic time: monotonically increasing time
    * in seconds since an arbitrary point in the past.
    */
  def metrics(): js.Promise[Metrics] = js.native
  
  def mouse: Mouse = js.native
  
  @JSName("off")
  def off_close(eventName: close, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_console(eventName: console, handler: js.Function1[/* event */ ConsoleMessage, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_dialog(eventName: dialog, handler: js.Function1[/* event */ Dialog, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_domcontentloaded(eventName: domcontentloaded_, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_error(eventName: error, handler: js.Function1[/* event */ js.Error, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_frameattached(eventName: frameattached, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_framedetached(eventName: framedetached, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_framenavigated(eventName: framenavigated, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_load(eventName: load, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_metrics(eventName: metrics, handler: js.Function1[/* event */ MetricsTitle, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_pageerror(eventName: pageerror, handler: js.Function1[/* event */ js.Error, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_popup(eventName: popup, handler: js.Function1[/* event */ this.type, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_request(eventName: request, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_requestfailed(eventName: requestfailed, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_requestfinished(eventName: requestfinished, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_requestservedfromcache(eventName: requestservedfromcache, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_response(eventName: response, handler: js.Function1[/* event */ HTTPResponse, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_workercreated(eventName: workercreated, handler: js.Function1[/* event */ WebWorker, Unit]): EventEmitter = js.native
  @JSName("off")
  def off_workerdestroyed(eventName: workerdestroyed, handler: js.Function1[/* event */ WebWorker, Unit]): EventEmitter = js.native
  
  /**
    * Listen to page events.
    *
    * :::note
    *
    * This method exists to define event typings and handle proper wireup of
    * cooperative request interception. Actual event listening and dispatching is
    * delegated to {@link EventEmitter}.
    *
    * :::
    */
  @JSName("on")
  def on_close(eventName: close, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_console(eventName: console, handler: js.Function1[/* event */ ConsoleMessage, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_dialog(eventName: dialog, handler: js.Function1[/* event */ Dialog, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_domcontentloaded(eventName: domcontentloaded_, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_error(eventName: error, handler: js.Function1[/* event */ js.Error, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_frameattached(eventName: frameattached, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_framedetached(eventName: framedetached, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_framenavigated(eventName: framenavigated, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_load(eventName: load, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_metrics(eventName: metrics, handler: js.Function1[/* event */ MetricsTitle, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_pageerror(eventName: pageerror, handler: js.Function1[/* event */ js.Error, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_popup(eventName: popup, handler: js.Function1[/* event */ this.type, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_request(eventName: request, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_requestfailed(eventName: requestfailed, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_requestfinished(eventName: requestfinished, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_requestservedfromcache(eventName: requestservedfromcache, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_response(eventName: response, handler: js.Function1[/* event */ HTTPResponse, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_workercreated(eventName: workercreated, handler: js.Function1[/* event */ WebWorker, Unit]): EventEmitter = js.native
  @JSName("on")
  def on_workerdestroyed(eventName: workerdestroyed, handler: js.Function1[/* event */ WebWorker, Unit]): EventEmitter = js.native
  
  @JSName("once")
  def once_close(eventName: close, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_console(eventName: console, handler: js.Function1[/* event */ ConsoleMessage, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_dialog(eventName: dialog, handler: js.Function1[/* event */ Dialog, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_domcontentloaded(eventName: domcontentloaded_, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_error(eventName: error, handler: js.Function1[/* event */ js.Error, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_frameattached(eventName: frameattached, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_framedetached(eventName: framedetached, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_framenavigated(eventName: framenavigated, handler: js.Function1[/* event */ Frame, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_load(eventName: load, handler: js.Function1[/* event */ scala.Nothing, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_metrics(eventName: metrics, handler: js.Function1[/* event */ MetricsTitle, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_pageerror(eventName: pageerror, handler: js.Function1[/* event */ js.Error, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_popup(eventName: popup, handler: js.Function1[/* event */ this.type, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_request(eventName: request, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_requestfailed(eventName: requestfailed, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_requestfinished(eventName: requestfinished, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_requestservedfromcache(eventName: requestservedfromcache, handler: js.Function1[/* event */ HTTPRequest, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_response(eventName: response, handler: js.Function1[/* event */ HTTPResponse, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_workercreated(eventName: workercreated, handler: js.Function1[/* event */ WebWorker, Unit]): EventEmitter = js.native
  @JSName("once")
  def once_workerdestroyed(eventName: workerdestroyed, handler: js.Function1[/* event */ WebWorker, Unit]): EventEmitter = js.native
  
  /**
    * @param options -
    * @returns
    */
  def pdf(): js.Promise[Buffer] = js.native
  def pdf(options: PDFOptions): js.Promise[Buffer] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * This method iterates the JavaScript heap and finds all objects with the
    * given prototype.
    *
    * @example
    *
    * ```ts
    * // Create a Map object
    * await page.evaluate(() => (window.map = new Map()));
    * // Get a handle to the Map object prototype
    * const mapPrototype = await page.evaluateHandle(() => Map.prototype);
    * // Query all map instances into an array
    * const mapInstances = await page.queryObjects(mapPrototype);
    * // Count amount of map objects in heap
    * const count = await page.evaluate(maps => maps.length, mapInstances);
    * await mapInstances.dispose();
    * await mapPrototype.dispose();
    * ```
    *
    * @param prototypeHandle - a handle to the object prototype.
    * @returns Promise which resolves to a handle to an array of objects with
    * this prototype.
    */
  def queryObjects[Prototype](prototypeHandle: JSHandle[Prototype]): js.Promise[JSHandle[js.Array[Prototype]]] = js.native
  
  /**
    * @param options - Navigation parameters which might have the following
    * properties:
    * @returns Promise which resolves to the main resource response. In case of
    * multiple redirects, the navigation will resolve with the response of the
    * last redirect.
    * @remarks
    * The argument `options` might have the following properties:
    *
    * - `timeout` : Maximum navigation time in milliseconds, defaults to 30
    *   seconds, pass 0 to disable timeout. The default value can be changed by
    *   using the {@link Page.setDefaultNavigationTimeout} or
    *   {@link Page.setDefaultTimeout} methods.
    *
    * - `waitUntil`: When to consider navigation succeeded, defaults to `load`.
    *   Given an array of event strings, navigation is considered to be
    *   successful after all events have been fired. Events can be either:<br/>
    * - `load` : consider navigation to be finished when the load event is
    *   fired.<br/>
    * - `domcontentloaded` : consider navigation to be finished when the
    *   DOMContentLoaded event is fired.<br/>
    * - `networkidle0` : consider navigation to be finished when there are no
    *   more than 0 network connections for at least `500` ms.<br/>
    * - `networkidle2` : consider navigation to be finished when there are no
    *   more than 2 network connections for at least `500` ms.
    */
  def reload(): js.Promise[HTTPResponse | Null] = js.native
  def reload(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
  
  /**
    * @remarks
    * Options object which might have the following properties:
    *
    * - `path` : The file path to save the image to. The screenshot type
    *   will be inferred from file extension. If `path` is a relative path, then
    *   it is resolved relative to
    *   {@link https://nodejs.org/api/process.html#process_process_cwd
    *   | current working directory}.
    *   If no path is provided, the image won't be saved to the disk.
    *
    * - `type` : Specify screenshot type, can be either `jpeg` or `png`.
    *   Defaults to 'png'.
    *
    * - `quality` : The quality of the image, between 0-100. Not
    *   applicable to `png` images.
    *
    * - `fullPage` : When true, takes a screenshot of the full
    *   scrollable page. Defaults to `false`.
    *
    * - `clip` : An object which specifies clipping region of the page.
    *   Should have the following fields:<br/>
    * - `x` : x-coordinate of top-left corner of clip area.<br/>
    * - `y` : y-coordinate of top-left corner of clip area.<br/>
    * - `width` : width of clipping area.<br/>
    * - `height` : height of clipping area.
    *
    * - `omitBackground` : Hides default white background and allows
    *   capturing screenshots with transparency. Defaults to `false`.
    *
    * - `encoding` : The encoding of the image, can be either base64 or
    *   binary. Defaults to `binary`.
    *
    * - `captureBeyondViewport` : When true, captures screenshot
    *   {@link https://chromedevtools.github.io/devtools-protocol/tot/Page/#method-captureScreenshot
    *   | beyond the viewport}. When false, falls back to old behaviour,
    *   and cuts the screenshot by the viewport size. Defaults to `true`.
    *
    * - `fromSurface` : When true, captures screenshot
    *   {@link https://chromedevtools.github.io/devtools-protocol/tot/Page/#method-captureScreenshot
    *   | from the surface rather than the view}. When false, works only in
    *   headful mode and ignores page viewport (but not browser window's
    *   bounds). Defaults to `true`.
    *
    * NOTE: Screenshots take at least 1/6 second on OS X. See
    * {@link https://crbug.com/741689} for discussion.
    * @returns Promise which resolves to buffer or a base64 string (depending on
    * the value of `encoding`) with captured screenshot.
    */
  def screenshot(): js.Promise[Buffer | String] = js.native
  def screenshot(options: ScreenshotOptions): js.Promise[Buffer | String] = js.native
  
  /**
    * Triggers a `change` and `input` event once all the provided options have been
    * selected. If there's no `<select>` element matching `selector`, the method
    * throws an error.
    *
    * @example
    *
    * ```ts
    * page.select('select#colors', 'blue'); // single selection
    * page.select('select#colors', 'red', 'green', 'blue'); // multiple selections
    * ```
    *
    * @param selector - A
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | Selector}
    * to query the page for
    * @param values - Values of options to select. If the `<select>` has the
    * `multiple` attribute, all values are considered, otherwise only the first one
    * is taken into account.
    * @returns
    *
    * @remarks
    * Shortcut for {@link Frame.select | page.mainFrame().select()}
    */
  def select(selector: String, values: String*): js.Promise[js.Array[String]] = js.native
  
  /**
    * Toggles bypassing page's Content-Security-Policy.
    * @param enabled - sets bypassing of page's Content-Security-Policy.
    * @remarks
    * NOTE: CSP bypassing happens at the moment of CSP initialization rather than
    * evaluation. Usually, this means that `page.setBypassCSP` should be called
    * before navigating to the domain.
    */
  def setBypassCSP(enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Toggles ignoring cache for each request based on the enabled state. By
    * default, caching is enabled.
    * @param enabled - sets the `enabled` state of cache
    * @defaultValue true
    */
  def setCacheEnabled(): js.Promise[Unit] = js.native
  def setCacheEnabled(enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * @param html - HTML markup to assign to the page.
    * @param options - Parameters that has some properties.
    * @remarks
    * The parameter `options` might have the following options.
    *
    * - `timeout` : Maximum time in milliseconds for resources to load, defaults
    *   to 30 seconds, pass `0` to disable timeout. The default value can be
    *   changed by using the {@link Page.setDefaultNavigationTimeout} or
    *   {@link Page.setDefaultTimeout} methods.
    *
    * - `waitUntil`: When to consider setting markup succeeded, defaults to
    *   `load`. Given an array of event strings, setting content is considered
    *   to be successful after all events have been fired. Events can be
    *   either:<br/>
    * - `load` : consider setting content to be finished when the `load` event
    *   is fired.<br/>
    * - `domcontentloaded` : consider setting content to be finished when the
    *   `DOMContentLoaded` event is fired.<br/>
    * - `networkidle0` : consider setting content to be finished when there are
    *   no more than 0 network connections for at least `500` ms.<br/>
    * - `networkidle2` : consider setting content to be finished when there are
    *   no more than 2 network connections for at least `500` ms.
    */
  def setContent(html: String): js.Promise[Unit] = js.native
  def setContent(html: String, options: WaitForOptions): js.Promise[Unit] = js.native
  
  /**
    * @example
    *
    * ```ts
    * await page.setCookie(cookieObject1, cookieObject2);
    * ```
    */
  def setCookie(cookies: CookieParam*): js.Promise[Unit] = js.native
  
  /**
    * This setting will change the default maximum navigation time for the
    * following methods and related shortcuts:
    *
    * - {@link Page.goBack | page.goBack(options)}
    *
    * - {@link Page.goForward | page.goForward(options)}
    *
    * - {@link Page.goto | page.goto(url,options)}
    *
    * - {@link Page.reload | page.reload(options)}
    *
    * - {@link Page.setContent | page.setContent(html,options)}
    *
    * - {@link Page.waitForNavigation | page.waitForNavigation(options)}
    *   @param timeout - Maximum navigation time in milliseconds.
    */
  def setDefaultNavigationTimeout(timeout: Double): Unit = js.native
  
  /**
    * @param timeout - Maximum time in milliseconds.
    */
  def setDefaultTimeout(timeout: Double): Unit = js.native
  
  /**
    * @param enabled - Whether to enable drag interception.
    *
    * @remarks
    * Activating drag interception enables the `Input.drag`,
    * methods This provides the capability to capture drag events emitted
    * on the page, which can then be used to simulate drag-and-drop.
    */
  def setDragInterception(enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * The extra HTTP headers will be sent with every request the page initiates.
    *
    * :::tip
    *
    * All HTTP header names are lowercased. (HTTP headers are
    * case-insensitive, so this shouldn’t impact your server code.)
    *
    * :::
    *
    * :::note
    *
    * page.setExtraHTTPHeaders does not guarantee the order of headers in
    * the outgoing requests.
    *
    * :::
    *
    * @param headers - An object containing additional HTTP headers to be sent
    * with every request. All header values must be strings.
    */
  def setExtraHTTPHeaders(headers: Record[String, String]): js.Promise[Unit] = js.native
  
  /**
    * Sets the page's geolocation.
    *
    * @remarks
    * Consider using {@link BrowserContext.overridePermissions} to grant
    * permissions for the page to read its geolocation.
    *
    * @example
    *
    * ```ts
    * await page.setGeolocation({latitude: 59.95, longitude: 30.31667});
    * ```
    */
  def setGeolocation(options: GeolocationOptions): js.Promise[Unit] = js.native
  
  /**
    * @param enabled - Whether or not to enable JavaScript on the page.
    * @remarks
    * NOTE: changing this value won't affect scripts that have already been run.
    * It will take full effect on the next navigation.
    */
  def setJavaScriptEnabled(enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Sets the network connection to offline.
    *
    * It does not change the parameters used in {@link Page.emulateNetworkConditions}
    *
    * @param enabled - When `true`, enables offline mode for the page.
    */
  def setOfflineMode(enabled: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Activating request interception enables {@link HTTPRequest.abort},
    * {@link HTTPRequest.continue} and {@link HTTPRequest.respond} methods. This
    * provides the capability to modify network requests that are made by a page.
    *
    * Once request interception is enabled, every request will stall unless it's
    * continued, responded or aborted; or completed using the browser cache.
    *
    * Enabling request interception disables page caching.
    *
    * See the
    * {@link https://pptr.dev/next/guides/request-interception|Request interception guide}
    * for more details.
    *
    * @example
    * An example of a naïve request interceptor that aborts all image requests:
    *
    * ```ts
    * const puppeteer = require('puppeteer');
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   await page.setRequestInterception(true);
    *   page.on('request', interceptedRequest => {
    *     if (
    *       interceptedRequest.url().endsWith('.png') ||
    *       interceptedRequest.url().endsWith('.jpg')
    *     )
    *       interceptedRequest.abort();
    *     else interceptedRequest.continue();
    *   });
    *   await page.goto('https://example.com');
    *   await browser.close();
    * })();
    * ```
    *
    * @param value - Whether to enable request interception.
    */
  def setRequestInterception(value: Boolean): js.Promise[Unit] = js.native
  
  /**
    * @param userAgent - Specific user agent to use in this page
    * @param userAgentData - Specific user agent client hint data to use in this
    * page
    * @returns Promise which resolves when the user agent is set.
    */
  def setUserAgent(userAgent: String): js.Promise[Unit] = js.native
  def setUserAgent(userAgent: String, userAgentMetadata: UserAgentMetadata): js.Promise[Unit] = js.native
  
  /**
    * `page.setViewport` will resize the page. A lot of websites don't expect
    * phones to change size, so you should set the viewport before navigating to
    * the page.
    *
    * In the case of multiple pages in a single browser, each page can have its
    * own viewport size.
    * @example
    *
    * ```ts
    * const page = await browser.newPage();
    * await page.setViewport({
    *   width: 640,
    *   height: 480,
    *   deviceScaleFactor: 1,
    * });
    * await page.goto('https://example.com');
    * ```
    *
    * @param viewport -
    * @remarks
    * Argument viewport have following properties:
    *
    * - `width`: page width in pixels. required
    *
    * - `height`: page height in pixels. required
    *
    * - `deviceScaleFactor`: Specify device scale factor (can be thought of as
    *   DPR). Defaults to `1`.
    *
    * - `isMobile`: Whether the meta viewport tag is taken into account. Defaults
    *   to `false`.
    *
    * - `hasTouch`: Specifies if viewport supports touch events. Defaults to `false`
    *
    * - `isLandScape`: Specifies if viewport is in landscape mode. Defaults to false.
    *
    * NOTE: in certain cases, setting viewport will reload the page in order to
    * set the isMobile or hasTouch properties.
    */
  def setViewport(viewport: Viewport): js.Promise[Unit] = js.native
  
  /**
    * This method fetches an element with `selector`, scrolls it into view if
    * needed, and then uses {@link Page.touchscreen} to tap in the center of the element.
    * If there's no element matching `selector`, the method throws an error.
    * @param selector - A
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | Selector}
    * to search for element to tap. If there are multiple elements satisfying the
    * selector, the first will be tapped.
    * @returns
    * @remarks
    * Shortcut for {@link Frame.tap | page.mainFrame().tap(selector)}.
    */
  def tap(selector: String): js.Promise[Unit] = js.native
  
  /**
    * @returns A target this page was created from.
    */
  def target(): Target = js.native
  
  /**
    * @returns The page's title
    * @remarks
    * Shortcut for {@link Frame.title | page.mainFrame().title()}.
    */
  def title(): js.Promise[String] = js.native
  
  def touchscreen: Touchscreen = js.native
  
  def tracing: Tracing = js.native
  
  /**
    * Sends a `keydown`, `keypress/input`, and `keyup` event for each character
    * in the text.
    *
    * To press a special key, like `Control` or `ArrowDown`, use {@link Keyboard.press}.
    * @example
    *
    * ```ts
    * await page.type('#mytextarea', 'Hello');
    * // Types instantly
    * await page.type('#mytextarea', 'World', {delay: 100});
    * // Types slower, like a user
    * ```
    *
    * @param selector - A
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
    * of an element to type into. If there are multiple elements satisfying the
    * selector, the first will be used.
    * @param text - A text to type into a focused element.
    * @param options - have property `delay` which is the Time to wait between
    * key presses in milliseconds. Defaults to `0`.
    * @returns
    * @remarks
    */
  def `type`(selector: String, text: String): js.Promise[Unit] = js.native
  def `type`(selector: String, text: String, options: Delay): js.Promise[Unit] = js.native
  
  /**
    *
    * @returns
    * @remarks Shortcut for
    * {@link Frame.url | page.mainFrame().url()}.
    */
  def url(): String = js.native
  
  /**
    * @returns
    *
    * - `width`: page's width in pixels
    *
    * - `height`: page's height in pixels
    *
    * - `deviceScalarFactor`: Specify device scale factor (can be though of as
    *   dpr). Defaults to `1`.
    *
    * - `isMobile`: Whether the meta viewport tag is taken into account. Defaults
    *   to `false`.
    *
    * - `hasTouch`: Specifies if viewport supports touch events. Defaults to
    *   `false`.
    *
    * - `isLandScape`: Specifies if viewport is in landscape mode. Defaults to
    *   `false`.
    */
  def viewport(): Viewport | Null = js.native
  
  /**
    * This method is typically coupled with an action that triggers file
    * choosing.
    *
    * :::caution
    *
    * This must be called before the file chooser is launched. It will not return
    * a currently active file chooser.
    *
    * :::
    *
    * @remarks
    * In non-headless Chromium, this method results in the native file picker
    * dialog `not showing up` for the user.
    *
    * @example
    * The following example clicks a button that issues a file chooser
    * and then responds with `/tmp/myfile.pdf` as if a user has selected this file.
    *
    * ```ts
    * const [fileChooser] = await Promise.all([
    *   page.waitForFileChooser(),
    *   page.click('#upload-file-button'),
    *   // some button that triggers file selection
    * ]);
    * await fileChooser.accept(['/tmp/myfile.pdf']);
    * ```
    */
  def waitForFileChooser(): js.Promise[FileChooser] = js.native
  def waitForFileChooser(options: WaitTimeoutOptions): js.Promise[FileChooser] = js.native
  
  /**
    * @param urlOrPredicate - A URL or predicate to wait for.
    * @param options - Optional waiting parameters
    * @returns Promise which resolves to the matched frame.
    * @example
    *
    * ```ts
    * const frame = await page.waitForFrame(async frame => {
    *   return frame.name() === 'Test';
    * });
    * ```
    *
    * @remarks
    * Optional Parameter have:
    *
    * - `timeout`: Maximum wait time in milliseconds, defaults to `30` seconds,
    *   pass `0` to disable the timeout. The default value can be changed by using
    *   the {@link Page.setDefaultTimeout} method.
    */
  def waitForFrame(urlOrPredicate: String): js.Promise[Frame] = js.native
  def waitForFrame(urlOrPredicate: String, options: Timeout): js.Promise[Frame] = js.native
  def waitForFrame(urlOrPredicate: js.Function1[/* frame */ Frame, Boolean | js.Promise[Boolean]]): js.Promise[Frame] = js.native
  def waitForFrame(urlOrPredicate: js.Function1[/* frame */ Frame, Boolean | js.Promise[Boolean]], options: Timeout): js.Promise[Frame] = js.native
  
  def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: Func,
    options: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  /**
    * Waits for a function to finish evaluating in the page's context.
    *
    * @example
    * The {@link Page.waitForFunction} can be used to observe viewport size change:
    *
    * ```ts
    * const puppeteer = require('puppeteer');
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   const watchDog = page.waitForFunction('window.innerWidth < 100');
    *   await page.setViewport({width: 50, height: 50});
    *   await watchDog;
    *   await browser.close();
    * })();
    * ```
    *
    * @example
    * To pass arguments from node.js to the predicate of
    * {@link Page.waitForFunction} function:
    *
    * ```ts
    * const selector = '.foo';
    * await page.waitForFunction(
    *   selector => !!document.querySelector(selector),
    *   {},
    *   selector
    * );
    * ```
    *
    * @example
    * The predicate of {@link Page.waitForFunction} can be asynchronous too:
    *
    * ```ts
    * const username = 'github-username';
    * await page.waitForFunction(
    *   async username => {
    *     const githubResponse = await fetch(
    *       `https://api.github.com/users/${username}`
    *     );
    *     const githubUser = await githubResponse.json();
    *     // show the avatar
    *     const img = document.createElement('img');
    *     img.src = githubUser.avatar_url;
    *     // wait 3 seconds
    *     await new Promise((resolve, reject) => setTimeout(resolve, 3000));
    *     img.remove();
    *   },
    *   {},
    *   username
    * );
    * ```
    *
    * @param pageFunction - Function to be evaluated in browser context
    * @param options - Options for configuring waiting behavior.
    */
  def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: Func,
    options: FrameWaitForFunctionOptions,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: String,
    options: Unit,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  def waitForFunction[Params /* <: js.Array[Any] */, Func /* <: EvaluateFunc[Params] */](
    pageFunction: String,
    options: FrameWaitForFunctionOptions,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Params is not an array type */ args: Params
  ): js.Promise[HandleFor[Awaited[ReturnType[Func]]]] = js.native
  
  /**
    * Waits for the page to navigate to a new URL or to reload. It is useful when
    * you run code that will indirectly cause the page to navigate.
    *
    * @example
    *
    * ```ts
    * const [response] = await Promise.all([
    *   page.waitForNavigation(), // The promise resolves after navigation has finished
    *   page.click('a.my-link'), // Clicking the link will indirectly cause a navigation
    * ]);
    * ```
    *
    * @remarks
    * Usage of the
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/History_API | History API}
    * to change the URL is considered a navigation.
    *
    * @param options - Navigation parameters which might have the following
    * properties:
    * @returns A `Promise` which resolves to the main resource response.
    *
    * - In case of multiple redirects, the navigation will resolve with the
    *   response of the last redirect.
    * - In case of navigation to a different anchor or navigation due to History
    *   API usage, the navigation will resolve with `null`.
    */
  def waitForNavigation(): js.Promise[HTTPResponse | Null] = js.native
  def waitForNavigation(options: WaitForOptions): js.Promise[HTTPResponse | Null] = js.native
  
  /**
    * @param options - Optional waiting parameters
    * @returns Promise which resolves when network is idle
    */
  def waitForNetworkIdle(): js.Promise[Unit] = js.native
  def waitForNetworkIdle(options: IdleTime): js.Promise[Unit] = js.native
  
  /**
    * @param urlOrPredicate - A URL or predicate to wait for
    * @param options - Optional waiting parameters
    * @returns Promise which resolves to the matched request
    * @example
    *
    * ```ts
    * const firstRequest = await page.waitForRequest(
    *   'https://example.com/resource'
    * );
    * const finalRequest = await page.waitForRequest(
    *   request => request.url() === 'https://example.com'
    * );
    * return finalRequest.response()?.ok();
    * ```
    *
    * @remarks
    * Optional Waiting Parameters have:
    *
    * - `timeout`: Maximum wait time in milliseconds, defaults to `30` seconds, pass
    *   `0` to disable the timeout. The default value can be changed by using the
    *   {@link Page.setDefaultTimeout} method.
    */
  def waitForRequest(urlOrPredicate: String): js.Promise[HTTPRequest] = js.native
  def waitForRequest(urlOrPredicate: String, options: Timeout): js.Promise[HTTPRequest] = js.native
  def waitForRequest(urlOrPredicate: js.Function1[/* req */ HTTPRequest, Boolean | js.Promise[Boolean]]): js.Promise[HTTPRequest] = js.native
  def waitForRequest(
    urlOrPredicate: js.Function1[/* req */ HTTPRequest, Boolean | js.Promise[Boolean]],
    options: Timeout
  ): js.Promise[HTTPRequest] = js.native
  
  /**
    * @param urlOrPredicate - A URL or predicate to wait for.
    * @param options - Optional waiting parameters
    * @returns Promise which resolves to the matched response.
    * @example
    *
    * ```ts
    * const firstResponse = await page.waitForResponse(
    *   'https://example.com/resource'
    * );
    * const finalResponse = await page.waitForResponse(
    *   response =>
    *     response.url() === 'https://example.com' && response.status() === 200
    * );
    * const finalResponse = await page.waitForResponse(async response => {
    *   return (await response.text()).includes('<html>');
    * });
    * return finalResponse.ok();
    * ```
    *
    * @remarks
    * Optional Parameter have:
    *
    * - `timeout`: Maximum wait time in milliseconds, defaults to `30` seconds,
    *   pass `0` to disable the timeout. The default value can be changed by using
    *   the {@link Page.setDefaultTimeout} method.
    */
  def waitForResponse(urlOrPredicate: String): js.Promise[HTTPResponse] = js.native
  def waitForResponse(urlOrPredicate: String, options: Timeout): js.Promise[HTTPResponse] = js.native
  def waitForResponse(urlOrPredicate: js.Function1[/* res */ HTTPResponse, Boolean | js.Promise[Boolean]]): js.Promise[HTTPResponse] = js.native
  def waitForResponse(
    urlOrPredicate: js.Function1[/* res */ HTTPResponse, Boolean | js.Promise[Boolean]],
    options: Timeout
  ): js.Promise[HTTPResponse] = js.native
  
  /**
    * Wait for the `selector` to appear in page. If at the moment of calling the
    * method the `selector` already exists, the method will return immediately. If
    * the `selector` doesn't appear after the `timeout` milliseconds of waiting, the
    * function will throw.
    *
    * This method works across navigations:
    *
    * ```ts
    * const puppeteer = require('puppeteer');
    * (async () => {
    *   const browser = await puppeteer.launch();
    *   const page = await browser.newPage();
    *   let currentURL;
    *   page
    *     .waitForSelector('img')
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
    * @param selector - A
    * {@link https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Selectors | selector}
    * of an element to wait for
    * @param options - Optional waiting parameters
    * @returns Promise which resolves when element specified by selector string
    * is added to DOM. Resolves to `null` if waiting for hidden: `true` and
    * selector is not found in DOM.
    * @remarks
    * The optional Parameter in Arguments `options` are :
    *
    * - `Visible`: A boolean wait for element to be present in DOM and to be
    *   visible, i.e. to not have `display: none` or `visibility: hidden` CSS
    *   properties. Defaults to `false`.
    *
    * - `hidden`: Wait for element to not be found in the DOM or to be hidden,
    *   i.e. have `display: none` or `visibility: hidden` CSS properties. Defaults to
    *   `false`.
    *
    * - `timeout`: maximum time to wait for in milliseconds. Defaults to `30000`
    *   (30 seconds). Pass `0` to disable timeout. The default value can be changed
    *   by using the {@link Page.setDefaultTimeout} method.
    */
  def waitForSelector[Selector /* <: String */](selector: Selector): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
  def waitForSelector[Selector /* <: String */](selector: Selector, options: WaitForSelectorOptions): js.Promise[ElementHandle[NodeFor[Selector]] | Null] = js.native
  
  /**
    * @deprecated Replace with `new Promise(r => setTimeout(r, milliseconds));`.
    *
    * Causes your script to wait for the given number of milliseconds.
    *
    * @remarks
    * It's generally recommended to not wait for a number of seconds, but instead
    * use {@link Frame.waitForSelector}, {@link Frame.waitForXPath} or
    * {@link Frame.waitForFunction} to wait for exactly the conditions you want.
    *
    * @example
    *
    * Wait for 1 second:
    *
    * ```ts
    * await page.waitForTimeout(1000);
    * ```
    *
    * @param milliseconds - the number of milliseconds to wait.
    */
  def waitForTimeout(milliseconds: Double): js.Promise[Unit] = js.native
  
  /**
    * Wait for the `xpath` to appear in page. If at the moment of calling the
    * method the `xpath` already exists, the method will return immediately. If
    * the `xpath` doesn't appear after the `timeout` milliseconds of waiting, the
    * function will throw.
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
    *   Defaults to `30000` (30 seconds). Pass `0` to disable timeout. The default
    *   value can be changed by using the {@link Page.setDefaultTimeout} method.
    */
  def waitForXPath(xpath: String): js.Promise[ElementHandle[Node] | Null] = js.native
  def waitForXPath(xpath: String, options: Hidden): js.Promise[ElementHandle[Node] | Null] = js.native
  
  /**
    * @returns all of the dedicated {@link
    * https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API |
    * WebWorkers} associated with the page.
    *
    * @remarks
    * This does not contain ServiceWorkers
    */
  def workers(): js.Array[WebWorker] = js.native
}
