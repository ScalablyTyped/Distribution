package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageData
  extends ImageBitmapSource
     with TexImageSource {
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the
    * range 0 to 255.
    */
  val data: Uint8ClampedArray
  /**
    * Returns the actual dimensions of the data in the ImageData object, in
    * pixels.
    */
  val height: scala.Double
  val width: scala.Double
}

@JSGlobal("ImageData")
@js.native
class ImageDataCls protected () extends ImageData {
  def this(width: scala.Double, height: scala.Double) = this()
  def this(array: Uint8ClampedArray, width: scala.Double, height: scala.Double) = this()
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the
    * range 0 to 255.
    */
  /* CompleteClass */
  override val data: Uint8ClampedArray = js.native
  /**
    * Returns the actual dimensions of the data in the ImageData object, in
    * pixels.
    */
  /* CompleteClass */
  override val height: scala.Double = js.native
  /* CompleteClass */
  override val width: scala.Double = js.native
}

@JSGlobal("ImageData")
@js.native
object ImageData
  extends org.scalablytyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, ImageData]
     with org.scalablytyped.runtime.Instantiable3[
      /* array */ Uint8ClampedArray, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      ImageData
    ]

