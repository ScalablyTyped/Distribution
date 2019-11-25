package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationConfig extends js.Object {
  var create: js.UndefOr[LayoutAnimationAnim] = js.undefined
  var delete: js.UndefOr[LayoutAnimationAnim] = js.undefined
  var duration: Double
  var update: js.UndefOr[LayoutAnimationAnim] = js.undefined
}

object LayoutAnimationConfig {
  @scala.inline
  def apply(
    duration: Double,
    create: LayoutAnimationAnim = null,
    delete: LayoutAnimationAnim = null,
    update: LayoutAnimationAnim = null
  ): LayoutAnimationConfig = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationConfig]
  }
}

