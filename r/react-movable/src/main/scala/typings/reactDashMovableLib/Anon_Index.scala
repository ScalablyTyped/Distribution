package typings
package reactDashMovableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[Value] extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var isDragged: scala.Boolean
  var isOutOfBounds: scala.Boolean
  var isSelected: scala.Boolean
  var props: reactDashMovableLib.libTypesMod.IItemProps
  var value: Value
}

object Anon_Index {
  @scala.inline
  def apply[Value](
    isDragged: scala.Boolean,
    isOutOfBounds: scala.Boolean,
    isSelected: scala.Boolean,
    props: reactDashMovableLib.libTypesMod.IItemProps,
    value: Value,
    index: scala.Int | scala.Double = null
  ): Anon_Index[Value] = {
    val __obj = js.Dynamic.literal(isDragged = isDragged, isOutOfBounds = isOutOfBounds, isSelected = isSelected, props = props, value = value.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index[Value]]
  }
}

