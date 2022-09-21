package typings.raml1Parser

import typings.raml1Parser.anon.NameValue
import typings.raml1Parser.datamodelMod.ObjectTypeDeclaration
import typings.raml1Parser.datamodelMod.TypeDeclaration
import typings.raml1Parser.spec10CommonMod.Annotable
import typings.raml1Parser.spec10CommonMod.UsesDeclaration
import typings.raml1Parser.spec10SecurityMod.SecuritySchemeBase10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spec10MethodsMod {
  
  trait Method10
    extends StObject
       with MethodBase10 {
    
    /**
      * Absolute URI of the owner resource if any
      */
    var absoluteParentUri: js.UndefOr[String] = js.undefined
    
    /**
      * Method name
      */
    var method: String
    
    /**
      * Complete relative URI of the owner resource if any
      */
    var parentUri: js.UndefOr[String] = js.undefined
    
    var uriParameters: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
  }
  object Method10 {
    
    inline def apply(method: String): Method10 = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method10]
    }
    
    extension [Self <: Method10](x: Self) {
      
      inline def setAbsoluteParentUri(value: String): Self = StObject.set(x, "absoluteParentUri", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteParentUriUndefined: Self = StObject.set(x, "absoluteParentUri", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParentUri(value: String): Self = StObject.set(x, "parentUri", value.asInstanceOf[js.Any])
      
      inline def setParentUriUndefined: Self = StObject.set(x, "parentUri", js.undefined)
      
      inline def setUriParameters(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
      
      inline def setUriParametersUndefined: Self = StObject.set(x, "uriParameters", js.undefined)
      
      inline def setUriParametersVarargs(value: TypeDeclaration*): Self = StObject.set(x, "uriParameters", js.Array(value*))
    }
  }
  
  trait MethodBase10
    extends StObject
       with Operation10 {
    
    /**
      * Some method verbs expect the resource to be sent as a request body.
      * For example, to create a resource, the request must include the details
      * of the resource to create. Resources CAN have alternate representations.
      * For example, an API might support both JSON and XML representations.
      * A method's body is defined in the body property as a hashmap, in which
      * the key MUST be a valid media type.
      */
    var body: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Instantiation of applyed traits
      */
    var is: js.UndefOr[js.Array[TemplateReference]] = js.undefined
    
    /**
      * A method can override the protocols specified in the resource
      * or at the API root, by employing this property.
      */
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * securityScheme may also be applied to a resource by using the
      * securedBy key, which is equivalent to applying the securityScheme
      * to all methods that may be declared, explicitly or implicitly,
      * by defining the resourceTypes or traits property for that resource.
      * To indicate that the method may be called without applying any securityScheme,
      * the method may be annotated with the null securityScheme.
      */
    var securedBy: js.UndefOr[js.Array[SecuritySchemeBase10]] = js.undefined
  }
  object MethodBase10 {
    
    inline def apply(): MethodBase10 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MethodBase10]
    }
    
    extension [Self <: MethodBase10](x: Self) {
      
      inline def setBody(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBodyVarargs(value: TypeDeclaration*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIs(value: js.Array[TemplateReference]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVarargs(value: TemplateReference*): Self = StObject.set(x, "is", js.Array(value*))
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setSecuredBy(value: js.Array[SecuritySchemeBase10]): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setSecuredByVarargs(value: SecuritySchemeBase10*): Self = StObject.set(x, "securedBy", js.Array(value*))
    }
  }
  
  trait Operation10
    extends StObject
       with Annotable {
    
    /**
      * Headers that allowed at this position
      */
    var headers: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
    
    /**
      * An APIs resources MAY be filtered (to return a subset of results)
      * or altered (such as transforming  a response body from JSON to XML format)
      * by the use of query strings. If the resource or its method supports
      * a query string, the query string MUST be defined by the queryParameters property
      */
    var queryParameters: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
    
    var queryString: js.UndefOr[ObjectTypeDeclaration] = js.undefined
    
    /**
      * Information about the expected responses to a request
      */
    var responses: js.UndefOr[js.Array[Response10]] = js.undefined
  }
  object Operation10 {
    
    inline def apply(): Operation10 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation10]
    }
    
    extension [Self <: Operation10](x: Self) {
      
      inline def setHeaders(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: TypeDeclaration*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setQueryParameters(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setQueryParametersVarargs(value: TypeDeclaration*): Self = StObject.set(x, "queryParameters", js.Array(value*))
      
      inline def setQueryString(value: ObjectTypeDeclaration): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
      
      inline def setResponses(value: js.Array[Response10]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      inline def setResponsesVarargs(value: Response10*): Self = StObject.set(x, "responses", js.Array(value*))
    }
  }
  
  trait Response10
    extends StObject
       with Annotable {
    
    /**
      * The body of the response: a body declaration
      */
    var body: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
    
    /**
      * Responses MUST be a map of one or more HTTP status codes,
      * where each status code itself is a map that describes that status code.
      */
    var code: String
    
    /**
      * A longer, human-friendly description of the response
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Detailed information about any response headers returned by this method
      */
    var headers: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
  }
  object Response10 {
    
    inline def apply(code: String): Response10 = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response10]
    }
    
    extension [Self <: Response10](x: Self) {
      
      inline def setBody(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBodyVarargs(value: TypeDeclaration*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeaders(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: TypeDeclaration*): Self = StObject.set(x, "headers", js.Array(value*))
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
  
  trait Trait10
    extends StObject
       with MethodBase10 {
    
    /**
      * Name of the trait
      */
    var name: String
    
    /**
      * Instructions on how and when the trait should be used.
      */
    var usage: js.UndefOr[String] = js.undefined
  }
  object Trait10 {
    
    inline def apply(name: String): Trait10 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Trait10]
    }
    
    extension [Self <: Trait10](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.raml1Parser.spec10CommonMod.HasSource because Already inherited
  - typings.raml1Parser.spec10CommonMod.Annotable because Already inherited
  - typings.raml1Parser.spec10CommonMod.FragmentDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations, sourceMap. Inlined uses */ trait TraitFragment
    extends StObject
       with Trait10 {
    
    var uses: js.UndefOr[js.Array[UsesDeclaration]] = js.undefined
  }
  object TraitFragment {
    
    inline def apply(name: String): TraitFragment = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraitFragment]
    }
    
    extension [Self <: TraitFragment](x: Self) {
      
      inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
}
