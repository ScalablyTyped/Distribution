package typings.sailthruClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends js.Object {
  var full: js.UndefOr[Url] = js.undefined
  var thumb: js.UndefOr[Url] = js.undefined
}

object Full {
  @scala.inline
  def apply(full: Url = null, thumb: Url = null): Full = {
    val __obj = js.Dynamic.literal()
    if (full != null) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
}

