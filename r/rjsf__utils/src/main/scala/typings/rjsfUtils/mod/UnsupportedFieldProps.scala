package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to the `UnsupportedFieldTemplate` implementation */
trait UnsupportedFieldProps[T, F] extends StObject {
  
  /** The tree of unique ids for every child field */
  var idSchema: js.UndefOr[IdSchema[T]] = js.undefined
  
  /** The reason why the schema field has an unsupported type */
  var reason: String
  
  /** The `registry` object */
  var registry: Registry[T, F]
  
  /** The schema object for this field */
  var schema: RJSFSchema
}
object UnsupportedFieldProps {
  
  inline def apply[T, F](reason: String, registry: Registry[T, F], schema: RJSFSchema): UnsupportedFieldProps[T, F] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFieldProps[T, F]]
  }
  
  extension [Self <: UnsupportedFieldProps[?, ?], T, F](x: Self & (UnsupportedFieldProps[T, F])) {
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setIdSchemaUndefined: Self = StObject.set(x, "idSchema", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
