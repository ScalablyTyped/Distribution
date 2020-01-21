package typings.reactMovable

import typings.reactMovable.typesMod.IItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex[Value] extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var isDragged: Boolean
  var isOutOfBounds: Boolean
  var isSelected: Boolean
  var props: IItemProps
  var value: Value
}

object AnonIndex {
  @scala.inline
  def apply[Value](
    isDragged: Boolean,
    isOutOfBounds: Boolean,
    isSelected: Boolean,
    props: IItemProps,
    value: Value,
    index: Int | Double = null
  ): AnonIndex[Value] = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], isOutOfBounds = isOutOfBounds.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex[Value]]
  }
}

