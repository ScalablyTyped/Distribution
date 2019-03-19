package typings
package reactDashNativeDashCanvasLib.reactDashNativeDashCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-canvas", "Path2D")
@js.native
class Path2D protected () extends js.Object {
  def this(canvas: Canvas, /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
  @JSName("arcTo")
  var arcTo_Original: js.Function5[
    /* x1 */ scala.Double, 
    /* y1 */ scala.Double, 
    /* x2 */ scala.Double, 
    /* y2 */ scala.Double, 
    /* r */ scala.Double, 
    scala.Unit
  ] = js.native
  @JSName("arc")
  var arc_Original: js.Function6[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* r */ scala.Double, 
    /* sAngle */ scala.Double, 
    /* eAngle */ scala.Double, 
    /* counterClockwise */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  @JSName("bezierCurveTo")
  var bezierCurveTo_Original: js.Function6[
    /* cp1x */ scala.Double, 
    /* cp1y */ scala.Double, 
    /* cp2x */ scala.Double, 
    /* cp2y */ scala.Double, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    scala.Unit
  ] = js.native
  @JSName("closePath")
  var closePath_Original: js.Function0[scala.Unit] = js.native
  @JSName("ellipse")
  var ellipse_Original: js.Function8[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* radiusX */ scala.Double, 
    /* radiusY */ scala.Double, 
    /* rotation */ scala.Double, 
    /* startAngle */ scala.Double, 
    /* endAngle */ scala.Double, 
    /* anticlockwise */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ] = js.native
  @JSName("lineTo")
  var lineTo_Original: js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit] = js.native
  @JSName("moveTo")
  var moveTo_Original: js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit] = js.native
  @JSName("quadraticCurveTo")
  var quadraticCurveTo_Original: js.Function4[
    /* cpx */ scala.Double, 
    /* cpy */ scala.Double, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    scala.Unit
  ] = js.native
  @JSName("rect")
  var rect_Original: js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ] = js.native
  def addPath(path: Path2D): scala.Unit = js.native
  def addPath(path: Path2D, transform: reactDashNativeDashCanvasLib.Anon_A): scala.Unit = js.native
  def arc(x: scala.Double, y: scala.Double, r: scala.Double, sAngle: scala.Double, eAngle: scala.Double): scala.Unit = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    r: scala.Double,
    sAngle: scala.Double,
    eAngle: scala.Double,
    counterClockwise: scala.Double
  ): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, r: scala.Double): scala.Unit = js.native
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): scala.Unit = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
}

