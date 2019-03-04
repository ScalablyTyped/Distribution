package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageEventObj extends js.Object {
  /** Emitted when the page closes. */
  var close: js.UndefOr[scala.Nothing]
  /**
    * Emitted when JavaScript within the page calls one of console API methods, e.g. console.log or console.dir.
    * Also emitted if the page throws an error or a warning.
    */
  var console: ConsoleMessage
  /**
    * Emitted when a JavaScript dialog appears, such as alert, prompt, confirm or beforeunload.
    * Puppeteer can respond to the dialog via Dialog's accept or dismiss methods.
    */
  var dialog: Dialog
  /**
    * Emitted when the initial HTML document has been completely loaded and parsed,
    * without waiting for stylesheets, images, and subframes to finish loading.
    */
  var domcontentloaded: scala.Nothing
  /** Emitted when the page crashes. */
  var error: nodeLib.Error
  /** Emitted when a frame is attached. */
  var frameattached: Frame
  /** Emitted when a frame is detached. */
  var framedetached: Frame
  /** Emitted when a frame is navigated to a new url. */
  var framenavigated: Frame
  /** Emitted when the JavaScript load event is dispatched. */
  var load: js.UndefOr[scala.Nothing]
  /**
    * Emitted when the JavaScript code makes a call to `console.timeStamp`.
    * For the list of metrics see `page.metrics`.
    */
  var metrics: puppeteerLib.Anon_Metrics
  /** Emitted when an uncaught exception happens within the page. */
  var pageerror: nodeLib.Error
  /** Emitted when the page opens a new tab or window. */
  var popup: Page
  /**
    * Emitted when a page issues a request. The request object is read-only.
    * In order to intercept and mutate requests, see page.setRequestInterceptionEnabled.
    */
  var request: Request
  /** Emitted when a request fails, for example by timing out. */
  var requestfailed: Request
  /** Emitted when a request finishes successfully. */
  var requestfinished: Request
  /** Emitted when a response is received. */
  var response: Response
  /** Emitted when a dedicated WebWorker is spawned by the page. */
  var workercreated: Worker
  /** Emitted when a dedicated WebWorker is terminated. */
  var workerdestroyed: Worker
}

object PageEventObj {
  @scala.inline
  def apply(
    console: ConsoleMessage,
    dialog: Dialog,
    domcontentloaded: scala.Nothing,
    error: nodeLib.Error,
    frameattached: Frame,
    framedetached: Frame,
    framenavigated: Frame,
    metrics: puppeteerLib.Anon_Metrics,
    pageerror: nodeLib.Error,
    popup: Page,
    request: Request,
    requestfailed: Request,
    requestfinished: Request,
    response: Response,
    workercreated: Worker,
    workerdestroyed: Worker,
    close: js.UndefOr[scala.Nothing] = js.undefined,
    load: js.UndefOr[scala.Nothing] = js.undefined
  ): PageEventObj = {
    val __obj = js.Dynamic.literal(console = console, dialog = dialog, domcontentloaded = domcontentloaded, error = error, frameattached = frameattached, framedetached = framedetached, framenavigated = framenavigated, metrics = metrics, pageerror = pageerror, popup = popup, request = request, requestfailed = requestfailed, requestfinished = requestfinished, response = response, workercreated = workercreated, workerdestroyed = workerdestroyed)
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(load)) __obj.updateDynamic("load")(load)
    __obj.asInstanceOf[PageEventObj]
  }
}

