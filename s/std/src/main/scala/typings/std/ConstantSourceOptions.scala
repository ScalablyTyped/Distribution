package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantSourceOptions extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
}

object ConstantSourceOptions {
  @scala.inline
  def apply(offset: Int | Double = null): ConstantSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantSourceOptions]
  }
}

