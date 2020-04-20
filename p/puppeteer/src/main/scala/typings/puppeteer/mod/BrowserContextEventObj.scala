package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserContextEventObj extends js.Object {
  /** Emitted when the url of a target inside the browser context changes. */
  var targetchanged: Target
  /** Emitted when a target is created, for example when a new page is opened by `window.open` or `browserContext.newPage`. */
  var targetcreated: Target
  /** Emitted when a target is destroyed, for example when a page is closed. */
  var targetdestroyed: Target
}

object BrowserContextEventObj {
  @scala.inline
  def apply(targetchanged: Target, targetcreated: Target, targetdestroyed: Target): BrowserContextEventObj = {
    val __obj = js.Dynamic.literal(targetchanged = targetchanged.asInstanceOf[js.Any], targetcreated = targetcreated.asInstanceOf[js.Any], targetdestroyed = targetdestroyed.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserContextEventObj]
  }
}

