package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmap
  extends CanvasImageSource
     with TexImageSource
     with Transferable {
  /**
    * Returns the intrinsic height of the image, in CSS pixels.
    */
  val height: Double
  /**
    * Returns the intrinsic width of the image, in CSS pixels.
    */
  val width: Double
  /**
    * Releases imageBitmap's underlying bitmap data.
    */
  def close(): Unit
}

object ImageBitmap {
  @scala.inline
  def apply(close: () => Unit, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmap]
  }
}

