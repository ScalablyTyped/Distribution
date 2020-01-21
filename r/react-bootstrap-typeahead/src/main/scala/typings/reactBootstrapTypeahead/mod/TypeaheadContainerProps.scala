package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeaheadContainerProps[T /* <: TypeaheadModel */] extends js.Object {
  var activeIndex: Double | Null
  var activeItem: T | Null
  var initialItem: T | Null
  var isFocused: Boolean
  var selected: js.Array[T]
  var showMenu: Boolean
  var shownResults: Double
  var text: String
}

object TypeaheadContainerProps {
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
  ): TypeaheadContainerProps[T] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], showMenu = showMenu.asInstanceOf[js.Any], shownResults = shownResults.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (initialItem != null) __obj.updateDynamic("initialItem")(initialItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadContainerProps[T]]
  }
}

