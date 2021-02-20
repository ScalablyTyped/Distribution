package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmap
  extends CanvasImageSource
     with TexImageSource
     with Transferable {
  
  /**
    * Releases imageBitmap's underlying bitmap data.
    */
  def close(): Unit = js.native
  
  /**
    * Returns the intrinsic height of the image, in CSS pixels.
    */
  val height: Double = js.native
  
  /**
    * Returns the intrinsic width of the image, in CSS pixels.
    */
  val width: Double = js.native
}
object ImageBitmap {
  
  @scala.inline
  def apply(close: () => Unit, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmap]
  }
  
  @scala.inline
  implicit class ImageBitmapMutableBuilder[Self <: ImageBitmap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
