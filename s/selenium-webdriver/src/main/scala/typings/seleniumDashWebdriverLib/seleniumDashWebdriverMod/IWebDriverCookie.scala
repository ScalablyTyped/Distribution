package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebDriverCookie extends IWebDriverOptionsCookie {
  /**
    * When the cookie expires.
    *
    * The expiry is always returned in seconds since epoch when
    * {@linkplain Options#getCookies() retrieving cookies} from the browser.
    *
    * @type {(!number|undefined)}
    */
  @JSName("expiry")
  var expiry_IWebDriverCookie: js.UndefOr[scala.Double] = js.undefined
}

