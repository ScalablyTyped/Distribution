package typings.raml1Parser

import typings.raml1Parser.distTypingsNewFormatRamlMod.RAMLParseResult
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8CommonMod.HasSource
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8MethodsMod.Trait
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8ParametersMod.Parameter08
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8ResourcesMod.Resource08
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8ResourcesMod.ResourceType08
import typings.raml1Parser.distTypingsNewFormatSpec0Dot8SecurityMod.AbstractSecurityScheme08
import typings.raml1Parser.raml1ParserStrings.RAML08
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsNewFormatSpec0Dot8ApiMod {
  
  trait Api08
    extends StObject
       with HasSource {
    
    /**
      * (Optional during development; Required after implementation) A RESTful API's resources are defined relative to the API's base URI. The use of the baseUri field is OPTIONAL to allow describing APIs that have not yet been implemented. After the API is implemented (even a mock implementation) and can be accessed at a service endpoint, the API definition MUST contain a baseUri property. The baseUri property's value MUST conform to the URI specification RFC2396 or a Level 1 Template URI as defined in RFC6570. The baseUri property SHOULD only be used as a reference value.
      */
    var baseUri: js.UndefOr[String] = js.undefined
    
    /**
      * Base uri parameters are named parameters which described template parameters in the base uri
      */
    var baseUriParameters: js.UndefOr[js.Array[Parameter08]] = js.undefined
    
    /**
      * The API definition can include a variety of documents that serve as a user guides and reference documentation for the API. Such documents can clarify how the API works or provide business context. Documentation-generators MUST include all the sections in an API definition's documentation property in the documentation output, and they MUST preserve the order in which the documentation is declared. To add user documentation to the API, include the documentation property at the root of the API definition. The documentation property MUST be an array of documents. Each document MUST contain title and content attributes, both of which are REQUIRED. If the documentation property is specified, it MUST include at least one document. Documentation-generators MUST process the content field as if it was defined using Markdown.
      */
    var documentation: js.UndefOr[js.Array[DocumentationItem08]] = js.undefined
    
    /**
      * (Optional) The media types returned by API responses, and expected from API requests that accept a body, MAY be defaulted by specifying the mediaType property. This property is specified at the root level of the API definition. The property's value MAY be a single string with a valid media type described in the specification.
      */
    var mediaType: js.UndefOr[String] = js.undefined
    
    /**
      * A RESTful API can be reached HTTP, HTTPS, or both. The protocols property MAY be used to specify the protocols that an API supports. If the protocols property is not specified, the protocol specified at the baseUri property is used. The protocols property MUST be an array of strings, of values `HTTP` and/or `HTTPS`.
      */
    var protocols: js.Array[String]
    
    /**
      * Declaration of resource types used in this API
      */
    var resourceTypes: js.UndefOr[js.Array[ResourceType08]] = js.undefined
    
    /**
      * Resources are identified by their relative URI, which MUST begin with a slash (/). A resource defined as a root-level property is called a top-level resource. Its property's key is the resource's URI relative to the baseUri. A resource defined as a child property of another resource is called a nested resource, and its property's key is its URI relative to its parent resource's URI. Every property whose key begins with a slash (/), and is either at the root of the API definition or is the child property of a resource property, is a resource property. The key of a resource, i.e. its relative URI, MAY consist of multiple URI path fragments separated by slashes; e.g. `/bom/items` may indicate the collection of items in a bill of materials as a single resource. However, if the individual URI path fragments are themselves resources, the API definition SHOULD use nested resources to describe this structure; e.g. if `/bom` is itself a resource then `/items` should be a nested resource of `/bom`, while `/bom/items` should not be used.
      */
    var resources: js.UndefOr[js.Array[Resource08]] = js.undefined
    
    /**
      * To better achieve consistency and simplicity, the API definition SHOULD include an OPTIONAL schemas property in the root section. The schemas property specifies collections of schemas that could be used anywhere in the API definition. The value of the schemas property is an array of maps; in each map, the keys are the schema name, and the values are schema definitions. The schema definitions MAY be included inline or by using the RAML !include user-defined data type.
      */
    var schemas: js.UndefOr[js.Array[GlobalSchema]] = js.undefined
    
    /**
      * A list of the security schemes to apply to all methods, these must be defined in the securitySchemes declaration.
      */
    var securedBy: js.UndefOr[js.Array[AbstractSecurityScheme08]] = js.undefined
    
    /**
      * Declarations of security schemes for use within this API.
      */
    var securitySchemes: js.UndefOr[js.Array[AbstractSecurityScheme08]] = js.undefined
    
    /**
      * The title property is a short plain text description of the RESTful API. The value SHOULD be suitable for use as a title for the contained user documentation.
      */
    var title: String
    
    /**
      * Declarations of traits used in this API
      */
    var traits: js.UndefOr[js.Array[Trait]] = js.undefined
    
    /**
      * If the RAML API definition is targeted to a specific API version, the API definition MUST contain a version property. The version property is OPTIONAL and should not be used if: The API itself is not versioned. The API definition does not change between versions. The API architect can decide whether a change to user documentation elements, but no change to the API's resources, constitutes a version change. The API architect MAY use any versioning scheme so long as version numbers retain the same format. For example, 'v3', 'v3.0', and 'V3' are all allowed, but are not considered to be equal.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object Api08 {
    
    inline def apply(protocols: js.Array[String], title: String): Api08 = {
      val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api08]
    }
    
    extension [Self <: Api08](x: Self) {
      
      inline def setBaseUri(value: String): Self = StObject.set(x, "baseUri", value.asInstanceOf[js.Any])
      
      inline def setBaseUriParameters(value: js.Array[Parameter08]): Self = StObject.set(x, "baseUriParameters", value.asInstanceOf[js.Any])
      
      inline def setBaseUriParametersUndefined: Self = StObject.set(x, "baseUriParameters", js.undefined)
      
      inline def setBaseUriParametersVarargs(value: Parameter08*): Self = StObject.set(x, "baseUriParameters", js.Array(value*))
      
      inline def setBaseUriUndefined: Self = StObject.set(x, "baseUri", js.undefined)
      
      inline def setDocumentation(value: js.Array[DocumentationItem08]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setDocumentationVarargs(value: DocumentationItem08*): Self = StObject.set(x, "documentation", js.Array(value*))
      
      inline def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setResourceTypes(value: js.Array[ResourceType08]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
      
      inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
      
      inline def setResourceTypesVarargs(value: ResourceType08*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
      
      inline def setResources(value: js.Array[Resource08]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Resource08*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setSchemas(value: js.Array[GlobalSchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: GlobalSchema*): Self = StObject.set(x, "schemas", js.Array(value*))
      
      inline def setSecuredBy(value: js.Array[AbstractSecurityScheme08]): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
      
      inline def setSecuredByUndefined: Self = StObject.set(x, "securedBy", js.undefined)
      
      inline def setSecuredByVarargs(value: AbstractSecurityScheme08*): Self = StObject.set(x, "securedBy", js.Array(value*))
      
      inline def setSecuritySchemes(value: js.Array[AbstractSecurityScheme08]): Self = StObject.set(x, "securitySchemes", value.asInstanceOf[js.Any])
      
      inline def setSecuritySchemesUndefined: Self = StObject.set(x, "securitySchemes", js.undefined)
      
      inline def setSecuritySchemesVarargs(value: AbstractSecurityScheme08*): Self = StObject.set(x, "securitySchemes", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTraits(value: js.Array[Trait]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
      
      inline def setTraitsVarargs(value: Trait*): Self = StObject.set(x, "traits", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait DocumentationItem08
    extends StObject
       with HasSource {
    
    /**
      * Content of documentation section
      */
    var content: String
    
    /**
      * title of documentation section
      */
    var title: String
  }
  object DocumentationItem08 {
    
    inline def apply(content: String, title: String): DocumentationItem08 = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentationItem08]
    }
    
    extension [Self <: DocumentationItem08](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    /**
      * IssueCode
      */
    var code: String
    
    /**
      * Whether the message is warning or not
      */
    var isWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Message text
      */
    var message: String
    
    /**
      * File path
      */
    var path: String
    
    var range: ErrorRange
    
    var trace: js.UndefOr[js.Array[Error]] = js.undefined
  }
  object Error {
    
    inline def apply(code: String, message: String, path: String, range: ErrorRange): Error = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setIsWarning(value: Boolean): Self = StObject.set(x, "isWarning", value.asInstanceOf[js.Any])
      
      inline def setIsWarningUndefined: Self = StObject.set(x, "isWarning", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRange(value: ErrorRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: js.Array[Error]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
      
      inline def setTraceVarargs(value: Error*): Self = StObject.set(x, "trace", js.Array(value*))
    }
  }
  
  trait ErrorPosition extends StObject {
    
    /**
      * Column number, starting at 0
      */
    var column: Double
    
    /**
      * Line number, starting at 0
      */
    var line: Double
    
    /**
      * Position in characters from the beginning of the document, starting at 0
      */
    var position: Double
  }
  object ErrorPosition {
    
    inline def apply(column: Double, line: Double, position: Double): ErrorPosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorPosition]
    }
    
    extension [Self <: ErrorPosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorRange extends StObject {
    
    var end: ErrorPosition
    
    var start: ErrorPosition
  }
  object ErrorRange {
    
    inline def apply(end: ErrorPosition, start: ErrorPosition): ErrorRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorRange]
    }
    
    extension [Self <: ErrorRange](x: Self) {
      
      inline def setEnd(value: ErrorPosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: ErrorPosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalSchema
    extends StObject
       with HasSource {
    
    var name: String
    
    var value: String
  }
  object GlobalSchema {
    
    inline def apply(name: String, value: String): GlobalSchema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalSchema]
    }
    
    extension [Self <: GlobalSchema](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RAML08ParseResult
    extends StObject
       with RAMLParseResult {
    
    var errors: js.UndefOr[js.Array[Error]] = js.undefined
    
    var ramlVersion: RAML08
    
    var specification: Api08
    
    var `type`: String
  }
  object RAML08ParseResult {
    
    inline def apply(specification: Api08, `type`: String): RAML08ParseResult = {
      val __obj = js.Dynamic.literal(ramlVersion = "RAML08", specification = specification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RAML08ParseResult]
    }
    
    extension [Self <: RAML08ParseResult](x: Self) {
      
      inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setRamlVersion(value: RAML08): Self = StObject.set(x, "ramlVersion", value.asInstanceOf[js.Any])
      
      inline def setSpecification(value: Api08): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
