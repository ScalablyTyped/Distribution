package typings.reactDashCircularDashProgressbar.reactDashCircularDashProgressbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupOverride[T] extends js.Object {
  var background: js.UndefOr[T] = js.undefined
  var path: js.UndefOr[T] = js.undefined
  var root: js.UndefOr[T] = js.undefined
  var text: js.UndefOr[T] = js.undefined
  var trail: js.UndefOr[T] = js.undefined
}

object GroupOverride {
  @scala.inline
  def apply[T](background: T = null, path: T = null, root: T = null, text: T = null, trail: T = null): GroupOverride[T] = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (trail != null) __obj.updateDynamic("trail")(trail.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOverride[T]]
  }
}

