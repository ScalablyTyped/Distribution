package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logging extends StObject {
  
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  
  var schema: js.UndefOr[String] = js.native
  
  var schemaDelimeter: js.UndefOr[String] = js.native
}
object Logging {
  
  @scala.inline
  def apply(): Logging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logging]
  }
  
  @scala.inline
  implicit class LoggingMutableBuilder[Self <: Logging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDelimeter(value: String): Self = StObject.set(x, "schemaDelimeter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDelimeterUndefined: Self = StObject.set(x, "schemaDelimeter", js.undefined)
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
