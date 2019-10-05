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
  def apply(initial: Double, maximum: Int | Double = null): MemoryDescriptor = {
    val __obj = js.Dynamic.literal(initial = initial)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDescriptor]
  }
}

