package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentNativeConstructor
  extends StObject
     with ComponentConstructor {
  
  @JSName("cmpMeta")
  var cmpMeta_ComponentNativeConstructor: ComponentRuntimeMeta
}
object ComponentNativeConstructor {
  
  inline def apply(cmpMeta: ComponentRuntimeMeta): ComponentNativeConstructor = {
    val __obj = js.Dynamic.literal(cmpMeta = cmpMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentNativeConstructor]
  }
  
  extension [Self <: ComponentNativeConstructor](x: Self) {
    
    inline def setCmpMeta(value: ComponentRuntimeMeta): Self = StObject.set(x, "cmpMeta", value.asInstanceOf[js.Any])
  }
}
