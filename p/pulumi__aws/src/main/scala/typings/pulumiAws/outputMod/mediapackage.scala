package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediapackage {
  
  trait ChannelHlsIngest extends StObject {
    
    /**
      * A list of the ingest endpoints
      */
    var ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint]
  }
  object ChannelHlsIngest {
    
    inline def apply(ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint]): ChannelHlsIngest = {
      val __obj = js.Dynamic.literal(ingestEndpoints = ingestEndpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelHlsIngest]
    }
    
    extension [Self <: ChannelHlsIngest](x: Self) {
      
      inline def setIngestEndpoints(value: js.Array[ChannelHlsIngestIngestEndpoint]): Self = StObject.set(x, "ingestEndpoints", value.asInstanceOf[js.Any])
      
      inline def setIngestEndpointsVarargs(value: ChannelHlsIngestIngestEndpoint*): Self = StObject.set(x, "ingestEndpoints", js.Array(value :_*))
    }
  }
  
  trait ChannelHlsIngestIngestEndpoint extends StObject {
    
    /**
      * The password
      */
    var password: String
    
    /**
      * The URL
      */
    var url: String
    
    /**
      * The username
      */
    var username: String
  }
  object ChannelHlsIngestIngestEndpoint {
    
    inline def apply(password: String, url: String, username: String): ChannelHlsIngestIngestEndpoint = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
    }
    
    extension [Self <: ChannelHlsIngestIngestEndpoint](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
