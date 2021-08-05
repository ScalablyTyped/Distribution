package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logging extends StObject {
  
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  
  var schema: js.UndefOr[String] = js.undefined
  
  var schemaDelimeter: js.UndefOr[String] = js.undefined
}
object Logging {
  
  inline def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  extension [Self <: Logging](x: Self) {
    
    inline def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaDelimeter(value: String): Self = StObject.set(x, "schemaDelimeter", value.asInstanceOf[js.Any])
    
    inline def setSchemaDelimeterUndefined: Self = StObject.set(x, "schemaDelimeter", js.undefined)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
