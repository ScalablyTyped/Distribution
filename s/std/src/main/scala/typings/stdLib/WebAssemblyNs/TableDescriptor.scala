package typings
package stdLib.WebAssemblyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDescriptor extends js.Object {
  var element: TableKind
  var initial: scala.Double
  var maximum: js.UndefOr[scala.Double] = js.undefined
}

object TableDescriptor {
  @scala.inline
  def apply(element: TableKind, initial: scala.Double, maximum: scala.Int | scala.Double = null): TableDescriptor = {
    val __obj = js.Dynamic.literal(element = element, initial = initial)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDescriptor]
  }
}

