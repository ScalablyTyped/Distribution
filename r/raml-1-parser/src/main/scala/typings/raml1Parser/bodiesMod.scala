package typings.raml1Parser

import typings.raml1Parser.commonMod.HasSource
import typings.raml1Parser.parametersMod.Parameter08
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodiesMod {
  
  trait BodyLike08
    extends StObject
       with HasSource {
    
    /**
      * Human readable description of the body
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Documentation generators MUST use body properties' example attributes
      * to generate example invocations.
      */
    var example: js.UndefOr[String | Double | Boolean] = js.undefined
    
    /**
      * Web forms REQUIRE special encoding and custom declaration.
      * If the API's media type is either application/x-www-form-urlencoded
      * or multipart/form-data, the formParameters property MUST specify
      * the name-value pairs that the API is expecting. The formParameters
      * property is a map in which the key is the name of the web form
      * parameter, and the value is itself a map the specifies the web
      * form parameter's attributes.
      */
    var formParameters: js.UndefOr[js.Array[Parameter08]] = js.undefined
    
    /**
      * Mime type of the request or response body
      */
    var name: String
    
    /**
      * The structure of a request or response body MAY be further specified
      * by the schema property under the appropriate media type. The schema
      * key CANNOT be specified if a body's media type is
      * application/x-www-form-urlencoded or multipart/form-data.
      * All parsers of RAML MUST be able to interpret JSON Schema and XML Schema.
      * Schema MAY be declared inline or in an external file.
      * However, if the schema is sufficiently large so as to make it difficult
      * for a person to read the API definition, or the schema is reused
      * across multiple APIs or across multiple miles in the same API,
      * the !include user-defined data type SHOULD be used instead of including
      * the content inline. Alternatively, the value of the schema field MAY be
      * the name of a schema specified in the root-level schemas property, or
      * it MAY be declared in an external file and included by using the by using
      * the RAML !include user-defined data type.
      */
    var schema: js.UndefOr[String] = js.undefined
    
    /**
      * Returns schema content for the cases when schema is inlined,
      * when schema is included, and when
      */
    var schemaContent: js.UndefOr[String] = js.undefined
  }
  object BodyLike08 {
    
    inline def apply(name: String): BodyLike08 = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyLike08]
    }
    
    extension [Self <: BodyLike08](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExample(value: String | Double | Boolean): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
      
      inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
      
      inline def setFormParameters(value: js.Array[Parameter08]): Self = StObject.set(x, "formParameters", value.asInstanceOf[js.Any])
      
      inline def setFormParametersUndefined: Self = StObject.set(x, "formParameters", js.undefined)
      
      inline def setFormParametersVarargs(value: Parameter08*): Self = StObject.set(x, "formParameters", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaContent(value: String): Self = StObject.set(x, "schemaContent", value.asInstanceOf[js.Any])
      
      inline def setSchemaContentUndefined: Self = StObject.set(x, "schemaContent", js.undefined)
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  trait Response08
    extends StObject
       with HasSource {
    
    /**
      * Each response MAY contain a body property, which conforms to
      * the same structure as request body properties (see Body).
      * Responses that can return more than one response code MAY
      * therefore have multiple bodies defined. For APIs without
      * a priori knowledge of the response types for their responses,
      * `* / *` MAY be used to indicate that responses that do not
      * matching other defined data types MUST be accepted.
      * Processing applications MUST match the most descriptive
      * media type first if `* / *` is used.
      */
    var body: js.UndefOr[js.Array[BodyLike08]] = js.undefined
    
    /**
      * Responses MUST be a map of one or more HTTP status codes,
      * where each status code itself is a map that describes that status code.
      */
    var code: String
    
    /**
      * The description attribute describes the intended use or meaning
      * of the $self. This value MAY be formatted using Markdown.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * An API's methods may support custom header values in responses.
      * The custom, non-standard HTTP headers MUST be specified by the
      * headers property. API's may include the the placeholder token {?}
      * in a header name to indicate that any number of headers that
      * conform to the specified format can be sent in responses.
      * This is particularly useful for APIs that allow HTTP headers that
      * conform to some naming convention to send arbitrary, custom data.
      */
    var headers: js.UndefOr[js.Array[Parameter08]] = js.undefined
  }
  object Response08 {
    
    inline def apply(code: String): Response08 = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response08]
    }
    
    extension [Self <: Response08](x: Self) {
      
      inline def setBody(value: js.Array[BodyLike08]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBodyVarargs(value: BodyLike08*): Self = StObject.set(x, "body", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setHeaders(value: js.Array[Parameter08]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: Parameter08*): Self = StObject.set(x, "headers", js.Array(value*))
    }
  }
}
