package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericAnimation extends StObject {
  
  var current: js.UndefOr[Double] = js.undefined
}
object NumericAnimation {
  
  inline def apply(): NumericAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericAnimation] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
  }
}
