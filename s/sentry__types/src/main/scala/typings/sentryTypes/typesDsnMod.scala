package typings.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDsnMod {
  
  trait DsnComponents extends StObject {
    
    /** Hostname of the Sentry instance. */
    var host: String
    
    /** Private authorization key (deprecated, optional). */
    var pass: js.UndefOr[String] = js.undefined
    
    /** Sub path/ */
    var path: js.UndefOr[String] = js.undefined
    
    /** Port of the Sentry instance. */
    var port: js.UndefOr[String] = js.undefined
    
    /** Project ID */
    var projectId: String
    
    /** Protocol used to connect to Sentry. */
    var protocol: DsnProtocol
    
    /** Public authorization key. */
    var publicKey: js.UndefOr[String] = js.undefined
  }
  object DsnComponents {
    
    inline def apply(host: String, projectId: String, protocol: DsnProtocol): DsnComponents = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[DsnComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DsnComponents] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: DsnProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    }
  }
  
  type DsnLike = String | DsnComponents
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.http
    - typings.sentryTypes.sentryTypesStrings.https
  */
  trait DsnProtocol extends StObject
  object DsnProtocol {
    
    inline def http: typings.sentryTypes.sentryTypesStrings.http = "http".asInstanceOf[typings.sentryTypes.sentryTypesStrings.http]
    
    inline def https: typings.sentryTypes.sentryTypesStrings.https = "https".asInstanceOf[typings.sentryTypes.sentryTypesStrings.https]
  }
}
