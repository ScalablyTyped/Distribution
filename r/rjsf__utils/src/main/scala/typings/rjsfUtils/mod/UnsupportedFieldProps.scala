package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to the `UnsupportedFieldTemplate` implementation */
trait UnsupportedFieldProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The tree of unique ids for every child field */
  var idSchema: js.UndefOr[IdSchema[T]] = js.undefined
  
  /** The reason why the schema field has an unsupported type */
  var reason: String
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The schema object for this field */
  var schema: S
}
object UnsupportedFieldProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](reason: String, registry: Registry[T, S, F], schema: S): UnsupportedFieldProps[T, S, F] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedFieldProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsupportedFieldProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (UnsupportedFieldProps[T, S, F])) extends AnyVal {
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setIdSchemaUndefined: Self = StObject.set(x, "idSchema", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
