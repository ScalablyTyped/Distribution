package typings.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("ImageBitmap")
@js.native
object ImageBitmap extends Instantiable0[ImageBitmap]

