package typings
package reactDashNativeDashCanvasLib.reactDashNativeDashCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-canvas", "Image")
@js.native
class Image protected () extends js.Object {
  def this(canvas: Canvas) = this()
  def this(canvas: Canvas, height: scala.Double) = this()
  def this(canvas: Canvas, height: scala.Double, width: scala.Double) = this()
  var crossOrigin: js.UndefOr[java.lang.String] = js.native
  var height: scala.Double = js.native
  var src: java.lang.String = js.native
  var width: scala.Double = js.native
  def addEventListener(event: java.lang.String, func: js.Function1[/* args */ js.Any, _]): scala.Unit = js.native
}

