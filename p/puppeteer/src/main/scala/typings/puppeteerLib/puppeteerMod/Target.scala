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
  def createCDPSession(): stdLib.Promise[CDPSession]
  /** Get the target that opened this target. Top-level targets return `null`. */
  def opener(): Target | scala.Null
  /** Returns the target `Page` or a `null` if the type of the page is not "page". */
  def page(): stdLib.Promise[Page]
  /** Identifies what kind of target this is.  */
  def `type`(): TargetType
  /** Returns the target URL. */
  def url(): java.lang.String
}

