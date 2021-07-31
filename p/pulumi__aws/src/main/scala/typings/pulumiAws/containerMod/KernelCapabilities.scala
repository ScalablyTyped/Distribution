package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelCapabilities extends StObject {
  
  var add: js.UndefOr[js.Array[KernelCapability]] = js.undefined
  
  var drop: js.UndefOr[js.Array[KernelCapability]] = js.undefined
}
object KernelCapabilities {
  
  @scala.inline
  def apply(): KernelCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KernelCapabilities]
  }
  
  @scala.inline
  implicit class KernelCapabilitiesMutableBuilder[Self <: KernelCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Array[KernelCapability]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAddVarargs(value: KernelCapability*): Self = StObject.set(x, "add", js.Array(value :_*))
    
    @scala.inline
    def setDrop(value: js.Array[KernelCapability]): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setDropVarargs(value: KernelCapability*): Self = StObject.set(x, "drop", js.Array(value :_*))
  }
}
