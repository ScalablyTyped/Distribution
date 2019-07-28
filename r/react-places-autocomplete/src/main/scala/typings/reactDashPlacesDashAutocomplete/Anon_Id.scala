package typings.reactDashPlacesDashAutocomplete

import typings.react.Element
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.TouchEventHandler
import typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteStrings.option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var key: Double
  var onClick: MouseEventHandler[Element]
  var onMouseDown: MouseEventHandler[Element]
  var onMouseEnter: MouseEventHandler[Element]
  var onMouseLeave: MouseEventHandler[Element]
  var onMouseUp: MouseEventHandler[Element]
  var onTouchEnd: TouchEventHandler[Element]
  var onTouchStart: TouchEventHandler[Element]
  var role: option
}

object Anon_Id {
  @scala.inline
  def apply(
    key: Double,
    onClick: MouseEventHandler[Element],
    onMouseDown: MouseEventHandler[Element],
    onMouseEnter: MouseEventHandler[Element],
    onMouseLeave: MouseEventHandler[Element],
    onMouseUp: MouseEventHandler[Element],
    onTouchEnd: TouchEventHandler[Element],
    onTouchStart: TouchEventHandler[Element],
    role: option,
    id: String = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(key = key, onClick = onClick, onMouseDown = onMouseDown, onMouseEnter = onMouseEnter, onMouseLeave = onMouseLeave, onMouseUp = onMouseUp, onTouchEnd = onTouchEnd, onTouchStart = onTouchStart, role = role)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Id]
  }
}

