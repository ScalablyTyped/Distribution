package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeScrollSize extends StObject {
  
  var height: Double
  
  var width: Double
}
object NativeScrollSize {
  
  @scala.inline
  def apply(height: Double, width: Double): NativeScrollSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeScrollSize]
  }
  
  @scala.inline
  implicit class NativeScrollSizeMutableBuilder[Self <: NativeScrollSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
