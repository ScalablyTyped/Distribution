package typings
package reactDashDayDashPickerLib.typesCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers
  extends /* other */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[Modifier | js.Array[Modifier]]] {
  var outside: Modifier | js.Array[Modifier]
  var today: Modifier | js.Array[Modifier]
}

object Modifiers {
  @scala.inline
  def apply(
    outside: Modifier | js.Array[Modifier],
    today: Modifier | js.Array[Modifier],
    StringDictionary: /* other */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[Modifier | js.Array[Modifier]]] = null
  ): Modifiers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("outside")(outside.asInstanceOf[js.Any])
    __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Modifiers]
  }
}

