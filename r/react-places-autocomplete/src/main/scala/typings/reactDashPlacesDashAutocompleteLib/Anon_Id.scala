package typings
package reactDashPlacesDashAutocompleteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var key: scala.Double
  var onClick: reactLib.reactMod.MouseEventHandler[reactLib.Element]
  var onMouseDown: reactLib.reactMod.MouseEventHandler[reactLib.Element]
  var onMouseEnter: reactLib.reactMod.MouseEventHandler[reactLib.Element]
  var onMouseLeave: reactLib.reactMod.MouseEventHandler[reactLib.Element]
  var onMouseUp: reactLib.reactMod.MouseEventHandler[reactLib.Element]
  var onTouchEnd: reactLib.reactMod.TouchEventHandler[reactLib.Element]
  var onTouchStart: reactLib.reactMod.TouchEventHandler[reactLib.Element]
  var role: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.option
}

object Anon_Id {
  @scala.inline
  def apply(
    key: scala.Double,
    onClick: reactLib.reactMod.MouseEventHandler[reactLib.Element],
    onMouseDown: reactLib.reactMod.MouseEventHandler[reactLib.Element],
    onMouseEnter: reactLib.reactMod.MouseEventHandler[reactLib.Element],
    onMouseLeave: reactLib.reactMod.MouseEventHandler[reactLib.Element],
    onMouseUp: reactLib.reactMod.MouseEventHandler[reactLib.Element],
    onTouchEnd: reactLib.reactMod.TouchEventHandler[reactLib.Element],
    onTouchStart: reactLib.reactMod.TouchEventHandler[reactLib.Element],
    role: reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteLibStrings.option,
    id: java.lang.String = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(key = key, onClick = onClick, onMouseDown = onMouseDown, onMouseEnter = onMouseEnter, onMouseLeave = onMouseLeave, onMouseUp = onMouseUp, onTouchEnd = onTouchEnd, onTouchStart = onTouchStart, role = role)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_Id]
  }
}

