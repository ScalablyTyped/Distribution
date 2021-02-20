package typings.sentryUtils

import typings.sentryTypes.integrationMod.Integration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GlobalEventProcessors extends StObject {
    
    var globalEventProcessors: js.Any = js.native
    
    var hub: js.Any = js.native
    
    var logger: js.Any = js.native
  }
  object GlobalEventProcessors {
    
    @scala.inline
    def apply(globalEventProcessors: js.Any, hub: js.Any, logger: js.Any): GlobalEventProcessors = {
      val __obj = js.Dynamic.literal(globalEventProcessors = globalEventProcessors.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalEventProcessors]
    }
    
    @scala.inline
    implicit class GlobalEventProcessorsMutableBuilder[Self <: GlobalEventProcessors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobalEventProcessors(value: js.Any): Self = StObject.set(x, "globalEventProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHub(value: js.Any): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogger(value: js.Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var relative: js.UndefOr[String] = js.native
  }
  object Host {
    
    @scala.inline
    def apply(): Host = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.native
  }
  object Id {
    
    @scala.inline
    def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait Integrations extends StObject {
    
    var Integrations: js.UndefOr[js.Array[Integration]] = js.native
  }
  object Integrations {
    
    @scala.inline
    def apply(): Integrations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Integrations]
    }
    
    @scala.inline
    implicit class IntegrationsMutableBuilder[Self <: Integrations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntegrations(value: js.Array[Integration]): Self = StObject.set(x, "Integrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationsUndefined: Self = StObject.set(x, "Integrations", js.undefined)
      
      @scala.inline
      def setIntegrationsVarargs(value: Integration*): Self = StObject.set(x, "Integrations", js.Array(value :_*))
    }
  }
}
