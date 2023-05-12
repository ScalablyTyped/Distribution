package typings.sentryCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sentryCore.typesHubMod.AsyncContextStrategy
import typings.sentryCore.typesHubMod.Hub
import typings.sentryTypes.typesIntegrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acs extends StObject {
  
  var acs: js.UndefOr[AsyncContextStrategy] = js.undefined
  
  var extensions: js.UndefOr[
    /** Extension methods for the hub, which are bound to the current Hub instance */
  StringDictionary[js.Function]
  ] = js.undefined
  
  var hub: js.UndefOr[Hub] = js.undefined
  
  /**
    * Extra Hub properties injected by various SDKs
    */
  var integrations: js.UndefOr[js.Array[Integration]] = js.undefined
}
object Acs {
  
  inline def apply(): Acs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acs] (val x: Self) extends AnyVal {
    
    inline def setAcs(value: AsyncContextStrategy): Self = StObject.set(x, "acs", value.asInstanceOf[js.Any])
    
    inline def setAcsUndefined: Self = StObject.set(x, "acs", js.undefined)
    
    inline def setExtensions(
      value: /** Extension methods for the hub, which are bound to the current Hub instance */
    StringDictionary[js.Function]
    ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHub(value: Hub): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    inline def setHubUndefined: Self = StObject.set(x, "hub", js.undefined)
    
    inline def setIntegrations(value: js.Array[Integration]): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
    
    inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
    
    inline def setIntegrationsVarargs(value: Integration*): Self = StObject.set(x, "integrations", js.Array(value*))
  }
}
