package typings.smithyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@smithy/types", "EndpointURLScheme")
  @js.native
  object EndpointURLScheme extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.smithyTypes.distTypesEndpointMod.EndpointURLScheme & String] = js.native
    
    /* "http" */ val HTTP: typings.smithyTypes.distTypesEndpointMod.EndpointURLScheme.HTTP & String = js.native
    
    /* "https" */ val HTTPS: typings.smithyTypes.distTypesEndpointMod.EndpointURLScheme.HTTPS & String = js.native
  }
  
  @JSImport("@smithy/types", "FieldPosition")
  @js.native
  object FieldPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.smithyTypes.distTypesHttpMod.FieldPosition & Double] = js.native
    
    /* 0 */ val HEADER: typings.smithyTypes.distTypesHttpMod.FieldPosition.HEADER & Double = js.native
    
    /* 1 */ val TRAILER: typings.smithyTypes.distTypesHttpMod.FieldPosition.TRAILER & Double = js.native
  }
  
  @JSImport("@smithy/types", "HttpAuthLocation")
  @js.native
  object HttpAuthLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.smithyTypes.distTypesAuthMod.HttpAuthLocation & String] = js.native
    
    /* "header" */ val HEADER: typings.smithyTypes.distTypesAuthMod.HttpAuthLocation.HEADER & String = js.native
    
    /* "query" */ val QUERY: typings.smithyTypes.distTypesAuthMod.HttpAuthLocation.QUERY & String = js.native
  }
  
  @JSImport("@smithy/types", "RequestHandlerProtocol")
  @js.native
  object RequestHandlerProtocol extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.smithyTypes.distTypesTransferMod.RequestHandlerProtocol & String] = js.native
    
    /* "http/0.9" */ val HTTP_0_9: typings.smithyTypes.distTypesTransferMod.RequestHandlerProtocol.HTTP_0_9 & String = js.native
    
    /* "http/1.0" */ val HTTP_1_0: typings.smithyTypes.distTypesTransferMod.RequestHandlerProtocol.HTTP_1_0 & String = js.native
    
    /* "tds/8.0" */ val TDS_8_0: typings.smithyTypes.distTypesTransferMod.RequestHandlerProtocol.TDS_8_0 & String = js.native
  }
}
