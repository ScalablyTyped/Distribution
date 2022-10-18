package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.decelerateAccelerate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with Interpolation {
  
  var `type`: decelerateAccelerate
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("decelerateAccelerate")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setType(value: decelerateAccelerate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
