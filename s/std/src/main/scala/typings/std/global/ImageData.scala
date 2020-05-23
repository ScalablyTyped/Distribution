package typings.std.global

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ImageData")
@js.native
class ImageData protected ()
  extends typings.std.ImageData {
  def this(array: typings.std.Uint8ClampedArray, width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(array: typings.std.Uint8ClampedArray, width: Double, height: Double) = this()
  /**
    * Returns the one-dimensional array containing the data in RGBA order, as integers in the range 0 to 255.
    */
  /* CompleteClass */
  override val data: typings.std.Uint8ClampedArray = js.native
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

@JSGlobal("ImageData")
@js.native
object ImageData
  extends Instantiable2[
      (/* width */ Double) | (/* array */ typings.std.Uint8ClampedArray), 
      /* width */ Double, 
      typings.std.ImageData
    ]
     with Instantiable3[
      /* array */ typings.std.Uint8ClampedArray, 
      /* width */ Double, 
      /* height */ Double, 
      typings.std.ImageData
    ]

