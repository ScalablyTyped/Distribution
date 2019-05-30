package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryDescriptor extends js.Object {
  var initial: scala.Double
  var maximum: js.UndefOr[scala.Double] = js.undefined
}

object MemoryDescriptor {
  @scala.inline
  def apply(initial: scala.Double, maximum: scala.Int | scala.Double = null): MemoryDescriptor = {
    val __obj = js.Dynamic.literal(initial = initial)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryDescriptor]
  }
}

