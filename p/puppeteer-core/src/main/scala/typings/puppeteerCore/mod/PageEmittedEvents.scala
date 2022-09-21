package typings.puppeteerCore.mod

import typings.puppeteerCore.puppeteerCoreStrings.close
import typings.puppeteerCore.puppeteerCoreStrings.console
import typings.puppeteerCore.puppeteerCoreStrings.dialog
import typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
import typings.puppeteerCore.puppeteerCoreStrings.error
import typings.puppeteerCore.puppeteerCoreStrings.frameattached
import typings.puppeteerCore.puppeteerCoreStrings.framedetached
import typings.puppeteerCore.puppeteerCoreStrings.framenavigated
import typings.puppeteerCore.puppeteerCoreStrings.load
import typings.puppeteerCore.puppeteerCoreStrings.metrics
import typings.puppeteerCore.puppeteerCoreStrings.pageerror
import typings.puppeteerCore.puppeteerCoreStrings.popup
import typings.puppeteerCore.puppeteerCoreStrings.request
import typings.puppeteerCore.puppeteerCoreStrings.requestfailed
import typings.puppeteerCore.puppeteerCoreStrings.requestfinished
import typings.puppeteerCore.puppeteerCoreStrings.requestservedfromcache
import typings.puppeteerCore.puppeteerCoreStrings.response
import typings.puppeteerCore.puppeteerCoreStrings.workercreated
import typings.puppeteerCore.puppeteerCoreStrings.workerdestroyed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.puppeteerCore.puppeteerCoreStrings.close
  - typings.puppeteerCore.puppeteerCoreStrings.console
  - typings.puppeteerCore.puppeteerCoreStrings.dialog
  - typings.puppeteerCore.puppeteerCoreStrings.domcontentloaded_
  - typings.puppeteerCore.puppeteerCoreStrings.error
  - typings.puppeteerCore.puppeteerCoreStrings.frameattached
  - typings.puppeteerCore.puppeteerCoreStrings.framedetached
  - typings.puppeteerCore.puppeteerCoreStrings.framenavigated
  - typings.puppeteerCore.puppeteerCoreStrings.load
  - typings.puppeteerCore.puppeteerCoreStrings.metrics
  - typings.puppeteerCore.puppeteerCoreStrings.pageerror
  - typings.puppeteerCore.puppeteerCoreStrings.popup
  - typings.puppeteerCore.puppeteerCoreStrings.request
  - typings.puppeteerCore.puppeteerCoreStrings.requestservedfromcache
  - typings.puppeteerCore.puppeteerCoreStrings.requestfailed
  - typings.puppeteerCore.puppeteerCoreStrings.requestfinished
  - typings.puppeteerCore.puppeteerCoreStrings.response
  - typings.puppeteerCore.puppeteerCoreStrings.workercreated
  - typings.puppeteerCore.puppeteerCoreStrings.workerdestroyed
*/
trait PageEmittedEvents extends StObject
object PageEmittedEvents {
  
  /**
    * Emitted when the page closes.
    * @eventProperty
    */
  inline def Close: close = "close".asInstanceOf[close]
  
  /**
    * Emitted when JavaScript within the page calls one of console API methods,
    * e.g. `console.log` or `console.dir`. Also emitted if the page throws an
    * error or a warning.
    *
    * @remarks
    * A `console` event provides a {@link ConsoleMessage} representing the
    * console message that was logged.
    *
    * @example
    * An example of handling `console` event:
    *
    * ```ts
    * page.on('console', msg => {
    *   for (let i = 0; i < msg.args().length; ++i)
    *     console.log(`${i}: ${msg.args()[i]}`);
    * });
    * page.evaluate(() => console.log('hello', 5, {foo: 'bar'}));
    * ```
    */
  inline def Console: console = "console".asInstanceOf[console]
  
  /**
    * Emitted when the JavaScript
    * {@link https://developer.mozilla.org/en-US/docs/Web/Events/DOMContentLoaded | DOMContentLoaded }
    * event is dispatched.
    */
  inline def DOMContentLoaded: domcontentloaded_ = "domcontentloaded".asInstanceOf[domcontentloaded_]
  
  /**
    * Emitted when a JavaScript dialog appears, such as `alert`, `prompt`,
    * `confirm` or `beforeunload`. Puppeteer can respond to the dialog via
    * {@link Dialog.accept} or {@link Dialog.dismiss}.
    */
  inline def Dialog: dialog = "dialog".asInstanceOf[dialog]
  
  /**
    * Emitted when the page crashes. Will contain an `Error`.
    */
  inline def Error: error = "error".asInstanceOf[error]
  
  /** Emitted when a frame is attached. Will contain a {@link Frame}. */
  inline def FrameAttached: frameattached = "frameattached".asInstanceOf[frameattached]
  
  /** Emitted when a frame is detached. Will contain a {@link Frame}. */
  inline def FrameDetached: framedetached = "framedetached".asInstanceOf[framedetached]
  
  /**
    * Emitted when a frame is navigated to a new URL. Will contain a
    * {@link Frame}.
    */
  inline def FrameNavigated: framenavigated = "framenavigated".asInstanceOf[framenavigated]
  
  /**
    * Emitted when the JavaScript
    * {@link https://developer.mozilla.org/en-US/docs/Web/Events/load | load}
    * event is dispatched.
    */
  inline def Load: load = "load".asInstanceOf[load]
  
  /**
    * Emitted when the JavaScript code makes a call to `console.timeStamp`. For
    * the list of metrics see {@link Page.metrics | page.metrics}.
    *
    * @remarks
    * Contains an object with two properties:
    *
    * - `title`: the title passed to `console.timeStamp`
    * - `metrics`: objec containing metrics as key/value pairs. The values will
    *   be `number`s.
    */
  inline def Metrics: metrics = "metrics".asInstanceOf[metrics]
  
  /**
    * Emitted when an uncaught exception happens within the page. Contains an
    * `Error`.
    */
  inline def PageError: pageerror = "pageerror".asInstanceOf[pageerror]
  
  /**
    * Emitted when the page opens a new tab or window.
    *
    * Contains a {@link Page} corresponding to the popup window.
    *
    * @example
    *
    * ```ts
    * const [popup] = await Promise.all([
    *   new Promise(resolve => page.once('popup', resolve)),
    *   page.click('a[target=_blank]'),
    * ]);
    * ```
    *
    * ```ts
    * const [popup] = await Promise.all([
    *   new Promise(resolve => page.once('popup', resolve)),
    *   page.evaluate(() => window.open('https://example.com')),
    * ]);
    * ```
    */
  inline def Popup: popup = "popup".asInstanceOf[popup]
  
  /**
    * Emitted when a page issues a request and contains a {@link HTTPRequest}.
    *
    * @remarks
    * The object is readonly. See {@link Page.setRequestInterception} for
    * intercepting and mutating requests.
    */
  inline def Request: request = "request".asInstanceOf[request]
  
  /**
    * Emitted when a request fails, for example by timing out.
    *
    * Contains a {@link HTTPRequest}.
    *
    * @remarks
    * HTTP Error responses, such as 404 or 503, are still successful responses
    * from HTTP standpoint, so request will complete with `requestfinished` event
    * and not with `requestfailed`.
    */
  inline def RequestFailed: requestfailed = "requestfailed".asInstanceOf[requestfailed]
  
  /**
    * Emitted when a request finishes successfully. Contains a
    * {@link HTTPRequest}.
    */
  inline def RequestFinished: requestfinished = "requestfinished".asInstanceOf[requestfinished]
  
  /**
    * Emitted when a request ended up loading from cache. Contains a
    * {@link HTTPRequest}.
    *
    * @remarks
    * For certain requests, might contain undefined.
    * {@link https://crbug.com/750469}
    */
  inline def RequestServedFromCache: requestservedfromcache = "requestservedfromcache".asInstanceOf[requestservedfromcache]
  
  /**
    * Emitted when a response is received. Contains a {@link HTTPResponse}.
    */
  inline def Response: response = "response".asInstanceOf[response]
  
  /**
    * Emitted when a dedicated
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API | WebWorker}
    * is spawned by the page.
    */
  inline def WorkerCreated: workercreated = "workercreated".asInstanceOf[workercreated]
  
  /**
    * Emitted when a dedicated
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API | WebWorker}
    * is destroyed by the page.
    */
  inline def WorkerDestroyed: workerdestroyed = "workerdestroyed".asInstanceOf[workerdestroyed]
}
