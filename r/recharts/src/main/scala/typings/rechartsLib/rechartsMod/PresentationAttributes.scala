package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in recharts.recharts.PickedCSSStyleDeclarationKeys ]: std.CSSStyleDeclaration[P]} */ trait PresentationAttributes[X, Y] extends js.Object {
  var angle: scala.Double
  var colorInterpolation: java.lang.String
  var colorProfile: java.lang.String
  var colorRendering: java.lang.String
  var dx: scala.Double
  var dy: scala.Double
  var fill: java.lang.String
  var fillOpacity: scala.Double | java.lang.String
  var fontSize: scala.Double | java.lang.String
  var fontSizeAdjust: scala.Double | java.lang.String
  var fontWeight: rechartsLib.rechartsLibStrings.normal | rechartsLib.rechartsLibStrings.bold | rechartsLib.rechartsLibStrings.bolder | rechartsLib.rechartsLibStrings.lighter | rechartsLib.rechartsLibNumbers.`100` | rechartsLib.rechartsLibNumbers.`200` | rechartsLib.rechartsLibNumbers.`300` | rechartsLib.rechartsLibNumbers.`400` | rechartsLib.rechartsLibNumbers.`500` | rechartsLib.rechartsLibNumbers.`600` | rechartsLib.rechartsLibNumbers.`700` | rechartsLib.rechartsLibNumbers.`800` | rechartsLib.rechartsLibNumbers.`900` | rechartsLib.rechartsLibStrings.inherit
  var height: scala.Double
  var imageRendering: rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.optimizeSpeed | rechartsLib.rechartsLibStrings.optimizeQuality | rechartsLib.rechartsLibStrings.inherit
  var kerning: scala.Double | java.lang.String
  var opacity: scala.Double | java.lang.String
  var r: scala.Double
  var shapeRendering: rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.optimizeSpeed | rechartsLib.rechartsLibStrings.crispEdges | rechartsLib.rechartsLibStrings.geometricPrecision | rechartsLib.rechartsLibStrings.inherit
  var stopOpacity: scala.Double | java.lang.String
  var stroke: scala.Double | java.lang.String
  var strokeDashoffset: scala.Double | java.lang.String
  var strokeMiterlimit: scala.Double | java.lang.String
  var strokeOpacity: scala.Double | java.lang.String
  var strokeWidth: scala.Double | java.lang.String
  var style: js.Object
  var textRendering: rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.optimizeSpeed | rechartsLib.rechartsLibStrings.optimizeLegibility | rechartsLib.rechartsLibStrings.geometricPrecision | rechartsLib.rechartsLibStrings.inherit
  var width: scala.Double
  var wordSpacing: scala.Double | java.lang.String
  var x: X
  var y: Y
}

object PresentationAttributes {
  @scala.inline
  def apply[X, Y](
    angle: scala.Double,
    colorInterpolation: java.lang.String,
    colorProfile: java.lang.String,
    colorRendering: java.lang.String,
    dx: scala.Double,
    dy: scala.Double,
    fill: java.lang.String,
    fillOpacity: scala.Double | java.lang.String,
    fontSize: scala.Double | java.lang.String,
    fontSizeAdjust: scala.Double | java.lang.String,
    fontWeight: rechartsLib.rechartsLibStrings.normal | rechartsLib.rechartsLibStrings.bold | rechartsLib.rechartsLibStrings.bolder | rechartsLib.rechartsLibStrings.lighter | rechartsLib.rechartsLibNumbers.`100` | rechartsLib.rechartsLibNumbers.`200` | rechartsLib.rechartsLibNumbers.`300` | rechartsLib.rechartsLibNumbers.`400` | rechartsLib.rechartsLibNumbers.`500` | rechartsLib.rechartsLibNumbers.`600` | rechartsLib.rechartsLibNumbers.`700` | rechartsLib.rechartsLibNumbers.`800` | rechartsLib.rechartsLibNumbers.`900` | rechartsLib.rechartsLibStrings.inherit,
    height: scala.Double,
    imageRendering: rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.optimizeSpeed | rechartsLib.rechartsLibStrings.optimizeQuality | rechartsLib.rechartsLibStrings.inherit,
    kerning: scala.Double | java.lang.String,
    opacity: scala.Double | java.lang.String,
    r: scala.Double,
    shapeRendering: rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.optimizeSpeed | rechartsLib.rechartsLibStrings.crispEdges | rechartsLib.rechartsLibStrings.geometricPrecision | rechartsLib.rechartsLibStrings.inherit,
    stopOpacity: scala.Double | java.lang.String,
    stroke: scala.Double | java.lang.String,
    strokeDashoffset: scala.Double | java.lang.String,
    strokeMiterlimit: scala.Double | java.lang.String,
    strokeOpacity: scala.Double | java.lang.String,
    strokeWidth: scala.Double | java.lang.String,
    style: js.Object,
    textRendering: rechartsLib.rechartsLibStrings.auto | rechartsLib.rechartsLibStrings.optimizeSpeed | rechartsLib.rechartsLibStrings.optimizeLegibility | rechartsLib.rechartsLibStrings.geometricPrecision | rechartsLib.rechartsLibStrings.inherit,
    width: scala.Double,
    wordSpacing: scala.Double | java.lang.String,
    x: X,
    y: Y
  ): PresentationAttributes[X, Y] = {
    val __obj = js.Dynamic.literal(angle = angle, colorInterpolation = colorInterpolation, colorProfile = colorProfile, colorRendering = colorRendering, dx = dx, dy = dy, fill = fill, fillOpacity = fillOpacity.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontSizeAdjust = fontSizeAdjust.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], height = height, imageRendering = imageRendering.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], r = r, shapeRendering = shapeRendering.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeDashoffset = strokeDashoffset.asInstanceOf[js.Any], strokeMiterlimit = strokeMiterlimit.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], style = style, textRendering = textRendering.asInstanceOf[js.Any], width = width, wordSpacing = wordSpacing.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PresentationAttributes[X, Y]]
  }
}

