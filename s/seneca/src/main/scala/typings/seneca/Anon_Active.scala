package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Active extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Anon_Active {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, size: Int | Double = null): Anon_Active = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Active]
  }
}

