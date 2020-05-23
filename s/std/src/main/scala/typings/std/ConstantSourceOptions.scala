package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstantSourceOptions extends js.Object {
  var offset: js.UndefOr[Double] = js.undefined
}

object ConstantSourceOptions {
  @scala.inline
  def apply(offset: js.UndefOr[Double] = js.undefined): ConstantSourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantSourceOptions]
  }
}

