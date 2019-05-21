package typings
package reactDashNativeDashCanvasLib.reactDashNativeDashCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-canvas", "Path2D")
@js.native
class Path2D protected () extends js.Object {
  def this(canvas: Canvas, /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
  var arc: js.Function6[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* r */ scala.Double, 
    /* sAngle */ scala.Double, 
    /* eAngle */ scala.Double, 
    /* counterClockwise */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  var arcTo: js.Function5[
    /* x1 */ scala.Double, 
    /* y1 */ scala.Double, 
    /* x2 */ scala.Double, 
    /* y2 */ scala.Double, 
    /* r */ scala.Double, 
    scala.Unit
  ] = js.native
  var bezierCurveTo: js.Function6[
    /* cp1x */ scala.Double, 
    /* cp1y */ scala.Double, 
    /* cp2x */ scala.Double, 
    /* cp2y */ scala.Double, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    scala.Unit
  ] = js.native
  var closePath: js.Function0[scala.Unit] = js.native
  var ellipse: js.Function8[
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
  var lineTo: js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit] = js.native
  var moveTo: js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit] = js.native
  var quadraticCurveTo: js.Function4[
    /* cpx */ scala.Double, 
    /* cpy */ scala.Double, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    scala.Unit
  ] = js.native
  var rect: js.Function4[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ] = js.native
  def addPath(path: Path2D): scala.Unit = js.native
  def addPath(path: Path2D, transform: reactDashNativeDashCanvasLib.Anon_A): scala.Unit = js.native
}

