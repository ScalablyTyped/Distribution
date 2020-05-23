package typings.reactWithStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Direction extends js.Object {
  var direction: js.UndefOr[js.Any] = js.undefined
  var stylesInterface: js.Any
  var stylesTheme: js.Any
}

object Direction {
  @scala.inline
  def apply(stylesInterface: js.Any, stylesTheme: js.Any, direction: js.Any = null): Direction = {
    val __obj = js.Dynamic.literal(stylesInterface = stylesInterface.asInstanceOf[js.Any], stylesTheme = stylesTheme.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
}

