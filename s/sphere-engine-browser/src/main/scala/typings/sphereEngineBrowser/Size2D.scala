package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the 2D dimensions (width and height) of something. */
trait Size2D extends StObject {
  
  /** Height, as measured in pixels. */
  var height: Double
  
  /** Width, as measured in pixels. */
  var width: Double
}
object Size2D {
  
  inline def apply(height: Double, width: Double): Size2D = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size2D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Size2D] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
