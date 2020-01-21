package typings.reactNativeCanvas.mod

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-canvas", "ImageData")
@js.native
class ImageData protected () extends js.Object {
  def this(canvas: Canvas, data: js.Array[Double], height: Double, width: Double) = this()
  val data: Uint8ClampedArray = js.native
  val height: Double = js.native
  val width: Double = js.native
}

