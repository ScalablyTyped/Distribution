package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/twitter/Twitter.TwitterPickerStylesProps> */
trait PartialTwitterPickerStyle extends js.Object {
  var body: js.UndefOr[CSSProperties] = js.undefined
  var card: js.UndefOr[CSSProperties] = js.undefined
  var clear: js.UndefOr[CSSProperties] = js.undefined
  var hash: js.UndefOr[CSSProperties] = js.undefined
  var input: js.UndefOr[CSSProperties] = js.undefined
  var label: js.UndefOr[CSSProperties] = js.undefined
  var swatch: js.UndefOr[CSSProperties] = js.undefined
  var triangle: js.UndefOr[CSSProperties] = js.undefined
  var triangleShadow: js.UndefOr[CSSProperties] = js.undefined
}

object PartialTwitterPickerStyle {
  @scala.inline
  def apply(
    body: CSSProperties = null,
    card: CSSProperties = null,
    clear: CSSProperties = null,
    hash: CSSProperties = null,
    input: CSSProperties = null,
    label: CSSProperties = null,
    swatch: CSSProperties = null,
    triangle: CSSProperties = null,
    triangleShadow: CSSProperties = null
  ): PartialTwitterPickerStyle = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (swatch != null) __obj.updateDynamic("swatch")(swatch.asInstanceOf[js.Any])
    if (triangle != null) __obj.updateDynamic("triangle")(triangle.asInstanceOf[js.Any])
    if (triangleShadow != null) __obj.updateDynamic("triangleShadow")(triangleShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTwitterPickerStyle]
  }
}

