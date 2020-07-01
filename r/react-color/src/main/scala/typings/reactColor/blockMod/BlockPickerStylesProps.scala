package typings.reactColor.blockMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockPickerStylesProps extends js.Object {
  var body: CSSProperties
  var card: CSSProperties
  var head: CSSProperties
  var input: CSSProperties
  var label: CSSProperties
  var triangle: CSSProperties
}

object BlockPickerStylesProps {
  @scala.inline
  def apply(
    body: CSSProperties,
    card: CSSProperties,
    head: CSSProperties,
    input: CSSProperties,
    label: CSSProperties,
    triangle: CSSProperties
  ): BlockPickerStylesProps = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockPickerStylesProps]
  }
}

