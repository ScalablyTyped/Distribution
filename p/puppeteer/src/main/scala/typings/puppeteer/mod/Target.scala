package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /** Get the browser the target belongs to. */
  def browser(): Browser
  /** The browser context the target belongs to. */
  def browserContext(): BrowserContext
  /** Creates a Chrome Devtools Protocol session attached to the target. */
  def createCDPSession(): js.Promise[CDPSession]
  /** Get the target that opened this target. Top-level targets return `null`. */
  def opener(): Target | Null
  /** Returns the target `Page` or a `null` if the type of the page is not "page". */
  def page(): js.Promise[Page]
  /** Identifies what kind of target this is.  */
  def `type`(): TargetType
  /** Returns the target URL. */
  def url(): String
  /** If the target is not of type `service_worker` or `shared_worker`, resolves `null`. */
  def worker(): js.Promise[Worker | Null]
}

object Target {
  @scala.inline
  def apply(
    browser: () => Browser,
    browserContext: () => BrowserContext,
    createCDPSession: () => js.Promise[CDPSession],
    opener: () => Target | Null,
    page: () => js.Promise[Page],
    `type`: () => TargetType,
    url: () => String,
    worker: () => js.Promise[Worker | Null]
  ): Target = {
    val __obj = js.Dynamic.literal(browser = js.Any.fromFunction0(browser), browserContext = js.Any.fromFunction0(browserContext), createCDPSession = js.Any.fromFunction0(createCDPSession), opener = js.Any.fromFunction0(opener), page = js.Any.fromFunction0(page), url = js.Any.fromFunction0(url), worker = js.Any.fromFunction0(worker))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Target]
  }
}

