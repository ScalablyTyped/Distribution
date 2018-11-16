package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasImageData extends js.Object {
  def createImageData(imagedata: ImageData): ImageData = js.native
  def createImageData(sw: scala.Double, sh: scala.Double): ImageData = js.native
  def getImageData(sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): ImageData = js.native
  def putImageData(imagedata: ImageData, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def putImageData(
    imagedata: ImageData,
    dx: scala.Double,
    dy: scala.Double,
    dirtyX: scala.Double,
    dirtyY: scala.Double,
    dirtyWidth: scala.Double,
    dirtyHeight: scala.Double
  ): scala.Unit = js.native
}

