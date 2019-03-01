package typings
package shopifyDashPrimeLib.distOptionsBlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogListOptions extends js.Object {
  /**
    * Filter by blog handle.
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter results to after the specified ID,
    */
  var since_id: js.UndefOr[scala.Double] = js.undefined
}

object BlogListOptions {
  @scala.inline
  def apply(handle: java.lang.String = null, since_id: scala.Int | scala.Double = null): BlogListOptions = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlogListOptions]
  }
}

