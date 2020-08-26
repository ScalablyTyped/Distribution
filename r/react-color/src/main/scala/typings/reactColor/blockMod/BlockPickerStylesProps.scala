package typings.reactColor.blockMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockPickerStylesProps extends js.Object {
  var body: CSSProperties = js.native
  var card: CSSProperties = js.native
  var head: CSSProperties = js.native
  var input: CSSProperties = js.native
  var label: CSSProperties = js.native
  var triangle: CSSProperties = js.native
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
  @scala.inline
  implicit class BlockPickerStylesPropsOps[Self <: BlockPickerStylesProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: CSSProperties): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCard(value: CSSProperties): Self = this.set("card", value.asInstanceOf[js.Any])
    @scala.inline
    def setHead(value: CSSProperties): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangle(value: CSSProperties): Self = this.set("triangle", value.asInstanceOf[js.Any])
  }
  
}

