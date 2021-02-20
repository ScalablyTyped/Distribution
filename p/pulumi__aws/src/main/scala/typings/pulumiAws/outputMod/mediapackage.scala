package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediapackage {
  
  @js.native
  trait ChannelHlsIngest extends StObject {
    
    /**
      * A list of the ingest endpoints
      */
    var ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint] = js.native
  }
  object ChannelHlsIngest {
    
    @scala.inline
    def apply(ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint]): ChannelHlsIngest = {
      val __obj = js.Dynamic.literal(ingestEndpoints = ingestEndpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelHlsIngest]
    }
    
    @scala.inline
    implicit class ChannelHlsIngestMutableBuilder[Self <: ChannelHlsIngest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIngestEndpoints(value: js.Array[ChannelHlsIngestIngestEndpoint]): Self = StObject.set(x, "ingestEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngestEndpointsVarargs(value: ChannelHlsIngestIngestEndpoint*): Self = StObject.set(x, "ingestEndpoints", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ChannelHlsIngestIngestEndpoint extends StObject {
    
    /**
      * The password
      */
    var password: String = js.native
    
    /**
      * The URL
      */
    var url: String = js.native
    
    /**
      * The username
      */
    var username: String = js.native
  }
  object ChannelHlsIngestIngestEndpoint {
    
    @scala.inline
    def apply(password: String, url: String, username: String): ChannelHlsIngestIngestEndpoint = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
    }
    
    @scala.inline
    implicit class ChannelHlsIngestIngestEndpointMutableBuilder[Self <: ChannelHlsIngestIngestEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
