package typings.reactJsonschemaForm

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.Component
import typings.reactJsonschemaForm.anon.Definitions
import typings.reactJsonschemaForm.mod.ErrorSchema
import typings.reactJsonschemaForm.mod.IdSchema
import typings.reactJsonschemaForm.mod.UiSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaFieldMod {
  
  @JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SchemaFieldProps[Any], js.Object, Any]
  
  type SchemaField = Component[SchemaFieldProps[Any], js.Object, Any]
  
  /* Inlined std.Pick<react-jsonschema-form.react-jsonschema-form.FieldProps<T>, 'schema' | 'uiSchema' | 'idSchema' | 'formData' | 'errorSchema' | 'registry' | 'formContext'> */
  trait SchemaFieldProps[T] extends StObject {
    
    var errorSchema: ErrorSchema
    
    var formContext: Any
    
    var formData: T
    
    var idSchema: IdSchema[Any]
    
    var registry: Definitions
    
    var schema: JSONSchema6
    
    var uiSchema: UiSchema
  }
  object SchemaFieldProps {
    
    inline def apply[T](
      errorSchema: ErrorSchema,
      formContext: Any,
      formData: T,
      idSchema: IdSchema[Any],
      registry: Definitions,
      schema: JSONSchema6,
      uiSchema: UiSchema
    ): SchemaFieldProps[T] = {
      val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaFieldProps[T]]
    }
    
    extension [Self <: SchemaFieldProps[?], T](x: Self & SchemaFieldProps[T]) {
      
      inline def setErrorSchema(value: ErrorSchema): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
      
      inline def setFormContext(value: Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setIdSchema(value: IdSchema[Any]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: Definitions): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    }
  }
}
