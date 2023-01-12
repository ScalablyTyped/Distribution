package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkletFunction extends StObject {
  
  var __optimalization: js.UndefOr[Double] = js.undefined
  
  var __workletHash: js.UndefOr[Double] = js.undefined
  
  var _closure: js.UndefOr[Context] = js.undefined
}
object WorkletFunction {
  
  inline def apply(): WorkletFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkletFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkletFunction] (val x: Self) extends AnyVal {
    
    inline def set__optimalization(value: Double): Self = StObject.set(x, "__optimalization", value.asInstanceOf[js.Any])
    
    inline def set__optimalizationUndefined: Self = StObject.set(x, "__optimalization", js.undefined)
    
    inline def set__workletHash(value: Double): Self = StObject.set(x, "__workletHash", value.asInstanceOf[js.Any])
    
    inline def set__workletHashUndefined: Self = StObject.set(x, "__workletHash", js.undefined)
    
    inline def set_closure(value: Context): Self = StObject.set(x, "_closure", value.asInstanceOf[js.Any])
    
    inline def set_closureUndefined: Self = StObject.set(x, "_closure", js.undefined)
  }
}
