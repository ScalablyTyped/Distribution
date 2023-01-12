package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormParameters extends StObject {
  
  var description: Domain
  
  var example: Domain
  
  var formParameters: Domain
  
  var name: Domain
  
  var parametrizedProperties: NameString
  
  var schema: Domain
  
  var schemaContent: NameString
}
object FormParameters {
  
  inline def apply(
    description: Domain,
    example: Domain,
    formParameters: Domain,
    name: Domain,
    parametrizedProperties: NameString,
    schema: Domain,
    schemaContent: NameString
  ): FormParameters = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], formParameters = formParameters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaContent = schemaContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormParameters] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExample(value: Domain): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setFormParameters(value: Domain): Self = StObject.set(x, "formParameters", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: NameString): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Domain): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaContent(value: NameString): Self = StObject.set(x, "schemaContent", value.asInstanceOf[js.Any])
  }
}
