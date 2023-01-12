package typings.reactNativeMaps.anon

import typings.reactNativeMaps.libSharedTypesMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Continuous extends StObject {
  
  var continuous: Boolean
  
  var isGesture: js.UndefOr[Boolean] = js.undefined
  
  var region: Region
}
object Continuous {
  
  inline def apply(continuous: Boolean, region: Region): Continuous = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continuous]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Continuous] (val x: Self) extends AnyVal {
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setIsGesture(value: Boolean): Self = StObject.set(x, "isGesture", value.asInstanceOf[js.Any])
    
    inline def setIsGestureUndefined: Self = StObject.set(x, "isGesture", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
  }
}
