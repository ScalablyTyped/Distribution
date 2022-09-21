package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema extends StObject {
  
  var description: Domain
  
  var example: Domain
  
  var formParameters: Domain
  
  var name: Domain
  
  var schema: Domain
}
object Schema {
  
  inline def apply(description: Domain, example: Domain, formParameters: Domain, name: Domain, schema: Domain): Schema = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], formParameters = formParameters.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
  
  extension [Self <: Schema](x: Self) {
    
    inline def setDescription(value: Domain): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExample(value: Domain): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setFormParameters(value: Domain): Self = StObject.set(x, "formParameters", value.asInstanceOf[js.Any])
    
    inline def setName(value: Domain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Domain): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
