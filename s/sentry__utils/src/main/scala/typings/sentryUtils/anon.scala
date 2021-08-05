package typings.sentryUtils

import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GlobalEventProcessors extends StObject {
    
    var globalEventProcessors: js.Any
    
    var hub: js.Any
    
    var logger: js.Any
  }
  object GlobalEventProcessors {
    
    inline def apply(globalEventProcessors: js.Any, hub: js.Any, logger: js.Any): GlobalEventProcessors = {
      val __obj = js.Dynamic.literal(globalEventProcessors = globalEventProcessors.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalEventProcessors]
    }
    
    extension [Self <: GlobalEventProcessors](x: Self) {
      
      inline def setGlobalEventProcessors(value: js.Any): Self = StObject.set(x, "globalEventProcessors", value.asInstanceOf[js.Any])
      
      inline def setHub(value: js.Any): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var relative: js.UndefOr[String] = js.undefined
  }
  object Host {
    
    inline def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
  }
  object Id {
    
    inline def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Integrations extends StObject {
    
    var Integrations: js.UndefOr[js.Array[Integration]] = js.undefined
  }
  object Integrations {
    
    inline def apply(): Integrations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Integrations]
    }
    
    extension [Self <: Integrations](x: Self) {
      
      inline def setIntegrations(value: js.Array[Integration]): Self = StObject.set(x, "Integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "Integrations", js.undefined)
      
      inline def setIntegrationsVarargs(value: Integration*): Self = StObject.set(x, "Integrations", js.Array(value :_*))
    }
  }
}
