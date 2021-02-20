package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationOptions extends StObject {
  
  var scope: js.UndefOr[java.lang.String] = js.native
  
  var `type`: js.UndefOr[WorkerType] = js.native
  
  var updateViaCache: js.UndefOr[ServiceWorkerUpdateViaCache] = js.native
}
object RegistrationOptions {
  
  @scala.inline
  def apply(): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistrationOptions]
  }
  
  @scala.inline
  implicit class RegistrationOptionsMutableBuilder[Self <: RegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: java.lang.String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setType(value: WorkerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateViaCache(value: ServiceWorkerUpdateViaCache): Self = StObject.set(x, "updateViaCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateViaCacheUndefined: Self = StObject.set(x, "updateViaCache", js.undefined)
  }
}
