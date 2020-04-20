package typings.reactJsonschemaForm

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: ReactElement
  var className: String
  var disabled: Boolean
  var hasMoveDown: Boolean
  var hasMoveUp: Boolean
  var hasRemove: Boolean
  var hasToolbar: Boolean
  var index: Double
  var key: String
  var readonly: Boolean
  def onDropIndexClick(index: Double): js.Function1[/* event */ js.Any, Unit]
  def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.Any, Unit]
}

object AnonChildren {
  @scala.inline
  def apply(
    children: ReactElement,
    className: String,
    disabled: Boolean,
    hasMoveDown: Boolean,
    hasMoveUp: Boolean,
    hasRemove: Boolean,
    hasToolbar: Boolean,
    index: Double,
    key: String,
    onDropIndexClick: Double => js.Function1[/* event */ js.Any, Unit],
    onReorderClick: (Double, Double) => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasMoveDown = hasMoveDown.asInstanceOf[js.Any], hasMoveUp = hasMoveUp.asInstanceOf[js.Any], hasRemove = hasRemove.asInstanceOf[js.Any], hasToolbar = hasToolbar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onDropIndexClick = js.Any.fromFunction1(onDropIndexClick), onReorderClick = js.Any.fromFunction2(onReorderClick), readonly = readonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

