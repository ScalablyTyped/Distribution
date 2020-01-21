package typings.recharts.mod

import typings.recharts.rechartsNumbers.`100`
import typings.recharts.rechartsNumbers.`200`
import typings.recharts.rechartsNumbers.`300`
import typings.recharts.rechartsNumbers.`400`
import typings.recharts.rechartsNumbers.`500`
import typings.recharts.rechartsNumbers.`600`
import typings.recharts.rechartsNumbers.`700`
import typings.recharts.rechartsNumbers.`800`
import typings.recharts.rechartsNumbers.`900`
import typings.recharts.rechartsStrings.auto
import typings.recharts.rechartsStrings.bold
import typings.recharts.rechartsStrings.bolder
import typings.recharts.rechartsStrings.crispEdges
import typings.recharts.rechartsStrings.geometricPrecision
import typings.recharts.rechartsStrings.inherit
import typings.recharts.rechartsStrings.lighter
import typings.recharts.rechartsStrings.normal
import typings.recharts.rechartsStrings.optimizeLegibility
import typings.recharts.rechartsStrings.optimizeQuality
import typings.recharts.rechartsStrings.optimizeSpeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in recharts.recharts.PickedCSSStyleDeclarationKeys ]: std.CSSStyleDeclaration[P]} */ trait PresentationAttributes[X, Y] extends js.Object {
  var angle: Double
  var colorInterpolation: String
  var colorProfile: String
  var colorRendering: String
  var dx: Double
  var dy: Double
  var fill: String
  var fillOpacity: Double | String
  var fontSize: Double | String
  var fontSizeAdjust: Double | String
  var fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit
  var height: Double
  var imageRendering: auto | optimizeSpeed | optimizeQuality | inherit
  var kerning: Double | String
  var opacity: Double | String
  var r: Double
  var shapeRendering: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit
  var stopOpacity: Double | String
  var stroke: Double | String
  var strokeDashoffset: Double | String
  var strokeMiterlimit: Double | String
  var strokeOpacity: Double | String
  var strokeWidth: Double | String
  var style: js.Object
  var textRendering: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit
  var width: Double
  var wordSpacing: Double | String
  var x: X
  var y: Y
}

object PresentationAttributes {
  @scala.inline
  def apply[X, Y](
    angle: Double,
    colorInterpolation: String,
    colorProfile: String,
    colorRendering: String,
    dx: Double,
    dy: Double,
    fill: String,
    fillOpacity: Double | String,
    fontSize: Double | String,
    fontSizeAdjust: Double | String,
    fontWeight: normal | bold | bolder | lighter | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` | inherit,
    height: Double,
    imageRendering: auto | optimizeSpeed | optimizeQuality | inherit,
    kerning: Double | String,
    opacity: Double | String,
    r: Double,
    shapeRendering: auto | optimizeSpeed | crispEdges | geometricPrecision | inherit,
    stopOpacity: Double | String,
    stroke: Double | String,
    strokeDashoffset: Double | String,
    strokeMiterlimit: Double | String,
    strokeOpacity: Double | String,
    strokeWidth: Double | String,
    style: js.Object,
    textRendering: auto | optimizeSpeed | optimizeLegibility | geometricPrecision | inherit,
    width: Double,
    wordSpacing: Double | String,
    x: X,
    y: Y
  ): PresentationAttributes[X, Y] = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], colorInterpolation = colorInterpolation.asInstanceOf[js.Any], colorProfile = colorProfile.asInstanceOf[js.Any], colorRendering = colorRendering.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fillOpacity = fillOpacity.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontSizeAdjust = fontSizeAdjust.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageRendering = imageRendering.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], shapeRendering = shapeRendering.asInstanceOf[js.Any], stopOpacity = stopOpacity.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], strokeDashoffset = strokeDashoffset.asInstanceOf[js.Any], strokeMiterlimit = strokeMiterlimit.asInstanceOf[js.Any], strokeOpacity = strokeOpacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textRendering = textRendering.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wordSpacing = wordSpacing.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PresentationAttributes[X, Y]]
  }
}

