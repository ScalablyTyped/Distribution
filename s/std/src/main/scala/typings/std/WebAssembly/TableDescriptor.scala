package typings.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDescriptor extends js.Object {
  var element: TableKind
  var initial: Double
  var maximum: js.UndefOr[Double] = js.undefined
}

object TableDescriptor {
  @scala.inline
  def apply(element: TableKind, initial: Double, maximum: js.UndefOr[Double] = js.undefined): TableDescriptor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDescriptor]
  }
}

