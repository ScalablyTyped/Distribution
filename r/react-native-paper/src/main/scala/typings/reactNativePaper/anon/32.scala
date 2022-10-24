package typings.reactNativePaper.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var children: ReactNode
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
