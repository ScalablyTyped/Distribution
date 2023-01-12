package typings.raml1Parser

import org.scalablytyped.runtime.StringDictionary
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.Annotable
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.AnnotationInstance
import typings.raml1Parser.distTypingsSpec1Dot0CommonMod.UsesDeclaration
import typings.raml1Parser.distTypingsSpec1Dot0DatamodelMod.ObjectTypeDeclaration
import typings.raml1Parser.distTypingsSpec1Dot0DatamodelMod.TypeReference10
import typings.raml1Parser.distTypingsSpec1Dot0SecurityMod.SecuritySchemeRef10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSpec1Dot0MethodsMod {
  
  trait Method10
    extends StObject
       with MethodBase10 {
    
    /**
      * Method that can be called
      */
    var method: String
  }
  object Method10 {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      method: String,
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): Method10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Method10] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
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
    var body: js.UndefOr[StringDictionary[TypeReference10]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      * Instantiation of applyed traits
      */
    var is: js.UndefOr[js.Array[TraitRef10]] = js.undefined
    
    /**
      * A method can override the protocols specified in the resource
      * or at the API root, by employing this property.
      */
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Information about the expected responses to a request
      */
    var responses: js.UndefOr[StringDictionary[Response10]] = js.undefined
    
    /**
      * securityScheme may also be applied to a resource by using the
      * securedBy key, which is equivalent to applying the securityScheme
      * to all methods that may be declared, explicitly or implicitly,
      * by defining the resourceTypes or traits property for that resource.
      * To indicate that the method may be called without applying any securityScheme,
      * the method may be annotated with the null securityScheme.
      */
    var securedBy: js.UndefOr[js.Array[SecuritySchemeRef10]] = js.undefined
  }
  object MethodBase10 {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): MethodBase10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodBase10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MethodBase10] (val x: Self) extends AnyVal {
      
      inline def setBody(value: StringDictionary[TypeReference10]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIs(value: js.Array[TraitRef10]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setIsVarargs(value: TraitRef10*): Self = StObject.set(x, "is", js.Array(value*))
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setResponses(value: StringDictionary[Response10]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
      
      inline def setSecuredBy(value: js.Array[SecuritySchemeRef10]): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setSecuredByVarargs(value: SecuritySchemeRef10*): Self = StObject.set(x, "securedBy", js.Array(value*))
    }
  }
  
  trait Operation10
    extends StObject
       with Annotable {
    
    /**
      * Headers that allowed at this position
      */
    var headers: js.UndefOr[StringDictionary[TypeReference10]] = js.undefined
    
    /**
      * An APIs resources MAY be filtered (to return a subset of results)
      * or altered (such as transforming  a response body from JSON to XML format)
      * by the use of query strings. If the resource or its method supports
      * a query string, the query string MUST be defined by the queryParameters property
      */
    var queryParameters: js.UndefOr[StringDictionary[TypeReference10]] = js.undefined
    
    var queryString: js.UndefOr[ObjectTypeDeclaration] = js.undefined
  }
  object Operation10 {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): Operation10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operation10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Operation10] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: StringDictionary[TypeReference10]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setQueryParameters(value: StringDictionary[TypeReference10]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setQueryString(value: ObjectTypeDeclaration): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    }
  }
  
  trait Response10
    extends StObject
       with Annotable {
    
    /**
      * The body of the response: a body declaration
      */
    var body: js.UndefOr[StringDictionary[TypeReference10]] = js.undefined
    
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
    var headers: js.UndefOr[js.Array[TypeReference10]] = js.undefined
  }
  object Response10 {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      code: String,
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): Response10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response10] (val x: Self) extends AnyVal {
      
      inline def setBody(value: StringDictionary[TypeReference10]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeaders(value: js.Array[TypeReference10]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: TypeReference10*): Self = StObject.set(x, "headers", js.Array(value*))
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
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      name: String,
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): Trait10 = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Trait10]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Trait10] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUsage(value: String): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.raml1Parser.distTypingsSpec1Dot0CommonMod.Annotable because Already inherited
  - typings.raml1Parser.distTypingsSpec1Dot0CommonMod.FragmentDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations. Inlined uses */ trait TraitFragment
    extends StObject
       with Trait10 {
    
    var uses: js.UndefOr[js.Array[UsesDeclaration]] = js.undefined
  }
  object TraitFragment {
    
    inline def apply(
      __METADATA__ : Any,
      annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
      name: String,
      scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]]
    ): TraitFragment = {
      val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraitFragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TraitFragment] (val x: Self) extends AnyVal {
      
      inline def setUses(value: js.Array[UsesDeclaration]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesUndefined: Self = StObject.set(x, "uses", js.undefined)
      
      inline def setUsesVarargs(value: UsesDeclaration*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
  
  type TraitRef10 = String | StringDictionary[Any]
}
