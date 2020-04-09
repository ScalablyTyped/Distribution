package typings.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaphaelAttributes extends js.Object {
  /**
    * Arrowhead on the end of the path. The format for the string is `<type>[-<width>[-<length>]]`.
    *
    * Possible value for `type` are:
    * - classic
    * - block
    * - open
    * - oval
    * - diamond
    * - none
    *
    * Possible value for `width` are:
    * - wide
    * - narrow
    * - medium
    *
    * Possible values for `length` are
    * - long
    * - short
    * - medium
    */
  var `arrow-end`: String
  /**
    * Comma or space separated values: `x`, `y`, `width` and `height`.
    */
  var `clip-rect`: String
  /**
    * CSS type of the cursor.
    */
  var cursor: String
  /**
    * Horizontal coordinate of the origin of the circle.
    */
  var cx: Double
  /**
    * Vertical coordinate of the origin of the circle.
    */
  var cy: Double
  /**
    * Colour, gradient or image.
    */
  var fill: String
  /**
    * Opacity of the fill color.
    */
  var `fill-opacity`: Double
  /**
    * The combined font family and font size, e.g. `10px "Arial"`.
    */
  var font: String
  /**
    * Name of the font family to use.
    */
  var `font-family`: String
  /**
    * Font size in pixels.
    */
  var `font-size`: Double | String
  /**
    * Font weight as a number, usually between `100` to `900`. Can also be `"bold"` etc.
    */
  var `font-weight`: String
  /**
    * The height of e.g. a rectangle in pixels.
    */
  var height: Double
  /**
    * URL, if specified element behaves as hyperlink.
    */
  var href: String
  /**
    * Opacity of the element, usually between `0` and `1`.
    */
  var opacity: Double
  /**
    * An SVG path string, e.g. `M 10 10 L 20 10 Z`.
    */
  var path: String
  /**
    * Radius of the circle in pixels.
    */
  var r: Double
  /**
    * Horizontal half-axis of the ellipse in pixels.
    */
  var rx: Double
  /**
    * Vertical half-axis of the ellipse in pixels.
    */
  var ry: Double
  /**
    * Image URL, only works for {@link RaphaelPaper.image} elements.
    */
  var src: String
  /**
    * CSS stroke color.
    */
  var stroke: String
  /**
    * Controls the pattern of dashes and gaps used to form the shape of a path's stroke.
    */
  var `stroke-dasharray`: RaphaelDashArrayType
  /**
    * Specifies the shape to be used at the end of open subpaths when they are stroked, and the shape to be drawn
    * for zero length subpaths whether they are open or closed.
    */
  var `stroke-linecap`: RaphaelLineCapType
  /**
    * Specifies the shape to be used at the corners of paths or basic shapes when they are stroked.
    */
  var `stroke-linejoin`: RaphaelLineJoinType
  /**
    * When two line segments meet at a sharp angle and a value of `miter`, `miter-clip`, or `arcs` has been
    * specified for `stroke-linejoin`, it is possible for the join to extend far beyond the thickness of the line
    * stroking the path. The `stroke-miterlimit` imposes a limit on the extent of the line join.
    */
  var `stroke-miterlimit`: Double
  /**
    * Opacity of the stroke, usually between `0` and `1`.
    */
  var `stroke-opacity`: Double
  /**
    * Width of the stroke in pixels.
    */
  var `stroke-width`: Double
  /**
    * Used with {@link href}.
    */
  var target: String
  /**
    * Contents of the text element.
    */
  var text: String
  /**
    * Used to align (start-, middle- or end-alignment) a string of pre-formatted text or auto-wrapped text where
    * the wrapping area is determined from the `inline-size` property relative to a given point.
    */
  var `text-anchor`: RaphaelTextAnchorType
  /**
    * Will create a tooltip with a given text.
    */
  var title: String
  /**
    * The transform property of this element.
    */
  var transform: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment]
  /**
    * The width of e.g. a rectangle in pixels.
    */
  var width: Double
  /**
    * The horizontal x coordinate in pixels.
    */
  var x: Double
  /**
    * The vertical y coordinate in pixels.
    */
  var y: Double
}

object RaphaelAttributes {
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
    transform: String | RaphaelTransformSegment | js.Array[RaphaelTransformSegment],
    width: Double,
    x: Double,
    y: Double
  ): RaphaelAttributes = {
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
    __obj.asInstanceOf[RaphaelAttributes]
  }
}

