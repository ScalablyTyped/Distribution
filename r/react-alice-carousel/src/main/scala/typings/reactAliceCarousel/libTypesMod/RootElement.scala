package typings.reactAliceCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootElement extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object RootElement {
  
  inline def apply(): RootElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootElement]
  }
  
  extension [Self <: RootElement](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
