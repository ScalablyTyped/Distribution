package typings.sharp.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kernel_ extends StObject {
  
  /** height of the kernel in pixels. */
  var height: Double
  
  /** Array of length width*height containing the kernel values. */
  var kernel: ArrayLike[Double]
  
  /** the offset of the kernel in pixels. (optional, default 0) */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** the scale of the kernel in pixels. (optional, default sum) */
  var scale: js.UndefOr[Double] = js.undefined
  
  /** width of the kernel in pixels. */
  var width: Double
}
object Kernel_ {
  
  @scala.inline
  def apply(height: Double, kernel: ArrayLike[Double], width: Double): Kernel_ = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kernel_]
  }
  
  @scala.inline
  implicit class Kernel_MutableBuilder[Self <: Kernel_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernel(value: ArrayLike[Double]): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
