package typings.raml1Parser

import typings.raml1Parser.anon.NameValue
import typings.raml1Parser.bodiesMod.BodyLike08
import typings.raml1Parser.bodiesMod.Response08
import typings.raml1Parser.commonMod.HasSource
import typings.raml1Parser.parametersMod.Parameter08
import typings.raml1Parser.securityMod.AbstractSecurityScheme08
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodsMod {
  
  trait Method08
    extends StObject
       with MethodBase08 {
    
    /**
      * AbsoluteComplete relative URI of the owner resource
      */
    var absoluteParentUri: String
    
    /**
      * Instantiation of applyed traits
      */
    var is: js.UndefOr[js.Array[TemplateReference]] = js.undefined
    
    /**
      * Method that can be called
      */
    var method: String
    
    /**
      * Complete relative URI of the owner resource
      */
    var parentUri: String
    
    var uriParameters: js.UndefOr[js.Array[Parameter08]] = js.undefined
  }
  object Method08 {
    
    inline def apply(absoluteParentUri: String, method: String, parentUri: String, protocols: js.Array[String]): Method08 = {
      val __obj = js.Dynamic.literal(absoluteParentUri = absoluteParentUri.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentUri = parentUri.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method08]
    }
    
    extension [Self <: Method08](x: Self) {
      
      inline def setAbsoluteParentUri(value: String): Self = StObject.set(x, "absoluteParentUri", value.asInstanceOf[js.Any])
      
      inline def setIs(value: js.Array[TemplateReference]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVarargs(value: TemplateReference*): Self = StObject.set(x, "is", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParentUri(value: String): Self = StObject.set(x, "parentUri", value.asInstanceOf[js.Any])
      
      inline def setUriParameters(value: js.Array[Parameter08]): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
      
      inline def setUriParametersUndefined: Self = StObject.set(x, "uriParameters", js.undefined)
      
      inline def setUriParametersVarargs(value: Parameter08*): Self = StObject.set(x, "uriParameters", js.Array(value*))
    }
  }
  
  trait MethodBase08
    extends StObject
       with HasSource {
    
    /**
      * A resource or a method can override a base URI template's values.
      * This is useful to restrict or change the default or parameter selection
      * in the base URI. The baseUriParameters property MAY be used to override
      * any or all parameters defined at the root level baseUriParameters
      * property, as well as base URI parameters not specified at the root level.
      */
    var baseUriParameters: js.UndefOr[js.Array[Parameter08]] = js.undefined
    
    /**
      * Some method verbs expect the resource to be sent as a request body.
      * For example, to create a resource, the request must include the
      * details of the resource to create. Resources CAN have alternate
      * representations. For example, an API might support both JSON and XML
      * representations. A method's body is defined in the body property as
      * a hashmap, in which the key MUST be a valid media type.
      */
    var body: js.UndefOr[js.Array[BodyLike08]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Headers that allowed at this position
      */
    var headers: js.UndefOr[js.Array[Parameter08]] = js.undefined
    
    /**
      * A method can override an API's protocols value for that single
      * method by setting a different value for the fields.
      */
    var protocols: js.Array[String]
    
    /**
      * An APIs resources MAY be filtered (to return a subset of results)
      * or altered (such as transforming a response body from JSON to XML format)
      * by the use of query strings. If the resource or its method supports a
      * query string, the query string MUST be defined by the queryParameters property
      */
    var queryParameters: js.UndefOr[js.Array[Parameter08]] = js.undefined
    
    /**
      * Resource methods MAY have one or more responses.
      * Responses MAY be described using the description property,
      * and MAY include example attributes or schema properties.
      */
    var responses: js.UndefOr[js.Array[Response08]] = js.undefined
    
    /**
      * A list of the security schemas to apply, these must be defined
      * in the securitySchemes declaration. To indicate that the method
      * may be called without applying any securityScheme, the method
      * may be annotated with the null securityScheme. Security schemas
      * may also be applied to a resource with securedBy, which is
      * equivalent to applying the security schemas to all methods that
      * may be declared, explicitly or implicitly, by defining the
      * resourceTypes or traits property for that resource.
      */
    var securedBy: js.UndefOr[js.Array[AbstractSecurityScheme08]] = js.undefined
  }
  object MethodBase08 {
    
    inline def apply(protocols: js.Array[String]): MethodBase08 = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodBase08]
    }
    
    extension [Self <: MethodBase08](x: Self) {
      
      inline def setBaseUriParameters(value: js.Array[Parameter08]): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
      
      inline def setBaseUriParametersUndefined: Self = StObject.set(x, "baseUriParameters", js.undefined)
      
      inline def setBaseUriParametersVarargs(value: Parameter08*): Self = StObject.set(x, "baseUriParameters", js.Array(value*))
      
      inline def setBody(value: js.Array[BodyLike08]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBodyVarargs(value: BodyLike08*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeaders(value: js.Array[Parameter08]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Parameter08*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setQueryParameters(value: js.Array[Parameter08]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setQueryParametersVarargs(value: Parameter08*): Self = StObject.set(x, "queryParameters", js.Array(value*))
      
      inline def setResponses(value: js.Array[Response08]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      inline def setResponsesVarargs(value: Response08*): Self = StObject.set(x, "responses", js.Array(value*))
      
      inline def setSecuredBy(value: js.Array[AbstractSecurityScheme08]): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setSecuredByVarargs(value: AbstractSecurityScheme08*): Self = StObject.set(x, "securedBy", js.Array(value*))
    }
  }
  
  trait TemplateReference extends StObject {
    
    var name: String
    
    var parameters: js.UndefOr[js.Array[NameValue]] = js.undefined
  }
  object TemplateReference {
    
    inline def apply(name: String): TemplateReference = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateReference]
    }
    
    extension [Self <: TemplateReference](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: js.Array[NameValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setParametersVarargs(value: NameValue*): Self = StObject.set(x, "parameters", js.Array(value*))
    }
  }
  
  trait Trait
    extends StObject
       with MethodBase08 {
    
    /**
      * An alternate, human-friendly name for the trait
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the trait
      */
    var name: String
    
    /**
      * Instructions on how and when the trait should be used.
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object Trait {
    
    inline def apply(name: String, protocols: js.Array[String]): Trait = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Trait]
    }
    
    extension [Self <: Trait](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
}
