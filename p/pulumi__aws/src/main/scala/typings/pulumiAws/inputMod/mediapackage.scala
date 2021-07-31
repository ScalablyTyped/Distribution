package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediapackage {
  
  trait ChannelHlsIngest extends StObject {
    
    /**
      * A list of the ingest endpoints
      */
    var ingestEndpoints: js.UndefOr[Input[js.Array[Input[ChannelHlsIngestIngestEndpoint]]]] = js.undefined
  }
  object ChannelHlsIngest {
    
    @scala.inline
    def apply(): ChannelHlsIngest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelHlsIngest]
    }
    
    @scala.inline
    implicit class ChannelHlsIngestMutableBuilder[Self <: ChannelHlsIngest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIngestEndpoints(value: Input[js.Array[Input[ChannelHlsIngestIngestEndpoint]]]): Self = StObject.set(x, "ingestEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngestEndpointsUndefined: Self = StObject.set(x, "ingestEndpoints", js.undefined)
      
      @scala.inline
      def setIngestEndpointsVarargs(value: Input[ChannelHlsIngestIngestEndpoint]*): Self = StObject.set(x, "ingestEndpoints", js.Array(value :_*))
    }
  }
  
  trait ChannelHlsIngestIngestEndpoint extends StObject {
    
    /**
      * The password
      */
    var password: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The URL
      */
    var url: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The username
      */
    var username: js.UndefOr[Input[String]] = js.undefined
  }
  object ChannelHlsIngestIngestEndpoint {
    
    @scala.inline
    def apply(): ChannelHlsIngestIngestEndpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelHlsIngestIngestEndpoint]
    }
    
    @scala.inline
    implicit class ChannelHlsIngestIngestEndpointMutableBuilder[Self <: ChannelHlsIngestIngestEndpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setUrl(value: Input[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
