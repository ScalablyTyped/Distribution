package typings.raphael.anon

import typings.raphael.mod.RaphaelDashArrayType
import typings.raphael.mod.RaphaelLineCapType
import typings.raphael.mod.RaphaelLineJoinType
import typings.raphael.mod.RaphaelTextAnchorType
import typings.raphael.mod.RaphaelTransformSegment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<raphael.raphael.RaphaelAttributes> */
trait PartialRaphaelAttributes extends js.Object {
  var `arrow-end`: js.UndefOr[String] = js.undefined
  var `clip-rect`: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var cx: js.UndefOr[Double] = js.undefined
  var cy: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var `fill-opacity`: js.UndefOr[Double] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var `font-family`: js.UndefOr[String] = js.undefined
  var `font-size`: js.UndefOr[Double | String] = js.undefined
  var `font-weight`: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var r: js.UndefOr[Double] = js.undefined
  var rx: js.UndefOr[Double] = js.undefined
  var ry: js.UndefOr[Double] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var `stroke-dasharray`: js.UndefOr[RaphaelDashArrayType] = js.undefined
  var `stroke-linecap`: js.UndefOr[RaphaelLineCapType] = js.undefined
  var `stroke-linejoin`: js.UndefOr[RaphaelLineJoinType] = js.undefined
  var `stroke-miterlimit`: js.UndefOr[Double] = js.undefined
  var `stroke-opacity`: js.UndefOr[Double] = js.undefined
  var `stroke-width`: js.UndefOr[Double] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var `text-anchor`: js.UndefOr[RaphaelTextAnchorType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object PartialRaphaelAttributes {
  @scala.inline
  def apply(
    `arrow-end`: String = null,
    `clip-rect`: String = null,
    cursor: String = null,
    cx: js.UndefOr[Double] = js.undefined,
    cy: js.UndefOr[Double] = js.undefined,
    fill: String = null,
    `fill-opacity`: js.UndefOr[Double] = js.undefined,
    font: String = null,
    `font-family`: String = null,
    `font-size`: Double | String = null,
    `font-weight`: String = null,
    height: js.UndefOr[Double] = js.undefined,
    href: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    path: String = null,
    r: js.UndefOr[Double] = js.undefined,
    rx: js.UndefOr[Double] = js.undefined,
    ry: js.UndefOr[Double] = js.undefined,
    src: String = null,
    stroke: String = null,
    `stroke-dasharray`: RaphaelDashArrayType = null,
    `stroke-linecap`: RaphaelLineCapType = null,
    `stroke-linejoin`: RaphaelLineJoinType = null,
    `stroke-miterlimit`: js.UndefOr[Double] = js.undefined,
    `stroke-opacity`: js.UndefOr[Double] = js.undefined,
    `stroke-width`: js.UndefOr[Double] = js.undefined,
    target: String = null,
    text: String = null,
    `text-anchor`: RaphaelTextAnchorType = null,
    title: String = null,
    transform: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment] = null,
    width: js.UndefOr[Double] = js.undefined,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): PartialRaphaelAttributes = {
    val __obj = js.Dynamic.literal()
    if (`arrow-end` != null) __obj.updateDynamic("arrow-end")(`arrow-end`.asInstanceOf[js.Any])
    if (`clip-rect` != null) __obj.updateDynamic("clip-rect")(`clip-rect`.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(cx)) __obj.updateDynamic("cx")(cx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cy)) __obj.updateDynamic("cy")(cy.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(`fill-opacity`)) __obj.updateDynamic("fill-opacity")(`fill-opacity`.get.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(r)) __obj.updateDynamic("r")(r.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rx)) __obj.updateDynamic("rx")(rx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ry)) __obj.updateDynamic("ry")(ry.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`stroke-dasharray` != null) __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`.asInstanceOf[js.Any])
    if (`stroke-linecap` != null) __obj.updateDynamic("stroke-linecap")(`stroke-linecap`.asInstanceOf[js.Any])
    if (`stroke-linejoin` != null) __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-miterlimit`)) __obj.updateDynamic("stroke-miterlimit")(`stroke-miterlimit`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-opacity`)) __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`stroke-width`)) __obj.updateDynamic("stroke-width")(`stroke-width`.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRaphaelAttributes]
  }
}

