package typings.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleImportPointer extends StObject {
  
  @JSName("$fragmentSpreads")
  val $fragmentSpreads: Any
  
  val __fragmentPropName: js.UndefOr[String | Null] = js.undefined
  
  val __module_component: Any
}
object ModuleImportPointer {
  
  inline def apply($fragmentSpreads: Any, __module_component: Any): ModuleImportPointer = {
    val __obj = js.Dynamic.literal($fragmentSpreads = $fragmentSpreads.asInstanceOf[js.Any], __module_component = __module_component.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleImportPointer]
  }
  
  extension [Self <: ModuleImportPointer](x: Self) {
    
    inline def set$fragmentSpreads(value: Any): Self = StObject.set(x, "$fragmentSpreads", value.asInstanceOf[js.Any])
    
    inline def set__fragmentPropName(value: String): Self = StObject.set(x, "__fragmentPropName", value.asInstanceOf[js.Any])
    
    inline def set__fragmentPropNameNull: Self = StObject.set(x, "__fragmentPropName", null)
    
    inline def set__fragmentPropNameUndefined: Self = StObject.set(x, "__fragmentPropName", js.undefined)
    
    inline def set__module_component(value: Any): Self = StObject.set(x, "__module_component", value.asInstanceOf[js.Any])
  }
}
