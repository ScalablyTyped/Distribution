package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The object containing the registered core, theme and custom fields and widgets as well as the root schema, form
  * context, schema utils and templates.
  */
trait Registry[T, F] extends StObject {
  
  /** The set of all fields used by the `Form`. Includes fields from `core`, theme-specific fields and any custom
    * registered fields
    */
  var fields: RegistryFieldsType[T, F]
  
  /** The `formContext` object that was passed to `Form` */
  var formContext: F
  
  /** The root schema, as passed to the `Form`, which can contain referenced definitions */
  var rootSchema: RJSFSchema
  
  /** The current implementation of the `SchemaUtilsType` (from `@rjsf/utils`) in use by the `Form`.  Used to call any
    * of the validation-schema-based utility functions
    */
  var schemaUtils: SchemaUtilsType[T]
  
  /** The set of templates used by the `Form`. Includes templates from `core`, theme-specific fields and any custom
    * registered templates
    */
  var templates: TemplatesType[T, F]
  
  /** The set of all widgets used by the `Form`. Includes widgets from `core`, theme-specific widgets and any custom
    * registered widgets
    */
  var widgets: RegistryWidgetsType[T, F]
}
object Registry {
  
  inline def apply[T, F](
    fields: RegistryFieldsType[T, F],
    formContext: F,
    rootSchema: RJSFSchema,
    schemaUtils: SchemaUtilsType[T],
    templates: TemplatesType[T, F],
    widgets: RegistryWidgetsType[T, F]
  ): Registry[T, F] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], rootSchema = rootSchema.asInstanceOf[js.Any], schemaUtils = schemaUtils.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registry[T, F]]
  }
  
  extension [Self <: Registry[?, ?], T, F](x: Self & (Registry[T, F])) {
    
    inline def setFields(value: RegistryFieldsType[T, F]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFormContext(value: F): Self = StObject.set(x, "formContext", value.asInstanceOf[js.Any])
    
    inline def setRootSchema(value: RJSFSchema): Self = StObject.set(x, "rootSchema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUtils(value: SchemaUtilsType[T]): Self = StObject.set(x, "schemaUtils", value.asInstanceOf[js.Any])
    
    inline def setTemplates(value: TemplatesType[T, F]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: RegistryWidgetsType[T, F]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
  }
}
