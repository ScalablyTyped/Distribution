package typings.raphael

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
    cx: Int | Double = null,
    cy: Int | Double = null,
    fill: String = null,
    `fill-opacity`: Int | Double = null,
    font: String = null,
    `font-family`: String = null,
    `font-size`: Double | String = null,
    `font-weight`: String = null,
    height: Int | Double = null,
    href: String = null,
    opacity: Int | Double = null,
    path: String = null,
    r: Int | Double = null,
    rx: Int | Double = null,
    ry: Int | Double = null,
    src: String = null,
    stroke: String = null,
    `stroke-dasharray`: RaphaelDashArrayType = null,
    `stroke-linecap`: RaphaelLineCapType = null,
    `stroke-linejoin`: RaphaelLineJoinType = null,
    `stroke-miterlimit`: Int | Double = null,
    `stroke-opacity`: Int | Double = null,
    `stroke-width`: Int | Double = null,
    target: String = null,
    text: String = null,
    `text-anchor`: RaphaelTextAnchorType = null,
    title: String = null,
    transform: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment] = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PartialRaphaelAttributes = {
    val __obj = js.Dynamic.literal()
    if (`arrow-end` != null) __obj.updateDynamic("arrow-end")(`arrow-end`.asInstanceOf[js.Any])
    if (`clip-rect` != null) __obj.updateDynamic("clip-rect")(`clip-rect`.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (`fill-opacity` != null) __obj.updateDynamic("fill-opacity")(`fill-opacity`.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (`font-family` != null) __obj.updateDynamic("font-family")(`font-family`.asInstanceOf[js.Any])
    if (`font-size` != null) __obj.updateDynamic("font-size")(`font-size`.asInstanceOf[js.Any])
    if (`font-weight` != null) __obj.updateDynamic("font-weight")(`font-weight`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (rx != null) __obj.updateDynamic("rx")(rx.asInstanceOf[js.Any])
    if (ry != null) __obj.updateDynamic("ry")(ry.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (`stroke-dasharray` != null) __obj.updateDynamic("stroke-dasharray")(`stroke-dasharray`.asInstanceOf[js.Any])
    if (`stroke-linecap` != null) __obj.updateDynamic("stroke-linecap")(`stroke-linecap`.asInstanceOf[js.Any])
    if (`stroke-linejoin` != null) __obj.updateDynamic("stroke-linejoin")(`stroke-linejoin`.asInstanceOf[js.Any])
    if (`stroke-miterlimit` != null) __obj.updateDynamic("stroke-miterlimit")(`stroke-miterlimit`.asInstanceOf[js.Any])
    if (`stroke-opacity` != null) __obj.updateDynamic("stroke-opacity")(`stroke-opacity`.asInstanceOf[js.Any])
    if (`stroke-width` != null) __obj.updateDynamic("stroke-width")(`stroke-width`.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`text-anchor` != null) __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRaphaelAttributes]
  }
}

