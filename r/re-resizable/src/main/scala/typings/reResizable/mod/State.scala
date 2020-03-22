package typings.reResizable.mod

import typings.reResizable.AnonY
import typings.reResizable.resizerMod.Direction
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var backgroundStyle: CSSProperties
  var direction: Direction
  var flexBasis: js.UndefOr[String | Double] = js.undefined
  var height: Double | String
  var isResizing: Boolean
  var original: AnonY
  var width: Double | String
}

object State {
  @scala.inline
  def apply(
    backgroundStyle: CSSProperties,
    direction: Direction,
    height: Double | String,
    isResizing: Boolean,
    original: AnonY,
    width: Double | String,
    flexBasis: String | Double = null
  ): State = {
    val __obj = js.Dynamic.literal(backgroundStyle = backgroundStyle.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

