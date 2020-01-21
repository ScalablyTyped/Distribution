package typings.shopifyPrime.optionsBaseMod

import typings.shopifyPrime.publishedStatusMod.PublishedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishedOptions extends js.Object {
  /**
    * Filter results to those published before date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_max: js.UndefOr[String] = js.undefined
  /**
    * Filter results to those published after date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_min: js.UndefOr[String] = js.undefined
  /**
    * Filter results to those with the given publish status.
    */
  var published_status: js.UndefOr[PublishedStatus] = js.undefined
}

object PublishedOptions {
  @scala.inline
  def apply(
    published_at_max: String = null,
    published_at_min: String = null,
    published_status: PublishedStatus = null
  ): PublishedOptions = {
    val __obj = js.Dynamic.literal()
    if (published_at_max != null) __obj.updateDynamic("published_at_max")(published_at_max.asInstanceOf[js.Any])
    if (published_at_min != null) __obj.updateDynamic("published_at_min")(published_at_min.asInstanceOf[js.Any])
    if (published_status != null) __obj.updateDynamic("published_status")(published_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishedOptions]
  }
}

