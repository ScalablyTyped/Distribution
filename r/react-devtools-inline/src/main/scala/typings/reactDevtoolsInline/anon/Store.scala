package typings.reactDevtoolsInline.anon

import typings.reactDevtoolsInline.commonsMod.FrontendBridge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store extends StObject {
  
  var bridge: js.UndefOr[FrontendBridge] = js.undefined
  
  var store: js.UndefOr[typings.reactDevtoolsInline.commonsMod.Store] = js.undefined
}
object Store {
  
  inline def apply(): Store = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
    
    inline def setBridge(value: FrontendBridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
    
    inline def setStore(value: typings.reactDevtoolsInline.commonsMod.Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
  }
}
