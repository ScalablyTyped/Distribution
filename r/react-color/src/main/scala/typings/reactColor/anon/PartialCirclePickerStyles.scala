package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/circle/Circle.CirclePickerStylesProps> */
trait PartialCirclePickerStyles extends js.Object {
  var card: js.UndefOr[CSSProperties] = js.undefined
}

object PartialCirclePickerStyles {
  @scala.inline
  def apply(card: CSSProperties = null): PartialCirclePickerStyles = {
    val __obj = js.Dynamic.literal()
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCirclePickerStyles]
  }
}

