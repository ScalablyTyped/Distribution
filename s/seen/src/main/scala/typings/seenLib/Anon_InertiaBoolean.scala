package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InertiaBoolean extends js.Object {
  var inertia: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_InertiaBoolean {
  @scala.inline
  def apply(inertia: js.UndefOr[scala.Boolean] = js.undefined): Anon_InertiaBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia)
    __obj.asInstanceOf[Anon_InertiaBoolean]
  }
}

