package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBitmap
  extends CanvasImageSource
     with TexImageSource
     with Transferable {
  /**
    * Returns the intrinsic height of the image, in CSS
    * pixels.
    */
  val height: scala.Double
  /**
    * Returns the intrinsic width of the image, in CSS
    * pixels.
    */
  val width: scala.Double
  /**
    * Releases imageBitmap's underlying bitmap data.
    */
  def close(): scala.Unit
}

@JSGlobal("ImageBitmap")
@js.native
class ImageBitmapCls () extends ImageBitmap {
  /**
    * Returns the intrinsic height of the image, in CSS
    * pixels.
    */
  /* CompleteClass */
  override val height: scala.Double = js.native
  /**
    * Returns the intrinsic width of the image, in CSS
    * pixels.
    */
  /* CompleteClass */
  override val width: scala.Double = js.native
  /**
    * Releases imageBitmap's underlying bitmap data.
    */
  /* CompleteClass */
  override def close(): scala.Unit = js.native
}

@JSGlobal("ImageBitmap")
@js.native
object ImageBitmap
  extends org.scalablytyped.runtime.Instantiable0[ImageBitmap]

