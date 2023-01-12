package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.overshoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tension
  extends StObject
     with Interpolation {
  
  var tension: js.UndefOr[Double] = js.undefined
  
  var `type`: overshoot
}
object Tension {
  
  inline def apply(): Tension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("overshoot")
    __obj.asInstanceOf[Tension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tension] (val x: Self) extends AnyVal {
    
    inline def setTension(value: Double): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
    
    inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
    
    inline def setType(value: overshoot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
