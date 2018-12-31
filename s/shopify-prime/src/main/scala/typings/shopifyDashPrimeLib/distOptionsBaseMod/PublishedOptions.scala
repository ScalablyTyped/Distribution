package typings
package shopifyDashPrimeLib.distOptionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishedOptions extends js.Object {
  /**
    * Filter results to those published before date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_max: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter results to those published after date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_min: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter results to those with the given publish status.
    */
  var published_status: js.UndefOr[shopifyDashPrimeLib.distEnumsPublishedUnderscoreStatusMod.PublishedStatus] = js.undefined
}

