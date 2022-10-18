package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.fastOutSlowIn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with Interpolation {
  
  var `type`: fastOutSlowIn
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fastOutSlowIn")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setType(value: fastOutSlowIn): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
