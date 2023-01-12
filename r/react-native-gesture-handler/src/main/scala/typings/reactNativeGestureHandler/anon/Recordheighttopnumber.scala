package typings.reactNativeGestureHandler.anon

import typings.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod._HitSlop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'height' | 'top', number> */
trait Recordheighttopnumber
  extends StObject
     with _HitSlop {
  
  var height: Double
  
  var top: Double
}
object Recordheighttopnumber {
  
  inline def apply(height: Double, top: Double): Recordheighttopnumber = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordheighttopnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Recordheighttopnumber] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
