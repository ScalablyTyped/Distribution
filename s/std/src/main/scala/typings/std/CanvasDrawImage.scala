package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasDrawImage extends js.Object {
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double): Unit = js.native
  def drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
  def drawImage(
    image: CanvasImageSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    dx: Double,
    dy: Double,
    dw: Double,
    dh: Double
  ): Unit = js.native
}

