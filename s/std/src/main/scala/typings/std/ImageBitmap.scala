package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmap
  extends StObject
     with CanvasImageSource
     with TexImageSource
     with Transferable {
  
  /**
    * Releases imageBitmap's underlying bitmap data.
    */
  def close(): Unit
  
  /**
    * Returns the intrinsic height of the image, in CSS pixels.
    */
  val height: Double
  
  /**
    * Returns the intrinsic width of the image, in CSS pixels.
    */
  val width: Double
}
object ImageBitmap {
  
  inline def apply(close: () => Unit, height: Double, width: Double): ImageBitmap = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageBitmap]
  }
  
  extension [Self <: ImageBitmap](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
