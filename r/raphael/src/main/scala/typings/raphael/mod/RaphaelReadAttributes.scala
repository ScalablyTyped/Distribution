package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelReadAttributes extends RaphaelAttributes {
  /**
    * The transform property of this element.
    */
  @JSName("transform")
  var transform_RaphaelReadAttributes: js.Array[RaphaelTransformSegment] = js.native
}

object RaphaelReadAttributes {
  @scala.inline
  def apply(
    `arrow-end`: String,
    `clip-rect`: String,
    cursor: String,
    cx: Double,
    cy: Double,
    fill: String,
    `fill-opacity`: Double,
    font: String,
    `font-family`: String,
    `font-size`: Double | String,
    `font-weight`: String,
    height: Double,
    href: String,
    opacity: Double,
    path: String,
    r: Double,
    rx: Double,
    ry: Double,
    src: String,
    stroke: String,
    `stroke-dasharray`: RaphaelDashArrayType,
    `stroke-linecap`: RaphaelLineCapType,
    `stroke-linejoin`: RaphaelLineJoinType,
    `stroke-miterlimit`: Double,
    `stroke-opacity`: Double,
    `stroke-width`: Double,
    target: String,
    text: String,
    `text-anchor`: RaphaelTextAnchorType,
    title: String,
    transform: js.Array[RaphaelTransformSegment],
    width: Double,
    x: Double,
    y: Double
  ): RaphaelReadAttributes = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("arrow-end")(`arrow-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("clip-rect")(`clip-rect`.asInstanceOf[js.Any])
    __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linecap")(`stroke-linecap`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-miterlimit")(`stroke-miterlimit`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelReadAttributes]
  }
  @scala.inline
  implicit class RaphaelReadAttributesOps[Self <: RaphaelReadAttributes] (val x: Self) extends AnyVal {
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
    def setTransformVarargs(value: RaphaelTransformSegment*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[RaphaelTransformSegment]): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}

