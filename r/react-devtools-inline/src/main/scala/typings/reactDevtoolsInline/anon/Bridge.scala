package typings.reactDevtoolsInline.anon

import typings.reactDevtoolsInline.commonsMod.BackendBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bridge extends StObject {
  
  var bridge: js.UndefOr[BackendBridge] = js.undefined
}
object Bridge {
  
  inline def apply(): Bridge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bridge]
  }
  
  extension [Self <: Bridge](x: Self) {
    
    inline def setBridge(value: BackendBridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
  }
}
