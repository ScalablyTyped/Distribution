package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeouts extends js.Object {
  /**
    * Specifies the amount of time in milliseconds the driver should wait when
    * searching for an element if it is not immediately present.
    * <p/>
    * When searching for a single element, the driver should poll the page
    * until the element has been found, or this timeout expires before failing
    * with a {@code bot.ErrorCode.NO_SUCH_ELEMENT} error. When searching
    * for multiple elements, the driver should poll the page until at least one
    * element has been found or this timeout has expired.
    * <p/>
    * Setting the wait timeout to 0 (its default value), disables implicit
    * waiting.
    * <p/>
    * Increasing the implicit wait timeout should be used judiciously as it
    * will have an adverse effect on test run time, especially when used with
    * slower location strategies like XPath.
    */
  var `implicit`: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the amount of time to wait, in milliseconds, for a page load to
    * complete before returning an error.  If the timeout is negative,
    * page loads may be indefinite.
    */
  var pageLoad: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the amount of time to wait, in milliseconds, for an asynchronous
    * script to finish execution before returning an error. If the timeout is
    * less than or equal to 0, the script will be allowed to run indefinitely.
    */
  var script: js.UndefOr[scala.Double] = js.undefined
}

object ITimeouts {
  @scala.inline
  def apply(
    `implicit`: scala.Int | scala.Double = null,
    pageLoad: scala.Int | scala.Double = null,
    script: scala.Int | scala.Double = null
  ): ITimeouts = {
    val __obj = js.Dynamic.literal()
    if (`implicit` != null) __obj.updateDynamic("implicit")(`implicit`.asInstanceOf[js.Any])
    if (pageLoad != null) __obj.updateDynamic("pageLoad")(pageLoad.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeouts]
  }
}

