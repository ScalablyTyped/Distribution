package typings.reactDayPicker.modifiersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers
  extends /* other */ StringDictionary[js.UndefOr[Modifier | js.Array[Modifier]]] {
  var outside: Modifier | js.Array[Modifier]
  var today: Modifier | js.Array[Modifier]
}

object Modifiers {
  @scala.inline
  def apply(
    StringDictionary: /* other */ StringDictionary[js.UndefOr[Modifier | js.Array[Modifier]]] = null,
    outside: Modifier | js.Array[Modifier] = null,
    today: Modifier | js.Array[Modifier] = null
  ): Modifiers = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (outside != null) __obj.updateDynamic("outside")(outside.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers]
  }
}

