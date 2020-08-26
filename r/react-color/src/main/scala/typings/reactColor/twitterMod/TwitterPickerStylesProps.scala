package typings.reactColor.twitterMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitterPickerStylesProps extends js.Object {
  var body: CSSProperties = js.native
  var card: CSSProperties = js.native
  var clear: CSSProperties = js.native
  var hash: CSSProperties = js.native
  var input: CSSProperties = js.native
  var label: CSSProperties = js.native
  var swatch: CSSProperties = js.native
  var triangle: CSSProperties = js.native
  var triangleShadow: CSSProperties = js.native
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
  @scala.inline
  implicit class TwitterPickerStylesPropsOps[Self <: TwitterPickerStylesProps] (val x: Self) extends AnyVal {
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
    def setClear(value: CSSProperties): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: CSSProperties): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: CSSProperties): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwatch(value: CSSProperties): Self = this.set("swatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangle(value: CSSProperties): Self = this.set("triangle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriangleShadow(value: CSSProperties): Self = this.set("triangleShadow", value.asInstanceOf[js.Any])
  }
  
}

