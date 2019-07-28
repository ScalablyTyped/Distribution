package typings.reactDashJsonschemaDashForm

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: ReactElement
  var className: String
  var disabled: Boolean
  var hasMoveDown: Boolean
  var hasMoveUp: Boolean
  var hasRemove: Boolean
  var hasToolbar: Boolean
  var index: Double
  var readonly: Boolean
  def onDropIndexClick(index: Double): js.Function1[/* event */ js.Any, Unit]
  def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.Any, Unit]
}

object Anon_Children {
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
    onDropIndexClick: Double => js.Function1[/* event */ js.Any, Unit],
    onReorderClick: (Double, Double) => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, className = className, disabled = disabled, hasMoveDown = hasMoveDown, hasMoveUp = hasMoveUp, hasRemove = hasRemove, hasToolbar = hasToolbar, index = index, onDropIndexClick = js.Any.fromFunction1(onDropIndexClick), onReorderClick = js.Any.fromFunction2(onReorderClick), readonly = readonly)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

