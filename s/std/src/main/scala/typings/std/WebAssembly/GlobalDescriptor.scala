package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalDescriptor extends js.Object {
  var mutable: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object GlobalDescriptor {
  @scala.inline
  def apply(value: java.lang.String, mutable: js.UndefOr[scala.Boolean] = js.undefined): GlobalDescriptor = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(mutable)) __obj.updateDynamic("mutable")(mutable)
    __obj.asInstanceOf[GlobalDescriptor]
  }
}

