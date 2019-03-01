package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationConfig extends js.Object {
  var create: js.UndefOr[LayoutAnimationAnim] = js.undefined
  var delete: js.UndefOr[LayoutAnimationAnim] = js.undefined
  var duration: scala.Double
  var update: js.UndefOr[LayoutAnimationAnim] = js.undefined
}

object LayoutAnimationConfig {
  @scala.inline
  def apply(
    duration: scala.Double,
    create: LayoutAnimationAnim = null,
    delete: LayoutAnimationAnim = null,
    update: LayoutAnimationAnim = null
  ): LayoutAnimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    if (create != null) __obj.updateDynamic("create")(create)
    if (delete != null) __obj.updateDynamic("delete")(delete)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[LayoutAnimationConfig]
  }
}

