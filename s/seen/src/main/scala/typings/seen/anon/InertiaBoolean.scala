package typings.seen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InertiaBoolean extends js.Object {
  var inertia: js.UndefOr[Boolean] = js.undefined
}

object InertiaBoolean {
  @scala.inline
  def apply(inertia: js.UndefOr[Boolean] = js.undefined): InertiaBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InertiaBoolean]
  }
}

