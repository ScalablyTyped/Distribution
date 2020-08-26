package typings.reactNativeCanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-canvas", "Image")
@js.native
class Image protected () extends js.Object {
  def this(canvas: Canvas) = this()
  def this(canvas: Canvas, height: Double) = this()
  def this(canvas: Canvas, height: js.UndefOr[scala.Nothing], width: Double) = this()
  def this(canvas: Canvas, height: Double, width: Double) = this()
  var crossOrigin: js.UndefOr[String] = js.native
  var height: Double = js.native
  var src: String = js.native
  var width: Double = js.native
  def addEventListener(event: String, func: js.Function1[/* args */ js.Any, _]): Unit = js.native
}

