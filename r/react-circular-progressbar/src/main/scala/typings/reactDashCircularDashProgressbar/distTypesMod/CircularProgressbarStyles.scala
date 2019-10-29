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
    if (background != null) __obj.updateDynamic("background")(background)
    if (path != null) __obj.updateDynamic("path")(path)
    if (root != null) __obj.updateDynamic("root")(root)
    if (text != null) __obj.updateDynamic("text")(text)
    if (trail != null) __obj.updateDynamic("trail")(trail)
    __obj.asInstanceOf[CircularProgressbarStyles]
  }
}

