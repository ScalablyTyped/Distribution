package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelCapabilities extends StObject {
  
  var add: js.UndefOr[js.Array[KernelCapability]] = js.undefined
  
  var drop: js.UndefOr[js.Array[KernelCapability]] = js.undefined
}
object KernelCapabilities {
  
  inline def apply(): KernelCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KernelCapabilities]
  }
  
  extension [Self <: KernelCapabilities](x: Self) {
    
    inline def setAdd(value: js.Array[KernelCapability]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: KernelCapability*): Self = StObject.set(x, "add", js.Array(value :_*))
    
    inline def setDrop(value: js.Array[KernelCapability]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setDropVarargs(value: KernelCapability*): Self = StObject.set(x, "drop", js.Array(value :_*))
  }
}
