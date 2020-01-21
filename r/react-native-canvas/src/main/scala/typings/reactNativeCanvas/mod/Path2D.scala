package typings.reactNativeCanvas.mod

import typings.reactNativeCanvas.AnonA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-canvas", "Path2D")
@js.native
class Path2D protected () extends js.Object {
  def this(
    canvas: Canvas,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ) = this()
  var arc: js.Function6[
    /* x */ Double, 
    /* y */ Double, 
    /* r */ Double, 
    /* sAngle */ Double, 
    /* eAngle */ Double, 
    /* counterClockwise */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  var arcTo: js.Function5[/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, /* r */ Double, Unit] = js.native
  var bezierCurveTo: js.Function6[
    /* cp1x */ Double, 
    /* cp1y */ Double, 
    /* cp2x */ Double, 
    /* cp2y */ Double, 
    /* x */ Double, 
    /* y */ Double, 
    Unit
  ] = js.native
  var closePath: js.Function0[Unit] = js.native
  var ellipse: js.Function8[
    /* x */ Double, 
    /* y */ Double, 
    /* radiusX */ Double, 
    /* radiusY */ Double, 
    /* rotation */ Double, 
    /* startAngle */ Double, 
    /* endAngle */ Double, 
    /* anticlockwise */ js.UndefOr[Boolean], 
    Unit
  ] = js.native
  var lineTo: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
  var moveTo: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
  var quadraticCurveTo: js.Function4[/* cpx */ Double, /* cpy */ Double, /* x */ Double, /* y */ Double, Unit] = js.native
  var rect: js.Function4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, Unit] = js.native
  def addPath(path: Path2D): Unit = js.native
  def addPath(path: Path2D, transform: AnonA): Unit = js.native
}

