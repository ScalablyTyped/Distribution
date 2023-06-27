package typings.smithyTypes

import typings.smithyTypes.smithyTypesStrings.sigv4
import typings.smithyTypes.smithyTypesStrings.sigv4a
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAuthMod {
  
  @js.native
  sealed trait HttpAuthLocation extends StObject
  @JSImport("@smithy/types/dist-types/auth", "HttpAuthLocation")
  @js.native
  object HttpAuthLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HttpAuthLocation & String] = js.native
    
    @js.native
    sealed trait HEADER
      extends StObject
         with HttpAuthLocation
    /* "header" */ val HEADER: typings.smithyTypes.distTypesAuthMod.HttpAuthLocation.HEADER & String = js.native
    
    @js.native
    sealed trait QUERY
      extends StObject
         with HttpAuthLocation
    /* "query" */ val QUERY: typings.smithyTypes.distTypesAuthMod.HttpAuthLocation.QUERY & String = js.native
  }
  
  trait AuthScheme extends StObject {
    
    /**
      * @example "sigv4a" or "sigv4"
      */
    var name: sigv4 | sigv4a | String
    
    var properties: Record[String, Any]
    
    /**
      * @example "s3"
      */
    var signingName: String
    
    /**
      * @example "us-east-1"
      */
    var signingRegion: String
    
    /**
      * @example ["*"]
      * @example ["us-west-2", "us-east-1"]
      */
    var signingRegionSet: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @deprecated this field was renamed to signingRegion.
      */
    var signingScope: js.UndefOr[scala.Nothing] = js.undefined
  }
  object AuthScheme {
    
    inline def apply(
      name: sigv4 | sigv4a | String,
      properties: Record[String, Any],
      signingName: String,
      signingRegion: String
    ): AuthScheme = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], signingName = signingName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthScheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthScheme] (val x: Self) extends AnyVal {
      
      inline def setName(value: sigv4 | sigv4a | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setSigningName(value: String): Self = StObject.set(x, "signingName", value.asInstanceOf[js.Any])
      
      inline def setSigningRegion(value: String): Self = StObject.set(x, "signingRegion", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionSet(value: js.Array[String]): Self = StObject.set(x, "signingRegionSet", value.asInstanceOf[js.Any])
      
      inline def setSigningRegionSetUndefined: Self = StObject.set(x, "signingRegionSet", js.undefined)
      
      inline def setSigningRegionSetVarargs(value: String*): Self = StObject.set(x, "signingRegionSet", js.Array(value*))
    }
  }
  
  trait HttpAuthDefinition extends StObject {
    
    /**
      * Defines the location of where the Auth is serialized.
      */
    var in: HttpAuthLocation
    
    /**
      * Defines the name of the HTTP header or query string parameter
      * that contains the Auth.
      */
    var name: String
    
    /**
      * Defines the security scheme to use on the `Authorization` header value.
      * This can only be set if the "in" property is set to {@link HttpAuthLocation.HEADER}.
      */
    var scheme: js.UndefOr[String] = js.undefined
  }
  object HttpAuthDefinition {
    
    inline def apply(in: HttpAuthLocation, name: String): HttpAuthDefinition = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpAuthDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpAuthDefinition] (val x: Self) extends AnyVal {
      
      inline def setIn(value: HttpAuthLocation): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    }
  }
}
