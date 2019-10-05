package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ImageData")
@js.native
class ImageDataCls protected () extends ImageData {
  def this(width: Double, height: Double) = this()
  def this(array: Uint8ClampedArray, width: Double, height: Double) = this()
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
    */
  /* CompleteClass */
  override val data: Uint8ClampedArray = js.native
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  /* CompleteClass */
  override val height: Double = js.native
  /**
    * Returns the actual dimensions of the data in the ImageData object, in pixels.
    */
  /* CompleteClass */
  override val width: Double = js.native
}

