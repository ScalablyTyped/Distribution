package typings.pubnub.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.anon.Channels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// grantToken
trait GrantTokenParameters extends StObject {
  
  var authorized_uuid: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var patterns: js.UndefOr[Channels] = js.undefined
  
  var resources: js.UndefOr[Channels] = js.undefined
  
  var ttl: Double
}
object GrantTokenParameters {
  
  inline def apply(ttl: Double): GrantTokenParameters = {
    val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantTokenParameters]
  }
  
  extension [Self <: GrantTokenParameters](x: Self) {
    
    inline def setAuthorized_uuid(value: String): Self = StObject.set(x, "authorized_uuid", value.asInstanceOf[js.Any])
    
    inline def setAuthorized_uuidUndefined: Self = StObject.set(x, "authorized_uuid", js.undefined)
    
    inline def setMeta(value: StringDictionary[Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setPatterns(value: Channels): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setResources(value: Channels): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
