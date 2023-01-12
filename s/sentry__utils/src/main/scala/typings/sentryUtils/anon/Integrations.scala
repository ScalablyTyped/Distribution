package typings.sentryUtils.anon

import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integrations extends StObject {
  
  var Integrations: js.UndefOr[js.Array[Integration]] = js.undefined
}
object Integrations {
  
  inline def apply(): Integrations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Integrations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Integrations] (val x: Self) extends AnyVal {
    
    inline def setIntegrations(value: js.Array[Integration]): Self = StObject.set(x, "Integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "Integrations", js.undefined)
    
    inline def setIntegrationsVarargs(value: Integration*): Self = StObject.set(x, "Integrations", js.Array(value*))
  }
}
