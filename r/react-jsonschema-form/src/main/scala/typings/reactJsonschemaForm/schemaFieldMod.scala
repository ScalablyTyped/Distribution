package typings.reactJsonschemaForm

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.Component
import typings.reactJsonschemaForm.anon.Definitions
import typings.reactJsonschemaForm.mod.ErrorSchema
import typings.reactJsonschemaForm.mod.IdSchema
import typings.reactJsonschemaForm.mod.UiSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaFieldMod {
  
  @JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Default)
  @js.native
  class default ()
    extends Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  
  type SchemaField = Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  
  /* Inlined std.Pick<react-jsonschema-form.react-jsonschema-form.FieldProps<T>, 'schema' | 'uiSchema' | 'idSchema' | 'formData' | 'errorSchema' | 'registry' | 'formContext'> */
  @js.native
  trait SchemaFieldProps[T] extends StObject {
    
    var errorSchema: ErrorSchema = js.native
    
    var formContext: js.Any = js.native
    
    var formData: T = js.native
    
    var idSchema: IdSchema[_] = js.native
    
    var registry: Definitions = js.native
    
    var schema: JSONSchema6 = js.native
    
    var uiSchema: UiSchema = js.native
  }
  object SchemaFieldProps {
    
    @scala.inline
    def apply[T](
      errorSchema: ErrorSchema,
      formContext: js.Any,
      formData: T,
      idSchema: IdSchema[_],
      registry: Definitions,
      schema: JSONSchema6,
      uiSchema: UiSchema
    ): SchemaFieldProps[T] = {
      val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaFieldProps[T]]
    }
    
    @scala.inline
    implicit class SchemaFieldPropsMutableBuilder[Self <: SchemaFieldProps[_], T] (val x: Self with SchemaFieldProps[T]) extends AnyVal {
      
      @scala.inline
      def setErrorSchema(value: ErrorSchema): Self = StObject.set(x, "errorSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormContext(value: js.Any): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormData(value: T): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdSchema(value: IdSchema[_]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistry(value: Definitions): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchema(value: JSONSchema6): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUiSchema(value: UiSchema): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    }
  }
}
