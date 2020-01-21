package typings.shopifyPrime.blogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlogListOptions extends js.Object {
  /**
    * Filter by blog handle.
    */
  var handle: js.UndefOr[String] = js.undefined
  /**
    * Filter results to after the specified ID,
    */
  var since_id: js.UndefOr[Double] = js.undefined
}

object BlogListOptions {
  @scala.inline
  def apply(handle: String = null, since_id: Int | Double = null): BlogListOptions = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (since_id != null) __obj.updateDynamic("since_id")(since_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlogListOptions]
  }
}

