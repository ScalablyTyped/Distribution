package typings.reactColor.twitterMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitterPickerStylesProps extends js.Object {
  var body: CSSProperties
  var card: CSSProperties
  var clear: CSSProperties
  var hash: CSSProperties
  var input: CSSProperties
  var label: CSSProperties
  var swatch: CSSProperties
  var triangle: CSSProperties
  var triangleShadow: CSSProperties
}

object TwitterPickerStylesProps {
  @scala.inline
  def apply(
    body: CSSProperties,
    card: CSSProperties,
    clear: CSSProperties,
    hash: CSSProperties,
    input: CSSProperties,
    label: CSSProperties,
    swatch: CSSProperties,
    triangle: CSSProperties,
    triangleShadow: CSSProperties
  ): TwitterPickerStylesProps = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], swatch = swatch.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any], triangleShadow = triangleShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterPickerStylesProps]
  }
}

