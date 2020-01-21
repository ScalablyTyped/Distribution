package typings.reactPlyr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: js.UndefOr[js.Array[Double]] = js.undefined
  var selected: js.UndefOr[Double] = js.undefined
}

object AnonOptions {
  @scala.inline
  def apply(options: js.Array[Double] = null, selected: Int | Double = null): AnonOptions = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOptions]
  }
}

