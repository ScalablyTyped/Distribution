package typings.reactMotion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default style for transition
  */
trait TransitionPlainStyle extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var key: String
  // same as TransitionStyle, passed as argument to style/children function
  var style: PlainStyle
}

object TransitionPlainStyle {
  @scala.inline
  def apply(key: String, style: PlainStyle, data: js.Any = null): TransitionPlainStyle = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionPlainStyle]
  }
}

