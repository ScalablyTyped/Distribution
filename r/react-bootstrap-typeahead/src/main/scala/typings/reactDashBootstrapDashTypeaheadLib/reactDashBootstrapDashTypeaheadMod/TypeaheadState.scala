package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadState[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: scala.Double | scala.Null
  var activeItem: T | scala.Null
  var initialItem: T | scala.Null
  var isFocused: scala.Boolean
  var selected: js.Array[T]
  var showMenu: scala.Boolean
  var shownResults: scala.Double
  var text: java.lang.String
}

object TypeaheadState {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    isFocused: scala.Boolean,
    selected: js.Array[T],
    showMenu: scala.Boolean,
    shownResults: scala.Double,
    text: java.lang.String,
    activeIndex: scala.Int | scala.Double = null,
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

