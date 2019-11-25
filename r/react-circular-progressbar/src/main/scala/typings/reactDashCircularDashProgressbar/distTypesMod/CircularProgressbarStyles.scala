package typings.reactDashCircularDashProgressbar.distTypesMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularProgressbarStyles extends js.Object {
  var background: js.UndefOr[CSSProperties] = js.undefined
  var path: js.UndefOr[CSSProperties] = js.undefined
  var root: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[CSSProperties] = js.undefined
  var trail: js.UndefOr[CSSProperties] = js.undefined
}

object CircularProgressbarStyles {
  @scala.inline
  def apply(
    background: CSSProperties = null,
    path: CSSProperties = null,
    root: CSSProperties = null,
    text: CSSProperties = null,
    trail: CSSProperties = null
  ): CircularProgressbarStyles = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (trail != null) __obj.updateDynamic("trail")(trail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressbarStyles]
  }
}

