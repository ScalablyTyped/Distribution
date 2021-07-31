package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ImageData")
@js.native
class ImageData protected ()
  extends StObject
     with typings.std.ImageData {
  def this(data: typings.std.Uint8ClampedArray, sw: Double) = this()
  def this(sw: Double, sh: Double) = this()
  def this(data: typings.std.Uint8ClampedArray, sw: Double, sh: Double) = this()
  
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
