package typings
package puppeteerLib.puppeteerMod

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
  def opener(): Target | scala.Null
  /** Returns the target `Page` or a `null` if the type of the page is not "page". */
  def page(): js.Promise[Page]
  /** Identifies what kind of target this is.  */
  def `type`(): TargetType
  /** Returns the target URL. */
  def url(): java.lang.String
}

object Target {
  @scala.inline
  def apply(
    browser: js.Function0[Browser],
    browserContext: js.Function0[BrowserContext],
    createCDPSession: js.Function0[js.Promise[CDPSession]],
    opener: js.Function0[Target | scala.Null],
    page: js.Function0[js.Promise[Page]],
    `type`: js.Function0[TargetType],
    url: js.Function0[java.lang.String]
  ): Target = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("browser")(browser)
    __obj.updateDynamic("browserContext")(browserContext)
    __obj.updateDynamic("createCDPSession")(createCDPSession)
    __obj.updateDynamic("opener")(opener)
    __obj.updateDynamic("page")(page)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Target]
  }
}

