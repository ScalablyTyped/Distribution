package typings.reactMovable.anon

import typings.reactMovable.typesMod.IItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index[Value] extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var isDragged: Boolean
  var isOutOfBounds: Boolean
  var isSelected: Boolean
  var props: IItemProps
  var value: Value
}

object Index {
  @scala.inline
  def apply[Value](
    isDragged: Boolean,
    isOutOfBounds: Boolean,
    isSelected: Boolean,
    props: IItemProps,
    value: Value,
    index: js.UndefOr[Double] = js.undefined
  ): Index[Value] = {
    val __obj = js.Dynamic.literal(isDragged = isDragged.asInstanceOf[js.Any], isOutOfBounds = isOutOfBounds.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index[Value]]
  }
}

