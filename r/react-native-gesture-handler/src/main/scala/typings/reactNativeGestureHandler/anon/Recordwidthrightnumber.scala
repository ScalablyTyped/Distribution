package typings.reactNativeGestureHandler.anon

import typings.reactNativeGestureHandler.gestureHandlerCommonMod._HitSlop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'width' | 'right', number> */
trait Recordwidthrightnumber
  extends StObject
     with _HitSlop {
  
  var right: Double
  
  var width: Double
}
object Recordwidthrightnumber {
  
  inline def apply(right: Double, width: Double): Recordwidthrightnumber = {
    val __obj = js.Dynamic.literal(right = right.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordwidthrightnumber]
  }
  
  extension [Self <: Recordwidthrightnumber](x: Self) {
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
