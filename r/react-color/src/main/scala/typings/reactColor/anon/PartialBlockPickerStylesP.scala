package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/block/Block.BlockPickerStylesProps> */
trait PartialBlockPickerStylesP extends js.Object {
  var body: js.UndefOr[CSSProperties] = js.undefined
  var card: js.UndefOr[CSSProperties] = js.undefined
  var head: js.UndefOr[CSSProperties] = js.undefined
  var input: js.UndefOr[CSSProperties] = js.undefined
  var label: js.UndefOr[CSSProperties] = js.undefined
  var triangle: js.UndefOr[CSSProperties] = js.undefined
}

object PartialBlockPickerStylesP {
  @scala.inline
  def apply(
    body: CSSProperties = null,
    card: CSSProperties = null,
    head: CSSProperties = null,
    input: CSSProperties = null,
    label: CSSProperties = null,
    triangle: CSSProperties = null
  ): PartialBlockPickerStylesP = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBlockPickerStylesP]
  }
}

