package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxSize extends StObject {
  
  var boxHeight: Double
  
  var boxWidth: Double
}
object BoxSize {
  
  inline def apply(boxHeight: Double, boxWidth: Double): BoxSize = {
    val __obj = js.Dynamic.literal(boxHeight = boxHeight.asInstanceOf[js.Any], boxWidth = boxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSize]
  }
  
  extension [Self <: BoxSize](x: Self) {
    
    inline def setBoxHeight(value: Double): Self = StObject.set(x, "boxHeight", value.asInstanceOf[js.Any])
    
    inline def setBoxWidth(value: Double): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
  }
}
