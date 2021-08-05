package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Schema Options provided for applying a schema to a model
  */
trait SchemaOptions
  extends StObject
     with LoggingOptions {
  
  /**
    * The character(s) that separates the schema name from the table name
    */
  var schemaDelimeter: js.UndefOr[String] = js.undefined
}
object SchemaOptions {
  
  inline def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  
  extension [Self <: SchemaOptions](x: Self) {
    
    inline def setSchemaDelimeter(value: String): Self = StObject.set(x, "schemaDelimeter", value.asInstanceOf[js.Any])
    
    inline def setSchemaDelimeterUndefined: Self = StObject.set(x, "schemaDelimeter", js.undefined)
  }
}
