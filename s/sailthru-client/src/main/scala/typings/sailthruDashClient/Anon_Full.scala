package typings.sailthruDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Full extends js.Object {
  var full: js.UndefOr[Anon_Url] = js.undefined
  var thumb: js.UndefOr[Anon_Url] = js.undefined
}

object Anon_Full {
  @scala.inline
  def apply(full: Anon_Url = null, thumb: Anon_Url = null): Anon_Full = {
    val __obj = js.Dynamic.literal()
    if (full != null) __obj.updateDynamic("full")(full)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    __obj.asInstanceOf[Anon_Full]
  }
}

