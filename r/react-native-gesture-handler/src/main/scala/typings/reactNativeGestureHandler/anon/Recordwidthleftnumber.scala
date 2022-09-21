package typings.reactNativeGestureHandler.anon

import typings.reactNativeGestureHandler.gestureHandlerCommonMod._HitSlop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'width' | 'left', number> */
trait Recordwidthleftnumber
  extends StObject
     with _HitSlop {
  
  var left: Double
  
  var width: Double
}
object Recordwidthleftnumber {
  
  inline def apply(left: Double, width: Double): Recordwidthleftnumber = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordwidthleftnumber]
  }
  
  extension [Self <: Recordwidthleftnumber](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
