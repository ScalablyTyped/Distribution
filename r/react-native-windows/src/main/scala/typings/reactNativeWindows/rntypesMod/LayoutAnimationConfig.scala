package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimationConfig extends StObject {
  
  var create: js.UndefOr[LayoutAnimationAnim] = js.undefined
  
  var delete: js.UndefOr[LayoutAnimationAnim] = js.undefined
  
  var duration: Double
  
  var update: js.UndefOr[LayoutAnimationAnim] = js.undefined
}
object LayoutAnimationConfig {
  
  inline def apply(duration: Double): LayoutAnimationConfig = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAnimationConfig]
  }
  
  extension [Self <: LayoutAnimationConfig](x: Self) {
    
    inline def setCreate(value: LayoutAnimationAnim): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDelete(value: LayoutAnimationAnim): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: LayoutAnimationAnim): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
