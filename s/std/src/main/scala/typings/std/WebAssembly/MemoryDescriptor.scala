package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryDescriptor extends js.Object {
  var initial: Double
  var maximum: js.UndefOr[Double] = js.undefined
}

object MemoryDescriptor {
  @scala.inline
  def apply(initial: Double, maximum: js.UndefOr[Double] = js.undefined): MemoryDescriptor = {
    val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDescriptor]
  }
}

