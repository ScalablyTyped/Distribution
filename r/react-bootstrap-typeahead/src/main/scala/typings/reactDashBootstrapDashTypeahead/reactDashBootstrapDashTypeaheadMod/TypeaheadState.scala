package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadState[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: Double | Null
  var activeItem: T | Null
  var initialItem: T | Null
  var isFocused: Boolean
  var selected: js.Array[T]
  var showMenu: Boolean
  var shownResults: Double
  var text: String
}

object TypeaheadState {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    isFocused: Boolean,
    selected: js.Array[T],
    showMenu: Boolean,
    shownResults: Double,
    text: String,
    activeIndex: Int | Double = null,
    activeItem: T = null,
    initialItem: T = null
  ): TypeaheadState[T] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused, selected = selected, showMenu = showMenu, shownResults = shownResults, text = text)
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (initialItem != null) __obj.updateDynamic("initialItem")(initialItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadState[T]]
  }
}

